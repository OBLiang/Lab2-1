
<%--
  Created by IntelliJ IDEA.
  User: sshss
  Date: 2017/10/3
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New</title>
</head>
<body>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <link href="css/BList.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div class="MainLogin" id="MainLogin">
    <form action="AddNew">
        <table>
            <tr>
                <td><br/></td>
            </tr>
            <tr>
                <td>
                    <input name="ISBN" type="text" placeholder="ISBN" style="width:500px; height:30px; text-align:center; font-size:24px; "/>
                </td>
            </tr>
            <tr>
                <td>
                    <input name="Title" type="text" placeholder="Title" style="width:500px; height:30px; text-align:center; font-size:24px; "/>
                </td>
            </tr>
            <tr>
                <td>
                    <input name="Name" type="text" placeholder="Author" style="width:500px; height:30px; text-align:center; font-size:24px; "/>
                </td>
            </tr>
            <tr>
                <td>
                    <input name="Publisher" type="text" placeholder="Publisher" style="width:500px; height:30px; text-align:center; font-size:24px; "/>
                </td>
            </tr>
            <tr>
                <td>
                    <input name="PublishDate" type="text" placeholder="PublishDate" style="width:500px; height:30px; text-align:center; font-size:24px; "/>
                </td>
            </tr>
            <tr>
                <td>
                    <input name="Price" type="text" placeholder="Price" style="width:500px; height:30px; text-align:center; font-size:24px; "/>
                </td>
            </tr>
            <tr>
                <td align="center">
                    <input type="submit" value="Submit" style="width:30%; height:30px; font-size:24px; " />
                </td>
            </tr>
        </table>
    </form>
</div>
<button  id="TurnBack" onclick="window.location.replace('/');"   style=" width:6%; height:30px; font-size:24px;align:'center'; ">
    Back
</button>
</body>
</body>
<section id="h1" class="jawbone-takeover-minimulti jawbone-hero"><i class="jawbone-hero-image"
                                                                    data-hero-image-fixed="true" data-hero-image-fade="true" data-hero-min-opacity=".3"
                                                                    style="opacity: 1.05;"></i></section>
</html>
