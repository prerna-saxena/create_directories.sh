Explanation:
Define Base Directory: Set BASE_DIR to "projects".
Create Base Directory: Use mkdir -p to create the projects directory if it doesn't already exist.
Define Directory Structure: Use an associative array DIRS to map each directory to its subdirectory, if any.
Loop and Create: Loop through each key-value pair in the array, create the main directory, and if there's a value, create the subdirectory as well.
Completion Message: Print a message indicating that the directories were created successfully.
How to Run the Script:
Save the Script: Save the script as create_directories.sh.
Make it Executable: Run chmod +x create_directories.sh to make the script executable.
Run the Script: Execute the script with ./create_directories.sh.
This script will set up your directory structure as specified, creating the required folders and the oriserve subdirectory where necessary.
