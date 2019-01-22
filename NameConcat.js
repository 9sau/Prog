//var input = [{name:'John'}];
//var input = [{name:'John'}, {name:'Steve'}];
var input = [{name:'John'}, {name:'Steve'}, {name:'Bell'}],
	initialValue = '',
	len = input.length,
	result = input.reduce((accumulator, currentValue, index, array)=>{
				var sep = ' , ';
			    if(index == len-1)
			    	sep = '';
			    else if(index == len-2)
			    	sep = ' & ';
			    return accumulator + currentValue.name + sep;
			}, initialValue);

console.log(result);
