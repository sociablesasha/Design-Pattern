# 단일체 (Singleton)


## 의도
오직 한 개의 클래스 인스턴스만을 갖도록 보장하고, 이에 대한 전역적인 접근점을 제공한다.
> 




## 활용성
- 클래스의 인스턴스가 오직 하나여야 함을 보장하고, 잘 정의된 접근점으로 모든 사용자가 접근할 수 있도록 해야 할 때.
- 유일한 인스턴스가 서브클래싱으로 확장되어야 하며, 사용자는 코드의 수정없이 확장된 서브클래스의 인스턴스를 사용해야 할 때.




## 참여자
### Singleton
유일한 인스턴스를 생성하는 책임을 맡는다.




## 결과
1. 유일하게 존재하는 인스턴스로의 접근을 통제한다.
2. 이름 공간을 좁힌다.
3. 연산 및 표현의 정제를 허용한다.
4. 인스턴스의 개수를 변경하기가 자유롭다.
5. 클래스 연산을 사용하는 것보다 훨씬 유연한 방법이다.