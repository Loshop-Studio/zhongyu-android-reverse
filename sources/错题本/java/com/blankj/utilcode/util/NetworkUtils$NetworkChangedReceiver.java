package com.blankj.utilcode.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.HashSet;
import p016b0.RunnableC3059a;

/* loaded from: classes2.dex */
public final class NetworkUtils$NetworkChangedReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public NetworkUtils$NetworkType f2110a;

    /* renamed from: b */
    public final HashSet f2111b = new HashSet();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            AbstractC3396p.f2173a.postDelayed(new RunnableC3059a(this, 3), 1000L);
        }
    }
}
