package p192o8;

import java.util.Collections;
import java.util.Map;

/* renamed from: o8.d */
/* loaded from: classes5.dex */
public final class C8725d {

    /* renamed from: a */
    public final Map f14506a;

    public C8725d(int i10) {
        this.f14506a = AbstractC8722a.m14355b(i10);
    }

    /* renamed from: b */
    public static C8725d m14361b(int i10) {
        return new C8725d(i10);
    }

    /* renamed from: a */
    public Map m14362a() {
        return this.f14506a.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f14506a);
    }

    /* renamed from: c */
    public C8725d m14363c(Object obj, Object obj2) {
        this.f14506a.put(obj, obj2);
        return this;
    }
}
