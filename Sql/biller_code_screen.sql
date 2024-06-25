create table if not exists biller_code_screen(
record_id Integer not null,
bc_screen_id Integer null,
bc_screen_name varchar(255) null,
bc_screen_url varchar(255) null,
bc_page_url varchar(255) null,
action_ids varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint biller_code_screen_pk primary key(record_id));