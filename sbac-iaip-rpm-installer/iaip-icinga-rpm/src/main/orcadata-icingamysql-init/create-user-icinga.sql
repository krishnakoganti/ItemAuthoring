DELETE FROM mysql.user where user = '';
-- DELETE FROM mysql.user where user = '' or password = '';

CREATE DATABASE icinga;

GRANT USAGE ON icinga.* TO 'icinga'@'localhost'
  IDENTIFIED BY 'icinga' 
  WITH MAX_QUERIES_PER_HOUR 0 MAX_CONNECTIONS_PER_HOUR 0 MAX_UPDATES_PER_HOUR 0;
  
GRANT SELECT, INSERT, UPDATE, DELETE, DROP, CREATE VIEW, INDEX, EXECUTE 
  ON icinga.* TO 'icinga'@'localhost';

flush privileges;
