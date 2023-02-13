-- Creating Database script --
create database student_course_reg_db;
use student_course_reg_db;

-- Student Table DDL script --
create table Student(ID int auto_increment,
                     NAME varchar(40) not null,
                     EMAIL varchar(40) not null unique,
                     primary key(ID)
);

-- Course Table DDL script --
create table Course(ID int auto_increment,
                    NAME varchar(40) not null unique,
                    primary key(ID));

-- Registration Table DDL script --
create table Registration(ID int auto_increment,
                          Course_ID int,
                          Student_ID int,
                          primary key(ID),
                          foreign key(Course_ID) references Course(ID),
                          foreign key(Student_ID) references Student(ID));