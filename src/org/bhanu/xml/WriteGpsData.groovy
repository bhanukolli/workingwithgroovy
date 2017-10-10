package org.bhanu.xml

/**
 * Created by bhkolli on 10/10/17.
 */

def file = new File('file.gpx')

def slurper = new XmlSlurper()
def gpx = slurper.parse(file)

def markupBuilder = new groovy.xml.StreamingMarkupBuilder()
def xml = markupBuilder.bind{
    route{
        gpx.wpt.each { point ->
            routepoint(name: point.name.toString()){
                latitude(point.@lat)
                longitude(point.@lot)
            }

        }
    }

}


def outFile = new File('bhanu.xml')
outFile.write(xml.toString())

