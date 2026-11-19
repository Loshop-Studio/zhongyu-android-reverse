package anet.channel.detect;

import anet.channel.AwcnConfig;
import anet.channel.strategy.C5070l;
import anet.channel.strategy.IStrategyListener;
import anet.channel.util.ALog;

/* renamed from: anet.channel.detect.e */
/* loaded from: classes3.dex */
class C4994e implements IStrategyListener {

    /* renamed from: a */
    final /* synthetic */ C4993d f2378a;

    public C4994e(C4993d c4993d) {
        this.f2378a = c4993d;
    }

    @Override // anet.channel.strategy.IStrategyListener
    public void onStrategyUpdated(C5070l.d dVar) {
        C5070l.c[] cVarArr;
        int i10 = 0;
        ALog.m2530i("anet.HorseRaceDetector", "onStrategyUpdated", null, new Object[0]);
        if (!AwcnConfig.isHorseRaceEnable() || (cVarArr = dVar.f2712c) == null || cVarArr.length == 0) {
            return;
        }
        synchronized (this.f2378a.f2376a) {
            while (true) {
                try {
                    C5070l.c[] cVarArr2 = dVar.f2712c;
                    if (i10 < cVarArr2.length) {
                        C5070l.c cVar = cVarArr2[i10];
                        this.f2378a.f2376a.put(cVar.f2708a, cVar);
                        i10++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
