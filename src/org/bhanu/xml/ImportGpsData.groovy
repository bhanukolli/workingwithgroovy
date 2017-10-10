package org.bhanu.xml

/**
 * Created by bhkolli on 10/10/17.
 */

def file = new File('file.gpx')

println file.exists()


def slurper = new XmlSlurper()
def gpx = slurper.parse(file)

// println gpx

println gpx.metadata.name
println 'bhanu'
println gpx.metadata.desc

println gpx.@version
println gpx.@creator

for (point in gpx.wpt ){
    println point.@lat
    println point.@lon
}
