package p380w;

import android.content.Context;
import coil3.C5454c;
import coil3.decode.InterfaceC5461a;
import coil3.request.CachePolicy;
import coil3.size.Precision;
import coil3.size.Scale;
import coil3.util.AbstractC5490c;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC9925a;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9962d0;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import okio.FileSystem;
import p001a0.AbstractC0005b;
import p001a0.AbstractC0007d;
import p001a0.AbstractC0014k;
import p181hd.InterfaceC9540l;
import p212k.InterfaceC9756j;
import p312r.InterfaceC10825d;
import p380w.C11627g;
import p396x.InterfaceC11751g;
import p412y.InterfaceC11879a;

/* renamed from: w.g */
/* loaded from: classes3.dex */
public final class C11627g {

    /* renamed from: a */
    public final Context f27531a;

    /* renamed from: b */
    public final Object f27532b;

    /* renamed from: c */
    public final InterfaceC11879a f27533c;

    /* renamed from: d */
    public final d f27534d;

    /* renamed from: e */
    public final String f27535e;

    /* renamed from: f */
    public final Map f27536f;

    /* renamed from: g */
    public final String f27537g;

    /* renamed from: h */
    public final FileSystem f27538h;

    /* renamed from: i */
    public final Pair f27539i;

    /* renamed from: j */
    public final InterfaceC5461a.a f27540j;

    /* renamed from: k */
    public final InterfaceC9945d f27541k;

    /* renamed from: l */
    public final InterfaceC9945d f27542l;

    /* renamed from: m */
    public final InterfaceC9945d f27543m;

    /* renamed from: n */
    public final CachePolicy f27544n;

    /* renamed from: o */
    public final CachePolicy f27545o;

    /* renamed from: p */
    public final CachePolicy f27546p;

    /* renamed from: q */
    public final InterfaceC10825d.b f27547q;

    /* renamed from: r */
    public final InterfaceC9540l f27548r;

    /* renamed from: s */
    public final InterfaceC9540l f27549s;

    /* renamed from: t */
    public final InterfaceC9540l f27550t;

    /* renamed from: u */
    public final InterfaceC11751g f27551u;

    /* renamed from: v */
    public final Scale f27552v;

    /* renamed from: w */
    public final Precision f27553w;

    /* renamed from: x */
    public final C5454c f27554x;

    /* renamed from: y */
    public final c f27555y;

    /* renamed from: z */
    public final b f27556z;

    /* renamed from: w.g$c */
    public static final class c {

        /* renamed from: a */
        public final FileSystem f27599a;

        /* renamed from: b */
        public final InterfaceC9945d f27600b;

        /* renamed from: c */
        public final InterfaceC9945d f27601c;

        /* renamed from: d */
        public final InterfaceC9945d f27602d;

        /* renamed from: e */
        public final CachePolicy f27603e;

        /* renamed from: f */
        public final CachePolicy f27604f;

        /* renamed from: g */
        public final CachePolicy f27605g;

        /* renamed from: h */
        public final InterfaceC9540l f27606h;

        /* renamed from: i */
        public final InterfaceC9540l f27607i;

        /* renamed from: j */
        public final InterfaceC9540l f27608j;

        /* renamed from: k */
        public final InterfaceC11751g f27609k;

        /* renamed from: l */
        public final Scale f27610l;

        /* renamed from: m */
        public final Precision f27611m;

        public c(FileSystem fileSystem, InterfaceC9945d interfaceC9945d, InterfaceC9945d interfaceC9945d2, InterfaceC9945d interfaceC9945d3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC11751g interfaceC11751g, Scale scale, Precision precision) {
            this.f27599a = fileSystem;
            this.f27600b = interfaceC9945d;
            this.f27601c = interfaceC9945d2;
            this.f27602d = interfaceC9945d3;
            this.f27603e = cachePolicy;
            this.f27604f = cachePolicy2;
            this.f27605g = cachePolicy3;
            this.f27606h = interfaceC9540l;
            this.f27607i = interfaceC9540l2;
            this.f27608j = interfaceC9540l3;
            this.f27609k = interfaceC11751g;
            this.f27610l = scale;
            this.f27611m = precision;
        }

        /* renamed from: a */
        public final InterfaceC9945d m25706a() {
            return this.f27602d;
        }

        /* renamed from: b */
        public final CachePolicy m25707b() {
            return this.f27604f;
        }

        /* renamed from: c */
        public final InterfaceC9540l m25708c() {
            return this.f27607i;
        }

        /* renamed from: d */
        public final InterfaceC9540l m25709d() {
            return this.f27608j;
        }

        /* renamed from: e */
        public final InterfaceC9945d m25710e() {
            return this.f27601c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC9979u.m20289b(this.f27599a, cVar.f27599a) && AbstractC9979u.m20289b(this.f27600b, cVar.f27600b) && AbstractC9979u.m20289b(this.f27601c, cVar.f27601c) && AbstractC9979u.m20289b(this.f27602d, cVar.f27602d) && this.f27603e == cVar.f27603e && this.f27604f == cVar.f27604f && this.f27605g == cVar.f27605g && AbstractC9979u.m20289b(this.f27606h, cVar.f27606h) && AbstractC9979u.m20289b(this.f27607i, cVar.f27607i) && AbstractC9979u.m20289b(this.f27608j, cVar.f27608j) && AbstractC9979u.m20289b(this.f27609k, cVar.f27609k) && this.f27610l == cVar.f27610l && this.f27611m == cVar.f27611m;
        }

