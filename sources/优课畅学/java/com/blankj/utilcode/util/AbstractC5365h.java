package com.blankj.utilcode.util;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.blankj.utilcode.util.h */
/* loaded from: classes3.dex */
public abstract class AbstractC5365h {

    /* renamed from: a */
    public static final Map f2706a = new ConcurrentHashMap(64);

    /* renamed from: a */
    public static void m2475a(long j10) {
        Map map = f2706a;
        if (map.size() < 64) {
            return;
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (j10 >= ((Long) ((Map.Entry) it.next()).getValue()).longValue()) {
                it.remove();
            }
        }
    }

    /* renamed from: b */
    public static boolean m2476b(View view, long j10) {
        return m2477c(String.valueOf(view.hashCode()), j10);
    }

    /* renamed from: c */
    public static boolean m2477c(String str, long j10) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("The key is null.");
        }
        if (j10 < 0) {
            throw new IllegalArgumentException("The duration is less than 0.");
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        m2475a(jElapsedRealtime);
        Map map = f2706a;
        Long l10 = (Long) map.get(str);
        if (l10 != null && jElapsedRealtime < l10.longValue()) {
            return false;
        }
        map.put(str, Long.valueOf(jElapsedRealtime + j10));
        return true;
    }
}
