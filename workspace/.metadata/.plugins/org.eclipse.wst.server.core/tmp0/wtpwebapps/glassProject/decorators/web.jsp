<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title><dec:title default="Trang Chủ" /></title>
	<link rel="stylesheet"
	href="<c:url value='/template/web/css/base.css' />" type="text/css"
	media="all">
	<link rel="stylesheet"
	href="<c:url value='/template/web/css/vendor.css'/>" type="text/css"
	media="all">
	<link rel="stylesheet"
	href="<c:url value='/template/web/css/main.css' />" type="text/css"
	media="all">
	<link rel="stylesheet"
	href="<c:url value='/template/web/css/font-awesome.min.css' />" type="text/css"
	media="all">
	<link rel="stylesheet"
	href="<c:url value='/template/web/css/fonts.css' />" type="text/css"
	media="all">
	<script src="<c:url value='/template/web/js/modernizr.js' />"></script>
	<script src="<c:url value='/template/web/js/pace.min.js' />"></script>




</head>
<body id="top">



	<section class="s-pageheader s-pageheader--home">
		<!-- header -->
		<%@include file='/common/web/header.jsp'%>
		<!-- header -->

		<!-- main -->
		<dec:body />
		<!-- main -->

		<!-- footer -->
		<%@include file='/common/web/footer.jsp'%>
		<!-- footer -->
	<!-- preloader
		================================================== -->
		<div id="preloader">
			<div id="loader">
				<div class="line-scale">
					<div></div>
					<div></div>
					<div></div>
					<div></div>
					<div></div>
				</div>
			</div>
		</div>



		<script src="<c:url value='/template/web/js/jquery-3.2.1.min.js' />"></script>
		<script src="<c:url value='/template/web/js/plugins.js' />"></script>
		<script src="<c:url value='/template/web/js/main.js' />"></script>
		<script
		src="<c:url value='/template/web/js/js-id=UA-23581568-13.js' />"></script>

		<script>
			window.dataLayer = window.dataLayer || [];
			function gtag() {
				dataLayer.push(arguments);
			}
			gtag('js', new Date());

			gtag('config', 'UA-23581568-13');
		</script>
	</body>
	</html>