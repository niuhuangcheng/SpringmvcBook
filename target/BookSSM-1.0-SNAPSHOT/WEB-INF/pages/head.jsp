<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false" %>
<div id="divhead">
    <table cellspacing="0" class="headtable">
        <tr>
            <td><a href="index.jsp">
                <img src="${pageContext.request.contextPath}/static/images/logo.png"
                                         width="95" height="30" border="0"/> </a>
            </td>
            <td style="text-align:right">
                <img src="${pageContext.request.contextPath}/static/images/cart.gif"
                                              width="26" height="23" style="margin-bottom:-4px"/>&nbsp;<a
                    href="${pageContext.request.contextPath}/cart/cart">购物车</a> |
                   <a href="#">帮助中心</a> | <a
                    href="${pageContext.request.contextPath}/user/myAccount">我的帐户</a>
                | <a href="${pageContext.request.contextPath}/user/register">新用户注册</a>
            </td>
        </tr>
    </table>
</div>