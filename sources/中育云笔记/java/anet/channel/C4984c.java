package anet.channel;

import android.text.TextUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: anet.channel.c */
/* loaded from: classes3.dex */
class C4984c {

    /* renamed from: a */
    Map<String, Integer> f2351a = new HashMap();

    /* renamed from: b */
    Map<String, SessionInfo> f2352b = new ConcurrentHashMap();

    /* renamed from: a */
    public void m2280a(SessionInfo sessionInfo) {
        if (sessionInfo == null) {
            throw new NullPointerException("info is null");
        }
        if (TextUtils.isEmpty(sessionInfo.host)) {
            throw new IllegalArgumentException("host cannot be null or empty");
        }
        this.f2352b.put(sessionInfo.host, sessionInfo);
    }

    /* renamed from: b */
    public SessionInfo m2282b(String str) {
        return this.f2352b.get(str);
    }

    /* renamed from: c */
    public int m2283c(String str) {
        Integer num;
        synchronized (this.f2351a) {
            num = this.f2351a.get(str);
        }
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* renamed from: a */
    public SessionInfo m2278a(String str) {
        return this.f2352b.remove(str);
    }

    /* renamed from: a */
    public Collection<SessionInfo> m2279a() {
        return this.f2352b.values();
    }

    /* renamed from: a */
    public void m2281a(String str, int i10) {
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f2351a) {
                this.f2351a.put(str, Integer.valueOf(i10));
            }
            return;
        }
        throw new IllegalArgumentException("host cannot be null or empty");
    }
}
