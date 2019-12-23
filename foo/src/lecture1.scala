package foo

case class Train(number: Int, name: String, coachType: String, kind: String, workingDays: Vector[String])
//Renamed class to coachType as "class" is a scala keyword.

case class Station(name: String, facilities: String, distance: Int)

case class Timing(name: String, number: Int, arr: Option[String], dep: Option[String])

object lec1 {
    val t1 = Vector(
        Train(2400,"Bharat Express","2S","Express",Vector("Mon","Wed","Fri")),
        Train(2500,"Jan Shatabdi","Sleeping","Express Super Fast",Vector("Mon","Thu")),
        Train(2640,"Brindavan Express","AC-I","Passenger",Vector("Wed","Sun")),
        Train(2700,"Assam Intercity","2S","Passenger",Vector("Mon","Tue","Wed","Thu","Fri","Sat","Sun")),
        Train(2900,"Bilaspur Rajdhani","AC-III","Express",Vector("Mon","Tue","Fri"))
    )

    val t2 = Vector(
        Station("Station_001","Shopping Mall",50),
        Station("Station_002","Retiring room",85),
        Station("Station_005","KFC",150),
        Station("Station_007","CCD",175),
        Station("Station_011","WiFi",230),
        Station("Station_020","LCD TV",270),
        Station("Station_023","Shopping Mall",350),
        Station("Station_025","Lounge",400),
        Station("Station_030","Resturants",470),
        Station("Station_035","Bar",600)
    )

    val t3 = Vector(
        Timing("Station_001",2400,None,Some("10:00")),
        Timing("Station_005",2400,Some("12:00"),Some("14:30")),
        Timing("Station_001",2400,Some("18:35"),None),
        Timing("Station_001",2500,Some("23:30"),Some("02:00")),
        Timing("Station_020",2500,Some("02:30"),Some("05:25")),
        Timing("Station_035",2500,Some("08:00"),None),
        Timing("Station_002",2640,None,Some("13:05")),
        Timing("Station_011",2640,Some("14:30"),Some("14:45")),
        Timing("Station_020",2640,Some("17:32"),Some("18:00")),
        Timing("Station_025",2640,Some("20:00"),None)        
    )
}