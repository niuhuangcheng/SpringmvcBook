<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>电子书城</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/main.css" type="text/css" />
<script type="text/javascript">
function submitData(){
	var form1 = document.getElementById("formdata");
	alert(form1);
	form1.submit();
}
</script>
</head>

<body class="main">
<%@include file="/WEB-INF/pages/head.jsp"%>
<%@include file="/WEB-INF/pages/menu_search.jsp" %>

	<div id="divpagecontent">
		<table width="100%" border="0" cellspacing="0">
			<tr>
				<td width="25%">
					<table width="100%" border="0" cellspacing="0"
						style="margin-top:30px">
						<tr>
							<td class="listtitle">我的帐户</td>
						</tr>
						<tr>
							<td class="listtd"><img src="images/miniicon.gif" width="9"
								height="6" />&nbsp;&nbsp;&nbsp;&nbsp; <a
								href="${pageContext.request.contextPath}/user/modifyuserinfo">用户信息修改</a></td>
						</tr>

						<tr>
							<td class="listtd"><img src="images/miniicon.gif" width="9"
								height="6" />&nbsp;&nbsp;&nbsp;&nbsp; <a href="${pageContext.request.contextPath}/order/orderlist">订单查询</a>
							</td>
						</tr>

						<tr>
							<td class="listtd"><img src="images/miniicon.gif" width="9"
								height="6" />&nbsp;&nbsp;&nbsp;&nbsp; <a href="#">用戶退出</a>
							</td>
						</tr>
					</table></td>
				<td>
					<div style="text-align:right; margin:5px 10px 5px 0px">
						<a href="${pageContext.request.contextPath}/">首页</a>&nbsp;&nbsp;&nbsp;&nbsp;&gt;&nbsp;&nbsp;&nbsp;<a
							href="${pageContext.request.contextPath}/user/myAccount">&nbsp;我的帐户</a>&nbsp;&nbsp;&nbsp;&nbsp;&gt;&nbsp;&nbsp;&nbsp;&nbsp;用户信息修改
					</div>





					<table cellspacing="0" class="infocontent">
						<tr>
							<td>
								<form action="ModifyUserInfoServlet" method="post"
								 id="formdata">
									<input type="hidden" name="id" value="${login_user.id}">
									<font color="red">${modify_error_msg }</font>
									<table width="100%" border="0" cellspacing="2" class="upline">
										<tr>
											<td style="text-align:right; width:20%">会员邮箱：</td>
											<td style="width:40%; padding-left:20px">${login_user.email}</td>
											<td>&nbsp;</td>


										</tr>
										<tr>
											<td style="text-align:right">会员名：</td>
											<td style="padding-left:20px">${login_user.username}</td>
											<td>&nbsp;</td>
										</tr>
										<tr>
											<td style="text-align:right">修改密码：</td>
											<td><input type="password" name="password"
												class="textinput"  value="${login_user.password}"/>
											</td>
											<td><font color="#999999">密码设置至少6位，请区分大小写</font>
											</td>
										</tr>
										<tr>
											<td style="text-align:right">重复密码：</td>
											<td><input type="password" class="textinput"
											value="${login_user.repassword}" />
											</td>
											<td>&nbsp;</td>
										</tr>
										<tr>
											<td style="text-align:right">性别：</td>
											<td colspan="2">&nbsp;&nbsp;<input type="radio"
												name="gender" value="男" ${login_user.gender=='男'?'checked':'' } /> 男
												&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
												type="radio" name="gender" value="女"  ${login_user.gender=='女'?'checked':'' }/> 女</td>
										 
										
										
										</tr>
										<tr>
											<td style="text-align:right">联系方式：</td>
											<td colspan="2"><input name="telephone" type="text"
												value="${login_user.telephone}" class="textinput" />
											</td>
										</tr>

										<tr>
											<td style="text-align:right">&nbsp;</td>
											<td>&nbsp;</td>
											<td>&nbsp;</td>
										</tr>
									</table>





									<p style="text-align:center">

										<input type="image" src="${pageContext.request.contextPath}/static/images/botton_gif_025.gif" border="0"
										onclick="submitData()">

									</p>
									<p style="text-align:center">&nbsp;</p>
								</form></td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</div>



	<jsp:include page="/WEB-INF/pages/foot.jsp"/>


</body>
</html>