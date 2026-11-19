package p154s;

import coil3.request.CachePolicy;
import coil3.size.Precision;
import coil3.size.Scale;
import kotlin.jvm.internal.AbstractC5830k;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6471c;
import p162t.InterfaceC6577g;

/* renamed from: s.e */
/* loaded from: classes2.dex */
public final class C6531e {

    /* renamed from: a */
    public final InterfaceC5636h f10850a;

    /* renamed from: b */
    public final InterfaceC5636h f10851b;

    /* renamed from: c */
    public final InterfaceC5636h f10852c;

    /* renamed from: d */
    public final CachePolicy f10853d;

    /* renamed from: e */
    public final CachePolicy f10854e;

    /* renamed from: f */
    public final InterfaceC6471c f10855f;

    /* renamed from: g */
    public final InterfaceC6471c f10856g;

    /* renamed from: h */
    public final InterfaceC6471c f10857h;

    /* renamed from: i */
    public final InterfaceC6577g f10858i;

    /* renamed from: j */
    public final Scale f10859j;

    /* renamed from: k */
    public final Precision f10860k;

    public C6531e(InterfaceC5636h interfaceC5636h, InterfaceC5636h interfaceC5636h2, InterfaceC5636h interfaceC5636h3, CachePolicy cachePolicy, CachePolicy cachePolicy2, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6471c interfaceC6471c3, InterfaceC6577g interfaceC6577g, Scale scale, Precision precision) {
        this.f10850a = interfaceC5636h;
        this.f10851b = interfaceC5636h2;
        this.f10852c = interfaceC5636h3;
        this.f10853d = cachePolicy;
        this.f10854e = cachePolicy2;
        this.f10855f = interfaceC6471c;
        this.f10856g = interfaceC6471c2;
        this.f10857h = interfaceC6471c3;
        this.f10858i = interfaceC6577g;
        this.f10859j = scale;
        this.f10860k = precision;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6531e)) {
            return false;
        }
        C6531e c6531e = (C6531e) obj;
        c6531e.getClass();
        return AbstractC5830k.m5325b(this.f10850a, c6531e.f10850a) && AbstractC5830k.m5325b(this.f10851b, c6531e.f10851b) && AbstractC5830k.m5325b(this.f10852c, c6531e.f10852c) && this.f10853d == c6531e.f10853d && this.f10854e == c6531e.f10854e && AbstractC5830k.m5325b(this.f10855f, c6531e.f10855f) && AbstractC5830k.m5325b(this.f10856g, c6531e.f10856g) && AbstractC5830k.m5325b(this.f10857h, c6531e.f10857h) && AbstractC5830k.m5325b(this.f10858i, c6531e.f10858i) && this.f10859j == c6531e.f10859j && this.f10860k == c6531e.f10860k;
    }

    public final int hashCode() {
        InterfaceC5636h interfaceC5636h = this.f10850a;
        int iHashCode = (interfaceC5636h == null ? 0 : interfaceC5636h.hashCode()) * 31;
        InterfaceC5636h interfaceC5636h2 = this.f10851b;
        int iHashCode2 = (iHashCode + (interfaceC5636h2 == null ? 0 : interfaceC5636h2.hashCode())) * 31;
        InterfaceC5636h interfaceC5636h3 = this.f10852c;
        int iHashCode3 = (iHashCode2 + (interfaceC5636h3 == null ? 0 : interfaceC5636h3.hashCode())) * 31;
        CachePolicy cachePolicy = this.f10853d;
        int iHashCode4 = (iHashCode3 + (cachePolicy == null ? 0 : cachePolicy.hashCode())) * 31;
        CachePolicy cachePolicy2 = this.f10854e;
        int iHashCode5 = (iHashCode4 + (cachePolicy2 == null ? 0 : cachePolicy2.hashCode())) * 961;
        InterfaceC6471c interfaceC6471c = this.f10855f;
        int iHashCode6 = (iHashCode5 + (interfaceC6471c == null ? 0 : interfaceC6471c.hashCode())) * 31;
        InterfaceC6471c interfaceC6471c2 = this.f10856g;
        int iHashCode7 = (iHashCode6 + (interfaceC6471c2 == null ? 0 : interfaceC6471c2.hashCode())) * 31;
        InterfaceC6471c interfaceC6471c3 = this.f10857h;
        int iHashCode8 = (iHashCode7 + (interfaceC6471c3 == null ? 0 : interfaceC6471c3.hashCode())) * 31;
        InterfaceC6577g interfaceC6577g = this.f10858i;
        int iHashCode9 = (iHashCode8 + (interfaceC6577g == null ? 0 : interfaceC6577g.hashCode())) * 31;
        Scale scale = this.f10859j;
        int iHashCode10 = (iHashCode9 + (scale == null ? 0 : scale.hashCode())) * 31;
        Precision precision = this.f10860k;
        return iHashCode10 + (precision != null ? precision.hashCode() : 0);
    }

    public final String toString() {
        return "Defined(fileSystem=null, interceptorCoroutineContext=" + this.f10850a + ", fetcherCoroutineContext=" + this.f10851b + ", decoderCoroutineContext=" + this.f10852c + ", memoryCachePolicy=" + this.f10853d + ", diskCachePolicy=" + this.f10854e + ", networkCachePolicy=null, placeholderFactory=" + this.f10855f + ", errorFactory=" + this.f10856g + ", fallbackFactory=" + this.f10857h + ", sizeResolver=" + this.f10858i + ", scale=" + this.f10859j + ", precision=" + this.f10860k + ')';
    }
}
