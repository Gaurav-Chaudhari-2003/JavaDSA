package android.oop4_Challenge;

public class temp {
}

/*
Sure, here's a real-world problem that incorporates the concepts of Object-Oriented Programming (OOP) in Java:

**Problem Statement:**

Imagine you're designing a system for a library. This system needs to keep track of all the books in the library. Each book has a title, author, publication year, and a unique ISBN number. There are different types of books like fiction, non-fiction, and reference books. Each type of book has some specific attributes and behaviors. For example, fiction books can be categorized into various genres (like mystery, fantasy, romance, etc.), non-fiction books have a subject area (like history, science, biography, etc.), and reference books are not for circulation.

Your task is to design classes and objects with appropriate attributes and behaviors for this scenario. Make sure to use the following OOP concepts:

1. **Inheritance**: Create a base class `Book` and derive `Fiction`, `NonFiction`, and `Reference` from it.
2. **Polymorphism**: Implement a method `displayDetails()` in the `Book` class and override it in each derived class to display details specific to the book type.
3. **Encapsulation**: Use private attributes and provide public getter and setter methods to access and modify these attributes.
4. **Null**: Consider the case where certain attributes may not be applicable to a book and handle it.
5. **Super**: Use the `super` keyword to call the constructor of the base class from the derived class.
6. **This**: Use the `this` keyword to refer to the current object within an instance method or a constructor.
7. **Constructors**: Use constructors to initialize the objects of your classes.
8. **Access Specifiers**: Use access specifiers (`public`, `private`, `protected`) appropriately to restrict the scope of your classes, methods, and attributes.

Here's a basic structure to get you started:

```java
public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private String isbn;

    // constructor, getters, setters
}

public class Fiction extends Book {
    private String genre;

    // constructor, getters, setters, displayDetails()
}

public class NonFiction extends Book {
    private String subjectArea;

    // constructor, getters, setters, displayDetails()
}

public class Reference extends Book {
    // constructor, getters, setters, displayDetails()
}
```

Please note that the implementation of this problem will depend on the specific requirements of your library system. If you need help with the implementation, feel free to ask! 😊
 */
