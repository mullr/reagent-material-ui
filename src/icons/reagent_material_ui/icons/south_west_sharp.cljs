(ns reagent-material-ui.icons.south-west-sharp
  "Imports @material-ui/icons/SouthWestSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def south-west-sharp (create-svg-icon (e "path" #js {"d" "M15 19v-2H8.41L20 5.41 18.59 4 7 15.59V9H5v10h10z"})
                                       "SouthWestSharp"))