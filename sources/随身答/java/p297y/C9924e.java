package p297y;

import android.content.Context;
import coil3.C5304c;
import coil3.decode.InterfaceC5319a;
import coil3.request.CachePolicy;
import coil3.size.Precision;
import coil3.size.Scale;
import coil3.util.AbstractC5348c;
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
import p029c0.InterfaceC5217a;
import p090e0.AbstractC7804b;
import p090e0.AbstractC7806d;
import p090e0.AbstractC7812j;
import p151k.InterfaceC8239j;
import p247t.InterfaceC9595d;
import p307z.InterfaceC9977g;

/* renamed from: y.e */
/* loaded from: classes3.dex */
public final class C9924e {

    /* renamed from: a */
    public final Context f17755a;

    /* renamed from: b */
    public final Object f17756b;

    /* renamed from: c */
    public final InterfaceC5217a f17757c;

    /* renamed from: d */
    public final d f17758d;

    /* renamed from: e */
    public final String f17759e;

    /* renamed from: f */
    public final Map f17760f;

    /* renamed from: g */
    public final String f17761g;

    /* renamed from: h */
    public final FileSystem f17762h;

    /* renamed from: i */
    public final Pair f17763i;

    /* renamed from: j */
    public final InterfaceC5319a.a f17764j;

    /* renamed from: k */
    public final CoroutineContext f17765k;

    /* renamed from: l */
    public final CoroutineContext f17766l;

    /* renamed from: m */
    public final CoroutineContext f17767m;

    /* renamed from: n */
    public final CachePolicy f17768n;

    /* renamed from: o */
    public final CachePolicy f17769o;

    /* renamed from: p */
    public final CachePolicy f17770p;

    /* renamed from: q */
    public final InterfaceC9595d.b f17771q;

    /* renamed from: r */
    public final Function1 f17772r;

    /* renamed from: s */
    public final Function1 f17773s;

    /* renamed from: t */
    public final Function1 f17774t;

    /* renamed from: u */
    public final InterfaceC9977g f17775u;

    /* renamed from: v */
    public final Scale f17776v;

    /* renamed from: w */
    public final Precision f17777w;

    /* renamed from: x */
    public final C5304c f17778x;

    /* renamed from: y */
    public final c f17779y;

    /* renamed from: z */
    public final b f17780z;

    /* renamed from: y.e$c */
    public static final class c {

        /* renamed from: a */
        public final FileSystem f17823a;

        /* renamed from: b */
        public final CoroutineContext f17824b;

        /* renamed from: c */
        public final CoroutineContext f17825c;

        /* renamed from: d */
        public final CoroutineContext f17826d;

        /* renamed from: e */
        public final CachePolicy f17827e;

        /* renamed from: f */
        public final CachePolicy f17828f;

        /* renamed from: g */
        public final CachePolicy f17829g;

        /* renamed from: h */
        public final Function1 f17830h;

        /* renamed from: i */
        public final Function1 f17831i;

        /* renamed from: j */
        public final Function1 f17832j;

        /* renamed from: k */
        public final InterfaceC9977g f17833k;

        /* renamed from: l */
        public final Scale f17834l;

        /* renamed from: m */
        public final Precision f17835m;

        public c(FileSystem fileSystem, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, Function1 function1, Function1 function12, Function1 function13, InterfaceC9977g interfaceC9977g, Scale scale, Precision precision) {
            this.f17823a = fileSystem;
            this.f17824b = coroutineContext;
            this.f17825c = coroutineContext2;
            this.f17826d = coroutineContext3;
            this.f17827e = cachePolicy;
            this.f17828f = cachePolicy2;
            this.f17829g = cachePolicy3;
            this.f17830h = function1;
            this.f17831i = function12;
            this.f17832j = function13;
            this.f17833k = interfaceC9977g;
            this.f17834l = scale;
            this.f17835m = precision;
        }

        /* renamed from: a */
        public final CoroutineContext m17070a() {
            return this.f17826d;
        }

        /* renamed from: b */
        public final CachePolicy m17071b() {
            return this.f17828f;
        }

        /* renamed from: c */
        public final Function1 m17072c() {
            return this.f17831i;
        }

        /* renamed from: d */
        public final Function1 m17073d() {
            return this.f17832j;
        }

