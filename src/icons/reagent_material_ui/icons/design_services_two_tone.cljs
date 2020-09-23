(ns reagent-material-ui.icons.design-services-two-tone
  "Imports @material-ui/icons/DesignServicesTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def design-services-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M15.91 9.28l-1.3-1.3L5 17.59V19h1.41l9.61-9.61zM10.83 8.93l-1.2-1.2-1.19 1.19L7.02 7.5l1.19-1.18-1.27-1.28-1.9 1.9 3.89 3.89zM16.27 14.38l-1.2-1.21-1.9 1.9 3.89 3.89 1.9-1.9-1.27-1.27-1.19 1.19-1.42-1.41zM16.0207 6.558l1.4142-1.4141 1.4142 1.4142-1.4142 1.4142z", "opacity" ".3"}) (e "path" #js {"d" "M20.97 5.86l-2.83-2.83a.9959.9959 0 00-1.41 0l-4.49 4.49-3.89-3.89c-.78-.78-2.05-.78-2.83 0l-1.9 1.9c-.78.78-.78 2.05 0 2.83l3.89 3.89L3 16.76V21h4.24l4.52-4.52 3.89 3.89c.95.95 2.23.6 2.83 0l1.9-1.9c.78-.78.78-2.05 0-2.83l-3.89-3.89 4.49-4.49c.38-.38.38-1.01-.01-1.4zM5.04 6.94l1.89-1.9L8.2 6.31 7.02 7.5l1.41 1.41 1.19-1.19 1.2 1.2-1.9 1.9-3.88-3.88zM6.41 19H5v-1.41l9.61-9.61 1.3 1.3.11.11L6.41 19zm10.09-2.02l1.19-1.19 1.27 1.27-1.9 1.9-3.89-3.89 1.9-1.9 1.2 1.2-1.19 1.19 1.42 1.42zm.94-9l-1.41-1.41 1.41-1.41 1.41 1.41-1.41 1.41z"}))
                                               "DesignServicesTwoTone"))