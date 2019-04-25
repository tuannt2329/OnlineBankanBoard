
USE `kanbanproj`;

CREATE TABLE `users` (
  `id` int NOT NULL auto_increment,
  `username` varchar(255) NOT NULL,
  `pass` varchar(255) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;



alter table Repository(
	id int PRIMARY key AUTO_INCREMENT,
	name NVARCHAR(100),
	idUserCreate int ,
	CONSTRAINT idtao foreign key (idUserCreate) references users(id),
	timeCreate DATETIME 
)

CREATE TABLE resgroup(
mem_id int ,
CONSTRAINT idtaoa foreign key (mem_id) references users(id),
res_id int ,
CONSTRAINT idtaob foreign key (res_id) references Repository(id),
CONSTRAINT aaaaa PRIMARY KEY (mem_id,res_id)
) 




