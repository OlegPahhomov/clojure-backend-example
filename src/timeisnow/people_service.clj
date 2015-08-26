(ns timeisnow.people-service
  (:require [yesql.core :refer [defquery defqueries]]
            [clojure.string :as cstr]
            [clojure.data.json :as json]
            [cheshire.core :refer [generate-string
                                   parse-string]])
  )


(def db-spec {:classname   "org.postgresql.Driver"
              :subprotocol "postgresql"
              :subname     "//localhost:5432/"
              :user        "postgres"
              ;:password    "12345"
              :password    "postgres"
              })


(defqueries "timeisnow/people.sql")

(defn select-all-people []
  (generate-string (select-all-users db-spec)))


(defn insert-person! [json-body]
  (let  [body (json/read-str json-body)
        name (get body "name")
        date-of-birth (get body "date_of_birth")]
        (do
          (insert-user! db-spec name (java.sql.Date/valueOf date-of-birth))
          "success")
))