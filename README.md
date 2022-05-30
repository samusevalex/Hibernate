Скачиваем Н2.

Распаковываем в /opt

Запускаем ../bin/h2.sh

По default-у к Н2 можно подключаться только одним connect-ом. Если хотим создать базу in-memory с несколькими connect-ами, то надо:

JDBC URL прописать jdbc:h2:mem:db1;DB_CLOSE_DELAY=-1

А подключаться jdbc:h2:tcp://localhost/mem:db1
