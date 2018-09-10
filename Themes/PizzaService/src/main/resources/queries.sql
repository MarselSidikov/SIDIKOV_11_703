SELECT *
from "order";

SELECT *
from "order"
ORDER BY user_id DESC;

-- Многие к одному, хотим получить пользователей и их заказы

-- Вытащила только пересечение
SELECT pizza_user.*, o.id as order_id, o.*
from pizza_user
       JOIN "order" o on pizza_user.id = o.user_id;

-- Получим ВСЕХ пользователей их заказы
SELECT pizza_user.*, o.id as order_id, o.*
from pizza_user
       LEFT JOIN "order" o on pizza_user.id = o.user_id;

-- Получим ВСЕ заказы их пользователей
SELECT pizza_user.*, o.id as order_id, o.*
from pizza_user
       RIGHT JOIN "order" o on pizza_user.id = o.user_id;

-- Получить ВСЕ

SELECT pizza_user.*, o.id as order_id, o.*
from pizza_user FULL
       OUTER JOIN "order" o on pizza_user.id = o.user_id;

-- Получить всех пользователей и пиццы, которые они заказали
select pizza.name as pizza_name, p_o.user_name
from pizza
       join pizza_order po on pizza.id = po.pizza_id
       join (select pizza_user.first_name as user_name, o.id as order_id
             from pizza_user
                    join "order" as o on pizza_user.id = o.user_id) as p_o on p_o.order_id = po.order_id;



