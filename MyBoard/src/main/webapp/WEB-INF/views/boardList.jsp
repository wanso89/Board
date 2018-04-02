<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<thead>
			<tr>
				<th>글번호</th>
				<th>글제목</th>
				<th>글쓴이</th>
				<th>작성일</th>
				<th>조회수</th>
		</thead>
		<tbody>
			<c:forEach items="${boardList}" var="boardList">
				<tr>
					<td>${boardList.num}</td>
					<td>${boardList.title}</td>
					<td>${boardList.author}</td>
					<td>${boardList.writeday}</td>
					<td>${boardList.readCnt}</td>
					
			</c:forEach>
		</tbody>	
	</table>
</body>
</html>