function thayDoiMauSac(event) {
    var phanTu = event.target;
    // Mã màu sắc mới, ví dụ: màu đỏ
    var mauMoi = "red";
    phanTu.style.backgroundColor = mauMoi;
}

// Lặp qua mỗi phần tử có thể chọn được và thêm sự kiện click
var cacPhanTu = document.getElementsByClassName("color-changeable");
for (var i = 0; i < cacPhanTu.length; i++) {
    cacPhanTu[i].addEventListener("click", thayDoiMauSac);
}