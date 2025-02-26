# File name: tuscanmilk.txt

## Display lines that contain the string more

grep more tuscanmilk.txt

## Display line that contain the string some

grep some tuscanmilk.txt

## Display line that contain the string and regardless the letter case

grep -i and tuscanmilk.txt

## Display lines that start with A (capital A)

grep ^A tuscanmilk.txt

## Display lines that start with Th

grep ^Th tuscanmilk.txt

## Count the number of lines that Tuscan appears on.

grep Tuscan tuscanmilk.txt | wc -l

OR grep -c Tuscan tuscanmilk.txt

## Count the number of words in the lines that the appears on.

grep the tuscanmilk.txt | wc -w

## Display lines that end with ore

grep ore$ tuscanmilk.txt

## 
