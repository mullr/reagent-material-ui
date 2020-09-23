(ns reagent-material-ui.pickers.date-range-delimiter
  "Imports @material-ui/pickers/DateRangeDelimiter as a Reagent component.
   Original documentation is at https://material-ui-pickers.dev/api/DateRangeDelimiter/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/pickers" :as pickers]))

(def date-range-delimiter (adapt-react-class (.-DateRangeDelimiter pickers) "mui-date-range-delimiter"))