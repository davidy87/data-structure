# Data Structure

## 선형 자료구조

### 1. LinkedList
#### 특징
- 노드를 연결시키는 형태로 구현한 list
- 연속적인 메모리 위치에 저장되지 않는 선형 데이터 구조 (pointer를 사용해서 연결)
- 각 노드는 데이터 필드와 다음 노드에 대한 참조를 포함한다.

#### 종류
- Circular LinkedList
    - tail 노드가 head 노드를 참조한다.
- Doubly LinkedList
    - 각 노드가 양방향으로 참조한다.
- Circular doubly LinkedList
    - circular linked list + doubly linked list

#### 장단점
장점
- 동적 크기
- 삽입 및 삭제 용이

단점
- 임의의 조회를 허용하지 않는다. 특정 위치의 데이터를 찾아야 할 경우, 처음 노드부터 순차적으로 조회해야 한다 (이진 검색 수행 불가능).
- Pointer의 여분의 메모리 공간이 목록의 각 요소에 필요하다.

<br>

### 2. Stack
#### 특징
- 입력과 출력이 한 곳으로 제한되어 있는 자료구조 (LIFO)

#### 주요 동작
- push - 삽입
- pop - 삭제
- peek - 최상단 원소 조회

#### 사용 시기
- stack memory & stack frame
    - 함수의 callstack
- String 역순 출력
- 연산자 후위 표기법

<br>

### 3. Queue
#### 정의
- 입력은 끝에, 출력은 시작으로 제한되어 있는 자료구조 (FIFO)

#### 주요 동작
- enqueue - 삽입
- dequeue - 삭제
- peek - 첫번째 원소 조회

#### 사용 시기
- Buffer
- BFS
- producer/consumer architecture
    - MessageQueue