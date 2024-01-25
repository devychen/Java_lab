# JAVA Summary

**Concepts**: 
1. OOP, object, method, variable, class, data types, constant, package (a liberal of classes) <br>
2. Flow of control (the order program performs actions), branching statement(choose between ≥2 actions), loop statement(repeat action until stopping condition) <br>

**Data types**: Primitive & Class. <br>
Compatibility: `byte` -> `short` -> `int` -> `long` -> `float` -> `double` <br>

**Name convention**: type varNameStartLower, ClassNameUpper, UPPERCONSTANT <br>
Declaring constants: `public static final Type Name = Value` <br>

**Comments** `//` one line. `/* */` multiple lines. `/** */` javadoc. <br>

**Type Casting**: int varName = (int) varName <br>

**Keyboard Input** <br>
`import java.util.Scanner;` class Scanner is part of java.util pkg, import source file <br> 
`Scanner keyboard = new Scanner(System.in);` create an object of the Scanner class <br>
`int n1 = keyboard.nextIn();` read data (an int e.g) <br>
`keyboard.close()` Remember to close Scanner <br>

**Keyboard Output** <br>
`System.out.println("The count is" + count);` <br>
`System.out` is an object <br>
`println` next item start on a new line, `print` continue on same line. <br>

**Escape characters** <br>
`\"` double quote, `\'` single quote, `\\` backslash <br>
`\n` new line, `\r` carriage return, `\t`tab <br>

**Operators 运算符**: expression 表达式 <br>
1. Arithmetic expressions (+, -, !, ++, --; *, /, % mod), operands - 操作符 <br>
`amount = amount + 5;` equals `amount += 5;`, also have `-+`, `*=` <br>
Division operator `/` result is truncated, not rounded. <br>
Mod operator `%` to obtain remainder. <br>
Predence rules: unary `+` `-` `++` `--` `!` > binary `*` `/` `%`> binary `+` `-`
3. Increment operator `++`, decrement `--`: prior before var <br>
`int m =4;`, `int result = 3 * (++m);`, m = 5, result = 15. If `(m++)`, m = 5, result = 2; <br>
4. Boolean expressions
5. Comparison Operators: `==`, `!=` ≠, `>`, `>=`, `<`, `<=`. <br>
Don't use `==` for floating `double` or boolean or object (for string it compares location not content, use `equals` instead), only `int` and `char`. <br>
6. Logical Operators: `&&` and, `||` or, `!` not.
7. Compound Boolean Expression: combine B_E using logical operators. <br>
`if ((score > 0) && (score <= 100))` NOT `if (0 < score <= 100)` Parentheses for better readability <br>
`if ((quantity > 5) || (cost < 10))` <br> inclusive 'or', namely allows either or both true <br>
8. Negating B_E. Avoid Negation operator.
`(a || b) && !(a && b)` exclusive or, namely true only if one if true <br>
9. Conditional operator `?` `:`
```
if (n1 > n2)
  max = n1;
else
  max = n2 // legal without {} but recommended.
// could be written as:
max = (n1 > n2) ? n1 : n2;
// another example
System.out.println("You worked " + hours + ((hours > 1) ? "hours" : "hour"));
```

**Type Boolean**
The value of B_E is either true/false <br>
```
boolean isPositive = (number > 0);
...
if (isPositive) ...
```

**String methods**: <br>
`charAt(index)` returns the char at Index. Position (i.e.index) starts with 0 not 1, space incl. <br>
`compareTo(A_String)` returns negative int if lexicographically* first, zero if equal, positive if A_String first. <br>
```
if (s1.compareTo(s2) < 0) // s1 < s2
if (s1.compareTo(s2) == 0) // equal
if (s1.compareTo(s2) > 0) // s1 > s2, namely comes lexicographically after s2
```
`concat(A_String)`returns a new string concatenated. <br>
`equals(Other_String)` returns if strings are equal, false otherwise. <br>
`equalsIgnoreCase(Other_String)` similar. <br>
`indexOf(Sub_String)` returns the index of the first occurence of substring. -1 if A is not found. <br>
`lastIndexOf(Sub_String)` returns ... last occurence. <br>
`length()` returns the length. <br>
`toLowerCase()` returns in lowercase. <br>
`toUpperCase()` ... in uppercase. <br>
`replace(OldChar, NewChar)` returns with each occurence of OldChar replaced by NewChar. <br>
`substring(Start)` returns substring begins at index Start to the end. <br>
`substring(Start, End)` returns from index Start to End. <br>
`trim()` returns with leading and trailing whitespace removed. <br>

**Scanner Methods `next`**: reads all the chars up to the next whitespace <br>
nextX for each primitives: `nextInt`, `nextBoolean`, `nextDouble` <br>
`nextLine()` reads remainder of current line even empty. <br>

**Statement `if else`**
1. Syntax
```
if (Boolena_Expression) {
// do this if B_E is true;
} else {
// do this if false;
}
```
!else part could be omiited sometimes <br>
2. Nested `if else`
```
if (Boolean_Expression_1) {
  if (Boolean_Expression_2) {
    Statement(s)
  } else {
    Statement(s)
  }
} else {
  if (Boolean_Expression_3) {
    Statement(s)
  } else {  // each `else` paried with nearest `if`
    Statement(s);
  }
}
```
3. Multi branch `if else`
```
if (B_E_1) {
  Statement(s)
} else if (B_E_2) {
  Statement(s)
} else if (B_E_3) {
  Statement(s)
} else if ...
} else (
  Default_Statement(s)
)
```

**Statement `switch`**


**Method `exit`**
`System.exit(0)` Terminate program.
```
if (numberOfWinners == 0) {
  System.out.println ("Error: Dividing by zero.");
  System.exit (0);
  } else {
  oneShare = payoff / numberOfWinners;
  System.out.println("Each winner will receive $"
                    + oneShare);
}
```


* lexicographic order: alphabetical order based on Unicode char set.
