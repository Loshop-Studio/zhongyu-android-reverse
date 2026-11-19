package anet.channel.strategy;

import java.io.Serializable;

/* loaded from: classes.dex */
class ConnHistoryItem implements Serializable {

    /* renamed from: a */
    byte f5340a = 0;

    /* renamed from: b */
    long f5341b = 0;

    /* renamed from: c */
    long f5342c = 0;

    ConnHistoryItem() {
    }

    /* renamed from: a */
    void m4565a(boolean z3) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - (z3 ? this.f5341b : this.f5342c) > 10000) {
            this.f5340a = (byte) ((this.f5340a << 1) | (!z3 ? 1 : 0));
            if (z3) {
                this.f5341b = jCurrentTimeMillis;
            } else {
                this.f5342c = jCurrentTimeMillis;
            }
        }
    }

    /* renamed from: b */
    boolean m4566b() {
        return (this.f5340a & 1) == 1;
    }

    /* renamed from: c */
    boolean m4567c() {
        return m4564a() >= 3 && System.currentTimeMillis() - this.f5342c <= 300000;
    }

    /* renamed from: d */
    boolean m4568d() {
        long j4 = this.f5341b;
        long j5 = this.f5342c;
        if (j4 <= j5) {
            j4 = j5;
        }
        return j4 != 0 && System.currentTimeMillis() - j4 > 86400000;
    }

    /* renamed from: a */
    int m4564a() {
        int i4 = 0;
        for (int i5 = this.f5340a & 255; i5 > 0; i5 >>= 1) {
            i4 += i5 & 1;
        }
        return i4;
    }
}
