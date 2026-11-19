package p287x6;

import kotlin.jvm.internal.Intrinsics;
import p267v6.AbstractC9694l0;

/* renamed from: x6.c */
/* loaded from: classes4.dex */
public final class C9860c {

    /* renamed from: a */
    public final String f17430a;

    /* renamed from: b */
    public final AbstractC9694l0 f17431b;

    public C9860c(String name, AbstractC9694l0 state) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f17430a = name;
        this.f17431b = state;
    }

    /* renamed from: b */
    public static /* synthetic */ C9860c m16525b(C9860c c9860c, String str, AbstractC9694l0 abstractC9694l0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = c9860c.f17430a;
        }
        if ((i10 & 2) != 0) {
            abstractC9694l0 = c9860c.f17431b;
        }
        return c9860c.m16526a(str, abstractC9694l0);
    }

    /* renamed from: a */
    public final C9860c m16526a(String name, AbstractC9694l0 state) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(state, "state");
        return new C9860c(name, state);
    }

    /* renamed from: c */
    public final String m16527c() {
        return this.f17430a;
    }

    /* renamed from: d */
    public final AbstractC9694l0 m16528d() {
        return this.f17431b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9860c)) {
            return false;
        }
        C9860c c9860c = (C9860c) obj;
        return Intrinsics.areEqual(this.f17430a, c9860c.f17430a) && Intrinsics.areEqual(this.f17431b, c9860c.f17431b);
    }

    public int hashCode() {
        return (this.f17430a.hashCode() * 31) + this.f17431b.hashCode();
    }

    public String toString() {
        return "CorrectOption(name=" + this.f17430a + ", state=" + this.f17431b + ")";
    }
}
