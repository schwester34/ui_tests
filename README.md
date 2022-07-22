###  Graduate work on UI testing for labirint (https://www.labirint.ru/)
---

<a id="anchor"></a>

:closed_book: __Content__
+ Technologies and tools
+ Test cases
+ Build in Jenkins
+ Launch from the terminal
+ Allure Report
+ Integration with AllureTestOps
+ Telegram Report
+ Video of an example of passing the test



:toolbox:__Technologies and tools__

![Java](https://user-images.githubusercontent.com/99205353/176089306-25bd3a87-d157-44e7-8dce-9b78c46903b3.png)
![Gradle](https://user-images.githubusercontent.com/99205353/176089337-996bd879-5d6e-4dce-a92d-f5baa997009d.png)
![Intelij_IDEA](https://user-images.githubusercontent.com/99205353/176089342-13de613d-5aa5-45b2-b355-8ebf8879c4e2.png)
![Jenkins](https://user-images.githubusercontent.com/99205353/176089357-5edb7793-1c6e-40ee-9fa3-4551e15c9792.png)
![Allure_Report](https://user-images.githubusercontent.com/99205353/176089388-1e6d5743-9e68-4e77-87fc-941affe0e7dd.png)
![Telegram](https://user-images.githubusercontent.com/99205353/176089393-33897979-7898-4d16-9259-5dbb134c7f2c.png)
![AllureTestOps](https://user-images.githubusercontent.com/99205353/178306928-b4276a60-726c-4017-b3c3-adc0da7c890a.png)

---
__Test cases__

- [ ] Check that search works
- [ ] Сheck that the book is being added to basket
- [ ] Check that the textbooks open in the School section
- [ ] Check that cabinet is opened
- [ ] Check that page title have header text 'Лабиринт | Книжный интернет-магазин: купить книги, новинки, бестселлеры'
- [ ] Check that help search works correct

---
:toolbox: __Build in Jenkins__

[ui_test](https://jenkins.autotests.cloud/job/ui_test/)

![jenkins](https://user-images.githubusercontent.com/99205353/179532406-e7fd925c-6925-47ce-ba17-8e352084bdd2.png)
---
:computer: __Launch from the terminal__

Local test run:

```
gradle clean test 
```
Remote test run:
```
clean
test
 -Dbrowser=${BROWSER}
 -DbrowserSize=${BROWSER_SIZE}
 
```

---

:bar_chart: __Allure report__

### Main window

![allure1](https://user-images.githubusercontent.com/99205353/179533148-2c967be2-27d0-4bd1-983a-8cb3b43fa4ae.png)

### Window with test cases

![allure2](https://user-images.githubusercontent.com/99205353/179533559-149c9941-506d-4061-858d-2e858357ff24.png)

### Window with charts

![allure3](https://user-images.githubusercontent.com/99205353/179533682-d7f7b1ae-ed4f-44bb-870a-d40cc4a61158.png)


---
:toolbox: __Integration with AllureTestOps__

### Test cases with launch history

![alluretestops1](https://user-images.githubusercontent.com/99205353/179533770-03c145f7-8680-4d0a-bf47-79a06f7e5596.png)

### Dashboard

![alluretestops2](https://user-images.githubusercontent.com/99205353/179533839-f1e5e747-d65f-4388-b8d7-19b0cf8f3897.png)

---
:incoming_envelope: __Telegram Report__

![telegramreport](https://user-images.githubusercontent.com/99205353/179534104-fc6dfe82-9dce-4f83-a36c-dbc3ffe60904.png)

---
:clapper: __Video of an example of passing the test__

The launch takes place on a remote Selenoid web driver




https://user-images.githubusercontent.com/99205353/179534354-5a5319e1-7bc3-4819-9a5e-d95b8357274f.mp4




:arrow_up: [Up the page](#anchor)

---

