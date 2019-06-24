CREATE SCHEMA Technocrats;
USE Technocrats ;

CREATE TABLE Student (
 StudentId INT NOT NULL AUTO_INCREMENT,
 name VARCHAR(255) NOT NULL,
 age INT (255) NOT NULL,
 sex VARCHAR(255) NOT NULL,
 DoB DATE NOT NULL,
 MajorId INT NOT NULL,
-- FOREIGN KEY (MajorId) REFERENCES Major (MajorId),
 PRIMARY KEY (StudentId));

CREATE TABLE Major (
 MajorId INT NOT NULL AUTO_INCREMENT,
 StudentId INT(255) NOT NULL,
 name VARCHAR(255) NOT NULL,
 difficulty INT NOT NULL,
 cost FLOAT NOT NULL,
 PRIMARY KEY (MajorId),
FOREIGN KEY (StudentId) REFERENCES Student (StudentId));

INSERT INTO Student (name, age, sex, DoB, MajorID) 
VALUES ("Scott", 22, "M", "20030519", 3);

INSERT INTO Student (name, age, sex, DoB, MajorID) 
VALUES ("Efe", 30, "M", "10170419", 1);

INSERT INTO Student (name, age, sex, DoB, MajorID) 
VALUES ("Marlena", 21, "F", "20150411", 2);

INSERT INTO Major (StudentId, name, difficulty, cost)
VALUES (3, "ComputerScience", 5, 22000.0);

INSERT INTO Major (StudentId, name, difficulty, cost)
VALUES (2, "ComputerEngineering", 222222, 25.0);
INSERT INTO Major (StudentId, name, difficulty, cost)
VALUES (1, "ElectricalEngineering", 33033, 28.0); 