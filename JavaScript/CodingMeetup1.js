/*
Se le dará una serie de objetos (hash en ruby) que representan datos sobre los desarrolladores que se han inscrito para asistir a la reunión de codificación que está organizando por primera vez.

Su tarea es devolver el número de desarrolladores de JavaScript procedentes de Europa.

Por ejemplo, dada la siguiente lista:
*/ 

let list = [
    { firstName: 'Noah', lastName: 'M.', country: 'Switzerland', continent: 'Europe', age: 19, language: 'JavaScript' },
    { firstName: 'Maia', lastName: 'S.', country: 'Tahiti', continent: 'Oceania', age: 28, language: 'JavaScript' },
    { firstName: 'Shufen', lastName: 'L.', country: 'Taiwan', continent: 'Asia', age: 35, language: 'HTML' },
    { firstName: 'Sumayah', lastName: 'M.', country: 'Tajikistan', continent: 'Asia', age: 30, language: 'CSS' }
];

function countDevelopers(list) {
    // your awesome code here :)
    let count = 0;
    for (const index in list) {
        if(list[index].continent === "Europe" && list[index].language === "JavaScript"){
            count++;
        }
    }
    return count;
}

console.log(countDevelopers(list));
