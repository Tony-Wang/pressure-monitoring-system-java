package kata.tpms

import spock.lang.Specification


class AlarmTest extends Specification{
    def a_trivial_test() {
        expect:
        5 == 2 +3
    }

    // TODO-new-feature: a normal pressure value after a value outside then range should stop the alarm

}
