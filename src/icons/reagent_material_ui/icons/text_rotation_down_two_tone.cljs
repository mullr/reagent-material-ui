(ns reagent-material-ui.icons.text-rotation-down-two-tone
  "Imports @material-ui/icons/TextRotationDownTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def text-rotation-down-two-tone (create-svg-icon (e "path" #js {"d" "M6 20l3-3H7V4H5v13H3l3 3zm6.2-11.5v5l-2.2.9v2.1l11-4.75v-1.5L10 5.5v2.1l2.2.9zm6.82 2.5L14 12.87V9.13L19.02 11z"})
                                                  "TextRotationDownTwoTone"))
