<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="boardWrite" method="post">
		작성자 : <input type="text" name="author"><br>
		글제목 : <input type="text" name="title"><br>
		글내용 : <br><textarea rows="30" cols="30" name="content"></textarea><br>
			   <input type="submit" value="글쓰기">
	</form>

</body>
</html>