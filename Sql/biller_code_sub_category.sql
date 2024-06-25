create table if not exists biller_code_sub_category(
biller_code_sub_cat_code varchar(255) not null,
biller_code_sub_cat_name varchar(255) null,
biller_code_sub_cat_description varchar(255) null,
biller_code_sub_cat_definition varchar(255) null,
biller_code_sub_cat_ref_auth_name varchar(255) null,
error_code bigint null,
error_sverity varchar(255) null,
nc_type varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint biller_code_sub_category_pk primary key(biller_code_sub_cat_code));