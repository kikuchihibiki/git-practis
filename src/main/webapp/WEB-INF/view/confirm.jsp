<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="dto.Kadai" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>以下の内容で登録します。</p>
<%
   Kadai kadai=(Kadai)session.getAttribute("input_data");
%>
名前：<%=kadai.getName() %><br>
年齢：<%=kadai.getAge() %><br>
性別：<%=kadai.getGender() %><br>
電話番号：<%=kadai.getTell() %><br>
メール：<%=kadai.getMail() %><br>
パスワード：********<br>
<a href="KadaiExecuteServlet">OK</a><br>
	<a href="KadaiFormServlet">戻る</a>
</body>
</html>