# Welcome to Sonic Pi v2.0
#volume, octave(frequency, finger/hand
amount_fingers = 5

define :finger do |n|
  in_thread do
  t = 0
    loop do
      puts "finger is #{n}"
      if n == 0
        audio_level = t/11.0
      elsif n == amount_fingers-1
        audio_level = 1.0-(t/11.0)
      else
      audio_level = 1
      end
      audio_level
      play 12 * n + 50 + t, amp: audio_level
      sleep 0.5
      if t < 11
        t = t + 1
      else
        t = 0
      end
      puts t
      
    end
  end
end

amount_fingers.times do |n|
  finger(n)
end