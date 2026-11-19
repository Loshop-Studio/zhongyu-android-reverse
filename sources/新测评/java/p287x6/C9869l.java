package p287x6;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: x6.l */
/* loaded from: classes4.dex */
public final class C9869l {

    /* renamed from: a */
    public String f17454a;

    /* renamed from: b */
    public final int f17455b;

    /* renamed from: c */
    public final int f17456c;

    public C9869l(String localAnswer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(localAnswer, "localAnswer");
        this.f17454a = localAnswer;
        this.f17455b = i10;
        this.f17456c = i11;
    }

    /* renamed from: a */
    public final int m16550a() {
        return this.f17456c;
    }

    /* renamed from: b */
    public final String m16551b() {
        return this.f17454a;
    }

    /* renamed from: c */
    public final int m16552c() {
        return this.f17455b;
    }

    /* renamed from: d */
    public final void m16553d(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f17454a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9869l)) {
            return false;
        }
        C9869l c9869l = (C9869l) obj;
        return Intrinsics.areEqual(this.f17454a, c9869l.f17454a) && this.f17455b == c9869l.f17455b && this.f17456c == c9869l.f17456c;
    }

    public int hashCode() {
        return (((this.f17454a.hashCode() * 31) + Integer.hashCode(this.f17455b)) * 31) + Integer.hashCode(this.f17456c);
    }

    public String toString() {
        return "UploadAnswer(localAnswer=" + this.f17454a + ", pageIndex=" + this.f17455b + ", index=" + this.f17456c + ")";
    }
}
