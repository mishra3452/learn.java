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