package p267v6;

import com.zykj.evaluation.p057ui.sheet.AbstractC6935c;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: v6.z */
/* loaded from: classes4.dex */
public final class C9709z {

    /* renamed from: a */
    public final int f17039a;

    /* renamed from: b */
    public final AbstractC6935c f17040b;

    public C9709z(int i10, AbstractC6935c state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f17039a = i10;
        this.f17040b = state;
    }

    /* renamed from: b */
    public static /* synthetic */ C9709z m16223b(C9709z c9709z, int i10, AbstractC6935c abstractC6935c, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = c9709z.f17039a;
        }
        if ((i11 & 2) != 0) {
            abstractC6935c = c9709z.f17040b;
        }
        return c9709z.m16224a(i10, abstractC6935c);
    }

    /* renamed from: a */
    public final C9709z m16224a(int i10, AbstractC6935c state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new C9709z(i10, state);
    }

    /* renamed from: c */
    public final int m16225c() {
        return this.f17039a;
    }

    /* renamed from: d */
    public final AbstractC6935c m16226d() {
        return this.f17040b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9709z)) {
            return false;
        }
        C9709z c9709z = (C9709z) obj;
        return this.f17039a == c9709z.f17039a && Intrinsics.areEqual(this.f17040b, c9709z.f17040b);
    }

    public int hashCode() {
        return (Integer.hashCode(this.f17039a) * 31) + this.f17040b.hashCode();
    }

    public String toString() {
        return "IndexData(index=" + this.f17039a + ", state=" + this.f17040b + ")";
    }
}
