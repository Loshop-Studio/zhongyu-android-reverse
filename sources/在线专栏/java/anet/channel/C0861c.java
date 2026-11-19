package anet.channel;

import android.text.TextUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: anet.channel.c */
/* loaded from: classes.dex */
class C0861c {

    /* renamed from: a */
    Map<String, Integer> f5073a = new HashMap();

    /* renamed from: b */
    Map<String, SessionInfo> f5074b = new ConcurrentHashMap();

    C0861c() {
    }

    /* renamed from: a */
    void m4389a(SessionInfo sessionInfo) {
        Objects.requireNonNull(sessionInfo, "info is null");
        if (TextUtils.isEmpty(sessionInfo.host)) {
            throw new IllegalArgumentException("host cannot be null or empty");
        }
        this.f5074b.put(sessionInfo.host, sessionInfo);
    }

    /* renamed from: b */
    SessionInfo m4391b(String str) {
        return this.f5074b.get(str);
    }

    /* renamed from: c */
    public int m4392c(String str) {
        Integer num;
        synchronized (this.f5073a) {
            num = this.f5073a.get(str);
        }
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    /* renamed from: a */
    SessionInfo m4387a(String str) {
        return this.f5074b.remove(str);
    }

    /* renamed from: a */
    Collection<SessionInfo> m4388a() {
        return this.f5074b.values();
    }

    /* renamed from: a */
    void m4390a(String str, int i4) {
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f5073a) {
                this.f5073a.put(str, Integer.valueOf(i4));
            }
            return;
        }
        throw new IllegalArgumentException("host cannot be null or empty");
    }
}
