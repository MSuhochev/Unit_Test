# Урок 4. Зависимости в тестах

### Задание 1. Ответьте письменно на вопросы:
 
#### 1) Почему использование тестовых заглушек может быть полезным при написании модульных тестов?
    
   - Изоляция зависимостей: 
     - При модульном тестировании обычно требуется изолировать модуль или компонент от его зависимостей, таких как внешние сервисы, базы данных, файловые системы и т. д. Заглушки позволяют заменить эти зависимости на имитированные объекты, которые можно легко контролировать в тесте.

   - Поведение в контролируемой среде: 
     - Заглушки позволяют определить поведение зависимостей в контролируемой среде, что облегчает проверку поведения основного кода в различных сценариях.

   - Изоляция от внешних факторов: 
     - Заглушки помогают избежать проблем, связанных с внешними факторами, такими как сетевые проблемы, нестабильные внешние сервисы и т. д. Это позволяет сосредоточиться на тестировании конкретного модуля, не беспокоясь о внешних факторах.

   - Ускорение тестов: 
     - Заглушки могут быть реализованы для возврата предопределенных значений или симуляции определенного поведения без необходимости выполнения реальной логики, что может значительно ускорить выполнение тестов.

   - Тестирование краевых случаев и ошибок: 
     - С помощью заглушек можно легко создавать сценарии для тестирования краевых случаев и ошибок, которые могут быть сложными или даже невозможными воспроизвести с реальными зависимостями.
    
   В целом, использование тестовых заглушек способствует улучшению качества модульных тестов, делая их более предсказуемыми, изолированными и простыми в поддержке.

#### 2) Какой тип тестовой заглушки следует использовать, если вам нужно проверить, что метод был вызван с определенными аргументами?
   - Для проверки того, что метод был вызван с определенными аргументами, следует использовать заглушки с утверждениями (assertion mocks). Эти заглушки позволяют проверить, что метод был вызван с ожидаемыми аргументами в ходе выполнения теста.
     Этот подход позволяет создавать строгие условия для проверки того, как код взаимодействует с его зависимостями, что является важной частью модульного тестирования.

#### 3) Какой тип тестовой заглушки следует использовать, если вам просто нужно вернуть определенное значение или исключение в ответ на вызов метода?
   - Если нужно вернуть определенное значение или исключение в ответ на вызов метода, то можно использовать фиктивные объекты (dummy objects) или заглушки с фиксированными возвращаемыми значениями (stub mocks).
   Фиктивные объекты просто предоставляют себя в качестве "заглушки", не имея реализации методов, а заглушки с фиксированными возвращаемыми значениями могут иметь предопределенные значения для возврата при вызове определенных методов.

#### 4) Какой тип тестовой заглушки вы бы использовали для имитации взаимодействия с внешним API или базой данных?
  - Stub Objects (Заглушки): Заглушки похожи на моки, но они обычно более просты и предназначены для предоставления заранее определенных ответов на запросы. Они могут быть полезны, если вам нужно просто возвращать фиксированные данные для тестирования определенных сценариев.

  - Fake Objects (Фейки): Фейки - это объекты, которые реализуют более простые версии внешних зависимостей. Например, вместо реальной базы данных вы можете использовать встроенную базу данных в памяти для тестирования.
