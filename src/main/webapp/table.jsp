<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//request객체가 기본적으로 내장
	String Col=request.getParameter("c");
	String Row=request.getParameter("r");
	int nCol=Integer.parseInt(Col);
	int nRow=Integer.parseInt(Row);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=nCol %>
	<%=nRow %>
	<a href='/helloweb'>홈가기</a>
	<br/>
	<br/>
	<table border='2' cellspacing='0' cellpadding='2'>
		<%
			for(int i=0;i<nRow;++i){		
		%>
		<tr>
			<%
				for(int j=0;j<nCol;++j){
			%>
				<td>cell(<%=i %>,<%=j %>)</td>
			<% 
				} 
			%>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>