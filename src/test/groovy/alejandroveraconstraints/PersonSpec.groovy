// src/test/groovy/alejandroveraconstraints/PersonSpec.groovy
package alejandroveraconstraints

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class PersonSpec extends Specification implements DomainUnitTest<Person> {


    void "test validation"() {
        expect:
        !new Person(name: 'Some Bad Name').validate()
        new Person(name: 'Some Good Name').validate()
    }
}
