<%@ page import="game.Game" %>
<%@ page import="game.State" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <% Game game = (Game) request.getSession().getAttribute("game");%>

</body>
</html>
