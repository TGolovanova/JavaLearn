#language:ru
@google
Функционал: Редактирование тикета с прикреплением файла в созданный тикет

  Сценарий: Открытие главной страницы Helpdesk, переход на страницу Log in, ввод значений
  для авторизации в системе, выбор нужного тикета, редактирование тикета (прикрепление файла)

    * открыть url "https://at-sandbox.workbench.lanit.ru/"
    * инициализация страницы "Helpdesk"
    * на странице имеется элемент "Log in"
    * кликнуть на элемент "Log in"
    * инициализация страницы "Login"
    * ввести в поле "поле юзера" значение "admin"
    * ввести в поле "поле пароля" значение "adminat"
    * на странице имеется элемент "кнопка логина"
    * кликнуть на элемент "кнопка логина"
    * инициализация страницы "Overview"
    * на странице имеется элемент "Ticket 3"
    * кликнуть на элемент "Ticket 3"
    * инициализация страницы "Ticket 3"
    * на странице имеется элемент "Attach Files"
    * кликнуть на элемент "Attach Files"
    * на странице имеется элемент "Add File"
    * кликнуть на элемент "Add File"
    * на странице имеется элемент "Update Ticket"
    * кликнуть на элемент "Update Ticket"




