package com.efs.sdk.base.p020a.p025d.p026a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.efs.sdk.base.p020a.p023c.C2920c;
import com.efs.sdk.base.p020a.p025d.C2921a;
import com.efs.sdk.base.p020a.p031h.C2957d;
import com.efs.sdk.base.p020a.p031h.C2958e;
import com.efs.sdk.base.p020a.p031h.p032a.C2947d;

/* renamed from: com.efs.sdk.base.a.d.a.a */
/* loaded from: classes2.dex */
public final class RunnableC2922a extends BroadcastReceiver implements Runnable {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C2947d.m2177a(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2920c c2920c = C2920c.a.f1077a;
        String strM2216b = C2958e.m2216b(C2921a.m2128a().f1040c);
        C2957d.m2213a("efs.info.manager", "network change: ".concat(String.valueOf(strM2216b)), null);
        c2920c.f1075a.m2124a("net", strM2216b);
    }
}
