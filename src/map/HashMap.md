# Map & Hash Table

<br>

## Map
### 정의

- key-value pair들을 저장하는 ADT
- 같은 key를 가지는 pair는 최대 한 개만 존재 (key 중복 불가)
- Associative array, dictionary라고 불리기도 함

<br>

## Hash Table
### 정의
- 배열과 해시 함수(hash function)를 사용하여 map을 구현한 자료구조
- (일반적으로) 상수 시간으로 데이터에 접근하기 때문에 빠름

### Hash Function
- 임의의 크기를 가지는 type의 데이터를 고정된 크기를 가지는 type의 데이터로 변환하는 함수
- (Hash table에서) 임의의 데이터를 정수로 변환하는 함수

### Hash Collision
- key는 다른데 hash 값이 같을 때 충돌 발생
- key도 hash도 다른데, `hash % map_capacity` 결과가 같을 때 충돌 발생

#### 해결 방법
- open addressing
    - linear probing
        - 데이터 추가 시 충돌이 일어날 경우, 그 다음 비어있는 공간에 새로운 데이터를 저장한다.
        - 조회 시 충돌이 일어날 경우, 다음 배열 공간들을 조회하며 해당 key가 있는지 확인한다.
        - 데이터 삭제 시, 삭제된 배열 공간을 추가 시 충돌이 일어난 값으로 다시 채우거나, 더미 값으로 채워 해당 공간의 데이터가 삭제되었다는 것을 표시해야 한다 (충돌 때문에 다른 공간에 저장된 데이터가 있을 수 있으므로).
- separate chaining
    - 배열에 linked list를 담아두는 방식으로 동작
    - 충돌이 일어날 시, 노드를 하나 더 생성해 저장

### Hash Table Resizing
데이터가 많이 차게 되면, hash table의 크기를 늘려야 한다.
- Java의 HashMap은 capacity의 75% 정도가 차게 되면 크기를 두 배로 늘린다.