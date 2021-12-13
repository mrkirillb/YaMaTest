#language: ru

Функционал: Яндекс.Маркет

  Сценарий: Поиск телевизора между Samsung и LG

    Когда на главной странице выбирает раздел "Маркет"
    И переключает страницу
    И на странице Яндекс.Маркета выбирает категорию "Электроника"
    Тогда проверяет заголовок каталога: "Электроника"

    Когда выбирает элемент из каталога "Телевизоры"
    И нажимает на кнопку с выбором всех фильтров
    И проверяет заголовок фильтра "Все фильтры"
    И заполняет фильтр ценой от: "20000"
    И проставляет чек бокс - фильтр по производителю: "LG"
    И проставляет чек бокс - фильтр по производителю: "Samsung"
    И применяет фильтр
    И проверяет, количество элементов на странице: "48"
    Тогда проверяет, что наименование товара соответствует запомненному значению