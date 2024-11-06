(ns brapp.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[brapp started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[brapp has shut down successfully]=-"))
   :middleware identity})
