# CleanCodes
My clean and TDD based Implementations of Random programs for the sake of practicing

# Episode #1 (Clean Code)

1988 - Sword Inc.

1990 - from c to C++ , sword no support to C++  after 6 months , 44 minutes to up and running and crashed after one year it  had the same issues. 

sword inc. closed...one of them in conference..first to market  

## The productivity Trap

start fast then slow, because there was a mess in the code.

the **scary gap**, hire more programmers ..double the staff double the speed

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/a8fba8bc-d3d8-4478-8dcb-0459f4d50675/Untitled.png)

 

## The big redesign in the sky

 

- You were hired because you know
- Requirements is hidden in the old code, so the tiger team looks in the old code to know the requirements
- Zeno's paradox, old team changes the system that the tiger team trying to learn to get the requirements
- 10 years of redesign race!!
    - you cann't deal with a mess by running from it, the only way to effectively  deal with that  mess is to turn around the face it and find the rot and clean it
    

## Code Rot

 

## Rigidity

- resist change
- small change → changes in multiple places
- "It was more complicated than I thought"
- Rigid systems blow estimates

 

## Fragility

- malfunction in many unpredictable ways when simple changes are made.
- changes in one part → problems in other parts that aren't related
- Wildly unpredictable

## Inseparability

- parts can't be separated, can't be independently used in other systems
- Car and trailer in it
- inseparable systems are unpredictable, you never know if you can use the components in the system and so the changes can't be reliably estimated

## Opacity

- no amount of effort  can be applied to define the author original intent
- if you read code, you won't understand anything
- Opique code. hard to read, hard to change, hard to understand

# Why does the code Rot?

- bad managers; customers; schedules
- excuses, and it is your fault, your hands on the code..
- WE ROT THE CODE!
- The only way to go fast, is to go well
- Rushing always slows you down, whether it is short term or long term.
- Sushi cooker, the only way to go fast is to go clean

# What is Clean code ?

- make one thing
- simple and direct
- clean code is code that seems  is written by someone who cares.

> This Course Will teach you to care about the code you are writing
> 
- how to write code that others will think is pretty much what they expected .

# The boy scout rule

- leave the world better than you found it.
- Leave the code better than you found it.

---

---

---

# Episode #2 (Names)

Measuring the scale of the earth began with 5 measures!! one of them using camel from Aswan to Alexandria 

# Revel your Inten

- Use Variables with descriptive names instead of comments

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/aed119d0-06ec-4799-8094-6982b3a57116/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5585096a-8d37-429c-bac0-0c75c51ac74c/Untitled.png)

# Describe the problem

- Whenever you try to read the code in order to understand the name, then the name pretty much "failed to communicate"
- Choose names that includes intent →
- Names aren't for your convenience, it is for communicating your intent and that is even more important than making the code works

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/854e192f-d832-4aa9-8c91-748a0478bd11/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ca726ffe-a67d-4fe2-8b44-b211ff12eabe/Untitled.png)

# Avoid Disinformation

- Disinform : Say something other than you mean
- If you have to read a comment to understand the name, then you failed
- Given a concrete name to an abstract class
- The Name Should be abstract as the class "Calendar Date"

```java
public abstract class SerialDate 
```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c0325124-2467-4218-8cc3-d796e669ff71/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/28a30faa-283d-4215-9bc4-96af122ebbf6/Untitled.png)

---

---

Pronounceable name

- GWDA - GWDB - m_quadx.blah() -

# Avoid Encodings

- Drop I's,M's underscores and  just use names and let your complier,IDE, unit tests do the rest

don't use encoding 

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c4d5046a-18f2-4817-be3f-3ad30b25f0cc/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f0693757-1234-44d2-b8d6-bfcc9e57bb58/Untitled.png)

# Parts of Speech

- use isX for a boolean
- Enums usually are states or Object descriptors, so use Adjectives

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/a84987ca-59c7-43b2-b404-0e32e0001ac6/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c12dd240-19f8-4201-98d6-b5d8d57b67c1/Untitled.png)

