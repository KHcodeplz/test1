<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width", initial-scale="1">
		<title>코드좀-Notice</title>
		
		<%@ include file="../common/header.jsp" %>
		
		
		<div class="contains"> 
			<div class="qna-section">
					<div class="qna-section-title">	
						Q&A &nbsp; <small>더 보기</small>
					</div>
					<hr>
					
					<!-- 
						QnA 게시판 글 양식 폼
						<hr>
						<div class="qna-section-content">
							<div class="qna-post">
								<div class="qna-post-hits">추천</div>
									<div class="img-qna-wrap">
										<div class="img-qna-wrap-content">
											<img class="img-qna" src="/codeplz/resources/images/qna_i.png"">	
										</div>
									</div>
								<div class="qna-post-title">					
									개발고수님 질문드립니다 질문드린다고요 예?	
									<div class="qna-post-answer">답변 3</div>
								</div>
								<div class="qna-post-content">
									내용입니다.
								</div>			
							</div>
						</div>
					 -->
					<div class="qna-section-content">
						<div class="qna-post">
							<div class="qna-post-hits">추천</div>
							<div class="img-qna-wrap" style="background-color: mediumturquoise;">
								<div class="img-qna-wrap-content">
									<img class="img-qna" src="/codeplz/resources/images/qna_i.png"">	
								</div>
							</div>
												
							<div class="qna-post-title">					
								개발고수님 질문드립니다 질문드린다고요 예?	
								<div class="qna-post-answer">답변 3</div>
							</div>
							<div class="qna-post-content">
								내용입니다. 스트링으로 받아와서 length로 길이 50까지 
							</div>
							<div class="qna-post-record">
								<span class="qna-post-writer">/ OOO / </span>
									님 께서 
								<span class="qna-post-writer"> / O 일 전에 or O 개월 / </span>
									전에
								<span class="qna-post-writer"> / 게시판 / </span>
									 에 올린 질문
							</div>			
						</div>
					</div>
					
					
					<hr />
					<div class="qna-section-content">
						<div class="qna-post">
							<div class="qna-post-hits">추천</div>
							<div class="img-qna-wrap" style="background-color: ivory;">
								<div class="img-qna-wrap-content">
									<img class="img-qna" src="/codeplz/resources/images/qna_i.png"">	
								</div>
							</div>
												
							<div class="qna-post-title">					
								개발고수님 질문드립니다 질문드린다고요 예?	
								<div class="qna-post-answer">답변 3</div>
							</div>
							<div class="qna-post-content">
								내용입니다.
							</div>			
						</div>
					</div>
					
					<hr>
						<div class="qna-section-content">
							<div class="qna-post">
								<div class="qna-post-hits">추천</div>
									<div class="img-qna-wrap" style="background-color: hotpink;">
										<div class="img-qna-wrap-content">
											<img class="img-qna" src="/codeplz/resources/images/qna_i.png"">	
										</div>
									</div>
								<div class="qna-post-title">					
									개발고수님 질문드립니다 질문드린다고요 예?	
									<div class="qna-post-answer">답변 3</div>
								</div>
								<div class="qna-post-content">
									내용입니다.
								</div>			
							</div>
						</div>
					<hr>
						<div class="qna-section-content">
							<div class="qna-post">
								<div class="qna-post-hits">추천</div>
									<div class="img-qna-wrap" style="background-color:coral;">
										<div class="img-qna-wrap-content">
											<img class="img-qna" src="/codeplz/resources/images/qna_i.png"">	
										</div>
									</div>
								<div class="qna-post-title">					
									개발고수님 질문드립니다 질문드린다고요 예?	
									<div class="qna-post-answer">답변 3</div>
								</div>
								<div class="qna-post-content">
									내용입니다.
								</div>			
							</div>
						</div>
					<hr>
						<div class="qna-section-content">
							<div class="qna-post">
								<div class="qna-post-hits">추천</div>
									<div class="img-qna-wrap"  style="background-color: lightgreen;">
										<div class="img-qna-wrap-content">	
											<img class="img-qna" src="/codeplz/resources/images/qna_i.png"">	
										</div>
									</div>
								<div class="qna-post-title">					
									개발고수님 질문드립니다 질문드린다고요 예?	
									<div class="qna-post-answer">답변 3</div>
								</div>
								<div class="qna-post-content">
									내용입니다.
								</div>			
							</div>
						</div>	
					
					<!-- 마지막 줄 hr임 지우지마세유 -->
					<hr>
			</div>
			<div class="notice-section">
				<div class="notice-section-title">	
					인기 게시글 &nbsp; <small><a href="">더 보기</a></small>
				</div>
				<br>
				<div class="notice-section-content" style="height:auto;">
						<div style="border: 1px solid gold;">
							<div>
								<span class="notice-content-title">게시판제목1</span>
							</div>
							<span>태그</span><br>
							<span>게시판제목1</span>
						</div>
						<div style="border: 1px solid lightgreen;">
							<div style="background-color: lightgreen;">
								<span class="notice-content-title">게시판제목2</span>
							</div>
							<span>태그</span><br>
							<span>게시판제목2</span>
						</div>
						<div style="border: 1px solid lightblue;">
							<div style="background-color: lightblue;">
								<span class="notice-content-title">게시판제목3</span>
							</div>
							<span>태그</span><br>
							<span>게시판제목3</span>
						</div>
						<div style="border: 1px solid lightcoral;">
							<div style="background-color: lightcoral;">
								<span class="notice-content-title">게시판제목4</span>
							</div>
							<span>태그</span><br>
							<span>게시판제목4</span>
						</div>
						<div style="border: 1px solid lightpink;">
							<div style="background-color: lightpink;">
								<span class="notice-content-title">게시판제목5</span>
							</div>
							<span>태그</span><br>
							<span>게시판제목5</span>
						</div>
						<div style="border: 1px solid fuchsia;">
							<div style="background-color: fuchsia;">
								<span class="notice-content-title">게시판제목6</span>
							</div>
							<span>태그</span><br>
							<span>게시판제목6</span>
						</div>
						<div style="border: 1px solid mediumturquoise;">
							<div style="background-color: mediumturquoise;">
								<span class="notice-content-title">게시판제목7</span>
							</div>
							<span>태그</span><br>
							<span>게시판제목7</span>
						</div>
						<div style="border: 1px solid mediumslateblue;">
							<div style="background-color: mediumslateblue;">
								<span class="notice-content-title">게시판제목8</span>
							</div>
							<span>태그</span><br>
							<span>게시판제목8</span>
						</div>			
				</div>
			</div>
			
		

		
		
		</div>
		
		
		
		
		<%@ include file="../common/footer.jsp" %>