package kata.tpms;

public class Alarm {
    public static final double LowPressureThreshold = 17;
    public static final double HighPressureThreshold = 21;

    // TODO: Depending on a concrete Sensor violates the Dependency Inversion Principle and Open-Closed Principle
    private Sensor sensor = new Sensor();

    public Alarm(Sensor sensor) {
        this.sensor = sensor;
    }

    private boolean alarmOn = false;

    public void check()
    {
        alarmOn = false;

        double psiPressureValue = sensor.popNextPressurePsiValue();

        if (psiPressureValue < LowPressureThreshold || HighPressureThreshold < psiPressureValue)
        {
            alarmOn = true;
        }
    }

    public boolean isAlarmOn()
    {
        return alarmOn;
    }
}
