# Проект по автоматизации тестирования для компании [2ГИС](https://info.2gis.ru/sankt-peterburg/) в городе Санкт-Петербург
> Картографический сервис 2ГИС —  подробный справочник организаций с детальной картой городов и навигатор для автомобиля и пешеходов.
>
> ## **Содержание:**
____

* <a href="#tools">Технологии и инструменты</a>

* <a href="#jenkins">Сборка в Jenkins</a>

* <a href="#console">Запуск из терминала</a>

* <a href="#allure">Allure отчет</a>

* <a href="#allure-testops">Интеграция с Allure TestOps</a>

* <a href="#jira">Интеграция с Jira</a>

* <a href="#telegram">Уведомление в Telegram при помощи бота</a>

* <a href="#video">Примеры видео выполнения тестов на Selenoid</a>
____
<a id="tools"></a>
## <a name="Технологии и инструменты">**Технологии и инструменты:**</a>

<p align="center">  
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>  
<a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>  
<a href="https://github.com/"><img src="images/logo/Github.svg" width="50" height="50"  alt="Github"/></a>  
<a href="https://junit.org/junit5/"><img src="images/logo/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>  
<a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>  
<a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>  
<a href="https://aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>  
<a href="ht[images](images)tps://github.com/allure-framework/allure2"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a> 
<a href="https://qameta.io/"><img src="images/logo/Allure2.svg" width="50" height="50"  alt="Allure TestOps"/></a>   
<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>  
<a href="https://www.atlassian.com/ru/software/jira/"><img src="images/logo/Jira.svg" width="50" height="50"  alt="Jira"/></a>  
</p>

____
<a id="jenkins"></a>
## <img alt="Jenkins" height="25" src="images/logo/Jenkins.svg" width="25"/></a><a name="Сборка"></a>Сборка в [Jenkins](https://jenkins.autotests.cloud/job/20-irina_kandrina-15-2gis-tests/)</a>
____
<p align="center">  
<a href="https://jenkins.autotests.cloud/job/20-irina_kandrina-15-2gis-tests/"><img src="images/screenshot/jenkinsBuild.png" alt="Jenkins" width="850"/></a>  
</p>

<a id="console"></a>
## Команды для запуска из терминала
___
***Локальный запуск:***
```bash  
gradle clean gis_test
```

***Удалённый запуск через Jenkins:***
```bash  
clean
${TASK}
"-Dbrowser=${BROWSER}"
"-DbrowserSize=${BROWSER_SIZE}"
"-DbrowserVersion=${BROWSER_VERSION}"
"-DbaseUrl=${BASE_URL}"
"-DremoteUrl=${REMOTE_URL}"
```
___
<a id="allure"></a>
## <img alt="Allure" height="25" src="images/logo/Allure.svg" width="25"/></a> <a name="Allure"></a>Allure [отчет](https://jenkins.autotests.cloud/job/20-irina_kandrina-15-2gis-tests/7/allure/)</a>
___

### *Основная страница отчёта*

<p align="center">  
<img title="Allure Overview Dashboard" src="images/screenshot/allureMain.png" width="850">  
</p>  

### *Тест-кейсы*

<p align="center">  
<img title="Allure Tests" src="images/screenshot/allureTestCase.png" width="850">  
</p>

### *Графики*

<p align="center">  
<img title="Allure Graphics" src="images/screenshot/allureGraph.png" width="850">
</p>

___
<a id="allure-testops"></a>
## <img alt="Allure" height="25" src="images/logo/Allure2.svg" width="25"/></a>Интеграция с <a target="_blank" href="https://allure.autotests.cloud/project/3542/dashboards">Allure TestOps</a>
____
### *Allure TestOps Dashboard*

<p align="center">  
<img title="Allure TestOps Dashboard" src="images/screenshot/allureTestOpsMain.png" width="850">  
</p>  

### *Ручные тест-кейсы*

<p align="center">  
<img title="Allure Tests" src="images/screenshot/allureTestOpsManual.png" width="850">  
</p>

### *Авто тест-кейсы*

<p align="center">  
<img title="Allure TestOps Tests" src="images/screenshot/allureTestOpsAuto.png" width="850">  
</p>

___
<a id="jira"></a>
## <img alt="Allure" height="25" src="images/logo/Jira.svg" width="25"/></a> Интеграция с <a target="_blank" href="https://jira.autotests.cloud/browse/HOMEWORK-803">Jira</a>
____
<p align="center">  
<img title="Jira" src="images/screenshot/jira.png" width="850">  
</p>

____
<a id="telegram"></a>
## <img alt="Allure" height="25" src="images/logo/Telegram.svg" width="25"/></a> Уведомление в Telegram при помощи бота
____
<p align="center">  
<img title="Allure Overview Dashboard" src="images/screenshot/telegram.png" width="550">
</p>

____
<a id="video"></a>
## <img alt="Selenoid" height="25" src="images/logo/Selenoid.svg" width="25"/></a> Примеры видео выполнения тестов на Selenoid
____
<p align="center">
<img title="Selenoid Video" src="images/video/video.gif" width="550" height="350"  alt="video">   
</p>

