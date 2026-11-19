package coil3;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5830k;
import p169t6.AbstractC6600a;

/* renamed from: coil3.j */
/* loaded from: classes2.dex */
public final class C3304j {

    /* renamed from: b */
    public static final C3304j f1995b = new C3304j(AbstractC6600a.m6246x(new LinkedHashMap()));

    /* renamed from: a */
    public final Map f1996a;

    public C3304j(Map map) {
        this.f1996a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3304j) && AbstractC5830k.m5325b(this.f1996a, ((C3304j) obj).f1996a);
    }

    public final int hashCode() {
        return this.f1996a.hashCode();
    }

    public final String toString() {
        return "Extras(data=" + this.f1996a + ')';
    }
}
