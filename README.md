# Hello

##### 1.eclipse 2021-03 버전 설치<br>
`2020-12 버전 설치 (utf-8 문제)` <br></br>
##### 2.jdk8 이상 설치<br>
`jdk1.8.0_341, jre1.8.0_341 `<br></br>
##### 3.eclipse 에 JAVA PROJECT 추가<br></br>
##### 4.추가된 프로젝트에 build tool :: maven 설정<br>
`일반프로젝트-configure-convert maven project로 변경`<br></br>
##### 5.maven 의 pom.xml 을 통해 spring-mvc 4.3 버전 근처로 설치<br>
`개인프로젝트 당시 pom.xml 참고. -> 해당프로젝트-오른클릭-maven-update project`<br></br>
##### 6.TOMCAT 서버 추가(TOMCAT 9, 10) <br>
`tomcat9.0추가`<br></br>
##### 7.추가된 서버에 JAVA PROJECT 를 Add<br></br>
##### 8.index.jsp 추가하여 페이지 표시 유무 확인<br></br>
##### 9.web.xml 의 dispatcherServlet 설정 및 contextConfigureLocation 설정<br>
`[click](https://gmlwjd9405.github.io/2018/10/29/web-application-structure.html) 참고`<br>
`톰캣이슈: cmd-> netstat -a -o -> taskkill /f /pid 4548 (8080에 해당하는 포트 죽이기)`<br>
`엑세스 거부시-> 관리자권한으로 진행`<br>
`home.jsp의 작동원리 참고 :  [home.jsp 설명](https://gabrielyj.tistory.com/147) `<br> 
`(1) web.xml실행->servlet-context.xml이 요청낚아챔`<br>
`(2) servlet-context.xml에서 어노테이션 사용여부및 위치를 확인후 값전달함.`<br>
`(3) 컨트롤러의 @(어노테이션)확인후, 매핑값인 "/" home메소드 실행`<br>
`(4) servlet-context.xml에서 return값 'home'에다가 prefix, suffix를 붙여줌`<br>
`(5) home.jsp가 실행이된다.`<br></br>
##### 10.Controller - service - impl  형태의 백엔드 프로그램 작성<br></br>
##### 11.해당 주소에 대해 표시여부 확인<br></br>
##### 12.MSSQL 설치 <br></br>
##### 13.pom.xml 에 mssql-jdbc 설치<br></br>
##### 14.context-datasource.xml 에 mssql-jdbc 설정<br></br>
##### 15.EgovAbstractMapper 를 통해 쿼리 가능하도록 context-****.xml 파일 설정 (spring-mybatis 를 활용하는 전자정부프레임워크 DAO 개체)<br></br>

 :mag: **진행상태**

| check      | Description                                                                                                                       |
| ---------- | -----------------------------------------------------------------------------------------------------------------------------     |
| :heavy_check_mark:        | eclipse 2021-03 버전 설치                                                                                                         |
| :heavy_check_mark:        | jdk8 이상 설치                                                                                                                    |
| :heavy_check_mark:        | eclipse 에 JAVA PROJECT 추가                                                                                                      |
| :heavy_check_mark:        | 추가된 프로젝트에 build tool :: maven 설정                                                                                        |
| :heavy_check_mark:        | maven 의 pom.xml 을 통해 spring-mvc 4.3 버전 근처로 설치                                                                           |
| :heavy_check_mark:        | TOMCAT 서버 추가(TOMCAT 9, 10)                                                                                                     |
| :heavy_check_mark:        | 추가된 서버에 JAVA PROJECT 를 Add                                                                                                  |
| :heavy_check_mark:        | index.jsp 추가하여 페이지 표시 유무 확인                                                                                            |
| :heavy_check_mark:        | web.xml 의 dispatcherServlet 설정 및 contextConfigureLocation 설정                                                                  |
| :heavy_check_mark:        | Controller - service - impl  형태의 백엔드 프로그램 작성                                                                            |
| :heavy_check_mark:        | 해당 주소에 대해 표시여부 확인                                                                                                      |
| [ ]        | MSSQL 설치    **(진행중)**                                                                                                         |
| [ ]        | pom.xml 에 mssql-jdbc 설치                                                                                                         |
| [ ]        | context-datasource.xml 에 mssql-jdbc 설정                                                                                          |
| [ ]        | EgovAbstractMapper 를 통해 쿼리 가능하도록 context-****.xml 파일 설정 (spring-mybatis 를 활용하는 전자정부프레임워크 DAO 개체)     |




