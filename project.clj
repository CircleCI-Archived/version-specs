(defproject circleci/version-specs "0.1.0"
  :description "plugin fns for lein-version-specs"
  :version-spec "0.1.~{:env/circle_build_num}"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.eclipse.jgit/org.eclipse.jgit "2.0.0.201206130900-r"]]
  :repositories [["circle-jars" {:url "s3p://circle-jars/releases"}]]
  :plugins [[lein-version-spec "0.0.2"]]
  :profiles {:dev
             {:dependencies
              [[org.clojure/clojure "1.5.1"]]}})
