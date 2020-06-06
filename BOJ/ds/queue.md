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

