<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
				
				<div class="line"></div>
				
				<div class="footer">
					<div class="row">
						<div class="col-md-7">
							<a href="#">About codeplz</a> |
							<a href="#">Help</a> |  
							<a href="#">이용약관</a> | 
							<a href="#">개인정보 취급방침</a>
						</div>
						<div class="col-md-5 text-right">
							© KH Academy H Afternoon Class<br /> 
							: Team codeplz<br />
							All rights reserved
						</div>
					</div>
				</div>
				
			</div> <!-- div[class=content] close -->
		</div> <!-- div[class=wrapper] close -->
		
		
		
		<%@ include file="signModal.jsp"%>
		<%@ include file="../board/insertCodeModal.jsp"%>
		
		<script src="<%=request.getContextPath()%>/resources/js/codeplz.js"></script>
	</body>
</html>