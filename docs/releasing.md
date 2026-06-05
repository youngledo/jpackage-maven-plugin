# Releasing

This project does not have automated public release publishing yet.

## Versioning

- Use semantic versioning after the first public release.
- Use `0.x` while the configuration model can still change.
- Keep snapshots on the main development branch.
- Tag releases as `v<version>`, for example `v0.1.0`.

## Pre-release Checks

Run the plugin build:

```bash
sdk env
./mvnw verify
```

Run at least one host packaging smoke test before publishing:

```bash
./mvnw install
./mvnw -f samples/classpath-swing/pom.xml package
```

Before a stable release, verify the sample projects on the target operating
systems:

| Host | Expected package types |
|---|---|
| macOS | `app-image`, `dmg`, `pkg` |
| Linux | `app-image`, `deb`, `rpm` |
| Windows | `app-image`, `msi`, `exe` |

## Publishing Targets

Maven Central should be the primary public distribution target.

GitHub Packages can be added as a secondary distribution target for snapshots or
early access builds.

## Release Notes

Update `CHANGELOG.md` before tagging a release.

Release notes should include:

- Breaking configuration changes.
- New `jpackage`, `jlink`, or Leyden options.
- Host operating systems that were verified.
- Known limitations.
