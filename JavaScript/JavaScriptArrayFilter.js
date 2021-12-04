/* Los Arrays de JavaScript admiten la función filter (a partir de JavaScript 1.6). Utilice la función de filtro para completar la función dada.

La solución funcionaría así:
    getEvenNumbers([2,4,5,6]) // devolveria == [2,4,6]

*/

// Resolucion
function getEvenNumbers(numbersArray){
    // filter out the odd numbers
    return numbersArray.filter(number => number % 2 === 0 )
}

// Test
console.log(`[${getEvenNumbers([1,2,3,6,8,10])}] equals ==> [2,6,8,10]`); 
console.log(`[${getEvenNumbers([1,2])}] equals ==> [2]`); 
console.log(`[${getEvenNumbers([12,14,15])}] equals ==> [12,14]`); 
console.log(`[${getEvenNumbers([13,15])}] equals ==> []`); 
console.log(`[${getEvenNumbers([1,3,9])}] equals ==> []`); 