package p154s;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import coil3.InterfaceC3305k;
import coil3.decode.DataSource;
import kotlin.jvm.internal.AbstractC5830k;
import p140q.C6397a;

/* renamed from: s.n */
/* loaded from: classes2.dex */
public final class C6540n implements InterfaceC6535i {

    /* renamed from: a */
    public final InterfaceC3305k f10904a;

    /* renamed from: b */
    public final C6532f f10905b;

    /* renamed from: c */
    public final DataSource f10906c;

    /* renamed from: d */
    public final C6397a f10907d;

    /* renamed from: e */
    public final String f10908e;

    /* renamed from: f */
    public final boolean f10909f;

    /* renamed from: g */
    public final boolean f10910g;

    public C6540n(InterfaceC3305k interfaceC3305k, C6532f c6532f, DataSource dataSource, C6397a c6397a, String str, boolean z8, boolean z9) {
        this.f10904a = interfaceC3305k;
        this.f10905b = c6532f;
        this.f10906c = dataSource;
        this.f10907d = c6397a;
        this.f10908e = str;
        this.f10909f = z8;
        this.f10910g = z9;
    }

    @Override // p154s.InterfaceC6535i
    /* renamed from: a */
    public final C6532f mo6181a() {
        return this.f10905b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6540n)) {
            return false;
        }
        C6540n c6540n = (C6540n) obj;
        return AbstractC5830k.m5325b(this.f10904a, c6540n.f10904a) && AbstractC5830k.m5325b(this.f10905b, c6540n.f10905b) && this.f10906c == c6540n.f10906c && AbstractC5830k.m5325b(this.f10907d, c6540n.f10907d) && AbstractC5830k.m5325b(this.f10908e, c6540n.f10908e) && this.f10909f == c6540n.f10909f && this.f10910g == c6540n.f10910g;
    }

    public final int hashCode() {
        int iHashCode = (this.f10906c.hashCode() + ((this.f10905b.hashCode() + (this.f10904a.hashCode() * 31)) * 31)) * 31;
        C6397a c6397a = this.f10907d;
        int iHashCode2 = (iHashCode + (c6397a == null ? 0 : c6397a.hashCode())) * 31;
        String str = this.f10908e;
        return Boolean.hashCode(this.f10910g) + AbstractC0584a.m908i(this.f10909f, (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessResult(image=");
        sb.append(this.f10904a);
        sb.append(", request=");
        sb.append(this.f10905b);
        sb.append(", dataSource=");
        sb.append(this.f10906c);
        sb.append(", memoryCacheKey=");
        sb.append(this.f10907d);
        sb.append(", diskCacheKey=");
        sb.append(this.f10908e);
        sb.append(", isSampled=");
        sb.append(this.f10909f);
        sb.append(", isPlaceholderCached=");
        return AbstractC0037f.m93r(sb, this.f10910g, ')');
    }
}
