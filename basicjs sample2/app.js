let score = prompt("คะแนนของคุณ")
if(score >= 80){
    document.getElementById("result").innerHTML = "คุณได้ A"
}else if(score >= 70){
    document.getElementById("result").innerHTML = "คุณได้ B"
}else{
    document.getElementById("result").innerHTML = "คุณได้ F"
}