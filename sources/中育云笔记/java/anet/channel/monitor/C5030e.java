package anet.channel.monitor;

import androidx.camera.video.AudioStats;

/* renamed from: anet.channel.monitor.e */
/* loaded from: classes3.dex */
class C5030e {

    /* renamed from: b */
    private double f2487b;

    /* renamed from: c */
    private double f2488c;

    /* renamed from: d */
    private double f2489d;

    /* renamed from: e */
    private double f2490e;

    /* renamed from: f */
    private double f2491f;

    /* renamed from: g */
    private double f2492g;

    /* renamed from: h */
    private double f2493h;

    /* renamed from: a */
    private long f2486a = 0;

    /* renamed from: i */
    private double f2494i = AudioStats.AUDIO_AMPLITUDE_NONE;

    /* renamed from: j */
    private double f2495j = AudioStats.AUDIO_AMPLITUDE_NONE;

    /* renamed from: k */
    private double f2496k = AudioStats.AUDIO_AMPLITUDE_NONE;

    /* renamed from: a */
    public double m2365a(double d10, double d11) {
        char c10;
        double d12 = d10 / d11;
        if (d12 < 8.0d) {
            if (this.f2486a != 0) {
                return this.f2496k;
            }
            this.f2496k = d12;
            return d12;
        }
        long j10 = this.f2486a;
        if (j10 == 0) {
            this.f2494i = d12;
            this.f2493h = d12;
            this.f2489d = d12 * 0.1d;
            this.f2488c = 0.02d * d12;
            this.f2490e = 0.1d * d12 * d12;
        } else if (j10 == 1) {
            this.f2495j = d12;
            this.f2493h = d12;
        } else {
            double d13 = this.f2495j;
            double d14 = d12 - d13;
            this.f2494i = d13;
            this.f2495j = d12;
            double d15 = d12 / 0.95d;
            this.f2487b = d15;
            this.f2492g = d15 - (this.f2493h * 0.95d);
            double dSqrt = Math.sqrt(this.f2489d);
            double d16 = this.f2492g;
            if (d16 >= 4.0d * dSqrt) {
                this.f2492g = (d16 * 0.75d) + (dSqrt * 2.0d);
                c10 = 1;
            } else if (d16 <= (-4.0d) * dSqrt) {
                this.f2492g = (dSqrt * (-1.0d)) + (d16 * 0.75d);
                c10 = 2;
            } else {
                c10 = 0;
            }
            double d17 = this.f2489d * 1.05d;
            double d18 = this.f2492g;
            double dMin = Math.min(Math.max(Math.abs(d17 - ((0.0025d * d18) * d18)), this.f2489d * 0.8d), this.f2489d * 1.25d);
            this.f2489d = dMin;
            double d19 = this.f2490e;
            double d20 = d19 / ((0.9025d * d19) + dMin);
            this.f2491f = d20;
            double d21 = this.f2493h + (1.0526315789473684d * d14) + (d20 * this.f2492g);
            this.f2493h = d21;
            if (c10 == 1) {
                this.f2493h = Math.min(d21, this.f2487b);
            } else if (c10 == 2) {
                this.f2493h = Math.max(d21, this.f2487b);
            }
            this.f2490e = (1.0d - (0.95d * this.f2491f)) * (this.f2490e + this.f2488c);
        }
        double d22 = this.f2493h;
        if (d22 < AudioStats.AUDIO_AMPLITUDE_NONE) {
            double d23 = this.f2495j * 0.7d;
            this.f2496k = d23;
            this.f2493h = d23;
        } else {
            this.f2496k = d22;
        }
        return this.f2496k;
    }

    /* renamed from: a */
    public void m2366a() {
        this.f2486a = 0L;
        this.f2496k = AudioStats.AUDIO_AMPLITUDE_NONE;
    }
}
