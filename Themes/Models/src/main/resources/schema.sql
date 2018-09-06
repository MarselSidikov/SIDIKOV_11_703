create table pizza_user (
  id SERIAL PRIMARY KEY,
  email VARCHAR(50),
  hash_password VARCHAR(200),
  first_name VARCHAR(30),
  last_name VARCHAR(30),
  address VARCHAR(50)
);

create table "order" (
  id serial primary key,
  date timestamp,
  user_id bigint,
  foreign key (user_id) references pizza_user(id)
);

create table pizza (
  id serial primary key,
  price double precision,
  name varchar(200)
);

create table pizza_order (
  pizza_id bigint,
  order_id bigint,
  foreign key (pizza_id) references pizza(id),
  foreign key (order_id) references "order"(id)
);