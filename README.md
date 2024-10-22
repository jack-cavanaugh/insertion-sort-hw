I made an insertion sort in Java and Python. I used both worst-case and random lists of various lengths to discern the trends of each set of data and then found the trendline of each of these data sets. 

Worst case Python runtime: 0.000000277x^2 - 0.00000029x + 0.0925

Worst case Java runtime: 0.00000000114x^2 - 0.000000301x - 0.00443 

Random Python runtime: 0.000000137 x^2 + 0.000121x - 0.0385

Random Java runtime: 0.000000000301x^2 +0.00101x + 0.00124

Based on these results, it is clear that Java is a much faster performer than Python. We can see that as lists become long, Java not only has a slower growth rate but also a more rapid time overall. Even as the lists approached 10,000 items long in the worst possible case, Java was consistently sorting the data in less than two-tenths of a second, while Python was taking upwards of 20 seconds. The compiled nature of Java makes it a much faster language for code that is to be executed many times over. As lists get longer and longer, using Java saves an extraordinary amount of time over Python. 
