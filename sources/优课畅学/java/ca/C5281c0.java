package ca;

import java.util.Objects;
import p136i9.AbstractC8905e0;
import p136i9.C8903d0;
import p136i9.C8924v;

/* renamed from: ca.c0 */
/* loaded from: classes5.dex */
public final class C5281c0<T> {

    /* renamed from: a */
    public final C8903d0 f2472a;

    /* renamed from: b */
    public final Object f2473b;

    /* renamed from: c */
    public final AbstractC8905e0 f2474c;

    public C5281c0(C8903d0 c8903d0, Object obj, AbstractC8905e0 abstractC8905e0) {
        this.f2472a = c8903d0;
        this.f2473b = obj;
        this.f2474c = abstractC8905e0;
    }

    /* renamed from: c */
    public static C5281c0 m2241c(AbstractC8905e0 abstractC8905e0, C8903d0 c8903d0) {
        Objects.requireNonNull(abstractC8905e0, "body == null");
        Objects.requireNonNull(c8903d0, "rawResponse == null");
        if (c8903d0.m15134m()) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new C5281c0(c8903d0, null, abstractC8905e0);
    }

    /* renamed from: g */
    public static C5281c0 m2242g(Object obj, C8903d0 c8903d0) {
        Objects.requireNonNull(c8903d0, "rawResponse == null");
        if (c8903d0.m15134m()) {
            return new C5281c0(c8903d0, obj, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    /* renamed from: a */
    public Object m2243a() {
        return this.f2473b;
    }

    /* renamed from: b */
    public int m2244b() {
        return this.f2472a.m15128f();
    }

    /* renamed from: d */
    public C8924v m2245d() {
        return this.f2472a.m15133l();
    }

    /* renamed from: e */
    public boolean m2246e() {
        return this.f2472a.m15134m();
    }

    /* renamed from: f */
    public String m2247f() {
        return this.f2472a.m15135n();
    }

    public String toString() {
        return this.f2472a.toString();
    }
}
