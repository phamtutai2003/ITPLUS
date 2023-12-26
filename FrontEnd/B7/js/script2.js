function thayDoiNoiDung() {
    var element = document.getElementById("myText");
    element.innerHTML = "Nội dung đã được thay đổi!";
}

// Gọi hàm thay đổi nội dung sau 3000 milliseconds (3 giây)
setTimeout(thayDoiNoiDung, 3000);