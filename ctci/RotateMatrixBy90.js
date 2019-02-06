/*
    Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4
    bytes, write a method to rotate the image by 90 degrees. Can you do this in place?

    Given: NxN Matrix
    Return: Rotated NxN Matrix
    Assumptions:

    Pseudo code
        rotateMatrixBy90(input){
            for every column in input
                list.add(column[i]);

            for rows in input
                for cols in input
                    input[rows][cols] = list[k++]

            return input;
        }
*/
/*
        Time: O(NxN)
        Space: O(NxN)
*/
var rotateMatrixBy90 = function(matrix, n){
    var list = [];
    for(var col = 0; col < n; col++)
        for(var row = n-1; row >= 0; row--)
            list.push(matrix[row][col]);
    var k = 0;
    for(row = 0; row < n; row++)
        for(col = 0; col < n; col++)
            matrix[row][col] = list[k++];
    return matrix;
};
var input = [[1,2,3],[4,5,6],[7,8,9]]
console.log(rotateMatrixBy90(input, 3));

