package kata.tpms;

public class Alarm {
    public static final double LowPressureThreshold = 17;
    public static final double HighPressureThreshold = 21;

    private Transducer transducer;

    public Alarm() {
        this.transducer = new Sensor();
    }

    public Alarm(Transducer transducer) {
        this.transducer = transducer;
    }

    private boolean alarmOn = false;

    public void check()
    {
        alarmOn = false;

        double psiPressureValue = transducer.popNextPressurePsiValue();

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
