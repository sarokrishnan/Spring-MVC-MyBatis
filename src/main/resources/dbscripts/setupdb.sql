

create database codechallenge;

create user 'code'@localhost identified by 'code';

grant all privileges on codechallenge.* to 'code'@'localhost';

create table assignment
(
assignee_id int NOT NULL,
assignee_name varchar(255) NOT NULL,
assignment_name varchar(255) NOT NULL,
creation_date date NOT NULL,
due_date date NOT NULL,
primary key (assignee_id)
);

insert into assignment values (1,'Jim','Java application',now(),now()+interval 2 DAY);
insert into assignment values (2,'Smith','Database project',now(),now()+interval 5 DAY);
insert into assignment values (3,'Ben','NoSQL Assignment',now(),now()+interval 3 DAY);
insert into assignment values (4,'Robert','Java application',now(),now()+interval 1 DAY);

commit;