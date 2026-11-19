package p167l6;

import java.util.Collections;
import java.util.Map;

/* renamed from: l6.d */
/* loaded from: classes5.dex */
public final class C9256d {

    /* renamed from: a */
    public final Map f18260a;

    public C9256d(int i10) {
        this.f18260a = AbstractC9253a.m16962b(i10);
    }

    /* renamed from: b */
    public static C9256d m16968b(int i10) {
        return new C9256d(i10);
    }

    /* renamed from: a */
    public Map m16969a() {
        return this.f18260a.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f18260a);
    }

    /* renamed from: c */
    public C9256d m16970c(Object obj, Object obj2) {
        this.f18260a.put(obj, obj2);
        return this;
    }
}
