package p259n5;

import android.os.SystemClock;
import com.huawei.hms.framework.common.Logger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: n5.d */
/* loaded from: classes5.dex */
public abstract class AbstractC10320d {

    /* renamed from: a */
    public static final Map f24596a = new ConcurrentHashMap(16);

    /* renamed from: n5.d$a */
    public static class a {

        /* renamed from: a */
        public final long f24597a;

        /* renamed from: b */
        public final long f24598b;

        public a(long j10, long j11) {
            this.f24597a = j10;
            this.f24598b = j11;
        }

        /* renamed from: a */
        public boolean m21532a() {
            return SystemClock.elapsedRealtime() - this.f24598b <= this.f24597a;
        }
    }

    /* renamed from: a */
    public static a m21530a(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("map size of get is before: ");
        Map map = f24596a;
        sb2.append(map.size());
        Logger.m8586v("RequestUtil", sb2.toString());
        a aVar = (a) map.get(str);
        Logger.m8586v("RequestUtil", "map size of get is after: " + map.size());
        return aVar;
    }

    /* renamed from: b */
    public static void m21531b(String str, a aVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("map size of put is before: ");
        Map map = f24596a;
        sb2.append(map.size());
        Logger.m8586v("RequestUtil", sb2.toString());
        map.put(str, aVar);
        Logger.m8586v("RequestUtil", "map size of put is after: " + map.size());
    }
}
