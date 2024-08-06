DROP TABLE IF EXISTS menu;
CREATE TABLE menu(
    id integer PRIMARY KEY AUTOINCREMENT,
    item text,
    price integer,
    quantity integer
);

DROP TABLE IF EXISTS user;
CREATE TABLE user(
    id integer PRIMARY KEY AUTOINCREMENT,
    username text,
    full_name text,
    date_of_birth DATE,
    email text,
    password text
);

INSERT INTO user(username, full_name, date_of_birth, email, password)
VALUES (#{username}, #{fullname},#{date_of_birth},#{email}, #{password});

UPDATE user
SET 
username=#{username}, 
full_name= #{fullName}, 
date_of_birth= #{dateOfBirth}, 
email= #{email}, 
password= #{password}
WHERE id= #{id};

DELETE FROM user
WHERE id = #{id};


INSERT INTO menu(item, price)
VALUES (#{item},#{price});

UPDATE menu
SET item=#{item}, price=#{price}
WHERE id= #{id};

SELECT * FROM menu
WHERE id=#{id};

DELETE FROM menu
WHERE id = #{id};

UPDATE menu
SET quantity=10
WHERE id= 1;