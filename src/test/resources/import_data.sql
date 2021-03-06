INSERT INTO PUBLIC.PERSON (ID, FIRST_NAME, LAST_NAME, EMAIL, PHONE) values (1, 'John', 'Terry', 'john.terry@hotmail.com','66668888');
INSERT INTO PUBLIC.PERSON (ID, FIRST_NAME, LAST_NAME, EMAIL, PHONE) values (2, 'Tom', 'Cat', 'tom.cat@gmail.com','68748987');
INSERT INTO PUBLIC.PERSON (ID, FIRST_NAME, LAST_NAME, EMAIL, PHONE) values (3, 'Boo', 'Bar', 'boo.bar@hotmail.com','65478965');
INSERT INTO PUBLIC.PERSON (ID, FIRST_NAME, LAST_NAME, EMAIL, PHONE) values (4, 'Foo', 'Cha', 'foo.cha@hotmail.com','65897485');
INSERT INTO PUBLIC.PERSON (ID, FIRST_NAME, LAST_NAME, EMAIL, PHONE) values (5, 'Tony', 'Lark', 'tony.lark@hotmail.com','66662222');

INSERT INTO PUBLIC.BOOK (ID, TITLE, AUTHOR, ISBN) values (100, 'Maven: The Definitive Guide', 'Sonatype Company', '0596517335');
INSERT INTO PUBLIC.BOOK (ID, TITLE, AUTHOR, ISBN) values (101, 'Spring in Action', 'Craig Walls', '9781617291203');
INSERT INTO PUBLIC.BOOK (ID, TITLE, AUTHOR, ISBN) values (102, 'Core Serlvet', 'Marty Hall', '0130092290 ');
INSERT INTO PUBLIC.BOOK (ID, TITLE, AUTHOR, ISBN) values (103, 'Effective Java : A Programming Language Guide', 'Joshua Bloch', '9781617291203');
INSERT INTO PUBLIC.BOOK (ID, TITLE, AUTHOR, ISBN) values (104, 'Java Persistence with Hibernate', 'Christian Bauer', '1617290459');
INSERT INTO PUBLIC.BOOK (ID, TITLE, AUTHOR, ISBN) values (105, 'HTML & CSS : Design and Build Web Sites', 'Jon Duckett', '1118008189');
INSERT INTO PUBLIC.BOOK (ID, TITLE, AUTHOR, ISBN) values (106, 'Spring Persistence with Hibernate', 'Paul Fisher', '1430226323');

INSERT INTO PUBLIC.PERSON_BOOK (ID, PERSON_ID, BOOK_ID, START_DATE, DUE_DATE, RETURN_DATE) values (200, 1, 100, '2016-01-02', '2016-01-22', null);
INSERT INTO PUBLIC.PERSON_BOOK (ID, PERSON_ID, BOOK_ID, START_DATE, DUE_DATE, RETURN_DATE) values (201, 1, 102, '2016-01-06', '2016-01-26', null);


