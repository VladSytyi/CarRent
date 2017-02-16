CREATE TABLE user (
  user_id INT NOT NULL AUTO_INCREMENT,
  username VARCHAR(100) UNIQUE,
  password VARCHAR(100),
  role ENUM ('ADMIN', 'USER', 'GUEST') DEFAULT 'GUEST',
  PRIMARY KEY (user_id)
);

CREATE TABLE auto(
  auto_id INT NOT NULL AUTO_INCREMENT,
  auto_title VARCHAR(100) NOT NULL,
  auto_description TEXT (255) NOT NULL,
  PRIMARY KEY (auto_id)
);

CREATE TABLE client_data(
  client_data_id INT NOT NULL AUTO_INCREMENT,
  passportNumber VARCHAR (10) NOT NULL UNIQUE ,
  first_name VARCHAR(45) NOT NULL,
  last_name VARCHAR(45) NOT NULL,
  mail VARCHAR(100) NOT NULL UNIQUE,
  PRIMARY KEY (client_data_id)
);

CREATE TABLE auto_order(
  order_id INT NOT NULL AUTO_INCREMENT,
  start_arend DATETIME,
  finish_arend DATETIME,
  auto_id INT NOT NULL,
  user_id INT NOT NULL,
  client_data_id INT NOT NULL,
  PRIMARY KEY (order_id),
  FOREIGN KEY (auto_id) REFERENCES auto(auto_id)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  FOREIGN KEY (user_id) REFERENCES user(user_id)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  FOREIGN KEY (client_data_id) REFERENCES client_data(client_data_id)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);
