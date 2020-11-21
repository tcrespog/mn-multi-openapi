package mn.multi


import io.micronaut.test.extensions.spock.annotation.MicronautTest
import mn.multi.domain.Cat
import mn.multi.domain.Dog
import mn.multi.domain.Human
import spock.lang.Specification

@MicronautTest
class DomainSpec extends Specification {

    void 'create some domain instances'() {
        expect:
        new Human(name: 'John')
        new Dog(name: 'Pluto', breed: 'Unknown')
        new Cat(name: 'Garfield', lives: 7)
    }

}
