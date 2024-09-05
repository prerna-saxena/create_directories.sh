#!/bin/bash

# Define the base directory
BASE_DIR="projects"

# Find all 'oriserve' directories and process each
find "$BASE_DIR" -type d -name "oriserve" | while read -r oriserve_dir; do
    # Create the test.txt file in the 'oriserve' directory
    echo "oriserve" > "$oriserve_dir/test.txt"
done

echo "Files created successfully."
