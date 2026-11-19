package com.efs.sdk.base.p039a.p044d.p045a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.efs.sdk.base.p039a.p042c.C5660c;
import com.efs.sdk.base.p039a.p044d.C5661a;
import com.efs.sdk.base.p039a.p050h.C5697d;
import com.efs.sdk.base.p039a.p050h.C5698e;
import com.efs.sdk.base.p039a.p050h.p051a.C5687d;

/* renamed from: com.efs.sdk.base.a.d.a.a */
/* loaded from: classes3.dex */
public final class RunnableC5662a extends BroadcastReceiver implements Runnable {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C5687d.m4146a(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5660c c5660c = C5660c.a.f4681a;
        String strM4185b = C5698e.m4185b(C5661a.m4097a().f4644c);
        C5697d.m4182a("efs.info.manager", "network change: ".concat(String.valueOf(strM4185b)), null);
        c5660c.f4679a.m4093a("net", strM4185b);
    }
}
