package com.neo.groovy

class First {
    {main(null)}

    static void main(def args){
        def mylist= [1,2,"Lars","4"]
        mylist.each{ println it }
    }
}