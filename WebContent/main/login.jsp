<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<link href="/Baegopang/css/bootstrap.min.css" rel="stylesheet">
<title>Insert title here</title>
<style type="text/css">
	div.padding{
		padding: 15px;
	}
	div.difPadding{
		padding: 30px;
	}
</style>
<script type="text/javascript">
  $(function(){
	  
  });
</script>
</head>
<body>
	<jsp:include page="header.jsp"/>
	<img alt="cartList" src="/KAKAO2/img/loginmainFont.png" style="width: 100%; height: 100%;">
	<div class="mainDiv" align="center" style="margin: 30px auto; width: 500px; height: 500px; border: 1px solid #D5D5D5;">
		<h1 style="padding: 30px;" align="center">KAKAO �α���</h1>
			<div class="input-group">
				<div class="difPadding"><input type="text" id="id" class="form-control" placeholder="īī������(email)"></div>
				<div class="difPadding"><input type="text" id="pw" class="form-control" placeholder="��й�ȣ(4~16�ڸ�)"></div>
				<div class="padding"><input type="checkbox" id="idSave">īī������ ����</div>
				<div class="padding"><a href=""><button type="button" class="btn btn-info" style="width: 196px;">�α���</button></a></div>
			</div>
		<hr style="width: 450px; margin-top: 50px;">
			<div class="bottom-group">
				<a href="#" style="padding-right: 130px;">ȸ������</a>
				<a href="#">īī������ ã��</a>
				<a href="#">��й�ȣ �缳��</a>
			</div>
	</div>
	
	<jsp:include page="footer.jsp"/>
</body>
</html>