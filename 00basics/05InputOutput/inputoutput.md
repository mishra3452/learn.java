## Input Output in Java  

Java input and output is an essential concept while working on Java programming. It consists of elements such as input, output and stream.  The input is the data that we give to the program. The output is the data what we receive from the program in the form of result.  Stream represents flow of data or the sequence of data. To give input we use the input stream and to give output we use the output stream.  

### How input is read from the Keyboard?  

The **“System.in”** represents the keyboard. To read data from keyboard it should be connected to **“InputStreamReader”**. From the “InputStreamReader” it reads data from the keyboard and sends the data to the **“BufferedReader”**. From the “BufferedReader” it reads data from InputStreamReader and stores data in buffer. It has got methods so that data can be easily accessed.  

### Reading Input from Console  

Input can be given either from file or keyword. Input can be read from console in 3 ways:  

  * BufferedReader
  * StringTokenizer
  * Scanner

### BufferedReader  

Here, we use the class “BufferedReader” and create the object **“bufferedreader”**. We also take integer value and fetch string from the user.  

```java
BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));  
Int age = bufferedreader.read();  
String name = bufferedreader.readLine();  
```  

### String Tokenizer  

It can be used to accept multiple inputs from console in a single line where as BufferedReader accepts only one input from a line. It uses delimiter (space, comma) to make the input into tokens.

The syntax is as follows:  

```java
BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));  
String input = bufferedreader.readline();  
StringTokenizer tokenizer = new StringTokenizer(input, “,”);  
String name = tokenizer.nextToken();  
Int age=tokenizer.nextToken();  
```

### Scanners  

It accepts multiple inputs from file or keyboard and divides into tokens. It has methods to different types of input (int, float, string, long, double, byte) where tokenizer does not have.  

The syntax is denoted below :  

```java  
Scanner scanner = new Scanner(System.in);
Int rollno = scanner.nextInt();
String name =  scanner.next();
```  

### Writing output to console             

The output can be written to console in 2 ways:  
  * The First method is called print (String)  
  ```java
  System.out.print(“hello”);  
  ```  
  * The Second method is write(int)  
  ```java
  Int input=’i’;  
  System.out.write(input);  
  System.out.write(‘/n’);  
  ```