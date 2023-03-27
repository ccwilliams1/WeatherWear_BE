CREATE DATABASE Wardrobe;
CREATE TABLE closet (
    item_name varchar(255) NOT NULL,
    item_type varchar(20) NOT NULL,
    item_subtype varchar(50),
    item_description text,
    item_size varchar(10),
    item_color varchar(20),
    item_material varchar(50),
    dress_style varchar(20) NOT NULL
);