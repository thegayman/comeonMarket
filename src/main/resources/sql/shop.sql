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
/* Table: category（商品一级目录）                                             */
/*==============================================================*/
create table category
(
   cid                  int not null,
   cname                varchar(100),  /*一级目录名称*/
   primary key (cid)
);

/*==============================================================*/
/* Table: categorysecond（商品二级目录表）                                    */
/*==============================================================*/
create table categorysecond
(
   csid                 int not null,
   csname               varchar(100),   /*二级目录名称*/
   cid                  int,            /*关联一级目录的id*/
   primary key (csid)
);

/*==============================================================*/
/* Table: logistics（物流表）                                             */
/*==============================================================*/
create table logistics
(
   logId                int not null,
   oid                  int,             /*关联订单id*/
   address              varchar(100),    /*物流所到地址*/
   time                 time,            /*物流时间*/
   primary key (logId)
);

/*==============================================================*/
/* Table: orderItem（订单明细表）                                             */
/*==============================================================*/
create table orderItem
(
   itemId               int not null,
   pid                  int,              /*关联商品id*/
   oid                  int,			  /*关联订单id*/
   count                int,			  /*每件商品的购买数量*/
   itemTotal            float,			  /*每件商品的数额*/
   primary key (itemId)
);

/*==============================================================*/
/* Table: orders(订单表)                                             */
/*==============================================================*/
create table orders
(
   oid                  int not null,
   uid                  int,           /*订单关联的用户*/
   orderTotal           varchar(100),  /*订单的总价格*/
   orderTime            varchar(100),  /*下单时间*/
   state                varchar(100),  /*订单的状态（未发货/已发货/已收货）*/
   name                 varchar(100),  /*用户名字*/
   phone                varchar(100),  /*用户手机*/
   address              varchar(100),  /*用户地址*/
   primary key (oid)
);

/*==============================================================*/
/* Table: product（商品表）                                               */
/*==============================================================*/
create table product
(
   pid                  int not null,
   csid                  int,          /*商品所属的二级目录*/
   stock                 int,          /*库存*/         
   pname                varchar(100), /*商品名字*/
   market_price         float,        /*市场价*/
   pdesc                varchar(1000), /*商品描述*/
   shop_price           varchar(100),  /*商城价*/
   image                varchar(100),  /*商品图片*/
   is_hot               varchar(100),  /*是否是热门商品*/
   pdate                time,          /*商品更新日期*/
   primary key (pid)
);

/*==============================================================*/
/* Table: shoppingCar（购物车）                                           */
/*==============================================================*/
create table shoppingCar
(
   carId                int not null,
   pid                  int,            /*关联商品id*/
   count                int,            /*商品购买数量*/
   proPrice             float,          /*商品价格*/
   primary key (carId)
);

/*==============================================================*/
/* Table: user（用户表）                                                 */
/*==============================================================*/
create table user
(
   uid                  int not null,
   loginname            varchar(100),    /*登陆名*/
   password             varchar(100),    /*登陆密码*/
   username             varchar(100),    /*用户姓名*/
   email                varchar(100),    /*电子邮箱*/
   phone                varchar(100),    /*电话*/
   address              varchar(100),    /*地址*/
   primary key (uid)
);
