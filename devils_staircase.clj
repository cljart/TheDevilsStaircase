(ns mad-sounds.devils_staircase2
 (:require [overtone.live :refer :all]
           [overtone.inst.sampled-piano :refer :all]))

(sampled-piano 46)
(sampled-piano 43)
(sampled-piano 40)

(defn play-chord [root chord-name]
  (doseq [y (chord root chord-name)] (sampled-piano y)))

(let [time (now)]
  (at time (play-chord :c4 :major))
  (at (+ 300 time) (sampled-piano (note :c4)))
  (at (+ 500 time) (sampled-piano (note :e4)))
  (at (+ 1000 time) (sampled-piano (note :g4)))

  (at (+ 1500 time) (play-chord :a3 :minor))

  (at (+ 1800 time) (sampled-piano (note :a3)))
  (at (+ 2000 time) (sampled-piano (note :c4)))
  (at (+ 2500 time) (sampled-piano (note :e4)))

  (at (+ 3000 time) (play-chord :f3 :major))

  (at (+ 3300 time) (sampled-piano (note :f3)))
  (at (+ 3500 time) (sampled-piano (note :a3)))
  (at (+ 4000 time) (sampled-piano (note :c4)))

  (at (+ 4500 time) (play-chord :g3 :major))

  (at (+ 4800 time) (sampled-piano (note :g3)))
  (at (+ 5000 time) (sampled-piano (note :b3)))
  (at (+ 5500 time) (sampled-piano (note :d4)))


  (at (+ 6000 time) (play-chord :c4 :major))
  (at (+ 6300 time) (sampled-piano (note :c4)))
  (at (+ 6500 time) (sampled-piano (note :e4)))
  (at (+ 7000 time) (sampled-piano (note :g4)))

  (at (+ 7500 time) (play-chord :a3 :minor))

  (at (+ 7800 time) (sampled-piano (note :a3)))
  (at (+ 8000 time) (sampled-piano (note :c4)))
  (at (+ 8500 time) (sampled-piano (note :e4)))

  (at (+ 9000 time) (play-chord :f3 :major))

  (at (+ 9300 time) (sampled-piano (note :f3)))
  (at (+ 9500 time) (sampled-piano (note :a3)))
  (at (+ 10000 time) (sampled-piano (note :c4)))

  (at (+ 10500 time) (play-chord :g3 :major))

  (at (+ 10800 time) (sampled-piano (note :g3)))
  (at (+ 11000 time) (sampled-piano (note :b3)))
  (at (+ 11500 time) (sampled-piano (note :d4)))
)
