<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><dec:title default="Danh sách sản phẩm" /></title>
</head>
<body>
	<div class="main-content">
		<form action="<c:url value='/admin-new' />" method="get"
			accept-charset="utf-8" id="formSubmit">
			<div class="main-content-inner">
				<div class="breadcrumbs ace-save-state" id="breadcrumbs">
					<ul class="breadcrumb">
						<li><i class="ace-icon fa fa-home home-icon"></i> <a href="#">Trang
								chủ</a></li>
					</ul>
					<!-- /.breadcrumb -->
				</div>
				<div class="page-content">
					<div class="row">
						<div class="col-xs-12">
							<div class="row">
								<div class="col-xs-12">
									<div class="table-reponsive">
										<table class="table table-bordered">
											<thead>
												<tr>
													<th>Tiêu đề bài viết</th>
													<th>detail</th>
													<th>Trạng Thái</th>
												</tr>
											</thead>
											<tbody>
												<c:forEach var='item' items="${model.data}">
													<tr>
														<td>${item.title}</td>
														<td>${item.detal}</td>
														<td>${item.status}</td>
													</tr>
												</c:forEach>
											</tbody>
										</table>
										<ul class="pagination" id="pagination"></ul>
										<input type="hidden" name="page" value="" id="page">
										<input type="hidden" name="maxPageItem" value="" id="maxPageItem">
										<input type="hidden" name="sortName" value="" id="sortName">
										<input type="hidden" name="sortBy" value="" id="sortBy">
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
		</form>
	</div>
	<script type="text/javascript">
		var totalPage = ${model.totalPage};
		var currentPage = ${model.page};
		var limit = 3;
		$(function() {
			window.pagObj = $('#pagination').twbsPagination({
				totalPages : totalPage,
				visiblePages : 10,
				startPage : currentPage,
				onPageClick : function(event, page) {
					if (currentPage != page) {
						$("#sortName").val("title");
						$("#sortBy").val("desc");
						$("#page").val(page);
						$("#maxPageItem").val(limit);
						$("#formSubmit").submit();
					}
				}
			})
		});
	</script>

</body>
</html>