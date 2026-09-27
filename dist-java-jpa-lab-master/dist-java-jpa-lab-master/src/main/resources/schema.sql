create schema collection;

create table collection.collector (
  collector_id identity primary key,
  collector_firstname varchar(200),
  collector_lastname varchar(200),
  collector_avatar varchar(200)
);

create table collection.photo (
    photo_id identity primary key,
    photo_collector_id int references collector(collector_id),
    photo_filename varchar(200),
    photo_datestamp timestamp,
    photo_visible char(1)
);

create schema recipe;

create table recipe.chef (
  chef_id identity primary key,
  chef_firstname varchar(200),
  chef_lastname varchar(200),
  chef_avatar varchar(200)
);

create table recipe.recipe (
    recipe_id identity primary key,
    recipe_chef_id int references chef(chef_id),
    recipe_title varchar(200),
    recipe_description varchar(4000)
);

create table recipe.photo (
    photo_id identity primary key,
    photo_recipe_id int references recipe(recipe_id),
    photo_filename varchar(200),
    photo_caption varchar(4000),
    photo_datestamp timestamp,
    photo_visible char(1)
);