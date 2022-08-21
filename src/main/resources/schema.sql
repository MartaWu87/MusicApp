create table if not exists edition
(
    id             bigint auto_increment
    primary key,
    name           varchar(255) null,
    performer_id   bigint       null,
    relase_date_id bigint       null,
    title_id       bigint       null
    )
    engine = MyISAM;

create index FKfmeoghnntf8hwu6g5yi7m6lf7
    on edition (performer_id);

create index FKjhlrty1q1yjn9pf2ylt01jacg
    on edition (relase_date_id);

create index FKkauknju3ap8q4wwn3diypch1l
    on edition (title_id);

create table if not exists performer
(
    id   bigint auto_increment
    primary key,
    name varchar(255) null
    )
    engine = MyISAM;

create table if not exists performer_tracks
(
    performer_id bigint not null,
    tracks_id    bigint not null,
    constraint UK_1wxt3fs8286ukkb451me82i1v
    unique (tracks_id)
    )
    engine = MyISAM;

create index FKnu0dvc3c91a9n4sih9og6x33r
    on performer_tracks (performer_id);

create table if not exists relase_date
(
    id           bigint auto_increment
    primary key,
    year         bigint null,
    edition_id   bigint null,
    performer_id bigint null
)
    engine = MyISAM;

create index FKmsybh3r4lkqckbdsatn6emjcd
    on relase_date (performer_id);

create index FKnjmcwwd0lsi7vurc1rtk5qlyc
    on relase_date (edition_id);

create table if not exists title
(
    id           bigint auto_increment
    primary key,
    album_title  varchar(255) null,
    performer_id bigint       null
    )
    engine = MyISAM;

create index FKc89653651c9558bds272jbqyo
    on title (performer_id);

create table if not exists tracks
(
    id           bigint auto_increment
    primary key,
    length       bigint       not null,
    track        varchar(255) null,
    edition_id   bigint       null,
    performer_id bigint       null
    )
    engine = MyISAM;

create index FK96567vobgvxfwhhnu3yofqnsl
    on tracks (performer_id);

create index FKp1yogwq7f1w22lym3wuf7l0du
    on tracks (edition_id);