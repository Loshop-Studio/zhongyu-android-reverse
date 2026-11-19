package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.util.ALog;
import java.io.File;

/* renamed from: anet.channel.strategy.d */
/* loaded from: classes.dex */
class RunnableC0936d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f5384a;

    /* renamed from: b */
    final /* synthetic */ StrategyInfoHolder f5385b;

    RunnableC0936d(StrategyInfoHolder strategyInfoHolder, String str) {
        this.f5385b = strategyInfoHolder;
        this.f5384a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            ALog.m4639i("awcn.StrategyInfoHolder", "start loading strategy files", null, new Object[0]);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (AwcnConfig.isAsyncLoadStrategyEnable()) {
                ALog.m4639i("awcn.StrategyInfoHolder", "load strategy async", null, new Object[0]);
                if (!TextUtils.isEmpty(this.f5384a)) {
                    this.f5385b.m4583a(this.f5384a, true);
                }
                StrategyConfig strategyConfig = (StrategyConfig) C0948m.m4615a("StrategyConfig", null);
                if (strategyConfig != null) {
                    strategyConfig.m4576b();
                    strategyConfig.m4573a(this.f5385b);
                    synchronized (this.f5385b) {
                        this.f5385b.f5359b = strategyConfig;
                    }
                }
            }
            File[] fileArrM4620b = C0948m.m4620b();
            if (fileArrM4620b == null) {
                return;
            }
            int i4 = 0;
            for (int i5 = 0; i5 < fileArrM4620b.length && i4 < 2; i5++) {
                File file = fileArrM4620b[i5];
                if (!file.isDirectory()) {
                    String name = file.getName();
                    if (!name.equals(this.f5384a) && !name.startsWith("StrategyConfig")) {
                        this.f5385b.m4583a(name, false);
                        i4++;
                    }
                }
            }
            ALog.m4639i("awcn.StrategyInfoHolder", "end loading strategy files", null, "total cost", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        } catch (Exception unused) {
        }
    }
}
