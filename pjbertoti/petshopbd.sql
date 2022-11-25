create database petshopbd;

use petshopbd;

create table petshop


  ( cli_id int primary key AUTO_INCREMENT,
cli_nomedono varchar(30),
cli_cpf varchar (30),
cli_telefone varchar (30),
cli_nomecachorro varchar(30),
cli_raca varchar(30),
cli_peso varchar (30));
 
 select * from petshop;
 