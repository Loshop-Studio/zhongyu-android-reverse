package p154s;

import android.content.Context;
import coil3.C3304j;
import coil3.request.CachePolicy;
import coil3.size.Precision;
import coil3.size.Scale;
import kotlin.jvm.internal.AbstractC5830k;
import okio.FileSystem;
import p162t.C6576f;

/* renamed from: s.l */
/* loaded from: classes2.dex */
public final class C6538l {

    /* renamed from: a */
    public final Context f10894a;

    /* renamed from: b */
    public final C6576f f10895b;

    /* renamed from: c */
    public final Scale f10896c;

    /* renamed from: d */
    public final Precision f10897d;

    /* renamed from: e */
    public final String f10898e;

    /* renamed from: f */
    public final FileSystem f10899f;

    /* renamed from: g */
    public final CachePolicy f10900g;

    /* renamed from: h */
    public final CachePolicy f10901h;

    /* renamed from: i */
    public final CachePolicy f10902i;

    /* renamed from: j */
    public final C3304j f10903j;

    public C6538l(Context context, C6576f c6576f, Scale scale, Precision precision, String str, FileSystem fileSystem, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, C3304j c3304j) {
        this.f10894a = context;
        this.f10895b = c6576f;
        this.f10896c = scale;
        this.f10897d = precision;
        this.f10898e = str;
        this.f10899f = fileSystem;
        this.f10900g = cachePolicy;
        this.f10901h = cachePolicy2;
        this.f10902i = cachePolicy3;
        this.f10903j = c3304j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6538l)) {
            return false;
        }
        C6538l c6538l = (C6538l) obj;
        return AbstractC5830k.m5325b(this.f10894a, c6538l.f10894a) && AbstractC5830k.m5325b(this.f10895b, c6538l.f10895b) && this.f10896c == c6538l.f10896c && this.f10897d == c6538l.f10897d && AbstractC5830k.m5325b(this.f10898e, c6538l.f10898e) && AbstractC5830k.m5325b(this.f10899f, c6538l.f10899f) && this.f10900g == c6538l.f10900g && this.f10901h == c6538l.f10901h && this.f10902i == c6538l.f10902i && AbstractC5830k.m5325b(this.f10903j, c6538l.f10903j);
    }

    public final int hashCode() {
        int iHashCode = (this.f10897d.hashCode() + ((this.f10896c.hashCode() + ((this.f10895b.hashCode() + (this.f10894a.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.f10898e;
        return this.f10903j.f1996a.hashCode() + ((this.f10902i.hashCode() + ((this.f10901h.hashCode() + ((this.f10900g.hashCode() + ((this.f10899f.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Options(context=" + this.f10894a + ", size=" + this.f10895b + ", scale=" + this.f10896c + ", precision=" + this.f10897d + ", diskCacheKey=" + this.f10898e + ", fileSystem=" + this.f10899f + ", memoryCachePolicy=" + this.f10900g + ", diskCachePolicy=" + this.f10901h + ", networkCachePolicy=" + this.f10902i + ", extras=" + this.f10903j + ')';
    }
}
