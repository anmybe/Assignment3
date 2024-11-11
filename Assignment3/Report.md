Assignment 3
------------

# Team Members

# GitHub link to your (forked) repository (if submitting through GitHub)

...

# Task 4

After completing the implementation, briefly address the following points in Report.md. You should focus on _why_ you made specific choices more than _what_ were the choices:
* interest in the results
   > Ans:
   >

* choice of data structure (RDD or DataSet)
   > Ans:
   >

* choice of arguments of the class
   > Ans:
   >

* choice of data ingress method
   > Ans:
   >

# Task 5

1. When uploading files to HDFS, do you need to specify the node this file or folder is placed
on? To which design goal of distributed systems does this relate?
   > Ans:
   >

2. Which other design goals of distributed system does HDFS address and how? Name two and
explain briefly. To answer the question, you can reason by analogy with the GFS.
   > Ans:
   >

3. In your implementation of WordCount (Task 1 ), did you use the ReduceByKey or group-
ByKey method? What does your preferred method do in your implementation? What are the
differences between the two methods in Spark?
   > Ans:
   >

4. Explain what a Resilient Distributed Dataset (RDD) is and the benefits it brings to the classic
MapReduce model.
   > Ans:
   >

5. Reflect on the advantages of DataSet in comparison to RDD.
   > Ans:
   >

6. Imagine that you have a large dataset that needs to be processed in parallel. How would you
partition the dataset efficiently and keep control over the number of outputs created at the
end of the execution? If a task is stuck on the Spark cluster due to a network issue that the
cluster had during execution, which methods can be used to retry or restart the task execution
on a node?
   > Ans:
   >
