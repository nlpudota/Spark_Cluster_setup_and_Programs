val inputFile = sc.textFile("C:/hadoop/wordcount.txt")
inputFile.collect()
val words=inputFile.flatMap(line=>line.split(" "))
words.collect
val count1perwords=words.map(word=>(word,1))
val counts=count1perwords.reduceByKey{case(counter,nextVal)=>counter+nextVal}
counts.collect
counts.saveAsTextFile("C:/hadoop/wordcount_res")