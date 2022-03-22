let anExampleVariable;
anExampleVariable = "Hello World";
anExampleVariable = 9898;
console.log(anExampleVariable)

let nameIs : String = "Raj";
console.log(nameIs);

let age : Number = 21;
console.log(age);

let isTrue : Boolean = false;
console.log(isTrue);

let numArray : number[]  = [1,2,3,4,5,6,2];
console.log(numArray);

let greeting = (name :String) => {
    console.log("Hello.... , \n \tGood Morning " + name);
}

greeting("Raj");

greeting("Ravi");

class greet {
    msg():void{
        console.log("Error Massage");
    }
}
var obj = new greet;
obj.msg();

let aray1 : number[] = [1,2,3,3,5,5,5];
console.log(aray1);

let aray2 : String[] = ["R","A","J"];
console.log(aray2);

let aray3 : any[] = ["raj" , 21];
console.log(aray3);

interface User  {
    name : String;
    age : Number;
}
let user : User = {
    name : "raj",
    age : 21,
}
console.log(user);