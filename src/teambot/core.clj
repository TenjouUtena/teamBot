(ns teambot.core

  (:require
    [discord.bot
     :as
     bot]))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))


(defn startbot []
  (bot/start))