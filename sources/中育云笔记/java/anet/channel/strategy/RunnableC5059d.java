package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.util.ALog;
import java.io.File;

/* renamed from: anet.channel.strategy.d */
/* loaded from: classes3.dex */
class RunnableC5059d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f2662a;

    /* renamed from: b */
    final /* synthetic */ StrategyInfoHolder f2663b;

    public RunnableC5059d(StrategyInfoHolder strategyInfoHolder, String str) {
        this.f2663b = strategyInfoHolder;
        this.f2662a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            ALog.m2530i("awcn.StrategyInfoHolder", "start loading strategy files", null, new Object[0]);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (AwcnConfig.isAsyncLoadStrategyEnable()) {
                ALog.m2530i("awcn.StrategyInfoHolder", "load strategy async", null, new Object[0]);
                if (!TextUtils.isEmpty(this.f2662a)) {
                    this.f2663b.m2474a(this.f2662a, true);
                }
                StrategyConfig strategyConfig = (StrategyConfig) C5071m.m2506a("StrategyConfig", null);
                if (strategyConfig != null) {
                    strategyConfig.m2467b();
                    strategyConfig.m2464a(this.f2663b);
                    synchronized (this.f2663b) {
                        this.f2663b.f2637b = strategyConfig;
                    }
                }
            }
            File[] fileArrM2511b = C5071m.m2511b();
            if (fileArrM2511b == null) {
                return;
            }
            int i10 = 0;
            for (int i11 = 0; i11 < fileArrM2511b.length && i10 < 2; i11++) {
                File file = fileArrM2511b[i11];
                if (!file.isDirectory()) {
                    String name = file.getName();
                    if (!name.equals(this.f2662a) && !name.startsWith("StrategyConfig")) {
                        this.f2663b.m2474a(name, false);
                        i10++;
                    }
                }
            }
            ALog.m2530i("awcn.StrategyInfoHolder", "end loading strategy files", null, "total cost", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        } catch (Exception unused) {
        }
    }
}
