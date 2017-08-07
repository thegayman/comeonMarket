/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2017/8/7 9:37:24                             */
/*==============================================================*/


drop table if exists category;

drop table if exists categorysecond;

drop table if exists logistics;

drop table if exists orderItem;

drop table if exists orders;

drop table if exists product;

drop table if exists shoppingCar;

drop table if exists user;

/*==============================================================*/
/* Table: category                                              */
/*==============================================================*/
create table category
(
   cid                  int not null,
   cname                varchar(100),
   primary key (cid)
);

/*==============================================================*/
/* Table: categorysecond                                        */
/*==============================================================*/
create table categorysecond
(
   csid                 int not null,
   csname               varchar(100),
   cid                  int,
   primary key (csid)
);

/*==============================================================*/
/* Table: logistics                                             */
/*==============================================================*/
create table logistics
(
   logId                int not null,
   oid                  int,
   address              varchar(100),
   time                 time,
   primary key (logId)
);

/*==============================================================*/
/* Table: orderItem                                             */
/*==============================================================*/
create table orderItem
(
   itemId               int not null,
   pid                  int,
   oid                  int,
   count                int,
   itemTotal            float,
   primary key (itemId)
);

/*==============================================================*/
/* Table: orders                                                */
/*==============================================================*/
create table orders
(
   oid                  int not null,
   uid                  int,
   orderTotal           varchar(100),
   orderTime            varchar(100),
   state                varchar(100),
   name                 varchar(100),
   phone                varchar(100),
   address              varchar(100),
   primary key (oid)
);

/*==============================================================*/
/* Table: product                                               */
/*==============================================================*/
create table product
(
   pid                  int not null,
   cid                  int,
   pname                varchar(100),
   market_price         float,
   pdesc                varchar(1000),
   shop_price           varchar(100),
   image                varchar(100),
   is_hot               varchar(100),
   pdate                time,
   primary key (pid)
);

/*==============================================================*/
/* Table: shoppingCar                                           */
/*==============================================================*/
create table shoppingCar
(
   carId                int not null,
   pid                  int,
   count                int,
   proPrice             float,
   primary key (carId)
);

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
create table user
(
   uid                  int not null,
   loginname            varchar(100),
   password             varchar(100),
   username             varchar(100),
   email                varchar(100),
   phone                varchar(100),
   address              varchar(100),
   primary key (uid)
);

alter table categorysecond add constraint FK_Reference_7 foreign key (cid)
      references category (cid) on delete restrict on update restrict;

alter table logistics add constraint FK_Reference_4 foreign key (oid)
      references orders (oid) on delete cascade on update cascade;

alter table orderItem add constraint FK_Reference_2 foreign key (oid)
      references orders (oid) on delete cascade on update cascade;

alter table orderItem add constraint FK_Reference_3 foreign key (pid)
      references product (pid) on delete cascade on update cascade;

alter table orders add constraint FK_Reference_1 foreign key (uid)
      references user (uid) on delete cascade on update cascade;

alter table product add constraint FK_Reference_6 foreign key (cid)
      references category (cid) on delete restrict on update restrict;

alter table shoppingCar add constraint FK_Reference_5 foreign key (pid)
      references product (pid) on delete cascade on update cascade;

