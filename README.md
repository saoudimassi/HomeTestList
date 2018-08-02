# HomeTestList
Home java test for partionning list on sub lists. This test consists to create a "partition" function that takes a parameter "list" and 
a parameter "Size" and returns a list of sub-lists, where each sub-list has the maximum "Size" elements.

## Examples of inputs and outputs:

* partition ([1,2,3,4,5], 2) returns: [[1,2], [3,4], [5]]
* partition ([1,2,3,4,5], 3) returns: [[1,2,3], [4,5]]
* partition ([1,2,3,4,5], 1) returns: [[1], [2], [3], [4], [5]]

Junit test allows to verify this implementation.

## Getting Started

This function gets the partionning of different lists with peer or odd size and also gives the sub lists with peer or odd size.
This function manages the different exception cases such as the negative size given on parameter. 

## Acknowledgments

* **Author**  Massinissa SAOUDI 
* **Email**  massinissa.saoudi@gmail.com
