(ns reagent-material-ui.icons.south-east-two-tone
  "Imports @material-ui/icons/SouthEastTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def south-east-two-tone (create-svg-icon (e "path" #js {"d" "M19 9h-2v6.59L5.41 4 4 5.41 15.59 17H9v2h10V9z"})
                                          "SouthEastTwoTone"))