package tests

import spock.lang.Specification

class ExampleSpec extends Specification implements MyTrait {

    def 'my test'() {
        expect:
        loadKeyStoreFrom('', ''.chars) == ''
    }

}
