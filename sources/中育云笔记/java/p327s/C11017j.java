package p327s;

import coil3.C5454c;
import coil3.network.C5486c;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: s.j */
/* loaded from: classes3.dex */
public final class C11017j {

    /* renamed from: a */
    public final String f26588a;

    /* renamed from: b */
    public final String f26589b;

    /* renamed from: c */
    public final C5486c f26590c;

    /* renamed from: d */
    public final C5454c f26591d;

    public C11017j(String str, String str2, C5486c c5486c, InterfaceC11018k interfaceC11018k, C5454c c5454c) {
        this.f26588a = str;
        this.f26589b = str2;
        this.f26590c = c5486c;
        this.f26591d = c5454c;
    }

    /* renamed from: a */
    public final InterfaceC11018k m24333a() {
        return null;
    }

    /* renamed from: b */
    public final C5486c m24334b() {
        return this.f26590c;
    }

    /* renamed from: c */
    public final String m24335c() {
        return this.f26589b;
    }

    /* renamed from: d */
    public final String m24336d() {
        return this.f26588a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11017j)) {
            return false;
        }
        C11017j c11017j = (C11017j) obj;
        return AbstractC9979u.m20289b(this.f26588a, c11017j.f26588a) && AbstractC9979u.m20289b(this.f26589b, c11017j.f26589b) && AbstractC9979u.m20289b(this.f26590c, c11017j.f26590c) && AbstractC9979u.m20289b(null, null) && AbstractC9979u.m20289b(this.f26591d, c11017j.f26591d);
    }

    public int hashCode() {
        return (((((this.f26588a.hashCode() * 31) + this.f26589b.hashCode()) * 31) + this.f26590c.hashCode()) * 961) + this.f26591d.hashCode();
    }

    public String toString() {
        return "NetworkRequest(url=" + this.f26588a + ", method=" + this.f26589b + ", headers=" + this.f26590c + ", body=" + ((Object) null) + ", extras=" + this.f26591d + ')';
    }
}
