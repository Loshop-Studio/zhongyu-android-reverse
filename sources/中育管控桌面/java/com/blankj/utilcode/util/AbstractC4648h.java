package com.blankj.utilcode.util;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.blankj.utilcode.util.h */
/* loaded from: classes3.dex */
public abstract class AbstractC4648h {

    /* renamed from: a */
    public static final Map f2081a = new ConcurrentHashMap(64);

    /* renamed from: a */
    public static void m2187a(long j6) {
        Map map = f2081a;
        if (map.size() < 64) {
            return;
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (j6 >= ((Long) ((Map.Entry) it.next()).getValue()).longValue()) {
                it.remove();
            }
        }
    }

    /* renamed from: b */
    public static boolean m2188b(View view, long j6) {
        return m2189c(String.valueOf(view.hashCode()), j6);
    }

    /* renamed from: c */
    public static boolean m2189c(String str, long j6) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("The key is null.");
        }
        if (j6 < 0) {
            throw new IllegalArgumentException("The duration is less than 0.");
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        m2187a(jElapsedRealtime);
        Map map = f2081a;
        Long l6 = (Long) map.get(str);
        if (l6 != null && jElapsedRealtime < l6.longValue()) {
            return false;
        }
        map.put(str, Long.valueOf(jElapsedRealtime + j6));
        return true;
    }
}
