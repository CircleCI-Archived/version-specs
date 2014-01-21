version-specs
=============

CircleCI plugin code for use with lein-version-spec (https://github.com/circleci/lein-version-specs)

## Usage

`[circleci/version-specs "0.1.1"]`

## Provides

```clojure
circle.versions/short-sha
"Returns the 7-char SHA1 for the current commit"

circle.versions/branch
"Returns the current branch. Uses the CIRCLECI_BRANCH env var, if present, else consults git"

circle.versions/branch?
"returns the branch-name, if it isn't `branchname`. Defaults to `master` if not specified"
```
