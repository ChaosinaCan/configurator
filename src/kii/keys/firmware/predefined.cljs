(ns kii.keys.firmware.predefined)

(defonce all
  [[:a "A" nil :core]
   [:b "B" nil :core]
   [:c "C" nil :core]
   [:d "D" nil :core]
   [:e "E" nil :core]
   [:f "F" nil :core]
   [:g "G" nil :core]
   [:h "H" nil :core]
   [:i "I" nil :core]
   [:j "J" nil :core]
   [:k "K" nil :core]
   [:l "L" nil :core]
   [:m "M" nil :core]
   [:n "N" nil :core]
   [:o "O" nil :core]
   [:p "P" nil :core]
   [:q "Q" nil :core]
   [:r "R" nil :core]
   [:s "S" nil :core]
   [:t "T" nil :core]
   [:u "U" nil :core]
   [:v "V" nil :core]
   [:w "W" nil :core]
   [:x "X" nil :core]
   [:y "Y" nil :core]
   [:z "Z" nil :core]
   [:0 "0" nil :core]
   [:1 "1" nil :core]
   [:2 "2" nil :core]
   [:3 "3" nil :core]
   [:4 "4" nil :core]
   [:5 "5" nil :core]
   [:6 "6" nil :core]
   [:7 "7" nil :core]
   [:8 "8" nil :core]
   [:9 "9" nil :core]
   [:0 "0" nil :core]
   [:backsp "BKSP" ["BACKSPACE"] :std]
   [:tab "TAB" nil :std]
   [:enter "↵" ["ENTER"] :std]
   [:lshift "L⇑" ["LSHIFT" "LEFT SHIFT" "SHIFT"] :std]
   [:rshift "R⇑" ["RSHIFT" "RIGHT SHIFT"] :std]
   [:lctrl "LCTRL" ["LCTRL" "LEFT CTRL" "CTRL" "LEFT CONTROL" "CONTROL"] :std]
   [:rctrl "RCTRL" ["RCTRL" "RIGHT CTRL" "RIGHT CONTROL"] :std]
   [:lalt "LALT" ["LALT" "LEFT ALT" "ALT" "ALTERNATE" "LEFT ALTERNATE"] :std]
   [:ralt "RALT" ["RALT" "RIGHT ALT" "RIGHTT ALTERNATE"] :std]
   [:pause "PAUSE" nil :std]
   [:caps "CAPSLK" ["CAPSLOCK" "CAPSLOCK"] :std]
   [:esc "ESC" ["ESC" "ESCAPE"] :std]
   [:space "[ ]" ["SPACE" "SPACEBAR"] :std]
   [:pgup "PGUP" ["PAGEUP" "PAGE UP"] :std]
   [:pgdn "PGDN" ["PAGEDOWN" "PAGE DOWN"] :std]
   [:end "END" nil :std]
   [:home "HOME" nil :std]
   [:left "←" ["LEFT"] :std]
   [:up "↑" ["UP"] :std]
   [:right "→" ["RIGHT"] :std]
   [:down "↓" ["DOWN"] :std]
   [:prsc "PRSC" ["PRINTSCREEN" "PRINT SCREEN"] :std]
   [:ins "INS" ["INSERT"] :std]
   [:del "DEL" ["DELETE"] :std]
   [:semi ";" [";" "SEMICOLON"] :core {:font-size "16px"}]
   [:= "=" ["=" "EQUALS" "EQUAL"] :core]
   [:lgui "LGUI" ["LGUI" "LEFT GUI" "GUI" "SUPER" "LEFT SUPER" "WINDOWS" "LEFT WINDOWS" "WIN" "LEFT WIN"] :std]
   [:rgui "RGUI" ["RGUI" "RIGHT GUI" "RIGHT SUPER" "RIGHT WINDOWS" "RIGHT WIN"] :std]
   [:menu "MENU" ["MENU"] :std]
   [:p0 "P0" ["P0" "KEYPAD 0"] :num]
   [:p1 "P1" ["P1" "KEYPAD 1"] :num]
   [:p2 "P2" ["P2" "KEYPAD 2"] :num]
   [:p3 "P3" ["P3" "KEYPAD 3"] :num]
   [:p4 "P4" ["P4" "KEYPAD 4"] :num]
   [:p5 "P5" ["P5" "KEYPAD 5"] :num]
   [:p6 "P6" ["P6" "KEYPAD 6"] :num]
   [:p7 "P7" ["P7" "KEYPAD 7"] :num]
   [:p8 "P8" ["P8" "KEYPAD 8"] :num]
   [:p9 "P9" ["P9" "KEYPAD 9"] :num]
   [:p* "P*" ["P*" "KEYPAD ASTRIX" "KEYPAD ASTERISK"] :num]
   [:p+ "P+" ["KEYPAD PLUS" "P+"] :num]
   [:p- "P-" ["P-" "KEYPAD MINUS"] :num]
   [:p. "P." ["P." "KEYPAD PERIOD"] :num]
   [:pdiv "P/" ["P/" "KEYPAD SLASH"] :num]
   [:pcomma "P," ["P,"] :num] ;; Should probably be in P. as it's actually decimal-sep
   [:p= "P=" ["P=" "KEYPAD EQUAL"] :num]
   [:pent "P↵" ["PENTER" "KEYPAD ENTER"] :num]
   [:f1 "F1" nil :std]
   [:f2 "F2" nil :std]
   [:f3 "F3" nil :std]
   [:f4 "F4" nil :std]
   [:f5 "F5" nil :std]
   [:f6 "F6" nil :std]
   [:f7 "F7" nil :std]
   [:f8 "F8" nil :std]
   [:f9 "F9" nil :std]
   [:f10 "F10" nil :std]
   [:f11 "F11" nil :std]
   [:f12 "F12" nil :std]
   [:f13 "F13" nil :std]
   [:f14 "F14" nil :std]
   [:f15 "F15" nil :std]
   [:f16 "F16" nil :std]
   [:f17 "F17"]
   [:f18 "F18"]
   [:f19 "F19"]
   [:f20 "F20"]
   [:f21 "F21"]
   [:f22 "F22"]
   [:f23 "F23"]
   [:f24 "F24"]
   [:nmlk "NMLK" ["NUMLOCK" "NUM LOCK"] :std]
   [:sclk "SCLK" ["SCROLLLOCK" "SCROLL LOCK"] :std]
   [:comma "," ["," "COMMA"] :core {:font-size "16px"}]
   [:- "-" ["-" "MINUS"] :core]
   [:. "." ["." "PERIOD"] :core {:font-size "16px"}]
   [:slash "/" ["/" "SLASH"] :core]
   [:btick "`" ["`" "BACKTICK"] :core {:font-size "16px"}]
   [:lbr "[" ["[" "LBRACE" "LEFT BRACE"] :core]
   [:bslash "\\" ["\\" "BACKSLASH"] :core]
   [:rbr "]" ["]" "RBRACE" "RIGHT BRACE"] :core]
   [:quote "'" ["'" "QUOTE" "SINGLE QUOTE"] :core {:font-size "16px"}]

   [:clear "CLEAR" nil :spec]
   [:none "NONE" ["#:None"] :spec]
   [:nxfn "NEXT-ƒ" ["#:layerRotate( 0 )" "NEXT LAYER" "NLayer"] :spec]
   [:pvfn "PREV-ƒ" ["#:layerRotate( 1 )" "PREV LAYER" "PLayer"] :spec]
   [:fn1 "ƒ1" ["#:layerShift( 1 )" "FUN1" "FUNCTION1" "FUN"] :spec]
   [:fn2 "ƒ2" ["#:layerShift( 2 )" "FUN2" "FUNCTION2"] :spec]
   [:fn3 "ƒ3" ["#:layerShift( 3 )" "FUN3" "FUNCTION3"] :spec]
   [:fn4 "ƒ4" ["#:layerShift( 4 )" "FUN4" "FUNCTION4"] :spec]
   [:fn5 "ƒ5" ["#:layerShift( 5 )" "FUN5" "FUNCTION5"] :spec]
   [:fn6 "ƒ6" ["#:layerShift( 6 )" "FUN6" "FUNCTION6"] :spec]
   [:fn7 "ƒ7" ["#:layerShift( 7 )" "FUN7" "FUNCTION7"] :spec]
   [:fn8 "ƒ8" ["#:layerShift( 8 )" "FUN8" "FUNCTION8"]]
   [:fn9 "ƒ9" ["#:layerShift( 9 )" "FUN9" "FUNCTION9"]]
   [:fn10 "ƒ10" ["#:layerShift( 10 )" "FUN10" "FUNCTION10"]]
   [:fn11 "ƒ11" ["#:layerShift( 11 )" "FUN11" "FUNCTION11"]]
   [:fn12 "ƒ12" ["#:layerShift( 12 )" "FUN12" "FUNCTION12"]]
   [:fn13 "ƒ13" ["#:layerShift( 13 )" "FUN13" "FUNCTION13"]]
   [:fn14 "ƒ14" ["#:layerShift( 14 )" "FUN14" "FUNCTION14"]]
   [:fn15 "ƒ15" ["#:layerShift( 15 )" "FUN15" "FUNCTION15"]]
   [:fn16 "ƒ16" ["#:layerShift( 16 )" "FUN16" "FUNCTION16"]]

   [:lck1 "LOCK-1" ["#:layerLock( 1 )" "LCK1" "LOCK1" "LCK"] :spec]
   [:lck2 "LOCK-2" ["#:layerLock( 2 )" "LCK2" "LOCK2"] :spec]
   [:lck3 "LOCK-3" ["#:layerLock( 3 )" "LCK3" "LOCK3"] :spec]
   [:lck4 "LOCK-4" ["#:layerLock( 4 )" "LCK4" "LOCK4"] :spec]
   [:lck5 "LOCK-5" ["#:layerLock( 5 )" "LCK5" "LOCK5"] :spec]
   [:lck6 "LOCK-6" ["#:layerLock( 6 )" "LCK6" "LOCK6"] :spec]
   [:lck7 "LOCK-7" ["#:layerLock( 7 )" "LCK7" "LOCK7"] :spec]
   [:lck8 "LOCK-8" ["#:layerLock( 8 )" "LCK8" "LOCK8"]]
   [:lck9 "LOCK-9" ["#:layerLock( 9 )" "LCK9" "LOCK9"]]
   [:lck10 "LOCK-10" ["#:layerLock( 10 )" "LCK10" "LOCK10"]]
   [:lck11 "LOCK-11" ["#:layerLock( 11 )" "LCK11" "LOCK11"]]
   [:lck12 "LOCK-12" ["#:layerLock( 12 )" "LCK12" "LOCK12"]]
   [:lck13 "LOCK-13" ["#:layerLock( 13 )" "LCK13" "LOCK13"]]
   [:lck14 "LOCK-14" ["#:layerLock( 14 )" "LCK14" "LOCK14"]]
   [:lck15 "LOCK-15" ["#:layerLock( 15 )" "LCK15" "LOCK15"]]
   [:lck16 "LOCK-16" ["#:layerLock( 16 )" "LCK16" "LOCK16"]]

   [:lat1 "LATCH-1" ["#:layerLatch( 1 )" "LAT1" "LATCH1" "LAT"] :spec {:font-size "12px"}]
   [:lat2 "LATCH-2" ["#:layerLatch( 2 )" "LAT2" "LATCH2"] :spec {:font-size "12px"}]
   [:lat3 "LATCH-3" ["#:layerLatch( 3 )" "LAT3" "LATCH3"] :spec {:font-size "12px"}]
   [:lat4 "LATCH-4" ["#:layerLatch( 4 )" "LAT4" "LATCH4"] :spec {:font-size "12px"}]
   [:lat5 "LATCH-5" ["#:layerLatch( 5 )" "LAT5" "LATCH5"] :spec {:font-size "12px"}]
   [:lat6 "LATCH-6" ["#:layerLatch( 6 )" "LAT6" "LATCH6"] :spec {:font-size "12px"}]
   [:lat7 "LATCH-7" ["#:layerLatch( 7 )" "LAT7" "LATCH7"] :spec {:font-size "12px"}]
   [:lat8 "LATCH-8" ["#:layerLatch( 8 )" "LAT8" "LATCH8"]]
   [:lat9 "LATCH-9" ["#:layerLatch( 9 )" "LAT9" "LATCH9"]]
   [:lat10 "LATCH-10" ["#:layerLatch( 11 )" "LAT10" "LATCH10"]]
   [:lat11 "LATCH-11" ["#:layerLatch( 11 )" "LAT11" "LATCH11"]]
   [:lat12 "LATCH-12" ["#:layerLatch( 12 )" "LAT12" "LATCH12"]]
   [:lat13 "LATCH-13" ["#:layerLatch( 13 )" "LAT13" "LATCH13"]]
   [:lat14 "LATCH-14" ["#:layerLatch( 14 )" "LAT14" "LATCH14"]]
   [:lat15 "LATCH-15" ["#:layerLatch( 15 )" "LAT15" "LATCH15"]]
   [:lat16 "LATCH-16" ["#:layerLatch( 16 )" "LAT16" "LATCH16"]]
   [:flash "FLASH" ["#:flashMode()"] :spec]
   [:kro "6/N-KRO" ["#:toggleKbdProtocol()"] :spec {:font-size "11px"}]

   ;; visualization
   [:led/dec "LED-" ["#:ledControl( 0, 15 )"] :vis]
   [:led/inc "LED+" ["#:ledControl( 1, 15 )"] :vis]
   [:led/off "LED OFF" ["#:ledControl( 3, 0 )"] :vis {:font-size "12px"}]
   [:led/on "LED ON" ["#:ledControl( 4, 255 )"] :vis {:font-size "12px"}]
   [:led/tog "LED TOG" ["#:ledControl( 5, 255 )"] :vis {:font-size "12px"}]
   [:led/s25 "LED 25%" ["#:ledControl( 2, 63 )"] :vis {:font-size "12px"}]
   [:led/s50 "LED 50%" ["#:ledControl( 2, 127 )"] :vis {:font-size "12px"}]
   [:led/s75 "LED 75%" ["#:ledControl( 2, 190 )"] :vis {:font-size "12px"}]
   [:led/s100 "LED 100%" ["#:ledControl( 2, 255 )"] :vis {:font-size "10px"}]
   [:vis/plps "V:PL/PS" ["#:animation_control( 0 )"] :vis]
   [:vis/ffx1 "V:FFx1" ["#:animation_control( 1 )"] :vis]
   [:vis/play "V:PLAY" ["#:animation_control( 2 )"] :vis]
   [:vis/stop "V:STOP" ["#:animation_control( 3 )"] :vis]
   [:vis/reset "V:RESET" ["#:animation_control( 4 )"] :vis]
   [:vis/wipe "V:WIPE" ["#:animation_control( 5 )"] :vis]
   [:vis/pause "V:PAUSE" ["#:animation_control( 6 )"] :vis]

   ;; i11n
   [:i11n/iso# "ISO#" ["HASH" "NUMBER" "#"] :i11l]
   [:i11n/iso-slash "ISO/" ["ISO/" "ISO SLASH"] :i11l]
   [:i11n/intl1 "INTL1" ["INTER1" "KANJI1"] :i11l]
   [:i11n/intl2 "カナ" ["INTER2" "KANJI2" "KANA" "カナ"] :i11l]
   [:i11n/intl3 "¥" ["INTER3" "KANJI3" "YEN" "¥"] :i11l]
   [:i11n/intl4 "変換" ["INTER4" "KANJI4" "HENKAN" "変換"] :i11l]
   [:i11n/intl5 "無変換" ["INTER5" "KANJI5" "MUHENKAN" "無変換"] :i11l]
   [:i11n/intl6 "INTL6" ["INTER6" "KANJI6"] :i11l]
   [:i11n/intl7 "INTL7" ["INTER7" "KANJI7" "BYTETOGGLE"] :i11l]
   [:i11n/intl8 "INTL8" ["INTER8" "KANJI8"] :i11l]
   [:i11n/intl9 "INTL9" ["INTER9" "KANJI9"] :i11l]
   [:i11n/lang1 "한/영" ["LANG1" "HANGULENGLISH" "HANGUL ENGLISH" "한/영"] :i11l]
   [:i11n/lang2 "英数/한자" ["LANG2" "HANJA" "EISU" "英数/한자"] :i11l {:font-size "11px"}]
   [:i11n/lang3 "カタカナ" ["LANG3" "KATAKANA" "カタカナ"] :i11l {:font-size "11px"}]
   [:i11n/lang4 "ひらがな" ["LANG4" "HIRAGANA" "ひらがな"] :i11l {:font-size "11px"}]
   [:i11n/lang5 "半角/全角" ["LANG5" "ZENKAKUHANKAKU" "ZENKAKU HANKAKU" "半角/全角"] :i11l {:font-size "10px"}]
   [:i11n/lang6 "LANG6" ["LANG6"] :i11l]
   [:i11n/lang7 "LANG7" ["LANG7"] :i11l]
   [:i11n/lang8 "LANG8" ["LANG8"] :i11l]
   [:i11n/lang9 "LANG9" ["LANG9"] :i11l]

   ;; mouse
   [:mouse/btn1 "Btn 1" ["#:mouseOut( 1, 0, 0 )"] :mouse]
   [:mouse/btn2 "Btn 2" ["#:mouseOut( 2, 0, 0 )"] :mouse]
   [:mouse/btn3 "Btn 3" ["#:mouseOut( 3, 0, 0 )"] :mouse]
   [:mouse/btn4 "Btn 4" ["#:mouseOut( 4, 0, 0 )"] :mouse]
   [:mouse/btn5 "Btn 5" ["#:mouseOut( 5, 0, 0 )"] :mouse]
   [:mouse/btn6 "Btn 6" ["#:mouseOut( 6, 0, 0 )"] :mouse]
   [:mouse/btn7 "Btn 7" ["#:mouseOut( 7, 0, 0 )"] :mouse]
   [:mouse/btn8 "Btn 8" ["#:mouseOut( 8, 0, 0 )"] :mouse]
   [:mouse/btn9 "Btn 9" ["#:mouseOut( 9, 0, 0 )"] :mouse]
   [:mouse/btn10 "Btn 10" ["#:mouseOut( 10, 0, 0 )"] :mouse]
   [:mouse/btn11 "Btn 11" ["#:mouseOut( 11, 0, 0 )"] :mouse]
   [:mouse/btn12 "Btn 12" ["#:mouseOut( 12, 0, 0 )"] :mouse]
   [:mouse/btn13 "Btn 13" ["#:mouseOut( 13, 0, 0 )"] :mouse]
   [:mouse/btn14 "Btn 14" ["#:mouseOut( 14, 0, 0 )"] :mouse]
   [:mouse/btn15 "Btn 15" ["#:mouseOut( 15, 0, 0 )"] :mouse]
   [:mouse/btn16 "Btn 16" ["#:mouseOut( 16, 0, 0 )"] :mouse]
   [:mouse/up1 "↑ x1" ["#:mouseOut( 0, 0, 1 )"] :mouse]
   [:mouse/up5 "↑ x5" ["#:mouseOut( 0, 0, 5 )"] :mouse]
   [:mouse/dn1 "↓ x1" ["#:mouseOut( 0, 0, -1 )"] :mouse]
   [:mouse/dn5 "↓ x5" ["#:mouseOut( 0, 0, -5 )"] :mouse]
   [:mouse/lf1 "← x1" ["#:mouseOut( 0, -1, 0 )"] :mouse]
   [:mouse/lf5 "← x1" ["#:mouseOut( 0, -5, 0 )"] :mouse]
   [:mouse/rt1 "→ x1" ["#:mouseOut( 0, 1, 0 )"] :mouse]
   [:mouse/rt5 "→ x1" ["#:mouseOut( 0, 5, 0 )"] :mouse]

   ;; macros
   [:mac/tilde "~" ["#:'~'"] :mac {:font-size "16px"}]
   [:mac/excl  "!" ["#:'!'"] :mac]
   [:mac/at    "@" ["#:'@'"] :mac]
   [:mac/hash  "#" ["#:'#'"] :mac]
   [:mac/dol   "$" ["#:'$'"] :mac]
   [:mac/perc  "%" ["#:'%'"] :mac]
   [:mac/hat   "^" ["#:'^'"] :mac {:font-size "16px"}]
   [:mac/amp   "&" ["#:'&'"] :mac]
   [:mac/star  "*" ["#:'*'"] :mac {:font-size "16px"}]
   [:mac/opar  "(" ["#:'('"] :mac]
   [:mac/cpar  ")" ["#:')'"] :mac]
   [:mac/uscr  "_" ["#:'_'"] :mac {:font-size "16px"}]
   [:mac/plus  "+" ["#:'+'"] :mac {:font-size "16px"}]
   [:mac/obra  "{" ["#:'{'"] :mac]
   [:mac/cbra  "}" ["#:'}'"] :mac]
   [:mac/pipe  "|" ["#:'|'"] :mac]
   [:mac/lt    "<" ["#:'<'"] :mac {:font-size "16px"}]
   [:mac/gt    ">" ["#:'>'"] :mac {:font-size "16px"}]
   [:mac/ques  "?" ["#:'e?'"] :mac]
   [:mac/colon ":" ["#:':'"] :mac {:font-size "16px"}]
   [:mac/dquot "\"" ["#:'\"'"] :mac {:font-size "16px"}]

   ;; multimedia
   [:mult/mute "MUTE" ["CONS:MUTE"] :mult]
   [:mult/volup "VOL+" ["CONS:VOLUMEUP" "CONS:VOLUME UP"] :mult]
   [:mult/voldn "VOL-" ["CONS:VOLUMEDOWN" "CONS:VOLUME DOWN"] :mult]
   [:mult/plps "PL/PS" ["CONS:PAUSEPLAY"] :mult]
   [:mult/play "PLAY" ["CONS:PLAY"] :mult]
   [:mult/pause "PAUSE" ["CONS:PAUSE"] :mult]
   [:mult/ff "FF" ["CONS:FASTFORWARD"] :mult]
   [:mult/rew "RW" ["CONS:REWIND"] :mult]
   [:mult/next "NEXT" ["CONS:SCANNEXTTRACK"] :mult]
   [:mult/prev "PREV" ["CONS:SCANPREVIOUSTRACK"] :mult]
   [:mult/stop "STOP" ["CONS:STOP"] :mult]
   [:mult/eject "EJECT" ["CONS:EJECT"] :mult]
   [:mult/calc "CALC" ["CONS:CALCULATOR"] :mult]
   [:mult/web "WEB" ["CONS:INTERNETBROWSER"] :mult]
   [:mult/files "FILES" ["CONS:FILEBROWSER"] :mult]
   [:mult/scrup "SCRN+" ["CONS:BRIGHTNESSINCREMENT"] :mult]
   [:mult/scrdn "SCRN-" ["CONS:BRIGHTNESSDECREMENT"] :mult]
   [:mult/power "POWER" ["SYS:POWERDOWN"] :mult]
   [:mult/sleep "SLEEP" ["SYS:SLEEP"] :mult]
   [:mult/wake "WAKEUP" ["SYS:WAKEUP"] :mult]
   ;; other stuff...
   ])
