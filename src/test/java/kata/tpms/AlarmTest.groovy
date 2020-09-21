package kata.tpms

import spock.lang.Specification


class AlarmTest extends Specification{
    def a_trivial_test() {
        expect:
        5 == 2 +3
    }

    // TODO-new-feature: the alarm will be turned off before each checking of pressure

}
