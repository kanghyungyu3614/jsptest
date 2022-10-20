// 실행함수 get요청함수 만들기
function bwrite(){
	let btitle = document.querySelector("#btitle").value;
	let bcontent = document.querySelector("#bcontent").value;
	let bname = document.querySelector("#bname").value;
	let bpassword = document.querySelector("#bpassword").value;
	console.log(btitle);
	console.log(bcontent);
	console.log(bname);
	console.log(bpassword);
		$.ajax({
		url : "http://localhost:8080/jsptest/board/write" , 
		type : "POST",
		data : { 
			"btitle" : btitle ,
			"bcontent" : bcontent ,
			"bname" : bname ,
			"bpassword" : bpassword 
		} , 
		success : function( re ){
			console.log(re)
			if(re){
				alert('글등록 성공 ');
				//location.href="../board/write.html"
			}
			else{ alert('글등록 실패 : [관리자에게문의]') }
		}
	})
}