(ns reagent-material-ui.icons.keyboard-arrow-left
  "Imports @material-ui/icons/KeyboardArrowLeft as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def keyboard-arrow-left (create-svg-icon (e "path" #js {"d" "M15.41 16.59L10.83 12l4.58-4.59L14 6l-6 6 6 6 1.41-1.41z"})
                                          "KeyboardArrowLeft"))