# The Scope length rule

- you don't always need a clear variable name if the scope is small
- Bigger scope → bigger variable names
- Bigger scope → Shorter classes and functions names "oddly enough"
- The more derived a class is, the more adjectives added to it
- private classes should have long descriptive names
- Beware of the derived classes as they tend to have longer names

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/45cdef09-3d9a-429a-b9e3-c5a9dbe88533/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b2a32041-0a0a-4ed4-a737-035b7181b1fa/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/bad01e9f-0c01-41f7-8928-836d8162cce0/Untitled.png)

# RECAP

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/97a8815f-2f18-474a-9d70-286505edb53b/Untitled.png)

"Any Fool can write code that a computer can understand, but it takes a good programmer to write a good that human can understand" Martin Fowler

---

---

---

# Episode #3 - Functions Size

# The First rule of functions

- classes tend to hide in large functions?
- they should be small
- they should be smaller than that
- function size 4- 10 lines !!
- less indentation

# The Geography metaphor

- We love long functions because we do mental hooks over parts of long code blocks.

# Coding Time

- takes time to make thing small
- you save yourself small time, but you cost everyone who reads the code a lot of time
- it will cost you time when you come back to it,

# Where do classes go to hide?

- long functions almost always can be refactored into one or more classes

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/17499f48-b0ae-492c-befe-d001f765ce1b/Untitled.png)

- characterization tests : when you have code you want to refactor, and you want to make sure that you didn't broke anything.
- when you have a function controlling too many variables; it means that you have many classes hiding in that function

### steps to break down big functions into smaller classes

1. extract method object (Tests pass) 
2. promote local variables into member fields (tests pass)
3. cut the functionality ( for example printing into class and the logic into another class) 

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/dffb21fd-b23e-4320-9bce-dfde3c2741b2/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/583b5609-63e3-4630-9f0b-b0984d3aad19/Untitled.png)

# One Thing!

- one thing is ambiguous, it can mean anything!
- There exist an accurate way to tell if your function does one thing

# Extract  till you drop!

- you do extraction until you can't do more
- I see braces as an opportunity for extraction
- He aims for while loops and if statements with out braces
- Refactoring book of martin fowler
- notice how he tests every change

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/8b75a977-3efa-46df-af7b-e73c88da135a/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/7535925a-f3c5-4915-a87a-df071d1d928e/Untitled.png)

# Conclusion!

- 2 rules of function
- good function names will save you and your team alot of times
- hidden classes in big methods
- extract big method into classes then into methods then into classes  ( method → class → method → class)

---

# Episode #4 - Function Structure.

## Overview

- Method signatures should be small, the fewer the arguments the better
- What types should be passes and what types should not
- Class layout, organization is self-evidence
- switch statements are harm, also `if` statements less is better
- Error handling should be clean without making the structure of methods untidy
- Structured programming, why it is important

## Fusion

how sun works and operates and how it will fade away some day ( when its core runs out of hydrogen) 

## Arguments

The less is better 

Arguments should be treated as liability more than an asset 

### Three Arguments is max, two is good

- If more, why these parameters aren't an object
- Same applies for constructor, when you need more, use setters instead
- Using setters may lead to situations where the object in an incomplete state for usage, that's where the good tests come to make sure that you don't do that mistake.

## No Boolean Arguments Ever!!

- Because that means is your functions does two things, one for true and the other for false case; what you should have done is to write two methods one for the **true case** and the other for the **false case**.
- A function that takes 2 booleans do 4 things

## Innies not Outies ( output arguments )

- When you pass an argument just to add an output to it instead of using return, (Microsoft libraries use this alot)
- No output arguments
- We don't like double takes

## The Null Defence

