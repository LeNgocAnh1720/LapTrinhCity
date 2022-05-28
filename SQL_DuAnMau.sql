CREATE DATABASE DuAnMau_EduSys;
GO
USE DuAnMau_EduSys;
GO
CREATE TABLE NHANVIEN(
	MaNV NVARCHAR(20) PRIMARY KEY NOT NULL,
	MatKhau NVARCHAR(50) NOT NULL,
	HoTen NVARCHAR(100) NOT NULL,
	VaiTro BIT NOT NULL 
);
GO
CREATE TABLE CHUYENDE(
	MaCD NCHAR(5) PRIMARY KEY NOT NULL,
	TenCD NVARCHAR(50) NOT NULL,
	HocPhi FLOAT NOT NULL,
	ThoiGian INT NOT NULL,
	Hinh NVARCHAR(100) NOT NULL,
	MoTa NVARCHAR(255) NOT NULL,
	CHECK(HocPhi >=0 AND ThoiGian >0)
);
GO
CREATE TABLE KHOAHOC(
	MaKH INT IDENTITY(1,1) PRIMARY KEY NOT NULL,
	MaCD NCHAR(5) NOT NULL,
	HocPhi FLOAT NOT NULL,
	ThoiLuong INT NOT NULL,
	NgayKhaiGiang DATE NOT NULL,
	GhiChu NVARCHAR(255) NULL,
	MaNV NVARCHAR(20) NOT NULL,
	NgayTao DATE NOT NULL  DEFAULT GETDATE(),
	CHECK(HocPhi >=0 AND ThoiLuong >0),
	FOREIGN KEY(MaCD) REFERENCES CHUYENDE(MaCD) ON DELETE NO ACTION ON UPDATE CASCADE,
	FOREIGN KEY(MaNV) REFERENCES NHANVIEN(MaNV) ON DELETE NO ACTION ON UPDATE CASCADE
);
GO
CREATE TABLE NGUOIHOC(
	MaNH NCHAR(7) PRIMARY KEY NOT NULL,
	HoTen NVARCHAR(100) NOT NULL,
	GioiTinh BIT NOT NULL,
	NgaySinh DATE NOT NULL,
	Email NVARCHAR(50) NOT NULL,
	SoDT NVARCHAR(11) NOT NULL,
	GhiChu NVARCHAR(255) NULL,
	MaNV NVARCHAR(20) NOT NULL,
	NgayDangKy DATE NOT NULL DEFAULT GETDATE(),
	FOREIGN KEY(MaNV) REFERENCES NHANVIEN(MaNV) ON DELETE NO ACTION ON UPDATE CASCADE
);
GO
CREATE TABLE HOCVIEN(
	MaHV INT IDENTITY(1,1) NOT NULL PRIMARY KEY,
	MaKH INT NOT NULL,
	MaNH NCHAR(7) NOT NULL,
	Diem FLOAT NOT NULL,
	FOREIGN KEY (MaNH) REFERENCES NGUOIHOC(MaNH) ON UPDATE CASCADE ON DELETE CASCADE,
	FOREIGN KEY (MaKH) REFERENCES KHOAHOC(MaKH)  ON DELETE CASCADE
);
GO
INSERT INTO NHANVIEN(MaNV, MatKhau, HoTen, VaiTro) VALUES('HuongTT','123',N'Trần Thị Hường',1),
('LocTH','123',N'Thân Hoàng Lộc',1),
('HanhNP','123',N'Nguyễn Phương Hạnh',0),
('AnNT','123',N'Nguyễn Thành An',0),
('DatHT','123',N'Huỳnh Tấn Đạt',0);
GO
INSERT INTO CHUYENDE(MaCD, TenCD, HocPhi, ThoiGian, Hinh,MoTa) VALUES (N'JAV01', N'Lập trình Java cơ bản', 250, 90, N'GAME.png', N'JAV01 - Lập trình Java cơ bản'),
(N'JAV02', N'Lập trình Java nâng cao', 300, 90, N'JAAV.png', N'JAV02 - Lập trình Java nâng cao'),
(N'JAV03', N'Lập trình mạng với Java', 200, 70, N'JABS.png', N'JAV03 - Lập trình mạng với Java'),
(N'JAV04', N'Lập trình desktop với Swing', 200, 70, N'java.png', N'JAV04 - Lập trình desktop với Swing'),
(N'PRO01', N'Dự án với công nghệ MS.NET MVC', 300, 90, N'ADAV.png', N'PRO01 - Dự án với công nghệ MS.NET MVC'),
(N'PRO02', N'Dự án với công nghệ Spring MVC', 300, 90, N'ADBS.png', N'PRO02 - Dự án với công nghệ Spring MVC'),
(N'PRO03', N'Dự án với công nghệ Servlet/JSP', 300, 90, N'ADTE.png', N'PRO03 - Dự án với công nghệ Servlet/JSP'),
(N'PRO04', N'Dự án với AngularJS & WebAPI', 300, 90, N'ADUI.png', N'PRO04 - Dự án với AngularJS & WebAPI'),
(N'PRO05', N'Dự án với Swing & JDBC', 300, 90, N'ASNE.png', N'PRO05 - Dự án với Swing & JDBC'),
(N'PRO06', N'Dự án với WindowForm', 300, 90, N'CLCO.png', N'PRO06 - Dự án với WindowForm'),
(N'RDB01', N'Cơ sở dữ liệu SQL Server', 100, 50, N'DBBS.png', N'RDB01 - Cơ sở dữ liệu SQL Server'),
(N'RDB02', N'Lập trình JDBC', 150, 60, N'swing.png', N'RDB02 - Lập trình JDBC'),
(N'RDB03', N'Lập trình cơ sở dữ liệu Hibernate', 250, 80, N'sql.png', N'RDB03 - Lập trình cơ sở dữ liệu Hibernate'),
(N'SER01', N'Lập trình web với Servlet/JSP', 350, 100, N'sql.png', N'SER01 - Lập trình web với Servlet/JSP'),
(N'SER02', N'Lập trình Spring MVC', 400, 110, N'VBPR.png', N'SER02 - Lập trình Spring MVC'),
(N'SER03', N'Lập trình MS.NET MVC', 400, 110, N'WEBU.png', N'SER03 - Lập trình MS.NET MVC'),
(N'SER04', N'Xây dựng Web API với Spring MVC & ASP.NET MVC', 200, 70, N'net.png', N'SER04 - Xây dựng Web API với Spring MVC & ASP.NET MVC'),
(N'WEB01', N'Thiết kế web với HTML và CSS', 200, 70, N'html.png', N'WEB01 - Thiết kế web với HTML và CSS'),
(N'WEB02', N'Thiết kế web với Bootstrap', 0, 40, N'GAME.png', N'WEB02 - Thiết kế web với Bootstrap'),
(N'WEB03', N'Lập trình front-end với JavaScript và jQuery', 150, 60, N'css.png', N'WEB03 - Lập trình front-end với JavaScript và jQuery'),
(N'WEB04', N'Lập trình AngularJS', 250, 80, N'INMA.png', N'WEB04 - Lập trình AngularJS');
GO
INSERT INTO KHOAHOC(MaCD, HocPhi, ThoiLuong, NgayKhaiGiang, GhiChu, MaNV,NgayTao) VALUES (N'PRO02', 300, 90, CAST(0xBF3D0B00 AS Date), N'', N'HuongTT', CAST(0xB53D0B00 AS Date)),
(N'JAV04', 300, 90, CAST(0xDF3D0B00 AS Date), N'', N'HuongTT', CAST(0xB53D0B00 AS Date)),
(N'JAV04', 100, 50, CAST(0xFC3D0B00 AS Date), N'', N'HuongTT', CAST(0xB53D0B00 AS Date)),
(N'JAV04', 250, 80, CAST(0x103E0B00 AS Date), N'', N'HuongTT', CAST(0xB53D0B00 AS Date)),
(N'PRO04', 300, 90, CAST(0xD3400B00 AS Date), N'', N'HuongTT', CAST(0xE6400B00 AS Date)),
(N'JAV01', 300, 90, CAST(0xF6400B00 AS Date), N'Lập trình Java cơ bản', N'HuongTT', CAST(0x0A410B00 AS Date)),
(N'JAV02', 300, 90, CAST(0xF6400B00 AS Date), N'Lập trình Java nâng cao', N'HuongTT', CAST(0x0A410B00 AS Date)),
(N'JAV03', 200, 70, CAST(0xF6400B00 AS Date), N'Lập trình mạng với Java', N'HuongTT', CAST(0x0A410B00 AS Date)),
(N'JAV04', 200, 70, CAST(0xF6400B00 AS Date), N'Lập trình ứng dụng Desktop với Java', N'HuongTT', CAST(0x0A410B00 AS Date)),
(N'PRO01', 300, 90, CAST(0xF6400B00 AS Date), N'Lập trình .NET MVC', N'HuongTT', CAST(0x0A410B00 AS Date)),
(N'PRO02', 300, 90, CAST(0xF6400B00 AS Date), N'Lập trình Spring MVC', N'HuongTT', CAST(0x0A410B00 AS Date)),
(N'PRO03', 300, 90, CAST(0xF6400B00 AS Date), N'Làm dự án với Servlet và JSP', N'HuongTT', CAST(0x0A410B00 AS Date)),
(N'PRO04', 300, 90, CAST(0xF6400B00 AS Date), N'Làm dự án với REST API và AngularJS', N'HuongTT', CAST(0x0A410B00 AS Date)),
(N'JAV01', 300, 90, CAST(0xF4400B00 AS Date), N'Lập trình Java cơ bản', N'HuongTT', CAST(0x0A410B00 AS Date)),
(N'JAV01', 250, 90, CAST(0xF2400B00 AS Date), N'Lập trình Java cơ bản', N'HuongTT', CAST(0x0A410B00 AS Date));
GO
INSERT INTO NGUOIHOC(MaNH, HoTen, GioiTinh, NgaySinh, Email, SoDT, GhiChu , MaNV , NgayDangKy) VALUES('PS18555',N'Lê Ngọc Anh',1,'2002/11/11','anhlnps18555@fpt.edu.vn','0346064484',N'Tỉnh : Quảng Ngãi','HanhNP','2019/08/07'),
('PS18111',N'Lê Ngọc Bảo',1,'2002/11/30','baonl18111@fpt.edu.vn','0346162202',N'Tỉnh: Quảng Nam','HanhNP','2019/08/07'),
('PS18112',N'Lê Ngọc Minh',1,'2002/11/27','minhln18112@fpt.edu.vn','0236585456',N'Tỉnh: Quảng Bình','HanhNP','2019/08/07'),
('PS18113',N'Nguyễn Thành An',1,'2002/11/12','annt18113@fpt.edu.vn','0236584951',N'Tỉnh: Quảng Trị','HanhNP','2019/08/07'),
('PS18114',N'Huỳnh Tấn Đạt',1,'2002/08/25','datht18114@fpt.edu.vn','0125632654',N'Tỉnh: Phú Yên','HanhNP','2019/08/07'),
('PS18115',N'Phạm Hải Đăng',1,'2002/09/26','dangph18115@fpt.edu.vn','0236584951',N'Tỉnh: Long An','HanhNP','2019/08/07'),
('PS18116',N'Nguyễn Thiên Phú',1,'2002/10/27','phunt18116@fpt.edu.vn','0236963256',N'Thành phố Hồ Chí Minh','HanhNP','2019/08/07'),
('PS18117',N'Lương Minh Mẫn',1,'2002/12/28','manln18117@fpt.edu.vn','0145245620',N'Tỉnh: Long An','HanhNP','2019/08/07'),
('PS18118',N'Trần Thanh Vinh',1,'2002/02/12','vinhtt18118@fpt.edu.vn','0236598456',N'Tỉnh: Bến Tre','HanhNP','2019/08/07'),
('PS18119',N'Lê Văn Bằng',1,'2002/03/14','banglv18119@fpt.edu.vn','0125632654',N'Tỉnh: An Giang','HanhNP','2019/08/07'),
('PS18120',N'Trương Anh Thọ',1,'2002/01/15','thota18120@fpt.edu.vn','0565235469',N'Tỉnh: Bình Phước','HanhNP','2019/08/07'),
('PS18121',N'Nguyễn Phú Thịnh',1,'2002/04/16','thinhnp18121@fpt.edu.vn','0326598659',N'Thành phố Hồ Chí Minh','HanhNP','2019/08/07'),
('PS18122',N'Vũ Đức Thiện',1,'2002/05/17','thienvd18122@fpt.edu.vn','0125632654',N'Tỉnh: KonTum','HanhNP','2019/08/07'),
('PS18123',N'Võ Hoài Nam',1,'2002/06/29','namvh18123@fpt.edu.vn','0124545475',N'Tỉnh: Tiền Giang','HanhNP','2019/08/07'),
('PS18124',N'Trương Thanh Bình',0,'2002/07/05','binhtt18124@fpt.edu.vn','0261472512',N'Tỉnh: Thái Bình','HanhNP','2019/08/07'),
('PS18125',N'Nguyễn Hoàng Gia Thy',0,'2002/08/05','thynhg18125@fpt.edu.vn','0124578856',N'Tỉnh: Đồng Nai','HanhNP','2019/08/07'),
('PS18126',N'Vương Thanh Tuyền',0,'2002/09/07','tuyenvt18126@fpt.edu.vn','01111445152',N'Tỉnh: Lào Cai','HanhNP','2019/08/07'),
('PS18127',N'Lê Thị Thuý Bông',0,'2002/02/09','bongltt18127@fpt.edu.vn','0123659545',N'Tỉnh: Quảng Ngãi','HanhNP','2019/08/07'),
('PS18128',N'Nguyễn Nhật Lệ',0,'2002/11/10','lenn18128@fpt.edu.vn','0124587546',N'Tỉnh: Hải Dương','HanhNP','2019/08/07'),
('PS18129',N'Nguyễn Mỹ Thuỳ',0,'2002/06/20','thuynm18129@fpt.edu.vn','0236595845',N'Tỉnh: Quảng Ngãi','HanhNP','2019/08/07');
GO
INSERT INTO NGUOIHOC(MaNH, HoTen, GioiTinh, NgaySinh, Email, SoDT, GhiChu , MaNV , NgayDangKy) VALUES('PS19000',N'Lê Ngọc Anh',1,'2002/11/11','anhlnps18555@fpt.edu.vn','0346064484',N'Tỉnh : Quảng Ngãi','HanhNP','2020/02/03'),
('PS19001',N'Lê Hoàng Mỹ',1,'2002/11/11','anhlnps18555@fpt.edu.vn','0346064484',N'Tỉnh : Quảng Ngãi','HanhNP','2020/02/04'),
('PS19002',N'Lê Hoàng Mai',1,'2002/11/11','anhlnps18555@fpt.edu.vn','0346064484',N'Tỉnh : Quảng Ngãi','HanhNP','2020/02/04'),
('PS19003',N'Lê Bảo Hoàng',1,'2002/11/11','anhlnps18555@fpt.edu.vn','0346064484',N'Tỉnh : Quảng Ngãi','HanhNP','2020/02/07'),
('PS19004',N'Lê Minh Đăng',1,'2002/11/11','anhlnps18555@fpt.edu.vn','0346064484',N'Tỉnh : Quảng Ngãi','HanhNP','2020/07/04');
GO
INSERT INTO HOCVIEN(MaKH, MaNH, Diem) VALUES(6,'PS18112',0),
(6,'PS18114',0),
(6,'PS18115',0),
(6,'PS18117',0),
(6,'PS18118',0),
(6,'PS18119',0),
(14,'PS18120',0),
(14,'PS18121',0),
(14,'PS18122',0),
(15,'PS18123',0),
(15,'PS18124',0),
(2,'PS18112',0),
(2,'PS18114',0),
(2,'PS18115',0),
(2,'PS18117',0),
(3,'PS18118',0),
(4,'PS18119',0),
(3,'PS18121',0),
(3,'PS18122',0),
(3,'PS18124',0);
GO
CREATE PROC sp_ThongKeBangDiem (@MaKH int)
AS
BEGIN
	SELECT a.MaNH MaNH ,
			b.HoTen HoTen ,
			a.Diem Diem
	FROM HOCVIEN a JOIN NGUOIHOC b ON a.MaNH = b.MaNH
	WHERE a.MaKH = @MaKH
	ORDER BY a.Diem DESC
