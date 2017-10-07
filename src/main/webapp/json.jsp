<%@ page language="java" pageEncoding="utf-8"%>
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="jquery-1.4.4.min.js"></script>
<script type="text/javascript">
	function req(){
		$.ajax({
			type:'post',
			url:'${pageContext.request.contextPath }/requestJson.action',
			contentType:'application/json;charset=utf-8',
			//数据格式是json串，商品信息
			data:'{"name":"手机","price":999}',
			success:function(data){//返回json结果
				alert(data);
			}
		});
	}
	function res() {
		$.ajax({
			type:'post',
			url:'${pageContext.request.contextPath }/responseJson.action',
			//请求是key/value这里不需要指定contentType，因为默认就 是key/value类型
			//contentType:'application/json;charset=utf-8',
			//数据格式是json串，商品信息
			data:'name=手机&price=999',
			success:function(data){//返回json结果
				alert(data.name);
			}
		})
	}
	
	function listCus() {
		$.ajax({
			type:'post',
			url:'${pageContext.request.contextPath }/listCus.action',
			//请求是key/value这里不需要指定contentType，因为默认就 是key/value类型
			//contentType:'application/json;charset=utf-8',
			//数据格式是json串，商品信息
			data:'name=手机&price=999',
			success:function(data){//返回json结果
				alert(data.name);
			}
		})
	}
</script>
</head>
<body>
<input type="button" onclick="req()" value="请求json，输出是json"/>
<input type="button" onclick="res()" value="请求key/value，输出是json"/>
<input type="button" onclick="listCus()" value="listCus"/>
</body>
</html>