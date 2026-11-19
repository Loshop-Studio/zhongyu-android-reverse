package p154s;

import coil3.C3304j;
import coil3.request.CachePolicy;
import coil3.size.Precision;
import coil3.size.Scale;
import coil3.util.C3347k;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.AbstractC5896f0;
import okio.FileSystem;
import p068g7.C5609e;
import p068g7.ExecutorC5608d;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6471c;
import p162t.C6574d;
import p162t.InterfaceC6577g;

/* renamed from: s.d */
/* loaded from: classes2.dex */
public final class C6530d {

    /* renamed from: o */
    public static final C6530d f10835o;

    /* renamed from: a */
    public final FileSystem f10836a;

    /* renamed from: b */
    public final InterfaceC5636h f10837b;

    /* renamed from: c */
    public final InterfaceC5636h f10838c;

    /* renamed from: d */
    public final InterfaceC5636h f10839d;

    /* renamed from: e */
    public final CachePolicy f10840e;

    /* renamed from: f */
    public final CachePolicy f10841f;

    /* renamed from: g */
    public final CachePolicy f10842g;

    /* renamed from: h */
    public final InterfaceC6471c f10843h;

    /* renamed from: i */
    public final InterfaceC6471c f10844i;

    /* renamed from: j */
    public final InterfaceC6471c f10845j;

    /* renamed from: k */
    public final InterfaceC6577g f10846k;

    /* renamed from: l */
    public final Scale f10847l;

    /* renamed from: m */
    public final Precision f10848m;

    /* renamed from: n */
    public final C3304j f10849n;

    static {
        FileSystem fileSystem = FileSystem.SYSTEM;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        C5609e c5609e = AbstractC5896f0.f9343a;
        ExecutorC5608d executorC5608d = ExecutorC5608d.f8730a;
        CachePolicy cachePolicy = CachePolicy.ENABLED;
        C6574d c6574d = InterfaceC6577g.f10980b0;
        Scale scale = Scale.FIT;
        Precision precision = Precision.EXACT;
        C3304j c3304j = C3304j.f1995b;
        C3347k c3347k = C3347k.f2082a;
        f10835o = new C6530d(fileSystem, emptyCoroutineContext, executorC5608d, executorC5608d, cachePolicy, cachePolicy, cachePolicy, c3347k, c3347k, c3347k, c6574d, scale, precision, c3304j);
    }

    public C6530d(FileSystem fileSystem, InterfaceC5636h interfaceC5636h, InterfaceC5636h interfaceC5636h2, InterfaceC5636h interfaceC5636h3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6471c interfaceC6471c3, InterfaceC6577g interfaceC6577g, Scale scale, Precision precision, C3304j c3304j) {
        this.f10836a = fileSystem;
        this.f10837b = interfaceC5636h;
        this.f10838c = interfaceC5636h2;
        this.f10839d = interfaceC5636h3;
        this.f10840e = cachePolicy;
        this.f10841f = cachePolicy2;
        this.f10842g = cachePolicy3;
        this.f10843h = interfaceC6471c;
        this.f10844i = interfaceC6471c2;
        this.f10845j = interfaceC6471c3;
        this.f10846k = interfaceC6577g;
        this.f10847l = scale;
        this.f10848m = precision;
        this.f10849n = c3304j;
    }

    /* renamed from: a */
    public static C6530d m6183a(C6530d c6530d, CachePolicy cachePolicy, C3304j c3304j, int i) {
        FileSystem fileSystem = c6530d.f10836a;
        InterfaceC5636h interfaceC5636h = c6530d.f10837b;
        InterfaceC5636h interfaceC5636h2 = c6530d.f10838c;
        InterfaceC5636h interfaceC5636h3 = c6530d.f10839d;
        CachePolicy cachePolicy2 = c6530d.f10840e;
        CachePolicy cachePolicy3 = (i & 32) != 0 ? c6530d.f10841f : cachePolicy;
        CachePolicy cachePolicy4 = c6530d.f10842g;
        CachePolicy cachePolicy5 = cachePolicy3;
        InterfaceC6471c interfaceC6471c = c6530d.f10843h;
        InterfaceC6471c interfaceC6471c2 = c6530d.f10844i;
        InterfaceC6471c interfaceC6471c3 = c6530d.f10845j;
        InterfaceC6577g interfaceC6577g = c6530d.f10846k;
        Scale scale = c6530d.f10847l;
        Precision precision = c6530d.f10848m;
        C3304j c3304j2 = (i & 8192) != 0 ? c6530d.f10849n : c3304j;
        c6530d.getClass();
        return new C6530d(fileSystem, interfaceC5636h, interfaceC5636h2, interfaceC5636h3, cachePolicy2, cachePolicy5, cachePolicy4, interfaceC6471c, interfaceC6471c2, interfaceC6471c3, interfaceC6577g, scale, precision, c3304j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6530d)) {
            return false;
        }
        C6530d c6530d = (C6530d) obj;
        return AbstractC5830k.m5325b(this.f10836a, c6530d.f10836a) && AbstractC5830k.m5325b(this.f10837b, c6530d.f10837b) && AbstractC5830k.m5325b(this.f10838c, c6530d.f10838c) && AbstractC5830k.m5325b(this.f10839d, c6530d.f10839d) && this.f10840e == c6530d.f10840e && this.f10841f == c6530d.f10841f && this.f10842g == c6530d.f10842g && AbstractC5830k.m5325b(this.f10843h, c6530d.f10843h) && AbstractC5830k.m5325b(this.f10844i, c6530d.f10844i) && AbstractC5830k.m5325b(this.f10845j, c6530d.f10845j) && AbstractC5830k.m5325b(this.f10846k, c6530d.f10846k) && this.f10847l == c6530d.f10847l && this.f10848m == c6530d.f10848m && AbstractC5830k.m5325b(this.f10849n, c6530d.f10849n);
    }

    public final int hashCode() {
        return this.f10849n.f1996a.hashCode() + ((this.f10848m.hashCode() + ((this.f10847l.hashCode() + ((this.f10846k.hashCode() + ((this.f10845j.hashCode() + ((this.f10844i.hashCode() + ((this.f10843h.hashCode() + ((this.f10842g.hashCode() + ((this.f10841f.hashCode() + ((this.f10840e.hashCode() + ((this.f10839d.hashCode() + ((this.f10838c.hashCode() + ((this.f10837b.hashCode() + (this.f10836a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Defaults(fileSystem=" + this.f10836a + ", interceptorCoroutineContext=" + this.f10837b + ", fetcherCoroutineContext=" + this.f10838c + ", decoderCoroutineContext=" + this.f10839d + ", memoryCachePolicy=" + this.f10840e + ", diskCachePolicy=" + this.f10841f + ", networkCachePolicy=" + this.f10842g + ", placeholderFactory=" + this.f10843h + ", errorFactory=" + this.f10844i + ", fallbackFactory=" + this.f10845j + ", sizeResolver=" + this.f10846k + ", scale=" + this.f10847l + ", precision=" + this.f10848m + ", extras=" + this.f10849n + ')';
    }
}
