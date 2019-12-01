<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/29
  Time: 20:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="jquery-3.4.1.js"></script>
    <script>
      $(function () {
         $("#input").blur(function () {
             var username = $(this).val();
             //alert(username);
             $.get("Servlet",{username:username},function (data) {
                 alert(data.u);

                 //ObjectMapper
               // $("#s").innerText =data.u;
             },"json");
         }) ;
      });



    </script>
</head>
<body>
    <form>
        <input type="text" id="input"/>
        <span id="s"></span>
        <input type="button" value="提交">

    </form>
</body>
</html>
