function Person(name, age){
    this.name = name,
    this.age = age
}

let crowd = [new Person("John Smith", 19), new Person("Fred Douglas", 15), new Person("Kevin Harris", 12), new Person("Jeff Davis", 21)]
crowd.push(new Person("Nathan Evans", 19));
crowd.unshift(new Person("Michael Doe", 23), new Person("Matthew Newell", 17))
console.log(crowd)
crowd.shift();
crowd.pop();

crowd = crowd.filter(person => {
    return person.age > 18;
})

crowd.forEach(person  => {
    console.log(person)
})

function example(x, y){
    let args = [].slice.call(arguments);
    console.log(args)
    return x + y;
}
example(1,2)
let x = [1,2,3]
let y = x.reduce((a, b) =>{
    return a + b;
})

console.log(y);