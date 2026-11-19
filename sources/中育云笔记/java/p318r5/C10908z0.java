package p318r5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: r5.z0 */
/* loaded from: classes5.dex */
public final class C10908z0 {

    /* renamed from: b */
    public static Map f26344b = new HashMap();

    /* renamed from: c */
    public static C10908z0 f26345c;

    /* renamed from: a */
    public C10895t f26346a = new C10895t();

    /* renamed from: e */
    public static C10908z0 m23741e() {
        if (f26345c == null) {
            m23742f();
        }
        return f26345c;
    }

    /* renamed from: f */
    public static synchronized void m23742f() {
        if (f26345c == null) {
            f26345c = new C10908z0();
        }
    }

    /* renamed from: a */
    public Set m23743a() {
        return f26344b.keySet();
    }

    /* renamed from: b */
    public C10869i0 m23744b(String str) {
        return (C10869i0) f26344b.get(str);
    }

    /* renamed from: c */
    public void m23745c(String str, C10869i0 c10869i0) {
        f26344b.put(str, c10869i0);
    }

    /* renamed from: d */
    public C10895t m23746d() {
        return this.f26346a;
    }
}
