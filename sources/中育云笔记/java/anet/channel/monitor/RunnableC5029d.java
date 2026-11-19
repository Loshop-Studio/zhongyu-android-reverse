package anet.channel.monitor;

import anet.channel.util.ALog;
import com.zykj.download.OssUtils;

/* renamed from: anet.channel.monitor.d */
/* loaded from: classes3.dex */
class RunnableC5029d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ long f2482a;

    /* renamed from: b */
    final /* synthetic */ long f2483b;

    /* renamed from: c */
    final /* synthetic */ long f2484c;

    /* renamed from: d */
    final /* synthetic */ C5027b f2485d;

    public RunnableC5029d(C5027b c5027b, long j10, long j11, long j12) {
        this.f2485d = c5027b;
        this.f2482a = j10;
        this.f2483b = j11;
        this.f2484c = j12;
    }

    @Override // java.lang.Runnable
    public void run() {
        C5027b.f2466a++;
        C5027b.f2470e += this.f2482a;
        if (C5027b.f2466a == 1) {
            C5027b.f2469d = this.f2483b - this.f2484c;
        }
        int i10 = C5027b.f2466a;
        if (i10 >= 2 && i10 <= 3) {
            long j10 = this.f2484c;
            long j11 = C5027b.f2468c;
            if (j10 >= j11) {
                C5027b.f2469d += this.f2483b - j10;
            } else if (j10 < j11) {
                long j12 = this.f2483b;
                if (j12 >= j11) {
                    long j13 = C5027b.f2469d + (j12 - j10);
                    C5027b.f2469d = j13;
                    C5027b.f2469d = j13 - (C5027b.f2468c - j10);
                }
            }
        }
        C5027b.f2467b = this.f2484c;
        C5027b.f2468c = this.f2483b;
        if (C5027b.f2466a == 3) {
            C5027b.f2474i = (long) this.f2485d.f2479n.m2365a(C5027b.f2470e, C5027b.f2469d);
            C5027b.f2471f++;
            C5027b.m2357b(this.f2485d);
            if (C5027b.f2471f > 30) {
                this.f2485d.f2479n.m2366a();
                C5027b.f2471f = 3L;
            }
            double d10 = (C5027b.f2474i * 0.68d) + (C5027b.f2473h * 0.27d) + (C5027b.f2472g * 0.05d);
            C5027b.f2472g = C5027b.f2473h;
            C5027b.f2473h = C5027b.f2474i;
            if (C5027b.f2474i < C5027b.f2472g * 0.65d || C5027b.f2474i > C5027b.f2472g * 2.0d) {
                C5027b.f2474i = d10;
            }
            if (ALog.isPrintLog(1)) {
                ALog.m2527d("awcn.BandWidthSampler", "NetworkSpeed", null, "mKalmanDataSize", Long.valueOf(C5027b.f2470e), "mKalmanTimeUsed", Long.valueOf(C5027b.f2469d), OssUtils.SPEED, Double.valueOf(C5027b.f2474i), "mSpeedKalmanCount", Long.valueOf(C5027b.f2471f));
            }
            if (this.f2485d.f2478m > 5 || C5027b.f2471f == 2) {
                C5026a.m2350a().m2351a(C5027b.f2474i);
                this.f2485d.f2478m = 0;
                this.f2485d.f2477l = C5027b.f2474i >= C5027b.f2475j ? 5 : 1;
                ALog.m2530i("awcn.BandWidthSampler", "NetworkSpeed notification!", null, "Send Network quality notification.");
            }
            C5027b.f2469d = 0L;
            C5027b.f2470e = 0L;
            C5027b.f2466a = 0;
        }
    }
}
