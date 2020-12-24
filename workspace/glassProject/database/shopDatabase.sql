

use glassShop;

create table about
(
aboutId bigint not null primary key auto_increment,
title nvarchar(250) null,
metaTitle varchar(250) null,
description nvarchar(500) null,
image nvarchar(250) null,
detail text null,
createdDate timestamp null,
createdBy nvarchar(250) null,
modifiedDate timestamp null,
modifiedBy nvarchar(250) null,
metaKeywords nvarchar(250) null,
metaDescriptions nvarchar(250) null,
status bit null

);


create table contact 
(
contactId bigint primary key auto_increment not null,
content text null,
status bit
);

create table feedbacks
(
feedbackId bigint not null primary key auto_increment,
name nvarchar(50) null,
phone nvarchar(12) null,
email nvarchar(255) null,
address nvarchar(250) null,
content nvarchar(250) null,
status bit null,
createdDate timestamp null
);


create table footer 
(
footerId varchar(50) not null primary key,
content text null,
status bit null

);

create table menuType
(
menuTypeId int not null primary key auto_increment,
menuName nvarchar(50) null
);

alter table menu add constraint fk_menu_menuType foreign key (menuTypeId) references menuType(menuTypeId);

create table menu
(
menuId bigint not null primary key auto_increment,
text nvarchar(50) null,
link nvarchar(250) null,
displayOrder int null,
target nvarchar(250) null,
status bit null,
menuTypeId int null,
menuParentId int null

);


create table newCategorys
(
newCategoryId bigint not null primary key auto_increment,
name nvarchar(250) null,
metaTitle varchar(250) null,
parentId int null,
displayOrder int null,
seoTitle nvarchar(250) null,
createdDate timestamp null,
createdBy nvarchar(250) null,
modifiedDate timestamp null,
modifiedBy nvarchar(250) null,
metaKeywords nvarchar(250) null,
metaDescriptions nvarchar(250) null,
status bit null,
showOnHome bit null
);

create table news 
(
newId bigint not null primary key auto_increment,
title nvarchar(250) null,
metaTitle varchar(250) null,
description nvarchar(500) null,
newImage nvarchar(250) null,
newCategoryId bigint not null,
detail text null,
createdDate timestamp null,
createdBy nvarchar(250) null,
modifiedDate timestamp null,
modifiedBy nvarchar(250) null,
metaKeywords nvarchar(250) null,
metaDescriptions nvarchar(250) null,
status bit null,
topHot timestamp null,
viewCount int null,
tagId varchar(50) not null


);

alter table news add constraint fk_news_newCategory foreign key (newCategoryId) references newCategorys(newCategoryId);


create table tag
(
tagId varchar(50) not null primary key,
tagName nvarchar(50) null

);

create table newTag 
(
newId bigint not null,
tagId varchar(50) not null

);

alter table newTag add constraint fk_newTag_news foreign key (newId) references news(newId);
alter table newTag add constraint fk_newTag_tag foreign key (tagId) references tag(tagId);

create table ProductCategorys
(
categoryId bigint not null primary key auto_increment,
name nvarchar(250) null,
metaTitle varchar(250) null,
parentId bigint null,
displayOrder int null,
seoTitle nvarchar(250) null,
createdDate timestamp null,
createdBy nvarchar(250) null,
modifiedDate timestamp null,
modifiedBy nvarchar(250) null,
metaKeywords nvarchar(250) null,
metaDescriptions nvarchar(250) null,
status bit null,
showOnHome bit null


);

create table products 
(
productId bigint not null primary key auto_increment,
productCode varchar(10) null,
productName nvarchar(250) null,
metaTitle varchar(250) null,
description nvarchar(500) null,
productImage nvarchar(250) null,
price float null,
promotionPrice float null,
includeVAT bit null,
quantity int null,
categoryId bigint not null,
detail text null,
warranty int null,
createdDate timestamp null,
createdBy nvarchar(250) null,
modifiedDate timestamp null,
modifiedBy nvarchar(250) null,
metaKeywords nvarchar(250) null,
metaDescriptions nvarchar(250) null,
status bit null,


viewCounts int null
);

alter table products add constraint fk_product_category foreign key (categoryId) references productcategorys(categoryId);

alter table products drop foreign key  fk_product_category;


create table slides
(
slideId bigint not null primary key auto_increment,
image nvarchar(250) null,
displayOrder int null,
link nvarchar(250) null,
description nvarchar(250) null,
createdDate timestamp null,
createdBy nvarchar(250) null,
modifiedDate timestamp null,
modifiedBy nvarchar(250) null,
metaKeywords nvarchar(250) null,
metaDescriptions nvarchar(250) null,
status bit null




);


create table SystemConfig 
(
configId bigint not null primary key auto_increment,
configName nvarchar(250) null,
type nvarchar(250) null,
value nvarchar(250) null,
status bit

);


create table users
(
userId bigint not null primary key auto_increment,
userName varchar(250) null,
password varchar(255) null,
firstName nvarchar(250) null,
lastName nvarchar(250) null,
address nvarchar(250) null,
email nvarchar(250) null,
roleId bigint not null,
createdDate timestamp null,
createdBy nvarchar(250) null,
modifiedDate timestamp null,
modifiedBy nvarchar(250) null,
metaKeywords nvarchar(250) null,
metaDescriptions nvarchar(250) null,
status bit null
);

create table role 
(
roleId bigint not null primary key auto_increment,
roleName nvarchar(250) null,
code nvarchar(250) null,
createdDate timestamp null,
createdBy nvarchar(250) null,
modifiedDate timestamp null,
modifiedBy nvarchar(250) null,
metaKeywords nvarchar(250) null,
metaDescriptions nvarchar(250) null,
status bit null



);

alter table users add constraint fk_users_role foreign key (roleId) references role(roleId);

select * from products;



