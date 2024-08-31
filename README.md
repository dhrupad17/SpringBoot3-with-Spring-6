# Docker Commands Used in this repository


### 1. `docker --version`
- **Description:** Displays the installed version of Docker.

### 2. `docker ps`
- **Description:** Lists all running containers.

### 3. `docker ps -a`
- **Description:** Lists all containers, including running, stopped, and exited ones.

### 4. `docker images`
- **Description:** Lists all Docker images that are currently available on your local system.

### 5. `docker help`
- **Description:** Provides a list of commands or help on a specific command if specified.

### 6. `docker rm <containerId>`
- **Description:** Removes the specified container using its ID. The container must be stopped before it can be removed.

### 7. `docker create hello-world`
- **Description:** Creates a container from the `hello-world` image but does not start it.

### 8. `docker search hello-world`
- **Description:** Searches the Docker Hub for images with the name `hello-world`.

### 9. `docker pull hello-world`
- **Description:** Pulls the `hello-world` image from Docker Hub to your local machine.

### 10. `docker search openjdk`
- **Description:** Searches the Docker Hub for images with the name `openjdk`.

### 11. `docker pull openjdk:22-jdk`
- **Description:** Pulls the specific `22-jdk` tag of the `openjdk` image from Docker Hub.

### 12. `docker run -it openjdk:22-jdk`
- **Description:** Runs a container from the `openjdk:22-jdk` image interactively with a terminal session attached.

### 13. `docker build <repository-name>/<Project-Name>`
- **Description:** Builds a Docker image from a specified repository and project name. This command must be run in the directory where the Dockerfile is located.

### 14. `docker-compose up --build`
- **Description:** Builds, creates, starts, and attaches to containers for a service defined in a `docker-compose.yml` file, rebuilding the images if necessary.

### 15. `docker-compose down`
- **Description:** Stops and removes all containers, networks, and images created by `docker-compose up`.

---

# Git Commands Used in this repository

### 1. `git init`
- **Description:** Initializes a new Git repository in the current directory. This creates a `.git` directory to track versions and changes.

### 2. `git add .`
- **Description:** Stages all the changes (new files, modifications, deletions) in the current directory and its subdirectories for the next commit.

### 3. `git commit -m "Commit Message"`
- **Description:** Commits the staged changes with a descriptive message. The message should summarize the changes made in that commit.

### 4. `git status`
- **Description:** Displays the current status of the working directory and staging area. It shows which files are modified, staged, or untracked.

### 5. `git pull origin main`
- **Description:** Fetches the latest changes from the remote repository’s `main` branch and merges them into the current branch.

### 6. `git push origin main`
- **Description:** Pushes the committed changes from your local `main` branch to the remote repository’s `main` branch.

### 7. `git branch -m master main`
- **Description:** Renames the current branch from `master` to `main`. This is commonly used when switching the default branch name.

### 8. `git pull origin <branch-name> --rebase`
- **Description:** Fetches the latest changes from the specified remote branch and applies them on top of your current branch’s commits. This avoids creating unnecessary merge commits.

### 9. `git rebase --continue`
- **Description:** Continues the rebase process after resolving any conflicts. This command is used when a rebase is interrupted by conflicts and those conflicts have been resolved.

