Функции:

-Операции методами GET, POST, PUT, DELETE над списком работников в формате JSON;

-Отображение в MySQL Database.

-Аутентификация через API Key.

--------------------------------

Использовалось:

Spring Boot(Spring Web, Security, Data JPA), Hibernate

--------------------------------

В проекте 6 директорий:

-Controller:

Обрабатывает http запрос.

-DAO:

Используется как репозиторий для получения информации с MySQL Database.

-Entity:

Создания объекта Employee и его связывание с таблицей employees в MySQL Database

-rest_authorization:

Аутентификация запросов через API Key

-Security:

Конфигурация для spring security

-Service:

Содержит бизнес-логику приложения (отображает и обрабатывает информацию из таблицы employees)



