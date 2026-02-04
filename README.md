# schedule
### 일정 생성

***Request***
| Method | URL | Content-Type |
| --- | --- | --- |
| POST | /schedules | application/json |


```
{
"작성자" : "음료수중독", <br>
"일정 제목" : "과자과제",
"일정 내용" : "일정 관리 API",
"schedule_ID" : 1,
"비밀번호" : "1234"
"작성일" : "2026-02-04T07:33:07Z"
}
```

***Response***
<br>
<br>
Status Code
* 201 created
```
{
"작성자" : "음료수중독",
"일정 제목" : "과자과제",
"일정 내용" : "일정 관리 API",
"schedule_ID" : 1
}
```

* 401 Unauthorized
```
message	"요청이 거부되었습니다."
```
* 500 서버 오류
```
message	"페이지를 찾을 수 없습니다."
```
* 404 Not Found
```
message	"페이지를 찾을 수 없습니다."
```

<br>
<br>

### 전체 일정 조회

***Response***
| Method | URL | Content-Type |
| --- | --- | --- |
| GET | /schedules | application/json |

* Status Code : 200 OK

```
{
"작성자" : "음료수중독",
"일정 제목" : "과자과제",
"일정 내용" : "일정 관리 API",
"schedule_ID" : 1
}
```

<br>
<br>

### 선택 일정 조회

***Response***
| Method | URL | Content-Type |
| --- | --- | --- |
| GET | /schedules{id} | application/json |
<br>

* 패스 파라미터

| 필드명 | 타입 | 설명 |
|-------|-------|-------|
| writer_ID | Long | 고유 식별자 |

```
{
"작성자" : "음료수중독",
"일정 제목" : "과자과제",
"일정 내용" : "일정 관리 API",
"schedule_ID" : 1
}
```

<br>
<br>

### 선택 일정 수정

***Request***
| Method | URL | Content-Type |
| --- | --- | --- |
| PATCH | /schedules{id} | application/json |

<br>

* 패스 파라미터

| 필드명 | 타입 | 설명 |
|-------|-------|-------|
| writer_ID | Long | 고유 식별자 |

```
{
"작성자" : "음료수중독",
"일정 제목" : "해방이다",
"일정 내용" : "플스 해야지",
"schedule_ID" : 1,
"비밀번호" : "1234",
}
```

***Response***

* Status Code : 200 OK
```
{
"작성자" : "음료수중독",
"일정 제목" : "해방이다",
"일정 내용" : "플스 해야지",
"schedule_ID" : 1,
"작성일" : "2026-02-04T07:33:07Z",
"수정일" : "2026-02-04T07:33:07Z"
}
```
* 401 Unauthorized
```
message	"요청이 거부되었습니다."
```
* 500 서버 오류
```
message	"페이지를 찾을 수 없습니다."
```
* 404 Not Found
```
message	"페이지를 찾을 수 없습니다."
```

<br>
<br>

### 선택 일정 삭제

***Request***
| Method | URL | Content-Type |
| --- | --- | --- |
| DELETE | /schedules{id} | application/json |

* 패스 파라미터

| 필드명 | 타입 | 설명 |
|-------|-------|-------|
| writer_ID | Long | 고유 식별자 |

***Response***

* Status Code : 204 No Content
```
{
"schedule_ID" : "음료수중독",
"비밀번호" : "해방이다",
}
```

