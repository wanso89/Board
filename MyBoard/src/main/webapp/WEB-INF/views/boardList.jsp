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
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	$().ready(function(){
		
		$("#boardList").on('click',function(){
			location.href="boardList";
		});
		
		$("#writeUI").on('click',function(){
			location.href="writeUI";
		});
		
		$("#search").on('click keyup',function(){
			var value = $("#searchBox").val();
			var params = $("#boardForm").serialize();
			if(value.length == 0){
				alert('검색어를 입력하세요');
				return false;
			} else {
				$.ajax({
					url : "boardSearch",
					type : "post",
					data : params,
					success : function(result){
						var table = '<tr>';
						$.each(result,function(idx,data){
							table += `<td>data.num</td>`;
							table += `<td><a href=boardRetrieve?num=data.num>data.title</a></td>`;
							table += `<td>data.author</td>`
							table += `<td>data.writeday</td>`;
							table += `<td>data.readCnt</td>`;
							table += `</tr>`;
						});
							$("#tbody").html(table);
						}
					});
				}
			});
		});

</script>
</head>
<body>
	<form id="boardForm">
		<select name="searchName">
			<option value="author">작성자</option>
			<option value="title">글제목</option>
		</select>
		<input id="searchBox" type="text" name="searchValue">
		<button id="search">검색</button>
	</form>
	<table border="1">
		<thead>
			<tr>
				<th>글번호</th>
				<th>글제목</th>
				<th>글쓴이</th>
				<th>작성일</th>
				<th>조회수</th>
		</thead>
		<tbody id="tbody">
			<c:forEach items="${pageDTO.boardList}" var="boardList">
				<tr>
					<td>${boardList.num}</td>
					<td><a href="boardRetrieve?num=${boardList.num}">${boardList.title}</a></td>
					<td>${boardList.author}</td>
					<td>${boardList.writeday}</td>
					<td>${boardList.readCnt}</td>
					
			</c:forEach>
		</tbody>	
		<tfoot>
			<tr>
				<td colspan="5"><jsp:include page="page.jsp" flush="true"/></td>
			</tr>
		</tfoot>
	</table>
	<br>
	<br>
	<button id="writeUI">글쓰기</button>&nbsp;&nbsp;
	<button id="boardList">목록보기</button>
</body>
</html>