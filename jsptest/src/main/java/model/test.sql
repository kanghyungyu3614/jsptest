drop database if exists jsptest;
create database jsptest;
use jsptest;
create table board(
	bno			int auto_increment primary key ,		-- 게시물번호[pk , autokey ] 
    btitle      varchar(50),                            -- 게시물제목 
    bcontent    varchar(100),                           -- 게시물내용 
	bname		varchar(50) NOT NULL , 			        -- 게시물작성자
    bpassword	varchar(50) NOT NULL , 					-- 게시물패스워드 
    bdate		datetime default now() NOT NULL ,	    -- 게시물 작성일 
	bpoint		int	default 0 NOT NULL					-- 게시물 조회수 
);