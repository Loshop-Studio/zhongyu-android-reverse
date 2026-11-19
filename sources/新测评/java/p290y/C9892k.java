package p290y;

import android.content.Context;
import coil3.C5169c;
import coil3.request.CachePolicy;
import coil3.size.Precision;
import coil3.size.Scale;
import kotlin.jvm.internal.Intrinsics;
import okio.FileSystem;
import p300z.C9958e;

/* renamed from: y.k */
/* loaded from: classes3.dex */
public final class C9892k {

    /* renamed from: a */
    public final Context f17615a;

    /* renamed from: b */
    public final C9958e f17616b;

    /* renamed from: c */
    public final Scale f17617c;

    /* renamed from: d */
    public final Precision f17618d;

    /* renamed from: e */
    public final String f17619e;

    /* renamed from: f */
    public final FileSystem f17620f;

    /* renamed from: g */
    public final CachePolicy f17621g;

    /* renamed from: h */
    public final CachePolicy f17622h;

    /* renamed from: i */
    public final CachePolicy f17623i;

    /* renamed from: j */
    public final C5169c f17624j;

    public C9892k(Context context, C9958e c9958e, Scale scale, Precision precision, String str, FileSystem fileSystem, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, C5169c c5169c) {
        this.f17615a = context;
        this.f17616b = c9958e;
        this.f17617c = scale;
        this.f17618d = precision;
        this.f17619e = str;
        this.f17620f = fileSystem;
        this.f17621g = cachePolicy;
        this.f17622h = cachePolicy2;
        this.f17623i = cachePolicy3;
        this.f17624j = c5169c;
    }

    /* renamed from: b */
    public static /* synthetic */ C9892k m16698b(C9892k c9892k, Context context, C9958e c9958e, Scale scale, Precision precision, String str, FileSystem fileSystem, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, C5169c c5169c, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            context = c9892k.f17615a;
        }
        if ((i10 & 2) != 0) {
            c9958e = c9892k.f17616b;
        }
        if ((i10 & 4) != 0) {
            scale = c9892k.f17617c;
        }
        if ((i10 & 8) != 0) {
            precision = c9892k.f17618d;
        }
        if ((i10 & 16) != 0) {
            str = c9892k.f17619e;
        }
        if ((i10 & 32) != 0) {
            fileSystem = c9892k.f17620f;
        }
        if ((i10 & 64) != 0) {
            cachePolicy = c9892k.f17621g;
        }
        if ((i10 & 128) != 0) {
            cachePolicy2 = c9892k.f17622h;
        }
        if ((i10 & 256) != 0) {
            cachePolicy3 = c9892k.f17623i;
        }
        if ((i10 & 512) != 0) {
            c5169c = c9892k.f17624j;
        }
        CachePolicy cachePolicy4 = cachePolicy3;
        C5169c c5169c2 = c5169c;
        CachePolicy cachePolicy5 = cachePolicy;
        CachePolicy cachePolicy6 = cachePolicy2;
        String str2 = str;
        FileSystem fileSystem2 = fileSystem;
        return c9892k.m16699a(context, c9958e, scale, precision, str2, fileSystem2, cachePolicy5, cachePolicy6, cachePolicy4, c5169c2);
    }

    /* renamed from: a */
    public final C9892k m16699a(Context context, C9958e c9958e, Scale scale, Precision precision, String str, FileSystem fileSystem, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, C5169c c5169c) {
        return new C9892k(context, c9958e, scale, precision, str, fileSystem, cachePolicy, cachePolicy2, cachePolicy3, c5169c);
    }

    /* renamed from: c */
    public final Context m16700c() {
        return this.f17615a;
    }

    /* renamed from: d */
    public final String m16701d() {
        return this.f17619e;
    }

    /* renamed from: e */
    public final CachePolicy m16702e() {
        return this.f17622h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9892k)) {
            return false;
        }
        C9892k c9892k = (C9892k) obj;
        return Intrinsics.areEqual(this.f17615a, c9892k.f17615a) && Intrinsics.areEqual(this.f17616b, c9892k.f17616b) && this.f17617c == c9892k.f17617c && this.f17618d == c9892k.f17618d && Intrinsics.areEqual(this.f17619e, c9892k.f17619e) && Intrinsics.areEqual(this.f17620f, c9892k.f17620f) && this.f17621g == c9892k.f17621g && this.f17622h == c9892k.f17622h && this.f17623i == c9892k.f17623i && Intrinsics.areEqual(this.f17624j, c9892k.f17624j);
    }

    /* renamed from: f */
    public final C5169c m16703f() {
        return this.f17624j;
    }

    /* renamed from: g */
    public final FileSystem m16704g() {
        return this.f17620f;
    }

    /* renamed from: h */
    public final CachePolicy m16705h() {
        return this.f17623i;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f17615a.hashCode() * 31) + this.f17616b.hashCode()) * 31) + this.f17617c.hashCode()) * 31) + this.f17618d.hashCode()) * 31;
        String str = this.f17619e;
        return ((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f17620f.hashCode()) * 31) + this.f17621g.hashCode()) * 31) + this.f17622h.hashCode()) * 31) + this.f17623i.hashCode()) * 31) + this.f17624j.hashCode();
    }

    /* renamed from: i */
    public final Precision m16706i() {
        return this.f17618d;
    }

    /* renamed from: j */
    public final Scale m16707j() {
        return this.f17617c;
    }

    /* renamed from: k */
    public final C9958e m16708k() {
        return this.f17616b;
    }

    public String toString() {
        return "Options(context=" + this.f17615a + ", size=" + this.f17616b + ", scale=" + this.f17617c + ", precision=" + this.f17618d + ", diskCacheKey=" + this.f17619e + ", fileSystem=" + this.f17620f + ", memoryCachePolicy=" + this.f17621g + ", diskCachePolicy=" + this.f17622h + ", networkCachePolicy=" + this.f17623i + ", extras=" + this.f17624j + ')';
    }
}
