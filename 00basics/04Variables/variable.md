## Variables in Java  

Name of memory location which can hold the data.  

**Conventions for name of variable :**  

  * Variable name must start with alphabets or underscore or $, but can't start with digits.  
  * Keywords are not allowed as a variable name.  
  Example : int x; ( allowed )
            int float; ( not allowed )
            int float1; ( allowed )  
  * Space are not allowed in variable name.  
  Example : int a b; ( not allowed )  
            int a, b; ( allowed )  
            int a_b; ( not allowed )  

Types of variables  :  

  * According to data types, ther are 2 types of variables :  
    * Primitive Variable ( using Primitive Data Types)  
    * Reference Variable ( using Reference Data Types)  
  * According to users requirements, users can define variables in 3 categories :  
    * Local Variable  
    * Static Variable  
    * Instance Variable  

### Local Variables  

A variable defined inside methods, constructors, loops, blocks, conditional statements, etc is called **local variables**.  
**The memory for local variable is allocated at the time of execution of methods, constructors, etc in STACK AREA of JVM and deallocated after execution of methods, constructors, etc.**

For example :  
```java
class Local{
    public static void main(){
        int x; //local variable
        .....  //rest of the code  
    }
}
```  
Local variables must be initialised before accessing it, otherwise we will get **Compile Time Error** because JVM doesn't provide any kind of default value to local variable in java.  
For example :  
```java
class Local{
    public static void main(){
        int x;
        System.out.println(x); //error use int x = 10;
    }
} 
```