package anet.channel.strategy;

import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkRequest;
import com.tendcloud.tenddata.C7863av;
import java.io.Serializable;

/* loaded from: classes3.dex */
class ConnHistoryItem implements Serializable {

    /* renamed from: a */
    byte f2618a = 0;

    /* renamed from: b */
    long f2619b = 0;

    /* renamed from: c */
    long f2620c = 0;

    /* renamed from: a */
    public void m2456a(boolean z10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - (z10 ? this.f2619b : this.f2620c) > WorkRequest.MIN_BACKOFF_MILLIS) {
            this.f2618a = (byte) ((this.f2618a << 1) | (!z10 ? 1 : 0));
            if (z10) {
                this.f2619b = jCurrentTimeMillis;
            } else {
                this.f2620c = jCurrentTimeMillis;
            }
        }
    }

    /* renamed from: b */
    public boolean m2457b() {
        return (this.f2618a & 1) == 1;
    }

    /* renamed from: c */
    public boolean m2458c() {
        return m2455a() >= 3 && System.currentTimeMillis() - this.f2620c <= PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
    }

    /* renamed from: d */
    public boolean m2459d() {
        long j10 = this.f2619b;
        long j11 = this.f2620c;
        if (j10 <= j11) {
            j10 = j11;
        }
        return j10 != 0 && System.currentTimeMillis() - j10 > 86400000;
    }

    /* renamed from: a */
    public int m2455a() {
        int i10 = 0;
        for (int i11 = this.f2618a & C7863av.f14384i; i11 > 0; i11 >>= 1) {
            i10 += i11 & 1;
        }
        return i10;
    }
}
