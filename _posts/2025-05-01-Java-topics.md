
# Java Topic Examples

## Cumulative Algorithm, char Data Type, printf, ASCII Code
```
// Cumulative sum of ASCII codes for characters
char c1 = 'A', c2 = 'B';
int sum = (int)c1 + (int)c2; // ASCII: 65 + 66 = 131
System.out.printf("Sum of '%c' and '%c' ASCII codes: %d\n", c1, c2, sum);
```

## While Loop
```
int i = 0;
while (i < 5) {
    System.out.println("i = " + i);
    i++;
}
```

## Range Validation Using while or do-while Loop
```
Scanner sc = new Scanner(System.in);
int num;
do {
    System.out.print("Enter a number between 1 and 10: ");
    num = sc.nextInt();
} while (num < 1 || num > 10);
```
## Sentinel Value
```
Scanner sc = new Scanner(System.in);
int sum = 0, input;
System.out.print("Enter number (0 to quit): ");
input = sc.nextInt();
while (input != 0) { // 0 is the sentinel
    sum += input;
    input = sc.nextInt();
}
System.out.println("Sum: " + sum);
```
## Loop Control Variable Update
```
int count = 0;
while (count < 3) {
    System.out.println("Count: " + count);
    count++; // update control variable
}
```
## Data Type Validation Using hasNext Methods from Scanner

```
Scanner sc = new Scanner(System.in);
System.out.print("Enter an integer: ");
while (!sc.hasNextInt()) {
    System.out.print("Invalid! Enter an integer: ");
    sc.next(); // discard invalid input
}
int validInt = sc.nextInt();
System.out.println("You entered: " + validInt);
```
## Repeating the Code Using a while Loop or do-while
```
String again;
Scanner sc = new Scanner(System.in);
do {
    System.out.println("This code repeats!");
    System.out.print("Repeat? (yes/no): ");
    again = sc.next();
} while (again.equalsIgnoreCase("yes"));
```
## Cumulative Sum Using while Loop

```
int sum = 0, n = 1;
while (n <= 10) {
    sum += n;
    n++;
}
System.out.println("Sum 1 to 10: " + sum);
```
## Boolean Data Type
```
boolean isJavaFun = true;
if (isJavaFun) {
    System.out.println("Java is fun!");
}

```
## Methods with Boolean Return

```
public static boolean isEven(int n) {
    return n % 2 == 0;
}
System.out.println(isEven(4)); // true
```

## Solve a Given Problem Using while Loop
```
// Print all even numbers less than 10
int i = 0;
while (i < 10) {
    if (i % 2 == 0) System.out.println(i);
    i++;
}
```
## Random Class

```
import java.util.Random;
Random rand = new Random();
int randomNum = rand.nextInt(); // any int value
```
## Generate Random Numbers Using the Random Class
```
Random rand = new Random();
int num = rand.nextInt(100); // 0 to 99
System.out.println("Random number: " + num);
```
## Simulate Tossing Coin
```
Random rand = new Random();
String coin = rand.nextBoolean() ? "Heads" : "Tails";
System.out.println("Coin toss: " + coin);
```
## Simulate Tossing Dice
```
Random rand = new Random();
int dice = rand.nextInt(6) + 1; // 1 to 6
System.out.println("Dice roll: " + dice);
```
## Simulate Picking a Number 1-100 to Choose a Prize Winner

```
Random rand = new Random();
int winner = rand.nextInt(100) + 1; // 1 to 100
System.out.println("Prize winner: #" + winner);
```
## Solving a Problem Using Random and while Loop
```
// Keep tossing a die until a 6 appears, count attempts
Random rand = new Random();
int roll, attempts = 0;
do {
    roll = rand.nextInt(6) + 1;
    attempts++;
} while (roll != 6);
System.out.println("Rolled a 6 after " + attempts + " tries.");
```
## Do-while
```
int x;
Scanner sc = new Scanner(System.in);
do {
    System.out.print("Enter positive number: ");
    x = sc.nextInt();
} while (x <= 0);
```
## Difference Between while and do-while

 | while Loop	| do-while Loop |
 | Checks condition before loop body	| Executes body at least once, then checks condition |
 | May not execute at all	| Always executes at least once |

## Write a Math Quiz That Generates Math Questions
```
Random rand = new Random();
Scanner sc = new Scanner(System.in);
int a = rand.nextInt(10) + 1, b = rand.nextInt(10) + 1;
System.out.printf("What is %d + %d? ", a, b);
int answer = sc.nextInt();
if (answer == a + b) System.out.println("Correct!");
else System.out.println("Incorrect. The answer is " + (a + b));
```
## Short Circuit Evaluation

```
String s = null;
if (s != null && s.length() > 0) {
    System.out.println("String is not empty.");
}
// s.length() is only checked if s != null
```
## DeMorgan's Law
```
// Original
if (!(a > 0 && b > 0)) { ... }
// DeMorgan's Law
if (a <= 0 || b <= 0) { ... }
```
