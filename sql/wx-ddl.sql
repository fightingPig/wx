create table base_user(
    id              char(36)    	not null,
    user_name       varchar(50) 	not null,
    password        varchar(50) 	not null,
    email           varchar(50) 	not null,
    phone           varchar(15) 	default '' not null,
    sex             int         	not null,
    ip              varchar(20) 	not null,
    creation_time   datetime    	default now() not null,
    PRIMARY KEY (id),
    UNIQUE INDEX index_user_name (user_name asc)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 纲
create table base_class(
    id              char(36)    	not null,
    name            varchar(50) 	not null,
    english         varchar(50) 	default '' not null,
    description     varchar(300)	default '' not null,
    display_order   int         	null,
    PRIMARY KEY (id),
    UNIQUE INDEX index_name (name asc)    
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- 目
create table base_order(
    id              char(36)    	not null,
    class_id        char(36)    	not null,
    name            varchar(50) 	not null,
    english         varchar(50) 	default '' not null,
    description     varchar(300)	default '' not null,
    display_order   int         	null,
    PRIMARY KEY (id),
    UNIQUE INDEX index_name (name asc)    
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- 科
create table base_family(
    id              char(36)    	not null,
    order_id        char(36)    	not null,
    name            varchar(50) 	not null,
    english         varchar(50) 	default '' not null,
    description     varchar(300)	default '' not null,
    display_order   int         	null,
    PRIMARY KEY (id),
    UNIQUE INDEX index_name (name asc)    
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- 种
create table base_species(
    id              char(36)    	not null,
    user_id         char(36)    	not null,
    family_id       char(36)    	not null,
    name            varchar(50) 	not null,
    english         varchar(50) 	default '' not null,
    address     	varchar(300)	not null,
    max_number     	int				not null,
    min_number    	int				not null,
    weather         varchar(20)     not null,
    description     varchar(300)	default '' not null,
    creation_time   datetime    	default now() not null,
    modified_time   datetime    	default now() not null,
    display_order   int         	null,
    PRIMARY KEY (id),
    INDEX index_user_id (user_id asc)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

ALTER table base_order ADD INDEX index_class_id(class_id asc);
ALTER table base_family ADD INDEX index_order_id(order_id asc);
ALTER table base_species ADD INDEX index_family_id(family_id asc);