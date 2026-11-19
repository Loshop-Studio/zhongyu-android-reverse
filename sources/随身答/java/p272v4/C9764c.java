package p272v4;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: v4.c */
/* loaded from: classes4.dex */
public final class C9764c {

    /* renamed from: a */
    public final String f17348a;

    /* renamed from: b */
    public final int f17349b;

    public C9764c(String sourceFileName, int i9) {
        Intrinsics.checkNotNullParameter(sourceFileName, "sourceFileName");
        this.f17348a = sourceFileName;
        this.f17349b = i9;
    }

    /* renamed from: a */
    public final String m16520a() {
        return this.f17348a;
    }

    /* renamed from: b */
    public final int m16521b() {
        return this.f17349b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9764c)) {
            return false;
        }
        C9764c c9764c = (C9764c) obj;
        return Intrinsics.areEqual(this.f17348a, c9764c.f17348a) && this.f17349b == c9764c.f17349b;
    }

    public int hashCode() {
        return (this.f17348a.hashCode() * 31) + Integer.hashCode(this.f17349b);
    }

    public String toString() {
        return "CommonSourceResult(sourceFileName=" + this.f17348a + ", sourceId=" + this.f17349b + ')';
    }
}