        /* renamed from: f */
        public final FileSystem m25711f() {
            return this.f27599a;
        }

        /* renamed from: g */
        public final InterfaceC9945d m25712g() {
            return this.f27600b;
        }

        /* renamed from: h */
        public final CachePolicy m25713h() {
            return this.f27603e;
        }

        public int hashCode() {
            FileSystem fileSystem = this.f27599a;
            int iHashCode = (fileSystem == null ? 0 : fileSystem.hashCode()) * 31;
            InterfaceC9945d interfaceC9945d = this.f27600b;
            int iHashCode2 = (iHashCode + (interfaceC9945d == null ? 0 : interfaceC9945d.hashCode())) * 31;
            InterfaceC9945d interfaceC9945d2 = this.f27601c;
            int iHashCode3 = (iHashCode2 + (interfaceC9945d2 == null ? 0 : interfaceC9945d2.hashCode())) * 31;
            InterfaceC9945d interfaceC9945d3 = this.f27602d;
            int iHashCode4 = (iHashCode3 + (interfaceC9945d3 == null ? 0 : interfaceC9945d3.hashCode())) * 31;
            CachePolicy cachePolicy = this.f27603e;
            int iHashCode5 = (iHashCode4 + (cachePolicy == null ? 0 : cachePolicy.hashCode())) * 31;
            CachePolicy cachePolicy2 = this.f27604f;
            int iHashCode6 = (iHashCode5 + (cachePolicy2 == null ? 0 : cachePolicy2.hashCode())) * 31;
            CachePolicy cachePolicy3 = this.f27605g;
            int iHashCode7 = (iHashCode6 + (cachePolicy3 == null ? 0 : cachePolicy3.hashCode())) * 31;
            InterfaceC9540l interfaceC9540l = this.f27606h;
            int iHashCode8 = (iHashCode7 + (interfaceC9540l == null ? 0 : interfaceC9540l.hashCode())) * 31;
            InterfaceC9540l interfaceC9540l2 = this.f27607i;
            int iHashCode9 = (iHashCode8 + (interfaceC9540l2 == null ? 0 : interfaceC9540l2.hashCode())) * 31;
            InterfaceC9540l interfaceC9540l3 = this.f27608j;
            int iHashCode10 = (iHashCode9 + (interfaceC9540l3 == null ? 0 : interfaceC9540l3.hashCode())) * 31;
            InterfaceC11751g interfaceC11751g = this.f27609k;
            int iHashCode11 = (iHashCode10 + (interfaceC11751g == null ? 0 : interfaceC11751g.hashCode())) * 31;
            Scale scale = this.f27610l;
            int iHashCode12 = (iHashCode11 + (scale == null ? 0 : scale.hashCode())) * 31;
            Precision precision = this.f27611m;
            return iHashCode12 + (precision != null ? precision.hashCode() : 0);
        }

        /* renamed from: i */
        public final CachePolicy m25714i() {
            return this.f27605g;
        }

        /* renamed from: j */
        public final InterfaceC9540l m25715j() {
            return this.f27606h;
        }

        /* renamed from: k */
        public final Precision m25716k() {
            return this.f27611m;
        }

        /* renamed from: l */
        public final Scale m25717l() {
            return this.f27610l;
        }

        /* renamed from: m */
        public final InterfaceC11751g m25718m() {
            return this.f27609k;
        }

        public String toString() {
            return "Defined(fileSystem=" + this.f27599a + ", interceptorCoroutineContext=" + this.f27600b + ", fetcherCoroutineContext=" + this.f27601c + ", decoderCoroutineContext=" + this.f27602d + ", memoryCachePolicy=" + this.f27603e + ", diskCachePolicy=" + this.f27604f + ", networkCachePolicy=" + this.f27605g + ", placeholderFactory=" + this.f27606h + ", errorFactory=" + this.f27607i + ", fallbackFactory=" + this.f27608j + ", sizeResolver=" + this.f27609k + ", scale=" + this.f27610l + ", precision=" + this.f27611m + ')';
        }
    }

    /* renamed from: w.g$d */
    public interface d {
        /* renamed from: a */
        void mo3025a(C11627g c11627g);

        /* renamed from: b */
        void mo3026b(C11627g c11627g);

        /* renamed from: c */
        void mo3027c(C11627g c11627g, C11638r c11638r);

        /* renamed from: d */
        void mo3028d(C11627g c11627g, C11624d c11624d);
    }

