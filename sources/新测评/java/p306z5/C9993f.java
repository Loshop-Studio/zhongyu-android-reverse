package p306z5;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z5.f */
/* loaded from: classes4.dex */
public final class C9993f {

    /* renamed from: a */
    public final boolean f17904a;

    /* renamed from: b */
    public final String f17905b;

    /* renamed from: c */
    public final String f17906c;

    /* renamed from: d */
    public final boolean f17907d;

    public C9993f(boolean z9, String localPath, String url, boolean z10) {
        Intrinsics.checkNotNullParameter(localPath, "localPath");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f17904a = z9;
        this.f17905b = localPath;
        this.f17906c = url;
        this.f17907d = z10;
    }

    /* renamed from: b */
    public static /* synthetic */ C9993f m16801b(C9993f c9993f, boolean z9, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = c9993f.f17904a;
        }
        if ((i10 & 2) != 0) {
            str = c9993f.f17905b;
        }
        if ((i10 & 4) != 0) {
            str2 = c9993f.f17906c;
        }
        if ((i10 & 8) != 0) {
            z10 = c9993f.f17907d;
        }
        return c9993f.m16802a(z9, str, str2, z10);
    }

    /* renamed from: a */
    public final C9993f m16802a(boolean z9, String localPath, String url, boolean z10) {
        Intrinsics.checkNotNullParameter(localPath, "localPath");
        Intrinsics.checkNotNullParameter(url, "url");
        return new C9993f(z9, localPath, url, z10);
    }

    /* renamed from: c */
    public final String m16803c() {
        return this.f17905b;
    }

    /* renamed from: d */
    public final boolean m16804d() {
        return this.f17907d;
    }

    /* renamed from: e */
    public final boolean m16805e() {
        return this.f17904a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9993f)) {
            return false;
        }
        C9993f c9993f = (C9993f) obj;
        return this.f17904a == c9993f.f17904a && Intrinsics.areEqual(this.f17905b, c9993f.f17905b) && Intrinsics.areEqual(this.f17906c, c9993f.f17906c) && this.f17907d == c9993f.f17907d;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f17904a) * 31) + this.f17905b.hashCode()) * 31) + this.f17906c.hashCode()) * 31) + Boolean.hashCode(this.f17907d);
    }

    public String toString() {
        return "CustomStemData(isStem=" + this.f17904a + ", localPath=" + this.f17905b + ", url=" + this.f17906c + ", isShoot=" + this.f17907d + ")";
    }

    public /* synthetic */ C9993f(boolean z9, String str, String str2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z9, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? "" : str2, (i10 & 8) != 0 ? false : z10);
    }
}
