def beateles = ["John", "Paul" , "George"]

for (def i =0 ; i< beateles.size; i++){
    def greeting = "Hello, "
    println "$greeting" + "${beateles[i]}"
    println "${i*10}"
}
