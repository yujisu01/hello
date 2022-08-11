# Hello

##### 1.eclipse 2021-03 버전 설치<br>
`2020-12 버전 설치 (utf-8 문제)` <br></br>
##### 2.jdk8 이상 설치<br>
`jdk1.8.0_341, jre1.8.0_341 `<br></br>
##### 3.eclipse 에 JAVA PROJECT 추가<br></br>
`project_01로 생성했다가, 망해서 hello 다시만듬 (`<br></br>
##### 4.추가된 프로젝트에 build tool :: maven 설정<br>
`일반프로젝트-configure-convert maven project로 변경`<br></br>
##### 5.maven 의 pom.xml 을 통해 spring-mvc 4.3 버전 근처로 설치<br>
`개인프로젝트 당시 pom.xml 참고. -> 해당프로젝트-오른클릭-maven-update project`<br></br>
##### 6.TOMCAT 서버 추가(TOMCAT 9, 10) <br>
`tomcat9.0추가`<br></br>
##### 7.추가된 서버에 JAVA PROJECT 를 Add<br></br>
##### 8.index.jsp 추가하여 페이지 표시 유무 확인<br></br>
##### 9.web.xml 의 dispatcherServlet 설정 및 contextConfigureLocation 설정<br>
[click](https://gmlwjd9405.github.io/2018/10/29/web-application-structure.html) `참고`<br>
`톰캣이슈: cmd-> netstat -a -o -> taskkill /f /pid 4548 (8080에 해당하는 포트 죽이기)`<br>
`엑세스 거부시-> 관리자권한으로 진행`<br>
`home.jsp의 작동원리 참고 :  ` [home.jsp 설명](https://gabrielyj.tistory.com/147)  <br>
`(1) web.xml실행->servlet-context.xml이 요청낚아챔`<br>
`(2) servlet-context.xml에서 어노테이션 사용여부및 위치를 확인후 값전달함.`<br>
`(3) 컨트롤러의 @(어노테이션)확인후, 매핑값인 "/" home메소드 실행`<br>
`(4) servlet-context.xml에서 return값 'home'에다가 prefix, suffix를 붙여줌`<br>
`(5) home.jsp가 실행이된다.`<br></br>
##### 10.Controller - service - impl  형태의 백엔드 프로그램 작성<br></br>
`1. Controller, Service, Impl 클래스 작성은 이전에 개인프로젝트시 작성해놓은걸 많이 참고했다.(다만 MemberController는 따로 안만들고, MainController에 다 때려넣음)`<br>
2. [Service와 ServiceImpl 에 대한 설명](https://velog.io/@ruinak_4127/Service%EC%99%80-ServiceImpl) <br>
`2-1. 요약하자면, Service라는 인터페이스는 부모클래스이고, ServiceImpl은 자식클래스이다. 부모를 상속받아 implement하는 구현체이다. 개념 알기!`<br></br>
##### 11.해당 주소에 대해 표시여부 확인<br></br>
##### 12.MSSQL 설치 <br></br>
`1. MSSQL : `[해당 페이지참고](https://jjanggu1612.tistory.com/entry/MSSQL-%EC%84%A4%EC%B9%98)<br>
`2. SMMS : `[다운로드 받은곳](https://docs.microsoft.com/ko-kr/sql/ssms/download-sql-server-management-studio-ssms?redirectedfrom=MSDN&view=sql-server-ver15)<br></br>
##### 13.pom.xml 에 mssql-jdbc 설치<br></br>
`1. pom.xml에 설치시 : ` [해당 페이지참고](https://321coucou.tistory.com/20?category=869148)<br>
`(결론적으로는 mssql-jdbc-8.2.2.jre8.jar 파일이 필요하다)`<br>
`2. 오류내역 : Could not connect to New SQL Server. Error creating SQL Model Connection connection to New SQL Server. (Error: 호스트 localhost, 포트 1433에 대한 TCP/IP 연결에 실패했습니다. `[해당 페이지 참고(TCP/IP연결)](https://blog.naver.com/platinasnow/220040778342)<br>
`2-1. 진행사항`<br>
`(1) MSSQL Windows인증모드에서->SQL Server 인증모드로 변경`<br>
`(2) pom.xml의 dependency는 맞게 주입됨. 로그인문제로 오류`<br>
`(3) MSSQL Window로 접속한뒤, 보안폴더->로그인->sa계정속성->암호지정후, 암호강제적용 체크해제->상태 에서 로그인 사용안함->사용으로 변경함`<br>
`(4) 이클립스의 show view-> Data Source Explorer->Database Connections->SQL Server->new->Database는 현재 testDB가 존재하므로,해당 DB입력해줌-> Username(jisu), pwd(MSSQL에서 설정한것)->Test Connections->ping succeed 나오면 Finish`<br>
[해당 페이지 참고(로그인실패시)](https://blog.edit.kr/entry/mssql-%EC%97%90%EC%84%9C-sa-%EB%A1%9C%EA%B7%B8%EC%9D%B8-%EC%8B%A4%ED%8C%A8-%EC%98%A4%EB%A5%98-%ED%95%B4%EA%B2%B0%EB%B0%A9%EB%B2%95) <br>
*MSSQL Server 재구동하려면 'SqlServer구성관리자' 에서 해당서버 다시 시작* <br></br>
##### 14.context-datasource.xml 에 mssql-jdbc 설정<br></br>
```
(1) web.xml에 classpath*:/config/context*.xml [설정시 참고-전체적으로 여기 보고 따라함](https://jdevil.tistory.com/9)<br></br>
```
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
| :heavy_check_mark:        | MSSQL 설치                                                                                                             |
| :heavy_check_mark:        | pom.xml 에 mssql-jdbc 설치                                                                                                         |
| [ ]        | context-datasource.xml 에 mssql-jdbc 설정    **(진행중)**                                                                                      |
| [ ]        | EgovAbstractMapper 를 통해 쿼리 가능하도록 context-****.xml 파일 설정 (spring-mybatis 를 활용하는 전자정부프레임워크 DAO 개체)     |


----------------------------------------
<
![깃방법](https://user-images.githubusercontent.com/78129881/184093944-aeba840d-c469-4dd0-8d04-db6c8506f647.jpg)
