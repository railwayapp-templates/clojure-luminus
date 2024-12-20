(ns brapp.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [brapp.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[brapp started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[brapp has shut down successfully]=-"))
   :middleware wrap-dev})
