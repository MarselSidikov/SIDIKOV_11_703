# ORM

* Object Relation Mapping - принципы отображения объектно-ориентированного кода в реляционные отношения и обратно.

## JPA

* Java Persistance API - набор классов и интерфейсов, являющихся стандартом ORM в Java. (javax.persistance).

## Hibernate

* ORM-фреймвор, реализующий JPA.

* hbm-файл - файл конфигурации Hibernate, который описывает соответствие между классами и таблицами. Не является стандартом JPA.

## Аннотации JPA

* Аннотация показывает, что класс требует персистентного хранения (отображение в таблицу)

```JAVA
@Entity
class User {
	...
}
```

* Аннотация показывает, что класс должен быть отображен в таблицу с названием table_name, по умолчанию берется имя класса.

```JAVA
@Table(name = "table_name")
class User {
	...
}
```

* Аннотации показывают, что поле является идентификатором сущности, а генерация этого идентификатора перекладывается на БД

```JAVA
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
```

* Данная аннотация говорит о том, что поле типа "Enum" нужно хранить как строку.

```JAVA
@Enumerated(value = EnumType.STRING)
private UserRole role;
```

* Данные аннотации говорят, что поле teacher присоединяется по правилу "МногиеКОдному" и ключем присоединения в таблице будет колонка "teacher_id"

```JAVA
@ManyToOne
@JoinColumn(name = "teacher_id")
private User teacher;
```

* Данная аннотация говорит, что коллекцию нужно присоединить по правилу ОдинКоМногим используя уже описанное правило в классе Course по полю "teacher".

```JAVA
@OneToMany(mappedBy = "teacher")
private List<Course> coursesOfTeacher;
```

* Если внутри класса Course мы делаем такую связь на User, то:

- строится третья таблица с отношением "Многие Ко Многим"

- название таблицы "student_course"
- колонка, которая присоединяется из Course называется course_id
- колонка, которая присоединяется из User нызывается student_id

```JAVA
@ManyToMany
    @JoinTable(
            name="student_course",
            joinColumns=@JoinColumn(name="course_id", referencedColumnName="id"),
            inverseJoinColumns=@JoinColumn(name="student_id", referencedColumnName="id"))
    private List<User> students;
```

## Задание

* В новом проекте, используя аннотации и Hibernate описать все модели вашей семестровой работы и создать по ним таблицам.