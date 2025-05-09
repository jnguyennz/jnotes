Java Study Guide
This study guide covers all the key concepts and skills you need for your exam, based on chapters 1, 2, 3, 4, 5, 7, and 8 from Building Java Programs. The exam includes true/false, multiple choice, and fill-in-the-blank questions, including code writing in fill-in-the-blank format.

General Preparation
Review all assignments and quizzes.

Practice writing code by hand.

Take the practice exam.

Core Concepts
1. Output and Escape Sequences
```
System.out.print vs System.out.println
```
println adds a new line after output; print does not.

Escape Sequences:
```
\t (tab), \n (newline), \\ (backslash), \" (double quote)
```
Example:
```
java
System.out.println("\"hello\" \\ almost /done with the Fall 2020//\" semester\"");
```
2. Variables and Data Types
Variable Declaration:
```
int x;, double y;, boolean flag;, char letter;
```
Initialization:
```
int x = 5;
```
Primitive Types:
```
int, double, boolean, char
```
3. Methods
Without Parameters:
```
java
public static void greet() {
    System.out.println("Hello!");
}
```
With Parameters:
```
java
public static void printSum(int a, int b) {
    System.out.println(a + b);
}
```
With Return Type:
```
java
public static int add(int a, int b) {
    return a + b;
}
```
Method Calls:
```
add(2, 3);
```
4. Operators

Relational: ```<=, <, >, >=, ==, !=```

Logical: ```&&, ||, !```

Arithmetic: ```+, -, *, /, %```

Expression Evaluation:

Follow operator precedence (multiplication/division/modulus before addition/subtraction).
```
Example: 2 + 3 * 6 % 5 + 12 % 23
```
5. Control Structures
If / If-Else:
```
java
if (x > 0) { ... }
else if (x == 0) { ... }
else { ... }
Switch:

java
switch(value) {
    case 1: ...; break;
    case 2: ...; break;
    default: ...;
}
For Loop:

java
for (int i = 0; i < 10; i++) { ... }
While Loop:

java
int i = 0;
while (i < 10) { ...; i++; }
Do-While Loop:

java
int i = 0;
do { ...; i++; } while (i < 10);
Nested Loops: Loops inside other loops for patterns or 2D data.
```
6. Constants and Scope
Class Constant:
```
java
public static final int DAYS_IN_WEEK = 7;
```
Scope:

Where a variable can be accessed.

Local Variable:

Declared inside a method/block, only accessible there.

7. Parameter Passing
Pass by Value:

Java passes all primitive types by value (copy).

Pass by Reference:

Java passes object references by value; the reference itself is copied.

8. Boolean, ASCII, and Strings
```Boolean: true or false```

ASCII:
```
Characters have numeric codes, e.g., 'A' is 65.
```
String Methods:
```
.length(), .substring(), .indexOf(), .equals(), .charAt()
```
9. Scanner Class and Input Validation
Scanner Usage:
```
java
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
double d = sc.nextDouble();
String s = sc.nextLine();
Validation:

hasNextInt(), hasNextDouble(), hasNextLine(), hasNext()

Range Validation:

Use && or || in conditions.
```
10. Loops and Cumulative Calculations
Cumulative Sum/Product:

Sum: Add in a loop.

Product: Multiply in a loop.

Example: Product of 1-10:
```
java
int product = 1;
for (int i = 1; i <= 10; i++) {
    product *= i;
}
Random Numbers:

java
Random rand = new Random();
int num = rand.nextInt(101) + 200; // 200-300
11. Arrays
Declaration:

int[] arr = new int[10];

String[] names = new String[10];

Initialization:

int[] arr = {1, 2, 3, 4};

For loop:

java
for (int i = 0; i < arr.length; i++) {
    arr[i] = i * 2;
}
Traversal:

Use a for loop to access each element.

Check if Sorted:

java
boolean isSorted(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] > arr[i + 1]) return false;
    }
    return true;
}
Check if Two Arrays Equal:

java
boolean arraysEqual(int[] a, int[] b) {
    if (a.length != b.length) return false;
    for (int i = 0; i < a.length; i++) {
        if (a[i] != b[i]) return false;
    }
    return true;
}
```
12. Object-Oriented Programming
User-Defined Data Types:

