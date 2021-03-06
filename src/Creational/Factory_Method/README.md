# 팩터리 메서드 (Factory Method)


## 의도
객체를 생성하기 위해 인터페이스를 정의하지만, 어떤 클래스의 인스턴스를 생성할 지에 대한 결정은 서브클래스가 내리도록 한다.
> 가상 생성자




## 활용성
- 어떤 클래스가 자신이 생성해야 하는 객체의 클래스를 예측할 수 없을 때.
- 생성할 객체를 기술하는 책임을 자신의 서브클래스가 지정했으면 할 때.




## 참여자
### Product
팩토리 메서드가 생성하는 객체의 인터페이슬르 정의한다.
### ConcreteProduct
Product 클래스에 정의된 인터페이스를 실제로 구현한다.
### Creator
Product 타입의 객체를 반환하는 팩토리 메소드를 선언한다.
### ConcreteCreator
팩토리 메서드를 재정의하여 ConcreteProduct의 인스턴스를 반환한다.




## 결과
1. 서브클래스에 대한 훅 메서드를 제공한다.
2. 병렬적인 클래스 계통을 연결하는 역할을 담당한다.