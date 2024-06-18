# Пример SwipeHelper

Это пример Android проекта, демонстрирующий, как использовать `SwipeHelper` для добавления функционала свайпа с кнопками в `RecyclerView`. Проект использует View Binding для упрощения работы с представлениями.

## Особенности

- Свайп элементов в `RecyclerView` для отображения кнопок действий.
- Настраиваемые кнопки с иконками и текстом.

## Начало работы

### Требования

- Android Studio 4.0 или выше
- Gradle 4.0 или выше

### Установка

1. Клонируйте репозиторий:
    ```bash
    git clone https://github.com/Beladerm/SwipeHelperExample.git
    ```
2. Откройте проект в Android Studio.
3. Соберите и запустите проект на вашем Android устройстве или эмуляторе.

### Использование

Проект демонстрирует простой `RecyclerView` с элементами, которые можно свайпать для отображения кнопок действий (например, Удалить, Редактировать). Кнопки настраиваются и могут быть легко расширены для других действий.

### Структура проекта

- **MainActivity.kt**: Настраивает `RecyclerView` и `SwipeHelper`.
- **MyAdapter.kt**: Адаптер для `RecyclerView`.
- **SwipeHelper.kt**: Содержит класс `SwipeHelper` для обработки жестов свайпа и отрисовки кнопок.
- **res/layout/activity_main.xml**: Макет для главной активности.
- **res/layout/item_list.xml**: Макет для каждого элемента в `RecyclerView`.