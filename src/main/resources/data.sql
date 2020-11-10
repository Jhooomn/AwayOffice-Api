-----------------------------------------------------------------------------------------------------
--DUMMY DATA FOR DB
-----------------------------------------------------------------------------------------------------

insert into employee(id,full_name,status,department,home_address,phone_number,email_address)
    values
    (1,'Muhammad Zubair','ACTIVE','Software Engineering','Raatuse 22','+37211111111','zubair@ut.ee'),
    (2,'Abdul Wahab','ACTIVE','Software Engineering','Raatuse 22','+37222222222','abdul@ut.ee'),
    (3,'Mirlind Murati','ACTIVE','Software Engineering','Raatuse 22','+37233333333','mirlind@ut.ee'),
    (4,'Test User 1','FIRED','Accounts','Raatuse 22','+37244444444','test1@ut.ee'),
    (5,'Test User 2','RESIGNED','Human Resource','Raatuse 22','+37255555555','test2@ut.ee'),
    (6,'Test User 3','VACATION','Inventory Manager','Raatuse 22','+37266666666','test3@ut.ee'),
    (7,'Test User 4','RETIRED','Quality Assurance','Raatuse 22','+37277777777','test4@ut.ee');

    INSERT INTO vendor (id, name, address, email)
        VALUES (1, 'Muhammad Zubair', 'Raatuse 22', 'zubair@ut.ee'), (2, 'Abdul Wahab', 'Raatuse 22', 'wahab@ut.ee'), (3, 'Mubashar Shahzad', 'Raatuse 22', 'mubashar@ut.ee'), (4, 'Mirlind Murati', 'Raatuse 22', 'mirlind@ut.ee'), (5, 'Ahmed Imam', 'Tallinn Kalamaja', 'ahmed@ut.ee'), (6, 'Tanty', 'Bruno 34', 'tanty@ut.ee');
INSERT INTO asset_Model (id, name, description, model, manufacturer)
        VALUES (0, 'Macbook Air', 'Notebook', 'MacBook Air 13" 2015', 'Apple'), (1, 'Curved Monitor', 'Extended Display', 'UltraSharp 38 Curved Monitor - U3818DW', 'Dell'), (2, 'Wireless Mouse', 'Pointing device', 'WT525 Black', 'Asus'), (3, 'Macbook Pro', 'as', 'MacBook Pro 13" 2017', 'Apple'), (4, 'Curved Monitor', 'Monitor', 'C27R50 27" FHD Curved Monitor', 'Samsung');
