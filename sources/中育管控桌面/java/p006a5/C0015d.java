package p006a5;

import java.util.Collections;
import java.util.Map;

/* renamed from: a5.d */
/* loaded from: classes4.dex */
public final class C0015d {

    /* renamed from: a */
    public final Map f13a;

    public C0015d(int i6) {
        this.f13a = AbstractC0012a.m15b(i6);
    }

    /* renamed from: b */
    public static C0015d m21b(int i6) {
        return new C0015d(i6);
    }

    /* renamed from: a */
    public Map m22a() {
        return this.f13a.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f13a);
    }

    /* renamed from: c */
    public C0015d m23c(Object obj, Object obj2) {
        this.f13a.put(obj, obj2);
        return this;
    }
}
