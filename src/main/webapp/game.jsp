<%@ page import="game.Game" %>
<%@ page import="game.State" %>
<%--
  Created by IntelliJ IDEA.
  User: sgalsant
  Date: 5/12/20
  Time: 8:16
  To change this template use File | Settings | File Templates.
--%>
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
