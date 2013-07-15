# Users schema

 
# --- !Downs
 
DROP TABLE if exists Users;


# --- !Ups
 
CREATE TABLE Users (
    id BIGINT AUTO_INCREMENT,
    email varchar(255) NOT NULL,
    fullName varchar(255),
    facebookUsername varchar(255),
    PRIMARY KEY (id)
);

