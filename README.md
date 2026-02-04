# schedule
**일정 생성**

***Request***
* Method	URL	Content-Type
* POST	/schedules	application/json

'''
{
"작성자" : "음료수중독", <br>
"일정 제목" : "과자과제",
"일정 내용" : "일정 관리 API",
"schedule_ID" : 1,
"비밀번호" : 1234
}
'''

***Response***
* Status Code : 201 created
'''
{
"작성자" : "음료수중독",
"일정 제목" : "과자과제",
"일정 내용" : "일정 관리 API",
"schedule_ID" : 1
}
'''

401 Unauthorized
'''
message	"요청이 거부되었습니다."
'''
500 서버 오류
'''
message	"페이지를 찾을 수 없습니다."
'''
404 Not Found
'''
message	"페이지를 찾을 수 없습니다."
'''

