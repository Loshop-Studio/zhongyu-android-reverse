package p290y;

import android.content.Context;
import coil3.C5169c;
import coil3.decode.InterfaceC5184a;
import coil3.request.CachePolicy;
import coil3.size.Precision;
import coil3.size.Scale;
import coil3.util.AbstractC5213c;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import okio.FileSystem;
import p002a0.InterfaceC0006a;
import p030c0.AbstractC5077b;
import p030c0.AbstractC5079d;
import p030c0.AbstractC5086k;
import p137k.InterfaceC7838j;
import p238t.InterfaceC9363d;
import p300z.AbstractC9961h;
import p300z.C9958e;
import p300z.InterfaceC9954a;
import p300z.InterfaceC9960g;

/* renamed from: y.e */
/* loaded from: classes3.dex */
public final class C9886e {

    /* renamed from: a */
    public final Context f17521a;

    /* renamed from: b */
    public final Object f17522b;

    /* renamed from: c */
    public final InterfaceC0006a f17523c;

    /* renamed from: d */
    public final d f17524d;

    /* renamed from: e */
    public final String f17525e;

    /* renamed from: f */
    public final Map f17526f;

    /* renamed from: g */
    public final String f17527g;

    /* renamed from: h */
    public final FileSystem f17528h;

    /* renamed from: i */
    public final Pair f17529i;

    /* renamed from: j */
    public final InterfaceC5184a.a f17530j;

    /* renamed from: k */
    public final CoroutineContext f17531k;

    /* renamed from: l */
    public final CoroutineContext f17532l;

    /* renamed from: m */
    public final CoroutineContext f17533m;

    /* renamed from: n */
    public final CachePolicy f17534n;

    /* renamed from: o */
    public final CachePolicy f17535o;

    /* renamed from: p */
    public final CachePolicy f17536p;

    /* renamed from: q */
    public final InterfaceC9363d.b f17537q;

    /* renamed from: r */
    public final Function1 f17538r;

    /* renamed from: s */
    public final Function1 f17539s;

    /* renamed from: t */
    public final Function1 f17540t;

    /* renamed from: u */
    public final InterfaceC9960g f17541u;

    /* renamed from: v */
    public final Scale f17542v;

    /* renamed from: w */
    public final Precision f17543w;

    /* renamed from: x */
    public final C5169c f17544x;

    /* renamed from: y */
    public final c f17545y;

    /* renamed from: z */
    public final b f17546z;

    /* renamed from: y.e$c */
    public static final class c {

        /* renamed from: a */
        public final FileSystem f17589a;

        /* renamed from: b */
        public final CoroutineContext f17590b;

        /* renamed from: c */
        public final CoroutineContext f17591c;

        /* renamed from: d */
        public final CoroutineContext f17592d;

        /* renamed from: e */
        public final CachePolicy f17593e;

        /* renamed from: f */
        public final CachePolicy f17594f;

        /* renamed from: g */
        public final CachePolicy f17595g;

        /* renamed from: h */
        public final Function1 f17596h;

        /* renamed from: i */
        public final Function1 f17597i;

        /* renamed from: j */
        public final Function1 f17598j;

        /* renamed from: k */
        public final InterfaceC9960g f17599k;

        /* renamed from: l */
        public final Scale f17600l;

        /* renamed from: m */
        public final Precision f17601m;

        public c(FileSystem fileSystem, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, Function1 function1, Function1 function12, Function1 function13, InterfaceC9960g interfaceC9960g, Scale scale, Precision precision) {
            this.f17589a = fileSystem;
            this.f17590b = coroutineContext;
            this.f17591c = coroutineContext2;
            this.f17592d = coroutineContext3;
            this.f17593e = cachePolicy;
            this.f17594f = cachePolicy2;
            this.f17595g = cachePolicy3;
            this.f17596h = function1;
            this.f17597i = function12;
            this.f17598j = function13;
            this.f17599k = interfaceC9960g;
            this.f17600l = scale;
            this.f17601m = precision;
        }

        /* renamed from: a */
        public final CoroutineContext m16669a() {
            return this.f17592d;
        }

        /* renamed from: b */
        public final CachePolicy m16670b() {
            return this.f17594f;
        }

        /* renamed from: c */
        public final Function1 m16671c() {
            return this.f17597i;
        }

        /* renamed from: d */
        public final Function1 m16672d() {
            return this.f17598j;
        }

