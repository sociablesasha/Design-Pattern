# 책임 연쇄 (Chain of Responsibility)

## 의도
메시지를 보내는 객체와 이를 받아 처리하는 객체의 결합도를 없애기 위한 패턴이다.
> 하나의 요청에 대한 처리가 반드시 한 객쳬가 아닌 여러 객체에 그 처리 기회를 준다. (Event Bubbling)



## 기존 VS 변경
### 기존
하나의 요청에 하나의 객체가 대응한다.
### 변경
하나의 요청이 여러 객체 중 처리할 수 있는 객체가 맡아 책임진다.



## 활용성
- 하나 이상의 객체가 요청을 처리해야 하고 그 요청 처리자 중 어떤 것이 선행자인지 모를 때.
- 메시지를 받을 객체를 명시하지 않은 채 여러 객체 중 하나에게 처리를 요청하고 싶을 때.
- 요청을 처리할 수 있는 객체 집합이 동적으로 정의될 때.



## 참여자
### Handler
요청을 처리하는 인터페이스를 정의하고 연결을 구현한다.
### ConcreteHandler
자신이 처리할 행동이 있으면 처리하고, 그렇지 않으면 후속 처리자에 다시 처리를 요청한다.
### Client
객체에게 필요한 요청을 보낸다.



## Private
구조가 다른 클래스에 대해서 낮은 결합도로 동일한 이벤트에 대한 핸들링을 가능하게 한다.
하지만 요청이 반드시 수행된다는 보장이 없고 걸리는 시간을 예측하기 힘들다는 단점이 있다.