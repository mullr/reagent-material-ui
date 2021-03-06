(ns reagent-material-ui.core.modal-manager
  "Imports @material-ui/core/Modal/ModalManager as a Reagent component.
   Original documentation is at https://material-ui.com/api/modal-manager/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Modal" :as MuiModal]))

(def modal-manager (adapt-react-class (.-ModalManager MuiModal) "mui-modal-manager"))