    public /* synthetic */ C11627g(Context context, Object obj, InterfaceC11879a interfaceC11879a, d dVar, String str, Map map, String str2, FileSystem fileSystem, Pair pair, InterfaceC5461a.a aVar, InterfaceC9945d interfaceC9945d, InterfaceC9945d interfaceC9945d2, InterfaceC9945d interfaceC9945d3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, InterfaceC10825d.b bVar, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC11751g interfaceC11751g, Scale scale, Precision precision, C5454c c5454c, c cVar, b bVar2, AbstractC9972n abstractC9972n) {
        this(context, obj, interfaceC11879a, dVar, str, map, str2, fileSystem, pair, aVar, interfaceC9945d, interfaceC9945d2, interfaceC9945d3, cachePolicy, cachePolicy2, cachePolicy3, bVar, interfaceC9540l, interfaceC9540l2, interfaceC9540l3, interfaceC11751g, scale, precision, c5454c, cVar, bVar2);
    }

    /* renamed from: A */
    public static /* synthetic */ a m25643A(C11627g c11627g, Context context, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            context = c11627g.f27531a;
        }
        return c11627g.m25670z(context);
    }

    /* renamed from: B */
    public final InterfaceC9756j m25644B() {
        InterfaceC9756j interfaceC9756j = (InterfaceC9756j) this.f27548r.invoke(this);
        return interfaceC9756j == null ? (InterfaceC9756j) this.f27556z.m25702m().invoke(this) : interfaceC9756j;
    }

    /* renamed from: a */
    public final InterfaceC9756j m25645a() {
        InterfaceC9756j interfaceC9756j = (InterfaceC9756j) this.f27549s.invoke(this);
        return interfaceC9756j == null ? (InterfaceC9756j) this.f27556z.m25694e().invoke(this) : interfaceC9756j;
    }

    /* renamed from: b */
    public final InterfaceC9756j m25646b() {
        InterfaceC9756j interfaceC9756j = (InterfaceC9756j) this.f27550t.invoke(this);
        return interfaceC9756j == null ? (InterfaceC9756j) this.f27556z.m25696g().invoke(this) : interfaceC9756j;
    }

    /* renamed from: c */
    public final Context m25647c() {
        return this.f27531a;
    }

    /* renamed from: d */
    public final Object m25648d() {
        return this.f27532b;
    }

    /* renamed from: e */
    public final InterfaceC9945d m25649e() {
        return this.f27543m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11627g)) {
            return false;
        }
        C11627g c11627g = (C11627g) obj;
        return AbstractC9979u.m20289b(this.f27531a, c11627g.f27531a) && AbstractC9979u.m20289b(this.f27532b, c11627g.f27532b) && AbstractC9979u.m20289b(this.f27533c, c11627g.f27533c) && AbstractC9979u.m20289b(this.f27534d, c11627g.f27534d) && AbstractC9979u.m20289b(this.f27535e, c11627g.f27535e) && AbstractC9979u.m20289b(this.f27536f, c11627g.f27536f) && AbstractC9979u.m20289b(this.f27537g, c11627g.f27537g) && AbstractC9979u.m20289b(this.f27538h, c11627g.f27538h) && AbstractC9979u.m20289b(this.f27539i, c11627g.f27539i) && AbstractC9979u.m20289b(this.f27540j, c11627g.f27540j) && AbstractC9979u.m20289b(this.f27541k, c11627g.f27541k) && AbstractC9979u.m20289b(this.f27542l, c11627g.f27542l) && AbstractC9979u.m20289b(this.f27543m, c11627g.f27543m) && this.f27544n == c11627g.f27544n && this.f27545o == c11627g.f27545o && this.f27546p == c11627g.f27546p && AbstractC9979u.m20289b(this.f27547q, c11627g.f27547q) && AbstractC9979u.m20289b(this.f27548r, c11627g.f27548r) && AbstractC9979u.m20289b(this.f27549s, c11627g.f27549s) && AbstractC9979u.m20289b(this.f27550t, c11627g.f27550t) && AbstractC9979u.m20289b(this.f27551u, c11627g.f27551u) && this.f27552v == c11627g.f27552v && this.f27553w == c11627g.f27553w && AbstractC9979u.m20289b(this.f27554x, c11627g.f27554x) && AbstractC9979u.m20289b(this.f27555y, c11627g.f27555y) && AbstractC9979u.m20289b(this.f27556z, c11627g.f27556z);
    }

    /* renamed from: f */
    public final InterfaceC5461a.a m25650f() {
        return this.f27540j;
    }

    /* renamed from: g */
    public final b m25651g() {
        return this.f27556z;
    }

    /* renamed from: h */
    public final c m25652h() {
        return this.f27555y;
    }

    public int hashCode() {
        int iHashCode = ((this.f27531a.hashCode() * 31) + this.f27532b.hashCode()) * 31;
        InterfaceC11879a interfaceC11879a = this.f27533c;
        int iHashCode2 = (iHashCode + (interfaceC11879a == null ? 0 : interfaceC11879a.hashCode())) * 31;
        d dVar = this.f27534d;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.f27535e;
        int iHashCode4 = (((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.f27536f.hashCode()) * 31;
        String str2 = this.f27537g;
        int iHashCode5 = (((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f27538h.hashCode()) * 31;
        Pair pair = this.f27539i;
        int iHashCode6 = (iHashCode5 + (pair == null ? 0 : pair.hashCode())) * 31;
        InterfaceC5461a.a aVar = this.f27540j;
        int iHashCode7 = (((((((((((((iHashCode6 + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.f27541k.hashCode()) * 31) + this.f27542l.hashCode()) * 31) + this.f27543m.hashCode()) * 31) + this.f27544n.hashCode()) * 31) + this.f27545o.hashCode()) * 31) + this.f27546p.hashCode()) * 31;
        InterfaceC10825d.b bVar = this.f27547q;
        return ((((((((((((((((((iHashCode7 + (bVar != null ? bVar.hashCode() : 0)) * 31) + this.f27548r.hashCode()) * 31) + this.f27549s.hashCode()) * 31) + this.f27550t.hashCode()) * 31) + this.f27551u.hashCode()) * 31) + this.f27552v.hashCode()) * 31) + this.f27553w.hashCode()) * 31) + this.f27554x.hashCode()) * 31) + this.f27555y.hashCode()) * 31) + this.f27556z.hashCode();
    }

    /* renamed from: i */
    public final String m25653i() {
        return this.f27537g;
    }

    /* renamed from: j */
    public final CachePolicy m25654j() {
        return this.f27545o;
    }

    /* renamed from: k */
    public final C5454c m25655k() {
        return this.f27554x;
    }

    /* renamed from: l */
    public final InterfaceC9945d m25656l() {
        return this.f27542l;
    }

    /* renamed from: m */
    public final Pair m25657m() {
        return this.f27539i;
    }

    /* renamed from: n */
    public final FileSystem m25658n() {
        return this.f27538h;
    }

    /* renamed from: o */
    public final InterfaceC9945d m25659o() {
        return this.f27541k;
    }

    /* renamed from: p */
    public final d m25660p() {
        return this.f27534d;
    }

    /* renamed from: q */
    public final String m25661q() {
        return this.f27535e;
    }

    /* renamed from: r */
    public final Map m25662r() {
        return this.f27536f;
    }

    /* renamed from: s */
    public final CachePolicy m25663s() {
        return this.f27544n;
    }

    /* renamed from: t */
    public final CachePolicy m25664t() {
        return this.f27546p;
    }

    public String toString() {
        return "ImageRequest(context=" + this.f27531a + ", data=" + this.f27532b + ", target=" + this.f27533c + ", listener=" + this.f27534d + ", memoryCacheKey=" + this.f27535e + ", memoryCacheKeyExtras=" + this.f27536f + ", diskCacheKey=" + this.f27537g + ", fileSystem=" + this.f27538h + ", fetcherFactory=" + this.f27539i + ", decoderFactory=" + this.f27540j + ", interceptorCoroutineContext=" + this.f27541k + ", fetcherCoroutineContext=" + this.f27542l + ", decoderCoroutineContext=" + this.f27543m + ", memoryCachePolicy=" + this.f27544n + ", diskCachePolicy=" + this.f27545o + ", networkCachePolicy=" + this.f27546p + ", placeholderMemoryCacheKey=" + this.f27547q + ", placeholderFactory=" + this.f27548r + ", errorFactory=" + this.f27549s + ", fallbackFactory=" + this.f27550t + ", sizeResolver=" + this.f27551u + ", scale=" + this.f27552v + ", precision=" + this.f27553w + ", extras=" + this.f27554x + ", defined=" + this.f27555y + ", defaults=" + this.f27556z + ')';
    }

    /* renamed from: u */
    public final InterfaceC10825d.b m25665u() {
        return this.f27547q;
    }

    /* renamed from: v */
    public final Precision m25666v() {
        return this.f27553w;
    }

    /* renamed from: w */
    public final Scale m25667w() {
        return this.f27552v;
    }

    /* renamed from: x */
    public final InterfaceC11751g m25668x() {
        return this.f27551u;
    }

    /* renamed from: y */
    public final InterfaceC11879a m25669y() {
        return this.f27533c;
    }

    /* renamed from: z */
    public final a m25670z(Context context) {
        return new a(this, context);
    }

    public C11627g(Context context, Object obj, InterfaceC11879a interfaceC11879a, d dVar, String str, Map map, String str2, FileSystem fileSystem, Pair pair, InterfaceC5461a.a aVar, InterfaceC9945d interfaceC9945d, InterfaceC9945d interfaceC9945d2, InterfaceC9945d interfaceC9945d3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, InterfaceC10825d.b bVar, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC11751g interfaceC11751g, Scale scale, Precision precision, C5454c c5454c, c cVar, b bVar2) {
        this.f27531a = context;
        this.f27532b = obj;
        this.f27533c = interfaceC11879a;
        this.f27534d = dVar;
        this.f27535e = str;
        this.f27536f = map;
        this.f27537g = str2;
        this.f27538h = fileSystem;
        this.f27539i = pair;
        this.f27540j = aVar;
        this.f27541k = interfaceC9945d;
        this.f27542l = interfaceC9945d2;
        this.f27543m = interfaceC9945d3;
        this.f27544n = cachePolicy;
        this.f27545o = cachePolicy2;
        this.f27546p = cachePolicy3;
        this.f27547q = bVar;
        this.f27548r = interfaceC9540l;
        this.f27549s = interfaceC9540l2;
        this.f27550t = interfaceC9540l3;
        this.f27551u = interfaceC11751g;
        this.f27552v = scale;
        this.f27553w = precision;
        this.f27554x = c5454c;
        this.f27555y = cVar;
        this.f27556z = bVar2;
    }

    /* renamed from: w.g$b */
    public static final class b {

        /* renamed from: o */
        public static final a f27583o = new a(null);

        /* renamed from: p */
        public static final b f27584p = new b(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);

        /* renamed from: a */
        public final FileSystem f27585a;

        /* renamed from: b */
        public final InterfaceC9945d f27586b;

        /* renamed from: c */
        public final InterfaceC9945d f27587c;

        /* renamed from: d */
        public final InterfaceC9945d f27588d;

        /* renamed from: e */
        public final CachePolicy f27589e;

        /* renamed from: f */
        public final CachePolicy f27590f;

        /* renamed from: g */
        public final CachePolicy f27591g;

        /* renamed from: h */
        public final InterfaceC9540l f27592h;

        /* renamed from: i */
        public final InterfaceC9540l f27593i;

        /* renamed from: j */
        public final InterfaceC9540l f27594j;

        /* renamed from: k */
        public final InterfaceC11751g f27595k;

        /* renamed from: l */
        public final Scale f27596l;

        /* renamed from: m */
        public final Precision f27597m;

        /* renamed from: n */
        public final C5454c f27598n;

        /* renamed from: w.g$b$a */
        public static final class a {
            public /* synthetic */ a(AbstractC9972n abstractC9972n) {
                this();
            }

            public a() {
            }
        }

        public b(FileSystem fileSystem, InterfaceC9945d interfaceC9945d, InterfaceC9945d interfaceC9945d2, InterfaceC9945d interfaceC9945d3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC11751g interfaceC11751g, Scale scale, Precision precision, C5454c c5454c) {
            this.f27585a = fileSystem;
            this.f27586b = interfaceC9945d;
            this.f27587c = interfaceC9945d2;
            this.f27588d = interfaceC9945d3;
            this.f27589e = cachePolicy;
            this.f27590f = cachePolicy2;
            this.f27591g = cachePolicy3;
            this.f27592h = interfaceC9540l;
            this.f27593i = interfaceC9540l2;
            this.f27594j = interfaceC9540l3;
            this.f27595k = interfaceC11751g;
            this.f27596l = scale;
            this.f27597m = precision;
            this.f27598n = c5454c;
        }

        /* renamed from: a */
        public final b m25691a(FileSystem fileSystem, InterfaceC9945d interfaceC9945d, InterfaceC9945d interfaceC9945d2, InterfaceC9945d interfaceC9945d3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC11751g interfaceC11751g, Scale scale, Precision precision, C5454c c5454c) {
            return new b(fileSystem, interfaceC9945d, interfaceC9945d2, interfaceC9945d3, cachePolicy, cachePolicy2, cachePolicy3, interfaceC9540l, interfaceC9540l2, interfaceC9540l3, interfaceC11751g, scale, precision, c5454c);
        }

        /* renamed from: c */
        public final InterfaceC9945d m25692c() {
            return this.f27588d;
        }

        /* renamed from: d */
        public final CachePolicy m25693d() {
            return this.f27590f;
        }

        /* renamed from: e */
        public final InterfaceC9540l m25694e() {
            return this.f27593i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC9979u.m20289b(this.f27585a, bVar.f27585a) && AbstractC9979u.m20289b(this.f27586b, bVar.f27586b) && AbstractC9979u.m20289b(this.f27587c, bVar.f27587c) && AbstractC9979u.m20289b(this.f27588d, bVar.f27588d) && this.f27589e == bVar.f27589e && this.f27590f == bVar.f27590f && this.f27591g == bVar.f27591g && AbstractC9979u.m20289b(this.f27592h, bVar.f27592h) && AbstractC9979u.m20289b(this.f27593i, bVar.f27593i) && AbstractC9979u.m20289b(this.f27594j, bVar.f27594j) && AbstractC9979u.m20289b(this.f27595k, bVar.f27595k) && this.f27596l == bVar.f27596l && this.f27597m == bVar.f27597m && AbstractC9979u.m20289b(this.f27598n, bVar.f27598n);
        }

        /* renamed from: f */
        public final C5454c m25695f() {
            return this.f27598n;
        }

        /* renamed from: g */
        public final InterfaceC9540l m25696g() {
            return this.f27594j;
        }

        /* renamed from: h */
        public final InterfaceC9945d m25697h() {
            return this.f27587c;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((this.f27585a.hashCode() * 31) + this.f27586b.hashCode()) * 31) + this.f27587c.hashCode()) * 31) + this.f27588d.hashCode()) * 31) + this.f27589e.hashCode()) * 31) + this.f27590f.hashCode()) * 31) + this.f27591g.hashCode()) * 31) + this.f27592h.hashCode()) * 31) + this.f27593i.hashCode()) * 31) + this.f27594j.hashCode()) * 31) + this.f27595k.hashCode()) * 31) + this.f27596l.hashCode()) * 31) + this.f27597m.hashCode()) * 31) + this.f27598n.hashCode();
        }

        /* renamed from: i */
        public final FileSystem m25698i() {
            return this.f27585a;
        }

        /* renamed from: j */
        public final InterfaceC9945d m25699j() {
            return this.f27586b;
        }

        /* renamed from: k */
        public final CachePolicy m25700k() {
            return this.f27589e;
        }

        /* renamed from: l */
        public final CachePolicy m25701l() {
            return this.f27591g;
        }

        /* renamed from: m */
        public final InterfaceC9540l m25702m() {
            return this.f27592h;
        }

        /* renamed from: n */
        public final Precision m25703n() {
            return this.f27597m;
        }

        /* renamed from: o */
        public final Scale m25704o() {
            return this.f27596l;
        }

        /* renamed from: p */
        public final InterfaceC11751g m25705p() {
            return this.f27595k;
        }

        public String toString() {
            return "Defaults(fileSystem=" + this.f27585a + ", interceptorCoroutineContext=" + this.f27586b + ", fetcherCoroutineContext=" + this.f27587c + ", decoderCoroutineContext=" + this.f27588d + ", memoryCachePolicy=" + this.f27589e + ", diskCachePolicy=" + this.f27590f + ", networkCachePolicy=" + this.f27591g + ", placeholderFactory=" + this.f27592h + ", errorFactory=" + this.f27593i + ", fallbackFactory=" + this.f27594j + ", sizeResolver=" + this.f27595k + ", scale=" + this.f27596l + ", precision=" + this.f27597m + ", extras=" + this.f27598n + ')';
        }

        public /* synthetic */ b(FileSystem fileSystem, InterfaceC9945d interfaceC9945d, InterfaceC9945d interfaceC9945d2, InterfaceC9945d interfaceC9945d3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9540l interfaceC9540l3, InterfaceC11751g interfaceC11751g, Scale scale, Precision precision, C5454c c5454c, int i10, AbstractC9972n abstractC9972n) {
            this((i10 & 1) != 0 ? AbstractC0014k.m28a() : fileSystem, (i10 & 2) != 0 ? EmptyCoroutineContext.f23351c : interfaceC9945d, (i10 & 4) != 0 ? AbstractC0007d.m19a() : interfaceC9945d2, (i10 & 8) != 0 ? AbstractC0007d.m19a() : interfaceC9945d3, (i10 & 16) != 0 ? CachePolicy.f3884e : cachePolicy, (i10 & 32) != 0 ? CachePolicy.f3884e : cachePolicy2, (i10 & 64) != 0 ? CachePolicy.f3884e : cachePolicy3, (i10 & 128) != 0 ? AbstractC5490c.m3311k() : interfaceC9540l, (i10 & 256) != 0 ? AbstractC5490c.m3311k() : interfaceC9540l2, (i10 & 512) != 0 ? AbstractC5490c.m3311k() : interfaceC9540l3, (i10 & 1024) != 0 ? InterfaceC11751g.f27927b : interfaceC11751g, (i10 & 2048) != 0 ? Scale.f3911d : scale, (i10 & 4096) != 0 ? Precision.f3906c : precision, (i10 & 8192) != 0 ? C5454c.f3591c : c5454c);
        }
    }

    /* renamed from: w.g$a */
    public static final class a {

        /* renamed from: a */
        public final Context f27557a;

        /* renamed from: b */
        public b f27558b;

        /* renamed from: c */
        public Object f27559c;

        /* renamed from: d */
        public InterfaceC11879a f27560d;

        /* renamed from: e */
        public d f27561e;

        /* renamed from: f */
        public String f27562f;

        /* renamed from: g */
        public boolean f27563g;

        /* renamed from: h */
        public Object f27564h;

        /* renamed from: i */
        public String f27565i;

        /* renamed from: j */
        public FileSystem f27566j;

        /* renamed from: k */
        public Pair f27567k;

        /* renamed from: l */
        public InterfaceC5461a.a f27568l;

        /* renamed from: m */
        public InterfaceC9945d f27569m;

        /* renamed from: n */
        public InterfaceC9945d f27570n;

        /* renamed from: o */
        public InterfaceC9945d f27571o;

        /* renamed from: p */
        public CachePolicy f27572p;

        /* renamed from: q */
        public CachePolicy f27573q;

        /* renamed from: r */
        public CachePolicy f27574r;

        /* renamed from: s */
        public InterfaceC10825d.b f27575s;

        /* renamed from: t */
        public InterfaceC9540l f27576t;

        /* renamed from: u */
        public InterfaceC9540l f27577u;

        /* renamed from: v */
        public InterfaceC9540l f27578v;

        /* renamed from: w */
        public InterfaceC11751g f27579w;

        /* renamed from: x */
        public Scale f27580x;

        /* renamed from: y */
        public Precision f27581y;

        /* renamed from: z */
        public Object f27582z;

        public a(Context context) {
            this.f27557a = context;
            this.f27558b = b.f27584p;
            this.f27559c = null;
            this.f27560d = null;
            this.f27561e = null;
            this.f27562f = null;
            this.f27564h = AbstractC9925a.m20088h();
            this.f27565i = null;
            this.f27566j = null;
            this.f27567k = null;
            this.f27568l = null;
            this.f27569m = null;
            this.f27570n = null;
            this.f27571o = null;
            this.f27572p = null;
            this.f27573q = null;
            this.f27574r = null;
            this.f27575s = null;
            this.f27576t = AbstractC5490c.m3311k();
            this.f27577u = AbstractC5490c.m3311k();
            this.f27578v = AbstractC5490c.m3311k();
            this.f27579w = null;
            this.f27580x = null;
            this.f27581y = null;
            this.f27582z = C5454c.f3591c;
        }

        /* renamed from: c */
        public final C11627g m25675c() {
            Map mapM11d;
            C5454c c5454cM3050a;
            Context context = this.f27557a;
            Object obj = this.f27559c;
            if (obj == null) {
                obj = C11632l.f27624a;
            }
            Object obj2 = obj;
            InterfaceC11879a interfaceC11879a = this.f27560d;
            d dVar = this.f27561e;
            String str = this.f27562f;
            Object obj3 = this.f27564h;
            if (AbstractC9979u.m20289b(obj3, Boolean.valueOf(this.f27563g))) {
                AbstractC9979u.m20292e(obj3, "null cannot be cast to non-null type kotlin.collections.MutableMap<*, *>");
                mapM11d = AbstractC0005b.m11d(AbstractC9962d0.m20253d(obj3));
            } else {
                if (!(obj3 instanceof Map)) {
                    throw new AssertionError();
                }
                mapM11d = (Map) obj3;
            }
            Map map = mapM11d;
            AbstractC9979u.m20292e(map, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
            String str2 = this.f27565i;
            FileSystem fileSystemM25698i = this.f27566j;
            if (fileSystemM25698i == null) {
                fileSystemM25698i = this.f27558b.m25698i();
            }
            FileSystem fileSystem = fileSystemM25698i;
            Pair pair = this.f27567k;
            InterfaceC5461a.a aVar = this.f27568l;
            CachePolicy cachePolicyM25700k = this.f27572p;
            if (cachePolicyM25700k == null) {
                cachePolicyM25700k = this.f27558b.m25700k();
            }
            CachePolicy cachePolicy = cachePolicyM25700k;
            CachePolicy cachePolicyM25693d = this.f27573q;
            if (cachePolicyM25693d == null) {
                cachePolicyM25693d = this.f27558b.m25693d();
            }
            CachePolicy cachePolicy2 = cachePolicyM25693d;
            CachePolicy cachePolicyM25701l = this.f27574r;
            if (cachePolicyM25701l == null) {
                cachePolicyM25701l = this.f27558b.m25701l();
            }
            CachePolicy cachePolicy3 = cachePolicyM25701l;
            InterfaceC9945d interfaceC9945dM25699j = this.f27569m;
            if (interfaceC9945dM25699j == null) {
                interfaceC9945dM25699j = this.f27558b.m25699j();
            }
            InterfaceC9945d interfaceC9945d = interfaceC9945dM25699j;
            InterfaceC9945d interfaceC9945dM25697h = this.f27570n;
            if (interfaceC9945dM25697h == null) {
                interfaceC9945dM25697h = this.f27558b.m25697h();
            }
            InterfaceC9945d interfaceC9945d2 = interfaceC9945dM25697h;
            InterfaceC9945d interfaceC9945dM25692c = this.f27571o;
            if (interfaceC9945dM25692c == null) {
                interfaceC9945dM25692c = this.f27558b.m25692c();
            }
            InterfaceC9945d interfaceC9945d3 = interfaceC9945dM25692c;
            InterfaceC10825d.b bVar = this.f27575s;
            InterfaceC9540l interfaceC9540lM25702m = this.f27576t;
            if (interfaceC9540lM25702m == null) {
                interfaceC9540lM25702m = this.f27558b.m25702m();
            }
            InterfaceC9540l interfaceC9540l = interfaceC9540lM25702m;
            InterfaceC9540l interfaceC9540lM25694e = this.f27577u;
            if (interfaceC9540lM25694e == null) {
                interfaceC9540lM25694e = this.f27558b.m25694e();
            }
            InterfaceC9540l interfaceC9540l2 = interfaceC9540lM25694e;
            InterfaceC9540l interfaceC9540lM25696g = this.f27578v;
            if (interfaceC9540lM25696g == null) {
                interfaceC9540lM25696g = this.f27558b.m25696g();
            }
            InterfaceC9540l interfaceC9540l3 = interfaceC9540lM25696g;
            InterfaceC11751g interfaceC11751gM25705p = this.f27579w;
            if (interfaceC11751gM25705p == null) {
                interfaceC11751gM25705p = this.f27558b.m25705p();
            }
            InterfaceC11751g interfaceC11751g = interfaceC11751gM25705p;
            Scale scaleM25704o = this.f27580x;
            if (scaleM25704o == null) {
                scaleM25704o = this.f27558b.m25704o();
            }
            Scale scale = scaleM25704o;
            Precision precisionM25703n = this.f27581y;
            if (precisionM25703n == null) {
                precisionM25703n = this.f27558b.m25703n();
            }
            Precision precision = precisionM25703n;
            Object obj4 = this.f27582z;
            if (obj4 instanceof C5454c.a) {
                c5454cM3050a = ((C5454c.a) obj4).m3050a();
            } else {
                if (!(obj4 instanceof C5454c)) {
                    throw new AssertionError();
                }
                c5454cM3050a = (C5454c) obj4;
            }
            return new C11627g(context, obj2, interfaceC11879a, dVar, str, map, str2, fileSystem, pair, aVar, interfaceC9945d, interfaceC9945d2, interfaceC9945d3, cachePolicy, cachePolicy2, cachePolicy3, bVar, interfaceC9540l, interfaceC9540l2, interfaceC9540l3, interfaceC11751g, scale, precision, c5454cM3050a, new c(this.f27566j, this.f27569m, this.f27570n, this.f27571o, this.f27572p, this.f27573q, this.f27574r, this.f27576t, this.f27577u, this.f27578v, this.f27579w, this.f27580x, this.f27581y), this.f27558b, null);
        }

        /* renamed from: d */
        public final a m25676d(Object obj) {
            this.f27559c = obj;
            return this;
        }

        /* renamed from: e */
        public final a m25677e(b bVar) {
            this.f27558b = bVar;
            return this;
        }

        /* renamed from: f */
        public final a m25678f(CachePolicy cachePolicy) {
            this.f27573q = cachePolicy;
            return this;
        }

        /* renamed from: g */
        public final a m25679g(InterfaceC9540l interfaceC9540l) {
            this.f27577u = interfaceC9540l;
            return this;
        }

        /* renamed from: h */
        public final a m25680h(final InterfaceC9756j interfaceC9756j) {
            return m25679g(new InterfaceC9540l() { // from class: w.e
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return C11627g.a.m25673i(interfaceC9756j, (C11627g) obj);
                }
            });
        }

        /* renamed from: j */
        public final a m25681j(d dVar) {
            this.f27561e = dVar;
            return this;
        }

        /* renamed from: k */
        public final a m25682k(CachePolicy cachePolicy) {
            this.f27572p = cachePolicy;
            return this;
        }

        /* renamed from: l */
        public final a m25683l(CachePolicy cachePolicy) {
            this.f27574r = cachePolicy;
            return this;
        }

        /* renamed from: m */
        public final a m25684m(InterfaceC9540l interfaceC9540l) {
            this.f27576t = interfaceC9540l;
            return this;
        }

        /* renamed from: n */
        public final a m25685n(final InterfaceC9756j interfaceC9756j) {
            return m25684m(new InterfaceC9540l() { // from class: w.f
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj) {
                    return C11627g.a.m25674o(interfaceC9756j, (C11627g) obj);
                }
            });
        }

        /* renamed from: p */
        public final a m25686p(Precision precision) {
            this.f27581y = precision;
            return this;
        }

        /* renamed from: q */
        public final a m25687q(Scale scale) {
            this.f27580x = scale;
            return this;
        }

        /* renamed from: r */
        public final a m25688r(InterfaceC11751g interfaceC11751g) {
            this.f27579w = interfaceC11751g;
            return this;
        }

        /* renamed from: s */
        public final a m25689s(InterfaceC11879a interfaceC11879a) {
            this.f27560d = interfaceC11879a;
            return this;
        }

        public a(C11627g c11627g, Context context) {
            this.f27557a = context;
            this.f27558b = c11627g.m25651g();
            this.f27559c = c11627g.m25648d();
            this.f27560d = c11627g.m25669y();
            this.f27561e = c11627g.m25660p();
            this.f27562f = c11627g.m25661q();
            this.f27564h = c11627g.m25662r();
            this.f27565i = c11627g.m25653i();
            this.f27566j = c11627g.m25652h().m25711f();
            this.f27567k = c11627g.m25657m();
            this.f27568l = c11627g.m25650f();
            this.f27569m = c11627g.m25652h().m25712g();
            this.f27570n = c11627g.m25652h().m25710e();
            this.f27571o = c11627g.m25652h().m25706a();
            this.f27572p = c11627g.m25652h().m25713h();
            this.f27573q = c11627g.m25652h().m25707b();
            this.f27574r = c11627g.m25652h().m25714i();
            this.f27575s = c11627g.m25665u();
            this.f27576t = c11627g.m25652h().m25715j();
            this.f27577u = c11627g.m25652h().m25708c();
            this.f27578v = c11627g.m25652h().m25709d();
            this.f27579w = c11627g.m25652h().m25718m();
            this.f27580x = c11627g.m25652h().m25717l();
            this.f27581y = c11627g.m25652h().m25716k();
            this.f27582z = c11627g.m25655k();
        }

        /* renamed from: i */
        public static final InterfaceC9756j m25673i(InterfaceC9756j interfaceC9756j, C11627g c11627g) {
            return interfaceC9756j;
        }

        /* renamed from: o */
        public static final InterfaceC9756j m25674o(InterfaceC9756j interfaceC9756j, C11627g c11627g) {
            return interfaceC9756j;
        }
    }
}
