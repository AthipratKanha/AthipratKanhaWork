
//คิดเลข
const cal = {
    "+": (x, y) => x + y,
    "-": (x, y) => x - y,
    "*": (x, y) => x * y,
    "/": (x, y) => x / y,
  };
  
  function calculate(num1, operator, num2) {
    if (operator in cal) {
      return cal[operator](num1, num2);
    }
  }
  
  console.log(calculate(3, '+', 4));
  
 
 //ย้อนกลับ 
  function reverseString(str) {
    var strReverse = str.split('').reverse().join('');
    return strReverse;
  }
  
  console.log(reverseString("hello")); 
  console.log(reverseString("auto")); 
  console.log(reverseString("athiprat kanha")); 