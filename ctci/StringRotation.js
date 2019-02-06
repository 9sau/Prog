/*
    String Rotation:Assumeyou have a method isSubstringwhich checks if one word is a substring
    of another. Given two strings, sl and s2, write code to check if s2 is a rotation of sl using only one
    call to isSubstring (e.g., "waterbottle" is a rotation of"erbottlewat").

    Given: str1 and str2
    Return: true if str2 is rotation of str1
    Assumptions:

    Time: O(len(str1))
    Space: O(1)

    Pseudo Code

    checkRotation(str1, str2){
        for i=0 to len(str1)
            if(str1[i] != str2[i])
                str2 = rotate(str2, i);
            else
                return true;
        return false;
    }

    rotate(str, i){
        var temp = str[str.length -1];
        str[str.length -1] = str[i];
        str[i] = temp;
        return str;
    }
*/

function rotate(str){
    var temp = str[str.length -1];
    for(var i = str.length-1; i >0; i--){
        str[i] = str[i-1];
    }
    str[0]=temp;
    return str;
}

var j = 0
var isRotated = function(str1, str2){
    str2 = str2.split('');
    for(var i = 0; i<str1.length; i++){
        if(str1[j] != str2[j])
            str2 = rotate(str2);
        else
            j++;
    }
    console.log(str2);
    return str1 === str2.join('');
};

console.log(isRotated('waterwbottle', 'erwbottlewat'));