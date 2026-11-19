package anet.channel.p009e;

import android.content.SharedPreferences;
import anet.channel.entity.ConnType;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.C0947l;
import anet.channel.strategy.IStrategyListener;

/* renamed from: anet.channel.e.c */
/* loaded from: classes.dex */
final class C0884c implements IStrategyListener {
    C0884c() {
    }

    @Override // anet.channel.strategy.IStrategyListener
    public void onStrategyUpdated(C0947l.d dVar) {
        String str;
        if (dVar == null || dVar.f5433b == null) {
            return;
        }
        int i4 = 0;
        loop0: while (true) {
            C0947l.b[] bVarArr = dVar.f5433b;
            if (i4 >= bVarArr.length) {
                return;
            }
            str = bVarArr[i4].f5418a;
            C0947l.a[] aVarArr = bVarArr[i4].f5425h;
            if (aVarArr != null && aVarArr.length > 0) {
                for (C0947l.a aVar : aVarArr) {
                    String str2 = aVar.f5411b;
                    if (ConnType.HTTP3.equals(str2) || ConnType.HTTP3_PLAIN.equals(str2)) {
                        break loop0;
                    }
                }
            }
            i4++;
        }
        if (!str.equals(C0882a.f5125b)) {
            String unused = C0882a.f5125b = str;
            SharedPreferences.Editor editorEdit = C0882a.f5129f.edit();
            editorEdit.putString("http3_detector_host", C0882a.f5125b);
            editorEdit.apply();
        }
        C0882a.m4432a(NetworkStatusHelper.getStatus());
    }
}
