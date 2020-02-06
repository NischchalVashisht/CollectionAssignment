val map=Map("anurag"->22,"deniel"->20,"anushka"->18)
def sumConditional(map:Map[String,Int],str:String):Int={

 map.foldLeft(0) {(accumul:Int,tupl:(String,Int))=>{ if(tupl._1.contains(str)){
    accumul + tupl._2
 }
 else accumul + 0
 }
 }

}

sumConditional(map,"an")
