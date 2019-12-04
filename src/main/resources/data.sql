insert into user (First_Name, Last_Name)
values ('sasha', 'galanichev');

insert into user (First_Name, Last_Name)
values('vlad', 'zahahrov');

insert into user (First_Name, Last_Name)
values('grisha', 'rahlin');

--
-- insert into phone_book (User_Id)
-- values(1);
-- insert into phone_book (User_Id)
-- values(2);


insert into contact (First_Name, Last_Name, Phone_Number, User_Id)
values('ola', 'kutuzova', '8960-235-84-77', 1);

insert into contact (First_Name, Last_Name, Phone_Number, User_Id)
values('masha', 'sov', '123-45-678', 1);

insert into contact (First_Name, Last_Name, Phone_Number, User_Id)
values('anya', 'zinch', '246-73-47-81', 2);

insert into contact (First_Name, Last_Name, Phone_Number, User_Id)
values('kris', 'kiliiba', '638-24-65-681', 2);

insert into contact (First_Name, Last_Name, Phone_Number, User_Id)
values('sveta', 'kurutkina', '987-434-567', 3);

insert into contact (First_Name, Last_Name, Phone_Number, User_Id)
values('polina', 'balab', '7-994-324-56-85', 2);