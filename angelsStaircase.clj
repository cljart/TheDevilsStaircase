(ns mad-sounds.angelsStaircase
  (:require [overtone.live :refer :all]
            [overtone.inst.sampled-piano :refer :all]))

; setup a tempo for our metronome to use
(def metro (metronome 120))

(defn strike-notes [time amount-fingers]
  (dotimes [finger amount-fingers]
    (sampled-piano (+ 70 finger (mod time 12)))))


; This Function will play our sound at whatever tempo we've set our metronome to
(defn looper [nome]
    (let [beat (nome)
          fingers (inc (rand-int 5))]
        ;; schedules a specific number of piano notes at this beat
        (at (nome beat) (strike-notes beat fingers))
        ;;
        ;; schedules looper to be called at metronome + the next beat
        (apply-by (nome (inc beat)) looper nome [])))

; turn on the metronome
(looper metro)
(stop)
