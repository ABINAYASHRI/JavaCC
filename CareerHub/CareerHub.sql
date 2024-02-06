CREATE DATABASE crhub;
USE crhub;

CREATE TABLE Company(
companyId int not null auto_increment,
companyName varchar(45),
clocation varchar(45),
PRIMARY KEY(companyId)
);

ALTER TABLE Company auto_increment=1001;
-- -------------------------------------------------------------

create table Applicant(
applicantId int not null auto_increment,
fName varchar(35),
lName varchar(35),
email varchar(35),
phone varchar(20),
resume varchar(30),
PRIMARY KEY(applicantId)
);

ALTER TABLE Applicant auto_increment=2001;

-- --------------------------------

CREATE TABLE JobListing(
jobID INT NOT NULL auto_increment ,
companyID int,
FOREIGN KEY (companyID) references Company(companyID),
jobTitle varchar(35),
jdesc varchar(50),
jlocation varchar(25),
salary decimal,
jtype varchar(30),
postedDate date,
PRIMARY KEY(jobID)
);

ALTER TABLE JobListing auto_increment=3001;
-- --------------------------------------------

create table JobApplication(
	applicationId int not null auto_increment,
    jobId int,
    FOREIGN KEY (jobId) references JobListing(jobId),
    applicantId int,
    FOREIGN KEY (applicantId) references Applicant(applicantId),
    appdate date,
    covletter Varchar(45),
	PRIMARY KEY(applicationId)
 
);
ALTER TABLE JobApplication auto_increment=4001;

insert into company (companyName,clocation)values("Hexaware","Chennai"),("TCS","Mumbai"),("Infosys","Cochi");
insert into Applicant(fName,lname,email,phone,resume) values
("Asha","Sing","asha@email.com","1122334455","Yes"),
("Ravi","Kumar","ravi@email.com","2233445566","No"),
("Sai","Ram","sai@email.com","9988776655","Yes");

insert into JobListing (companyId,jobTitle,jdesc,jlocation,salary,jtype,postedDate)values 
(1001,"Development","Java Developer","Chennai","35000","Full-time","2023-12-01"),
(1002,"Full Stack","Python Developer","Mumbai","45000","Contract","2023-12-01"),
(1003,"Automation","RPA Developer","Cochi","40000","PArt-time","2023-12-01");


 insert into JobApplication (jobId,applicantId,appdate,covletter) values
 (3001,2001,"2024-01-01","abcd"),
 (3002,2002,"2024-01-15","xyz"),
 (3003,2003,"2024-02-02","lmnop");


select * from Applicant;
select * from company;
select * from JobListing;
select * from JobApplication;

show tables