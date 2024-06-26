CREATE TABLE IF NOT EXISTS fieldhistory (
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  object_id INT NOT NULL,
  object_type VARCHAR(10) NOT NULL,
  field_name VARCHAR(200) NOT NULL,
  field_value_int INT,
  field_value_str VARCHAR(1000),
  created_at DATETIME DEFAULT NOW()
);

CREATE TABLE IF NOT EXISTS customer (
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  created DATETIME NOT NULL DEFAULT NOW(),
  deleted DATETIME
);