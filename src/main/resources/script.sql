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

CREATE TABLE auto_order(
  order_id INT NOT NULL AUTO_INCREMENT,
  start_arend DATETIME,
  finish_arend DATETIME,
  auto_id INT NOT NULL,
  user_id INT NOT NULL,
  PRIMARY KEY (order_id),
  FOREIGN KEY (auto_id) REFERENCES auto(auto_id),
  FOREIGN KEY (user_id) REFERENCES user(user_id)
);
