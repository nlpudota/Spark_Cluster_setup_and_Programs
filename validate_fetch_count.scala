val inputFile = sc.textFile("C:/hadoop/test.txt") 
inputFile.toDebugString
val forParallel = inputFile.collect().toList
val asParallel = sc.parallelize(forParallel)
asParallel.groupBy(word => word.charAt(0)).collect
inputFile.filter(word => word.charAt(3)=='1').count()
