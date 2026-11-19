package p154s;

import android.content.Context;
import coil3.C3304j;
import coil3.request.CachePolicy;
import coil3.size.Precision;
import coil3.size.Scale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5830k;
import okio.FileSystem;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6471c;
import p162t.InterfaceC6577g;
import p171u.InterfaceC6608a;

/* renamed from: s.f */
/* loaded from: classes2.dex */
public final class C6532f {

    /* renamed from: a */
    public final Context f10861a;

    /* renamed from: b */
    public final Object f10862b;

    /* renamed from: c */
    public final InterfaceC6608a f10863c;

    /* renamed from: d */
    public final Map f10864d;

    /* renamed from: e */
    public final FileSystem f10865e;

    /* renamed from: f */
    public final InterfaceC5636h f10866f;

    /* renamed from: g */
    public final InterfaceC5636h f10867g;

    /* renamed from: h */
    public final InterfaceC5636h f10868h;

    /* renamed from: i */
    public final CachePolicy f10869i;

    /* renamed from: j */
    public final CachePolicy f10870j;

    /* renamed from: k */
    public final CachePolicy f10871k;

    /* renamed from: l */
    public final InterfaceC6471c f10872l;

    /* renamed from: m */
    public final InterfaceC6471c f10873m;

    /* renamed from: n */
    public final InterfaceC6471c f10874n;

    /* renamed from: o */
    public final InterfaceC6577g f10875o;

    /* renamed from: p */
    public final Scale f10876p;

    /* renamed from: q */
    public final Precision f10877q;

    /* renamed from: r */
    public final C3304j f10878r;

    /* renamed from: s */
    public final C6531e f10879s;

    /* renamed from: t */
    public final C6530d f10880t;

    public C6532f(Context context, Object obj, InterfaceC6608a interfaceC6608a, Map map, FileSystem fileSystem, InterfaceC5636h interfaceC5636h, InterfaceC5636h interfaceC5636h2, InterfaceC5636h interfaceC5636h3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6471c interfaceC6471c3, InterfaceC6577g interfaceC6577g, Scale scale, Precision precision, C3304j c3304j, C6531e c6531e, C6530d c6530d) {
        this.f10861a = context;
        this.f10862b = obj;
        this.f10863c = interfaceC6608a;
        this.f10864d = map;
        this.f10865e = fileSystem;
        this.f10866f = interfaceC5636h;
        this.f10867g = interfaceC5636h2;
        this.f10868h = interfaceC5636h3;
        this.f10869i = cachePolicy;
        this.f10870j = cachePolicy2;
        this.f10871k = cachePolicy3;
        this.f10872l = interfaceC6471c;
        this.f10873m = interfaceC6471c2;
        this.f10874n = interfaceC6471c3;
        this.f10875o = interfaceC6577g;
        this.f10876p = scale;
        this.f10877q = precision;
        this.f10878r = c3304j;
        this.f10879s = c6531e;
        this.f10880t = c6530d;
    }

    /* renamed from: a */
    public static C6529c m6184a(C6532f c6532f) {
        Context context = c6532f.f10861a;
        c6532f.getClass();
        return new C6529c(c6532f, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6532f)) {
            return false;
        }
        C6532f c6532f = (C6532f) obj;
        return AbstractC5830k.m5325b(this.f10861a, c6532f.f10861a) && this.f10862b.equals(c6532f.f10862b) && AbstractC5830k.m5325b(this.f10863c, c6532f.f10863c) && this.f10864d.equals(c6532f.f10864d) && AbstractC5830k.m5325b(this.f10865e, c6532f.f10865e) && AbstractC5830k.m5325b(this.f10866f, c6532f.f10866f) && AbstractC5830k.m5325b(this.f10867g, c6532f.f10867g) && AbstractC5830k.m5325b(this.f10868h, c6532f.f10868h) && this.f10869i == c6532f.f10869i && this.f10870j == c6532f.f10870j && this.f10871k == c6532f.f10871k && AbstractC5830k.m5325b(this.f10872l, c6532f.f10872l) && AbstractC5830k.m5325b(this.f10873m, c6532f.f10873m) && AbstractC5830k.m5325b(this.f10874n, c6532f.f10874n) && AbstractC5830k.m5325b(this.f10875o, c6532f.f10875o) && this.f10876p == c6532f.f10876p && this.f10877q == c6532f.f10877q && AbstractC5830k.m5325b(this.f10878r, c6532f.f10878r) && this.f10879s.equals(c6532f.f10879s) && AbstractC5830k.m5325b(this.f10880t, c6532f.f10880t);
    }

    public final int hashCode() {
        int iHashCode = (this.f10862b.hashCode() + (this.f10861a.hashCode() * 31)) * 31;
        InterfaceC6608a interfaceC6608a = this.f10863c;
        return this.f10880t.hashCode() + ((this.f10879s.hashCode() + ((this.f10878r.f1996a.hashCode() + ((this.f10877q.hashCode() + ((this.f10876p.hashCode() + ((this.f10875o.hashCode() + ((this.f10874n.hashCode() + ((this.f10873m.hashCode() + ((this.f10872l.hashCode() + ((this.f10871k.hashCode() + ((this.f10870j.hashCode() + ((this.f10869i.hashCode() + ((this.f10868h.hashCode() + ((this.f10867g.hashCode() + ((this.f10866f.hashCode() + ((this.f10865e.hashCode() + ((this.f10864d.hashCode() + ((iHashCode + (interfaceC6608a == null ? 0 : interfaceC6608a.hashCode())) * 29791)) * 961)) * 29791)) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ImageRequest(context=" + this.f10861a + ", data=" + this.f10862b + ", target=" + this.f10863c + ", listener=null, memoryCacheKey=null, memoryCacheKeyExtras=" + this.f10864d + ", diskCacheKey=null, fileSystem=" + this.f10865e + ", fetcherFactory=null, decoderFactory=null, interceptorCoroutineContext=" + this.f10866f + ", fetcherCoroutineContext=" + this.f10867g + ", decoderCoroutineContext=" + this.f10868h + ", memoryCachePolicy=" + this.f10869i + ", diskCachePolicy=" + this.f10870j + ", networkCachePolicy=" + this.f10871k + ", placeholderMemoryCacheKey=null, placeholderFactory=" + this.f10872l + ", errorFactory=" + this.f10873m + ", fallbackFactory=" + this.f10874n + ", sizeResolver=" + this.f10875o + ", scale=" + this.f10876p + ", precision=" + this.f10877q + ", extras=" + this.f10878r + ", defined=" + this.f10879s + ", defaults=" + this.f10880t + ')';
    }
}
