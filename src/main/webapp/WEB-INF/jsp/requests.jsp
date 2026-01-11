<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
	<h1>All Requests</h1>
	<table class="table">
		<thead>
			<tr>
				<th>Request Id</th>
				<th>Username</th>
				<th>Email</th>
				<th>Date</th>
				<th>Time</th>
				<th></th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${requests}" var="requests">
				<tr>
					<td>${requests.id}</td>
					<td>${requests.username}</td>
					<td>${requests.email}</td>
					<td>${requests.date}</td>
					<td>${requests.time}</td>

					<td>
                        <c:if test="${requests.status == 'PENDING'}">
                            <form action="/approve/${requests.id}" method="post" style="display:inline;">
                                <button class="btn btn-success btn-sm">Approve</button>
                            </form>

                            <form action="/reject/${requests.id}" method="post" style="display:inline;">
                                <button class="btn btn-danger btn-sm">Reject</button>
                            </form>
                        </c:if>

                        <c:if test="${requests.status != 'PENDING'}">
                            <span class="badge bg-secondary">${req.status}</span>
                        </c:if>
                    </td>

				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<%@ include file="common/footer.jspf"%>