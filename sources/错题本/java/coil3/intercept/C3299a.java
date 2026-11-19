package coil3.intercept;

import androidx.collection.AbstractC0584a;
import coil3.InterfaceC3305k;
import coil3.decode.DataSource;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: coil3.intercept.a */
/* loaded from: classes2.dex */
public final class C3299a {

    /* renamed from: a */
    public final InterfaceC3305k f1980a;

    /* renamed from: b */
    public final boolean f1981b;

    /* renamed from: c */
    public final DataSource f1982c;

    /* renamed from: d */
    public final String f1983d;

    public C3299a(InterfaceC3305k interfaceC3305k, boolean z8, DataSource dataSource, String str) {
        this.f1980a = interfaceC3305k;
        this.f1981b = z8;
        this.f1982c = dataSource;
        this.f1983d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3299a)) {
            return false;
        }
        C3299a c3299a = (C3299a) obj;
        return AbstractC5830k.m5325b(this.f1980a, c3299a.f1980a) && this.f1981b == c3299a.f1981b && this.f1982c == c3299a.f1982c && AbstractC5830k.m5325b(this.f1983d, c3299a.f1983d);
    }

    public final int hashCode() {
        int iHashCode = (this.f1982c.hashCode() + AbstractC0584a.m908i(this.f1981b, this.f1980a.hashCode() * 31, 31)) * 31;
        String str = this.f1983d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExecuteResult(image=");
        sb.append(this.f1980a);
        sb.append(", isSampled=");
        sb.append(this.f1981b);
        sb.append(", dataSource=");
        sb.append(this.f1982c);
        sb.append(", diskCacheKey=");
        return AbstractC0584a.m911l(')', this.f1983d, sb);
    }
}
