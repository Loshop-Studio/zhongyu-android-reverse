package p187y;

import android.content.Context;
import coil3.C4550c;
import coil3.decode.InterfaceC4565a;
import coil3.request.CachePolicy;
import coil3.size.Precision;
import coil3.size.Scale;
import coil3.util.AbstractC4594c;
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
import p001a0.InterfaceC0004a;
import p023c0.AbstractC4457b;
import p023c0.AbstractC4459d;
import p023c0.AbstractC4466k;
import p087k.InterfaceC6611j;
import p152t.InterfaceC7708d;
import p194z.InterfaceC7925g;

/* renamed from: y.e */
/* loaded from: classes3.dex */
public final class C7872e {

    /* renamed from: a */
    public final Context f10494a;

    /* renamed from: b */
    public final Object f10495b;

    /* renamed from: c */
    public final InterfaceC0004a f10496c;

    /* renamed from: d */
    public final d f10497d;

    /* renamed from: e */
    public final String f10498e;

    /* renamed from: f */
    public final Map f10499f;

    /* renamed from: g */
    public final String f10500g;

    /* renamed from: h */
    public final FileSystem f10501h;

    /* renamed from: i */
    public final Pair f10502i;

    /* renamed from: j */
    public final InterfaceC4565a.a f10503j;

    /* renamed from: k */
    public final CoroutineContext f10504k;

    /* renamed from: l */
    public final CoroutineContext f10505l;

    /* renamed from: m */
    public final CoroutineContext f10506m;

    /* renamed from: n */
    public final CachePolicy f10507n;

    /* renamed from: o */
    public final CachePolicy f10508o;

    /* renamed from: p */
    public final CachePolicy f10509p;

    /* renamed from: q */
    public final InterfaceC7708d.b f10510q;

    /* renamed from: r */
    public final Function1 f10511r;

    /* renamed from: s */
    public final Function1 f10512s;

    /* renamed from: t */
    public final Function1 f10513t;

    /* renamed from: u */
    public final InterfaceC7925g f10514u;

    /* renamed from: v */
    public final Scale f10515v;

    /* renamed from: w */
    public final Precision f10516w;

    /* renamed from: x */
    public final C4550c f10517x;

    /* renamed from: y */
    public final c f10518y;

    /* renamed from: z */
    public final b f10519z;

    /* renamed from: y.e$c */
    public static final class c {

        /* renamed from: a */
        public final FileSystem f10562a;

        /* renamed from: b */
        public final CoroutineContext f10563b;

        /* renamed from: c */
        public final CoroutineContext f10564c;

        /* renamed from: d */
        public final CoroutineContext f10565d;

        /* renamed from: e */
        public final CachePolicy f10566e;

        /* renamed from: f */
        public final CachePolicy f10567f;

        /* renamed from: g */
        public final CachePolicy f10568g;

        /* renamed from: h */
        public final Function1 f10569h;

        /* renamed from: i */
        public final Function1 f10570i;

        /* renamed from: j */
        public final Function1 f10571j;

        /* renamed from: k */
        public final InterfaceC7925g f10572k;

        /* renamed from: l */
        public final Scale f10573l;

        /* renamed from: m */
        public final Precision f10574m;

        public c(FileSystem fileSystem, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, Function1 function1, Function1 function12, Function1 function13, InterfaceC7925g interfaceC7925g, Scale scale, Precision precision) {
            this.f10562a = fileSystem;
            this.f10563b = coroutineContext;
            this.f10564c = coroutineContext2;
            this.f10565d = coroutineContext3;
            this.f10566e = cachePolicy;
            this.f10567f = cachePolicy2;
            this.f10568g = cachePolicy3;
            this.f10569h = function1;
            this.f10570i = function12;
            this.f10571j = function13;
            this.f10572k = interfaceC7925g;
            this.f10573l = scale;
            this.f10574m = precision;
        }

        /* renamed from: a */
        public final CoroutineContext m9624a() {
            return this.f10565d;
        }

        /* renamed from: b */
        public final CachePolicy m9625b() {
            return this.f10567f;
        }

        /* renamed from: c */
        public final Function1 m9626c() {
            return this.f10570i;
        }

        /* renamed from: d */
        public final Function1 m9627d() {
            return this.f10571j;
        }

