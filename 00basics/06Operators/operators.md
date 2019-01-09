## Opearators in Java  

Java provides many types of operators which can be used according to the need. They are classified based on the functionality they provide. Some of the types are :  

  * Increment / Decrement Operator  
  * Arithmetic Operator  
  * Concatenation Operator  
  * Relational Operator  
  * Equality Operator  
  * Bit Wise Operator  
  * Shift Operator  
  * Assingment Operator  
  * Instance of Operator  
  * Type caste Operator  
  * Conditional Operator  
  * new Operator  

Note : IN JAVA THERE IS **NO OPERATOR OVERLOADING** EXCEPT "+" OPERATOR  

### 1. Inc/Dec Operator  

  * We can apply this only on the variables and not on the constant values.  
  * We can't apply this on final variable.  
  * Can apply this on every primitive data type except boolean.  
  * Nested of inc/dec operator is not allowed.  
  Example : ++i++ is not allowed  

```java
public class operators  
{ 
    public static void main(String[] args)  
    { 
        int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30; 
        boolean condition = true; 
  
        // pre-increment operator 
        // a = a+1 and then c = a; 
        c = ++a; 
        System.out.println("Value of c (++a) = " + c); 
  
        // post increment operator 
        // c=b then b=b+1 
        c = b++; 
        System.out.println("Value of c (b++) = " + c); 
  
        // pre-decrement operator 
        // d=d-1 then c=d 
        c = --d; 
        System.out.println("Value of c (--d) = " + c); 
  
        // post-decrement operator 
        // c=e then e=e-1 
        c = --e; 
        System.out.println("Value of c (--e) = " + c); 
  
    } 
}
```
Output :  
Value of c (++a) = 21  
Value of c (b++) = 10  
Value of c (--d) = 19  
Value of c (--e) = 39  

### 2. Arithmetic Operator  

  * "x" : Multiplication  
  * "/" : Division  
  * "%" : Modulo  
  * "+" : Addition  
  * "–" : Subtraction  
  
```java
// arithmetic operators 
public class operators  
{ 
    public static void main(String[] args)  
    { 
        int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30; 
        String x = "Thank", y = "You"; 
  
        // + and - operator 
        System.out.println("a + b = "+(a + b)); 
        System.out.println("a - b = "+(a - b)); 
  
        // + operator if used with strings 
        // concatenates the given strings. 
        System.out.println("x + y = "+x + y); 
  
        // * and / operator 
        System.out.println("a * b = "+(a * b)); 
        System.out.println("a / b = "+(a / b)); 
  
        // modulo operator gives remainder 
        // on dividing first operand with second 
        System.out.println("a % b = "+(a % b)); 
  
        // if denominator is 0 in division 
        // then Arithmetic exception is thrown. 
        // uncommenting below line would throw 
        // an exception 
        // System.out.println(a/c); 
    } 
} 
```  

Output:  

a+b = 30  
a-b = 10  
x+y = ThankYou  
a*b = 200  
a/b = 2  
a%b = 0  

### 3. Equality Operator  

==(equals to) and !=(not equals to)  

Can be applied on every primitive data types also in boolean and objects. Return true if condition holds equality otherwise false.  

### 4. Bitwise Operators  

These operators are used to perform manipulation of individual bits of a number. They can be used with any of the integer types. They are used when performing update and query operations of Binary indexed tree.  
  * & , Bitwise AND operator: returns bit by bit AND of input values.
  * | , Bitwise OR operator: returns bit by bit OR of input values.
  * ^ , Bitwise XOR operator: returns bit by bit XOR of input values.
  * ~ , Bitwise Complement Operator: This is a unary operator which returns the one’s compliment representation of the input value, i.e. with all bits inversed.

```java
// Java program to illustrate 
// bitwise operators 
public class operators  
{ 
    public static void main(String[] args)  
    { 
        //if int a = 010 java considers it as octal value of 8 as number starts with 0. 
        int a = 0x0005; 
        int b = 0x0007; 
  
        // bitwise and 
        // 0101 & 0111=0101 
        System.out.println("a&b = " + (a & b)); 
  
        // bitwise and 
        // 0101 | 0111=0111 
        System.out.println("a|b = " + (a | b)); 
  
        // bitwise xor 
        // 0101 ^ 0111=0010 
        System.out.println("a^b = " + (a ^ b)); 
  
        // bitwise and 
        // ~0101=1010 
        System.out.println("~a = " + ~a); 
  
        // can also be combined with 
        // assignment operator to provide shorthand 
        // assignment 
        // a=a&b 
        a &= b; 
        System.out.println("a= " + a); 
    } 
} 
```  

Output :

a&b = 5  
a|b = 7  
a^b = 2  
~a = -6  
a= 5  

### 5. Shift Operator  

These operators are used to shift the bits of a number left or right thereby multiplying or dividing the number by two respectively. They can be used when we have to multiply or divide a number by two. General format :  
```java  
number shift_op number_of_places_to_shift;
```  
  * "<<" , Left shift operator: shifts the bits of the number to the left and fills 0 on voids left as a result. Similar effect as of multiplying the number with some power of two.
  * ">>" , Signed Right shift operator: shifts the bits of the number to the right and fills 0 on voids left as a result. The leftmost bit depends on the sign of initial number. Similar effect as of dividing the number with some power of two.
  * ">>>" , Unsigned Right shift operator: shifts the bits of the number to the right and fills 0 on voids left as a result. The leftmost bit is set to 0.  
```java  
// Java program to illustrate 
// shift operators 
public class operators  
{ 
    public static void main(String[] args)  
    { 
  
        int a = 0x0005; 
        int b = -10; 
  
        // left shift operator 
        // 0000 0101<<2 =0001 0100(20) 
        // similar to 5*(2^2) 
        System.out.println("a<<2 = " + (a << 2)); 
  
        // right shift operator 
        // 0000 0101 >> 2 =0000 0001(1) 
        // similar to 5/(2^2) 
        System.out.println("a>>2 = " + (a >> 2)); 
          
        // unsigned right shift operator 
        System.out.println("b>>>2 = "+ (b >>> 2)); 
  
    } 
} 
```  
Output :

a2 = 1  
b>>>2 = 1073741821  

### 6. Logical Operator  

These operators are used to perform “logical AND” and “logical OR” operation, i.e. the function similar to AND gate and OR gate in digital electronics. One thing to keep in mind is the second condition is not evaluated if the first one is false, i.e. it has short-circuiting effect. Used extensively to test for several conditions for making a decision.  
Conditional operators are :  

  * && , Logical AND : returns true when both conditions are true.  
  * || , Logical OR : returns true if at least one condition is true.  

```java
// Java program to illustrate 
// logical operators 
public class operators  
{ 
    public static void main(String[] args)  
    { 
        String x = "Sher"; 
        String y = "Locked"; 
  
        Scanner s = new Scanner(System.in); 
        System.out.print("Enter username:"); 
        String uuid = s.next(); 
        System.out.print("Enter password:"); 
        String upwd = s.next(); 
  
        // Check if user-name and password match or not. 
        if ((uuid.equals(x) && upwd.equals(y)) ||  
                (uuid.equals(y) && upwd.equals(x))) { 
            System.out.println("Welcome user."); 
        } else { 
            System.out.println("Wrong uid or password"); 
        } 
  
    } 
} 
```  

Output :

Enter username:Sher  
Enter password:Locked  
Welcome user.  
