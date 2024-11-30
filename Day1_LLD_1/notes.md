# Pillars of Object-Oriented Programming (OOP)

Object-oriented programming is designed to provide modularity, reusability, and flexibility in software development. Here are the core pillars:

## 1. Encapsulation
- **Definition**: Encapsulation is the practice of bundling the data (attributes) and methods (functions) that operate on the data into a single unit known as a class.
- **Purpose**: It restricts direct access to some components of an object and can prevent the accidental modification of data.
- **Benefit**: Encourages modular code development, reduces complexity, enhances security by keeping sensitive data protected, and enhances flexibility.
## 2. Abstraction
- **Definition**: Abstraction involves hiding complex implementation details and showing only the essential features of an object.
- **Purpose**: Simplifies the representation of an object by reducing the complexity of systems.
- **Benefit**: Increases ease of understanding and improves maintenance by separating an abstract attribute from its implementation.

## 3. Inheritance
- **Definition**: Inheritance allows a new class to inherit properties and behaviors (methods) from an existing class.
- **Purpose**: Facilitates code reusability and the creation of a hierarchical relationship between classes.
- **Benefit**: Reduces redundancy, enhances the code structure, and enables modifications with minimal code changes.

## 4. Polymorphism
- **Definition**: Polymorphism enables objects to be treated as instances of their parent class, allowing the same function to take different forms.
- **Purpose**: Provides flexibility in code as the same operation can perform differently based on the object it is operating on.
- **Benefit**: Simplifies programming by using a unified interface and enhances readability and manageability.

---

By synthesizing these pillars, developers can create robust, scalable, and efficient software designs.# Access Modifiers in Java

Java provides four main access modifiers to define the visibility of classes and their members:

## 1. Public
- **Keyword**: `public`
- **Access Level**: Highest level of access.
- **Visibility**: The class, method, or variable is accessible from any other class.
- **Use Case**: Typically used for classes and methods that need to be accessible from any other class in different packages.

## 2. Protected
- **Keyword**: `protected`
- **Access Level**: Limited to the package and subclasses.
- **Visibility**: Accessible within its own package and by subclasses (even if they are in another package).
- **Use Case**: Useful when you want to allow an element to be inherited but not accessible to the world.

## 3. Default (Package-Private)
- **Keyword**: No explicit keyword.
- **Access Level**: Package-level visibility.
- **Visibility**: Restricted to classes within the same package.
- **Use Case**: Applied when you want to restrict the visibility only to the package level but do not want it to be part of the package's API.

## 4. Private
- **Keyword**: `private`
- **Access Level**: Restricted to the defining class.
- **Visibility**: Only accessible within the class it is declared.
- **Use Case**: Best used for hiding sensitive data and internal implementation details within a class.

---

## Summary
- **Public**: Widest access, can be accessed from anywhere.
- **Protected**: Accessible within the same package or subclasses.
- **Default**: Accessible only within the same package.
- **Private**: Most restricted access, only within the class itself.

In practice, these access modifiers are crucial in achieving encapsulation and controlling the architecture of Java applications.

# Java Constructor Notes

Constructors in Java are special methods used to initialize objects. Understanding constructors is crucial for designing effective classes.

## Key Characteristics of Constructors

1. **Name**
    - The constructor name must match the class name.

2. **No Return Type**
    - Constructors do not have a return type, not even `void`.

3. **Automatically Called**
    - A constructor is called automatically when a new object is created using the `new` keyword.

4. **Overloading**
    - Constructors can be overloaded, meaning you can create multiple constructors with different parameter lists.

5. **Default Constructor**
    - If no constructors are explicitly defined, Java provides a no-argument default constructor.

## Types of Constructors

1. **Default Constructor**
    - No parameters.
    - Initializes object with default values.

   ```java
   public class Example {
       public Example() {
           // Initialization code
       }
   }
   ```

2. **Parameterized Constructor**
    - Accepts parameters to initialize the object with specific values.

   ```java
   public class Example {
       private String name;

       public Example(String name) {
           this.name = name;
       }
   }
   ```

## Best Practices

- **Initialization**: Use constructors to set up an object for use immediately after it's created.
- **Clarity**: Keep constructors simple; avoid long and complex logic.
- **Overloading**: When overloading, ensure each constructor offers clear and distinct functionality.

## Common Uses

- Setting up initial state and input validation.
- Allocating resources or establishing connections as required at object creation.

By understanding and applying these concepts, you can utilize constructors effectively to create robust and flexible Java classes.