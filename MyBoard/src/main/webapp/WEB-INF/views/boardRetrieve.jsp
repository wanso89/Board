<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	작성자 : ${boardList.author}<br>
	작성일 : ${boardList.writeday}<br>
	조회수 : ${boardList.readCnt}<br>
	글제목 : <input type="text" name="title" value="${boardList.title}"><br>
	글내용 : <br><textarea rows="40" cols="40">${boardList.content}</textarea>
</body>
</html>