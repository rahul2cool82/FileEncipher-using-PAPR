# FileEncipher-using-PAPR
It is as same File Encipher but the only difference is this project use our own Symmetric key Algorithm name 'PAPR'. It supports 128, 256, 512, 1024, 2048 bit of keys.

Use Oracle 11G XE to run this application

Create Username: minor Create Password: minor

Run these Queries:

create table minor(userid number primary key, uname varchar(25) not null, name varchar(50) not null, gen varchar(1) not null, dob date not null, email varchar(50) not null, pass varchar(25) not null, cont varchar(25) not null)
create sequence userid start with 1000 increment by 5
create table allkeys (userid number references minor(userid),pbkey varchar(500) not null,N varchar(2500) not null,prkey varchar(2500) not null)
Run the App.class
