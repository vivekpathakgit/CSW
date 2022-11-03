let year = document.getElementById("year");
let msg = document.getElementById("message");


function leapyear(){
	console.log(year.value);
	if(year.value%400==0){
		msg.innerText="YES, "+year.value+" is a leap year. " 
	}
	else if(year.value%100==0){
		msg.innerText = "NO, "+year.value+" is NOT a leap year. "
	}
	else if (year.value%4==0){
		msg.innerText="YES, "+year.value+" is a leap year. " 
	}
	else {
		msg.innerText = "NO, "+year.value+" is NOT a leap year. "
	}
}
	
	
 