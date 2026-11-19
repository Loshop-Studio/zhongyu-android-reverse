package p038c9;

import java.util.Objects;
import okhttp3.Protocol;
import p172l8.AbstractC8927z;
import p172l8.C8918q;
import p172l8.C8924w;
import p172l8.C8926y;

/* renamed from: c9.x */
/* loaded from: classes5.dex */
public final class C5298x {

    /* renamed from: a */
    public final C8926y f2680a;

    /* renamed from: b */
    public final Object f2681b;

    /* renamed from: c */
    public final AbstractC8927z f2682c;

    public C5298x(C8926y c8926y, Object obj, AbstractC8927z abstractC8927z) {
        this.f2680a = c8926y;
        this.f2681b = obj;
        this.f2682c = abstractC8927z;
    }

    /* renamed from: c */
    public static C5298x m2517c(AbstractC8927z abstractC8927z, C8926y c8926y) {
        Objects.requireNonNull(abstractC8927z, "body == null");
        Objects.requireNonNull(c8926y, "rawResponse == null");
        if (c8926y.m14180p()) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new C5298x(c8926y, null, abstractC8927z);
    }

    /* renamed from: h */
    public static C5298x m2518h(Object obj) {
        return m2519i(obj, new C8926y.a().m14195g(200).m14201m("OK").m14204p(Protocol.HTTP_1_1).m14206r(new C8924w.a().m14151n("http://localhost/").m14140b()).m14191c());
    }

    /* renamed from: i */
    public static C5298x m2519i(Object obj, C8926y c8926y) {
        Objects.requireNonNull(c8926y, "rawResponse == null");
        if (c8926y.m14180p()) {
            return new C5298x(c8926y, obj, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    /* renamed from: a */
    public Object m2520a() {
        return this.f2681b;
    }

    /* renamed from: b */
    public int m2521b() {
        return this.f2680a.m14174i();
    }

    /* renamed from: d */
    public AbstractC8927z m2522d() {
        return this.f2682c;
    }

    /* renamed from: e */
    public C8918q m2523e() {
        return this.f2680a.m14179o();
    }

    /* renamed from: f */
    public boolean m2524f() {
        return this.f2680a.m14180p();
    }

    /* renamed from: g */
    public String m2525g() {
        return this.f2680a.m14181q();
    }

    public String toString() {
        return this.f2680a.toString();
    }
}
