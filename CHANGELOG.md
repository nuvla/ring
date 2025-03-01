# Changelog

## Unreleased

## Released

## [2.3.0](https://github.com/nuvla/ring/compare/2.2.0...2.3.0) (2025-02-19)


### Features

* **Logging:** Use telemere lib for logging and observability ([#36](https://github.com/nuvla/ring/issues/36)) ([8f534fa](https://github.com/nuvla/ring/commit/8f534fa9cf0047e8798df911f0f16f89c5ed4807))

## [2.2.0](https://github.com/nuvla/ring/compare/2.1.10...2.2.0) (2025-01-31)


### Features

* **Dependencies:** Upgrade of dependencies ([e4728dd](https://github.com/nuvla/ring/commit/e4728dd6e3c386ebfb8245e08ce4a4c265de17ef))


### Bug Fixes

* **ci:** Clojure setup step needed ([e4728dd](https://github.com/nuvla/ring/commit/e4728dd6e3c386ebfb8245e08ce4a4c265de17ef))
* **README.md:** Update Build badge and add docker image badge ([6379663](https://github.com/nuvla/ring/commit/6379663daa9e593d606041533016d64ec4cfba3c))


### Continuous Integration

* **ci:** Remove unused version script ([0c15899](https://github.com/nuvla/ring/commit/0c15899eefe0b3ca0e101bc314f9b1eb6b16cbad))
* **project.clj:** Fix repo url ([2c3e675](https://github.com/nuvla/ring/commit/2c3e6750580be8d265515d7b2d07d94a2a8057d8))

## [2.1.10](https://github.com/nuvla/ring/compare/2.1.9...2.1.10) (2024-07-26)


### Continuous Integration

* **github-action:** Push clojars endsWith expression ([745f69a](https://github.com/nuvla/ring/commit/745f69a38da5fafce341d1864d4348694d0ab9c1))

## [2.1.9](https://github.com/nuvla/ring/compare/2.1.8...2.1.9) (2024-07-26)


### Continuous Integration

* **github-action:** Push clojars fix ([9ae6910](https://github.com/nuvla/ring/commit/9ae69109436b7ca9b57b3cfcfc547e41a76381eb))

## [2.1.8](https://github.com/nuvla/ring/compare/2.1.7...2.1.8) (2024-07-26)


### Continuous Integration

* **github-action:** Do not push to clojars from dev workflow when not snapshot ([652772e](https://github.com/nuvla/ring/commit/652772ea4950ffc2565366520b0ebdba33c60055))

## [2.1.7](https://github.com/nuvla/ring/compare/2.1.6...2.1.7) (2024-07-26)


### Continuous Integration

* **github-action:** Review workspace dispatch logic ([de1d839](https://github.com/nuvla/ring/commit/de1d83969ab455a7bbf18ad2d120d13e47ad86ab))

## [2.1.6](https://github.com/nuvla/ring/compare/2.1.5...2.1.6) (2024-07-26)


### Continuous Integration

* **github-action:** Reusable workflow ([91b8ef0](https://github.com/nuvla/ring/commit/91b8ef081fe11f5d75fdfcc6b1347b4c1dd053eb))

## [2.1.5](https://github.com/nuvla/ring/compare/2.1.4...2.1.5) (2024-07-26)


### Continuous Integration

* **github:** fix env for clojars secrets ([6e1da07](https://github.com/nuvla/ring/commit/6e1da074edf11981d4186759de2ef2b7a35c2efc))

## [2.1.4](https://github.com/nuvla/ring/compare/2.1.3...2.1.4) (2024-07-26)


### Continuous Integration

* **github:** Import missing GPG key ([3960576](https://github.com/nuvla/ring/commit/3960576442875eb22dc7cae00f6121e3ea534425))
* **release-please:** Remove bootstrap-sha ([058e581](https://github.com/nuvla/ring/commit/058e581e4d2d68203602e3dffd90cee0489dc780))

## [2.1.3](https://github.com/nuvla/ring/compare/v2.1.3-SNAPSHOT...2.1.3) (2024-07-26)


### Continuous Integration

* **github:** Github orchestrate build of ui docker image ([ec655c1](https://github.com/nuvla/ring/commit/ec655c19a91fad7928424b4ad0ba7ce2284cd249))
* **maven:** Retire maven ([#14](https://github.com/nuvla/ring/issues/14)) ([ec655c1](https://github.com/nuvla/ring/commit/ec655c19a91fad7928424b4ad0ba7ce2284cd249))
* **release-please:** Release please control version based on commit messages ([ec655c1](https://github.com/nuvla/ring/commit/ec655c19a91fad7928424b4ad0ba7ce2284cd249))

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
