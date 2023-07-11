# SpringTestDB
Springboot Project
#SpringBoot Project와 Mybatis + MariaDB를 연동하고 local에 있는 DB에 대해 출력하는 프로그램입니다.

DB생성은 쿼리를 다음과 같이 작성합니다.
Create database todo_db

CREATE TABLE member (
  id INT PRIMARY KEY AUTO_INCREMENT,
  email VARCHAR(255) NOT NULL,
  name VARCHAR(100) NOT NULL,
  password VARCHAR(255) NOT NULL
);

INSERT INTO member (id, email, name, password) VALUES
('1', 'example1@example.com', 'John Doe', 'password1'),
('2', 'example2@example.com', 'Jane Smith', 'password2'),
('3', 'example3@example.com', 'Alice Johnson', 'password3');

다음 쿼리를 작성하면 테이블에 값을 추가할 수 있으며
해당 테이블의 값을 List 형태로 값을 받아들여 html파일에서 출력을 합니다.
