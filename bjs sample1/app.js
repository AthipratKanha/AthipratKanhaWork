let lotto_umber = prompt("กรอกเลขอะไรมาหน่อย")
let random_number = Math.floor(Math.random() * 100);
document.getElementById("random").innerHTML = random_number
if(lotto_umber == random_number){
    document.getElementById("result").innerHTML = "ยินดีด้วยคุณถูกรางวัล"
}
else{
    document.getElementById("result").innerHTML = "เสียใจด้วยคุณไม่ถูกรางวัล"
}