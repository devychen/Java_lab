
**Chapt 1. Intro** <br>
- Two types of memory: Auxiliary & Main memory.<br>
- A compiler can be used to transform a high level program into machine code. <br>
- The name of a java program file must contain the name of the class with the extension `.java`. Not arbitrarily. <br>
- The java virtual machine interprets bytecode / provides an abstraction layer between your code and the actual hardware. <br>
- Bug - an error in a program.  
- Debugging - eliminating errors.  
- Types of errors: Runtime/Syntax/Logic error.

**Chapt 2. Computation** <br>
- A variable is a named memory location to store data.
- Declare varriables: type varName;
- Valid data types: Primitive [boolean, numeric(byte, int, short, long, float, double), char], Reference (class, interface, array).
- An unitialised variable is null.
- Identifiers (a name): no startdigit/dots/spaces/*/$, yes letters/digits/_.
- Escape chars: \",\',\\,\n(newline),\r(returntolinehead),\t(tab)
- Naming conventions: ClassTypesStartUpr. MultiWordNamesPunctuatedUpr. varNameStartLwr. methodsStartLwr. Case sensitive
- Operator mod(%): remainder. 14%4 is 2.
- division(/), result truncated not rounded. 99/100 is 0. 12/5 is 2.
- a+=b is a=a+b.
- Scanner: read keyboard input.

**Chapt 3. Branching** <br>
- using == for doubles? F
- what is the value of the following boolean expression: boolean x=true, y=false, z=true; (( x&& y) || (x&&z)) - true; ((y&&z)||!x) - false.
- Logical operators: ||, &&, !.
- Comparison operators: <, >, <=, >=, ==, !=.
- To test two strings we use method equal().
- The result of a boolean exp.:True or False.
- is it appropriate to use the compariosn operator == with objects? F
- How can we terminate a progam: System.exit().
- What does the following code print: You worked 3 hours.
`int hours = 3` <br>
`System.out.print("You worked " + hours + ((hours > 1) ? " hours" : " hour"));`


**Chapt 4. Loop** <br>
- Explain the use of a `break` statement in loops: Ends only the innermost loop or switch statement that contains the break statement.
- 4 phrases of a `for` loop: initialisation, condition, body, update.
- Loop statements incl.: for, do while, while.
- Common loop bugs: Off-by-one errors (guard against by boundary checking codes), testing equality of floating-point numbers.
- Sentinel value: The sentinel must be different from all the other possible items. Value used to signal the end of some items. Java does not detect them, up tp programmers to define and handle.
- True for `do while`: In the do-while loop, the body of a loop is always executed at least once. It is an exit controlled loop. Termination condition specified?
- The continue statement in loops: it ends current loop iteration, begins the next one. It jumps to the control condition of the loop.
- We CAN rewrite a for loop as a while loop.
- True for `for while`: The condition is checked before executing the body of the loop. After the body of a loop is executed then control again goes back to the condition. Entry controlled?
- Statements creating an endless loop: Do not specify a terminating condition. Make sure the terminating condition is never met.

**Chapt 5. Methods** <br>
- `public`: Generally the access modifier for classes.
- `private`:... for instance variables.
- `void`: to name a method that does not return anything.
- scope: to call the range of a program in which a var is valid.
- We CAN declare variables with the same name in differen methods.
- Instance variable: a var defined in a class. CAN Access with accessor and mutator methods, not directly.
- Local variable: A var holding a value, a var declared and valid inside a method.
- Object/Instance: An instantiation of a class.
- `main` method: A method which can be serves the Java runtime system as an entry point.

**JUnit** <br>
- `assertEqual**s**`: test if values are equal.
- Mark every JUnit test: `@Test`.

**Chapt 6. Methods** <br>
- `Wrapper class`: an object that corresponds to value of primitive type.
- Constructor: a special method which is called when an isntance of an object is created.
- We CAN have >= 1 constructor.
- Default constructor for a class: public Game().
- Declare multiple constructors: Each constructor needs different numbers or types of parameters.
- `this()`: to call another constructor from a constructor.
- Overloading: when >= 2 mothods have the same name within the same class.
- `static`: a method which can be invoked without using an object (instead use the class name).
- Static methods ARE allowed to access instance variables.
- Not allowed to define two methods with the same name whose only difference is the type of value returned.

**Chapt 7. Arrays** <br>
- Array index starts at 0.
- Assign a value x to the n element in an `int` array `myArray`: `myArray[n-1] = x;`.
- Largest possible index of myArray is 4 for `int[] myArray = new int[5]`.
- Which public IV has arrays? length.
- Get the number of elements in an array: `.length`.
- `==` compares the addresses of two arrays.
- Remove an element from an array: create a new array 1 smaller than old - Copy before index from old array to new array - Copy elements after index to new array (at index - 1) - Make old array reference the new array.
- ragged: an array where not all rows are of the same length.
- Nested loop: Outer loop iterates the rows. Inner loop iterates columns in current row.
- Levenshtein Algorithm: measures the distance of two strings.
- Its steps: 1: Create a table one element longer than s1 and one element wider than s2 - Initialize column 0, initialize row 0 - Fill rest of the table by going through all cells, filling them with formula min(left + insert, above + delete, aboveLeft + substitution).

**Chapt 8. Inheritance** <br>
- `extends`: defines a derived class.
- Private methods, constructors in a parent class are NOT inherited by a subclass.
- We CAN derive a class of a derived class.
- Default constructor: a constructor without a parameter. If not provided by the programmer, Java will create one.
- Method `this()` when called in a constructor will invoke another/default constructor within the same class.
- Overriding: when a method in a subclass overrides a methods with same signature from base class.
- To call an overriden method _aMethod()_: `super.aMethod();`
- Interface: a program component that contains headings for a number of public methods but no code.
- Implements: defines an interface.

**Chapt 9. Exception** <br>
- `throw`: signals an exception, creates an exception object.
- `throws`: signlas an error condition. Declare an exception for that method.
- Exception do: signals the occurrence of unusual event during program execution.
- Exception handler: Code that detects and deals with the exception and the error condition which caused the problem.
- A user-defined exception class must be derived from a class that itself is derived from the `Exception` class.
- `try` block do: Contains code where something could possibly go wrong. If go wrong, it throws an exception.
- 'catch' block truths: Similar to a method it has a parameter. When exception thrown, it begins execution.
- Unchecked exception: an exception which need not to be caught.
- Checked exception: an exception which must be caught in catch block or declared in throws clause.
- Finally blocks truths: Code is executed  whether or not execution thrown. Code is executed whether or not required catch exists.

**Chapt 10. I/O** <br>
- Stream: a flow of input/output data
- Input streams: FileReader, BufferedReader.
- Output streams: PrintWriter, BufferedWriter.
- Creating a PrintWriter using `new PrintWriter(fileName)` and specifying an existing file results in overwriting the existing file.
- How-to write text to file: `PrintWriter outStream;` - `outStream = new PrintWriter("out.txt");` - `outStream.println("Umu");` - `outStream.close();`.
- How-to read text from file: `BufferedReader reader = new BufferedReader(new FileReader("umu.txt"));` - `while ((st = reader.readLine()) != null);` - `System.out.println(st);` - `reader.close();`.
- BufferedWriter can be used to improve performance when writing to a text file.
- `Try with resources` can be used to automatically close all resources used in an IO operation.


**`String` methods** <br>
- `charAt(Index)` the char at the index
- `compareTo(A_String)`compare two strings lexicographic order. Neg if first, 0 if equal, pos if later.
- `concat(A_String)`
- `equals()`, `equalsIgnoreCase()`
- `indexOf(A_String)`
- `lastIndexOf(A_String)`
- `length()`
- `toLowerCase()`, `toUpperCase()`
- `replace(OldChar, NewChar)``substring(Start)`, `substring(Start, End)`
- `trim()`

**`Math` methods** <br>
- `max`, `min`
- `round`
- `ceil`, `floor`
- `sqr`

**`Scanner` methods** (boolean) <br>
- `hasNext()`
- `hasNextDouble()`, `hasNextInt()`, `hasNextLine()`

**`Object` Class**
- toString()
