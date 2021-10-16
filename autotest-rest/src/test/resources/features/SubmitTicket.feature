#language:ru
@test

Функционал: Тестирование сервиса Helpdesk
  - Создание нового тикета с высоким приоритетом с помощью POST запроса
  - После создания нового тикета, GET запросом проверяем, есть ли наш созданный ранее тикет на сервисе

  Сценарий: Создание тикета с высоким приоритетом

    # Первая часть теста - Создание тикета. Эти данные подставятся в тело запроса в шаблон тела файла createTicket.json
    # Генерится рандомная строка по маске
        # E - Английская буква,
        # D - цифра. Остальные символы игнорятся
        # Условно дана строка EE-DDD - снегерится примерно такая - SP-254
    * сгенерировать переменные
      | title                 | EEEEEEEEEEEEEEE   |
      | submitter_email       | EEEEEEE@EEEDDD.EE |
      | description           | EEEEEEEEEEEE      |
      | priority              | High              |
      | queue                 | EEEEEEDDDEE       |

    # Создаем тикет
    * создать запрос
      | method | path          | body                |
      | POST   | /api/tickets/ | createTicket.json   |
    * добавить header
      | Autorization           | t1.9euelZqPx52Xy4mSz5yWkY2VkpuYzu3rnpWams3MiYqYl4vNzIqXkpmMi87l9PcdFgR2-e9oCgO63fT3XUQBdvnvaAoDug.jzUQmm7hPuGI4uHYhNDeT4LdLcxalUghTz25ACHOfDn5y91U6_Wxh1wDT71pKRqOrduz0PaZZjOxlocb5QArAQ |
      | Content-Type           | application/json    |

    * отправить запрос
    * статус код 201
    * извлечь данные
      | user_id | $.message |
    * сравнить значения
      | ${user_id} | != | null |

    # Вторая часть теста - запрос юзера и проверка его данных
    * создать запрос
      | method | path              |
      | GET    | /api/tickets/     |
    * добавить header
      | accept | application/json |
