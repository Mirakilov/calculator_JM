# **Documentation**
### Привет всем. Рад что читаете меня!

Я пользовался IntelliJ IDEA. Думаю с октрытием или с импортом у вас 
проблем не будет.

Я бы сейчас хотел ~~рассказать~~ написать о моёй
программе калькулятора.

### Что может программа:
Она может все что вы(Java Mentor) просили.

1. Брать из консоли математические примеры типа 9+4 и подсчитовать их.
2. Поддерживать арабские и римские числа до десяти
    а также может считать 4 типа операции: +, -, *, /. 
3. Работает только с целыми и позитивными(+) числами.
4. Красивая обработка ошибок.
5. И многое другое.

#### У программы такой скелет:

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
                        ConsoleListener.java
                        Converter.java
                        Parser.java
                        Solver.java
                    -static13 (because name static is invalid)
                        Documentator.java
                        ExceptionsManager.java
                Main.java (main is there)
 
## Времени мало так что сразу к главному
 Сделаем ассоциаццию(похоже)
 
 Моя программа похоже на большую компанию по производство чего нибудь. 
 Как и все компании моя тоже имеет рабочих и производительношо изделия.
 Рабочии дельются на двое типов: простых и дополнительных.
 Точнее простых которые приходят каждый день на робечее место в заданное время
 (создано в начале программы и вызываются только в своё время) и статических
 которых вызываем чаще на работу потому-что без них не как(вызывается каждый раз 
 когда надо). С имени видно одни статически (я назвал имя пакета static13 
 потому-что static не позволяется) другие простые.
 
 **Моя программа произдет ответы на вопросы.** 

 ### Так как он это делает?
 
 Наш грузчик **ConsoleListener** привозет вопросы в типе
 **String** и передаёт его самому большому рабочему **Parser**,
 кстати он берёт самую большую зарплату. **Parser** перерабатывает
 **String** в **ParsedObject** и передаёт работнику **Converter**.
  А он в свою очеред **ParsedObject** перерабатывает в **ConvertedObject**.
  И наконец руль передайтся работнику **Solver** он создаёт из
 **ConvertedObject** **SolvedObject**. А потом **SolvedObject**
 выводиться в консоль. ВУАЛЬЯ!!!
 
 Кстати работники **Documentetor** и **ExceptionsManager**, как я уже говорил,
 делают не самую важную работу но всё таки они нужны.
 
 Простите, время для документации в обрез дальше как-нибось сами!!!
