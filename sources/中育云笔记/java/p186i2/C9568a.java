package p186i2;

import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: i2.a */
/* loaded from: classes3.dex */
public final class C9568a {

    /* renamed from: a */
    public final String f22077a;

    /* renamed from: b */
    public final String f22078b;

    /* renamed from: c */
    public final boolean f22079c;

    public C9568a(String str, String str2, boolean z10) {
        this.f22077a = str;
        this.f22078b = str2;
        this.f22079c = z10;
    }

    /* renamed from: a */
    public final String m18807a() {
        return this.f22078b;
    }

    /* renamed from: b */
    public final boolean m18808b() {
        return this.f22079c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9568a)) {
            return false;
        }
        C9568a c9568a = (C9568a) obj;
        return AbstractC9979u.m20289b(this.f22077a, c9568a.f22077a) && AbstractC9979u.m20289b(this.f22078b, c9568a.f22078b) && this.f22079c == c9568a.f22079c;
    }

    public int hashCode() {
        String str = this.f22077a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f22078b;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.f22079c);
    }

    public String toString() {
        return "DeviceInfo(code=" + this.f22077a + ", ip=" + this.f22078b + ", matchSuccess=" + this.f22079c + ")";
    }
}
