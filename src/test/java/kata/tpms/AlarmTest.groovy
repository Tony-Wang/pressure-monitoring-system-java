package kata.tpms

import spock.lang.Specification


class AlarmTest extends Specification{
    def a_trivial_test() {
        expect:
        5 == 2 +3
    }

    // TODO-user-intent-test: a normal pressure value should not raise the alarm
    // TODO-user-intent-test: a pressure value outside the range should raise the alarm
    // TODO-user-intent-test: a normal pressure value after a value outside the range should not stop the alarm
    // TODO-new-feature: a normal pressure value after a value outside then range should stop the alarm

}
