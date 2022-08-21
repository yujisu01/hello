# Hello<br></br>
------------------------------------------
 :mag: **진행과정**
------------------------------------------
##### 1.eclipse 2021-03 버전 설치<br>
`2020-12 버전 설치 (utf-8 문제)` <br></br>
##### 2.jdk8 이상 설치<br>
`jdk1.8.0_341, jre1.8.0_341 `<br></br>
##### 3.eclipse 에 JAVA PROJECT 추가<br></br>
`project_01로 생성했다가, 망해서 hello 다시만듬 ` [(폴더,패키지 위치 잘못 지정해서 망한 좋은예)](https://github.com/yujisu01/project_01)<br></br>
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
[설정시 참고-전체적으로 여기 보고 따라함](https://jdevil.tistory.com/9)<br>
```
(1) web.xml에 classpath*:/config/context*.xml  
(2) 오류: The fully qualified name of the bean's class, except if it serves only as a parent definition for child   bean definitions.  
해당하는 메이븐이 없어서 오류남. pom.xml에 mybatis 추가해줌으로써 오류해결  
(3) jdbc.properties의 mssql 작성  
(4) log4j는 DB에러발생시 쿼리로그 볼수있다.  (log4jdbc.spylogdelegator.name=net.sf.log4jdbc.log.slf4j.Slf4jSpyLogDelegator 난 이것만 입력함)
```
[jdbc.properties 작성방법 참고](https://rosebay.tistory.com/113)<br></br>

##### 15.EgovAbstractMapper 를 통해 쿼리 가능하도록 context-****.xml 파일 설정 (spring-mybatis 를 활용하는 전자정부프레임워크 DAO 개체)<br></br>
```
(1) 오류: context-datasource.xml 에서 Could not resolve placeholder 'jdbc.driver' in value "${jdbc.driver}"  
-> jdbc.properties에 입력한것들, context-datasource.xml의 dataSource에 그대로 적어줌. 그랬더니 일단 해결  
(2) (2)  Error creating bean with name 'sqlSessionFactory' defined in file [C:\Users\user\eclipse-workspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\hello\WEB-INF\classes\config\context-mybatis.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [C:\Users\user\eclipse-workspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\hello\WEB-INF\classes\mappers\memberMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error creating document instance.  Cause: org.xml.sax.SAXParseException; lineNumber: 2; columnNumber: 1; 예기치 않은 파일의 끝입니다.  
-> 임시로 작성해놨던 memberMapper.xml에서 오류 발생함  
-> 아무것도 작성안해놔서 오류남.  
-> memberMapper.xml 에 IMemberDAO에서 작성해준거 보고 select문 작성하고 다시 가동하니까 정상적으로 켜짐   
-> http://localhost:8080/main  
(3)https://www.egovframe.go.kr/wiki/doku.php?id=egovframework:rte2:psl:dataaccess:mybatisguide 여기참고하는중인데  
-> egovframework.rte 주입했더니, 2.7.0 jar파일없다고 어쩌구 오류뜸 (메이븐 업데이트 해도 동일 오류발생)  
(Error reading file C:\Users\user\.m2\repository\egovframework\rte\egovframework.rte.psl.dataaccess\2.7.0\egovframework.rte.psl.dataaccess-2.7.0.jar  
C:\Users\user\.m2\repository\egovframework\rte\egovframework.rte.psl.dataaccess\2.7.0\egovframework.rte.psl.dataaccess-2.7.0.jar (지정된 파일을 찾을 수 없습니다))  
```
**진행중**

-------------------------------------------------------------------

 :mag: **진행상태**

| check                   | Description                                                                                                                        |
| ----------------------- | ---------------------------------------------------------------------------------------------------------------------------------  |
| :heavy_check_mark:(08/09) | eclipse 2021-03 버전 설치                                                                                                         |
| :heavy_check_mark:(08/09) | jdk8 이상 설치                                                                                                                    |
| :heavy_check_mark:(08/09) | eclipse 에 JAVA PROJECT 추가                                                                                                      |
| :heavy_check_mark:(08/09) | 추가된 프로젝트에 build tool :: maven 설정                                                                                        |
| :heavy_check_mark:(08/09) | maven 의 pom.xml 을 통해 spring-mvc 4.3 버전 근처로 설치                                                                        |
| :heavy_check_mark:(08/09) | TOMCAT 서버 추가(TOMCAT 9, 10)                                                                                                |
| :heavy_check_mark:(08/09) | 추가된 서버에 JAVA PROJECT 를 Add                                                                                             |
| :heavy_check_mark:(08/10) | index.jsp 추가하여 페이지 표시 유무 확인                                                                                      |
| :heavy_check_mark:(08/10)| web.xml 의 dispatcherServlet 설정 및 contextConfigureLocation 설정                                                                 |
| :heavy_check_mark:(08/10)| Controller - service - impl  형태의 백엔드 프로그램 작성                                                                            |
| :heavy_check_mark:(08/10)| 해당 주소에 대해 표시여부 확인                                                                                                      |
| :heavy_check_mark:(08/11)| MSSQL 설치                                                                                                             |
| :heavy_check_mark:(08/11)| pom.xml 에 mssql-jdbc 설치                                                                                                         |
| :heavy_check_mark:(08/21)| context-datasource.xml 에 mssql-jdbc 설정                                                                                     |
| [ ]        | EgovAbstractMapper 를 통해 쿼리 가능하도록 context-****.xml 파일 설정 (spring-mybatis 를 활용하는 전자정부프레임워크 DAO 개체)      |


----------------------------------------
:mag: **깃허브 commit** <br></br>  

![깃방법](https://user-images.githubusercontent.com/78129881/184093944-aeba840d-c469-4dd0-8d04-db6c8506f647.jpg)
