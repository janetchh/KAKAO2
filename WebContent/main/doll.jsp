<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style>
div#outDiv {
	width: 100%;
}

div.maindiv {
	margin: 50px 200px 50px 200px;
	margin-bottom: 100px; 
}

div.gallery {
	margin: 30px;
	border: 1px solid #ccc;
	float: left;
	width: 300px;
	height: 300px;
}

div.gallery:hover {
	border: 3px solid #5bc0de;
}

div.gallery img {
	width: 100%;
	height: auto;
}

div.desc {
	padding: 2px;
	text-align: center;
}
</style>
<script src="https://code.jquery.com/jquery-2.2.4.min.js"></script>
<script type="text/javascript">
	$(function() {

	});
</script>
</head>
<body>
	<jsp:include page="header.jsp" />

	<img alt="dollmain" src="/KAKAO2/img/dollmainFont.jpg" style="width: 100%; height: 100%;">
	<div id="outDiv">
		<div class="maindiv" align="center">
				<c:forEach var="i" items="${productList}">
						<div class="gallery">
							<a target="_blank" href="info.do?cmd=productInfo&prono=${i.prono}"> <img src="/KAKAO2/img/doll/25_35cm/${i.mainimg}" alt="${i.proname}" width="600" height="400">
							<div class="desc">${i.proname}</div>
							<div class="desc">${i.price}</div>
							</a>
							
						</div>
						<%-- 
						<div class="gallery">
							<a target="_blank" href=""> <img src="/KAKAO2/img/doll/mini/${i.mainimg}" alt="${i.proname}" width="600" height="400">
							</a>
							<div class="desc">Add a description of the image here</div>
						</div>
						
						<div class="gallery">
							<a target="_blank" href=""> <img src="/KAKAO2/img/doll/mini/${i.mainimg}" alt="${i.proname}" width="600" height="400">
							</a>
							<div class="desc">Add a description of the image here</div>
						</div>
						
						<div class="gallery">
							<a target="_blank" href=""> <img src="/KAKAO2/img/doll/mini/${i.mainimg}" alt="${i.proname}" width="600" height="400">
							</a>
							<div class="desc">Add a description of the image here</div>
						</div>
						 --%>
				</c:forEach>
		</div>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>