- Writing a function that expects a null as one of its arguments is as bad as a method with a Boolean argument if not worse,  because it might not be obvious that there are two states hence two things to do.
- You then should have two versions of the method, one that expects Null as one of its arguments and other
- Don't use nulls as a pseudo-boolean
- Defensive programming means that you don't trust your team or your unit tests
- But for public APIs I would of course write defensive because who knows what will be passed to my methods, code within my system by my team should be good offensive code with good unit tests

## The step down rule

- Ideally, public methods should be first and private come last, used to follow this convention in C++
- Early Java programmers had a reverse convention (first private second public), we will deal with it in order not to confuse anybody
- Important stuff goes into the top, details go to the bottom Like magazine

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/54ba4b02-1a98-4e51-8288-4522f4cc4af6/Untitled.png)

 

- The way to work in java each public method is followed by its children method in the order of their call in depth-first manner and then another public method and so on so forth.
- Quick note : try block calls one method

## Switches and Cases

- We don't like switch statements because they aren't OO and they a
- Switch statements are missing opportunities for Polymorphism
- Why we love OO? answer → Managing dependencies

Two types of dependency 

1. source code dependency 
2. Flow of control dependency 

The problem is that we can't compile A without B, any changes to B will require recompile of A

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/fd3fb7c1-bf6a-4180-a5c9-603bcbd751a7/Untitled.png)

   

Where should I exists? A, B or Both? 

Now Source code dependency is oppose to the runtime dependency ( flow of control ) 

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6c2d0584-cc56-4fcc-bea2-e430fe6ea8a7/Untitled.png)

Switch statements make the app tightly coupled to specific modules, which makes the independent deployability impossible 

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/86eb4bcc-9b02-4988-b549-f4f1723e2e4e/Untitled.png)

Video store example → replace switch statement with polymorphism 

- **When and how to create those instances of Derivatives?**
    
    Using Factories and factories are in main. 
    

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/0edef04f-4861-4934-8f63-ec41e566ea1c/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ec878284-5438-40cd-911c-85b4f3fecee9/Untitled.png)

- Main partition should be kept small, contains configurations and low level details about the operation of the app as a whole, however the `App Partition` shouldn't know anything about the main partition
- Dependency direction should point out to one and only one direction, they should be from the `Main Partition` cross the line points out to the `app Partition`, it should act as a plugin to the This is **`Dependency Injection`**
- Rats' nest of XML configurations to have dependency injection " Spring:)"
- Trick to dependency Injection :
- Takeaway: Switch statements breaks the plugin  structure we desire for out applications and they introduce insignificant impedance between otherwise independent development teams
- Long if else chains have the same harm effect of switch statements , so replace most of them of polymorphic dispatch, and move the rest of them to some safe independently deployable module

## Paradigms

- Functional
- Structural
- OOP

## Functional Programming Paradigm

- first paradigm, last to be come popular
- No assignment statements, seems radical and impossible at first! ( No state)
- True mathematical functions, the same output for the same arguments EVERY SINGLE TIME!
- No Side Effects

## Side Effects

- Function changes a value of an argument that outlives the call of the function then this is a side effect ; this makes the programs difficult to understand and be a persistent source of errors.

### Temporal coupling:

- `close()` must be called after `open()` , Things happen in a particular order
- System failure due to two method were called out of order
- The issue with temporal coupling is that most of the time they are hidden and not as obvious as `open()` and `close()`
- What is the issue with Open() method ?
    
    It leaves  the system in a changed state ( an opened file)  
    
- Can we eliminate this temporal coupling?
    
    Yes we can , this technique is called `Passing a block`   you hide the second block in the first 
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/9d6cc778-cca7-4ab9-aa27-263b53e0ede5/Untitled.png)
    
- We can't eleminate all side effects, in fact we need it , we need save changes to files, update databases, generate outputs
- Our goal is to impose discipline upon where and how those side effects happen, not to eliminate side effects

## Command Query Separation

