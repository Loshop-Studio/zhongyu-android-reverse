package anet.channel.monitor;

import anet.channel.util.ALog;
import com.zykj.download.OssUtils;

/* renamed from: anet.channel.monitor.d */
/* loaded from: classes.dex */
class RunnableC0906d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ long f5204a;

    /* renamed from: b */
    final /* synthetic */ long f5205b;

    /* renamed from: c */
    final /* synthetic */ long f5206c;

    /* renamed from: d */
    final /* synthetic */ C0904b f5207d;

    RunnableC0906d(C0904b c0904b, long j4, long j5, long j6) {
        this.f5207d = c0904b;
        this.f5204a = j4;
        this.f5205b = j5;
        this.f5206c = j6;
    }

    @Override // java.lang.Runnable
    public void run() {
        C0904b.f5188a++;
        C0904b.f5192e += this.f5204a;
        if (C0904b.f5188a == 1) {
            C0904b.f5191d = this.f5205b - this.f5206c;
        }
        int i4 = C0904b.f5188a;
        if (i4 >= 2 && i4 <= 3) {
            long j4 = this.f5206c;
            long j5 = C0904b.f5190c;
            if (j4 >= j5) {
                C0904b.f5191d += this.f5205b - j4;
            } else if (j4 < j5) {
                long j6 = this.f5205b;
                if (j6 >= j5) {
                    long j7 = C0904b.f5191d + (j6 - j4);
                    C0904b.f5191d = j7;
                    C0904b.f5191d = j7 - (C0904b.f5190c - j4);
                }
            }
        }
        C0904b.f5189b = this.f5206c;
        C0904b.f5190c = this.f5205b;
        if (C0904b.f5188a == 3) {
            C0904b.f5196i = (long) this.f5207d.f5201n.m4474a(C0904b.f5192e, C0904b.f5191d);
            C0904b.f5193f++;
            C0904b.m4466b(this.f5207d);
            if (C0904b.f5193f > 30) {
                this.f5207d.f5201n.m4475a();
                C0904b.f5193f = 3L;
            }
            double d4 = (C0904b.f5196i * 0.68d) + (C0904b.f5195h * 0.27d) + (C0904b.f5194g * 0.05d);
            C0904b.f5194g = C0904b.f5195h;
            C0904b.f5195h = C0904b.f5196i;
            if (C0904b.f5196i < C0904b.f5194g * 0.65d || C0904b.f5196i > C0904b.f5194g * 2.0d) {
                C0904b.f5196i = d4;
            }
            if (ALog.isPrintLog(1)) {
                ALog.m4636d("awcn.BandWidthSampler", "NetworkSpeed", null, "mKalmanDataSize", Long.valueOf(C0904b.f5192e), "mKalmanTimeUsed", Long.valueOf(C0904b.f5191d), OssUtils.SPEED, Double.valueOf(C0904b.f5196i), "mSpeedKalmanCount", Long.valueOf(C0904b.f5193f));
            }
            if (this.f5207d.f5200m > 5 || C0904b.f5193f == 2) {
                C0903a.m4459a().m4460a(C0904b.f5196i);
                this.f5207d.f5200m = 0;
                this.f5207d.f5199l = C0904b.f5196i < C0904b.f5197j ? 1 : 5;
                ALog.m4639i("awcn.BandWidthSampler", "NetworkSpeed notification!", null, "Send Network quality notification.");
            }
            C0904b.f5191d = 0L;
            C0904b.f5192e = 0L;
            C0904b.f5188a = 0;
        }
    }
}
