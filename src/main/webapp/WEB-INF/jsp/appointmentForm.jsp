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
                        <select name="time" class="form-select" required>
                                <option value="">-- Select Slot --</option>

                                <!-- Morning -->
                                <option value="10:00">10:00 - 10:30</option>
                                <option value="10:30">10:30 - 11:00</option>
                                <option value="11:00">11:00 - 11:30</option>
                                <option value="11:30">11:30 - 12:00</option>

                                <!-- Afternoon -->
                                <option value="12:00">12:00 - 12:30</option>
                                <option value="12:30">12:30 - 1:00</option>
                                <option value="13:00">1:00 - 1:30</option>
                                <option value="13:30">1:30 - 2:00</option>

                                <!-- Lunch break skipped: 2:00 - 3:00 -->

                                <!-- Evening -->
                                <option value="15:00">3:00 - 3:30</option>
                                <option value="15:30">3:30 - 4:00</option>
                                <option value="16:00">4:00 - 4:30</option>
                                <option value="16:30">4:30 - 5:00</option>
                            </select>
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
