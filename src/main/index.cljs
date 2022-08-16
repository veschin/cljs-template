(ns index
  (:require [reagent.dom]
            [reagent.core]))

(defn main- []
  [:div "Init view"])

(reagent.dom/render [main-] (js/document.querySelector "#app"))
