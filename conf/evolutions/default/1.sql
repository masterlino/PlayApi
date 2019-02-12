# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table autor (
  id                            bigint auto_increment not null,
  nombre                        varchar(255),
  edad                          integer,
  constraint pk_autor primary key (id)
);

create table autor_libro_receta (
  autor_id                      bigint not null,
  libro_receta_id               bigint not null,
  constraint pk_autor_libro_receta primary key (autor_id,libro_receta_id)
);

create table ingrediente_r (
  id                            bigint auto_increment not null,
  nombre                        varchar(255),
  cantidad                      varchar(255),
  receta_id                     bigint,
  constraint pk_ingrediente_r primary key (id)
);

create table libro_receta (
  id                            bigint auto_increment not null,
  nombre                        varchar(255),
  web                           varchar(255),
  constraint pk_libro_receta primary key (id)
);

create table receta (
  id                            bigint auto_increment not null,
  autor_id                      bigint,
  titulo                        varchar(255),
  preparacion                   varchar(255),
  constraint pk_receta primary key (id)
);

create table time_log (
  id                            bigint auto_increment not null,
  time_stamp                    bigint,
  constraint pk_time_log primary key (id)
);

create index ix_autor_libro_receta_autor on autor_libro_receta (autor_id);
alter table autor_libro_receta add constraint fk_autor_libro_receta_autor foreign key (autor_id) references autor (id) on delete restrict on update restrict;

create index ix_autor_libro_receta_libro_receta on autor_libro_receta (libro_receta_id);
alter table autor_libro_receta add constraint fk_autor_libro_receta_libro_receta foreign key (libro_receta_id) references libro_receta (id) on delete restrict on update restrict;

create index ix_ingrediente_r_receta_id on ingrediente_r (receta_id);
alter table ingrediente_r add constraint fk_ingrediente_r_receta_id foreign key (receta_id) references receta (id) on delete restrict on update restrict;

create index ix_receta_autor_id on receta (autor_id);
alter table receta add constraint fk_receta_autor_id foreign key (autor_id) references autor (id) on delete restrict on update restrict;


# --- !Downs

alter table autor_libro_receta drop constraint if exists fk_autor_libro_receta_autor;
drop index if exists ix_autor_libro_receta_autor;

alter table autor_libro_receta drop constraint if exists fk_autor_libro_receta_libro_receta;
drop index if exists ix_autor_libro_receta_libro_receta;

alter table ingrediente_r drop constraint if exists fk_ingrediente_r_receta_id;
drop index if exists ix_ingrediente_r_receta_id;

alter table receta drop constraint if exists fk_receta_autor_id;
drop index if exists ix_receta_autor_id;

drop table if exists autor;

drop table if exists autor_libro_receta;

drop table if exists ingrediente_r;

drop table if exists libro_receta;

drop table if exists receta;

drop table if exists time_log;

