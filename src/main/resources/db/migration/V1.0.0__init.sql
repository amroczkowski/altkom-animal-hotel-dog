create table dog (
     id numeric(19,0) constraint pk_dog primary key,
     name varchar(128) not null,
     date_of_birth timestamp not null,
     breed varchar(128),
     owner_id numeric(19,0)
);

create sequence dog_seq increment by 20 minvalue 1 maxvalue 999999999999999999 cache 20;