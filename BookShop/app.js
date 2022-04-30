getPrice = function() {
            var numVal1 = Number(document.getElementById("price").value) * 100;
            var numVal2 = Number(document.getElementById("discount").value) / 100;
            var totalValue = numVal1 - (numVal1 * numVal2)
            document.getElementById("total").value = totalValue.toFixed(2);
        }