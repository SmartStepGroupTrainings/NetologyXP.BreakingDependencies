# XP. Рефакторинг legacy кода. Техники разрыва зависимостей.
  * Практические занятия по UnitTesting (курс Нетологии http://netology.ru/programs/xp)

## План
1. Что такое техники разрыва зависимостей? Внедрение швов.
2. Техники разрыва зависимостей
    * Sprout method
        - Rate 18+ is not permitted for children
        - if (isPermitted())
        - Отдельный метод с фильтрацией фильмов, let movies = getMovies()
    * Sprout class
        - reporter.buildHeader()
    * Wrap method
        - Метод с таким же именем. Добавляем поведение к уже существующим вызовам. Клиентов не меняем, им пофиг. Не меняем легами код.
          ```
          pay() {
            logPayment();
            doPay();
          }
          ```
        - Новый метод.
          ```
          makeLoggedPayment() {
            logPayment();
            doPay();
          }
          ```
         - Недостатки wrap method
            - Можно добавить поведение только до или после метода, без пересечений.
            - Нужно переименовывать методы в уродские doPay().
    * Wrap class
        - Decorator pattern. 2 варианта - Наследование и композиция.
          ```
          class LoggingEmployee {
            pay() {
                this.logPayment();
                this._employee.pay(); // or super.pay();
            }
          }
          ```
    * Параллельный дизайн
        - Обозначить явно старый код - Deprecated\Obsolete\Rename to _old
        - Создать новый класс (ContractNew, DocumentNew)
    * Extract & override (object seam)
        - printLine() - Seam
        - TestablePrinter
        - new object -> createObject()
3. Вопросы и ответы
4. Домашнее задание
    * https://github.com/SmartStepGroupTrainings/NetologyXP.BreakingDependencies/tree/master/homework