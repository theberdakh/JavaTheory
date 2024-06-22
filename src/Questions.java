public class Questions {

    String[] questions = {
            "What is JVM?",
            "What is JIT?",
            "What are Memory storages available with JVM?",
            "What is a classloader?",
            "Difference between JVM, JRE, and JDK.",
            "Explain public static void main(String args[]) in Java.",
            "What is Java String Pool?",
            "What will happen if we declare don't declare the main as static?",
            "What are Packages in Java?",
            "Why Packages are used?",
            "What are the advantages of Packages in Java?",
            "How many types of packages are there in Java?",
            "Explain different data types in Java.",
            "When a byte datatype is used?",
            "Can we declare Pointer in Java?",
            "What is the default value of byte datatype in Java?",
            "What is the Wrapper class in Java?",
            "Why do we need wrapper classes?",
            "Differentiate between instance and local variables.",
            "What are the default values assigned to variables and instances in Java?",
            "What is a Class Variable?",
            "What is the default value stored in Local Variables?",
            "Explain the difference between instance variable and a class variable.",
            "What is a static variable?",
            "What is the difference between System.out, System.err, and System.in?",
            "What do you understand by an IO stream?",
            "What is the difference between the Reader/Writer class hierarchy and the InputStream/OutputStream class hierarchy?",
            "What are the super most classes for all the streams?",
            "What are the FileInputStream and FileOutputStream?",
            "What is the purpose of using BufferedInputStream and BufferedOutputStream classes?",
            "What are FilterStreams?",
            "What is an I/O filter?",
            "How many ways you can take input from the console?",
            "Difference in the use of print, println, and printf.",
            "What are operators? ",
            "How many types of operators are available in Java?",
            "Explain the difference between >> and >>> operators.",
            "Which Java operator is right associative?",
            "What is dot operator?",
            "What is covariant return type?",
            "What is the transient keyword?",
            "What's the difference between the methods sleep() and wait()?",
            "What are the differences between String and StringBuffer?",
            "What are the differences between StringBuffer and StringBuilder?",
            "Which among String or String Buffer should be preferred when there are a lot of updates required to be done in the data?",
            "Why is StringBuffer called mutable?",
            "How is the creation of a String using new() different from that of a literal?",
            "What is an array in Java?",
            "On which memory arrays are created in Java?",
            "What are the types of an array?",
            "Why does the Java array index start with 0?",
            "What is the difference between int array[] and int[] array?",
            "How to copy an array in Java?",
            "What do you understand by the jagged array?",
            "Is it possible to make an array volatile?",
            "What are the advantages and disadvantages of an array?",
            "What is an object-oriented paradigm?",
            "What are the main concepts of OOPs in Java?",
            "What is the difference between an object-oriented programming language and an object-based programming language?",
            "How is the ‘new’ operator different from the ‘newInstance()’ operator in Java?",
            "What are Classes in Java? ",
            "What is the difference between static (class) method and instance method?",
            "What is this keyword in Java?",
            "What are Brief Access Specifiers and Types of Access Specifiers?",
            "What will be the initial value of an object reference which is defined as an instance variable?",
            "What is an object?",
            "What are the different ways to create objects in Java?",
            "What are the advantages and disadvantages of object cloning?",
            "What are the advantages of passing this into a method instead of the current class object itself?",
            "What is the constructor?",
            "What happens if you don't provide a constructor in a class?",
            "How many types of constructors are used in Java?",
            "What is the purpose of a default constructor?",
            "What do you understand by copy constructor in Java?",
            "Where and how can you use a private constructor?",
            "What are the differences between the constructors and methods?",
            "What is an Interface?",
            "Give some features of the Interface.",
            "What is a marker interface?",
            "What are the differences between abstract class and interface?",
            "What do you mean by data encapsulation?",
            "What are the advantages of Encapsulation in Java?",
            "What is the primary benefit of Encapsulation?",
            "What do you mean by aggregation?",
            "What is the ‘IS-A ‘ relationship in OOPs Java?",
            "Define Inheritance.",
            "What are the different types of inheritance in Java?",
            "What is multiple inheritance? Is it supported by Java?",
            "Is there any limitation to using Inheritance?",
            "Although inheritance is a popular OOPs concept, it is less advantageous than composition. Explain.",
            "What is an association?",
            "What do you mean by aggregation?",
            "What is the composition of Java?",
            "State the difference between Composition and Aggregation.",
            "Can the constructor be inherited?",
            "What is Polymorphism?",
            "What is runtime polymorphism or dynamic method dispatch?",
            "What is method overriding?",
            "What is method overloading?",
            "Can we override the static method?",
            "Can we override the overloaded method?",
            "Can we overload the main() method?",
            "What are method overloading and method overriding?",
            "Can we override the private methods?",
            "Can we change the scope of the overridden method in the subclass?",
            "Can we modify the throws clause of the superclass method while overriding it in the subclass?",
            "Can you have virtual functions in Java?",
            " What is Abstraction?",
            "What is Abstract class?",
            "When Abstract methods are used?",
            "How can you avoid serialization in the child class if the base class is implementing the Serializable interface?",
            "What is Collection Framework in Java?",
            "Explain various interfaces used in the Collection framework.",
            "How can you synchronize an ArrayList in Java?",
            "Why do we need a synchronized ArrayList when we have Vectors (which are synchronized) in Java?",
            "Why can’t we create a generic array?",
            "Contiguous memory locations are usually used for storing actual values in an array but not in ArrayList. Explain.",
            "Explain the method to convert ArrayList to Array and Array to ArrayList.",
            "How does the size of ArrayList grow dynamically? And also state how it is implemented internally.",
            "What is a Vector in Java?",
            "How to make Java ArrayList Read-Only?",
            "What is a priority queue in Java?",
            "Explain the LinkedList class.",
            "What is the Stack class in Java and what are the various methods provided by it?",
            "What is Set in the Java Collections framework and list down its various implementations?",
            "What is the HashSet class in Java and how does it store elements?",
            "What is LinkedHashSet in Java Collections Framework?",
            "What is a Map interface in Java?",
            "Explain Treemap in Java",
            "What is EnumSet?",
            "What is BlockingQueue?",
            "What is the ConcurrentHashMap in Java and do you implement it?",
            "Can you use any class as a Map key?",
            "What is an Iterator?",
            "What is an enumeration?",
            "What is the difference between Collection and Collections?",
            "Differentiate between Array and ArrayList in Java.",
            "What is the difference between Array and Collection in Java?",
            "Difference between ArrayList and LinkedList.",
            "Differentiate between ArrayList and Vector in Java.",
            "What is the difference between Iterator and ListIterator?",
            "Differentiate between HashMap and HashTable.",
            "What is the difference between Iterator and Enumeration?",
            "What is the difference between Comparable and Comparator?",
            "What is the difference between Set and Map?",
    };

    String[] intermediateQuestions = {
            "Explain the FailFast iterator and FailSafe iterator along with examples for each.",
            "What is Exception Handling?",
            "How many types of exceptions can occur in a Java program?",
            "Difference between an Error and an Exception.",
            "Explain the hierarchy of Java Exception classes.",
            "Explain Runtime Exceptions.",
            "What is NullPointerException?",
            "When is the ArrayStoreException thrown?",
            "What is the difference between Checked Exception and Unchecked Exception?",
            "What is the base class for Error and Exception?",
            "Is it necessary that each try block must be followed by a catch block?",
            "What is exception propagation?",
            "What will happen if you put System.exit(0) on the try or catch block? Will finally block execute?",
            "What do you understand by Object Cloning and how do you achieve it in Java?",
            "How do exceptions affect the program if it doesn't handle them?",
            "What is the use of the final keyword?",
            "What purpose do the keywords final, finally, and finalize fulfill?",
            "What is the difference between this() and super() in Java?",
            "What is multitasking?",
            "What do you mean by a Multithreaded program?",
            "What are the advantages of multithreading?",
            "What are the two ways in which Thread can be created?",
            "What is a thread?",
            "Differentiate between process and thread?",
            "Describe the life cycle of the thread?",
            "Explain suspend() method under the Thread class.",
            "Explain the main thread under Thread class execution.",
            "What is a daemon thread?",
            "What are the ways in which a thread can enter the waiting state?",
            "How does multi-threading take place on a computer with a single CPU?",

    };

    String[] expertQuestions = {
            "What are the different types of Thread Priorities in Java? And what is the default priority of a thread assigned by JVM?",
            "Why Garbage Collection is necessary in Java?",
            "What is the drawback of Garbage Collection?",
            "Explain the difference between a minor, major, and full garbage collection.",
            "How will you identify major and minor garbage collections in Java?",
            "What is a memory leak, and how does it affect garbage collection?",
            "Name some classes present in java.util.regex package.",
            "Write a regular expression to validate a password. A password must start with an alphabet and followed by alphanumeric characters; Its length must be in between 8 to 20.",
            "What is JDBC?",
            "What is JDBC Driver?",
            "What are the steps to connect to the database in Java?",
            "What are the JDBC API components?",
            "What is JDBC Connection interface?",
            "What does the JDBC ResultSet interface?",
            "What is the JDBC Rowset?",
            "What is the role of the JDBC DriverManager class?",
    };

    String[] differenceQuestions = {
            "Differentiate between Iterable and Iterator.",
            "Differentiate between List and Set.",
            " Differentiate between List and Map.",
            "Differentiate between Queue and Stack.",
            "Differentiate between PriorityQueue and TreeSet.",
            "Differentiate between the Singly Linked List and Doubly Linked List.",
            "Differentiate between Failfast and Failsafe.",
            "Differentiate between HashMap and TreeMap.",
            "Differentiate between Queue and Deque.",
            "Differentiate between HashSet and TreeSet.",

    };
}