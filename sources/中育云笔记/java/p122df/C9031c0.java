package p122df;

import java.util.Objects;
import je.AbstractC9746z;
import je.C9737q;
import je.C9745y;

/* renamed from: df.c0 */
/* loaded from: classes6.dex */
public final class C9031c0<T> {

    /* renamed from: a */
    public final C9745y f21081a;

    /* renamed from: b */
    public final Object f21082b;

    /* renamed from: c */
    public final AbstractC9746z f21083c;

    public C9031c0(C9745y c9745y, Object obj, AbstractC9746z abstractC9746z) {
        this.f21081a = c9745y;
        this.f21082b = obj;
        this.f21083c = abstractC9746z;
    }

    /* renamed from: c */
    public static C9031c0 m17702c(AbstractC9746z abstractC9746z, C9745y c9745y) {
        Objects.requireNonNull(abstractC9746z, "body == null");
        Objects.requireNonNull(c9745y, "rawResponse == null");
        if (c9745y.m19638s()) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new C9031c0(c9745y, null, abstractC9746z);
    }

    /* renamed from: h */
    public static C9031c0 m17703h(Object obj, C9745y c9745y) {
        Objects.requireNonNull(c9745y, "rawResponse == null");
        if (c9745y.m19638s()) {
            return new C9031c0(c9745y, obj, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    /* renamed from: a */
    public Object m17704a() {
        return this.f21082b;
    }

    /* renamed from: b */
    public int m17705b() {
        return this.f21081a.m19632j();
    }

    /* renamed from: d */
    public C9737q m17706d() {
        return this.f21081a.m19637r();
    }

    /* renamed from: e */
    public boolean m17707e() {
        return this.f21081a.m19638s();
    }

    /* renamed from: f */
    public String m17708f() {
        return this.f21081a.m19639t();
    }

    /* renamed from: g */
    public C9745y m17709g() {
        return this.f21081a;
    }

    public String toString() {
        return this.f21081a.toString();
    }
}
