(ns reagent-material-ui.icons.closed-caption-disabled-sharp
  "Imports @material-ui/icons/ClosedCaptionDisabledSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def closed-caption-disabled-sharp (create-svg-icon (e "path" #js {"d" "M6.83 4H21v14.17L17.83 15H18v-2h-1.5v.5h-.17l-1.83-1.83V10.5h2v.5H18V9h-5v1.17L6.83 4zm12.95 18.61L17.17 20H3V5.83L1.39 4.22 2.8 2.81l18.38 18.38-1.4 1.42zM11 13.83l-.83-.83H9.5v.5h-2v-3h.17L6.17 9H6v6h5v-1.17z"})
                                                    "ClosedCaptionDisabledSharp"))