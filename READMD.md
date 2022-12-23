# Issue

---

### 1. p.48 코드 오타 `design.html` 
: 브라우저에서 name text input 옆에, 책과 달리 항상 Faslse가 표시 되는 현상 발생
> ***원인*** : 책의 코드 내 불필요한 코드를 포함 함(오타로 보임)
> 
> ***해결*** : 불필요한 코드 제거
> 
> ***제거 코드*** : `<span th:text="${#field.hasErrors('name')}"> XXX </span>`
> 
> ***원인 분석*** : 초기상태에서 name 속성은 항상 False 일 수 밖에 없으며, 이에 의해 항상 
> `<span>` 태그가 렌더링 되어 Fasle 표시 됨.

### 2. localhost8080/h2-console 접속 불가 발생
> ***원인*** : (추정) 내장 h2-database 의존성 설정시 문제가 발생한게 아닐까 함
> 
> ***해결*** : h2-console접근에 이상이 없는 프로젝트에서, 
> pom.xml을 붙여넣기 후 프로젝트 Re-build

### 3. html Form 제출 오류 발생
 : Spring security 학습 중, 이전과 달리 초기 form 으로 제출 된 url mapping이 이루어 지지 않아 403 Error가 화면에 표시 됨.
> ***원인*** : 모르겠음. 
> html form 태그에서, `method="POST"` 설정 상태에서, `action` 속성을 지정하지 않을 경우, 해당 경로의 POST mapping 된 메서드가 실행되는 것으로 알고 있으며, 이전에는 문제가 없이 호출되었음. 그러나 갑자기 해당 요청에 mapping이 되지 않아 메서드 호출이 되지 않는 상태 발생.
>
> ***해결*** : `design.html` 의 `form` 태그의 속성에서, `th:action="@{/design}"` 속성 추가 

### 4. Spring 버전 변경으로 인한, 참조 코드 작성 불가
 : Spring security 학습 중, `SecurityConfig` 작성 시 책의 참고코드와 달리, `WebSecurityConfihurerAdapter` 클래스 이용 불가하여 상속되지 않기에 코드작성 불가
> ***원인*** : `WebSecurityConfihurerAdapter` : Current Deprecated state
> 
> ***해결*** : Spring 공식 문서 참고하여 코드 변경
 