# The Devils Staircase

### 1. First steps in Ruby/SonicPi
Inspired by this [video] (https://www.youtube.com/watch?v=1ZTaiDHqs5s) we implemented the algorithm in SonicPi with Ruby.  

**How to run it?**  
If you want to try it out install [Sonic Pi] (http://sonic-pi.net/) and copy the code from the ```devils_staircase.rb``` into your Sonic Pi workspace and run it.

![alt tag](https://github.com/cljart/TheDevilsStaircase/blob/master/devils_staircase.jpg)  
  
**Goal:** Turn it into Clojure and use Overtone for real instruments.  


### 2. Starting to convert into Clojure  
We created a file ```devils_staircase.clj``` which currently inlcudes a piano and a simple melody with chords.  
  
**Next step:** Implement the devils staircase algorithm.

**How to run it?**  
It is a bit complicated. Don't panic. :scream_cat:  
Create a file in an Overtone project like [mad-sounds](https://github.com/cljart/mad-sounds)
and copy the code of the ```devils_staircase.clj``` into it.  
In emacs start a REPL with ```meta-x``` shortcut and choose ```cider-jack-in```.  
Load Overtone in the REPL with ```(use 'overtone.live)```.  
Switch to your files namespace e.g. ```(in-ns 'mad-sounds.devils_staircase)```.  
Evaluate the code in your file with the last bracket selected and shortcut ```C-x C-e```.  
Then run the code with ```C-c C-c``` shortcut.  
