def myClosure = {
    println "In Closure"
    println( new Date())
}

for (i in 1..3) {
    myClosure()
    sleep(1000)
}


(1..3).each {
    myClosure()
}

(1..3).each {
    println "In Closure"
}


(1..3).each {
    println "In Closure : $it"
}


(1..3).each { i ->
    println "In Closure : $i"
}
