# A refactoring kata: Airdream booking wizard

A refactoring kata, to train on how to refactor UI code. The techniques you will use to refactor this code may be used on any application with an UI (web, mobile development, etc...)

## Your mission

Airdream is an airline company that is hiring you for a little evolution of their application. They have a booking wizard, and you are asked to add an additional step to the booking process: user should be able to select a hotel before the final review screen is shown.

Some documentation was left to you by the previous contractor that worked on that wizard. By the way, it is working just fine, so don't break anything when you add the new feature.

Booking is a linear process, made through several steps: 
1. Selection of the flight type: outward or round trip
2. Selection the departure city
3. Selection of the arrival city
4. Selection of the departure date
5. For a round trip only: selection of the return date
6. Get the number of passengers
7. Get the passengers first and last names
8. Print preview of the booking and await for confirmation
9. On confirmation, print a thanks message. On cancellation, print a see you soon message

## Tips
1. Yes, you will have to write tests.
2. You should not refactor any code that is not tested, unless you are using your IDE automatic operations.
3. Once you think you've finished, ask yourself if it is easy to replace the console input and output by some other system (like a GUI). If not, you probably have some more work ;)