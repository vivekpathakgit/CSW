


function bmi(){
	var weight = document.getElementById("weight").value;
var height = document.getElementById("height").value;
var msg = document.getElementById("message");
	
	var bmic = (1.3 * weight)/(Math.pow(height, 2.5));
	msg.innerText  = bmic;
}