function themPhanTu() {
    var danhSach = document.getElementById("danhSach");

    // Tạo một phần tử li mới
    var phanTuMoi = document.createElement("li");
    phanTuMoi.textContent = "Phần tử mới";

    // Thêm phần tử li vào danh sách
    danhSach.appendChild(phanTuMoi);
}

// Lấy nút "Thêm phần tử" và thêm sự kiện click
var nutThem = document.getElementById("btnThem");
nutThem.addEventListener("click", themPhanTu);