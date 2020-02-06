val map=Map(1->List("sunil","laxmi"),2->List("Bhavya","Sangeeta"),3->List("Arun","Sushmita"),4->List("jamwant"))


def sumConditional(map:Map[Int,List[String]]):Map[Int,List[String]]={

  val tempMap = Map[Int, List[String]]() //temp array to save changes

  map.foldLeft(tempMap) { (tempMap: Map[Int, List[String]], map: (Int, List[String])) =>

    if (map._1 % 2 != 0) {
      tempMap ++ Map(map._1 -> map._2.map(firstLetter => firstLetter.head + "odd"))
    } else {
      tempMap ++ Map(map._1 -> map._2.map(firstLetter => firstLetter.head + "even"))
    }
  }
  }



 sumConditional(map)

