var phanTu = document.getElementById("phamVi");
var nutAn = document.getElementById("btnAn");
var nutHien = document.getElementById("btnHien");

// Thêm sự kiện click cho nút Ẩn
nutAn.addEventListener("click", function() {
    phanTu.classList.add("hidden");
});

// Thêm sự kiện click cho nút Hiện
nutHien.addEventListener("click", function() {
    phanTu.classList.remove("hidden");
});