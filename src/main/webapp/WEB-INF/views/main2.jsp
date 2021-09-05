<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Hugo 0.80.0">
    <title>Study CbgMall - Bootstrap v4.6</title>
    <style>
.bd-navbar {
  position: sticky;
  top: 0;
  z-index: 1071;
  min-height: 4rem;
  box-shadow: 0 0.5rem 1rem rgba(0,0,0,.05), inset 0 -1px 0 rgba(0,0,0,.1);
}
.bd-sidebar {
  position: sticky;
  top: 4rem;
  z-index: 1000;
  height: calc(100vh - 4rem);
  background: #eee;
  border-right: 1px solid rgba(0,0,0,.1);
  overflow-y: auto;
  min-width: 160px;
  max-width: 220px;
}
.bd-sidebar .nav {
  display: block;
}
.bd-sidebar .nav>li>a {
  display: block;
  padding: .25rem 1.5rem;
  font-size: 90%;
}
</style>

<%@include file="/WEB-INF/views/common/config.jsp" %>
<script>
	var message = '${status}';
	
	if(message == 'loginSuccess'){
		alert('로그인이 되었읍니다.');
	}else if(message == 'loginIDFail'){
		alert('아이디가 틀립니다.');
	}else if(message == 'loginPWFail'){
		alert('비밀번호가 틀립니다.');
	}else if(message == 'logout'){
		alert('로그아웃되었읍니다.');
	}else if(message == 'modifySuccess'){
		alert('회원수정이 되었읍니다.');
	}else if(message == 'insertSuccess'){
		alert('회원가입이 되었읍니다.');
	}else if(message == 'regdelete'){
		alert('회원삭제가 되었읍니다.');
	}

</script>
   
<meta name="theme-color" content="#563d7c">

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>

  </head>
  <body>
    
<!-- nav.jsp -->
<%@include file="/WEB-INF/views/common/nav.jsp" %>

<div class="container-fluid">
	<div class="row flex-nowrap">
		<div class="col-3 bd-sidebar">
			<ul class="nav">
		        <li><a>Side 1</a></li>
		        <li><a>Side 2</a></li>
		        <li><a>Side 3</a></li>
		        <li><a>Side 4</a></li>
		        <li><a>Side 5</a></li>
		        <li><a>Side 6</a></li>
		        <li><a>Side 7</a></li>
		        <li><a>Side 8</a></li>
	      </ul>
      	<br>
		</div>
		
		<main role="main" class="container">

		  <div class="starter-template">
		    <h1>Bootstrap starter template</h1>
		    <p class="lead">Use this document as a way to quickly start any new project.<br> All you get is this text and a mostly barebones HTML document.</p>
		  </div>

		</main><!-- /.container -->
	</div>
</div>



      
  </body>
</html>