END
GO
CREATE PROC sp_ThongKeNguoiHoc
AS
BEGIN
	SELECT YEAR(NgayDangKy) Nam,
		   COUNT(*) SoLuong, 
		   MIN(NgayDangKy) DKSomNhat, 
		   Max (NgayDangKy) DKMuonNhat
	from NGUOIHOC
	group by YEAR(NgayDangKy)
END
GO
ALTER PROC sp_ThongKeDiemChuyenDe
AS
BEGIN
	SELECT c.TenCD TenCD,
	 COUNT(MaHV) SLHV,
	  MIN(b.Diem) DiemTN,
	  MAX(b.Diem) DiemCN,
	  ROUND(AVG(b.Diem),1) DiemTB
		
	FROM KHOAHOC a JOIN HOCVIEN b ON a.MaKH = b.MaKH
				JOIN CHUYENDE c ON a.MaCD = c.MaCD
	GROUP BY c.TenCD
END
GO
ALTER PROC sp_ThongKeDoanhThu (@Nam int)
AS
BEGIN
	SELECT TenCD ,
	   COUNT(DISTINCT a.MaKH) SoLop,
	   COUNT(b.MaHV) HocVien,
	   SUM(a.HocPhi) TongDoanhThu,
	   MIN(a.HocPhi) DoanhThuNhoNhat,
	   MAX(a.HocPhi) DoanhThuLonNhat,
	   ROUND(AVG(a.HocPhi),1) DoanhThuTB
	FROM KHOAHOC a JOIN HOCVIEN b ON a.MaKH = b.MaKH
			    JOIN CHUYENDE c ON a.MaCD = c.MaCD
	WHERE YEAR(NgayKhaiGiang) = @Nam
	GROUP BY TenCD
