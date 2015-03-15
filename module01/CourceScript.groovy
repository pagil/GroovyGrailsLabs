class Cource {
def name
def nrOfDays
}

def gogCource = new Cource(name: 'Groovy on Grails', nrOfDays: 3)
println gogCource.name
println gogCource.nrOfDays

def springCource = new Cource(name: 'Spring Core', nrOfDays: 4)
println springCource.name
println springCource.nrOfDays
println springCource.metaClass
// Print each of the method names
println '>>>>'
springCource.metaClass.methods.each{ println it.name }
println '<<<<'
// Print each of the property names
println '>>>>'
springCource.metaClass.properties.each{ println it.name}
println '<<<<'

//Add a property
Cource.metaClass.getPricePerDay = {80}
println new Cource().pricePerDay
// Add a method
Cource.metaClass.totalPrice = {pricePerDay * nrOfDays}
println new Cource(name:'Test', nrOfDays: 4).totalPrice()
// Add static method
Cource.metaClass.static.create={ new Cource(name: 'Static Factory', nrOfDays: 5)}
println Cource.create().totalPrice()
// Add method having parameter
class Parrot{}
Parrot.metaClass.say = {String arg -> println "Parrot said: ${arg}"}
new Parrot().say('Hi!')



null