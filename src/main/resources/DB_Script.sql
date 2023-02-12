-- Creating Database script --
create database student_course_reg_db;
use student_course_reg_db;

-- Student Table DDL script --
create table Student(
	ID int auto_increment, 
    Name varchar(40) not null,
    PRIMARY KEY (ID);

-- Course Table DDL script --
create table Course(
	ID int auto_increment,
    Name varchar(40) not null,
    PRIMARY KEY (ID),
    FOREIGN KEY (Item_ID) REFERENCES Item(ID),
    FOREIGN KEY (Experiment_ID) REFERENCES Experiment(ID));

-- Evaluation Table DDL script --
create table Evaluation(
    ID int auto_increment,
    Course_ID int,
    Student_ID int,
    score int not null,
    primary key(ID),
    foreign key(Course_ID) references Course(ID),
    foreign key(Student_ID) references Student(ID)
);