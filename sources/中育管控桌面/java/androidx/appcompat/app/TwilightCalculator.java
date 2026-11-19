package androidx.appcompat.app;

/* loaded from: classes.dex */
class TwilightCalculator {
    private static final float ALTIDUTE_CORRECTION_CIVIL_TWILIGHT = -0.10471976f;

    /* renamed from: C1 */
    private static final float f66C1 = 0.0334196f;

    /* renamed from: C2 */
    private static final float f67C2 = 3.49066E-4f;

    /* renamed from: C3 */
    private static final float f68C3 = 5.236E-6f;
    public static final int DAY = 0;
    private static final float DEGREES_TO_RADIANS = 0.017453292f;

    /* renamed from: J0 */
    private static final float f69J0 = 9.0E-4f;
    public static final int NIGHT = 1;
    private static final float OBLIQUITY = 0.4092797f;
    private static final long UTC_2000 = 946728000000L;
    private static TwilightCalculator sInstance;
    public int state;
    public long sunrise;
    public long sunset;

    public static TwilightCalculator getInstance() {
        if (sInstance == null) {
            sInstance = new TwilightCalculator();
        }
        return sInstance;
    }

    public void calculateTwilight(long j6, double d6, double d7) {
        double d8 = (0.01720197f * ((j6 - UTC_2000) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(d8) * 0.03341960161924362d) + d8 + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double dRound = Math.round((r2 - f69J0) - r6) + f69J0 + ((-d7) / 360.0d) + (Math.sin(d8) * 0.0053d) + (Math.sin(2.0d * dSin) * (-0.0069d));
        double dAsin = Math.asin(Math.sin(dSin) * Math.sin(0.4092797040939331d));
        double d9 = 0.01745329238474369d * d6;
        double dSin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d9) * Math.sin(dAsin))) / (Math.cos(d9) * Math.cos(dAsin));
        if (dSin2 >= 1.0d) {
            this.state = 1;
            this.sunset = -1L;
            this.sunrise = -1L;
        } else {
            if (dSin2 <= -1.0d) {
                this.state = 0;
                this.sunset = -1L;
                this.sunrise = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin2) / 6.283185307179586d);
            this.sunset = Math.round((dRound + dAcos) * 8.64E7d) + UTC_2000;
            long jRound = Math.round((dRound - dAcos) * 8.64E7d) + UTC_2000;
            this.sunrise = jRound;
            if (jRound >= j6 || this.sunset <= j6) {
                this.state = 1;
            } else {
                this.state = 0;
            }
        }
    }
}
