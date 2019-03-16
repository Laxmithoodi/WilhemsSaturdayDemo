Wilhem’s 10am Lecture (Saturday)

- Setting up Classes
    - IntelliJ shortcuts : Command + N (creating Constructors, Getters, and Setters; overriding toString())
    - DO not instantiate instance variables OUTSIDE of a constructor (this instance is created even if the class is not in use & it also will result in the unintended modification of one instance variable when multiple objects are calling add/remove methods)
    - DO always supply a nullify constructor which initializes instance variables (even if the initial values don’t really make sense). This will help you avoid null pointers in your test cases.
    - Always make your instance variables private!!!

- Enums
    - Constructor is always private; this is called before anything else in your program runs. Do not reference any objects in your constructor that your program creates - they will not have been created yet when the enums are instantiated.
    - toString() is overridden by default to print the string value of the enum; you can override this further if you wish to use UTF-8 codes (which you can also supply by a simple copy/paste)

- Generics
    - Storage: make sure if you’re using a List as an instance variable that your nullary constructor initializes it to a concrete implementation of List. Otherwise you’ll get a null pointer.
    - Fridge: 
        - If your instance variables are Storage<Corn> and Storage<Tomato> & your methods are ridden with if/else statements - why did you bother using generics in the first place? 
        - It’s better to create ONE storage field of Edible and in your interface define a way to determine the kind of Edible it is (e.g. String getLabel() method)
        - Now if you want to get a SPECIFIC item from the fridge, you can add retrieve items from the fridge, checking what label they have, and (if it’s not what you want) storing them in a temporary list. After you’ve found your item, you can put the items back in the fridge. 
        - You do need to make sure you account for the situation where the fridge does not contain your item, though. Hence: if (retrievedItems.getLast() == null) { break; }
        - Another takeaway from this is that you don’t want your Storage class to be able to store Objects - you need to define bounds for these things. If the classes that you want to Store do not share a common interface, then create one (e.g. Storable). 
        - Interfaces do not have to have methods, either! They can be blank! Storable may have no other purpose than to allow you to put bounds on a generic class.

- Di
    - The random class does almost the same exact thing as Math.Random does but you have more options with Random. 
    - You can also supply the Random constructor with a ‘seed’ which will result in the same value being output each time you call Random.nextInt(). Just create a main and system.out random.nextInt(bounds: ) to see what that value is. 
    - Then create a second constructor in your Di class which takes in a Random and sets that random to its random.
    - Now, in your test cases, you can create your ‘loaded die’ to determine if roll() is functioning correctly.
