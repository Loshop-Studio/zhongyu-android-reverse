package p226r9;

import java.util.Objects;
import p011a9.AbstractC0063z;
import p011a9.C0062y;

/* renamed from: r9.c0 */
/* loaded from: classes5.dex */
public final class C9057c0<T> {

    /* renamed from: a */
    public final C0062y f15578a;

    /* renamed from: b */
    public final Object f15579b;

    /* renamed from: c */
    public final AbstractC0063z f15580c;

    public C9057c0(C0062y c0062y, Object obj, AbstractC0063z abstractC0063z) {
        this.f15578a = c0062y;
        this.f15579b = obj;
        this.f15580c = abstractC0063z;
    }

    /* renamed from: c */
    public static C9057c0 m15240c(AbstractC0063z abstractC0063z, C0062y c0062y) {
        Objects.requireNonNull(abstractC0063z, "body == null");
        Objects.requireNonNull(c0062y, "rawResponse == null");
        if (c0062y.m424p()) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new C9057c0(c0062y, null, abstractC0063z);
    }

    /* renamed from: f */
    public static C9057c0 m15241f(Object obj, C0062y c0062y) {
        Objects.requireNonNull(c0062y, "rawResponse == null");
        if (c0062y.m424p()) {
            return new C9057c0(c0062y, obj, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    /* renamed from: a */
    public Object m15242a() {
        return this.f15579b;
    }

    /* renamed from: b */
    public int m15243b() {
        return this.f15578a.m418i();
    }

    /* renamed from: d */
    public boolean m15244d() {
        return this.f15578a.m424p();
    }

    /* renamed from: e */
    public String m15245e() {
        return this.f15578a.m425q();
    }

    public String toString() {
        return this.f15578a.toString();
    }
}
