<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%--<%@ page trimDirectiveWhitespaces="true" %>--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head></head>
<body>

<table align="center" border="1" bgcolor="#a52a2a" >
    <tr align="center" style="color: crimson; size: 150px">
        <th>编号</th>
        <th>姓名</th>
        <th>生日</th>
        <th>区域</th>

    </tr>
    <tr align="center">
        <td>${student.id}</td>
        <td>${student.name}</td>
        <td>${student.birthday}</td>
        <td>${student.gradeId}</td>

    </tr>


</table>




</body>
</html>