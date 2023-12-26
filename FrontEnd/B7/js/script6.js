function kiemTraForm() {
    var emailInput = document.getElementById("email");
    var thongBaoLoi = document.getElementById("thongBaoLoi");

    // Kiểm tra định dạng email
    var pattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    var isValidEmail = pattern.test(emailInput.value);

    // Hiển thị thông báo lỗi nếu có
    if (!isValidEmail) {
        thongBaoLoi.textContent = "Email phải nhập đúng định dạng.";
    } else {
        thongBaoLoi.textContent = ""; // Xóa thông báo lỗi nếu hợp lệ
    }
}