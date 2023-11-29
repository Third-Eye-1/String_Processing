# String_Processing


## StringProcessor

### Описание

`StringProcessor` - это класс, предоставляющий набор методов для обработки строк:

#### Методы

1. **isStrongPassword(String password):**
   - Проверяет, является ли предоставленный пароль сильным.
   - Сильный пароль должен содержать как минимум одну заглавную букву, одну строчную букву, одну цифру и один специальный символ.
   - Возвращает `true`, если пароль сильный, в противном случае возвращает `false`.

2. **calculateDigits(String sentence):**
   - Подсчитывает количество цифр в предоставленном предложении.
   - Возвращает количество цифр.

3. **calculateWords(String sentence):**
   - Вычисляет количество слов в предоставленном предложении.
   - Слова считаются разделенными пробелами.
   - Возвращает количество слов.

4. **calculateExpression(String expression):**
   - Принимает строку, содержащую математическое выражение с числами, арифметическими операциями и скобками.
   - Вычисляет и возвращает результат выражения.
   - Предполагается, что выражение корректно и хорошо сформировано.

### Использование

Пример использования основных методов `StringProcessor` представлен в методе `main`, в котором создается экземпляр класса и выполняются тестовые случаи для каждого метода.

### Особенности кода

1. **import java.util.regex.*;**
   - Импорт пакета `java.util.regex`, используемого для работы с регулярными выражениями.

2. **password.matches**
   - Используется для проверки соответствия строки `password` регулярному выражению в методе `isStrongPassword`.

3. **Pattern.compile**
   - Используется для компиляции регулярного выражения в объект `Pattern` в методе `calculateDigits`.

4. **javax.script.ScriptEngineManager**
   - Создание экземпляра `ScriptEngineManager` и получение движка `ScriptEngine` для выполнения выражения в методе `calculateExpression`.

5. **try-catch блок для обработки исключений**
   - Обработка исключения `ScriptException` при выполнении выражения в методе `calculateExpression`.

### Примеры использования методов

```java
StringProcessor stringProcessor = new StringProcessor();

// Проверка на сильность пароля
boolean isStrong = stringProcessor.isStrongPassword("Strong@123");
System.out.println("Is Strong Password: " + isStrong);

// Подсчет цифр в предложении
int digitCount = stringProcessor.calculateDigits("There are 2 digits in this sentence.");
System.out.println("Digit Count: " + digitCount);

// Подсчет слов в предложении
int wordCount = stringProcessor.calculateWords("This is a sentence.");
System.out.println("Word Count: " + wordCount);

// Вычисление значения математического выражения
double expressionResult = stringProcessor.calculateExpression("2 + 3 * 4");
System.out.println("Expression Result: " + expressionResult);
```

### Замечания

- Класс предоставляет методы для различных операций обработки строк и может быть расширен или адаптирован под конкретные потребности.

- Предполагается, что все входные данные корректны и соответствуют ожиданиям методов.
