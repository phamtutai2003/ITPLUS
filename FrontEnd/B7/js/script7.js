function xuLyForm() {
    var ten = document.getElementById("ten").value;
    var nhanTin = document.getElementById("nhanTin").checked;
    var gioiTinh;

    // Lấy giới tính được chọn
    var gioiTinhNam = document.getElementById("nam").checked;
    var gioiTinhNu = document.getElementById("nu").checked;

    if (gioiTinhNam) {
        gioiTinh = "Nam";
    } else if (gioiTinhNu) {
        gioiTinh = "Nữ";
    } else {
        gioiTinh = "Không xác định";
    }

    // Hiển thị thông tin trong alert
    alert("Tên: " + ten + "\nNhận tin tức: " + (nhanTin ? "Có" : "Không") + "\nGiới tính: " + gioiTinh);
}