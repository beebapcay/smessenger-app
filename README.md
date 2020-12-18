# **ChatAppProject**

## (CSC13102) LẬP TRÌNH ỨNG DỤNG JAVA

## ĐỒ ÁN CUỐI KÌ

# Simple Chat Socket Application

```
GVHD: Nguyễn Văn Khiết
```
```
Thực hiện bởi: Dương Tấn Phát - 18127175
```

## Mục lục

-	1 Giới thiệu chung
	- 	1.1 Đăng nhập / Đăng ký
	- 	1.2 Xem và cập nhật thông tin cá nhân
	- 	1.3 Chat riêng tư với các thành viên online
	- 	1.4 Truyền gửi File khi chat
-	2 Định nghĩa giao thức cho từng chức năng
-	3 Thiết kế chương trình
	-	3.1 Công nghệ sử dụng
	-	3.2 Kiến trúc và mô hình ứng dụng
	-	3.3 Các class chính
-	4 Đánh giá kết quả thực hiện
	-	4.1 Kết quả đạt được
	-	4.2 Hạn chế
-	5 Lời kết

## 1 Giới thiệu ứng dụng

Ứng dụng là phần mềm cho phép hai hay nhiều người dùng có thể giao tiếp với nhau với các
tính năng chính:  đăng ký, đăng nhập, tạo chat riêng tư, truyền gửi file trong lúc chat, cập nhật thông tin cá nhân, xem thông tin cá nhân
Ứng dụng  này cho phép người dùng đăng nhập vào ứng dụng khi biết IP và port của server.

### 1.1 Đăng nhập

Chức năng này cho phép user đăng nhập vào tài khoản đã tạo của mình để bắt đầu.

### 1.2 Đăng ký

Chức năng này cho phép user đăng ký một  tài khoản mới  để bắt đầu.

### 1.3 Xem và cập nhật thông tin cá nhân

Chức năng cho phép user xem lại thông tin cá nhân của mình và có thể cập nhật lại nếu cần thiết.

### 1.2 Chat riêng tư

Chức năng này cho phép user tạo hội thoại riêng tư và gửi tin trực tiếp tới user khác. Một user
có thể nhắn tin trực tiếp với nhiều user trong cùng một thời điểm. 

### 1.3 Truyền gửi file

Chức năng này cho phép user gửi và nhận một số file với định dạng và kích thước được quy định trước bởi nhà phát triển trong chat riêng tư với user khác khi được cho phép.

