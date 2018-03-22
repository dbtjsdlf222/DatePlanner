<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="org.dateplanner.commons.Region"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.9/summernote.css">
	<title>글쓰기 - DatePlanner</title>
	<style>
		input[name="packageable"] {
			width:15px;
			height:15px;
		}
		input[name="title"] {
			height : 45px;
			line-height: 45px;
			text-indent :10px;
			font-size:30px;
		}
		input[name="title"]:FOCUS { outline-style: none; }
		table tr>td:NTH-CHILD(1) {
			min-width: 100px;
			padding: 20px;
			text-align: center;
			font-size:20px;
			font-weight: 800;
			background-color: #999;
		}
		.button:HOVER {
			background-color: #000;
			color: #fff;
		}
		.button {
			transition: .4s ease;
			float:right;
		    width: 200px;
		    height: 50px;
		    font-size: 23px;
		    font-weight: 600;
		    background: center;
		    border: 3px solid gray;
		}
	</style>
</head>
<body>
	<nav class="navbar navbar-inverse">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="../">DatePlanner</a>
			</div>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="user/mypage"><span
						class="glyphicon glyphicon-user"></span><strong>${loginInfo.nickname}</strong>로
						로그인중</a></li>
				<li><a href="user/logout">로그아웃</a></li>
			</ul>
		</div>
	</nav>

	<div class="container">
		<form action="doWrite" method="POST">
			<table border="1" style="width: 100%; border-collapse: collapse">
				<tr><td>제목</td><td><input name="title" size="50" placeholder="제목"></td></tr>
				<tr>
					<td>내용</td>
					<td><textarea id="summernote" name="content" required></textarea></td>
				</tr>
				<tr>
					<td>게시글 배경사진</td>
					<td><input id="imageInput" type="file"> <input id="image" type="hidden" name="image" readonly /></td>
				</tr>
					
				<tr>
				
					<td>해당 지역</td>
					<td>
						<select name="regionNo">
							<c:forEach var="region" items="${Region.LIST}" varStatus="status">
								<option value="${status.index}"<c:if test="${status.index eq regionNo}"> selected</c:if>>${region}</option>
							</c:forEach>
						</select>
					</td>
					<td >페키지 가능 여부</td><td><input type="checkbox" name="packageable"></td>
				</tr>
			</table>
				<input type="submit" class="button" value="글쓰기" />
		</form>
	</div>
	<script src="//code.jquery.com/jquery-3.3.1.min.js"></script>
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.9/summernote.min.js"></script>
	<script src="../js/FileUpload.js"></script>
	<script>
		var $image = $('#image'),
			$summernote = $('#summernote');
		
		$('#imageInput').change(function() { fileUpload('img/upload', this.files, function(json) { $image.val(json.result) }) });
		$('#summernote').summernote({
			height: 400,
			callbacks: {
				onImageUpload: function(files) {
					fileUpload('img/upload/list', files, function(json) {
						$.each(json, function() { $summernote.summernote('editor.insertImage', '/post/img/'+this) })
					})
				}
			}
		})
	</script>
</body>
</html>