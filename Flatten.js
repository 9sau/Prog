var flatten = function(input, result){
    input.forEach(element => {
        if(Array.isArray(element))
            flatten(element, result)
        else
            result.push(element);
    });

    return result;
}

var input = [1,[[[2,3],4],[5,6]]];
console.log(flatten(input, []));