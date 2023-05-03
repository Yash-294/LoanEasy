$(document).ready(function(){
	validateAddress();
	validateEmail();
	validateNames();
	validateNums();
	validatePassword();
})

function hidealert(){
	setTimeout(function(){
		document.getElementById("loginAlert").style.visibility="hidden";	
	},6000);
}
 
function validateEmail(){
	var validRegex = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;
	let tags=document.querySelectorAll('#form1Example1,#form3Example3,#form6Example8');
	tags.forEach(field=>{
		if(field.value.length==0){
			field.classList.remove('active');
			return false;
		}
		else{
			field.classList.add('active');
				if(field.value.match(validRegex)==null){
					field.classList.add('invalid');
					field.classList.remove('accept');
					return false;
				}
				else{
					field.classList.remove('invalid');
					field.classList.add('accept');
					return true;
				}
		}
	})
}

function validatePassword(){
	var validRegex =  /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$/;
	let tags=document.querySelectorAll('#form1Example2,#form3Example4');
	tags.forEach(field=>{
		if(field.value.length==0){
			field.classList.remove('active');
			return false;
		}
		else{
			field.classList.add('active');
				if((field.value.length<8)||(field.value.match(validRegex)==null)){
					field.classList.add('invalid');
					field.classList.remove('accept');
					return false;
				}
				else{
					field.classList.remove('invalid');
					field.classList.add('accept');
					return true;
				}
		}
		})
}

function validateNames(){
	let specialCharacter=/[`!@#$%^&*()_+\-=\[\]{};':"\\|,.<>\/?~]/;
	let tags=document.querySelectorAll('#form3Example1,#form3Example2,#form6Example1,#form6Example2,#form6Example3,#form6Example5,#form6Example6');
	tags.forEach(field=>{
		if(field.value.length==0){
			field.classList.remove('active');
		}
		else{
			field.classList.add('active');
			if(/\d/.test(field.value)||specialCharacter.test(field.value)){
				field.classList.add('invalid');
				field.classList.remove('accept');
			}
			else{
				field.classList.add('accept');
				field.classList.remove('invalid');
			}
		}
		})
}

function validateNums(){
	let specialCharacter=/^\d+$/;
	let tags=document.querySelectorAll('#form6Example11,#form6Example7,#form6Example9,#form6Example10,#form6Example13,#form6Example15');
	tags.forEach(field=>{
		if(field.value.length==0){
			field.classList.remove('active');
			return false;
		}
		else{
			field.classList.add('active');
			if(specialCharacter.test(field.value)){
				field.classList.add('accept');
				field.classList.remove('invalid');
				return true;
			}
			else{
				field.classList.add('invalid');
				field.classList.remove('accept');
				return false;
			}
		}
		})
}

function showPassword(){
	let tags=document.querySelectorAll('#form3Example4,#form3Example5,#form1Example2');
	tags.forEach(field=>{
		if(field.type=="password"){
			field.type="text";
		}
		else{
			field.type="password";
		}
	})
}

function validateAddress(){
	let tag=document.querySelectorAll('#form6Example4,#form6Example12,#form6Example14');
	tag.forEach(field=>{
		if(field.value.length>0){
			field.classList.add('active');
			field.classList.add('accept');
		}	
		else{
			field.classList.remove('accept');
			field.classList.remove('active');
		}
	})
}

function showImage(url){
	if(url.files && url.files[0]){
		var image=new FileReader();
		image.onload=function(e){
			$('#imagebox1').attr('src',e.target.result).width(180).height(200);
		};
		image.readAsDataURL(url.files[0]);
		document.getElementById('imagelabel1').style.display='none';
		document.getElementById('imagelabel2').style.display='';
		document.getElementById('ddbox1').style.paddingTop='';
	}
	else{
		document.getElementById('imagelabel2').style.display='none';
		document.getElementById('imagelabel1').style.display='';
		document.getElementById('ddbox1').style.paddingTop='65px';
	}
}

function showIncomeImage(url){
	if(url.files && url.files[0]){
		var image=new FileReader();
		image.onload=function(e){
			$('#imagebox4').attr('src',e.target.result).width(400).height(200);
		};
		image.readAsDataURL(url.files[0]);
		document.getElementById('incomelabel1').style.display='none';
		document.getElementById('incomelabel2').style.display='';
		document.getElementById('ddbox4').style.paddingTop='';
	}
	else{
		document.getElementById('incomelabel2').style.display='none';
		document.getElementById('incomelabel1').style.display='';
		document.getElementById('ddbox4').style.paddingTop='65px';
	}
}

function showAadharImage(url){
	if(url.files && url.files[0]){
		var image=new FileReader();
		image.onload=function(e){
			$('#imagebox2').attr('src',e.target.result).width(400).height(200);
		};
		image.readAsDataURL(url.files[0]);
		document.getElementById('aadharlabel1').style.display='none';
		document.getElementById('aadharlabel2').style.display='';
		document.getElementById('ddbox2').style.paddingTop='';
	}
	else{
		document.getElementById('aadharlabel2').style.display='none';
		document.getElementById('aadharlabel1').style.display='';
		document.getElementById('ddbox2').style.paddingTop='65px';
	}
}

function showPancardImage(url){
	if(url.files && url.files[0]){
		var image=new FileReader();
		image.onload=function(e){
			$('#imagebox3').attr('src',e.target.result).width(400).height(200);
		};
		image.readAsDataURL(url.files[0]);
		document.getElementById('panlabel1').style.display='none';
		document.getElementById('panlabel2').style.display='';
		document.getElementById('ddbox3').style.paddingTop='';
	}
	else{
		document.getElementById('panlabel2').style.display='none';
		document.getElementById('panlabel1').style.display='';
		document.getElementById('ddbox3').style.paddingTop='65px';
	}
}

function labelColorChange1(){
	document.getElementById('state_label').style.color='#3674e0';
}

function labelColorChange2(){
	document.getElementById('state_label').style.color='#656870';
}

function changeListValueColor(){
	document.getElementById('form6Example5').style.color='#3BB143';
	document.getElementById('hidden_ip').value=document.getElementById('form6Example5').value;
}