- Create strong seperation between `commands` and `queries`
- `Commands` Changes the state of the system ( has a side effect) and return nothing
- `Query` doesn't change in the system and returns value, result of a computation
- Getters ( query) and Setters(commands )
- What are the advantages of CQS rule ?
    - easy to recognize whether a method has a side effect
    - 
        
        ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ae80b6fe-c9a3-45de-8319-ee12fb1d8dbb/Untitled.png)
        
        Don't you think the authorizer should keep control of the user
        
        ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/578db5f2-ff18-4c60-8ef5-d13dc53eb021/Untitled.png)
        
        - why the login function return the user?
            
            Maybe you want to check if the user is Null in case of error, but you should throw exception instead 
            
    
    > Functions change state shouldn't return values, they should throw exceptions instead of failure
    > 

## Tell Don't Ask

- Extreme form of Command Query Separation is to avoid Query all together

```java
if(user.isLoggedIn()
	user.execute(command);
else 
	annunciator.promptLogin();
// Better form 

try 
	user.execute(command);
catch(User.NotLoggedIn e)
	annunciator.promptLogin();

// Best 

user.execute(command,annunciator);

```

Don't ask user for its state, just tell him what to do and let him deal with this command depending on his own state without leaking its state outside of the class. 

 

> Tell object what to do, don't ask for their statues and make decisions depending on those statues 
The object knows its own state and make his own decisions THANK YOU! 
This will results into less query functions, and query functions can go out of control easily
> 

```java
o.getX()
.getY()
.getZ()
.doSomeThing() // ask and ask and ASK before doing anything

// TRAIN RACKS 
// vs 

o.doSomething()

```

### The law of Demeter

we don't want a function to have a tremendous knowledge about the system

Individual functions should have a very limited knowledge about the system, walk the whole configurations of the DB 

  

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/90c3eea7-f09f-4c7c-aa44-397193703580/Untitled.png)

It is called A `SUGGESTION` because it is hard to follow, but the benefits are tremendous, any function who tells not asks is decoupled from its surroundings  

## Structured programming

- youngest !!
- three components ( predicate, loops, sequence)
    - single entry point, single exit point → every method; every algorithm; every module ; every system

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1e753c2e-d5aa-4400-a51a-0c51e8c199d6/Untitled.png)

## Early returns

- return in the middle of a loop is confusing
- Break statements, indirect and unexpected direction
- Anything that you do that make your code more harder to sequentially reason about matters, an awful a lot
- first responsibility is to make your code understandable than make your code works
- for simple loops it is ok to break, but for complicated logic it is hard

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4a5d6bb7-4c40-4298-984b-aaa9c6942393/Untitled.png)

# Error Handling

- it is important, but if it is makes the logic unclear then it is harmful
- He implemented small tests for a stack implementation

## Errors  First

- It is best to write the error handling code, before you write the rest of the code, that way you don't bench yourself into implementations that can't handle errors well ( Overflow and underflow)

### Prefer Exceptions

- `push()` return false `pop()` return null

### Exceptions are for callers

- I want exceptions to be scoped to the class that caused it ( inner class)?
- I want it to have as many information and details as possible for the problem of it

### Use Unchecked exceptions

- Checked exceptions failed in C++, Java  and C# didn't even tried them. why?
    
    Reverse dependency up the inheritance hierarchy instead of down
    If you have a derived method that throws a new exception, then you would  have to change all the base classes signature and to recompile and redeploy and users of this base class 
    
- From now on, derive your exceptions from RunTimeExceptions

> Write Exceptions without messages, Exceptions names should be enough in order to understand what went unusual
> 
- Always make the name, context and scope todo most of the work

### Special cases ( Null Object Pattern )

## Null is not an Error

- You shouldn't return null when null isn't expected, instead use Exceptions, null tends to sneak into the system causing NullPointerException Somewhere

## Null is a value

- Return null when `find()`  doesn't find anything, exception here doesn't fit well

## Try is one thing

- It must be the first word after variable declarations
- It must contain one line of a method
- Nothing should come after finally block
- Function is supposed todo onething, functions shouldn't do handling of errors  besides doing something else

