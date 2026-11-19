package anet.channel.p024e;

import android.content.SharedPreferences;
import anet.channel.entity.ConnType;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.C5070l;
import anet.channel.strategy.IStrategyListener;

/* renamed from: anet.channel.e.c */
/* loaded from: classes3.dex */
final class C5007c implements IStrategyListener {
    @Override // anet.channel.strategy.IStrategyListener
    public void onStrategyUpdated(C5070l.d dVar) {
        String str;
        if (dVar == null || dVar.f2711b == null) {
            return;
        }
        int i10 = 0;
        loop0: while (true) {
            C5070l.b[] bVarArr = dVar.f2711b;
            if (i10 >= bVarArr.length) {
                return;
            }
            C5070l.b bVar = bVarArr[i10];
            str = bVar.f2696a;
            C5070l.a[] aVarArr = bVar.f2703h;
            if (aVarArr != null && aVarArr.length > 0) {
                for (C5070l.a aVar : aVarArr) {
                    String str2 = aVar.f2689b;
                    if (ConnType.HTTP3.equals(str2) || ConnType.HTTP3_PLAIN.equals(str2)) {
                        break loop0;
                    }
                }
            }
            i10++;
        }
        if (!str.equals(C5005a.f2403b)) {
            String unused = C5005a.f2403b = str;
            SharedPreferences.Editor editorEdit = C5005a.f2407f.edit();
            editorEdit.putString("http3_detector_host", C5005a.f2403b);
            editorEdit.apply();
        }
        C5005a.m2323a(NetworkStatusHelper.getStatus());
    }
}
