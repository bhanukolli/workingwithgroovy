def numbers = 1..10

for (number in numbers) {
    println(number)
}

def range = 'a'..'n'

for (var in range){
    println(var)
}

def enum DAYS{
    SUN,
    MON,
    TUE,
    WED,
    THU,
    FRI,
    SAT
}

def  weekdays = DAYS.MON..DAYS.FRI

for (var2 in weekdays){
    println(var2)
}
