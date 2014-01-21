(defproject circleci/version-specs "0.1.1"
  :description "plugin fns for lein-version-specs"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.eclipse.jgit/org.eclipse.jgit "2.0.0.201206130900-r"]]
  :plugins [[lein-version-spec "0.0.3"]]
  :profiles {:dev
             {:dependencies
              [[org.clojure/clojure "1.5.1"]]}})
