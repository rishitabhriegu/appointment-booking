<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container d-flex justify-content-center align-items-center" style="min-height: 80vh;">
    <div class="col-md-5">
        <div class="card shadow-lg border-0 rounded-4">
            <div class="card-body p-4">

                <h3 class="text-center mb-4">Book Your Slot</h3>

                <form method="post" action="/appointment-booking">

                    <div class="mb-3">
                        <label class="form-label fw-semibold">Enter Your Name</label>
                        <input type="text" name="username" class="form-control" required />
                    </div>

                    <div class="mb-3">
                        <label class="form-label fw-semibold">Enter Email</label>
                        <input type="email" name="email" class="form-control" required />
                    </div>

                    <div class="mb-3">
                        <label class="form-label fw-semibold">Select Date</label>
                        <input type="date" name="date" class="form-control" required />
                    </div>

                    <div class="mb-3">
                        <label class="form-label fw-semibold">Select Time</label>
                        <input type="time" name="time" class="form-control" required />
                    </div>

                    <button type="submit" class="btn btn-primary w-100">
                        Book Appointment
                    </button>
                </form>

                <!-- Status Message -->
                <c:if test="${not empty status}">
                    <div class="alert alert-info text-center mt-3">
                        ${status}
                    </div>
                </c:if>

            </div>
        </div>
    </div>
</div>

<%@ include file="common/footer.jspf"%>
