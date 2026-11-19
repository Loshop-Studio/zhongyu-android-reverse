package com.blankj.utilcode.util;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.blankj.utilcode.util.b */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC3380b implements View.OnClickListener {

    /* renamed from: a */
    public final long f2120a;

    /* renamed from: b */
    public final /* synthetic */ View.OnClickListener f2121b;

    public ViewOnClickListenerC3380b(long j7, View.OnClickListener onClickListener) {
        this.f2121b = onClickListener;
        this.f2120a = j7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ConcurrentHashMap concurrentHashMap = AbstractC3384d.f2154a;
        String strValueOf = String.valueOf(view.hashCode());
        ConcurrentHashMap concurrentHashMap2 = AbstractC3384d.f2154a;
        if (TextUtils.isEmpty(strValueOf)) {
            throw new IllegalArgumentException("The key is null.");
        }
        long j7 = this.f2120a;
        if (j7 < 0) {
            throw new IllegalArgumentException("The duration is less than 0.");
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (concurrentHashMap2.size() >= 64) {
            Iterator it = concurrentHashMap2.entrySet().iterator();
            while (it.hasNext()) {
                if (jElapsedRealtime >= ((Long) ((Map.Entry) it.next()).getValue()).longValue()) {
                    it.remove();
                }
            }
        }
        Long l = (Long) concurrentHashMap2.get(strValueOf);
        if (l == null || jElapsedRealtime >= l.longValue()) {
            concurrentHashMap2.put(strValueOf, Long.valueOf(jElapsedRealtime + j7));
            this.f2121b.onClick(view);
        }
    }
}
