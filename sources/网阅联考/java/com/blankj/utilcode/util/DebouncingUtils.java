package com.blankj.utilcode.util;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class DebouncingUtils {
    private static final int CACHE_SIZE = 64;
    private static final long DEBOUNCING_DEFAULT_VALUE = 1000;
    private static final Map<String, Long> KEY_MILLIS_MAP = new ConcurrentHashMap(64);

    private DebouncingUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    private static void clearIfNecessary(long j4) {
        Map<String, Long> map = KEY_MILLIS_MAP;
        if (map.size() < 64) {
            return;
        }
        Iterator<Map.Entry<String, Long>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (j4 >= it.next().getValue().longValue()) {
                it.remove();
            }
        }
    }

    public static boolean isValid(@NonNull View view) {
        return isValid(view, 1000L);
    }

    public static boolean isValid(@NonNull View view, long j4) {
        return isValid(String.valueOf(view.hashCode()), j4);
    }

    public static boolean isValid(@NonNull String str, long j4) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("The key is null.");
        }
        if (j4 >= 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            clearIfNecessary(jElapsedRealtime);
            Map<String, Long> map = KEY_MILLIS_MAP;
            Long l4 = map.get(str);
            if (l4 != null && jElapsedRealtime < l4.longValue()) {
                return false;
            }
            map.put(str, Long.valueOf(jElapsedRealtime + j4));
            return true;
        }
        throw new IllegalArgumentException("The duration is less than 0.");
    }
}
