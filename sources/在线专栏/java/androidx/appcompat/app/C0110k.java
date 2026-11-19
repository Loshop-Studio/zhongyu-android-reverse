package androidx.appcompat.app;

/* renamed from: androidx.appcompat.app.k */
/* loaded from: classes.dex */
class C0110k {

    /* renamed from: d */
    private static C0110k f370d;

    /* renamed from: a */
    public long f371a;

    /* renamed from: b */
    public long f372b;

    /* renamed from: c */
    public int f373c;

    C0110k() {
    }

    /* renamed from: b */
    static C0110k m294b() {
        if (f370d == null) {
            f370d = new C0110k();
        }
        return f370d;
    }

    /* renamed from: a */
    public void m295a(long j4, double d4, double d5) {
        double d6 = (0.01720197f * ((j4 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double dSin = (Math.sin(d6) * 0.03341960161924362d) + d6 + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double dRound = Math.round((r3 - 9.0E-4f) - r9) + 9.0E-4f + ((-d5) / 360.0d) + (Math.sin(d6) * 0.0053d) + (Math.sin(2.0d * dSin) * (-0.0069d));
        double dAsin = Math.asin(Math.sin(dSin) * Math.sin(0.4092797040939331d));
        double d7 = 0.01745329238474369d * d4;
        double dSin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d7) * Math.sin(dAsin))) / (Math.cos(d7) * Math.cos(dAsin));
        if (dSin2 >= 1.0d) {
            this.f373c = 1;
            this.f371a = -1L;
            this.f372b = -1L;
        } else {
            if (dSin2 <= -1.0d) {
                this.f373c = 0;
                this.f371a = -1L;
                this.f372b = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin2) / 6.283185307179586d);
            this.f371a = Math.round((dRound + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dRound - dAcos) * 8.64E7d) + 946728000000L;
            this.f372b = jRound;
            if (jRound >= j4 || this.f371a <= j4) {
                this.f373c = 1;
            } else {
                this.f373c = 0;
            }
        }
    }
}