Create classes like Car, Circle.

Access Modifiers:

public: accessible everywhere

private: accessible only within the class

Instance Variable:

Field inside a class.

Constructor:

Initializes the object.

Accessor (Getter):

Returns the value of a field.

Mutator (Setter):

Sets the value of a field.

toString Method:

Returns a string representation.

State of an Object:

Current values of its fields.

Information Hiding & Encapsulation:

Use private fields and public methods.

Practice Problems
Escape Sequence Output
```
java
public static void printMessage() {
    System.out.println("\"hello\" \\\\ almost /done with the Fall 2020//\" semester\"\"");
}
Pattern Printing with print and \n
java
public static void printPattern() {
    System.out.print("////////\\\\\\\\\\\\\\\\\n\n");
    System.out.print("     ////////\\/\\\\\\\\\\\\\\\\\n");
}
Sum of Even Numbers
java
public static int sum(int min, int max) {
    int total = 0;
    for (int i = min; i <= max; i++) {
        if (i % 2 == 0) total += i;
    }
    return total;
}
Tuition Increase Program
java
Scanner sc = new Scanner(System.in);
System.out.print("Enter the current tuition per semester: ");
double tuition = sc.nextDouble();
System.out.print("Enter the percent of tuition raise: ");
double percent = sc.nextDouble();
System.out.print("Enter the number of the years you will be at school: ");
int years = sc.nextInt();

double yearlyTuition = tuition * 2;
double total = 0;
for (int i = 1; i <= years; i++) {
    System.out.println("year " + i + " tuition " + yearlyTuition);
    total += yearlyTuition;
    yearlyTuition += yearlyTuition * (percent / 100);
}
System.out.println("Total tuition paid for all " + years + " years is " + total);
For Loop Equivalent to While Loop
java
for (int y = 10; y > 0; y--) {
    System.out.println(y - 1);
}
Largest Value Printed
java
int num = 1;
while (num < 20) {
    System.out.println(num / 2);
    num += 3;
}
// Largest value printed: 6 (when num = 19, 19/2 = 9)
Weather Checker
java
Scanner sc = new Scanner(System.in);
System.out.print("Enter the temperature: ");
int temp = sc.nextInt();
if (temp <= 40) System.out.println("too cold");
else if (temp < 60) System.out.println("cold");
else if (temp < 75) System.out.println("warm");
else System.out.println("hot");
Sum Series with While Loop
java
int i = 1;
double sum = 0;
while (i < 100) {
    sum += (double) i / (i + 1);
    i++;
}
Numbers Divisible by 3 (While Loop)
java
int i = 20;
while (i <= 50) {
    if (i % 3 == 0) System.out.println(i);
    i++;
}
Declare and Initialize Arrays
java
int[] arr = new int[10];
double[] dArr = new double[10];
String[] sArr = new String[10];
boolean[] bArr = new boolean[10];
char[] cArr = new char[10];

// Random initialization
Random rand = new Random();
for (int i = 0; i < arr.length; i++) {
    arr[i] = rand.nextInt(101) + 200; // 200-300
}
Circle Class Example
java
public class Circle {
    private double radius;
    public Circle(double r) { radius = r; }
    public double getRadius() { return radius; }
    public void setRadius(double r) { radius = r; }
    public double area() { return Math.PI * radius * radius; }
    public double circumference() { return 2 * Math.PI * radius; }
    public String toString() { return "Circle[radius=" + radius + "]"; }
}

// Driver
Circle c1 = new Circle(5.0);
Circle c2 = new Circle(10.0);
System.out.println(c1.area());
System.out.println(c1.circumference());
System.out.println(c1.toString());
Car Class Example
java
public class Car {
    private String make;
    private String model;
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }
    public String getMake() { return make; }
    public String getModel() { return model; }
    public void setMake(String make) { this.make = make; }
    public void setModel(String model) { this.model = model; }
    public String toString() { return make + " " + model; }
}

// Example usage
Car c1 = new Car("Toyota", "Camry");
System.out.println(c1.toString());
```

Additional Practice
Use online platforms like w3resource for more Java exercises and solutions.

Review self-check and practice problems from your textbook.

Good luck! Practice each concept, write code by hand, and review your assignments and quizzes for the best preparation.