        /* renamed from: e */
        public final CoroutineContext m16673e() {
            return this.f17591c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f17589a, cVar.f17589a) && Intrinsics.areEqual(this.f17590b, cVar.f17590b) && Intrinsics.areEqual(this.f17591c, cVar.f17591c) && Intrinsics.areEqual(this.f17592d, cVar.f17592d) && this.f17593e == cVar.f17593e && this.f17594f == cVar.f17594f && this.f17595g == cVar.f17595g && Intrinsics.areEqual(this.f17596h, cVar.f17596h) && Intrinsics.areEqual(this.f17597i, cVar.f17597i) && Intrinsics.areEqual(this.f17598j, cVar.f17598j) && Intrinsics.areEqual(this.f17599k, cVar.f17599k) && this.f17600l == cVar.f17600l && this.f17601m == cVar.f17601m;
        }

        /* renamed from: f */
        public final FileSystem m16674f() {
            return this.f17589a;
        }

        /* renamed from: g */
        public final CoroutineContext m16675g() {
            return this.f17590b;
        }

        /* renamed from: h */
        public final CachePolicy m16676h() {
            return this.f17593e;
        }

        public int hashCode() {
            FileSystem fileSystem = this.f17589a;
            int iHashCode = (fileSystem == null ? 0 : fileSystem.hashCode()) * 31;
            CoroutineContext coroutineContext = this.f17590b;
            int iHashCode2 = (iHashCode + (coroutineContext == null ? 0 : coroutineContext.hashCode())) * 31;
            CoroutineContext coroutineContext2 = this.f17591c;
            int iHashCode3 = (iHashCode2 + (coroutineContext2 == null ? 0 : coroutineContext2.hashCode())) * 31;
            CoroutineContext coroutineContext3 = this.f17592d;
            int iHashCode4 = (iHashCode3 + (coroutineContext3 == null ? 0 : coroutineContext3.hashCode())) * 31;
            CachePolicy cachePolicy = this.f17593e;
            int iHashCode5 = (iHashCode4 + (cachePolicy == null ? 0 : cachePolicy.hashCode())) * 31;
            CachePolicy cachePolicy2 = this.f17594f;
            int iHashCode6 = (iHashCode5 + (cachePolicy2 == null ? 0 : cachePolicy2.hashCode())) * 31;
            CachePolicy cachePolicy3 = this.f17595g;
            int iHashCode7 = (iHashCode6 + (cachePolicy3 == null ? 0 : cachePolicy3.hashCode())) * 31;
            Function1 function1 = this.f17596h;
            int iHashCode8 = (iHashCode7 + (function1 == null ? 0 : function1.hashCode())) * 31;
            Function1 function12 = this.f17597i;
            int iHashCode9 = (iHashCode8 + (function12 == null ? 0 : function12.hashCode())) * 31;
            Function1 function13 = this.f17598j;
            int iHashCode10 = (iHashCode9 + (function13 == null ? 0 : function13.hashCode())) * 31;
            InterfaceC9960g interfaceC9960g = this.f17599k;
            int iHashCode11 = (iHashCode10 + (interfaceC9960g == null ? 0 : interfaceC9960g.hashCode())) * 31;
            Scale scale = this.f17600l;
            int iHashCode12 = (iHashCode11 + (scale == null ? 0 : scale.hashCode())) * 31;
            Precision precision = this.f17601m;
            return iHashCode12 + (precision != null ? precision.hashCode() : 0);
        }

        /* renamed from: i */
        public final CachePolicy m16677i() {
            return this.f17595g;
        }

        /* renamed from: j */
        public final Function1 m16678j() {
            return this.f17596h;
        }

        /* renamed from: k */
        public final Precision m16679k() {
            return this.f17601m;
        }

        /* renamed from: l */
        public final Scale m16680l() {
            return this.f17600l;
        }

        /* renamed from: m */
        public final InterfaceC9960g m16681m() {
            return this.f17599k;
        }

