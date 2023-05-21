drop table if exists `t_user`;
create table `t_user` (
    `id` int not null auto_increment,
    `username` varchar(20) default null,
    `password` varchar(20) default null,
    `email` varchar(50) default null,
    `phone` varchar(20) default null,
    primary key (`id`)
) engine=InnoDB default charset=UTF8MB4;

-- drop table if exists `t_emp`;
-- create table `t_emp` (
--     `emp_id` int not null auto_increment,
--     `emp-name` varchar(20) default null,
--     `sex` char(1) default null,
--     `age` int default null,
--     'email' varchar(50) default null,
--     primary key (`emp_id`)
-- ) engine=InnoDB default charset=UTF8MB4;
--
-- drop table if exists `t_dept`;
-- create table `t_dept` (
--     `dept_id` int not null auto_increment,
--     `dept_name` varchar(20) default null,
--     primary key (`dept_id`)
-- ) engine=InnoDB default charset=UTF8MB4;
--
-- drop table if exists `t_emp_dept`;
-- create table `t_emp_dept` (
--     `emp_id` int not null,
--     `dept_id` int not null,
--     primary key (`emp_id`,`dept_id`)
-- ) engine=InnoDB default charset=UTF8MB4;
--
-- drop table if exists `t_emp_role`;
-- create table `t_emp_role` (
--     `emp_id` int not null,
--     `role_id` int not null,
--     primary key (`emp_id`,`role_id`)
-- ) engine=InnoDB default charset=UTF8MB4;
--
-- drop table if exists `t_role`;
-- create table `t_role` (
--     `role_id` int not null auto_increment,
--     `role_name` varchar(20) default null,
--     primary key (`role_id`)
-- ) engine=InnoDB default charset=UTF8MB4;