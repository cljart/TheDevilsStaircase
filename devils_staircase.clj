(ns mad-sounds.devils-staircase
 (:require [overtone.live :refer :all]
           [overtone.inst.sampled-piano :refer :all]))


(def metro (metronome 100))

(defn audio-level [time finger amount-fingers]
  (cond
    (= finger 0) (/ time 11)
    (= finger (dec amount-fingers)) (- 1 (/ time 11))
    :else 1))

(def amount-fingers 5)

(defn finger->note [finger time]
  (+ 50 (* 12 finger) time))

(defn play-finger [finger amount-fingers]
  (loop [time 0]

    (sampled-piano
      (finger->note finger time)
      (audio-level time finger amount-fingers))

    (java.lang.Thread/sleep 500)

    (if (< time 11)
      (recur (inc time))
      (recur 0))))

(dotimes [n amount-fingers]
  (future
    (play-finger n amount-fingers)))
