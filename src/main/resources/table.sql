create schema `orderdb`;
use `orderdb`;

create table `orderdata`(
`ordid` int(11) NOT NULL,
`custid` int(11) NOT NULL,
`custname` VARCHAR(20) NOT NULL,
`custemail` VARCHAR(20) NOT NULL,
`custphone` VARCHAR(20) NOT NULL,
`itemid` VARCHAR(20) NOT NULL,
`itemprice` int(11) NOT NULL,
`quantity` int(11) NOT NULL,
`zipcode` int(11) NOT NULL,
`city` VARCHAR(20) NOT NULL,
`locality` VARCHAR(20) NOT NULL,
`doorno` VARCHAR(20) NOT NULL,
Primary key(`ordid`,`custid`)
);




select * from `orderdata`;


drop table `orderdata`;

