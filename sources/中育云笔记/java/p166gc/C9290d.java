package p166gc;

import java.util.Collections;
import java.util.Map;

/* renamed from: gc.d */
/* loaded from: classes6.dex */
public final class C9290d {

    /* renamed from: a */
    public final Map f21668a;

    public C9290d(int i10) {
        this.f21668a = AbstractC9287a.m18312b(i10);
    }

    /* renamed from: b */
    public static C9290d m18318b(int i10) {
        return new C9290d(i10);
    }

    /* renamed from: a */
    public Map m18319a() {
        return this.f21668a.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f21668a);
    }

    /* renamed from: c */
    public C9290d m18320c(Object obj, Object obj2) {
        this.f21668a.put(obj, obj2);
        return this;
    }
}
