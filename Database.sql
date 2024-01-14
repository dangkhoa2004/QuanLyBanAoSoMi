create database BanAoSoMi
use BanAoSoMi
--drop database BanAoSoMi
----Tao Bang Role
/*
create table Role(
	ID_Role int identity(1,1) primary key not null,
	ID_Role bit primary key not null,
	Name_Role nvarchar(40),
	Status int not null -- 0: hien; 9: an
);
*/
--Tao Bang Staff
create table Staff(
	ID_Staff int identity(1,1) primary key not null,
	Code_Staff uniqueidentifier default newid() not null,
	Phone nvarchar(10) not null,
	Pass nchar(20) not null,
	Name_Staff nvarchar(75) not null,
	Email varchar(50) not null,
	Role int not null,
	--ID_Role int not null,
	--ID_Role bit not null,
	Status int  not null, -- 0: hien; 9: an
	--foreign key (ID_Role) references Role(ID_Role)
);

--Tao Bang Customer
create table Customer(
	ID_Customer int identity(1,1) primary key not null,
	Code_Customer uniqueidentifier default newid() not null,
	Customer_name nvarchar(75) not null,
	Email varchar(50) not null,
	Phone nvarchar(10) not null,
	Address nvarchar(255) not null,
	Status int not null
);

--Tao Bang Product
create table Product(
	ID_Product int identity(1,1) primary key not null,
	Code_Product uniqueidentifier default newid() not null,
	Product_name nvarchar(75) not null,
	Status int not null
);

--Tao Bang Size
create table Size(
	ID_Size int identity(1,1) primary key not null,
	Code_Size uniqueidentifier default newid() not null,
	Size int not null,
	Describe_Size nvarchar(255) null,
	Status int not null
);

--Tao Bang Color
create table Color(
	ID_Color int identity(1,1) primary key not null,
	Code_Color uniqueidentifier default newid() not null,
	Color_name nvarchar(100) not null,
	Status int not null
);

--Tao Bang Material
create table Material(
	ID_Material int identity(1,1) primary key not null,
	Code_Material uniqueidentifier default newid() not null,
	Material_Name nvarchar(75) not null,
	Describe_Material nvarchar(255) null,
	Status int not null
);

--Tao Bang Collar_model
create table Collar_model(
	ID_Collar_model int identity(1,1) primary key not null,
	Code_Collar_model uniqueidentifier default newid() not null,
	Name_Collar_model nvarchar(100) not null,
	Describe_Collar_model nvarchar(255) null,
	Status int not null
);

--Tao Bang IMG
create table IMG(
	ID_IMG int identity(1,1) primary key not null,
	Code_IMG uniqueidentifier default newid() not null,
	Material_IMG nvarchar(100) not null,
	Describe_Collar_model nvarchar(255) null,
	Status int not null
);

--Tao Bang Button
create table Button(
	ID_Button int identity(1,1) primary key not null,
	Code_Button uniqueidentifier default newid() not null,
	Name_Button nvarchar(100) not null,
	Status int not null
);

--Tao Bang Brand
create table Brand(
	ID_Brand int identity(1,1) primary key not null,
	Code_Brand uniqueidentifier default newid() not null,
	Brand nvarchar(100) not null,
	Describe_Brand nvarchar(255) null,
	Status int not null
);

--Tao Bang Style
create table Style(
	ID_Style int identity(1,1) primary key not null,
	Code_Style uniqueidentifier default newid() not null,
	Name_Style nvarchar(100) not null,
	Describe_Style nvarchar(255) null,
	Status int not null
);

--Tao Bang Product_Detail
create table Product_Detail(
	ID_Product_Detail int identity(1,1) primary key not null,
	Code_Product_Detial uniqueidentifier default newid() not null,
	ID_Product int not null,
	ID_Size int not null,
	ID_Color int not null,
	ID_Material int not null,
	ID_Collar_model int not null,
	ID_IMG int not null,
	ID_Button int not null,
	ID_Brand int not null,
	ID_Style int not null,
	Quantity int not null,
	Price int not null,
	Status int not null,
	foreign key (ID_Product) references Product(ID_Product),
	foreign key (ID_Size) references Size(ID_Size),
	foreign key (ID_Color) references Color(ID_Color),
	foreign key (ID_Material) references material(ID_Material),
	foreign key (ID_Collar_model) references Collar_model(ID_Collar_model),
	foreign key (ID_IMG) references IMG(ID_IMG),
	foreign key (ID_Button) references Button(ID_Button),
	foreign key (ID_Brand) references Brand(ID_Brand),
	foreign key (ID_Style) references Style(ID_Style),
);

--tao bang Invoice
create table Invoice(
	ID_Invoice int identity(1,1) primary key not null,
	Code_Invoice uniqueidentifier default newid() not null,
	ID_Customer int not null,
	ID_Staff int not null,
	Total int not null,
	Invoice_Date datetime not null,
	Customer_name nvarchar(75) not null,
	Email varchar(50) not null,
	Phone nvarchar(10) not null,
	Address nvarchar(255) not null,
	Status int not null,
	foreign key (ID_Customer) references Customer(ID_Customer),
	foreign key (ID_Staff) references Staff(ID_Staff)
);

--Tao Bang Invoice_Detail
create table Invoice_Detail(
	ID_Invoice_Detail int identity(1,1) primary key not null,
	Code_Invoice_Detail uniqueidentifier default newid() not null,
	ID_Invoice int not null,
	ID_Product_Detail int not null,
	Unit_Price int not null,
	Total_Price int not null,
	Quantity int not null,
	Status int not null, --1: Chua thanh toan; 2: Da thanh toan; 0:Hien; 9: An
	foreign key (ID_Invoice) references Invoice(ID_Invoice),
	foreign key (ID_Product_Detail) references Product_Detail(ID_Product_Detail)
);

--Tao Bang Type_transaction
create table Type_transaction(
    ID_Type_transaction int identity(1,1) primary key not null,
    Code_Type_transaction uniqueidentifier default newid() not null,
    Name nvarchar(100) not null,
    Status int not null
);

-- Tao Bang Transaction
create table Transactions(
    ID_Transaction int identity(1,1) primary key not null,
    Code_Transaction uniqueidentifier default newid() not null,
    ID_Type_transaction int not null,
    ID_Invoice int not null,
    Money int not  null,
    foreign key (ID_Type_transaction) references Type_transaction(ID_Type_transaction),
    foreign key (ID_Invoice) references Invoice(ID_Invoice)
);