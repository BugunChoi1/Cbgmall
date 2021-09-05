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
    <title>CbgMall</title>

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
<%@ include file="/WEB-INF/views/common/nav.jsp" %>

<div class="row">

	<div class="col-3">
	<%@ include file="/WEB-INF/views/common/nav.jsp" %>
	</div>

	<div class="col-9">
	<br>
	<%@ include file="/WEB-INF/views/common/category_list.jsp" %>
	</div>
</div>

<main role="main" class=".container-fluid">

<div id="carouselExampleCaptions" class="carousel slide" data-ride="carousel">
  <ol class="carousel-indicators">
    <li data-target="#carouselExampleCaptions" data-slide-to="0" class="active"></li>
    <li data-target="#carouselExampleCaptions" data-slide-to="1"></li>
    <li data-target="#carouselExampleCaptions" data-slide-to="2"></li>
  </ol>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="https://media-exp1.licdn.com/dms/image/C4E1BAQEKz9v2K3Mweg/company-background_10000/0/1520372268389?e=2159024400&v=beta&t=fUIT5C44Zz425vBoKWw6oN5P-a--9wGQOFO_8p9LaFQ" class="d-block w-100" alt="...">
    </div>
    <div class="carousel-item">
      <img src="https://media.istockphoto.com/photos/denim-lets-get-back-to-basics-picture-id1014074006?k=6&m=1014074006&s=612x612&w=0&h=81hvENaCouwLjIC2ZagIOZH8dgREFDJ5tUFOU6WHRNM=" class="d-block w-100" alt="...">      
    </div>
    <div class="carousel-item">
      <img src="https://live-production.wcms.abc-cdn.net.au/fb7213b4a9ca1b79f3f71593e1ffb3e2?impolicy=wcms_crop_resize&cropH=1120&cropW=1989&xPos=11&yPos=531&width=862&height=485" class="d-block w-100" alt="...">      
    </div>
  </div>
  <a class="carousel-control-prev" href="#carouselExampleCaptions" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleCaptions" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
    	
</main>
<!-- /.container -->
	<%@include file="/WEB-INF/views/common/footer.jsp" %>

  </body>
</html>