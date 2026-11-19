package anet.channel.detect;

import anet.channel.AwcnConfig;
import anet.channel.strategy.C0947l;
import anet.channel.strategy.IStrategyListener;
import anet.channel.util.ALog;

/* renamed from: anet.channel.detect.e */
/* loaded from: classes.dex */
class C0871e implements IStrategyListener {

    /* renamed from: a */
    final /* synthetic */ C0870d f5100a;

    C0871e(C0870d c0870d) {
        this.f5100a = c0870d;
    }

    @Override // anet.channel.strategy.IStrategyListener
    public void onStrategyUpdated(C0947l.d dVar) {
        C0947l.c[] cVarArr;
        int i4 = 0;
        ALog.m4639i("anet.HorseRaceDetector", "onStrategyUpdated", null, new Object[0]);
        if (!AwcnConfig.isHorseRaceEnable() || (cVarArr = dVar.f5434c) == null || cVarArr.length == 0) {
            return;
        }
        synchronized (this.f5100a.f5098a) {
            while (true) {
                C0947l.c[] cVarArr2 = dVar.f5434c;
                if (i4 < cVarArr2.length) {
                    C0947l.c cVar = cVarArr2[i4];
                    this.f5100a.f5098a.put(cVar.f5430a, cVar);
                    i4++;
                }
            }
        }
    }
}
