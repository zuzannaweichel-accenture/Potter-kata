# Potter-kata
Instructions
Imagine a bookstore that is selling the seven books from the Harry Potter series. Each book has a
standard price of $8.00. However, if you buy more than one of the series at a time, you get a
discount. Buying multiple copies of the same book title does not earn a discount.<br/>
### Number of Different Book Titles Discount Percentage<br/>
<pre>
2    5%<br/>
3    10%<br/>
4    15%<br/>
5    25%<br/>
6    30%<br/>
7    35%<br/>
</pre>
Write a method that will calculate the optimal customer discount for any set of books from this
series. Keep in mind that larger percentages are not always better as can be seen in the sample
below, in which case it was better to keep all the books at 75% discount instead of having some at
70% and others at 85% of retail.

### Sample Selection<br/>
* 1 copy of Book One
* 2 copies of Book Two
* 2 copies of Book Three
* 2 copies of Book Four
* 2 copies of Book Five
* 1 copy of Book Six

### Result and Analysis<br/>
In this case 1 each of books one through five make a set of 5 unique books eligible for 25% off, and
one each of books two through six make a similar set, resulting in 10 books at 25% off of $8 (10 *
$8 * .75) = $60. If the algorithm had "greedily" used all six unique books to get a 30% discount, the
remaining 4 books (Two, Three, Four, Five) would only have been eligible for a 15% discount. The
cost would thus have been (6 * $8 * .7) = $33.60 + (4 * $8 * .85) = $27.20 for a total of $60.80.
