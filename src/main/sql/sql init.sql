CREATE DATABASE IF NOT EXISTS exam_sys DEFAULT CHARSET utf8;
USE exam_sys;
SET SQL_SAFE_UPDATES = 0;

CREATE TABLE student (
    id VARCHAR(20) PRIMARY KEY,
    name VARCHAR(20) NOT NULL,
    password VARCHAR(40),
    gender VARCHAR(20),
    age INT
)  ENGINE = INNODB DEFAULT CHARSET UTF8;

INSERT INTO student (id, name, gender, age) VALUES
('1001', 'XiaoMing', 'male', 18),
('1002', 'LiSi', 'Female', 20);

CREATE TABLE teacher (
    id VARCHAR(20) PRIMARY KEY,
    name VARCHAR(20) NOT NULL,
    password VARCHAR(40),
    gender VARCHAR(20),
    age TINYINT
)  ENGINE = INNODB DEFAULT CHARSET UTF8;
INSERT INTO teacher (id, name, gender, age) VALUES
('2001', 'Harry', 'male', 35),
('2002', 'Luna', 'Female', 30);

CREATE TABLE administrator (
    id VARCHAR(20) PRIMARY KEY,
    name VARCHAR(20) NOT NULL,
    password VARCHAR(40) NOT NULL
)  ENGINE = INNODB DEFAULT CHARSET UTF8;
INSERT INTO administrator VALUES ('3001', 'Zhang', '123');

DROP TABLE course;
CREATE TABLE course (
    id INT PRIMARY KEY AUTO_INCREMENT,
    course_id VARCHAR(20) NOT NULL,
    course_name VARCHAR(160) NOT NULL,
	teacher_id VARCHAR(20),
    student_id VARCHAR(20),
    FOREIGN KEY (teacher_id) REFERENCES teacher (id),
    FOREIGN KEY (student_id) REFERENCES student (id)
)  ENGINE = INNODB DEFAULT CHARSET UTF8;

INSERT INTO course VALUES 
(1, '2564', 'Data Structure', '2001', '1001'),
(2, '2564', 'Data Structure', '2001', '1002'),
(3, '6742', 'Machine Learning', '2002', '1001'),
(4, '6742', 'Machine Learning', '2002', '1002');

CREATE TABLE score (
    id INT PRIMARY KEY AUTO_INCREMENT,
    course_id VARCHAR(20) NOT NULL,
    student_id VARCHAR(20) NOT NULL,
    score DOUBLE
)  ENGINE = INNODB DEFAULT CHARSET UTF8;

INSERT INTO score (course_id, student_id, score) VALUES
('2564', '1001', 90),
('2564', '1002', 98),
('6742', '1001', 85),
('6742', '1002', 94);

CREATE TABLE exam (
    id INT PRIMARY KEY AUTO_INCREMENT,
    course_id INT NOT NULL,
    student_id VARCHAR(20) NOT NULL,
    exam_content TEXT,
    FOREIGN KEY (course_id) REFERENCES course (id),
    FOREIGN KEY (student_id) REFERENCES student (id)
)  ENGINE = INNODB DEFAULT CHARSET UTF8;
