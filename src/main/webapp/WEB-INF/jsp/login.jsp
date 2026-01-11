<%@ include file="common/header.jspf"%>

<div class="container d-flex justify-content-center align-items-center" style="min-height: 80vh;">
    <div class="col-md-4">
        <div class="card shadow-lg border-0 rounded-4">
            <div class="card-body p-4">

                <h3 class="text-center mb-4 fw-bold">Login</h3>

                <c:if test="${param.error != null}">
                    <div class="alert alert-danger text-center">
                        Invalid username or password
                    </div>
                </c:if>

                <form method="post" action="/login">
                    <label class="form-label fw-semibold">Username</label>
                    <input type="text" name="username" class="form-control" required />

                    <label class="form-label fw-semibold">Password</label>
                    <input type="password" name="password" class="form-control" required />

                    <button type="submit" class="btn btn-primary w-100 mt-3">Login</button>
                </form>


                <div class="text-center mt-3 text-muted">
                    <small>2026 Book Appointment</small>
                </div>
            </div>
        </div>
    </div>
</div>

<%@ include file="common/footer.jspf"%>
