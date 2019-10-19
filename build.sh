#!/bin/bash

set -e

clean() {
    rm -rf "$1"
    mkdir "$1"
}

fetch() {
    wget -P lib -nv --show-progress -nc -c "$1"
    cp="$cp:lib/${1##*/}"
}

meta() {
    cat bin/plugin.yml \
    | grep "^$1:" \
    | cut -d' ' -f2
}

# Download dependencies
echo "Downloading dependencies"
mkdir -p lib
fetch "https://cdn.getbukkit.org/spigot/spigot-1.14.4.jar"
fetch "https://hub.spigotmc.org/nexus/content/repositories/public/org/spigotmc/plugin-annotations/1.2.2-SNAPSHOT/plugin-annotations-1.2.2-20181013.010422-1.jar"

# Compile plugin
echo "Compiling plugin"
clean bin
javac -cp "$cp" -source 1.8 -target 1.8 -d bin @classes

# Generate javadocs
echo "Generating Javadocs"
clean doc
javadoc -cp "$cp" -link "https://hub.spigotmc.org/javadocs/spigot/" -d doc @classes

# Package plugin
echo "Packaging plugin"
jar="$(meta name)-$(meta version).jar"
jar -cvf "$jar" -C res . -C bin .
echo "Packaged as $jar"
