// Databricks notebook source exported at Sun, 18 Oct 2015 17:38:41 UTC
// dbadmin can edit this

// COMMAND ----------

1 + 1

// COMMAND ----------

// MAGIC %sql show tables;

// COMMAND ----------

// MAGIC %sql select * from sales_long

// COMMAND ----------

1 +2 +3

// COMMAND ----------

// MAGIC %md 
// MAGIC # local changes only

// COMMAND ----------

sc.parallelize(0 to 100).collect()

// COMMAND ----------

// MAGIC %md
// MAGIC ## how about commit now

// COMMAND ----------

