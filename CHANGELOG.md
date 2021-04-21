# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [2.0.0] - 2021-04-21
### Changed
- Instead of the serialization library writing all default values in the sarif,
it now relies on the consumer of the sarif to respect the behavior in the sarif
specification to assume the default value for an absent property.
