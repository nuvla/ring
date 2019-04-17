# Nuvla Ring Container

[![Build Status](https://travis-ci.com/nuvla/ring.svg?branch=master)](https://travis-ci.com/nuvla/ring)

This repository contains the code and configuration to create a
simple, ring-based Docker container for web applications.  Build from
the generated image and just add your ring handler.  See the README
files in the subdirectories for more information.

## Artifacts

 - `nuvla/ring:<version>` - A Docker container for simple, ring-based
   web applications. Available from Docker Hub.

## Release Process

**Before** creating the release:

 - Decide what semantic version to use for this release and change the
   version, if necessary, in `code/project.clj` and all the `pom.xml`
   files.  (It should still have the "-SNAPSHOT" suffix.)

 - Update the `CHANGELOG.md` file.

 - Push all changes to GitHub, including the updates to
   `CHANGELOG.md`.

Again, be sure to set the version **before** tagging the release.

Check that everything builds correctly with:

    mvn clean install

To tag the code with the release version and to update the master
branch to the next snapshot version, run the command:

    ./release.sh true

If you want to test what will happen with the release, leave off the
"true" argument and the changes will only be made locally.

When the tag is pushed to GitHub, Travis CI will build the repository,
create the container, and push it to Docker Hub.  Check the Travis
build and ensure that the new container version appears in the Docker
Hub. 

## Contributing

### Source Code Changes

To contribute code to this repository, please follow these steps:

 1. Create a branch from master with a descriptive, kebab-cased name
    to hold all your changes.

 2. Follow the developer guidelines concerning formatting, etc. when
    modifying the code.
   
 3. Once the changes are ready to be reviewed, create a GitHub pull
    request.  With the pull request, provide a description of the
    changes and links to any relevant issues (in this repository or
    others). 
   
 4. Ensure that the triggered CI checks all pass.  These are triggered
    automatically with the results shown directly in the pull request.

 5. Once the checks pass, assign the pull request to the repository
    coordinator (who may then assign it to someone else).

 6. Interact with the reviewer to address any comments.

When the reviewer is happy with the pull request, he/she will "squash
& merge" the pull request and delete the corresponding branch.

### Testing

Add appropriate tests that verify the changes or additions you make to
the source code.

### Code Formatting

The bulk of the code in this repository is written in Clojure.

The formatting follows the standard formatting provided by the Cursive
IntelliJ plugin with all the default settings **except that map
entries should be aligned**.

Additional, formatting guidelines, not handled by the Cursive plugin:

 - Use a new line after the `:require` and `:import` keys in namespace
   declarations.

 - Alphabetize the required namespaces.  This can be automated with
   `lein nsorg --replace`.

 - Use 2 blank lines between top-level forms.

 - Use a single blank line between a block comment and the following
   code.

IntelliJ (with Cursive) can format easily whole directories of source
code.  Do not hesitate to use this feature to keep the source code
formatting standardized.

## Copyright

Copyright &copy; 2019, SixSq Sàrl

## License

Licensed under the Apache License, Version 2.0 (the "License"); you
may not use this file except in compliance with the License.  You may
obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
implied.  See the License for the specific language governing
permissions and limitations under the License.
