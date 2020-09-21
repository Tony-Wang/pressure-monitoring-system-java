package kata.tpms

import spock.lang.Specification


class AlarmTest extends Specification{
    def "a normal pressure value should not raise the alarm" () {
        given:
        Sensor stubSensor = Stub(Sensor)
        def alarm = new Alarm(stubSensor)
        stubSensor.popNextPressurePsiValue() >> Alarm.LOW_PRESSURE_THRESHOLD +1
        when:
        alarm.check()
        then:
        !alarm.isAlarmOn()
    }

    def "a pressure value outside the range should raise the alarm" () {
        given:
        Sensor stubSensor = Stub(Sensor)
        def alarm = new Alarm(stubSensor)
        stubSensor.popNextPressurePsiValue() >> Alarm.HIGH_PRESSURE_THRESHOLD+1
        when:
        alarm.check()
        then:
        alarm.isAlarmOn()
    }

    def "a normal pressure value after a value outside the range should not stop the alarm" () {
        given:
        Sensor stubSensor = Stub(Sensor)
        def alarm = new Alarm(stubSensor)

        when:
        stubSensor.popNextPressurePsiValue() >>> [Alarm.HIGH_PRESSURE_THRESHOLD+1, Alarm.LOW_PRESSURE_THRESHOLD+1]
        alarm.check()

        and:
        alarm.check()

        then:
        !alarm.isAlarmOn()
    }
}
