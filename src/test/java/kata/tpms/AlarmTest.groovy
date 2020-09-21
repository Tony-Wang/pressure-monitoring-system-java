package kata.tpms

import spock.lang.Specification


class AlarmTest extends Specification{
    // TODO-user-intent-test: a normal pressure value should not raise the alarm
    def "a normal pressure value should not raise the alarm" () {
        given:
        Sensor stubSensor = Stub(Sensor)
        def alarm = new Alarm(stubSensor)
        stubSensor.popNextPressurePsiValue() >> Alarm.LowPressureThreshold +1
        when:
        alarm.check()
        then:
        !alarm.isAlarmOn()
    }

    // TODO-user-intent-test: a pressure value outside the range should raise the alarm
    // TODO-user-intent-test: a normal pressure value after a value outside the range should not stop the alarm
    // TODO-new-feature: a normal pressure value after a value outside then range should stop the alarm

}