        public String toString() {
            return "Defined(fileSystem=" + this.f17589a + ", interceptorCoroutineContext=" + this.f17590b + ", fetcherCoroutineContext=" + this.f17591c + ", decoderCoroutineContext=" + this.f17592d + ", memoryCachePolicy=" + this.f17593e + ", diskCachePolicy=" + this.f17594f + ", networkCachePolicy=" + this.f17595g + ", placeholderFactory=" + this.f17596h + ", errorFactory=" + this.f17597i + ", fallbackFactory=" + this.f17598j + ", sizeResolver=" + this.f17599k + ", scale=" + this.f17600l + ", precision=" + this.f17601m + ')';
        }
    }

    /* renamed from: y.e$d */
    public interface d {
        /* renamed from: a */
        void mo2866a(C9886e c9886e, C9896o c9896o);

        /* renamed from: b */
        void mo2867b(C9886e c9886e, C9885d c9885d);

        /* renamed from: c */
        void mo2868c(C9886e c9886e);

        /* renamed from: d */
        void mo2869d(C9886e c9886e);
    }

    public /* synthetic */ C9886e(Context context, Object obj, InterfaceC0006a interfaceC0006a, d dVar, String str, Map map, String str2, FileSystem fileSystem, Pair pair, InterfaceC5184a.a aVar, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, InterfaceC9363d.b bVar, Function1 function1, Function1 function12, Function1 function13, InterfaceC9960g interfaceC9960g, Scale scale, Precision precision, C5169c c5169c, c cVar, b bVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, obj, interfaceC0006a, dVar, str, map, str2, fileSystem, pair, aVar, coroutineContext, coroutineContext2, coroutineContext3, cachePolicy, cachePolicy2, cachePolicy3, bVar, function1, function12, function13, interfaceC9960g, scale, precision, c5169c, cVar, bVar2);
    }

    /* renamed from: A */
    public static /* synthetic */ a m16613A(C9886e c9886e, Context context, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            context = c9886e.f17521a;
        }
        return c9886e.m16640z(context);
    }

    /* renamed from: B */
    public final InterfaceC7838j m16614B() {
        InterfaceC7838j interfaceC7838j = (InterfaceC7838j) this.f17538r.invoke(this);
        return interfaceC7838j == null ? (InterfaceC7838j) this.f17546z.m16665m().invoke(this) : interfaceC7838j;
    }

    /* renamed from: a */
    public final InterfaceC7838j m16615a() {
        InterfaceC7838j interfaceC7838j = (InterfaceC7838j) this.f17539s.invoke(this);
        return interfaceC7838j == null ? (InterfaceC7838j) this.f17546z.m16657e().invoke(this) : interfaceC7838j;
    }

    /* renamed from: b */
    public final InterfaceC7838j m16616b() {
        InterfaceC7838j interfaceC7838j = (InterfaceC7838j) this.f17540t.invoke(this);
        return interfaceC7838j == null ? (InterfaceC7838j) this.f17546z.m16659g().invoke(this) : interfaceC7838j;
    }

    /* renamed from: c */
    public final Context m16617c() {
        return this.f17521a;
    }

    /* renamed from: d */
    public final Object m16618d() {
        return this.f17522b;
    }

    /* renamed from: e */
    public final CoroutineContext m16619e() {
        return this.f17533m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9886e)) {
            return false;
        }
        C9886e c9886e = (C9886e) obj;
        return Intrinsics.areEqual(this.f17521a, c9886e.f17521a) && Intrinsics.areEqual(this.f17522b, c9886e.f17522b) && Intrinsics.areEqual(this.f17523c, c9886e.f17523c) && Intrinsics.areEqual(this.f17524d, c9886e.f17524d) && Intrinsics.areEqual(this.f17525e, c9886e.f17525e) && Intrinsics.areEqual(this.f17526f, c9886e.f17526f) && Intrinsics.areEqual(this.f17527g, c9886e.f17527g) && Intrinsics.areEqual(this.f17528h, c9886e.f17528h) && Intrinsics.areEqual(this.f17529i, c9886e.f17529i) && Intrinsics.areEqual(this.f17530j, c9886e.f17530j) && Intrinsics.areEqual(this.f17531k, c9886e.f17531k) && Intrinsics.areEqual(this.f17532l, c9886e.f17532l) && Intrinsics.areEqual(this.f17533m, c9886e.f17533m) && this.f17534n == c9886e.f17534n && this.f17535o == c9886e.f17535o && this.f17536p == c9886e.f17536p && Intrinsics.areEqual(this.f17537q, c9886e.f17537q) && Intrinsics.areEqual(this.f17538r, c9886e.f17538r) && Intrinsics.areEqual(this.f17539s, c9886e.f17539s) && Intrinsics.areEqual(this.f17540t, c9886e.f17540t) && Intrinsics.areEqual(this.f17541u, c9886e.f17541u) && this.f17542v == c9886e.f17542v && this.f17543w == c9886e.f17543w && Intrinsics.areEqual(this.f17544x, c9886e.f17544x) && Intrinsics.areEqual(this.f17545y, c9886e.f17545y) && Intrinsics.areEqual(this.f17546z, c9886e.f17546z);
    }

    /* renamed from: f */
    public final InterfaceC5184a.a m16620f() {
        return this.f17530j;
    }

    /* renamed from: g */
    public final b m16621g() {
        return this.f17546z;
    }

    /* renamed from: h */
    public final c m16622h() {
        return this.f17545y;
    }

    public int hashCode() {
        int iHashCode = ((this.f17521a.hashCode() * 31) + this.f17522b.hashCode()) * 31;
        InterfaceC0006a interfaceC0006a = this.f17523c;
        int iHashCode2 = (iHashCode + (interfaceC0006a == null ? 0 : interfaceC0006a.hashCode())) * 31;
        d dVar = this.f17524d;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.f17525e;
        int iHashCode4 = (((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.f17526f.hashCode()) * 31;
        String str2 = this.f17527g;
        int iHashCode5 = (((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f17528h.hashCode()) * 31;
        Pair pair = this.f17529i;
        int iHashCode6 = (iHashCode5 + (pair == null ? 0 : pair.hashCode())) * 31;
        InterfaceC5184a.a aVar = this.f17530j;
        int iHashCode7 = (((((((((((((iHashCode6 + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.f17531k.hashCode()) * 31) + this.f17532l.hashCode()) * 31) + this.f17533m.hashCode()) * 31) + this.f17534n.hashCode()) * 31) + this.f17535o.hashCode()) * 31) + this.f17536p.hashCode()) * 31;
        InterfaceC9363d.b bVar = this.f17537q;
        return ((((((((((((((((((iHashCode7 + (bVar != null ? bVar.hashCode() : 0)) * 31) + this.f17538r.hashCode()) * 31) + this.f17539s.hashCode()) * 31) + this.f17540t.hashCode()) * 31) + this.f17541u.hashCode()) * 31) + this.f17542v.hashCode()) * 31) + this.f17543w.hashCode()) * 31) + this.f17544x.hashCode()) * 31) + this.f17545y.hashCode()) * 31) + this.f17546z.hashCode();
    }

    /* renamed from: i */
    public final String m16623i() {
        return this.f17527g;
    }

    /* renamed from: j */
    public final CachePolicy m16624j() {
        return this.f17535o;
    }

    /* renamed from: k */
    public final C5169c m16625k() {
        return this.f17544x;
    }

    /* renamed from: l */
    public final CoroutineContext m16626l() {
        return this.f17532l;
    }

    /* renamed from: m */
    public final Pair m16627m() {
        return this.f17529i;
    }

    /* renamed from: n */
    public final FileSystem m16628n() {
        return this.f17528h;
    }

    /* renamed from: o */
    public final CoroutineContext m16629o() {
        return this.f17531k;
    }

    /* renamed from: p */
    public final d m16630p() {
        return this.f17524d;
    }

    /* renamed from: q */
    public final String m16631q() {
        return this.f17525e;
    }

    /* renamed from: r */
    public final Map m16632r() {
        return this.f17526f;
    }

    /* renamed from: s */
    public final CachePolicy m16633s() {
        return this.f17534n;
    }

    /* renamed from: t */
    public final CachePolicy m16634t() {
        return this.f17536p;
    }

    public String toString() {
        return "ImageRequest(context=" + this.f17521a + ", data=" + this.f17522b + ", target=" + this.f17523c + ", listener=" + this.f17524d + ", memoryCacheKey=" + this.f17525e + ", memoryCacheKeyExtras=" + this.f17526f + ", diskCacheKey=" + this.f17527g + ", fileSystem=" + this.f17528h + ", fetcherFactory=" + this.f17529i + ", decoderFactory=" + this.f17530j + ", interceptorCoroutineContext=" + this.f17531k + ", fetcherCoroutineContext=" + this.f17532l + ", decoderCoroutineContext=" + this.f17533m + ", memoryCachePolicy=" + this.f17534n + ", diskCachePolicy=" + this.f17535o + ", networkCachePolicy=" + this.f17536p + ", placeholderMemoryCacheKey=" + this.f17537q + ", placeholderFactory=" + this.f17538r + ", errorFactory=" + this.f17539s + ", fallbackFactory=" + this.f17540t + ", sizeResolver=" + this.f17541u + ", scale=" + this.f17542v + ", precision=" + this.f17543w + ", extras=" + this.f17544x + ", defined=" + this.f17545y + ", defaults=" + this.f17546z + ')';
    }

    /* renamed from: u */
    public final InterfaceC9363d.b m16635u() {
        return this.f17537q;
    }

    /* renamed from: v */
    public final Precision m16636v() {
        return this.f17543w;
    }

    /* renamed from: w */
    public final Scale m16637w() {
        return this.f17542v;
    }

    /* renamed from: x */
    public final InterfaceC9960g m16638x() {
        return this.f17541u;
    }

    /* renamed from: y */
    public final InterfaceC0006a m16639y() {
        return this.f17523c;
    }

    /* renamed from: z */
    public final a m16640z(Context context) {
        return new a(this, context);
    }

    public C9886e(Context context, Object obj, InterfaceC0006a interfaceC0006a, d dVar, String str, Map map, String str2, FileSystem fileSystem, Pair pair, InterfaceC5184a.a aVar, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, InterfaceC9363d.b bVar, Function1 function1, Function1 function12, Function1 function13, InterfaceC9960g interfaceC9960g, Scale scale, Precision precision, C5169c c5169c, c cVar, b bVar2) {
        this.f17521a = context;
        this.f17522b = obj;
        this.f17523c = interfaceC0006a;
        this.f17524d = dVar;
        this.f17525e = str;
        this.f17526f = map;
        this.f17527g = str2;
        this.f17528h = fileSystem;
        this.f17529i = pair;
        this.f17530j = aVar;
        this.f17531k = coroutineContext;
        this.f17532l = coroutineContext2;
        this.f17533m = coroutineContext3;
        this.f17534n = cachePolicy;
        this.f17535o = cachePolicy2;
        this.f17536p = cachePolicy3;
        this.f17537q = bVar;
        this.f17538r = function1;
        this.f17539s = function12;
        this.f17540t = function13;
        this.f17541u = interfaceC9960g;
        this.f17542v = scale;
        this.f17543w = precision;
        this.f17544x = c5169c;
        this.f17545y = cVar;
        this.f17546z = bVar2;
    }

    /* renamed from: y.e$b */
    public static final class b {

        /* renamed from: o */
        public static final a f17573o = new a(null);

        /* renamed from: p */
        public static final b f17574p = new b(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);

        /* renamed from: a */
        public final FileSystem f17575a;

        /* renamed from: b */
        public final CoroutineContext f17576b;

        /* renamed from: c */
        public final CoroutineContext f17577c;

        /* renamed from: d */
        public final CoroutineContext f17578d;

        /* renamed from: e */
        public final CachePolicy f17579e;

        /* renamed from: f */
        public final CachePolicy f17580f;

        /* renamed from: g */
        public final CachePolicy f17581g;

        /* renamed from: h */
        public final Function1 f17582h;

        /* renamed from: i */
        public final Function1 f17583i;

        /* renamed from: j */
        public final Function1 f17584j;

        /* renamed from: k */
        public final InterfaceC9960g f17585k;

        /* renamed from: l */
        public final Scale f17586l;

        /* renamed from: m */
        public final Precision f17587m;

        /* renamed from: n */
        public final C5169c f17588n;

        /* renamed from: y.e$b$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public a() {
            }
        }

        public b(FileSystem fileSystem, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, Function1 function1, Function1 function12, Function1 function13, InterfaceC9960g interfaceC9960g, Scale scale, Precision precision, C5169c c5169c) {
            this.f17575a = fileSystem;
            this.f17576b = coroutineContext;
            this.f17577c = coroutineContext2;
            this.f17578d = coroutineContext3;
            this.f17579e = cachePolicy;
            this.f17580f = cachePolicy2;
            this.f17581g = cachePolicy3;
            this.f17582h = function1;
            this.f17583i = function12;
            this.f17584j = function13;
            this.f17585k = interfaceC9960g;
            this.f17586l = scale;
            this.f17587m = precision;
            this.f17588n = c5169c;
        }

        /* renamed from: a */
        public final b m16654a(FileSystem fileSystem, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, Function1 function1, Function1 function12, Function1 function13, InterfaceC9960g interfaceC9960g, Scale scale, Precision precision, C5169c c5169c) {
            return new b(fileSystem, coroutineContext, coroutineContext2, coroutineContext3, cachePolicy, cachePolicy2, cachePolicy3, function1, function12, function13, interfaceC9960g, scale, precision, c5169c);
        }

        /* renamed from: c */
        public final CoroutineContext m16655c() {
            return this.f17578d;
        }

        /* renamed from: d */
        public final CachePolicy m16656d() {
            return this.f17580f;
        }

        /* renamed from: e */
        public final Function1 m16657e() {
            return this.f17583i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f17575a, bVar.f17575a) && Intrinsics.areEqual(this.f17576b, bVar.f17576b) && Intrinsics.areEqual(this.f17577c, bVar.f17577c) && Intrinsics.areEqual(this.f17578d, bVar.f17578d) && this.f17579e == bVar.f17579e && this.f17580f == bVar.f17580f && this.f17581g == bVar.f17581g && Intrinsics.areEqual(this.f17582h, bVar.f17582h) && Intrinsics.areEqual(this.f17583i, bVar.f17583i) && Intrinsics.areEqual(this.f17584j, bVar.f17584j) && Intrinsics.areEqual(this.f17585k, bVar.f17585k) && this.f17586l == bVar.f17586l && this.f17587m == bVar.f17587m && Intrinsics.areEqual(this.f17588n, bVar.f17588n);
        }

        /* renamed from: f */
        public final C5169c m16658f() {
            return this.f17588n;
        }

        /* renamed from: g */
        public final Function1 m16659g() {
            return this.f17584j;
        }

        /* renamed from: h */
        public final CoroutineContext m16660h() {
            return this.f17577c;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((this.f17575a.hashCode() * 31) + this.f17576b.hashCode()) * 31) + this.f17577c.hashCode()) * 31) + this.f17578d.hashCode()) * 31) + this.f17579e.hashCode()) * 31) + this.f17580f.hashCode()) * 31) + this.f17581g.hashCode()) * 31) + this.f17582h.hashCode()) * 31) + this.f17583i.hashCode()) * 31) + this.f17584j.hashCode()) * 31) + this.f17585k.hashCode()) * 31) + this.f17586l.hashCode()) * 31) + this.f17587m.hashCode()) * 31) + this.f17588n.hashCode();
        }

        /* renamed from: i */
        public final FileSystem m16661i() {
            return this.f17575a;
        }

        /* renamed from: j */
        public final CoroutineContext m16662j() {
            return this.f17576b;
        }

        /* renamed from: k */
        public final CachePolicy m16663k() {
            return this.f17579e;
        }

        /* renamed from: l */
        public final CachePolicy m16664l() {
            return this.f17581g;
        }

        /* renamed from: m */
        public final Function1 m16665m() {
            return this.f17582h;
        }

        /* renamed from: n */
        public final Precision m16666n() {
            return this.f17587m;
        }

        /* renamed from: o */
        public final Scale m16667o() {
            return this.f17586l;
        }

        /* renamed from: p */
        public final InterfaceC9960g m16668p() {
            return this.f17585k;
        }

        public String toString() {
            return "Defaults(fileSystem=" + this.f17575a + ", interceptorCoroutineContext=" + this.f17576b + ", fetcherCoroutineContext=" + this.f17577c + ", decoderCoroutineContext=" + this.f17578d + ", memoryCachePolicy=" + this.f17579e + ", diskCachePolicy=" + this.f17580f + ", networkCachePolicy=" + this.f17581g + ", placeholderFactory=" + this.f17582h + ", errorFactory=" + this.f17583i + ", fallbackFactory=" + this.f17584j + ", sizeResolver=" + this.f17585k + ", scale=" + this.f17586l + ", precision=" + this.f17587m + ", extras=" + this.f17588n + ')';
        }

        public /* synthetic */ b(FileSystem fileSystem, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, Function1 function1, Function1 function12, Function1 function13, InterfaceC9960g interfaceC9960g, Scale scale, Precision precision, C5169c c5169c, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? AbstractC5086k.m2687a() : fileSystem, (i10 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i10 & 4) != 0 ? AbstractC5079d.m2678a() : coroutineContext2, (i10 & 8) != 0 ? AbstractC5079d.m2678a() : coroutineContext3, (i10 & 16) != 0 ? CachePolicy.f3209c : cachePolicy, (i10 & 32) != 0 ? CachePolicy.f3209c : cachePolicy2, (i10 & 64) != 0 ? CachePolicy.f3209c : cachePolicy3, (i10 & 128) != 0 ? AbstractC5213c.m3217k() : function1, (i10 & 256) != 0 ? AbstractC5213c.m3217k() : function12, (i10 & 512) != 0 ? AbstractC5213c.m3217k() : function13, (i10 & 1024) != 0 ? InterfaceC9960g.f17804b0 : interfaceC9960g, (i10 & 2048) != 0 ? Scale.f3236b : scale, (i10 & 4096) != 0 ? Precision.f3231a : precision, (i10 & 8192) != 0 ? C5169c.f2820c : c5169c);
        }
    }

    /* renamed from: y.e$a */
    public static final class a {

        /* renamed from: a */
        public final Context f17547a;

        /* renamed from: b */
        public b f17548b;

        /* renamed from: c */
        public Object f17549c;

        /* renamed from: d */
        public InterfaceC0006a f17550d;

        /* renamed from: e */
        public d f17551e;

        /* renamed from: f */
        public String f17552f;

        /* renamed from: g */
        public boolean f17553g;

        /* renamed from: h */
        public Object f17554h;

        /* renamed from: i */
        public String f17555i;

        /* renamed from: j */
        public FileSystem f17556j;

        /* renamed from: k */
        public Pair f17557k;

        /* renamed from: l */
        public InterfaceC5184a.a f17558l;

        /* renamed from: m */
        public CoroutineContext f17559m;

        /* renamed from: n */
        public CoroutineContext f17560n;

        /* renamed from: o */
        public CoroutineContext f17561o;

        /* renamed from: p */
        public CachePolicy f17562p;

        /* renamed from: q */
        public CachePolicy f17563q;

        /* renamed from: r */
        public CachePolicy f17564r;

        /* renamed from: s */
        public InterfaceC9363d.b f17565s;

        /* renamed from: t */
        public Function1 f17566t;

        /* renamed from: u */
        public Function1 f17567u;

        /* renamed from: v */
        public Function1 f17568v;

        /* renamed from: w */
        public InterfaceC9960g f17569w;

        /* renamed from: x */
        public Scale f17570x;

        /* renamed from: y */
        public Precision f17571y;

        /* renamed from: z */
        public Object f17572z;

        public a(Context context) {
            this.f17547a = context;
            this.f17548b = b.f17574p;
            this.f17549c = null;
            this.f17550d = null;
            this.f17551e = null;
            this.f17552f = null;
            this.f17554h = MapsKt.emptyMap();
            this.f17555i = null;
            this.f17556j = null;
            this.f17557k = null;
            this.f17558l = null;
            this.f17559m = null;
            this.f17560n = null;
            this.f17561o = null;
            this.f17562p = null;
            this.f17563q = null;
            this.f17564r = null;
            this.f17565s = null;
            this.f17566t = AbstractC5213c.m3217k();
            this.f17567u = AbstractC5213c.m3217k();
            this.f17568v = AbstractC5213c.m3217k();
            this.f17569w = null;
            this.f17570x = null;
            this.f17571y = null;
            this.f17572z = C5169c.f2820c;
        }

        /* renamed from: a */
        public final C9886e m16641a() {
            Map mapM2670d;
            C5169c c5169cM2891a;
            Context context = this.f17547a;
            Object obj = this.f17549c;
            if (obj == null) {
                obj = C9890i.f17613a;
            }
            Object obj2 = obj;
            InterfaceC0006a interfaceC0006a = this.f17550d;
            d dVar = this.f17551e;
            String str = this.f17552f;
            Object obj3 = this.f17554h;
            if (Intrinsics.areEqual(obj3, Boolean.valueOf(this.f17553g))) {
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.collections.MutableMap<*, *>");
                mapM2670d = AbstractC5077b.m2670d(TypeIntrinsics.asMutableMap(obj3));
            } else {
                if (!(obj3 instanceof Map)) {
                    throw new AssertionError();
                }
                mapM2670d = (Map) obj3;
            }
            Map map = mapM2670d;
            Intrinsics.checkNotNull(map, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
            String str2 = this.f17555i;
            FileSystem fileSystemM16661i = this.f17556j;
            if (fileSystemM16661i == null) {
                fileSystemM16661i = this.f17548b.m16661i();
            }
            FileSystem fileSystem = fileSystemM16661i;
            Pair pair = this.f17557k;
            InterfaceC5184a.a aVar = this.f17558l;
            CachePolicy cachePolicyM16663k = this.f17562p;
            if (cachePolicyM16663k == null) {
                cachePolicyM16663k = this.f17548b.m16663k();
            }
            CachePolicy cachePolicy = cachePolicyM16663k;
            CachePolicy cachePolicyM16656d = this.f17563q;
            if (cachePolicyM16656d == null) {
                cachePolicyM16656d = this.f17548b.m16656d();
            }
            CachePolicy cachePolicy2 = cachePolicyM16656d;
            CachePolicy cachePolicyM16664l = this.f17564r;
            if (cachePolicyM16664l == null) {
                cachePolicyM16664l = this.f17548b.m16664l();
            }
            CachePolicy cachePolicy3 = cachePolicyM16664l;
            CoroutineContext coroutineContextM16662j = this.f17559m;
            if (coroutineContextM16662j == null) {
                coroutineContextM16662j = this.f17548b.m16662j();
            }
            CoroutineContext coroutineContext = coroutineContextM16662j;
            CoroutineContext coroutineContextM16660h = this.f17560n;
            if (coroutineContextM16660h == null) {
                coroutineContextM16660h = this.f17548b.m16660h();
            }
            CoroutineContext coroutineContext2 = coroutineContextM16660h;
            CoroutineContext coroutineContextM16655c = this.f17561o;
            if (coroutineContextM16655c == null) {
                coroutineContextM16655c = this.f17548b.m16655c();
            }
            CoroutineContext coroutineContext3 = coroutineContextM16655c;
            InterfaceC9363d.b bVar = this.f17565s;
            Function1 function1M16665m = this.f17566t;
            if (function1M16665m == null) {
                function1M16665m = this.f17548b.m16665m();
            }
            Function1 function1 = function1M16665m;
            Function1 function1M16657e = this.f17567u;
            if (function1M16657e == null) {
                function1M16657e = this.f17548b.m16657e();
            }
            Function1 function12 = function1M16657e;
            Function1 function1M16659g = this.f17568v;
            if (function1M16659g == null) {
                function1M16659g = this.f17548b.m16659g();
            }
            Function1 function13 = function1M16659g;
            InterfaceC9960g interfaceC9960gM16668p = this.f17569w;
            if (interfaceC9960gM16668p == null) {
                interfaceC9960gM16668p = this.f17548b.m16668p();
            }
            InterfaceC9960g interfaceC9960g = interfaceC9960gM16668p;
            Scale scaleM16667o = this.f17570x;
            if (scaleM16667o == null) {
                scaleM16667o = this.f17548b.m16667o();
            }
            Scale scale = scaleM16667o;
            Precision precisionM16666n = this.f17571y;
            if (precisionM16666n == null) {
                precisionM16666n = this.f17548b.m16666n();
            }
            Precision precision = precisionM16666n;
            Object obj4 = this.f17572z;
            if (obj4 instanceof C5169c.a) {
                c5169cM2891a = ((C5169c.a) obj4).m2891a();
            } else {
                if (!(obj4 instanceof C5169c)) {
                    throw new AssertionError();
                }
                c5169cM2891a = (C5169c) obj4;
            }
            return new C9886e(context, obj2, interfaceC0006a, dVar, str, map, str2, fileSystem, pair, aVar, coroutineContext, coroutineContext2, coroutineContext3, cachePolicy, cachePolicy2, cachePolicy3, bVar, function1, function12, function13, interfaceC9960g, scale, precision, c5169cM2891a, new c(this.f17556j, this.f17559m, this.f17560n, this.f17561o, this.f17562p, this.f17563q, this.f17564r, this.f17566t, this.f17567u, this.f17568v, this.f17569w, this.f17570x, this.f17571y), this.f17548b, null);
        }

        /* renamed from: b */
        public final a m16642b(CoroutineContext coroutineContext) {
            this.f17559m = coroutineContext;
            this.f17560n = coroutineContext;
            this.f17561o = coroutineContext;
            return this;
        }

        /* renamed from: c */
        public final a m16643c(Object obj) {
            this.f17549c = obj;
            return this;
        }

        /* renamed from: d */
        public final a m16644d(b bVar) {
            this.f17548b = bVar;
            return this;
        }

        /* renamed from: e */
        public final a m16645e(String str) {
            this.f17555i = str;
            return this;
        }

        /* renamed from: f */
        public final a m16646f(String str) {
            this.f17552f = str;
            return this;
        }

        /* renamed from: g */
        public final a m16647g(Precision precision) {
            this.f17571y = precision;
            return this;
        }

        /* renamed from: h */
        public final a m16648h(Scale scale) {
            this.f17570x = scale;
            return this;
        }

        /* renamed from: i */
        public final a m16649i(InterfaceC9954a interfaceC9954a, InterfaceC9954a interfaceC9954a2) {
            return m16650j(new C9958e(interfaceC9954a, interfaceC9954a2));
        }

        /* renamed from: j */
        public final a m16650j(C9958e c9958e) {
            return m16651k(AbstractC9961h.m16775a(c9958e));
        }

        /* renamed from: k */
        public final a m16651k(InterfaceC9960g interfaceC9960g) {
            this.f17569w = interfaceC9960g;
            return this;
        }

        /* renamed from: l */
        public final a m16652l(InterfaceC0006a interfaceC0006a) {
            this.f17550d = interfaceC0006a;
            return this;
        }

        public a(C9886e c9886e, Context context) {
            this.f17547a = context;
            this.f17548b = c9886e.m16621g();
            this.f17549c = c9886e.m16618d();
            this.f17550d = c9886e.m16639y();
            this.f17551e = c9886e.m16630p();
            this.f17552f = c9886e.m16631q();
            this.f17554h = c9886e.m16632r();
            this.f17555i = c9886e.m16623i();
            this.f17556j = c9886e.m16622h().m16674f();
            this.f17557k = c9886e.m16627m();
            this.f17558l = c9886e.m16620f();
            this.f17559m = c9886e.m16622h().m16675g();
            this.f17560n = c9886e.m16622h().m16673e();
            this.f17561o = c9886e.m16622h().m16669a();
            this.f17562p = c9886e.m16622h().m16676h();
            this.f17563q = c9886e.m16622h().m16670b();
            this.f17564r = c9886e.m16622h().m16677i();
            this.f17565s = c9886e.m16635u();
            this.f17566t = c9886e.m16622h().m16678j();
            this.f17567u = c9886e.m16622h().m16671c();
            this.f17568v = c9886e.m16622h().m16672d();
            this.f17569w = c9886e.m16622h().m16681m();
            this.f17570x = c9886e.m16622h().m16680l();
            this.f17571y = c9886e.m16622h().m16679k();
            this.f17572z = c9886e.m16625k();
        }
    }
}
