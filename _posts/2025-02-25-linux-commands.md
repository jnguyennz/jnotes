# File name: tuscanmilk.txt

## Display lines that contain the string more

```grep more tuscanmilk.txt```

## Display line that contain the string some

```grep some tuscanmilk.txt```

## Display line that contain the string and regardless the letter case

```grep -i and tuscanmilk.txt```

## Display lines that start with A (capital A)

```grep ^A tuscanmilk.txt```

## Display lines that start with Th

```grep ^Th tuscanmilk.txt```

## Count the number of lines that Tuscan appears on.

```grep Tuscan tuscanmilk.txt | wc -l ```

OR ```grep -c Tuscan tuscanmilk.txt```

## Count the number of words in the lines that the appears on.

```grep the tuscanmilk.txt | wc -w```

## Display lines that end with a period

```grep '\.$' tuscanmilk.txt```

## Display line that contain floor or door
```egrep 'floor|door' tuscanmilk.txt```

## Display lines that contain who or what or how
```egrep 'who|what\how' tuscanmilk.txt```

## Display lines that contain a string that starts with s, end with e and has three characters between

```egrep 's...e' tuscanmilk.txt```

## Same as the previous but display only the strings that match the pattern, not the line.

```egrep -o 's...e' tuscanmilk.txt```

## Same as previous but sort them into alphabet order

```egrep -o 's...e' tuscanmilk.txt | sort```

## Display lines that end with ore

```grep ore$ tuscanmilk.txt```

# File name auth.log

- How many lines are in the file?
```wc -l auth.log```

- Which three day are represented in the file?

``` egrep -o '^..........' auth.log | uniq

- How many entries are there for each day in the file?
``` egrep -o '^..........' auth.log | uniq -c
 

