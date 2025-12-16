# Домашнее задание: Spring Boot проекты

В этом репозитории находятся два самостоятельных проекта на Spring Boot. Каждый проект имеет свою конфигурацию и может запускаться независимо.

---

## Структура репозитория

client-app-homework/
├─ project1/ # Первый проект (Client App)
├─ project2/ # Второй проект (например, Service App)
└─ README.md

yaml
Копировать код

---

## Project 1: Client App

**Описание:**  
Проект демонстрирует подключение к Spring Cloud Config Server и работу с профилями `dev` и `prod`.

**Конфигурация:**  
- Порт по умолчанию: 8080  
- Профили: `dev` (по умолчанию), `prod`

**Запуск:**

С использованием Maven:
```bash
cd project1
mvn spring-boot:run -Dspring-boot.run.profiles=prod
После запуска доступен endpoint:

bash
Копировать код
GET http://localhost:8080/config
Он возвращает текущее сообщение из конфигурации (app.message).

Project 2: Service App
Описание:
Второй проект с отдельной функциональностью (можно уточнить по задаче).

Конфигурация:

Порт по умолчанию: 8081

Профили: dev и prod (если используются)

Запуск:

bash
Копировать код
cd project2
mvn spring-boot:run -Dspring-boot.run.profiles=dev
Примечания
Оба проекта используют Maven для сборки.

В корне репозитория присутствует .gitignore, чтобы исключить временные файлы IDEA и папки сборки.

Перед запуском убедитесь, что Config Server (для Project 1) работает на http://localhost:8888, если он нужен.
