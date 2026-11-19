package p380w;

import android.content.Context;
import coil3.C5454c;
import coil3.request.CachePolicy;
import coil3.size.Precision;
import coil3.size.Scale;
import kotlin.jvm.internal.AbstractC9979u;
import okio.FileSystem;
import p396x.C11749e;

/* renamed from: w.n */
/* loaded from: classes3.dex */
public final class C11634n {

    /* renamed from: a */
    public final Context f27626a;

    /* renamed from: b */
    public final C11749e f27627b;

    /* renamed from: c */
    public final Scale f27628c;

    /* renamed from: d */
    public final Precision f27629d;

    /* renamed from: e */
    public final String f27630e;

    /* renamed from: f */
    public final FileSystem f27631f;

    /* renamed from: g */
    public final CachePolicy f27632g;

    /* renamed from: h */
    public final CachePolicy f27633h;

    /* renamed from: i */
    public final CachePolicy f27634i;

    /* renamed from: j */
    public final C5454c f27635j;

    public C11634n(Context context, C11749e c11749e, Scale scale, Precision precision, String str, FileSystem fileSystem, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, C5454c c5454c) {
        this.f27626a = context;
        this.f27627b = c11749e;
        this.f27628c = scale;
        this.f27629d = precision;
        this.f27630e = str;
        this.f27631f = fileSystem;
        this.f27632g = cachePolicy;
        this.f27633h = cachePolicy2;
        this.f27634i = cachePolicy3;
        this.f27635j = c5454c;
    }

    /* renamed from: b */
    public static /* synthetic */ C11634n m25741b(C11634n c11634n, Context context, C11749e c11749e, Scale scale, Precision precision, String str, FileSystem fileSystem, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, C5454c c5454c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            context = c11634n.f27626a;
        }
        if ((i10 & 2) != 0) {
            c11749e = c11634n.f27627b;
        }
        if ((i10 & 4) != 0) {
            scale = c11634n.f27628c;
        }
        if ((i10 & 8) != 0) {
            precision = c11634n.f27629d;
        }
        if ((i10 & 16) != 0) {
            str = c11634n.f27630e;
        }
        if ((i10 & 32) != 0) {
            fileSystem = c11634n.f27631f;
        }
        if ((i10 & 64) != 0) {
            cachePolicy = c11634n.f27632g;
        }
        if ((i10 & 128) != 0) {
            cachePolicy2 = c11634n.f27633h;
        }
        if ((i10 & 256) != 0) {
            cachePolicy3 = c11634n.f27634i;
        }
        if ((i10 & 512) != 0) {
            c5454c = c11634n.f27635j;
        }
        CachePolicy cachePolicy4 = cachePolicy3;
        C5454c c5454c2 = c5454c;
        CachePolicy cachePolicy5 = cachePolicy;
        CachePolicy cachePolicy6 = cachePolicy2;
        String str2 = str;
        FileSystem fileSystem2 = fileSystem;
        return c11634n.m25742a(context, c11749e, scale, precision, str2, fileSystem2, cachePolicy5, cachePolicy6, cachePolicy4, c5454c2);
    }

    /* renamed from: a */
    public final C11634n m25742a(Context context, C11749e c11749e, Scale scale, Precision precision, String str, FileSystem fileSystem, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, C5454c c5454c) {
        return new C11634n(context, c11749e, scale, precision, str, fileSystem, cachePolicy, cachePolicy2, cachePolicy3, c5454c);
    }

    /* renamed from: c */
    public final Context m25743c() {
        return this.f27626a;
    }

    /* renamed from: d */
    public final String m25744d() {
        return this.f27630e;
    }

    /* renamed from: e */
    public final CachePolicy m25745e() {
        return this.f27633h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11634n)) {
            return false;
        }
        C11634n c11634n = (C11634n) obj;
        return AbstractC9979u.m20289b(this.f27626a, c11634n.f27626a) && AbstractC9979u.m20289b(this.f27627b, c11634n.f27627b) && this.f27628c == c11634n.f27628c && this.f27629d == c11634n.f27629d && AbstractC9979u.m20289b(this.f27630e, c11634n.f27630e) && AbstractC9979u.m20289b(this.f27631f, c11634n.f27631f) && this.f27632g == c11634n.f27632g && this.f27633h == c11634n.f27633h && this.f27634i == c11634n.f27634i && AbstractC9979u.m20289b(this.f27635j, c11634n.f27635j);
    }

    /* renamed from: f */
    public final C5454c m25746f() {
        return this.f27635j;
    }

    /* renamed from: g */
    public final FileSystem m25747g() {
        return this.f27631f;
    }

    /* renamed from: h */
    public final CachePolicy m25748h() {
        return this.f27634i;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f27626a.hashCode() * 31) + this.f27627b.hashCode()) * 31) + this.f27628c.hashCode()) * 31) + this.f27629d.hashCode()) * 31;
        String str = this.f27630e;
        return ((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f27631f.hashCode()) * 31) + this.f27632g.hashCode()) * 31) + this.f27633h.hashCode()) * 31) + this.f27634i.hashCode()) * 31) + this.f27635j.hashCode();
    }

    /* renamed from: i */
    public final Precision m25749i() {
        return this.f27629d;
    }

    /* renamed from: j */
    public final Scale m25750j() {
        return this.f27628c;
    }

    /* renamed from: k */
    public final C11749e m25751k() {
        return this.f27627b;
    }

    public String toString() {
        return "Options(context=" + this.f27626a + ", size=" + this.f27627b + ", scale=" + this.f27628c + ", precision=" + this.f27629d + ", diskCacheKey=" + this.f27630e + ", fileSystem=" + this.f27631f + ", memoryCachePolicy=" + this.f27632g + ", diskCachePolicy=" + this.f27633h + ", networkCachePolicy=" + this.f27634i + ", extras=" + this.f27635j + ')';
    }
}
