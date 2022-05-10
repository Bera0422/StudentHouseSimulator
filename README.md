# StudentHouseSimulator
In this homework project, the allocation of students to houses is simulated given an input.txt which has the datas of houses and students.
<br>
<br>
input.txt has the following input format <br>

#### h \<id> \<duration> \<rating> <br>
  There are 4 parts which are single-space separated in a line for a house.
The first part, the letter h, is the house indicator. The second part, \<id>,
is the id of the house. The third part, \<duration>, is the duration as the
number of semesters that the house is full. If the duration is 3, then this
house will be available after 3 semesters. The last part, \<rating>, is the
rating which shows the good or bad condition of the house.
<br>
#### s \<id> \<name> \<duration> \<rating> <br>
  There are 5 parts which are single-space separated in a line for a student.
The first part, the letter s, is the student indicator. The second part, \<id>,
is the student id. The third part, \<name>, is the name of the student. The
fourth part, \<duration>, is the duration as the number of semesters that
the student will study at the University of Datalonya. For example, if the
duration is 3, then this student will graduate after 3 semesters. Of course,
max duration can be 8 for a student. The last part, \<rating>, is the rating
which shows the minimum rating criterion of the student to accept a house.
For example, if the rating parameter for a student is 3.2, then this student
can only stay at houses with rating equal to or greater than 3.2.
