# Write your MySQL query statement below
select(
SELECT DISTINCT Salary FROM Employee
order by salary desc
limit 1 offset 1
)as SecondHighestSalary;