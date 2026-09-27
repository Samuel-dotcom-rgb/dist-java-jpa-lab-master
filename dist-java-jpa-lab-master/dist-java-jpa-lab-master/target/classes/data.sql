insert into collection.collector (collector_firstname, collector_lastname, collector_avatar)
values ( 'Carmen', 'Hermosillo', 'carmen.jpg' );
insert into collection.collector (collector_firstname, collector_lastname, collector_avatar)
values ( 'Manuel', 'Castelis', 'manuel.jpg' );
insert into collection.collector (collector_firstname, collector_lastname, collector_avatar)
values ( 'Jean', 'Baudrillard', 'jean.jpg' );

insert into collection.photo (photo_collector_id, photo_filename, photo_datestamp, photo_visible)
values ( 2, 'beach.jpg', PARSEDATETIME('15/02/2020, 21:01', 'dd/MM/yyyy, HH:mm'), 1 );
insert into collection.photo (photo_collector_id, photo_filename, photo_datestamp, photo_visible)
values ( 2, 'sunnyday.jpg', PARSEDATETIME('15/02/2020, 09:58', 'dd/MM/yyyy, HH:mm'), 1 );
insert into collection.photo (photo_collector_id, photo_filename, photo_datestamp, photo_visible)
values ( 2, 'car.jpg', PARSEDATETIME('15/02/2020, 09:54', 'dd/MM/yyyy, HH:mm'), 0 );
insert into collection.photo (photo_collector_id, photo_filename, photo_datestamp, photo_visible)
values ( 1, 'icecream.jpg', PARSEDATETIME('15/02/2020, 09:54', 'dd/MM/yyyy, HH:mm'), 1 );
insert into collection.photo (photo_collector_id, photo_filename, photo_datestamp, photo_visible)
values ( 1, 'flower.jpg', PARSEDATETIME('15/02/2020, 03:10', 'dd/MM/yyyy, HH:mm'), 1 );
insert into collection.photo (photo_collector_id, photo_filename, photo_datestamp, photo_visible)
values ( 3, 'book.jpg', PARSEDATETIME('15/02/2020, 03:06', 'dd/MM/yyyy, HH:mm'), 1 );
insert into collection.photo (photo_collector_id, photo_filename, photo_datestamp, photo_visible)
values ( 3, 'bird.jpg', PARSEDATETIME('15/02/2020, 08:22', 'dd/MM/yyyy, HH:mm'), 0 );

insert into recipe.chef (chef_firstname, chef_lastname, chef_avatar)
values ( 'Carmen', 'Hermosillo', 'carmen.jpg' );
insert into recipe.chef (chef_firstname, chef_lastname, chef_avatar)
values ( 'Manuel', 'Castelis', 'manuel.jpg' );
insert into recipe.chef (chef_firstname, chef_lastname, chef_avatar)
values ( 'Jean', 'Baudrillard', 'jean.jpg' );

insert into recipe.recipe(recipe_chef_id, recipe_title, recipe_description)
VALUES ( 2, 'Victoria sponge cake', 'Traditional British dessert' );
insert into recipe.recipe(recipe_chef_id, recipe_title, recipe_description)
VALUES ( 2, 'Banoffee pie', 'Traditional British dessert' );
insert into recipe.recipe(recipe_chef_id, recipe_title, recipe_description)
VALUES ( 1, 'Bakewell tart', 'Traditional British dessert' );
insert into recipe.recipe(recipe_chef_id, recipe_title, recipe_description)
VALUES ( 3, 'Bread and butter pudding', 'Traditional British dessert' );
insert into recipe.recipe(recipe_chef_id, recipe_title, recipe_description)
VALUES ( 3, 'Sticky toffee pudding', 'Traditional British dessert' );
insert into recipe.recipe(recipe_chef_id, recipe_title, recipe_description)
VALUES ( 3, 'Sherry trifle', 'Traditional British dessert' );

insert into recipe.photo(photo_recipe_id, photo_filename, photo_caption, photo_datestamp, photo_visible)
VALUES ( 1, 'sweet_cake1.jpg', 'some text', PARSEDATETIME('15/02/2020, 21:01', 'dd/MM/yyyy, HH:mm'), 1 );
insert into recipe.photo(photo_recipe_id, photo_filename, photo_caption, photo_datestamp, photo_visible)
VALUES ( 3, 'sweet_cake2.jpg', 'some text', PARSEDATETIME('15/02/2020, 09:58', 'dd/MM/yyyy, HH:mm'), 1 );
insert into recipe.photo(photo_recipe_id, photo_filename, photo_caption, photo_datestamp, photo_visible)
VALUES ( 4, 'sweet_cake3.jpg', 'some text', PARSEDATETIME('15/02/2020, 09:54', 'dd/MM/yyyy, HH:mm'), 1 );
insert into recipe.photo(photo_recipe_id, photo_filename, photo_caption, photo_datestamp, photo_visible)
VALUES ( 4, 'sweet_cake4.jpg', 'some text', PARSEDATETIME('15/02/2020, 09:54', 'dd/MM/yyyy, HH:mm'), 1 );
insert into recipe.photo(photo_recipe_id, photo_filename, photo_caption, photo_datestamp, photo_visible)
VALUES ( 6, 'sweet_cake5.jpg', 'some text', PARSEDATETIME('15/02/2020, 03:10', 'dd/MM/yyyy, HH:mm'), 1 );