<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="dto.Kadais" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%  
List<Kadais> list=(ArrayList<Kadais>)request.getAttribute("list");
for(Kadais s :list){
%>
名前:<%=s.getName() %><p>
年齢:<%=s.getAge() %><p>
性別:<%=s.getGender() %><p>
電話番号:<%=s.getTell() %><p>
メール:<%=s.getMail() %><p>
	<%} %>
<a href="./" class="button">戻る</a>
</body>
</html>