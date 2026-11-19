package p315z7;

import java.util.Collections;
import java.util.Map;

/* renamed from: z7.d */
/* loaded from: classes5.dex */
public final class C10010d {

    /* renamed from: a */
    public final Map f18032a;

    public C10010d(int i9) {
        this.f18032a = AbstractC10007a.m17372b(i9);
    }

    /* renamed from: b */
    public static C10010d m17378b(int i9) {
        return new C10010d(i9);
    }

    /* renamed from: a */
    public Map m17379a() {
        return this.f18032a.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f18032a);
    }

    /* renamed from: c */
    public C10010d m17380c(Object obj, Object obj2) {
        this.f18032a.put(obj, obj2);
        return this;
    }
}
