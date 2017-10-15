
<%--
  Created by IntelliJ IDEA.
  User: sshss
  Date: 2017/10/7
  Time: 2:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>根据作者查询</title>
</head>
<body>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <link href="css/FBA.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div id="MainLogin">
    <table>
        <form action="FindByAuthors">
                <tr>
                    <td><br/></td>
                </tr>
                <tr>
                    <td>
                        <input name="AuthorID" onfocus="javascript:this.value=''" type="text" placeholder="Author Name" style="width:500px; height:30px; text-align:center; font-size:24px; " id="AuIn"/>
                    </td>
                </tr>
                <tr>
                    <td><br/></td>
                </tr>
                <tr>
                    <td align="center">
                        <input type="submit" value="Submit" style="width:30%; height:30px; font-size:24px; "  onclick="checkform()"/>
                    </td>
                </tr>
                <script type="text/javascript">
                    function checkform(){
                        if(document.getElementById('AuIn').value.length==0){
                            alert('EMPTY!');
                            document.getElementById('AuIn').focus();
                            return false;
                        }
                        if(document.getElementById('AuIn').value=="Author Name"){
                            alert('EMPTY!');
                            document.getElementById('AuIn').focus();
                            return false;
                        }
                    }
                </script>
                <tr>
                    <td><br/></td>
                </tr>
        </form>

    </table>
</div>
<div>
    <button  id="TurnBack" onclick="window.location.replace('/');"   style=" width:6%; height:30px; font-size:24px;align:'center'; ">
        Back
    </button>
</div>
</body>
</body>
<section id="h1" class="jawbone-takeover-minimulti jawbone-hero"><i class="jawbone-hero-image"
                                                                    data-hero-image-fixed="true" data-hero-image-fade="true" data-hero-min-opacity=".3"
                                                                    style="opacity: 1.05;"></i></section>
</html>