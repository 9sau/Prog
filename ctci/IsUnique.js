/*
Is Unique: Implement an algorithm to determine if a string has all unique characters. 
What if you cannot use additional data structures?

Given: input is a string
Return: true/false

Assumption: Ascii characters

Brute force
    for i in input
        for i = j+1 in input
            if(input[i]==input[j])
                return false;

    return true;

    Time: O(n^2)
    Space: O(1)
*/

/*
size will be 128 for ascii characters
Time : O(n)
Space: O(1)
*/
var table = new Set();
var isUnique = function(input) {

    for (var i in input) {
        if (table.has(input[i]))
            return false;
        table.add(input[i]);
    }

    return true;
};

console.log(isUnique('saurabh'));