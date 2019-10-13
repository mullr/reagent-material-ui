(ns reagent-material-ui.icons.input-outlined
  "Imports @material-ui/icons/InputOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def input-outlined (create-svg-icon (e (.-Fragment js/React) nil (e "g" #js {"fill" "none"} (e "path" #js {"d" "M0 0h24v24H0V0z"}) (e "path" #js {"d" "M0 0h24v24H0V0z", "opacity" ".87"})) (e "path" #js {"d" "M21 3.01H3c-1.1 0-2 .9-2 2V9h2V4.99h18v14.03H3V15H1v4.01c0 1.1.9 1.98 2 1.98h18c1.1 0 2-.88 2-1.98v-14c0-1.11-.9-2-2-2zM11 16l4-4-4-4v3H1v2h10v3zM21 3.01H3c-1.1 0-2 .9-2 2V9h2V4.99h18v14.03H3V15H1v4.01c0 1.1.9 1.98 2 1.98h18c1.1 0 2-.88 2-1.98v-14c0-1.11-.9-2-2-2zM11 16l4-4-4-4v3H1v2h10v3z"}))
                                     "InputOutlined"))