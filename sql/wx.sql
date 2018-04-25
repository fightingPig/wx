create table base_user(
    id              char(32)    not null,
    user_name       varchar(50) not null,
    password        varchar(50) not null,
    email           varchar(50) not null,
    phone           varchar(15) default '' not null,
    sex             int         not null,
    ip              varchar(20) not null,
    creation_time   datetime    default now() not null,
    PRIMARY KEY (id),
    UNIQUE INDEX index_user_name (user_name asc)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 纲
create table base_class(
    id              char(32)    not null,
    name            varchar(50) not null,
    english         varchar(50) default '' not null,
    description     varchar(300)not null,
    display_order   int         null,
    PRIMARY KEY (id),
    UNIQUE INDEX index_name (name asc)    
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 目
create table base_order(
    id              char(32)    not null,
    class_id        char(32)    not null,
    name            varchar(50) not null,
    english         varchar(50) not null,
    description     varchar(300)not null,
    display_order   int         null,
    PRIMARY KEY (id),
    UNIQUE INDEX index_name (name asc)    
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 科
create table base_family(
    id              char(32)    not null,
    order_id        char(32)    not null,
    name            varchar(50) not null,
    english         varchar(50) not null,
    description     varchar(300)not null,
    display_order   int         null,
    PRIMARY KEY (id),
    UNIQUE INDEX index_name (name asc)    
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 种
create table base_species(
    id              char(32)    not null,
    order_id        char(32)    not null,
    name            varchar(50) not null,
    english         varchar(50) not null,
    description     varchar(300)not null,
    display_order   int         null,
    PRIMARY KEY (id),
    UNIQUE INDEX index_name (name asc)    
)ENGINE=InnoDB DEFAULT CHARSET=utf8;