-----------------------------------------------------------------------------------------------------
--DUMMY DATA FOR DB
-----------------------------------------------------------------------------------------------------

INSERT INTO USER (USERNAME, PASSWORD, ROLE)
        VALUES ('admin', '$2y$10$WVt5ywf9mAdf45lxoTsNFuxUr9zBwvLMUZCvEFS7zi3ojdtTnn4lu', 'ROLE_ADMIN'), ('user', '$2y$10$Z0E..2S8CsPQMIf03idlzeg/k2q68miSFqGdLJUpBGlxHkBFaRI3C', 'ROLE_USER');
INSERT INTO employee (id, full_name, status, department, home_address, phone_number, email_address)
        VALUES (1, 'Muhammad Zubair', 'ACTIVE', 'Software Engineering', 'Raatuse 22', '+37211111111', 'zubair@ut.ee'), (2, 'Abdul Wahab', 'ACTIVE', 'Software Engineering', 'Raatuse 22', '+37222222222', 'abdul@ut.ee'), (3, 'Mirlind Murati', 'ACTIVE', 'Software Engineering', 'Raatuse 22', '+37233333333', 'mirlind@ut.ee'), (4, 'Test User 1', 'FIRED', 'Accounts', 'Raatuse 22', '+37244444444', 'test1@ut.ee'), (5, 'Test User 2', 'RESIGNED', 'Human Resource', 'Raatuse 22', '+37255555555', 'test2@ut.ee'), (6, 'Test User 3', 'VACATION', 'Inventory Manager', 'Raatuse 22', '+37266666666', 'test3@ut.ee'), (7, 'Test User 4', 'RETIRED', 'Quality Assurance', 'Raatuse 22', '+37277777777', 'test4@ut.ee');
INSERT INTO vendor (id, name, address, email)
        VALUES (1, 'Muhammad Zubair', 'Raatuse 22', 'zubair@ut.ee'), (2, 'Abdul Wahab', 'Raatuse 22', 'wahab@ut.ee'), (3, 'Mubashar Shahzad', 'Raatuse 22', 'mubashar@ut.ee'), (4, 'Mirlind Murati', 'Raatuse 22', 'mirlind@ut.ee'), (5, 'Ahmed Imam', 'Tallinn Kalamaja', 'ahmed@ut.ee'), (6, 'Tanty', 'Bruno 34', 'tanty@ut.ee'), (7, 'Flexera', '250 Hartford Avenue, Bellingham MA 201', 'info@flexera.com'), (8, 'Device42', '30 Memorial Drive, Avon MA 2322', 'info@device.com'), (9, 'Freshservice', '700 Oak Street, Brockton MA 2301', 'info@freshservice.com'), (10, 'SysAid Technologies', '66-4 Parkhurst Rd, Chelmsford MA 1824', 'info@sysaid.com'), (11, 'Axios', '591 Memorial Dr, Chicopee MA 1020', 'info@axios.com'), (12, 'Certero', '55 Brooksby Village Way, Danvers MA 1923', 'buy@certero.com'), (13, 'Ivanti', '42 Fairhaven Commons Way, Fairhaven MA 2719', 'contact@ivanti.com'), (14, 'Giva Service Management Suite', '374 William S Canning Blvd, Fall River MA 2721', 'info@giva.com'), (15, 'InvGate', '121 Worcester Rd, Framingham MA 1701', 'contact@invgate.com'), (16, 'TechRepublic', '677 Timpany Blvd, Gardner MA 1440', 'buy@techrepublic.com'), (17, 'Flipboard', '337 Russell St, Hadley MA 1035', 'info@flipboard.com'), (18, 'Asset Panda', '777 Brockton Avenue, Abington MA 2351', 'info@assetpanda.com');
INSERT INTO asset_Model (id, name, description, model, manufacturer)
        VALUES (1, 'Macbook Air', 'Notebook', 'MacBook Air 13" 2015', 'Apple'), (2, 'Curved Monitor', 'Extended Display', 'UltraSharp 38 Curved Monitor - U3818DW', 'Dell'), (3, 'Wireless Mouse', 'Pointing device', 'WT525 Black', 'Asus'), (4, 'Macbook Pro', 'as', 'MacBook Pro 13" 2017', 'Apple'), (5, 'Curved Monitor', 'Monitor', 'C27R50 27" FHD Curved Monitor', 'Samsung'), (6, 'Macbook Air', 'Notebook', 'MacBook Air 13" 2020', 'Apple'), (7, 'Thinkpad', 'Notebook', 'ThinkPad T480 i7 FHD', 'Lenovo');
