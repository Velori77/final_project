#### Technology stack:
    - Java
    - Junit
    - Cucumber
    - Lombok
    - Allure

#### How to start sequential test execution by maven:
```mvn clean test -DthreadCount=1```

#### How to start by maven in parallel by maven:
``` mvn clean test -DthreadCount=2```

#### How to start by maven with browser parameter (chrome, firefox and internetExplorer supported):
```mvn clean test -Dbrowser="firefox"```

#### Generate report by Allure after test execution:
```allure serve allure-results```


