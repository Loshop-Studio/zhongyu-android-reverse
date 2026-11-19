package p140q;

import java.util.Map;
import kotlin.jvm.internal.AbstractC5830k;
import p169t6.AbstractC6600a;

/* renamed from: q.a */
/* loaded from: classes2.dex */
public final class C6397a {

    /* renamed from: a */
    public final String f10494a;

    /* renamed from: b */
    public final Map f10495b;

    public C6397a(String str, Map map) {
        this.f10494a = str;
        this.f10495b = AbstractC6600a.m6246x(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6397a)) {
            return false;
        }
        C6397a c6397a = (C6397a) obj;
        return AbstractC5830k.m5325b(this.f10494a, c6397a.f10494a) && AbstractC5830k.m5325b(this.f10495b, c6397a.f10495b);
    }

    public final int hashCode() {
        return this.f10495b.hashCode() + (this.f10494a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.f10494a + ", extras=" + this.f10495b + ')';
    }
}
