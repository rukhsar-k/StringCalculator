# String Calculator
Create a simple String calculator with a method signature:

int Add(string numbers)
The method can take up to two numbers, separated by commas, and will return their sum.

For example "" or "1" or "1,2" as inputs. (for an empty string it will return 0)

TC1, TC2, TC3: Start with the simplest test case of an empty string and move to one and two numbers

TC4: Allow the Add method to handle an unknown amount of numbers

TC5: Allow the Add method to handle new lines between numbers (instead of commas).
The following input is ok: "1\n2,3" (will equal 6)
The following input is NOT ok: "1,\n" (not need to prove it - just clarifying)
Support different delimiters

TC6: To change a delimiter, the beginning of the string will contain a separate line that looks like this: "//[delimiter]\n[numbers…]" for example "//;\n1;2" should return three where the default delimiter is ";"
The first line is optional. all existing scenarios should still be supported

TC7: Calling Add with a negative number will throw an exception "negatives not allowed" - and the negative that was passed.
If there are multiple negatives, show all of them in the exception message.