        /* renamed from: e */
        public final CoroutineContext m17074e() {
            return this.f17825c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.areEqual(this.f17823a, cVar.f17823a) && Intrinsics.areEqual(this.f17824b, cVar.f17824b) && Intrinsics.areEqual(this.f17825c, cVar.f17825c) && Intrinsics.areEqual(this.f17826d, cVar.f17826d) && this.f17827e == cVar.f17827e && this.f17828f == cVar.f17828f && this.f17829g == cVar.f17829g && Intrinsics.areEqual(this.f17830h, cVar.f17830h) && Intrinsics.areEqual(this.f17831i, cVar.f17831i) && Intrinsics.areEqual(this.f17832j, cVar.f17832j) && Intrinsics.areEqual(this.f17833k, cVar.f17833k) && this.f17834l == cVar.f17834l && this.f17835m == cVar.f17835m;
        }

        /* renamed from: f */
        public final FileSystem m17075f() {
            return this.f17823a;
        }

        /* renamed from: g */
        public final CoroutineContext m17076g() {
            return this.f17824b;
        }

        /* renamed from: h */
        public final CachePolicy m17077h() {
            return this.f17827e;
        }

        public int hashCode() {
            FileSystem fileSystem = this.f17823a;
            int iHashCode = (fileSystem == null ? 0 : fileSystem.hashCode()) * 31;
            CoroutineContext coroutineContext = this.f17824b;
            int iHashCode2 = (iHashCode + (coroutineContext == null ? 0 : coroutineContext.hashCode())) * 31;
            CoroutineContext coroutineContext2 = this.f17825c;
            int iHashCode3 = (iHashCode2 + (coroutineContext2 == null ? 0 : coroutineContext2.hashCode())) * 31;
            CoroutineContext coroutineContext3 = this.f17826d;
            int iHashCode4 = (iHashCode3 + (coroutineContext3 == null ? 0 : coroutineContext3.hashCode())) * 31;
            CachePolicy cachePolicy = this.f17827e;
            int iHashCode5 = (iHashCode4 + (cachePolicy == null ? 0 : cachePolicy.hashCode())) * 31;
            CachePolicy cachePolicy2 = this.f17828f;
            int iHashCode6 = (iHashCode5 + (cachePolicy2 == null ? 0 : cachePolicy2.hashCode())) * 31;
            CachePolicy cachePolicy3 = this.f17829g;
            int iHashCode7 = (iHashCode6 + (cachePolicy3 == null ? 0 : cachePolicy3.hashCode())) * 31;
            Function1 function1 = this.f17830h;
            int iHashCode8 = (iHashCode7 + (function1 == null ? 0 : function1.hashCode())) * 31;
            Function1 function12 = this.f17831i;
            int iHashCode9 = (iHashCode8 + (function12 == null ? 0 : function12.hashCode())) * 31;
            Function1 function13 = this.f17832j;
            int iHashCode10 = (iHashCode9 + (function13 == null ? 0 : function13.hashCode())) * 31;
            InterfaceC9977g interfaceC9977g = this.f17833k;
            int iHashCode11 = (iHashCode10 + (interfaceC9977g == null ? 0 : interfaceC9977g.hashCode())) * 31;
            Scale scale = this.f17834l;
            int iHashCode12 = (iHashCode11 + (scale == null ? 0 : scale.hashCode())) * 31;
            Precision precision = this.f17835m;
            return iHashCode12 + (precision != null ? precision.hashCode() : 0);
        }

        /* renamed from: i */
        public final CachePolicy m17078i() {
            return this.f17829g;
        }

        /* renamed from: j */
        public final Function1 m17079j() {
            return this.f17830h;
        }

        /* renamed from: k */
        public final Precision m17080k() {
            return this.f17835m;
        }

        /* renamed from: l */
        public final Scale m17081l() {
            return this.f17834l;
        }

        /* renamed from: m */
        public final InterfaceC9977g m17082m() {
            return this.f17833k;
        }

        public String toString() {
            return "Defined(fileSystem=" + this.f17823a + ", interceptorCoroutineContext=" + this.f17824b + ", fetcherCoroutineContext=" + this.f17825c + ", decoderCoroutineContext=" + this.f17826d + ", memoryCachePolicy=" + this.f17827e + ", diskCachePolicy=" + this.f17828f + ", networkCachePolicy=" + this.f17829g + ", placeholderFactory=" + this.f17830h + ", errorFactory=" + this.f17831i + ", fallbackFactory=" + this.f17832j + ", sizeResolver=" + this.f17833k + ", scale=" + this.f17834l + ", precision=" + this.f17835m + ')';
        }
    }

    /* renamed from: y.e$d */
    public interface d {
        /* renamed from: a */
        void mo2594a(C9924e c9924e, C9936q c9936q);

        /* renamed from: b */
        void mo2595b(C9924e c9924e, C9923d c9923d);

        /* renamed from: c */
        void mo2596c(C9924e c9924e);

        /* renamed from: d */
        void mo2597d(C9924e c9924e);
    }

