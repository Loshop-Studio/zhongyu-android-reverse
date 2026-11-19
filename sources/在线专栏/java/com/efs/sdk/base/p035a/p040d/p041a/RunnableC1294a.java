package com.efs.sdk.base.p035a.p040d.p041a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.efs.sdk.base.p035a.p038c.C1292c;
import com.efs.sdk.base.p035a.p040d.C1293a;
import com.efs.sdk.base.p035a.p046h.C1329d;
import com.efs.sdk.base.p035a.p046h.C1330e;
import com.efs.sdk.base.p035a.p046h.p047a.C1319d;

/* renamed from: com.efs.sdk.base.a.d.a.a */
/* loaded from: classes.dex */
public final class RunnableC1294a extends BroadcastReceiver implements Runnable {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C1319d.m5536a(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1292c c1292c = C1292c.a.f7047a;
        String strM5575b = C1330e.m5575b(C1293a.m5487a().f7010c);
        C1329d.m5572a("efs.info.manager", "network change: ".concat(String.valueOf(strM5575b)), null);
        c1292c.f7045a.m5483a("net", strM5575b);
    }
}
