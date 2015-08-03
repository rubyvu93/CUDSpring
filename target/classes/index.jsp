<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<!-- Website template by freewebsitetemplates.com -->
<html>
<head>
<meta charset="UTF-8">
<title>Menu - Yay&#33;Koffee Website Template</title>

<style type="text/css">
<%@include  file ="css/style.css" %>
</style>
</head>
<body>
	<div id="page">
		<div>
			<div id="header">
				<a href="menu.html"><img src="images/logo.png" alt="Image"></a>
				<!--<ul>
					<li>
						<a href="index.html">Home</a>
					</li>
					<li class="current">
						<a href="menu.html">Menu</a>
					</li>
					<li>
						<a href="locations.html">Locations</a>
					</li>
					<li>
						<a href="blog.html">Blog</a>
					</li>
					<li>
						<a href="about.html">About Us</a>
					</li>
				</ul>-->
			</div>
			<div id="body">
				<div id="figure">
					<img src="images/headline-menu.jpg" alt="Image"> <span>Welcome
						ThaosCoffee</span>
				</div>
				<div>
					<a href="menu.html" class="whatshot">What&#39;s Hot</a>
					<div>
						<ul>

							<li>

								<div>
									<div class="m1">
										<ul style="border: solid 1px #dddddd; height: 59px;">
											<li>Table-index: <input type="text"
												style="margin-left: 9px;" name="" />
											</li>
											<li style="margin-left: 50px;">Date: <input type="text"
												style="margin-left: 47px;" name="" />

											</li>

										</ul>
										<ul
											style="border: solid 1px #dddddd; height: auto; margin-top: 20px;">
											<li>Coffee Type: <!--<input type="text" style="margin-left: 5px;" name=""/>-->
												<select id="country" name="country">
												<c:forEach items="${coffeelist}" var="coffeetype">
													<tr>
														<option value="">${coffeetype.name}</option>
													</tr>
												</c:forEach> 
											</select>
											</li>
											<li>Total Coffee: <input type="text"
												style="margin-left: 5px; width: 40px; margin-left: 37px;"
												name="" />


											</li>
											<li>Condiments: <!--<input type="text" style="margin-left: 5px;" name=""/>-->

												<select id="country" name="country">
													<option value="US">United Stated</option>
													<option value="CHINA">China</option>
													<option value="SG">Singapore</option>
													<option value="MY">Malaysia</option>
											</select>
											</li>
											<li>Total Condiments: <input type="text"
												style="margin-left: 5px; width: 40px;" name="" />

											</li>
											<input type="submit" value="Order" class="submitO" />

											<table border="0" class="show">
												<tr>
													<th>ID</th>
													<th>Name</th>
													<th>Price</th>
													<th>Total</th>
													<th>Count All</th>
												</tr>
												<tr>
													<td>1</td>
													<td>5</td>
													<td>5</td>
													<td>5</td>
													<td>5</td>
												</tr>
												<tr>
													<td>9</td>
													<td>5</td>
													<td>5</td>
													<td>5</td>
													<td>10</td>
												</tr>
												<tr>
													<td>9</td>
													<td>5</td>
													<td>5</td>
													<td>5</td>
													<td>10</td>
												</tr>
												<tr>
													<td>9</td>
													<td>5</td>
													<td>5</td>
													<td>5</td>
													<td>10</td>
												</tr>
												<tr>
													<td>9</td>
													<td>5</td>
													<td>5</td>
													<td>5</td>
													<td>10</td>
												</tr>
												<tr>
													<td>9</td>
													<td>5</td>
													<td>5</td>
													<td>5</td>
													<td>10</td>
												</tr>
												<tr>
													<td>9</td>
													<td>5</td>
													<td>5</td>
													<td>5</td>
													<td>10</td>
												</tr>
												<tr>
													<td>9</td>
													<td>5</td>
													<td>5</td>
													<td>5</td>
													<td>10</td>
												</tr>
												<tr>
													<td>9</td>
													<td>5</td>
													<td>5</td>
													<td>5</td>
													<td>10</td>
												</tr>
												<tr>
													<td>9</td>
													<td>5</td>
													<td>5</td>
													<td>5</td>
													<td>10</td>
												</tr>
											</table>
											<h4 style="float: right; margin-right: 40px;">Total All:
												50,000 VND</h4>

										</ul>
										<ul
											style="border: solid 1px #dddddd; height: auto; margin-top: 20px;">
											<div style="margin-top: 20px; margin-bottom: 20px;">
												<input type="submit" value="Print" class="submitI" /> <input
													type="submit" value="Pay" class="submitT" /> <input
													type="submit" value="Exit" class="submitE" />

											</div>
										</ul>
									</div>
							</li>
						</ul>
					</div>


				</div>
			</div>
			<div id="footer">
				<div>
					<a href="index.html"><img src="images/logo2.png" alt="Image"></a>
					<p class="footnote">
						&copy; Yay&#33;Koffee 2011.<br>All Rights Reserved.
					</p>
				</div>
				<div class="section">
					<ul>
						<li><a href="index.html">Home</a></li>
						<li class="current"><a href="menu.html">Menu</a></li>
						<li><a href="locations.html">Locations</a></li>
						<li><a href="blog.html">Blog</a></li>
						<li><a href="about.html">About Us</a></li>
					</ul>
					<div id="connect">
						<a href="http://freewebsitetemplates.com/go/facebook/"
							target="_blank" id="facebook">Facebook</a> <a
							href="http://freewebsitetemplates.com/go/twitter/"
							target="_blank" id="twitter">Twitter</a> <a
							href="http://freewebsitetemplates.com/go/googleplus/"
							target="_blank" id="googleplus">Google+</a> <a href="index.html"
							id="rss">RSS</a>
					</div>
					<p>
						This website template has been designed by <a
							href="http://www.freewebsitetemplates.com/">Free Website
							Templates</a> for you, for free. You can replace all this text with
						your own text. You can remove any link to our website from this
						website template, you&#39;re free to use this website template
						without linking back to us. If you&#39;re having problems editing
						this website template, then don&#39;t hesitate to ask for help on
						the <a href="http://www.freewebsitetemplates.com/forums/">Forums</a>.
					</p>
				</div>
			</div>
		</div>
	</div>
</body>
</html>