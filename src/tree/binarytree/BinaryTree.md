## Binary Tree

### 정의

각 노드의 자녀 노드 수가 **최대 두 개**인 트리

### 종류

#### Full Binary Tree

- 정 이진 트리
- 모든 노드는 자녀 노드가 없거나 두 개인 트리
    - 자녀 노드가 1개만 있는 노드는 없다.

#### Complete Binary Tree

- 완전 이진 트리
- 마지막 레벨을 제외한 모든 레벨에서 노드가 빠짐없이 채워져 있고, 마지막 레벨은 왼쪽부터 빠짐없이 노드가 채워져 있는 트리

#### Perfect Binary Tree

- 포화 이진 트리
- 모든 레벨에서 노드가 빠짐없이 채워진 트리

#### Degenerate Binary Tree

- 변질 이진 트리
- 모든 부모 노드는 단 하나의 자녀 노드만 가지는 트리
- Pathological binary tree 라고도 불림
- 종류
    - Left-skewed binary tree
        - 모든 부모 노드가 왼쪽 자녀 노드만 가지는 트리
    - Right-skewed binary tree
        - 모든 부모 노드가 오른쪽 자녀 노드만 가지는 트리

#### Balanced Binary Tree

- 균형 이진 트리
- 모든 노드에서 왼쪽 서브 트리와 오른쪽 서브 트리의 높이 차이가 최대 1인 트리