package p318r5;

import java.util.HashMap;
import java.util.Map;

/* renamed from: r5.k1 */
/* loaded from: classes5.dex */
public final class C10876k1 {

    /* renamed from: b */
    public static C10876k1 f26251b;

    /* renamed from: a */
    public volatile Map f26252a = new HashMap();

    /* renamed from: c */
    public static C10876k1 m23513c() {
        if (f26251b == null) {
            m23514d();
        }
        return f26251b;
    }

    /* renamed from: d */
    public static synchronized void m23514d() {
        if (f26251b == null) {
            f26251b = new C10876k1();
        }
    }

    /* renamed from: a */
    public final C10894s0 m23515a(String str) {
        if (!this.f26252a.containsKey(str)) {
            this.f26252a.put(str, new C10894s0());
        }
        return (C10894s0) this.f26252a.get(str);
    }

    /* renamed from: b */
    public C10894s0 m23516b(String str, long j10) {
        C10894s0 c10894s0M23515a = m23515a(str);
        c10894s0M23515a.m23616b(j10);
        return c10894s0M23515a;
    }
}
