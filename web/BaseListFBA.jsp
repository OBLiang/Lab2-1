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
            <td>ISBN</td>
            <td>Title</td>
            <td>Author</td>
            <td>Publisher</td>
            <td>PublishDate</td>
            <td>Price</td>
            <td></td>
            <td></td>
            <td></td>
        </tr>

        <s:iterator value="#request.booklist" var="temp"><tr>

            <td><s:property value="#temp.ISBN"/></td>
            <td><s:property value="#temp.Title"/></td>
            <td><s:property value="#temp.AuthorID"/></td>
            <td><s:property value="#temp.Publisher"/></td>
            <td><s:property value="#temp.PublishDate"/></td>
            <td><s:property value="#temp.Price"/></td>
            <td>
                <button  onclick="window.location.replace('/Info?AuthorID=<s:property value="#temp.AuthorID"/>&ISBN=<s:property value="#temp.ISBN"/>&Title=<s:property value="#temp.Title"/>');">
                    Info
                </button></td>
            <td>
                <button  onclick="window.location.replace('/Del?AuthorID=<s:property value="#temp.AuthorID"/>&ISBN=<s:property value="#temp.ISBN"/>&Title=<s:property value="#temp.Title"/>');">
                    Delete
                </button></td>
            <td>
            <button  onclick="window.location.replace('/Up?ISBN1=<s:property value="#temp.ISBN"/>');">
                update
            </button></td>
        </tr>
        </s:iterator>
    </table>
    <td>
        <tr>
            <button  id="New" onclick="window.location.replace('/New.jsp');"   style=" width:30%; height:30px; font-size:24px;align:'center'; ">
                Add
            </button>
        </tr>
        <tr>
            <button  id="TurnBack" onclick="window.location.replace('/');"   style=" width:30%; height:30px; font-size:24px;align:'center'; ">
                Back
            </button>
        </tr>
    </td>
</div>
</body>
</body>
<section id="h1" class="jawbone-takeover-minimulti jawbone-hero"><i class="jawbone-hero-image"
                                                                    data-hero-image-fixed="true" data-hero-image-fade="true" data-hero-min-opacity=".3"
                                                                    style="opacity: 1.05;"></i></section>
</html>
