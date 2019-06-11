// grails-app/domain/alejandroveraconstraints/Person.groovy
package alejandroveraconstraints

class Person {
    String name

    static constraints = {
        name nullable: false, validator: Person.validateName
    }

    static validateName = {
        it != 'Some Bad Name'
    }
}