        /* renamed from: e */
        public final CoroutineContext m9628e() {
            return this.f10564c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f10562a, cVar.f10562a) && Intrinsics.areEqual(this.f10563b, cVar.f10563b) && Intrinsics.areEqual(this.f10564c, cVar.f10564c) && Intrinsics.areEqual(this.f10565d, cVar.f10565d) && this.f10566e == cVar.f10566e && this.f10567f == cVar.f10567f && this.f10568g == cVar.f10568g && Intrinsics.areEqual(this.f10569h, cVar.f10569h) && Intrinsics.areEqual(this.f10570i, cVar.f10570i) && Intrinsics.areEqual(this.f10571j, cVar.f10571j) && Intrinsics.areEqual(this.f10572k, cVar.f10572k) && this.f10573l == cVar.f10573l && this.f10574m == cVar.f10574m;
        }

        /* renamed from: f */
        public final FileSystem m9629f() {
            return this.f10562a;
        }

        /* renamed from: g */
        public final CoroutineContext m9630g() {
            return this.f10563b;
        }

        /* renamed from: h */
        public final CachePolicy m9631h() {
            return this.f10566e;
        }

        public int hashCode() {
            FileSystem fileSystem = this.f10562a;
            int iHashCode = (fileSystem == null ? 0 : fileSystem.hashCode()) * 31;
            CoroutineContext coroutineContext = this.f10563b;
            int iHashCode2 = (iHashCode + (coroutineContext == null ? 0 : coroutineContext.hashCode())) * 31;
            CoroutineContext coroutineContext2 = this.f10564c;
            int iHashCode3 = (iHashCode2 + (coroutineContext2 == null ? 0 : coroutineContext2.hashCode())) * 31;
            CoroutineContext coroutineContext3 = this.f10565d;
            int iHashCode4 = (iHashCode3 + (coroutineContext3 == null ? 0 : coroutineContext3.hashCode())) * 31;
            CachePolicy cachePolicy = this.f10566e;
            int iHashCode5 = (iHashCode4 + (cachePolicy == null ? 0 : cachePolicy.hashCode())) * 31;
            CachePolicy cachePolicy2 = this.f10567f;
            int iHashCode6 = (iHashCode5 + (cachePolicy2 == null ? 0 : cachePolicy2.hashCode())) * 31;
            CachePolicy cachePolicy3 = this.f10568g;
            int iHashCode7 = (iHashCode6 + (cachePolicy3 == null ? 0 : cachePolicy3.hashCode())) * 31;
            Function1 function1 = this.f10569h;
            int iHashCode8 = (iHashCode7 + (function1 == null ? 0 : function1.hashCode())) * 31;
            Function1 function12 = this.f10570i;
            int iHashCode9 = (iHashCode8 + (function12 == null ? 0 : function12.hashCode())) * 31;
            Function1 function13 = this.f10571j;
            int iHashCode10 = (iHashCode9 + (function13 == null ? 0 : function13.hashCode())) * 31;
            InterfaceC7925g interfaceC7925g = this.f10572k;
            int iHashCode11 = (iHashCode10 + (interfaceC7925g == null ? 0 : interfaceC7925g.hashCode())) * 31;
            Scale scale = this.f10573l;
            int iHashCode12 = (iHashCode11 + (scale == null ? 0 : scale.hashCode())) * 31;
            Precision precision = this.f10574m;
            return iHashCode12 + (precision != null ? precision.hashCode() : 0);
        }

        /* renamed from: i */
        public final CachePolicy m9632i() {
            return this.f10568g;
        }

        /* renamed from: j */
        public final Function1 m9633j() {
            return this.f10569h;
        }

        /* renamed from: k */
        public final Precision m9634k() {
            return this.f10574m;
        }

        /* renamed from: l */
        public final Scale m9635l() {
            return this.f10573l;
        }

        /* renamed from: m */
        public final InterfaceC7925g m9636m() {
            return this.f10572k;
        }

