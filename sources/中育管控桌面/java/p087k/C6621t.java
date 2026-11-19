package p087k;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: k.t */
/* loaded from: classes3.dex */
public final class C6621t {

    /* renamed from: a */
    public final String f8653a;

    /* renamed from: b */
    public final String f8654b;

    /* renamed from: c */
    public final String f8655c;

    /* renamed from: d */
    public final String f8656d;

    /* renamed from: e */
    public final String f8657e;

    /* renamed from: f */
    public final String f8658f;

    /* renamed from: g */
    public final String f8659g;

    public C6621t(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f8653a = str;
        this.f8654b = str2;
        this.f8655c = str3;
        this.f8656d = str4;
        this.f8657e = str5;
        this.f8658f = str6;
        this.f8659g = str7;
    }

    /* renamed from: a */
    public final String m7573a() {
        return this.f8656d;
    }

    /* renamed from: b */
    public final String m7574b() {
        return this.f8657e;
    }

    /* renamed from: c */
    public final String m7575c() {
        return this.f8655c;
    }

    /* renamed from: d */
    public final String m7576d() {
        return this.f8654b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6621t) && Intrinsics.areEqual(((C6621t) obj).f8653a, this.f8653a);
    }

    public int hashCode() {
        return this.f8653a.hashCode();
    }

    public String toString() {
        return this.f8653a;
    }
}