    public /* synthetic */ C9924e(Context context, Object obj, InterfaceC5217a interfaceC5217a, d dVar, String str, Map map, String str2, FileSystem fileSystem, Pair pair, InterfaceC5319a.a aVar, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, InterfaceC9595d.b bVar, Function1 function1, Function1 function12, Function1 function13, InterfaceC9977g interfaceC9977g, Scale scale, Precision precision, C5304c c5304c, c cVar, b bVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, obj, interfaceC5217a, dVar, str, map, str2, fileSystem, pair, aVar, coroutineContext, coroutineContext2, coroutineContext3, cachePolicy, cachePolicy2, cachePolicy3, bVar, function1, function12, function13, interfaceC9977g, scale, precision, c5304c, cVar, bVar2);
    }

    /* renamed from: A */
    public static /* synthetic */ a m17015A(C9924e c9924e, Context context, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            context = c9924e.f17755a;
        }
        return c9924e.m17042z(context);
    }

    /* renamed from: B */
    public final InterfaceC8239j m17016B() {
        InterfaceC8239j interfaceC8239j = (InterfaceC8239j) this.f17772r.invoke(this);
        return interfaceC8239j == null ? (InterfaceC8239j) this.f17780z.m17066m().invoke(this) : interfaceC8239j;
    }

    /* renamed from: a */
    public final InterfaceC8239j m17017a() {
        InterfaceC8239j interfaceC8239j = (InterfaceC8239j) this.f17773s.invoke(this);
        return interfaceC8239j == null ? (InterfaceC8239j) this.f17780z.m17058e().invoke(this) : interfaceC8239j;
    }

    /* renamed from: b */
    public final InterfaceC8239j m17018b() {
        InterfaceC8239j interfaceC8239j = (InterfaceC8239j) this.f17774t.invoke(this);
        return interfaceC8239j == null ? (InterfaceC8239j) this.f17780z.m17060g().invoke(this) : interfaceC8239j;
    }

    /* renamed from: c */
    public final Context m17019c() {
        return this.f17755a;
    }

    /* renamed from: d */
    public final Object m17020d() {
        return this.f17756b;
    }

    /* renamed from: e */
    public final CoroutineContext m17021e() {
        return this.f17767m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9924e)) {
            return false;
        }
        C9924e c9924e = (C9924e) obj;
        return Intrinsics.areEqual(this.f17755a, c9924e.f17755a) && Intrinsics.areEqual(this.f17756b, c9924e.f17756b) && Intrinsics.areEqual(this.f17757c, c9924e.f17757c) && Intrinsics.areEqual(this.f17758d, c9924e.f17758d) && Intrinsics.areEqual(this.f17759e, c9924e.f17759e) && Intrinsics.areEqual(this.f17760f, c9924e.f17760f) && Intrinsics.areEqual(this.f17761g, c9924e.f17761g) && Intrinsics.areEqual(this.f17762h, c9924e.f17762h) && Intrinsics.areEqual(this.f17763i, c9924e.f17763i) && Intrinsics.areEqual(this.f17764j, c9924e.f17764j) && Intrinsics.areEqual(this.f17765k, c9924e.f17765k) && Intrinsics.areEqual(this.f17766l, c9924e.f17766l) && Intrinsics.areEqual(this.f17767m, c9924e.f17767m) && this.f17768n == c9924e.f17768n && this.f17769o == c9924e.f17769o && this.f17770p == c9924e.f17770p && Intrinsics.areEqual(this.f17771q, c9924e.f17771q) && Intrinsics.areEqual(this.f17772r, c9924e.f17772r) && Intrinsics.areEqual(this.f17773s, c9924e.f17773s) && Intrinsics.areEqual(this.f17774t, c9924e.f17774t) && Intrinsics.areEqual(this.f17775u, c9924e.f17775u) && this.f17776v == c9924e.f17776v && this.f17777w == c9924e.f17777w && Intrinsics.areEqual(this.f17778x, c9924e.f17778x) && Intrinsics.areEqual(this.f17779y, c9924e.f17779y) && Intrinsics.areEqual(this.f17780z, c9924e.f17780z);
    }

    /* renamed from: f */
    public final InterfaceC5319a.a m17022f() {
        return this.f17764j;
    }

    /* renamed from: g */
    public final b m17023g() {
        return this.f17780z;
    }

    /* renamed from: h */
    public final c m17024h() {
        return this.f17779y;
    }

    public int hashCode() {
        int iHashCode = ((this.f17755a.hashCode() * 31) + this.f17756b.hashCode()) * 31;
        InterfaceC5217a interfaceC5217a = this.f17757c;
        int iHashCode2 = (iHashCode + (interfaceC5217a == null ? 0 : interfaceC5217a.hashCode())) * 31;
        d dVar = this.f17758d;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.f17759e;
        int iHashCode4 = (((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.f17760f.hashCode()) * 31;
        String str2 = this.f17761g;
        int iHashCode5 = (((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f17762h.hashCode()) * 31;
        Pair pair = this.f17763i;
        int iHashCode6 = (iHashCode5 + (pair == null ? 0 : pair.hashCode())) * 31;
        InterfaceC5319a.a aVar = this.f17764j;
        int iHashCode7 = (((((((((((((iHashCode6 + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.f17765k.hashCode()) * 31) + this.f17766l.hashCode()) * 31) + this.f17767m.hashCode()) * 31) + this.f17768n.hashCode()) * 31) + this.f17769o.hashCode()) * 31) + this.f17770p.hashCode()) * 31;
        InterfaceC9595d.b bVar = this.f17771q;
        return ((((((((((((((((((iHashCode7 + (bVar != null ? bVar.hashCode() : 0)) * 31) + this.f17772r.hashCode()) * 31) + this.f17773s.hashCode()) * 31) + this.f17774t.hashCode()) * 31) + this.f17775u.hashCode()) * 31) + this.f17776v.hashCode()) * 31) + this.f17777w.hashCode()) * 31) + this.f17778x.hashCode()) * 31) + this.f17779y.hashCode()) * 31) + this.f17780z.hashCode();
    }

    /* renamed from: i */
    public final String m17025i() {
        return this.f17761g;
    }

    /* renamed from: j */
    public final CachePolicy m17026j() {
        return this.f17769o;
    }

    /* renamed from: k */
    public final C5304c m17027k() {
        return this.f17778x;
    }

    /* renamed from: l */
    public final CoroutineContext m17028l() {
        return this.f17766l;
    }

    /* renamed from: m */
    public final Pair m17029m() {
        return this.f17763i;
    }

    /* renamed from: n */
    public final FileSystem m17030n() {
        return this.f17762h;
    }

    /* renamed from: o */
    public final CoroutineContext m17031o() {
        return this.f17765k;
    }

    /* renamed from: p */
    public final d m17032p() {
        return this.f17758d;
    }

    /* renamed from: q */
    public final String m17033q() {
        return this.f17759e;
    }

    /* renamed from: r */
    public final Map m17034r() {
        return this.f17760f;
    }

    /* renamed from: s */
    public final CachePolicy m17035s() {
        return this.f17768n;
    }

    /* renamed from: t */
    public final CachePolicy m17036t() {
        return this.f17770p;
    }

    public String toString() {
        return "ImageRequest(context=" + this.f17755a + ", data=" + this.f17756b + ", target=" + this.f17757c + ", listener=" + this.f17758d + ", memoryCacheKey=" + this.f17759e + ", memoryCacheKeyExtras=" + this.f17760f + ", diskCacheKey=" + this.f17761g + ", fileSystem=" + this.f17762h + ", fetcherFactory=" + this.f17763i + ", decoderFactory=" + this.f17764j + ", interceptorCoroutineContext=" + this.f17765k + ", fetcherCoroutineContext=" + this.f17766l + ", decoderCoroutineContext=" + this.f17767m + ", memoryCachePolicy=" + this.f17768n + ", diskCachePolicy=" + this.f17769o + ", networkCachePolicy=" + this.f17770p + ", placeholderMemoryCacheKey=" + this.f17771q + ", placeholderFactory=" + this.f17772r + ", errorFactory=" + this.f17773s + ", fallbackFactory=" + this.f17774t + ", sizeResolver=" + this.f17775u + ", scale=" + this.f17776v + ", precision=" + this.f17777w + ", extras=" + this.f17778x + ", defined=" + this.f17779y + ", defaults=" + this.f17780z + ')';
    }

    /* renamed from: u */
    public final InterfaceC9595d.b m17037u() {
        return this.f17771q;
    }

    /* renamed from: v */
    public final Precision m17038v() {
        return this.f17777w;
    }

    /* renamed from: w */
    public final Scale m17039w() {
        return this.f17776v;
    }

    /* renamed from: x */
    public final InterfaceC9977g m17040x() {
        return this.f17775u;
    }

    /* renamed from: y */
    public final InterfaceC5217a m17041y() {
        return this.f17757c;
    }

    /* renamed from: z */
    public final a m17042z(Context context) {
        return new a(this, context);
    }

    public C9924e(Context context, Object obj, InterfaceC5217a interfaceC5217a, d dVar, String str, Map map, String str2, FileSystem fileSystem, Pair pair, InterfaceC5319a.a aVar, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, InterfaceC9595d.b bVar, Function1 function1, Function1 function12, Function1 function13, InterfaceC9977g interfaceC9977g, Scale scale, Precision precision, C5304c c5304c, c cVar, b bVar2) {
        this.f17755a = context;
        this.f17756b = obj;
        this.f17757c = interfaceC5217a;
        this.f17758d = dVar;
        this.f17759e = str;
        this.f17760f = map;
        this.f17761g = str2;
        this.f17762h = fileSystem;
        this.f17763i = pair;
        this.f17764j = aVar;
        this.f17765k = coroutineContext;
        this.f17766l = coroutineContext2;
        this.f17767m = coroutineContext3;
        this.f17768n = cachePolicy;
        this.f17769o = cachePolicy2;
        this.f17770p = cachePolicy3;
        this.f17771q = bVar;
        this.f17772r = function1;
        this.f17773s = function12;
        this.f17774t = function13;
        this.f17775u = interfaceC9977g;
        this.f17776v = scale;
        this.f17777w = precision;
        this.f17778x = c5304c;
        this.f17779y = cVar;
        this.f17780z = bVar2;
    }

    /* renamed from: y.e$b */
    public static final class b {

        /* renamed from: o */
        public static final a f17807o = new a(null);

        /* renamed from: p */
        public static final b f17808p = new b(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);

        /* renamed from: a */
        public final FileSystem f17809a;

        /* renamed from: b */
        public final CoroutineContext f17810b;

        /* renamed from: c */
        public final CoroutineContext f17811c;

        /* renamed from: d */
        public final CoroutineContext f17812d;

        /* renamed from: e */
        public final CachePolicy f17813e;

        /* renamed from: f */
        public final CachePolicy f17814f;

        /* renamed from: g */
        public final CachePolicy f17815g;

        /* renamed from: h */
        public final Function1 f17816h;

        /* renamed from: i */
        public final Function1 f17817i;

        /* renamed from: j */
        public final Function1 f17818j;

        /* renamed from: k */
        public final InterfaceC9977g f17819k;

        /* renamed from: l */
        public final Scale f17820l;

        /* renamed from: m */
        public final Precision f17821m;

        /* renamed from: n */
        public final C5304c f17822n;

        /* renamed from: y.e$b$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public a() {
            }
        }

        public b(FileSystem fileSystem, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, Function1 function1, Function1 function12, Function1 function13, InterfaceC9977g interfaceC9977g, Scale scale, Precision precision, C5304c c5304c) {
            this.f17809a = fileSystem;
            this.f17810b = coroutineContext;
            this.f17811c = coroutineContext2;
            this.f17812d = coroutineContext3;
            this.f17813e = cachePolicy;
            this.f17814f = cachePolicy2;
            this.f17815g = cachePolicy3;
            this.f17816h = function1;
            this.f17817i = function12;
            this.f17818j = function13;
            this.f17819k = interfaceC9977g;
            this.f17820l = scale;
            this.f17821m = precision;
            this.f17822n = c5304c;
        }

        /* renamed from: a */
        public final b m17055a(FileSystem fileSystem, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, Function1 function1, Function1 function12, Function1 function13, InterfaceC9977g interfaceC9977g, Scale scale, Precision precision, C5304c c5304c) {
            return new b(fileSystem, coroutineContext, coroutineContext2, coroutineContext3, cachePolicy, cachePolicy2, cachePolicy3, function1, function12, function13, interfaceC9977g, scale, precision, c5304c);
        }

        /* renamed from: c */
        public final CoroutineContext m17056c() {
            return this.f17812d;
        }

        /* renamed from: d */
        public final CachePolicy m17057d() {
            return this.f17814f;
        }

        /* renamed from: e */
        public final Function1 m17058e() {
            return this.f17817i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f17809a, bVar.f17809a) && Intrinsics.areEqual(this.f17810b, bVar.f17810b) && Intrinsics.areEqual(this.f17811c, bVar.f17811c) && Intrinsics.areEqual(this.f17812d, bVar.f17812d) && this.f17813e == bVar.f17813e && this.f17814f == bVar.f17814f && this.f17815g == bVar.f17815g && Intrinsics.areEqual(this.f17816h, bVar.f17816h) && Intrinsics.areEqual(this.f17817i, bVar.f17817i) && Intrinsics.areEqual(this.f17818j, bVar.f17818j) && Intrinsics.areEqual(this.f17819k, bVar.f17819k) && this.f17820l == bVar.f17820l && this.f17821m == bVar.f17821m && Intrinsics.areEqual(this.f17822n, bVar.f17822n);
        }

        /* renamed from: f */
        public final C5304c m17059f() {
            return this.f17822n;
        }

        /* renamed from: g */
        public final Function1 m17060g() {
            return this.f17818j;
        }

        /* renamed from: h */
        public final CoroutineContext m17061h() {
            return this.f17811c;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((this.f17809a.hashCode() * 31) + this.f17810b.hashCode()) * 31) + this.f17811c.hashCode()) * 31) + this.f17812d.hashCode()) * 31) + this.f17813e.hashCode()) * 31) + this.f17814f.hashCode()) * 31) + this.f17815g.hashCode()) * 31) + this.f17816h.hashCode()) * 31) + this.f17817i.hashCode()) * 31) + this.f17818j.hashCode()) * 31) + this.f17819k.hashCode()) * 31) + this.f17820l.hashCode()) * 31) + this.f17821m.hashCode()) * 31) + this.f17822n.hashCode();
        }

        /* renamed from: i */
        public final FileSystem m17062i() {
            return this.f17809a;
        }

        /* renamed from: j */
        public final CoroutineContext m17063j() {
            return this.f17810b;
        }

        /* renamed from: k */
        public final CachePolicy m17064k() {
            return this.f17813e;
        }

        /* renamed from: l */
        public final CachePolicy m17065l() {
            return this.f17815g;
        }

        /* renamed from: m */
        public final Function1 m17066m() {
            return this.f17816h;
        }

        /* renamed from: n */
        public final Precision m17067n() {
            return this.f17821m;
        }

        /* renamed from: o */
        public final Scale m17068o() {
            return this.f17820l;
        }

        /* renamed from: p */
        public final InterfaceC9977g m17069p() {
            return this.f17819k;
        }

        public String toString() {
            return "Defaults(fileSystem=" + this.f17809a + ", interceptorCoroutineContext=" + this.f17810b + ", fetcherCoroutineContext=" + this.f17811c + ", decoderCoroutineContext=" + this.f17812d + ", memoryCachePolicy=" + this.f17813e + ", diskCachePolicy=" + this.f17814f + ", networkCachePolicy=" + this.f17815g + ", placeholderFactory=" + this.f17816h + ", errorFactory=" + this.f17817i + ", fallbackFactory=" + this.f17818j + ", sizeResolver=" + this.f17819k + ", scale=" + this.f17820l + ", precision=" + this.f17821m + ", extras=" + this.f17822n + ')';
        }

        public /* synthetic */ b(FileSystem fileSystem, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CoroutineContext coroutineContext3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, Function1 function1, Function1 function12, Function1 function13, InterfaceC9977g interfaceC9977g, Scale scale, Precision precision, C5304c c5304c, int i9, DefaultConstructorMarker defaultConstructorMarker) {
            this((i9 & 1) != 0 ? AbstractC7812j.m12195a() : fileSystem, (i9 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i9 & 4) != 0 ? AbstractC7806d.m12186a() : coroutineContext2, (i9 & 8) != 0 ? AbstractC7806d.m12186a() : coroutineContext3, (i9 & 16) != 0 ? CachePolicy.f3097c : cachePolicy, (i9 & 32) != 0 ? CachePolicy.f3097c : cachePolicy2, (i9 & 64) != 0 ? CachePolicy.f3097c : cachePolicy3, (i9 & 128) != 0 ? AbstractC5348c.m2934k() : function1, (i9 & 256) != 0 ? AbstractC5348c.m2934k() : function12, (i9 & 512) != 0 ? AbstractC5348c.m2934k() : function13, (i9 & 1024) != 0 ? InterfaceC9977g.f17948b0 : interfaceC9977g, (i9 & 2048) != 0 ? Scale.f3124b : scale, (i9 & 4096) != 0 ? Precision.f3119a : precision, (i9 & 8192) != 0 ? C5304c.f2755c : c5304c);
        }
    }

    /* renamed from: y.e$a */
    public static final class a {

        /* renamed from: a */
        public final Context f17781a;

        /* renamed from: b */
        public b f17782b;

        /* renamed from: c */
        public Object f17783c;

        /* renamed from: d */
        public InterfaceC5217a f17784d;

        /* renamed from: e */
        public d f17785e;

        /* renamed from: f */
        public String f17786f;

        /* renamed from: g */
        public boolean f17787g;

        /* renamed from: h */
        public Object f17788h;

        /* renamed from: i */
        public String f17789i;

        /* renamed from: j */
        public FileSystem f17790j;

        /* renamed from: k */
        public Pair f17791k;

        /* renamed from: l */
        public InterfaceC5319a.a f17792l;

        /* renamed from: m */
        public CoroutineContext f17793m;

        /* renamed from: n */
        public CoroutineContext f17794n;

        /* renamed from: o */
        public CoroutineContext f17795o;

        /* renamed from: p */
        public CachePolicy f17796p;

        /* renamed from: q */
        public CachePolicy f17797q;

        /* renamed from: r */
        public CachePolicy f17798r;

        /* renamed from: s */
        public InterfaceC9595d.b f17799s;

        /* renamed from: t */
        public Function1 f17800t;

        /* renamed from: u */
        public Function1 f17801u;

        /* renamed from: v */
        public Function1 f17802v;

        /* renamed from: w */
        public InterfaceC9977g f17803w;

        /* renamed from: x */
        public Scale f17804x;

        /* renamed from: y */
        public Precision f17805y;

        /* renamed from: z */
        public Object f17806z;

        public a(Context context) {
            this.f17781a = context;
            this.f17782b = b.f17808p;
            this.f17783c = null;
            this.f17784d = null;
            this.f17785e = null;
            this.f17786f = null;
            this.f17788h = MapsKt.emptyMap();
            this.f17789i = null;
            this.f17790j = null;
            this.f17791k = null;
            this.f17792l = null;
            this.f17793m = null;
            this.f17794n = null;
            this.f17795o = null;
            this.f17796p = null;
            this.f17797q = null;
            this.f17798r = null;
            this.f17799s = null;
            this.f17800t = AbstractC5348c.m2934k();
            this.f17801u = AbstractC5348c.m2934k();
            this.f17802v = AbstractC5348c.m2934k();
            this.f17803w = null;
            this.f17804x = null;
            this.f17805y = null;
            this.f17806z = C5304c.f2755c;
        }

        /* renamed from: a */
        public final C9924e m17043a() {
            Map mapM12178d;
            C5304c c5304cM2619a;
            Context context = this.f17781a;
            Object obj = this.f17783c;
            if (obj == null) {
                obj = C9930k.f17849a;
            }
            Object obj2 = obj;
            InterfaceC5217a interfaceC5217a = this.f17784d;
            d dVar = this.f17785e;
            String str = this.f17786f;
            Object obj3 = this.f17788h;
            if (Intrinsics.areEqual(obj3, Boolean.valueOf(this.f17787g))) {
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.collections.MutableMap<*, *>");
                mapM12178d = AbstractC7804b.m12178d(TypeIntrinsics.asMutableMap(obj3));
            } else {
                if (!(obj3 instanceof Map)) {
                    throw new AssertionError();
                }
                mapM12178d = (Map) obj3;
            }
            Map map = mapM12178d;
            Intrinsics.checkNotNull(map, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
            String str2 = this.f17789i;
            FileSystem fileSystemM17062i = this.f17790j;
            if (fileSystemM17062i == null) {
                fileSystemM17062i = this.f17782b.m17062i();
            }
            FileSystem fileSystem = fileSystemM17062i;
            Pair pair = this.f17791k;
            InterfaceC5319a.a aVar = this.f17792l;
            CachePolicy cachePolicyM17064k = this.f17796p;
            if (cachePolicyM17064k == null) {
                cachePolicyM17064k = this.f17782b.m17064k();
            }
            CachePolicy cachePolicy = cachePolicyM17064k;
            CachePolicy cachePolicyM17057d = this.f17797q;
            if (cachePolicyM17057d == null) {
                cachePolicyM17057d = this.f17782b.m17057d();
            }
            CachePolicy cachePolicy2 = cachePolicyM17057d;
            CachePolicy cachePolicyM17065l = this.f17798r;
            if (cachePolicyM17065l == null) {
                cachePolicyM17065l = this.f17782b.m17065l();
            }
            CachePolicy cachePolicy3 = cachePolicyM17065l;
            CoroutineContext coroutineContextM17063j = this.f17793m;
            if (coroutineContextM17063j == null) {
                coroutineContextM17063j = this.f17782b.m17063j();
            }
            CoroutineContext coroutineContext = coroutineContextM17063j;
            CoroutineContext coroutineContextM17061h = this.f17794n;
            if (coroutineContextM17061h == null) {
                coroutineContextM17061h = this.f17782b.m17061h();
            }
            CoroutineContext coroutineContext2 = coroutineContextM17061h;
            CoroutineContext coroutineContextM17056c = this.f17795o;
            if (coroutineContextM17056c == null) {
                coroutineContextM17056c = this.f17782b.m17056c();
            }
            CoroutineContext coroutineContext3 = coroutineContextM17056c;
            InterfaceC9595d.b bVar = this.f17799s;
            Function1 function1M17066m = this.f17800t;
            if (function1M17066m == null) {
                function1M17066m = this.f17782b.m17066m();
            }
            Function1 function1 = function1M17066m;
            Function1 function1M17058e = this.f17801u;
            if (function1M17058e == null) {
                function1M17058e = this.f17782b.m17058e();
            }
            Function1 function12 = function1M17058e;
            Function1 function1M17060g = this.f17802v;
            if (function1M17060g == null) {
                function1M17060g = this.f17782b.m17060g();
            }
            Function1 function13 = function1M17060g;
            InterfaceC9977g interfaceC9977gM17069p = this.f17803w;
            if (interfaceC9977gM17069p == null) {
                interfaceC9977gM17069p = this.f17782b.m17069p();
            }
            InterfaceC9977g interfaceC9977g = interfaceC9977gM17069p;
            Scale scaleM17068o = this.f17804x;
            if (scaleM17068o == null) {
                scaleM17068o = this.f17782b.m17068o();
            }
            Scale scale = scaleM17068o;
            Precision precisionM17067n = this.f17805y;
            if (precisionM17067n == null) {
                precisionM17067n = this.f17782b.m17067n();
            }
            Precision precision = precisionM17067n;
            Object obj4 = this.f17806z;
            if (obj4 instanceof C5304c.a) {
                c5304cM2619a = ((C5304c.a) obj4).m2619a();
            } else {
                if (!(obj4 instanceof C5304c)) {
                    throw new AssertionError();
                }
                c5304cM2619a = (C5304c) obj4;
            }
            return new C9924e(context, obj2, interfaceC5217a, dVar, str, map, str2, fileSystem, pair, aVar, coroutineContext, coroutineContext2, coroutineContext3, cachePolicy, cachePolicy2, cachePolicy3, bVar, function1, function12, function13, interfaceC9977g, scale, precision, c5304cM2619a, new c(this.f17790j, this.f17793m, this.f17794n, this.f17795o, this.f17796p, this.f17797q, this.f17798r, this.f17800t, this.f17801u, this.f17802v, this.f17803w, this.f17804x, this.f17805y), this.f17782b, null);
        }

        /* renamed from: b */
        public final a m17044b(CoroutineContext coroutineContext) {
            this.f17793m = coroutineContext;
            this.f17794n = coroutineContext;
            this.f17795o = coroutineContext;
            return this;
        }

        /* renamed from: c */
        public final a m17045c(Object obj) {
            this.f17783c = obj;
            return this;
        }

        /* renamed from: d */
        public final a m17046d(InterfaceC5319a.a aVar) {
            this.f17792l = aVar;
            return this;
        }

        /* renamed from: e */
        public final a m17047e(b bVar) {
            this.f17782b = bVar;
            return this;
        }

        /* renamed from: f */
        public final a m17048f(Function1 function1) {
            this.f17801u = function1;
            return this;
        }

        /* renamed from: g */
        public final a m17049g(Function1 function1) {
            this.f17800t = function1;
            return this;
        }

        /* renamed from: h */
        public final a m17050h(Precision precision) {
            this.f17805y = precision;
            return this;
        }

        /* renamed from: i */
        public final a m17051i(Scale scale) {
            this.f17804x = scale;
            return this;
        }

        /* renamed from: j */
        public final a m17052j(InterfaceC9977g interfaceC9977g) {
            this.f17803w = interfaceC9977g;
            return this;
        }

        /* renamed from: k */
        public final a m17053k(InterfaceC5217a interfaceC5217a) {
            this.f17784d = interfaceC5217a;
            return this;
        }

        public a(C9924e c9924e, Context context) {
            this.f17781a = context;
            this.f17782b = c9924e.m17023g();
            this.f17783c = c9924e.m17020d();
            this.f17784d = c9924e.m17041y();
            this.f17785e = c9924e.m17032p();
            this.f17786f = c9924e.m17033q();
            this.f17788h = c9924e.m17034r();
            this.f17789i = c9924e.m17025i();
            this.f17790j = c9924e.m17024h().m17075f();
            this.f17791k = c9924e.m17029m();
            this.f17792l = c9924e.m17022f();
            this.f17793m = c9924e.m17024h().m17076g();
            this.f17794n = c9924e.m17024h().m17074e();
            this.f17795o = c9924e.m17024h().m17070a();
            this.f17796p = c9924e.m17024h().m17077h();
            this.f17797q = c9924e.m17024h().m17071b();
            this.f17798r = c9924e.m17024h().m17078i();
            this.f17799s = c9924e.m17037u();
            this.f17800t = c9924e.m17024h().m17079j();
            this.f17801u = c9924e.m17024h().m17072c();
            this.f17802v = c9924e.m17024h().m17073d();
            this.f17803w = c9924e.m17024h().m17082m();
            this.f17804x = c9924e.m17024h().m17081l();
            this.f17805y = c9924e.m17024h().m17080k();
            this.f17806z = c9924e.m17027k();
        }
    }
}
