(ns reagent-material-ui.icons.signal-wifi-off-rounded
  "Imports @material-ui/icons/SignalWifiOffRounded as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def signal-wifi-off-rounded (create-svg-icon (e "path" #js {"d" "M23.64 7c-.45-.34-4.93-4-11.64-4-1.32 0-2.55.14-3.69.38L18.43 13.5 23.64 7zM4.12 2.01a.9959.9959 0 00-1.41 0c-.39.39-.39 1.02 0 1.41l1.35 1.35C1.91 5.76.59 6.82.36 7l10.08 12.56c.8 1 2.32 1 3.12 0l2.35-2.93 2.61 2.61c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41L4.12 2.01z"})
                                              "SignalWifiOffRounded"))