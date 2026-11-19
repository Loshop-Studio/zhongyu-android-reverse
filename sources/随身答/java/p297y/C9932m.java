package p297y;

import android.content.Context;
import coil3.C5304c;
import coil3.request.CachePolicy;
import coil3.size.Precision;
import coil3.size.Scale;
import kotlin.jvm.internal.Intrinsics;
import okio.FileSystem;
import p307z.C9975e;

/* renamed from: y.m */
/* loaded from: classes3.dex */
public final class C9932m {

    /* renamed from: a */
    public final Context f17851a;

    /* renamed from: b */
    public final C9975e f17852b;

    /* renamed from: c */
    public final Scale f17853c;

    /* renamed from: d */
    public final Precision f17854d;

    /* renamed from: e */
    public final String f17855e;

    /* renamed from: f */
    public final FileSystem f17856f;

    /* renamed from: g */
    public final CachePolicy f17857g;

    /* renamed from: h */
    public final CachePolicy f17858h;

    /* renamed from: i */
    public final CachePolicy f17859i;

    /* renamed from: j */
    public final C5304c f17860j;

    public C9932m(Context context, C9975e c9975e, Scale scale, Precision precision, String str, FileSystem fileSystem, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, C5304c c5304c) {
        this.f17851a = context;
        this.f17852b = c9975e;
        this.f17853c = scale;
        this.f17854d = precision;
        this.f17855e = str;
        this.f17856f = fileSystem;
        this.f17857g = cachePolicy;
        this.f17858h = cachePolicy2;
        this.f17859i = cachePolicy3;
        this.f17860j = c5304c;
    }

    /* renamed from: b */
    public static /* synthetic */ C9932m m17106b(C9932m c9932m, Context context, C9975e c9975e, Scale scale, Precision precision, String str, FileSystem fileSystem, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, C5304c c5304c, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            context = c9932m.f17851a;
        }
        if ((i9 & 2) != 0) {
            c9975e = c9932m.f17852b;
        }
        if ((i9 & 4) != 0) {
            scale = c9932m.f17853c;
        }
        if ((i9 & 8) != 0) {
            precision = c9932m.f17854d;
        }
        if ((i9 & 16) != 0) {
            str = c9932m.f17855e;
        }
        if ((i9 & 32) != 0) {
            fileSystem = c9932m.f17856f;
        }
        if ((i9 & 64) != 0) {
            cachePolicy = c9932m.f17857g;
        }
        if ((i9 & 128) != 0) {
            cachePolicy2 = c9932m.f17858h;
        }
        if ((i9 & 256) != 0) {
            cachePolicy3 = c9932m.f17859i;
        }
        if ((i9 & 512) != 0) {
            c5304c = c9932m.f17860j;
        }
        CachePolicy cachePolicy4 = cachePolicy3;
        C5304c c5304c2 = c5304c;
        CachePolicy cachePolicy5 = cachePolicy;
        CachePolicy cachePolicy6 = cachePolicy2;
        String str2 = str;
        FileSystem fileSystem2 = fileSystem;
        return c9932m.m17107a(context, c9975e, scale, precision, str2, fileSystem2, cachePolicy5, cachePolicy6, cachePolicy4, c5304c2);
    }

    /* renamed from: a */
    public final C9932m m17107a(Context context, C9975e c9975e, Scale scale, Precision precision, String str, FileSystem fileSystem, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, C5304c c5304c) {
        return new C9932m(context, c9975e, scale, precision, str, fileSystem, cachePolicy, cachePolicy2, cachePolicy3, c5304c);
    }

    /* renamed from: c */
    public final Context m17108c() {
        return this.f17851a;
    }

    /* renamed from: d */
    public final String m17109d() {
        return this.f17855e;
    }

    /* renamed from: e */
    public final CachePolicy m17110e() {
        return this.f17858h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9932m)) {
            return false;
        }
        C9932m c9932m = (C9932m) obj;
        return Intrinsics.areEqual(this.f17851a, c9932m.f17851a) && Intrinsics.areEqual(this.f17852b, c9932m.f17852b) && this.f17853c == c9932m.f17853c && this.f17854d == c9932m.f17854d && Intrinsics.areEqual(this.f17855e, c9932m.f17855e) && Intrinsics.areEqual(this.f17856f, c9932m.f17856f) && this.f17857g == c9932m.f17857g && this.f17858h == c9932m.f17858h && this.f17859i == c9932m.f17859i && Intrinsics.areEqual(this.f17860j, c9932m.f17860j);
    }

    /* renamed from: f */
    public final C5304c m17111f() {
        return this.f17860j;
    }

    /* renamed from: g */
    public final FileSystem m17112g() {
        return this.f17856f;
    }

    /* renamed from: h */
    public final CachePolicy m17113h() {
        return this.f17859i;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f17851a.hashCode() * 31) + this.f17852b.hashCode()) * 31) + this.f17853c.hashCode()) * 31) + this.f17854d.hashCode()) * 31;
        String str = this.f17855e;
        return ((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f17856f.hashCode()) * 31) + this.f17857g.hashCode()) * 31) + this.f17858h.hashCode()) * 31) + this.f17859i.hashCode()) * 31) + this.f17860j.hashCode();
    }

    /* renamed from: i */
    public final Precision m17114i() {
        return this.f17854d;
    }

    /* renamed from: j */
    public final Scale m17115j() {
        return this.f17853c;
    }

    /* renamed from: k */
    public final C9975e m17116k() {
        return this.f17852b;
    }

    public String toString() {
        return "Options(context=" + this.f17851a + ", size=" + this.f17852b + ", scale=" + this.f17853c + ", precision=" + this.f17854d + ", diskCacheKey=" + this.f17855e + ", fileSystem=" + this.f17856f + ", memoryCachePolicy=" + this.f17857g + ", diskCachePolicy=" + this.f17858h + ", networkCachePolicy=" + this.f17859i + ", extras=" + this.f17860j + ')';
    }
}
