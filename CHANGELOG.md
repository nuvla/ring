# Changelog

## Unreleased

## Released

## [2.1.3](https://github.com/nuvla/ring/compare/v2.1.3-SNAPSHOT...2.1.3) (2024-07-25)


### Bug Fixes

* **ci:** 1 ([6b7b70f](https://github.com/nuvla/ring/commit/6b7b70f77ccade678414d3916e1ae50dc1c0d1ef))
* **ci:** 2 ([0f6f9c0](https://github.com/nuvla/ring/commit/0f6f9c0255b05ebaca7b05d953079dd6c184564c))

## [2.1.2] - 2024-04-10

- Dockerfile - Install curl
- Container dependency - Exclude lein plugins test report from container dependency
- Container dpendnecey - Fix prependGroupId

## [2.1.1] - 2024-04-08

- Dockerfile - Replace openjdk:11 by eclipse-temurin:21-alpine
- Project.clj - Update to parent version 6.8.0
- Project.clj Proper logging deps for slf4j and logback
- Dockerfile - Install openssl needed for server ssl certs/keys generation

## [2.1.0] - 2024-04-04

- Dockerfile - Replace openjdk:11 by eclipse-temurin:21-alpine
- Project.clj - Update to parent version 6.7.15
- CI - Remove travis files
- Gihub CI - jdk 21 and deprecated output fix

## [2.0.8] - 2022-04-06

### Changed

- Update to parent version 6.7.11

## [2.0.7] - 2022-04-01

### Changed

- Update to parent version 6.7.10

## [2.0.6] - 2022-03-29

### Changed

- Update to parent version 6.7.8

## [2.0.5] - 2022-03-29

### Changed

- Update to parent version 6.7.7

## [2.0.4] - 2019-11-13

### Changed

- Update to parent version 6.7.0.

## [2.0.3] - 2019-11-13

### Changed

- Fix java path for example application so that it works.
- For dynamic resolution of vars use clojure's new requiring-resolve function,
  which is only available in clojure 1.10 and later.
- Add curl to docker image to allow healthcheck: when application starts.

## [2.0.2] - 2019-07-30

### Changed

- Update to parent version 6.6.0

## [2.0.1] - 2019-06-28

### Changed

- Update to parent version 6.5.1 with minor dependency changes

## [2.0.0] - 2019-04-29

Initial, functionally-complete release.

### Changed

- Update parent version to 6.5.0
- Remove unused clj-time dependency

## [0.9.0] - 2019-04-17

Test release to verify the release process.

### Changed

- Update parent to version 6.3.0.
