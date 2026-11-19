package p234s6;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* renamed from: s6.c1 */
/* loaded from: classes4.dex */
public final class C9269c1 {

    /* renamed from: a */
    public final int f16014a;

    /* renamed from: b */
    public final String f16015b;

    /* renamed from: c */
    public final Flow f16016c;

    public C9269c1(int i10, String title, Flow dataFlow) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(dataFlow, "dataFlow");
        this.f16014a = i10;
        this.f16015b = title;
        this.f16016c = dataFlow;
    }

    /* renamed from: b */
    public static /* synthetic */ C9269c1 m15529b(C9269c1 c9269c1, int i10, String str, Flow flow, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = c9269c1.f16014a;
        }
        if ((i11 & 2) != 0) {
            str = c9269c1.f16015b;
        }
        if ((i11 & 4) != 0) {
            flow = c9269c1.f16016c;
        }
        return c9269c1.m15530a(i10, str, flow);
    }

    /* renamed from: a */
    public final C9269c1 m15530a(int i10, String title, Flow dataFlow) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(dataFlow, "dataFlow");
        return new C9269c1(i10, title, dataFlow);
    }

    /* renamed from: c */
    public final Flow m15531c() {
        return this.f16016c;
    }

    /* renamed from: d */
    public final int m15532d() {
        return this.f16014a;
    }

    /* renamed from: e */
    public final String m15533e() {
        return this.f16015b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9269c1)) {
            return false;
        }
        C9269c1 c9269c1 = (C9269c1) obj;
        return this.f16014a == c9269c1.f16014a && Intrinsics.areEqual(this.f16015b, c9269c1.f16015b) && Intrinsics.areEqual(this.f16016c, c9269c1.f16016c);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f16014a) * 31) + this.f16015b.hashCode()) * 31) + this.f16016c.hashCode();
    }

    public String toString() {
        return "PageTitleInfo(messageCount=" + this.f16014a + ", title=" + this.f16015b + ", dataFlow=" + this.f16016c + ")";
    }
}
