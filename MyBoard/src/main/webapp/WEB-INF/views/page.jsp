<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


<c:set value="${pageDTO.curPage}" var="curPage"></c:set>
<c:set value="${pageDTO.perPage}" var="perPage"></c:set>
<c:set value="${pageDTO.totalCount}" var="totalCount"></c:set>
<c:set value="${totalCount / perPage}" var="pageNum"></c:set>
<c:set value="${pageDTO.searchName}" var="searchName"></c:set>
<c:set value="${pateDTO.searchValue}" var="searchValue"></c:set>

<c:if test="${totalCount % perPage != 0}">
	<c:set value="${pageNum+1}" var="pageNum"></c:set>
</c:if>

<c:forEach begin="1" end="${pageNum}" varStatus="status">
	<c:if test="${curPage == (status.index)}">
		${status.index}&nbsp;&nbsp;
	</c:if>
	
	<c:if test="${curPage != (status.index)}">
	 <a href="boardList?curPage=${status.index}&searchName=${searchName}&searchValue=${searchValue}">${status.index}</a>&nbsp;&nbsp;
    </c:if>
</c:forEach>
