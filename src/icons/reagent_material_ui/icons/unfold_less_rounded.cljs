(ns reagent-material-ui.icons.unfold-less-rounded
  "Imports @material-ui/icons/UnfoldLessRounded as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def unfold-less-rounded (create-svg-icon (e "path" #js {"d" "M8.12 19.3c.39.39 1.02.39 1.41 0L12 16.83l2.47 2.47c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41l-3.17-3.17a.9959.9959 0 00-1.41 0l-3.17 3.17c-.4.38-.4 1.02-.01 1.41zm7.76-14.6a.9959.9959 0 00-1.41 0L12 7.17 9.53 4.7a.9959.9959 0 00-1.41 0c-.39.39-.39 1.03 0 1.42l3.17 3.17c.39.39 1.02.39 1.41 0l3.17-3.17c.4-.39.4-1.03.01-1.42z"})
                                          "UnfoldLessRounded"))
