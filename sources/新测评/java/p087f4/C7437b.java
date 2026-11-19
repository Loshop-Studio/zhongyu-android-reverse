package p087f4;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: f4.b */
/* loaded from: classes4.dex */
public final class C7437b {

    /* renamed from: a */
    public final String f12150a;

    /* renamed from: b */
    public final int f12151b;

    public C7437b(String sourceFileName, int i10) {
        Intrinsics.checkNotNullParameter(sourceFileName, "sourceFileName");
        this.f12150a = sourceFileName;
        this.f12151b = i10;
    }

    /* renamed from: a */
    public final String m11991a() {
        return this.f12150a;
    }

    /* renamed from: b */
    public final int m11992b() {
        return this.f12151b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7437b)) {
            return false;
        }
        C7437b c7437b = (C7437b) obj;
        return Intrinsics.areEqual(this.f12150a, c7437b.f12150a) && this.f12151b == c7437b.f12151b;
    }

    public int hashCode() {
        return (this.f12150a.hashCode() * 31) + Integer.hashCode(this.f12151b);
    }

    public String toString() {
        return "CommonSourceResult(sourceFileName=" + this.f12150a + ", sourceId=" + this.f12151b + ')';
    }
}
