package p119n;

import androidx.collection.AbstractC0584a;
import coil3.InterfaceC3305k;
import coil3.decode.DataSource;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: n.i */
/* loaded from: classes2.dex */
public final class C6204i implements InterfaceC6200e {

    /* renamed from: a */
    public final InterfaceC3305k f9917a;

    /* renamed from: b */
    public final boolean f9918b;

    /* renamed from: c */
    public final DataSource f9919c;

    public C6204i(InterfaceC3305k interfaceC3305k, boolean z8, DataSource dataSource) {
        this.f9917a = interfaceC3305k;
        this.f9918b = z8;
        this.f9919c = dataSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6204i)) {
            return false;
        }
        C6204i c6204i = (C6204i) obj;
        return AbstractC5830k.m5325b(this.f9917a, c6204i.f9917a) && this.f9918b == c6204i.f9918b && this.f9919c == c6204i.f9919c;
    }

    public final int hashCode() {
        return this.f9919c.hashCode() + AbstractC0584a.m908i(this.f9918b, this.f9917a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ImageFetchResult(image=" + this.f9917a + ", isSampled=" + this.f9918b + ", dataSource=" + this.f9919c + ')';
    }
}
