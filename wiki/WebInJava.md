# Web в Java

* На Java обычно реализуются серверные компоненты веб-сервисов (так называемый backend)

* Обработкой HTTP-запрос на стороне сервера на Java занимаются объекты классов-сервлетов.

* Каджый сервлет - потомок класса HttpServlet. Вы можете переопределить определенные методы HttpServlet, чтобы определить собственное поведение-реакцию на запросы от клиента.

* ApacheTomcat - контейнер сервлетов. Данное приложение запускается на определенном порту сервера (обычно 8080) и позволяет размещать внутри себя web-архивы, содержащие сервлеты (war-файлы).

* Для получения war-архива необходимо указать в pom.xml тег 

```
<packaging>war</packaging>
```

* Для корректной упаковки сервлетов в war необходим дескриптор развертывания (web.xml). В дескрипторе развертывания регистрируются сервлеты и настраивается маппинг URL-ов на сервлеты.

* Apache Tomcat - это обычное приложение, которое можно запустить из командной строки Windows.

### Настройка Tomcat через IntelliJ IDEA:

Настройка пользователей Tomcat:

```
C:\Users\admin.WIN-IPM3OA3VQNQ\Desktop\apache-tomcat-9.0.12\apache-tomcat-9.0.12\conf
```

Находим там файл tomcat-users.xml и меняем его содержимое:

```XML
<?xml version="1.0" encoding="UTF-8"?>
<tomcat-users xmlns="http://tomcat.apache.org/xml"
              xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
              xsi:schemaLocation="http://tomcat.apache.org/xml tomcat-users.xsd"
              version="1.0">
			  <role rolename="manager-gui" />
<role rolename="manager-status" />
<role rolename="manager-script" />
<role rolename="manager-jmx" />
<user username="admin" password="admin" roles="manager-gui,manager-status,manager-script,manager-jmx" />
</tomcat-users>
```

1. Run -> Edit Configurations
2. + -> Tomcat Server -> Local (необходимо настроить путь к скачанному Tomcat)
3. Запустить Tomcat и перейти по ссылке

```
http://localhost:8080/manager/html
```

### Размещение приложения в Tomcat

* Открываем менеджер Tomcat

Выберите WAR файл для загрузки -> Загружаем наш архив. -> Развернуть

```
http://localhost:8080/servlets-demo-0.1/demo
```

* Run -> Edit Configuration (выбыраете Tomcat, который там уже есть) -> вкладка Deployment -> + -> Artifact -> ваш war-архив

Приложение монтируется сразу в корень.

```
http://localhost:8080/demo
```