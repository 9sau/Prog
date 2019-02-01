/*
Check Permutation: Given two strings,write a method to decide if one is a permutation of the
other.

Given: 2 input strings
return: true if one is the permutation of the other else false

Assumption: ascii characters

Sample : 
input1 = 'abcc'
input2 = 'cbaa'

Brute Force
    checkPermutation(input1, input2){
        if input1.length != to input2.length
            return false;
        for i in input1
            for j in input2
                if input[i] is in input[j] and input[j].count > 0
                    input[j].count--;
                else
                    return false;
        
        if sum(input.count == 0)
            return true;
        return false;
    }

    Time: O(n^2)
    Space: 0(1) // ascii characters
*/

/*
    Time: O(n)
    Space: O(1) // ascii characters
*/
var table = {};
var checkPermutation = function(input1, input2) {
    var key;
    var sum = 0;
    if (input1.length != input2.length)
        return false;

    for (var i in input2) {
        key = input2[i];
        if (!table[key])
            table[key] = 0;
        table[key] = table[key] + 1;
        sum = sum + 1;
    }

    for (var j in input1) {
        key = input1[j];
        if (table[key] && table[key] > 0) {
            table[key] = table[key] - 1;
            sum = sum - 1;
        } else
            return false;
    }

    return sum == 0;
    //console.log(table);
};

console.log(checkPermutation('abcd', 'dcab'));