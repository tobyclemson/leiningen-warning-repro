(defproject com.example/root "0.1.0-SNAPSHOT"
  :plugins [[lein-parent "0.3.8"]
            [lein-cprint "1.3.3"]]

  :parent-project {:path    "parent/project.clj"
                   :inherit [[:profiles :parent-dev]]}

  :profiles {:dev [:parent-dev]})
