package anet.channel.monitor;

/* renamed from: anet.channel.monitor.e */
/* loaded from: classes.dex */
class C0907e {

    /* renamed from: b */
    private double f5209b;

    /* renamed from: c */
    private double f5210c;

    /* renamed from: d */
    private double f5211d;

    /* renamed from: e */
    private double f5212e;

    /* renamed from: f */
    private double f5213f;

    /* renamed from: g */
    private double f5214g;

    /* renamed from: h */
    private double f5215h;

    /* renamed from: a */
    private long f5208a = 0;

    /* renamed from: i */
    private double f5216i = 0.0d;

    /* renamed from: j */
    private double f5217j = 0.0d;

    /* renamed from: k */
    private double f5218k = 0.0d;

    C0907e() {
    }

    /* renamed from: a */
    public double m4474a(double d4, double d5) {
        double d6 = d4 / d5;
        if (d6 < 8.0d) {
            if (this.f5208a != 0) {
                return this.f5218k;
            }
            this.f5218k = d6;
            return d6;
        }
        long j4 = this.f5208a;
        if (j4 == 0) {
            this.f5216i = d6;
            this.f5215h = d6;
            this.f5211d = d6 * 0.1d;
            this.f5210c = 0.02d * d6;
            this.f5212e = 0.1d * d6 * d6;
        } else if (j4 == 1) {
            this.f5217j = d6;
            this.f5215h = d6;
        } else {
            double d7 = this.f5217j;
            double d8 = d6 - d7;
            this.f5216i = d7;
            this.f5217j = d6;
            double d9 = d6 / 0.95d;
            this.f5209b = d9;
            this.f5214g = d9 - (this.f5215h * 0.95d);
            char c4 = 0;
            double dSqrt = Math.sqrt(this.f5211d);
            double d10 = this.f5214g;
            if (d10 >= 4.0d * dSqrt) {
                this.f5214g = (d10 * 0.75d) + (dSqrt * 2.0d);
                c4 = 1;
            } else if (d10 <= (-4.0d) * dSqrt) {
                this.f5214g = (dSqrt * (-1.0d)) + (d10 * 0.75d);
                c4 = 2;
            }
            double d11 = this.f5211d * 1.05d;
            double d12 = this.f5214g;
            double dMin = Math.min(Math.max(Math.abs(d11 - ((0.0025d * d12) * d12)), this.f5211d * 0.8d), this.f5211d * 1.25d);
            this.f5211d = dMin;
            double d13 = this.f5212e;
            double d14 = d13 / ((0.9025d * d13) + dMin);
            this.f5213f = d14;
            double d15 = this.f5215h + (1.0526315789473684d * d8) + (d14 * this.f5214g);
            this.f5215h = d15;
            if (c4 == 1) {
                this.f5215h = Math.min(d15, this.f5209b);
            } else if (c4 == 2) {
                this.f5215h = Math.max(d15, this.f5209b);
            }
            this.f5212e = (1.0d - (0.95d * this.f5213f)) * (this.f5212e + this.f5210c);
        }
        double d16 = this.f5215h;
        if (d16 < 0.0d) {
            double d17 = this.f5217j * 0.7d;
            this.f5218k = d17;
            this.f5215h = d17;
        } else {
            this.f5218k = d16;
        }
        return this.f5218k;
    }

    /* renamed from: a */
    public void m4475a() {
        this.f5208a = 0L;
        this.f5218k = 0.0d;
    }
}
