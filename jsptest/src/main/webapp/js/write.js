// 실행함수 get요청함수 만들기



	let btitle = document.querySelector("#btitle").value;
	let bcontent = document.querySelector("#bcontent").value;
	let bname = document.querySelector("#bname").value;
	let bpassword = document.querySelector("#bpassword").value;
	console.log(btitle);
	console.log(bcontent);
	console.log(bname);
	console.log(bpassword);

function bwrite(){
	/* 
	<!--bno		    int 			-- 게시물번호 
    btitle      varchar(50),	-- 게시물제목  1
    bcontent    varchar(100),	-- 게시물내용  1
	bname		varchar(50) NOT NULL ,-- 게시물작성자 1
    bpassword	varchar(50) NOT NULL ,-- 게시물패스워드  1
    bdate		datetime default now() NOT NULL ,-- 게시물 작성일 
	bpoint		int	default 0 NOT NULL-- 게시물 조회수 -->
	*/
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
				alert('글삭제 성공 ');
				//location.href="../board/write.html"
			}
			else{ alert('글삭제 실패 : [관리자에게문의]') }
		}
	})
}