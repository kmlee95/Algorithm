## queue

push : 큐에 자료를 넣는 연산
pop : 큐에서 자료를 빼는 연산
front : 큐의 가장 앞 자료를 보는연산

큐의 구현 -> 일차원배열 하나로 구현
int queue[10000]
int begin = 0;
int end = 0;

```java
void push(int data){
    queue[end] = data;
    end += 1;
}

int pop(){
    queue[begin] = 0;
    begin += 1;
}

bool empty(){
    if(start == end) return true;
    else return false;
}

int size(){
    return end-size;
}
```

자바의경우 java.util.Queue 사용, 복잡도 1
queue는 보통 BFS에서 사용

1. 조세퍼스 문제
pop - push (횟수만큼 반복) -> 3번일경우 마지막 pop일때 다른 배열에 넣어두기(정답)

## 덱
양끝에서만 자료를 넣고 양끝에서 뺄 수 있는 자료구죠
Double-ended queue의 약자(queue와 stack 같이 사용한다고 생각)



--
```java
- Stack

import java.util.*;

- Stack<T> stack = new Stack<>();

- push() : 스택에 삽입

- pop() : 스택에서 가장 위에 있는 값 반환하고 없앰

- peek() : 스택에서 가장 위에 있는 값 반환

- isEmpty() : 스택이 비어있는지를 반환

- size() : 스택에 있는 요소의 크기 반환



- Queue

import java.util.*;

- Queue<T> queue = new LinkedList<>();

- add() : 큐에 삽입

- peek() : 가장 먼저 큐에 들어간 요소 반환

- remove() : 가장 먼저 큐에 들어간 요소 삭제하면서 반환

- isEmpty() : 큐가 비어있는지 반환

- size() : 큐에 있는 요소의 크기 반환



- Deque

import java.util.*;

- Deque<T> deque = new LinkedList<>();

- addFirst() : 앞에 요소 삽입

- addLast() : 뒤에 요소 삽입

- peekFirst() : 앞 요소 반환

- peekLast() : 뒤 요소 반환

- pollFirst() : 앞 요소 없애면서 반환

- pollLast() : 뒤 요소 없애면서 반환
```