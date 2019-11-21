<%--
  Created by IntelliJ IDEA.
  User: leon
  Date: 2019/10/19
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<%--
在jsp中使用 jsp：useBean 标签来实例化一个java类对象
--%>
<jsp:useBean id="person" class="com.JavaBean.Person" scope="page" />
<%--
    |-- <jsp:useBean> 表示 在JSP中要使用JavaBean
    |-- id: 表示生成的实例化对象，凡是在标签中看见了id，则肯定表示一个实例对象
    |-- class：此对象对应的包类名称
    |-- scope： 此JavaBean的保存范围，四种范围：page、request、session、application

    |-- person 对象在上面已经使用jsp：useBean 标签实例化了，
--%>
<%
person.setName("图解HTTP");
person.setSex("Man");
person.setAge(10);
person.setMarried(false);
%>
<html>
<head>
    <title>jsp:useBean 标签使用范例</title>
</head>
<body>
<%--  使用getXxx() 方法获取对象的属性值  --%>
    <h2>name    : <%=person.getName()%></h2>
    <h2>sex     : <%=person.getSex()%></h2>
    <h2>age     : <%=person.getSex()%></h2>
    <h2>married : <%=person.isMarried()%></h2>
</body>
</html>
