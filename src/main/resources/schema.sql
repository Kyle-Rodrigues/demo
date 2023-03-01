create table if not exists fighter (
    id identity,
    name varchar(50) not null,
    damamge_per_hit int not null,
    health int not null,
    resistance float(5) not null,
    anime_From varchar(50) not null,
    created_at varchar(50) not null
);