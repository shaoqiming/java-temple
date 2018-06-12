/*==============================================================*/
/* Table: right_menu                                            */
/*==============================================================*/
create table right_menu 
(
   id                   varchar(50)                    null,
   menu_name            varchar(50)                    null,
   is_parent_menu       varchar(50)                    null,
   menu_type            varchar(50)                    null,
   menu_value           varchar(200)                   null,
   is_parent            int                            null
);


/*==============================================================*/
/* Table: right_menu_org                                        */
/*==============================================================*/
create table right_menu_org 
(
   id                   varchar(50)                    null,
   menu_id              varchar(50)                    null,
   org_id               varchar(50)                    null
);


/*==============================================================*/
/* Table: right_role_menu                                       */
/*==============================================================*/
create table right_role_menu 
(
   id                   varchar(50)                    null,
   role_id              varchar(50)                    null,
   menu_id              varchar(50)                    null,
   create_time          datetime                       null,
   create_user          varchar(50)                    null,
   create_org           varchar(50)                    null,
   update_time          datetime                       null,
   update_user          varchar(50)                    null,
   update_org           varchar(50)                    null,
   delete_time          datetime                       null,
   delete_user          varchar(50)                    null,
   delete_org           varchar(50)                    null,
   is_delete            int                            null,
   org_code             varchar(50)                    null
);

/*==============================================================*/
/* Table: right_user_menu                                       */
/*==============================================================*/
create table right_user_menu 
(
   id                   varchar(50)                    null,
   user_id              varchar(50)                    null,
   menu_id              varchar(50)                    null
);


/*==============================================================*/
/* Table: right_role                                            */
/*==============================================================*/
create table right_role 
(
   id                   varchar(50)                    null,
   role_name            varchar(50)                    null,
   role_code            varchar(50)                    null
);


/*==============================================================*/
/* Table: right_role_user                                       */
/*==============================================================*/
create table right_role_user 
(
   id                   varchar(50)                    null,
   role_id              varchar(50)                    null,
   user_id              varchar(50)                    null
);


/*==============================================================*/
/* Table: right_user                                            */
/*==============================================================*/
create table right_user 
(
   id                   varchar(50)                    null,
   true_name            varchar(50)                    null,
   user_name            varchar(50)                    null,
   user_password        varchar(50)                    null,
   user_email           varchar(50)                    null,
   user_phone           varchar(50)                    null,
   user_sex             int                            null,
   user_age             int                            null
);


/*==============================================================*/
/* Table: right_org                                                 */
/*==============================================================*/
create table right_org 
(
   id                   varchar(50)                    null,
   org_name             varchar(50)                    null,
   org_code             varchar(50)                    null,
   org_address          varchar(50)                    null,
   org_tel              varchar(50)                    null,
   org_parent_id        varchar(50)                    null,
   is_parent_org        int                            null
);


/*==============================================================*/
/* Table: depart_user                                           */
/*==============================================================*/
create table depart_user 
(
   id                   varchar(50)                    null,
   depart_id            varchar(50)                    null,
   user_id              varchar(50)                    null
);


/*==============================================================*/
/* Table: org_department                                        */
/*==============================================================*/
create table org_department 
(
   id                   varchar(50)                    null,
   depart_name          varchar(50)                    null,
   depart_code          varchar(50)                    null,
   parent_code          varchar(50)                    null,
   is_parent            int                            null
);