END
GO
-------------Thêm 1 email vào NhanVien----------------
ALTER TABLE NHANVIEN
ADD Email NVARCHAR(255)NULL
GO
UPDATE NHANVIEN SET Email = 'nguyenthanhan@gmail.com' WHERE MaNV LIKE 'AnNT'
GO
UPDATE NHANVIEN SET Email = 'huynhtandat@gmail.com' WHERE MaNV LIKE 'DatHT'
GO
UPDATE NHANVIEN SET Email = 'nguyenphuonghanh@gmail.com' WHERE MaNV LIKE 'HanhNP'
GO
UPDATE NHANVIEN SET Email = 'tranthihuong@gmail.com' WHERE MaNV LIKE 'HuongTT'
GO
UPDATE NHANVIEN SET Email = 'thanhoangloc@gmail.com' WHERE MaNV LIKE 'LocTH'
GO
ALTER TABLE NHANVIEN
ADD Images NVARCHAR(255) NULL
GO
UPDATE NHANVIEN SET Images = 'anh1.png' WHERE MaNV LIKE 'AnNT'
GO
UPDATE NHANVIEN SET Images = 'anh2.png' WHERE MaNV LIKE 'DatHT'
GO
UPDATE NHANVIEN SET Images = 'anh3.png' WHERE MaNV LIKE 'HanhNP'
GO
UPDATE NHANVIEN SET Images = 'anh4.png' WHERE MaNV LIKE 'HuongTT'
GO
UPDATE NHANVIEN SET Images = 'anh5.png' WHERE MaNV LIKE 'LocTH'
GO
UPDATE NHANVIEN SET Images = 'anh6.png' WHERE MaNV LIKE 'HanhNP'
GO
UPDATE NHANVIEN SET Images = 'anh7.png' WHERE MaNV LIKE 'HuongTT'
GO
UPDATE NHANVIEN SET Images = 'anh6.png' WHERE MaNV LIKE 'LocTH'
GO
ALTER TABLE NHANVIEN
ADD GioiTinh BIT NULL
GO
UPDATE NHANVIEN SET GioiTinh = 'Nam' WHERE MaNV LIKE 'AnhLN'
GO
UPDATE NHANVIEN SET GioiTinh = N'Nữ' WHERE MaNV LIKE 'ThyGia'
GO
UPDATE NHANVIEN SET GioiTinh = 'Nam' WHERE MaNV LIKE 'AnLN'
GO
UPDATE NHANVIEN SET GioiTinh = 'Nam' WHERE MaNV LIKE 'AnNT'
GO
UPDATE NHANVIEN SET GioiTinh = 'Nam' WHERE MaNV LIKE 'DatHT'
GO
UPDATE NHANVIEN SET GioiTinh = N'Nữ' WHERE MaNV LIKE 'HanhNP'
GO
UPDATE NHANVIEN SET GioiTinh = N'Nữ' WHERE MaNV LIKE 'HuongTT'
GO
UPDATE NHANVIEN SET GioiTinh = 'Nam' WHERE MaNV LIKE 'LocTH'
GO
UPDATE NHANVIEN SET GioiTinh = 'Nam' WHERE MaNV LIKE 'ManNT'
GO
UPDATE NHANVIEN SET GioiTinh = 'Nam' WHERE MaNV LIKE 'MM'
GO
UPDATE NHANVIEN SET GioiTinh = 'Nam' WHERE MaNV LIKE 'ThinhHP'
GO
SELECT*FROM NHANVIEN
SELECT DISTINCT GioiTinh FROM NHANVIEN

