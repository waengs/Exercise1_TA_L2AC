# Four OOP Principles (Inheritance, Encapsulation, Polymorphism and Abstraction)

This Java project demonstrates the concepts of Inheritance, Encapsulation, and Polymorphism using the `Animal` and `Lion` classes.

## Animal Class (Encapsulation)
The `Animal` class encapsulates the following properties and methods:
- `name`: A private field representing the name of the animal.
- `greeting()`: A public method that prints a greeting message indicating an animal is incoming.
- `animalSound()`: A public method that prints a message that the animal makes a sound.
- `getName()`: A public method that returns the name of the animal.
- `setName(String newName)`: A public method that sets the name of the animal.

### Encapsulation
- The `name` field is declared as private to encapsulate it, meaning it can only be accessed and modified through the public getter and setter methods (`getName()` and `setName()`). This protects the `name` field from direct external access and allows controlled modification.

## Lion Class (Inheritance and Polymorphism)
The `Lion` class is a subclass of `Animal`, inheriting its properties and methods. It also demonstrates polymorphism by overriding the `animalSound()` method.

### Inheritance
- The `Lion` class extends the `Animal` class, inheriting the `greeting()` and `animalSound()` methods.
- This allows `Lion` objects to have access to the behavior defined in the `Animal` class, such as `greeting()`.

### Polymorphism
- The `Lion` class overrides the `animalSound()` method from the `Animal` class to provide a specific sound for a lion.
- When `animalSound()` is called on a `Lion` object, it executes the overridden method in the `Lion` class, demonstrating polymorphism.

### Usage
In the `Main` class, an instance of `Lion` is created and its methods are called:
1. `greeting()`: Prints "Animal Incoming!" inherited from `Animal`.
2. `animalSound()`: Prints "The Lion ROARS" specific to `Lion`.
3. `setName("David")`: Sets the name of the `Lion` object.

### How to Run:
1. Clone the Repository
2. Compile the Java Files: (`Animal.java`, `Lion.java`, `Main.java`)
3. Run the `Main` class

### Output
The output of the `Main` class will be:  
Animal Incoming!  
The Lion ROARS  
Its name is David  
