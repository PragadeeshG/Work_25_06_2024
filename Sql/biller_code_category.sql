create table if not exists biller_code_category(
biller_code_cat_code varchar(255) not null,
biller_code_cat_name varchar(255) null,
biller_code_cat_description varchar(255) null,
biller_code_cat_definition varchar(255) null,
authorizer_id bigint null,
owner varchar(255) null,
ps_ids varchar(255) null,
service_name_id bigint null,
creation_date varchar(255) null,
modified_date varchar(255) null,
constraint biller_code_category_pk primary key(biller_code_cat_code));