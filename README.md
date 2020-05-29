# DifficultyOfQuestion
The objective of this project is to find the difficulty of a question using an algorithm or formula. The algorithm should be able to read the input from a file and then process the data and then give the desired output as easy, medium, or hard. Here the proposed formula will be able to read the file as a string and then give the desired output in the form of strings easy, medium, or hard. Here, the data will be stored in string array and the data from the different columns will be stored as different strings. If there are more values separated by delimiters, they will still be divided into string arrays and we could work with them in order to find the difficulty of the question. If the given question is fill in the blank or mcq or match, then the difficulty will be calculated by Method-I and if it is a programming type question, then the difficulty will be calculated by Method-II.
Method-I:
•	Average time <= 30, Number of times changed <= 1, Hint <= 1 == EASY
•	Average time <= 60, Number of times changed <= 2, Hint <= 2 == MEDIUM
•	Average time > 60, Number of times changed > 2, Hint >2 == HARD
Method-II:
•	Average time <= 120, Number of times compiled <= 2, Hint <= 1 == EASY
•	Average time <= 240, Number of times compiled <= 4, Hint <= 2 == MEDIUM
•	Average time > 240, Number of times compiled > 4, Hint >2 == HARD
