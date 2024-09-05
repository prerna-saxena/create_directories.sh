#!/bin/bash

# Define the base directory
BASE_DIR="projects"

# Create the base directory if it doesn't exist
mkdir -p "$BASE_DIR"

# Define the directories to be created
declare -A DIRS
DIRS["facebook"]=""
DIRS["google"]="oriserve"
DIRS["meta"]="oriserve"
DIRS["oracle"]=""

# Loop through the directories and create them
for DIR in "${!DIRS[@]}"; do
    # Create the main directory
    mkdir -p "$BASE_DIR/$DIR"
    
    # Check if there is a subdirectory to create
    if [ -n "${DIRS[$DIR]}" ]; then
        mkdir -p "$BASE_DIR/$DIR/${DIRS[$DIR]}"
    fi
done

echo "Directories created successfully."
