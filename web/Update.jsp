<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="a" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: sshss
  Date: 2017/10/8
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update</title>
</head>
<body>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <link href="css/BList.css" rel="stylesheet" type="text/css" />
</head>
<div id="MainLogin">
    <table background="/images/TaBG.png">
        <form action="update">
            <tr>
                <td>ISBN</td>
                <td>Title</td>
                <td>Publisher</td>
                <td>PublishDate</td>
                <td>Price</td>
            </tr>
            <s:iterator value="#request.booklist" var="temp">
            <tr>
                <td><input name="nISBN" type="text" value="<s:property value="#temp.ISBN"/>"></td>
                <td><input name="nTitle" type="text" value="<s:property value="#temp.Title"/>"></td>
                <td><input name="nPublisher" type="text" value="<s:property value="#temp.Publisher"/>"></td>
                <td><input name="nPublishDate" type="text" value="<s:property value="#temp.PublishDate"/>"></td>
                <td><input name="nPrice" type="text" value="<s:property value="#temp.Price"/>"></td>
                <td><p hidden><input name="ISBN1" type="text" value="<s:property value="#temp.ISBN"/>"></p></td>
            </tr>
            </s:iterator>
            <tr>
                <td>Name</td>
                <td>Age</td>
                <td>Country</td>
            </tr>
            <a:iterator value="#request.Authorlist" var="tmp">
            <tr>
                <td><input name="nName" type="text" value="<a:property value="#tmp.Name"/>"></td>
                <td><input name="nAge" type="number" value="<a:property value="#tmp.Age"/>"></td>
                <td><input name="nCountry" type="text" value="<s:property value="#tmp.Country"/>"></td>
            </tr>
            </a:iterator>
            </tr>
            <tr>
                <td align="center">
                    <input type="submit" value="Submit" style="width:30%; height:30px; font-size:24px; " />
                </td>
            </tr>
        </form>
    </table>
</div>
</body>
<section id="h1" class="jawbone-takeover-minimulti jawbone-hero"><i class="jawbone-hero-image"
                                                                    data-hero-image-fixed="true" data-hero-image-fade="true" data-hero-min-opacity=".3"
                                                                    style="opacity: 1.05;"></i></section>
</html>
