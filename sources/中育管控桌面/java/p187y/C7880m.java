package p187y;

import android.content.Context;
import coil3.C4550c;
import coil3.request.CachePolicy;
import coil3.size.Precision;
import coil3.size.Scale;
import kotlin.jvm.internal.Intrinsics;
import okio.FileSystem;
import p194z.C7923e;

/* renamed from: y.m */
/* loaded from: classes3.dex */
public final class C7880m {

    /* renamed from: a */
    public final Context f10590a;

    /* renamed from: b */
    public final C7923e f10591b;

    /* renamed from: c */
    public final Scale f10592c;

    /* renamed from: d */
    public final Precision f10593d;

    /* renamed from: e */
    public final String f10594e;

    /* renamed from: f */
    public final FileSystem f10595f;

    /* renamed from: g */
    public final CachePolicy f10596g;

    /* renamed from: h */
    public final CachePolicy f10597h;

    /* renamed from: i */
    public final CachePolicy f10598i;

    /* renamed from: j */
    public final C4550c f10599j;

    public C7880m(Context context, C7923e c7923e, Scale scale, Precision precision, String str, FileSystem fileSystem, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, C4550c c4550c) {
        this.f10590a = context;
        this.f10591b = c7923e;
        this.f10592c = scale;
        this.f10593d = precision;
        this.f10594e = str;
        this.f10595f = fileSystem;
        this.f10596g = cachePolicy;
        this.f10597h = cachePolicy2;
        this.f10598i = cachePolicy3;
        this.f10599j = c4550c;
    }

    /* renamed from: b */
    public static /* synthetic */ C7880m m9659b(C7880m c7880m, Context context, C7923e c7923e, Scale scale, Precision precision, String str, FileSystem fileSystem, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, C4550c c4550c, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            context = c7880m.f10590a;
        }
        if ((i6 & 2) != 0) {
            c7923e = c7880m.f10591b;
        }
        if ((i6 & 4) != 0) {
            scale = c7880m.f10592c;
        }
        if ((i6 & 8) != 0) {
            precision = c7880m.f10593d;
        }
        if ((i6 & 16) != 0) {
            str = c7880m.f10594e;
        }
        if ((i6 & 32) != 0) {
            fileSystem = c7880m.f10595f;
        }
        if ((i6 & 64) != 0) {
            cachePolicy = c7880m.f10596g;
        }
        if ((i6 & 128) != 0) {
            cachePolicy2 = c7880m.f10597h;
        }
        if ((i6 & 256) != 0) {
            cachePolicy3 = c7880m.f10598i;
        }
        if ((i6 & 512) != 0) {
            c4550c = c7880m.f10599j;
        }
        CachePolicy cachePolicy4 = cachePolicy3;
        C4550c c4550c2 = c4550c;
        CachePolicy cachePolicy5 = cachePolicy;
        CachePolicy cachePolicy6 = cachePolicy2;
        String str2 = str;
        FileSystem fileSystem2 = fileSystem;
        return c7880m.m9660a(context, c7923e, scale, precision, str2, fileSystem2, cachePolicy5, cachePolicy6, cachePolicy4, c4550c2);
    }

    /* renamed from: a */
    public final C7880m m9660a(Context context, C7923e c7923e, Scale scale, Precision precision, String str, FileSystem fileSystem, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, C4550c c4550c) {
        return new C7880m(context, c7923e, scale, precision, str, fileSystem, cachePolicy, cachePolicy2, cachePolicy3, c4550c);
    }

    /* renamed from: c */
    public final Context m9661c() {
        return this.f10590a;
    }

    /* renamed from: d */
    public final String m9662d() {
        return this.f10594e;
    }

    /* renamed from: e */
    public final CachePolicy m9663e() {
        return this.f10597h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7880m)) {
            return false;
        }
        C7880m c7880m = (C7880m) obj;
        return Intrinsics.areEqual(this.f10590a, c7880m.f10590a) && Intrinsics.areEqual(this.f10591b, c7880m.f10591b) && this.f10592c == c7880m.f10592c && this.f10593d == c7880m.f10593d && Intrinsics.areEqual(this.f10594e, c7880m.f10594e) && Intrinsics.areEqual(this.f10595f, c7880m.f10595f) && this.f10596g == c7880m.f10596g && this.f10597h == c7880m.f10597h && this.f10598i == c7880m.f10598i && Intrinsics.areEqual(this.f10599j, c7880m.f10599j);
    }

    /* renamed from: f */
    public final C4550c m9664f() {
        return this.f10599j;
    }

    /* renamed from: g */
    public final FileSystem m9665g() {
        return this.f10595f;
    }

    /* renamed from: h */
    public final CachePolicy m9666h() {
        return this.f10598i;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f10590a.hashCode() * 31) + this.f10591b.hashCode()) * 31) + this.f10592c.hashCode()) * 31) + this.f10593d.hashCode()) * 31;
        String str = this.f10594e;
        return ((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f10595f.hashCode()) * 31) + this.f10596g.hashCode()) * 31) + this.f10597h.hashCode()) * 31) + this.f10598i.hashCode()) * 31) + this.f10599j.hashCode();
    }

    /* renamed from: i */
    public final Precision m9667i() {
        return this.f10593d;
    }

    /* renamed from: j */
    public final Scale m9668j() {
        return this.f10592c;
    }

    /* renamed from: k */
    public final C7923e m9669k() {
        return this.f10591b;
    }

    public String toString() {
        return "Options(context=" + this.f10590a + ", size=" + this.f10591b + ", scale=" + this.f10592c + ", precision=" + this.f10593d + ", diskCacheKey=" + this.f10594e + ", fileSystem=" + this.f10595f + ", memoryCachePolicy=" + this.f10596g + ", diskCachePolicy=" + this.f10597h + ", networkCachePolicy=" + this.f10598i + ", extras=" + this.f10599j + ')';
    }
}
