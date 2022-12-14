workbench 에러
https://055055.tistory.com/44
xmi 파일 지움

No editor descriptor for id org.eclipse.ui.internal.emptyEditorTab

다시 도돌이표
An error has occurred. See error log for more details.
org/eclipse/tm4e/ui/utils/ContentTypeHelper

contact all update sites during install to find required software

그냥 

C:\Users\user\eclipse-jee-2020-12-R-win32-x86_64\eclipse\features

여기서  
tm4e 관련 폴더 다 삭제하니까   
정상적으로 됨  

https://download.eclipse.org/tm4e/snapshots/  

An error has occurred. See error log for more details. org/eclipse/tm4e/ui/utils/ContentTypeHelper  


-
또 계속하다가  
C:\Users\user\AppData\Local\Temp    
임시파일들 221213, 221214꺼 이클립스 끄고 다삭제함  


UI가 다깨진다  
js파일은 물론이고 jsp도 안나옴  
슬슬 ㅈ됨을 감지하고  
이블로그 따라함  
https://youngdev57.tistory.com/78  

오류가떴다
1. 이거랑
Cannot complete the install because of a conflicting dependency.
Software being installed: Git integration for Eclipse 6.4.0.202211300538-r (org.eclipse.egit.feature.group 6.4.0.202211300538-r)
Software being installed: Git integration for Eclipse - Task focused interface 6.1.0.202203080745-r (org.eclipse.egit.mylyn.feature.group 6.1.0.202203080745-r)
Only one of the following can be installed at once: 
Git integration for Eclipse - UI 6.1.0.202203080745-r (org.eclipse.egit.ui 6.1.0.202203080745-r)
Git integration for Eclipse - UI 6.4.0.202211300538-r (org.eclipse.egit.ui 6.4.0.202211300538-r)
Cannot satisfy dependency:
From: Git integration for Eclipse 6.4.0.202211300538-r (org.eclipse.egit.feature.group 6.4.0.202211300538-r)
To: org.eclipse.equinox.p2.iu; org.eclipse.egit.ui [6.4.0.202211300538-r,6.4.0.202211300538-r]
Cannot satisfy dependency:
From: Git integration for Eclipse - Task focused interface 6.1.0.202203080745-r (org.eclipse.egit.mylyn.feature.group 6.1.0.202203080745-r)
To: org.eclipse.equinox.p2.iu; org.eclipse.egit.mylyn.ui [6.1.0.202203080745-r,6.1.0.202203080745-r]
Cannot satisfy dependency:
From: EGit Mylyn UI 6.1.0.202203080745-r (org.eclipse.egit.mylyn.ui 6.1.0.202203080745-r)
To: java.package; org.eclipse.egit.ui [6.1.0,6.2.0)



2. 이거  
An error occurred while collecting items to be installed
session context was:(profile=epp.package.jee, phase=org.eclipse.equinox.internal.p2.engine.phases.Collect, operand=, action=).
Problems downloading artifact: osgi.bundle,org.bouncycastle.bcprov,1.72.0.v20221013-1810.
Error reading signed content:C:\Users\user\AppData\Local\Temp\signatureFile5191223744926338869.jar
An error occurred while processing the signatures for the file: C:\Users\user\AppData\Local\Temp\signatureFile5191223744926338869.jar
  
난리  








대체 이게뭔데    
org/eclipse/tm4e/ui/utils/ContentTypeHelper  

존나짜증난다고  
다 해도 안돼   
는데  
어쩌라고  
나보고   

There is no active editor that provides an outline    

나랑똑같은상황인 블로그 발견 ..버전문제인가 ;  


https://heaven0713.tistory.com/27  

1. node js 깐거 uninstall 함  
2. Tern feature,   
Tern JSDT feature,   
Tern server node.js feature   
Uninstall  


(2차 난리)
An error occurred while collecting items to be installed
session context was:(profile=epp.package.jee, phase=org.eclipse.equinox.internal.p2.engine.phases.Collect, operand=, action=).
Problems downloading artifact: osgi.bundle,org.bouncycastle.bcprov,1.72.0.v20221013-1810.
Error reading signed content:C:\Users\user\AppData\Local\Temp\signatureFile4417447259084317889.jar
An error occurred while processing the signatures for the file: C:\Users\user\AppData\Local\Temp\signatureFile4417447259084317889.jar

이사태를 보고....  

첫번째  
org.eclipse.equinox.internal.p2.engine.phases.Collect, operand=, action=).  
이거는 일단 냅뒀다..  
두번쨰  
osgi.bundle,org.bouncycastle.bcprov,1.72.0.v20221013-1810.  
얘는  
C:\Users\user\eclipse-jee-2020-12-R-win32-x86_64\eclipse\plugins  
이 폴더에서 보니 ㅝㄴ가 중복으로 계속 있길래...  
일단 20221013-1810  버전인게 3개가 있었는데........이 걸 삭제해야되나  
이 전걸 삭제해야되나........  
  
일단 문제가 되는게 20221013-1810 이므로 삭제함  
(1) org.bouncycastle.bcpg_1.72.0.v20221013-1810  
(2) org.bouncycastle.bcpkix_1.72.0.v20221013-1810  
(3) org.bouncycastle.bcutil_1.72.0.v20221013-1810  
뭔데 이게 대체 


그리고  
C:\Users\user\AppData\Local\Temp   
이폴더에 있는 저 signatureFile4417447259084317889.jar 이런 이름으로 오늘자 생성된 자르파일들 다 삭제해버림  


이래도안되려나





이후  
  
https://codingman18.tistory.com/74

이글을보고  
엉킨걸 알었다


근데 나는 재설치말고...풀고싶다  
방법없나요 여러분

---------


그냥 다 삭제했따



-----------
다 꼬인거 맞고  재설치  
java version 1.8.0_341  
이클립스 2021-03   
ㄱㄱ//  
낼 다시 해보자구~~  
