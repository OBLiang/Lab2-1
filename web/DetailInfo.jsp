<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: sshss
  Date: 2017/10/7
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>RESULT</title>
</head>
<body>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <link href="css/BList.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div id="MainLogin">
    <table border="1" background="/images/TaBG.png">
        <tr>
            Information
        </tr>
        <tr>
            <td>ISBN</td>
            <td>Title</td>
            <td>AuthorID</td>
            <td>Publisher</td>
            <td>PublishDate</td>
            <td>Price</td>
        </tr>

        <s:iterator value="#request.booklist" var="temp"><tr>

            <td><s:property value="#temp.ISBN"/></td>
            <td><s:property value="#temp.Title"/></td>
            <td><s:property value="#temp.AuthorID"/></td>
            <td><s:property value="#temp.Publisher"/></td>
            <td><s:property value="#temp.PublishDate"/></td>
            <td><s:property value="#temp.Price"/></td>
        </tr>
        </s:iterator>
        <tr>
        <td>Name</td>
        <td>Age</td>
        <td>Country</td>
        </tr>
        <s:iterator value="#request.Authorlist" var="temp"><tr>
            <td><s:property value="#temp.Name"/></td>
            <td><s:property value="#temp.Age"/></td>
            <td><s:property value="#temp.Country"/></td>
        </tr>
        </s:iterator>

    </table>
</div>
<button  id="TurnBack" onclick="window.location.replace('/');"   style=" width:30%; height:30px; font-size:24px;align:'center'; ">
    Back
</button>
</body>
<section id="h1" class="jawbone-takeover-minimulti jawbone-hero"><i class="jawbone-hero-image"
                                                                    data-hero-image-fixed="true" data-hero-image-fade="true" data-hero-min-opacity=".3"
                                                                    style="opacity: 1.05;"></i></section>
</html>