# Conclusion!

- function signatture should be small 3
- not passing bool or null
- no output arguments
- organize methods according to stepdown public first, no backward reference
- Switch statement interfere with independent deployability and independent developability and they should be replaced with polymorphic code or be moved them down to independent deployable module such as a main or perhaps inside a factory
- Functional - structure - oo paradigm
- Temporal couplings and how to solve them by passing blocks
- Command and Query Separation
- Tell don't ask
- The law of Demeter
- Dangers of too much knowledge in single lines of codes
- Structure programming Single entrance and single exit points
- breaks and return in middle of loops leads to complexities that we needn't deal with
- Error Handling first before real part of implementations
- Prefer Exceptions over returned error codes
- Exceptions should be scoped to our classes
- UncheckedExceptions are better than checked exceptions
- Null object pattern and the special case patterns are often better at erros at the first place
- Null values aren't an Error.

---

# Episode #5 - Form.

## Overview

- Comments
- how long file
- how wide line be
- whitespace
- indentation
- what is class? what does it protect you from? should all variables be private? `should you write getters and setters for all of those variables?
- what is the difference between class and data structure? does a datastructe have methods? what data structures protect you from? and what dangerous does they expose you to?
- What are boundaries in software projects? how those boundaries should be crossed? for example DB  seperated from the application? ..Should the DB tables correspond to the classes or domains in the application ? how should we manage this division between app partitions such as Application and the database ?

## Sol's pyre

- 6 Billions year from now, our sun will be begin to die
- helium would be more than hydrogen, temprature will be so high "Helium Flash"
- Sun will expand and the Earth will be melt
- Sun will beat, it will explode for 10
- Idea of degeneracy

## Comments | Coding Standards

- The code should be the coding standard, it shouldn't be separated in another file
- If it is written in another file, then it means your code fails to showcase your standards
- when comments are coment we tend to ignore, even the ones we shouldn't

## Comments should be rare

- The elements of programming styls **book**
- 

## Comments are failures

- Every programmer goal should be writing code that there are no need for comments, hence writing a comment would be considered a failure
- Some people say that it isn't possible to express intent in code, this is right back in the days ( Assembly) but not now
- Java, C# are so expressive, we have more resources and less constraints
- Refactor the code to make it express itself well, uncle bob sometimes write comments, but when he only can't express himself well while writing the code and he doesn't congratulate himself for it.

## Comments are Lies

- Clutter and Lies
- With time → comments doesn't represent truth
- Comments rot with time, as they can invalidate other comments in the class, module or anyother code written by another developer.

## Good Comments!

- Sometimes comments can be good or even MANDATORY!!
- Legal Comments → Write some script to put those in
- Todo comments are really bad
- good Public API documents are good, but the best API is the one that doesn't need a one
- Informative comments are good ( explaining a format for RegEx or SQL)
- Warning comments meeh, but the function name should include that

## Bad comments

- Mumbling don't talk to yourself in the code, don't write your life story in the comments
- Redundant explaintions → add something new, don't repeat yourself
- Mandated redundancy → build system tool like checkstyle  - > turn it off

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/cb6be4b4-120a-4b5a-83a7-8d606860768d/Untitled.png)

- When you see bad comment, either fix it or delete it!
- Journal comments

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/da310b7f-79b4-40cd-bdb1-a4a88655e590/Untitled.png)

- Noise comments

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1806df68-2d3b-488f-9cb5-1e499a2e7734/Untitled.png)

- Big banner comments

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ce6aed80-8263-48af-8d6d-f73e49463444/Untitled.png)

- Attributions comments
- HTML comments
- Non-local information

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/113bcc6b-7c59-4050-974f-854be6f38a85/Untitled.png)

- Commented out code, just delete it, don't read it , don't try to understand it

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1831b26e-c6e8-4891-b96d-28c94e9e135b/Untitled.png)

## Explanatory Structures

- Make your code read like a prose

## Formatting

- Whitespaces carries information, and should be dealt with careness
- At the first glance of yourcode, your reader should know that this code was written by a professional

## File Size

- How big a source file should be ?
    
    Big projects doesn't imply big file sizes or perhaps, 
    aim for 100-200 line file sizes and maximum of 500 for large projects, but the smaller the better  
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/c5933679-5ba8-448b-a354-6935f2b269be/Untitled.png)
    

## Vertical Formatting

- things that are related should be vertically close together
- Use one line to separate methods
- Use one line to separate variables from the logic
- one line between loops and ifs and returns

## Horizontal Formatting

- Don't scroll right to see it, NEVER!
- 30 - 40 chars we like them, longer than 80 we hate them

## Indentation

- use spaces
- use 2 char wide
- knr style brances
- use common configuration files for the indentation, make the code come out of the team shows like a team did it.
- Don't miss a lot with the formatting of the whole file by the IDe, because it can sometimes make the source control system merges nightmare!

## Classes

- Bag of functions, a class from the outside should have no variables
- Object is also true appears to have no variables
- From the outside looking in an object seems to have no observable. OBJECTION!! → most classes have getters and setters or mutable properties RESPOND → why would you make variables private and then just expose them through getters and setters? this means it is a bad design!
- If an object has no observable state then although it is easy to tell it what to do, it doesn't make sense to ask it anything, and object that follows the dicipline of tell Don't ask will probably have that many getters, and if it doesn't have many getters, there is no much sense for it have many setters
- The more variables a method changes within a class, the more cohesive this method is

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/fc7103f9-8109-41c5-aa90-0047ab57be17/Untitled.png)

- Maximally Cohesive method manipulates every field in a class
- Maximally Cohesive Class is nothing but maximally cohesive methods
- He tries to maximize cohesion by writing less getters and setters
- Make getters as generic as possible, don't expose the internal structure of it
- why getters can be harmful sometimes?
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1baa53d1-e721-4e43-aae9-2b8fc88402c6/Untitled.png)
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/3e5c89f6-15b6-40b8-8fc1-75266917231f/Untitled.png)
    
    - What is the difference between a class and a Datastructure?
        
        it is kind of the opposite of a class, and of course data structures can have methods, but those methods are utility navigational methods that manipulate individual fields instead of cohesive groups of variables 
        
        ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ddce382c-9d18-4e61-a4a2-8aefe11a0b55/Untitled.png)
        
    - Classes and polymorphism have the same relationship as data structures and switch statements, when you see a switch statement probably there is a data structure that is lurking in the corner
    - We don't dislike switch statements as we
    - Object polymorphism protects your client code  from kinds of  server code in other words from other types
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ee1d8326-9c8c-4078-93c6-7e6b82e794c1/Untitled.png)
    
    - Switch statements expose us to changes in types, when you change types it breaks the client code and the switch statements which hinders the independent deploy ability
    - Data structures and switch statements are immune to the addition of new functions, when you add a new function you add a new switch, nothing need to be changed and nothing need to be compiled in data structures!!
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/979370e1-8fb3-4107-a801-b581a0241492/Untitled.png)
    
    ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/567fdb50-e4f6-4298-8aca-66b80d043c08/Untitled.png)
    
- Adding new functions will not need to change any data structures and doesn't break any other functions which enhances independent deploy ability

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/96350b84-c199-4c50-bb25-3a554e721869/Untitled.png)

- Classes and polymorphism protect us from the change of type, but exposes us to the change of method on the other hand Data structures protect us from the method change but exposes us to new types of types.
    
    Is there any way to protect us from both new methods and new types? → The expression problem this will be discussed in the design patterns series\
    

> The key to independent deploy ability is to know which form to use and when, we use classes and types where types are more likely to be added, and we use switch statements when methods are more likely to be added\
> 

## Boundries!!

- 

## The Impedance Mismatch

- Between Relation database and OOP
