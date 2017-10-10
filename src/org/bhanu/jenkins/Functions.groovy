package org.bhanu.jenkins

/**
 * Created by bhkolli on 10/9/17.
 */

def numbers = 0..9

for (num in numbers){
    if (isEven(num)) {
        println num
    }
}

def  isEven(def num){
    return num%2 == 0
}
