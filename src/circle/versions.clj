(ns circle.versions
  (:require [clojure.java.io :as io])
  (:import
   org.eclipse.jgit.storage.file.FileRepositoryBuilder
   [org.eclipse.jgit.lib ObjectId Repository]))

(defn repo
  ([{:keys [root]
     :or {root "."}}]
     (.. (FileRepositoryBuilder.)
         (readEnvironment)
         (findGitDir (io/file root))
         (build)))
  ([]
     (repo {})))

(defn git-branch [repo]
  (.getBranch repo))

(defn short-sha
  "Returns the 7-char SHA1 for the current commit"
  []
  (let [head (.resolve (repo) "HEAD")]
    (-> head
        (.abbreviate 7)
        (.name))))

(defn branch
  "Returns the current branch. Uses the CIRCLECI_BRANCH env var, if present, else consults git"
  []
  (if-let [circle-branch (System/getenv "CIRCLECI_BRANCH")]
    circle-branch
    (git-branch (repo {:root "."}))))

(defn branch?
  "returns the branch-name, if it isn't `branchname`. Defaults to `master` if not specified"
  ([branchname]
     (let [b (branch)]
       (when (not= "master" b)
         b)))
  ([]
     (branch? "master")))
