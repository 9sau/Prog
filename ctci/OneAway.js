/*
    One Away: There are three types of edits that can be performed on strings: insert a character,
    remove a character, or replace a character. Given two strings, write a function to check if they are
    one edit (or zero edits) away.
    EXAMPLE
    pale, ple -> true // insert a
    pales, pale -> true // insert s
    pale, bale -> true // edit b
    pale, bake -> false // edit b, also cant use another edit so false
    pale, pales -> true // delete s
    Given: two strings
    Return: true if they can be transformed into another else false
    
    Assumptions:String may or may not be null or empty
    
    Time: O(m*n)
    Space: O(1)

    Pseudo code
        function oneAway(str1, str2){
            i = 0, j = 0;
            buffer = 1;
            equalLength = str1.length == str2.length;
            while(i != str1.length-1){
                if(str1[i] != str2[j] && buffer > 0){
                    if(equalLength)
                        edit(str1[i++], str2[j++]);
                    else{
                        if(str2.length > str1.length)
                            delete(str2[j]);
                            i++;j++;
                        else
                            insert(str1[i++], str2);

                    }
                    buffer --;
                }

                if(str1[i] != str2[j] && buffer == 0)
                    return false;
            }

            return buffer==0;
        }
*/

/*
        Time: O(len(str1))
        Space: O(1)
*/
var oneAway = function(str1, str2){
    var len1 = (str1 && str1.length) || 0;
    var len2 = (str2 && str2.length) || 0;

    var flag = false, j=0;

    for(var i =0; i < len1; i++){
        if(j==len2)
            break;
        if(str1[i] != str2[j]){
            if(flag)
                return false;
            else{
                flag = true;
                if(len1==len2)
                    j++;
            }
        }else{
            j++;
        }
    }
    return Math.abs(i-j) <= 1;
};
console.log(oneAway('', ''));
console.log(oneAway('pales', 'pale'));
console.log(oneAway('pale', 'bale'));
console.log(oneAway('pale', 'bake'));
console.log(oneAway('ABCDEFGHUJ', 'ABCDEFGHUJi'));