        public String toString() {
            return "Defined(fileSystem=" + this.f10562a + ", interceptorCoroutineContext=" + this.f10563b + ", fetcherCoroutineContext=" + this.f10564c + ", decoderCoroutineContext=" + this.f10565d + ", memoryCachePolicy=" + this.f10566e + ", diskCachePolicy=" + this.f10567f + ", networkCachePolicy=" + this.f10568g + ", placeholderFactory=" + this.f10569h + ", errorFactory=" + this.f10570i + ", fallbackFactory=" + this.f10571j + ", sizeResolver=" + this.f10572k + ", scale=" + this.f10573l + ", precision=" + this.f10574m + ')';
        }
    }

    /* renamed from: y.e$d */
    public interface d {
        /* renamed from: a */
        void mo1700a(C7872e c7872e, C7884q c7884q);

        /* renamed from: b */
        void mo1701b(C7872e c7872e, C7871d c7871d);

        /* renamed from: c */
        void mo1702c(C7872e c7872e);

        /* renamed from: d */
        void mo1703d(C7872e c7872e);
    }

    public /* synthetic */ C7872e(Context context, Object obj, InterfaceC0004a interfaceC0004a, d dVar, String str, Map map, String str2, FileSystem fileSystem, Pair pair, InterfaceC4565a.a aVar, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, InterfaceC7708d.b bVar, Function1 function1, Function1 function12, Function1 function13, InterfaceC7925g interfaceC7925g, Scale scale, Precision precision, C4550c c4550c, c cVar, b bVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, obj, interfaceC0004a, dVar, str, map, str2, fileSystem, pair, aVar, coroutineContext, coroutineContext2, coroutineContext3, cachePolicy, cachePolicy2, cachePolicy3, bVar, function1, function12, function13, interfaceC7925g, scale, precision, c4550c, cVar, bVar2);
    }

    /* renamed from: A */
    public static /* synthetic */ a m9570A(C7872e c7872e, Context context, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            context = c7872e.f10494a;
        }
        return c7872e.m9597z(context);
    }

    /* renamed from: B */
    public final InterfaceC6611j m9571B() {
        InterfaceC6611j interfaceC6611j = (InterfaceC6611j) this.f10511r.invoke(this);
        return interfaceC6611j == null ? (InterfaceC6611j) this.f10519z.m9620m().invoke(this) : interfaceC6611j;
    }

    /* renamed from: a */
    public final InterfaceC6611j m9572a() {
        InterfaceC6611j interfaceC6611j = (InterfaceC6611j) this.f10512s.invoke(this);
        return interfaceC6611j == null ? (InterfaceC6611j) this.f10519z.m9612e().invoke(this) : interfaceC6611j;
    }

    /* renamed from: b */
    public final InterfaceC6611j m9573b() {
        InterfaceC6611j interfaceC6611j = (InterfaceC6611j) this.f10513t.invoke(this);
        return interfaceC6611j == null ? (InterfaceC6611j) this.f10519z.m9614g().invoke(this) : interfaceC6611j;
    }

    /* renamed from: c */
    public final Context m9574c() {
        return this.f10494a;
    }

    /* renamed from: d */
    public final Object m9575d() {
        return this.f10495b;
    }

    /* renamed from: e */
    public final CoroutineContext m9576e() {
        return this.f10506m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7872e)) {
            return false;
        }
        C7872e c7872e = (C7872e) obj;
        return Intrinsics.areEqual(this.f10494a, c7872e.f10494a) && Intrinsics.areEqual(this.f10495b, c7872e.f10495b) && Intrinsics.areEqual(this.f10496c, c7872e.f10496c) && Intrinsics.areEqual(this.f10497d, c7872e.f10497d) && Intrinsics.areEqual(this.f10498e, c7872e.f10498e) && Intrinsics.areEqual(this.f10499f, c7872e.f10499f) && Intrinsics.areEqual(this.f10500g, c7872e.f10500g) && Intrinsics.areEqual(this.f10501h, c7872e.f10501h) && Intrinsics.areEqual(this.f10502i, c7872e.f10502i) && Intrinsics.areEqual(this.f10503j, c7872e.f10503j) && Intrinsics.areEqual(this.f10504k, c7872e.f10504k) && Intrinsics.areEqual(this.f10505l, c7872e.f10505l) && Intrinsics.areEqual(this.f10506m, c7872e.f10506m) && this.f10507n == c7872e.f10507n && this.f10508o == c7872e.f10508o && this.f10509p == c7872e.f10509p && Intrinsics.areEqual(this.f10510q, c7872e.f10510q) && Intrinsics.areEqual(this.f10511r, c7872e.f10511r) && Intrinsics.areEqual(this.f10512s, c7872e.f10512s) && Intrinsics.areEqual(this.f10513t, c7872e.f10513t) && Intrinsics.areEqual(this.f10514u, c7872e.f10514u) && this.f10515v == c7872e.f10515v && this.f10516w == c7872e.f10516w && Intrinsics.areEqual(this.f10517x, c7872e.f10517x) && Intrinsics.areEqual(this.f10518y, c7872e.f10518y) && Intrinsics.areEqual(this.f10519z, c7872e.f10519z);
    }

    /* renamed from: f */
    public final InterfaceC4565a.a m9577f() {
        return this.f10503j;
    }

    /* renamed from: g */
    public final b m9578g() {
        return this.f10519z;
    }

    /* renamed from: h */
    public final c m9579h() {
        return this.f10518y;
    }

    public int hashCode() {
        int iHashCode = ((this.f10494a.hashCode() * 31) + this.f10495b.hashCode()) * 31;
        InterfaceC0004a interfaceC0004a = this.f10496c;
        int iHashCode2 = (iHashCode + (interfaceC0004a == null ? 0 : interfaceC0004a.hashCode())) * 31;
        d dVar = this.f10497d;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.f10498e;
        int iHashCode4 = (((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.f10499f.hashCode()) * 31;
        String str2 = this.f10500g;
        int iHashCode5 = (((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f10501h.hashCode()) * 31;
        Pair pair = this.f10502i;
        int iHashCode6 = (iHashCode5 + (pair == null ? 0 : pair.hashCode())) * 31;
        InterfaceC4565a.a aVar = this.f10503j;
        int iHashCode7 = (((((((((((((iHashCode6 + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.f10504k.hashCode()) * 31) + this.f10505l.hashCode()) * 31) + this.f10506m.hashCode()) * 31) + this.f10507n.hashCode()) * 31) + this.f10508o.hashCode()) * 31) + this.f10509p.hashCode()) * 31;
        InterfaceC7708d.b bVar = this.f10510q;
        return ((((((((((((((((((iHashCode7 + (bVar != null ? bVar.hashCode() : 0)) * 31) + this.f10511r.hashCode()) * 31) + this.f10512s.hashCode()) * 31) + this.f10513t.hashCode()) * 31) + this.f10514u.hashCode()) * 31) + this.f10515v.hashCode()) * 31) + this.f10516w.hashCode()) * 31) + this.f10517x.hashCode()) * 31) + this.f10518y.hashCode()) * 31) + this.f10519z.hashCode();
    }

    /* renamed from: i */
    public final String m9580i() {
        return this.f10500g;
    }

    /* renamed from: j */
    public final CachePolicy m9581j() {
        return this.f10508o;
    }

    /* renamed from: k */
    public final C4550c m9582k() {
        return this.f10517x;
    }

    /* renamed from: l */
    public final CoroutineContext m9583l() {
        return this.f10505l;
    }

    /* renamed from: m */
    public final Pair m9584m() {
        return this.f10502i;
    }

    /* renamed from: n */
    public final FileSystem m9585n() {
        return this.f10501h;
    }

    /* renamed from: o */
    public final CoroutineContext m9586o() {
        return this.f10504k;
    }

    /* renamed from: p */
    public final d m9587p() {
        return this.f10497d;
    }

    /* renamed from: q */
    public final String m9588q() {
        return this.f10498e;
    }

    /* renamed from: r */
    public final Map m9589r() {
        return this.f10499f;
    }

    /* renamed from: s */
    public final CachePolicy m9590s() {
        return this.f10507n;
    }

    /* renamed from: t */
    public final CachePolicy m9591t() {
        return this.f10509p;
    }

    public String toString() {
        return "ImageRequest(context=" + this.f10494a + ", data=" + this.f10495b + ", target=" + this.f10496c + ", listener=" + this.f10497d + ", memoryCacheKey=" + this.f10498e + ", memoryCacheKeyExtras=" + this.f10499f + ", diskCacheKey=" + this.f10500g + ", fileSystem=" + this.f10501h + ", fetcherFactory=" + this.f10502i + ", decoderFactory=" + this.f10503j + ", interceptorCoroutineContext=" + this.f10504k + ", fetcherCoroutineContext=" + this.f10505l + ", decoderCoroutineContext=" + this.f10506m + ", memoryCachePolicy=" + this.f10507n + ", diskCachePolicy=" + this.f10508o + ", networkCachePolicy=" + this.f10509p + ", placeholderMemoryCacheKey=" + this.f10510q + ", placeholderFactory=" + this.f10511r + ", errorFactory=" + this.f10512s + ", fallbackFactory=" + this.f10513t + ", sizeResolver=" + this.f10514u + ", scale=" + this.f10515v + ", precision=" + this.f10516w + ", extras=" + this.f10517x + ", defined=" + this.f10518y + ", defaults=" + this.f10519z + ')';
    }

    /* renamed from: u */
    public final InterfaceC7708d.b m9592u() {
        return this.f10510q;
    }

    /* renamed from: v */
    public final Precision m9593v() {
        return this.f10516w;
    }

    /* renamed from: w */
    public final Scale m9594w() {
        return this.f10515v;
    }

    /* renamed from: x */
    public final InterfaceC7925g m9595x() {
        return this.f10514u;
    }

    /* renamed from: y */
    public final InterfaceC0004a m9596y() {
        return this.f10496c;
    }

    /* renamed from: z */
    public final a m9597z(Context context) {
        return new a(this, context);
    }

    public C7872e(Context context, Object obj, InterfaceC0004a interfaceC0004a, d dVar, String str, Map map, String str2, FileSystem fileSystem, Pair pair, InterfaceC4565a.a aVar, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, InterfaceC7708d.b bVar, Function1 function1, Function1 function12, Function1 function13, InterfaceC7925g interfaceC7925g, Scale scale, Precision precision, C4550c c4550c, c cVar, b bVar2) {
        this.f10494a = context;
        this.f10495b = obj;
        this.f10496c = interfaceC0004a;
        this.f10497d = dVar;
        this.f10498e = str;
        this.f10499f = map;
        this.f10500g = str2;
        this.f10501h = fileSystem;
        this.f10502i = pair;
        this.f10503j = aVar;
        this.f10504k = coroutineContext;
        this.f10505l = coroutineContext2;
        this.f10506m = coroutineContext3;
        this.f10507n = cachePolicy;
        this.f10508o = cachePolicy2;
        this.f10509p = cachePolicy3;
        this.f10510q = bVar;
        this.f10511r = function1;
        this.f10512s = function12;
        this.f10513t = function13;
        this.f10514u = interfaceC7925g;
        this.f10515v = scale;
        this.f10516w = precision;
        this.f10517x = c4550c;
        this.f10518y = cVar;
        this.f10519z = bVar2;
    }

    /* renamed from: y.e$b */
    public static final class b {

        /* renamed from: o */
        public static final a f10546o = new a(null);

        /* renamed from: p */
        public static final b f10547p = new b(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);

        /* renamed from: a */
        public final FileSystem f10548a;

        /* renamed from: b */
        public final CoroutineContext f10549b;

        /* renamed from: c */
        public final CoroutineContext f10550c;

        /* renamed from: d */
        public final CoroutineContext f10551d;

        /* renamed from: e */
        public final CachePolicy f10552e;

        /* renamed from: f */
        public final CachePolicy f10553f;

        /* renamed from: g */
        public final CachePolicy f10554g;

        /* renamed from: h */
        public final Function1 f10555h;

        /* renamed from: i */
        public final Function1 f10556i;

        /* renamed from: j */
        public final Function1 f10557j;

        /* renamed from: k */
        public final InterfaceC7925g f10558k;

        /* renamed from: l */
        public final Scale f10559l;

        /* renamed from: m */
        public final Precision f10560m;

        /* renamed from: n */
        public final C4550c f10561n;

        /* renamed from: y.e$b$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public a() {
            }
        }

        public b(FileSystem fileSystem, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, Function1 function1, Function1 function12, Function1 function13, InterfaceC7925g interfaceC7925g, Scale scale, Precision precision, C4550c c4550c) {
            this.f10548a = fileSystem;
            this.f10549b = coroutineContext;
            this.f10550c = coroutineContext2;
            this.f10551d = coroutineContext3;
            this.f10552e = cachePolicy;
            this.f10553f = cachePolicy2;
            this.f10554g = cachePolicy3;
            this.f10555h = function1;
            this.f10556i = function12;
            this.f10557j = function13;
            this.f10558k = interfaceC7925g;
            this.f10559l = scale;
            this.f10560m = precision;
            this.f10561n = c4550c;
        }

        /* renamed from: a */
        public final b m9609a(FileSystem fileSystem, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, Function1 function1, Function1 function12, Function1 function13, InterfaceC7925g interfaceC7925g, Scale scale, Precision precision, C4550c c4550c) {
            return new b(fileSystem, coroutineContext, coroutineContext2, coroutineContext3, cachePolicy, cachePolicy2, cachePolicy3, function1, function12, function13, interfaceC7925g, scale, precision, c4550c);
        }

        /* renamed from: c */
        public final CoroutineContext m9610c() {
            return this.f10551d;
        }

        /* renamed from: d */
        public final CachePolicy m9611d() {
            return this.f10553f;
        }

        /* renamed from: e */
        public final Function1 m9612e() {
            return this.f10556i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f10548a, bVar.f10548a) && Intrinsics.areEqual(this.f10549b, bVar.f10549b) && Intrinsics.areEqual(this.f10550c, bVar.f10550c) && Intrinsics.areEqual(this.f10551d, bVar.f10551d) && this.f10552e == bVar.f10552e && this.f10553f == bVar.f10553f && this.f10554g == bVar.f10554g && Intrinsics.areEqual(this.f10555h, bVar.f10555h) && Intrinsics.areEqual(this.f10556i, bVar.f10556i) && Intrinsics.areEqual(this.f10557j, bVar.f10557j) && Intrinsics.areEqual(this.f10558k, bVar.f10558k) && this.f10559l == bVar.f10559l && this.f10560m == bVar.f10560m && Intrinsics.areEqual(this.f10561n, bVar.f10561n);
        }

        /* renamed from: f */
        public final C4550c m9613f() {
            return this.f10561n;
        }

        /* renamed from: g */
        public final Function1 m9614g() {
            return this.f10557j;
        }

        /* renamed from: h */
        public final CoroutineContext m9615h() {
            return this.f10550c;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((this.f10548a.hashCode() * 31) + this.f10549b.hashCode()) * 31) + this.f10550c.hashCode()) * 31) + this.f10551d.hashCode()) * 31) + this.f10552e.hashCode()) * 31) + this.f10553f.hashCode()) * 31) + this.f10554g.hashCode()) * 31) + this.f10555h.hashCode()) * 31) + this.f10556i.hashCode()) * 31) + this.f10557j.hashCode()) * 31) + this.f10558k.hashCode()) * 31) + this.f10559l.hashCode()) * 31) + this.f10560m.hashCode()) * 31) + this.f10561n.hashCode();
        }

        /* renamed from: i */
        public final FileSystem m9616i() {
            return this.f10548a;
        }

        /* renamed from: j */
        public final CoroutineContext m9617j() {
            return this.f10549b;
        }

        /* renamed from: k */
        public final CachePolicy m9618k() {
            return this.f10552e;
        }

        /* renamed from: l */
        public final CachePolicy m9619l() {
            return this.f10554g;
        }

        /* renamed from: m */
        public final Function1 m9620m() {
            return this.f10555h;
        }

        /* renamed from: n */
        public final Precision m9621n() {
            return this.f10560m;
        }

        /* renamed from: o */
        public final Scale m9622o() {
            return this.f10559l;
        }

        /* renamed from: p */
        public final InterfaceC7925g m9623p() {
            return this.f10558k;
        }

        public String toString() {
            return "Defaults(fileSystem=" + this.f10548a + ", interceptorCoroutineContext=" + this.f10549b + ", fetcherCoroutineContext=" + this.f10550c + ", decoderCoroutineContext=" + this.f10551d + ", memoryCachePolicy=" + this.f10552e + ", diskCachePolicy=" + this.f10553f + ", networkCachePolicy=" + this.f10554g + ", placeholderFactory=" + this.f10555h + ", errorFactory=" + this.f10556i + ", fallbackFactory=" + this.f10557j + ", sizeResolver=" + this.f10558k + ", scale=" + this.f10559l + ", precision=" + this.f10560m + ", extras=" + this.f10561n + ')';
        }

        public /* synthetic */ b(FileSystem fileSystem, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, Function1 function1, Function1 function12, Function1 function13, InterfaceC7925g interfaceC7925g, Scale scale, Precision precision, C4550c c4550c, int i6, DefaultConstructorMarker defaultConstructorMarker) {
            this((i6 & 1) != 0 ? AbstractC4466k.m1545a() : fileSystem, (i6 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i6 & 4) != 0 ? AbstractC4459d.m1535a() : coroutineContext2, (i6 & 8) != 0 ? AbstractC4459d.m1535a() : coroutineContext3, (i6 & 16) != 0 ? CachePolicy.f1893c : cachePolicy, (i6 & 32) != 0 ? CachePolicy.f1893c : cachePolicy2, (i6 & 64) != 0 ? CachePolicy.f1893c : cachePolicy3, (i6 & 128) != 0 ? AbstractC4594c.m2043k() : function1, (i6 & 256) != 0 ? AbstractC4594c.m2043k() : function12, (i6 & 512) != 0 ? AbstractC4594c.m2043k() : function13, (i6 & 1024) != 0 ? InterfaceC7925g.f10647c0 : interfaceC7925g, (i6 & 2048) != 0 ? Scale.f1920b : scale, (i6 & 4096) != 0 ? Precision.f1915a : precision, (i6 & 8192) != 0 ? C4550c.f1504c : c4550c);
        }
    }

    /* renamed from: y.e$a */
    public static final class a {

        /* renamed from: a */
        public final Context f10520a;

        /* renamed from: b */
        public b f10521b;

        /* renamed from: c */
        public Object f10522c;

        /* renamed from: d */
        public InterfaceC0004a f10523d;

        /* renamed from: e */
        public d f10524e;

        /* renamed from: f */
        public String f10525f;

        /* renamed from: g */
        public boolean f10526g;

        /* renamed from: h */
        public Object f10527h;

        /* renamed from: i */
        public String f10528i;

        /* renamed from: j */
        public FileSystem f10529j;

        /* renamed from: k */
        public Pair f10530k;

        /* renamed from: l */
        public InterfaceC4565a.a f10531l;

        /* renamed from: m */
        public CoroutineContext f10532m;

        /* renamed from: n */
        public CoroutineContext f10533n;

        /* renamed from: o */
        public CoroutineContext f10534o;

        /* renamed from: p */
        public CachePolicy f10535p;

        /* renamed from: q */
        public CachePolicy f10536q;

        /* renamed from: r */
        public CachePolicy f10537r;

        /* renamed from: s */
        public InterfaceC7708d.b f10538s;

        /* renamed from: t */
        public Function1 f10539t;

        /* renamed from: u */
        public Function1 f10540u;

        /* renamed from: v */
        public Function1 f10541v;

        /* renamed from: w */
        public InterfaceC7925g f10542w;

        /* renamed from: x */
        public Scale f10543x;

        /* renamed from: y */
        public Precision f10544y;

        /* renamed from: z */
        public Object f10545z;

        public a(Context context) {
            this.f10520a = context;
            this.f10521b = b.f10547p;
            this.f10522c = null;
            this.f10523d = null;
            this.f10524e = null;
            this.f10525f = null;
            this.f10527h = MapsKt.emptyMap();
            this.f10528i = null;
            this.f10529j = null;
            this.f10530k = null;
            this.f10531l = null;
            this.f10532m = null;
            this.f10533n = null;
            this.f10534o = null;
            this.f10535p = null;
            this.f10536q = null;
            this.f10537r = null;
            this.f10538s = null;
            this.f10539t = AbstractC4594c.m2043k();
            this.f10540u = AbstractC4594c.m2043k();
            this.f10541v = AbstractC4594c.m2043k();
            this.f10542w = null;
            this.f10543x = null;
            this.f10544y = null;
            this.f10545z = C4550c.f1504c;
        }

        /* renamed from: a */
        public final C7872e m9598a() {
            Map mapM1527d;
            C4550c c4550cM1725a;
            Context context = this.f10520a;
            Object obj = this.f10522c;
            if (obj == null) {
                obj = C7878k.f10588a;
            }
            Object obj2 = obj;
            InterfaceC0004a interfaceC0004a = this.f10523d;
            d dVar = this.f10524e;
            String str = this.f10525f;
            Object obj3 = this.f10527h;
            if (Intrinsics.areEqual(obj3, Boolean.valueOf(this.f10526g))) {
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.collections.MutableMap<*, *>");
                mapM1527d = AbstractC4457b.m1527d(TypeIntrinsics.asMutableMap(obj3));
            } else {
                if (!(obj3 instanceof Map)) {
                    throw new AssertionError();
                }
                mapM1527d = (Map) obj3;
            }
            Map map = mapM1527d;
            Intrinsics.checkNotNull(map, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
            String str2 = this.f10528i;
            FileSystem fileSystemM9616i = this.f10529j;
            if (fileSystemM9616i == null) {
                fileSystemM9616i = this.f10521b.m9616i();
            }
            FileSystem fileSystem = fileSystemM9616i;
            Pair pair = this.f10530k;
            InterfaceC4565a.a aVar = this.f10531l;
            CachePolicy cachePolicyM9618k = this.f10535p;
            if (cachePolicyM9618k == null) {
                cachePolicyM9618k = this.f10521b.m9618k();
            }
            CachePolicy cachePolicy = cachePolicyM9618k;
            CachePolicy cachePolicyM9611d = this.f10536q;
            if (cachePolicyM9611d == null) {
                cachePolicyM9611d = this.f10521b.m9611d();
            }
            CachePolicy cachePolicy2 = cachePolicyM9611d;
            CachePolicy cachePolicyM9619l = this.f10537r;
            if (cachePolicyM9619l == null) {
                cachePolicyM9619l = this.f10521b.m9619l();
            }
            CachePolicy cachePolicy3 = cachePolicyM9619l;
            CoroutineContext coroutineContextM9617j = this.f10532m;
            if (coroutineContextM9617j == null) {
                coroutineContextM9617j = this.f10521b.m9617j();
            }
            CoroutineContext coroutineContext = coroutineContextM9617j;
            CoroutineContext coroutineContextM9615h = this.f10533n;
            if (coroutineContextM9615h == null) {
                coroutineContextM9615h = this.f10521b.m9615h();
            }
            CoroutineContext coroutineContext2 = coroutineContextM9615h;
            CoroutineContext coroutineContextM9610c = this.f10534o;
            if (coroutineContextM9610c == null) {
                coroutineContextM9610c = this.f10521b.m9610c();
            }
            CoroutineContext coroutineContext3 = coroutineContextM9610c;
            InterfaceC7708d.b bVar = this.f10538s;
            Function1 function1M9620m = this.f10539t;
            if (function1M9620m == null) {
                function1M9620m = this.f10521b.m9620m();
            }
            Function1 function1 = function1M9620m;
            Function1 function1M9612e = this.f10540u;
            if (function1M9612e == null) {
                function1M9612e = this.f10521b.m9612e();
            }
            Function1 function12 = function1M9612e;
            Function1 function1M9614g = this.f10541v;
            if (function1M9614g == null) {
                function1M9614g = this.f10521b.m9614g();
            }
            Function1 function13 = function1M9614g;
            InterfaceC7925g interfaceC7925gM9623p = this.f10542w;
            if (interfaceC7925gM9623p == null) {
                interfaceC7925gM9623p = this.f10521b.m9623p();
            }
            InterfaceC7925g interfaceC7925g = interfaceC7925gM9623p;
            Scale scaleM9622o = this.f10543x;
            if (scaleM9622o == null) {
                scaleM9622o = this.f10521b.m9622o();
            }
            Scale scale = scaleM9622o;
            Precision precisionM9621n = this.f10544y;
            if (precisionM9621n == null) {
                precisionM9621n = this.f10521b.m9621n();
            }
            Precision precision = precisionM9621n;
            Object obj4 = this.f10545z;
            if (obj4 instanceof C4550c.a) {
                c4550cM1725a = ((C4550c.a) obj4).m1725a();
            } else {
                if (!(obj4 instanceof C4550c)) {
                    throw new AssertionError();
                }
                c4550cM1725a = (C4550c) obj4;
            }
            return new C7872e(context, obj2, interfaceC0004a, dVar, str, map, str2, fileSystem, pair, aVar, coroutineContext, coroutineContext2, coroutineContext3, cachePolicy, cachePolicy2, cachePolicy3, bVar, function1, function12, function13, interfaceC7925g, scale, precision, c4550cM1725a, new c(this.f10529j, this.f10532m, this.f10533n, this.f10534o, this.f10535p, this.f10536q, this.f10537r, this.f10539t, this.f10540u, this.f10541v, this.f10542w, this.f10543x, this.f10544y), this.f10521b, null);
        }

        /* renamed from: b */
        public final a m9599b(CoroutineContext coroutineContext) {
            this.f10532m = coroutineContext;
            this.f10533n = coroutineContext;
            this.f10534o = coroutineContext;
            return this;
        }

        /* renamed from: c */
        public final a m9600c(Object obj) {
            this.f10522c = obj;
            return this;
        }

        /* renamed from: d */
        public final a m9601d(b bVar) {
            this.f10521b = bVar;
            return this;
        }

        /* renamed from: e */
        public final a m9602e(Function1 function1) {
            this.f10540u = function1;
            return this;
        }

        /* renamed from: f */
        public final a m9603f(Function1 function1) {
            this.f10539t = function1;
            return this;
        }

        /* renamed from: g */
        public final a m9604g(Precision precision) {
            this.f10544y = precision;
            return this;
        }

        /* renamed from: h */
        public final a m9605h(Scale scale) {
            this.f10543x = scale;
            return this;
        }

        /* renamed from: i */
        public final a m9606i(InterfaceC7925g interfaceC7925g) {
            this.f10542w = interfaceC7925g;
            return this;
        }

        /* renamed from: j */
        public final a m9607j(InterfaceC0004a interfaceC0004a) {
            this.f10523d = interfaceC0004a;
            return this;
        }

        public a(C7872e c7872e, Context context) {
            this.f10520a = context;
            this.f10521b = c7872e.m9578g();
            this.f10522c = c7872e.m9575d();
            this.f10523d = c7872e.m9596y();
            this.f10524e = c7872e.m9587p();
            this.f10525f = c7872e.m9588q();
            this.f10527h = c7872e.m9589r();
            this.f10528i = c7872e.m9580i();
            this.f10529j = c7872e.m9579h().m9629f();
            this.f10530k = c7872e.m9584m();
            this.f10531l = c7872e.m9577f();
            this.f10532m = c7872e.m9579h().m9630g();
            this.f10533n = c7872e.m9579h().m9628e();
            this.f10534o = c7872e.m9579h().m9624a();
            this.f10535p = c7872e.m9579h().m9631h();
            this.f10536q = c7872e.m9579h().m9625b();
            this.f10537r = c7872e.m9579h().m9632i();
            this.f10538s = c7872e.m9592u();
            this.f10539t = c7872e.m9579h().m9633j();
            this.f10540u = c7872e.m9579h().m9626c();
            this.f10541v = c7872e.m9579h().m9627d();
            this.f10542w = c7872e.m9579h().m9636m();
            this.f10543x = c7872e.m9579h().m9635l();
            this.f10544y = c7872e.m9579h().m9634k();
            this.f10545z = c7872e.m9582k();
        }
    }
}
