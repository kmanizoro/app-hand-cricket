# Java based hand cricket

Java based hand cricket with simple and extended players support.

### Tech Stack

* [Java 11](http://jdk.java.net/11/)

### Description

| Action | RESULT |
| :---: | :---: |
| In a throw, when both show the different number of fingers | In a throw, when both show the same number of fingers The batting player's number is added to the batting player's score. The other player's number is insignificant. |
| In a throw, when both show the same number of fingers  | The batting player gets out |

### Simple Hand Cricket - Run :

```sh
Players: Dravid, Sachin
No of Overs: 1

Who bats first? Dravid
Round 1: Dravid is batting
Over 1
Dravid throws 2 , Sachin throws 4. Dravid's score is 2
Dravid throws 1 , Sachin throws 4. Dravid's score is 3
Dravid throws 2 , Sachin throws 2. Dravid's Out

Round 2: Sachin is batting
Over 1
Sachin throws 4 , Dravid throws 3. Sachin's score is 4
Sachin throws 3 , Dravid throws 4. Sachin's score is 7
Sachin throws 1 , Dravid throws 2. Sachin's score is 8
Sachin throws 4 , Dravid throws 5. Sachin's score is 12
Sachin throws 4 , Dravid throws 3. Sachin's score is 16
Sachin throws 1 , Dravid throws 3. Sachin's score is 17

Game Winner is Sachin
```

### Extended Hand Cricket - Run :

```sh
Players: Dravid, Sachin, Kholi, Dhoni
No of Overs: 2

Round 1: Sachin is batting
Over 1
Sachin throws 4 , Dravid throws 5. Sachin's score is 4
Sachin throws 1 , Dravid throws 1. Sachin's Out & Total Score is 4

Round 2: Dravid is batting
Over 1
Dravid throws 0 , Kholi throws 3. Dravid's score is 0
Dravid throws 4 , Kholi throws 2. Dravid's score is 4
Dravid throws 5 , Kholi throws 4. Dravid's score is 9
Dravid throws 3 , Kholi throws 1. Dravid's score is 12
Dravid throws 3 , Kholi throws 3. Dravid's Out & Total Score is 12

Round 3: Kholi is batting
Over 1
Kholi throws 2 , Dravid throws 4. Kholi's score is 2
Kholi throws 4 , Dravid throws 3. Kholi's score is 6
Kholi throws 3 , Dravid throws 0. Kholi's score is 9
Kholi throws 0 , Dravid throws 1. Kholi's score is 9
Kholi throws 3 , Dravid throws 4. Kholi's score is 12
Kholi throws 5 , Dravid throws 3. Kholi's score is 17
Over 2
Kholi throws 5 , Dravid throws 3. Kholi's score is 22
Kholi throws 5 , Dravid throws 2. Kholi's score is 27
Kholi throws 4 , Dravid throws 1. Kholi's score is 31
Kholi throws 4 , Dravid throws 2. Kholi's score is 35
Kholi throws 0 , Dravid throws 5. Kholi's score is 35
Kholi throws 0 , Dravid throws 0. Kholi's Out & Total Score is 35

Round 4: Dhoni is batting
Over 1
Dhoni throws 4 , Dravid throws 4. Dhoni's Out & Total Score is 0

The winning player is  Kholi
```
