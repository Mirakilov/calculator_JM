# **Documentation**
### Привет всем. Рад что читаете меня!

Я бы сейчас хотел ~~рассказать~~ написать о моёй
программе калькулятора.

#### Что может программа:
Она может все что вы(Java Mentor) просили.
1. Брать из консоли математические примеры типа 9+4 и подсчитовать их.
2. Поддерживать арабские и римские числа до десяти
    а также может считать 4 типа операции: +, -, *, /. 
3. Работает только с целыми и позитивными(+) числами.
4. Красивая обработка ошибок.
5. И многое другое.

##### У программы такой скелет:

    -Calculator
        -src
            -davlatbek.soft.calculator
                -models
                    -enums
                        Exceptions.java
                        MathOperations.java
                        Numbers.java
                    -exceptions
                        ProjectExceptions.java
                    -numbers
                        ArabicNumbers.java
                        RomanNumbers.java
                    ConvertedObject.java
                    ParsedObject.java
                    SolvedObject.java
                -workers
                    -simple
                        Converter.java
                        Parser.java
                        Solver.java
                    -static13 (because static is invalid)
                        ConsoleListener.java
                        Documentator.java
                        ExceptionsManager.java
                Main.java (psvm is there)
 
## Так времени мало так что сразу к главному
 //TODO 29.11.2019