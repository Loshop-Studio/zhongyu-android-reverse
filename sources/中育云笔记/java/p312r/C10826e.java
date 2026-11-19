package p312r;

import coil3.AbstractC5453b;
import coil3.InterfaceC5470e;
import coil3.decode.DataSource;
import coil3.intercept.EngineInterceptor;
import coil3.intercept.InterfaceC5477a;
import coil3.request.CachePolicy;
import coil3.size.Precision;
import coil3.size.Scale;
import coil3.util.AbstractC5490c;
import coil3.util.Logger;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC9925a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p212k.C9747a;
import p312r.InterfaceC10825d;
import p380w.AbstractC11628h;
import p380w.C11627g;
import p380w.C11634n;
import p380w.C11638r;
import p380w.InterfaceC11636p;
import p396x.AbstractC11750f;
import p396x.C11749e;
import p396x.InterfaceC11745a;

/* renamed from: r.e */
/* loaded from: classes3.dex */
public final class C10826e {

    /* renamed from: c */
    public static final a f26122c = new a(null);

    /* renamed from: a */
    public final InterfaceC5470e f26123a;

    /* renamed from: b */
    public final InterfaceC11636p f26124b;

    /* renamed from: r.e$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: r.e$b */
    public static final /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26125a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f26126b;

        static {
            int[] iArr = new int[Scale.values().length];
            try {
                iArr[Scale.f3910c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Scale.f3911d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f26125a = iArr;
            int[] iArr2 = new int[Precision.values().length];
            try {
                iArr2[Precision.f3906c.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Precision.f3907d.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f26126b = iArr2;
        }
    }

    public C10826e(InterfaceC5470e interfaceC5470e, InterfaceC11636p interfaceC11636p, Logger logger) {
        this.f26123a = interfaceC5470e;
        this.f26124b = interfaceC11636p;
    }

    /* renamed from: a */
    public final InterfaceC10825d.c m23296a(C11627g c11627g, InterfaceC10825d.b bVar, C11749e c11749e, Scale scale) {
        if (!c11627g.m25663s().m3267c()) {
            return null;
        }
        InterfaceC10825d interfaceC10825dMo2980e = this.f26123a.mo2980e();
        InterfaceC10825d.c cVarMo23283a = interfaceC10825dMo2980e != null ? interfaceC10825dMo2980e.mo23283a(bVar) : null;
        if (cVarMo23283a == null || !m23298c(c11627g, bVar, cVarMo23283a, c11749e, scale)) {
            return null;
        }
        return cVarMo23283a;
    }

    /* renamed from: b */
    public final String m23297b(InterfaceC10825d.c cVar) {
        Object obj = cVar.m23294a().get("coil#disk_cache_key");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* renamed from: c */
    public final boolean m23298c(C11627g c11627g, InterfaceC10825d.b bVar, InterfaceC10825d.c cVar, C11749e c11749e, Scale scale) {
        if (this.f26124b.mo25625d(c11627g, cVar)) {
            return m23299d(c11627g, bVar, cVar, c11749e, scale);
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m23299d(C11627g c11627g, InterfaceC10825d.b bVar, InterfaceC10825d.c cVar, C11749e c11749e, Scale scale) {
        int iAbs;
        String str = (String) bVar.m23293a().get("coil#size");
        if (str != null) {
            return AbstractC9979u.m20289b(str, c11749e.toString());
        }
        if (!m23300e(cVar) && (AbstractC11750f.m26002b(c11749e) || c11627g.m25666v() == Precision.f3907d)) {
            return true;
        }
        int width = cVar.m23295b().getWidth();
        int height = cVar.m23295b().getHeight();
        C11749e c11749eM25721c = cVar.m23295b() instanceof C9747a ? AbstractC11628h.m25721c(c11627g) : C11749e.f27923d;
        InterfaceC11745a interfaceC11745aM26000b = c11749e.m26000b();
        int iM25995f = interfaceC11745aM26000b instanceof InterfaceC11745a.a ? ((InterfaceC11745a.a) interfaceC11745aM26000b).m25995f() : Integer.MAX_VALUE;
        InterfaceC11745a interfaceC11745aM26000b2 = c11749eM25721c.m26000b();
        int iMin = Math.min(iM25995f, interfaceC11745aM26000b2 instanceof InterfaceC11745a.a ? ((InterfaceC11745a.a) interfaceC11745aM26000b2).m25995f() : Integer.MAX_VALUE);
        InterfaceC11745a interfaceC11745aM25999a = c11749e.m25999a();
        int iM25995f2 = interfaceC11745aM25999a instanceof InterfaceC11745a.a ? ((InterfaceC11745a.a) interfaceC11745aM25999a).m25995f() : Integer.MAX_VALUE;
        InterfaceC11745a interfaceC11745aM25999a2 = c11749eM25721c.m25999a();
        int iMin2 = Math.min(iM25995f2, interfaceC11745aM25999a2 instanceof InterfaceC11745a.a ? ((InterfaceC11745a.a) interfaceC11745aM25999a2).m25995f() : Integer.MAX_VALUE);
        double d10 = iMin / width;
        double d11 = iMin2 / height;
        int i10 = b.f26125a[((iMin == Integer.MAX_VALUE || iMin2 == Integer.MAX_VALUE) ? Scale.f3911d : scale).ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (d10 < d11) {
                iAbs = Math.abs(iMin - width);
            } else {
                iAbs = Math.abs(iMin2 - height);
                d10 = d11;
            }
        } else if (d10 > d11) {
            iAbs = Math.abs(iMin - width);
        } else {
            iAbs = Math.abs(iMin2 - height);
            d10 = d11;
        }
        if (iAbs <= 1) {
            return true;
        }
        int i11 = b.f26126b[c11627g.m25666v().ordinal()];
        if (i11 == 1) {
            return d10 == 1.0d;
        }
        if (i11 == 2) {
            return d10 <= 1.0d;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: e */
    public final boolean m23300e(InterfaceC10825d.c cVar) {
        Object obj = cVar.m23294a().get("coil#is_sampled");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: f */
    public final InterfaceC10825d.b m23301f(C11627g c11627g, Object obj, C11634n c11634n, AbstractC5453b abstractC5453b) {
        if (c11627g.m25663s() == CachePolicy.f3887h) {
            return null;
        }
        if (c11627g.m25661q() != null) {
            return new InterfaceC10825d.b(c11627g.m25661q(), c11627g.m25662r());
        }
        abstractC5453b.m3034j(c11627g, obj);
        String strM3316p = AbstractC5490c.m3316p(this.f26123a.mo2979d(), obj, c11634n, null, "MemoryCacheService");
        abstractC5453b.m3033i(c11627g, strM3316p);
        if (strM3316p == null) {
            return null;
        }
        if (AbstractC11628h.m25723e(c11627g).isEmpty()) {
            return new InterfaceC10825d.b(strM3316p, c11627g.m25662r());
        }
        Map mapM20104x = AbstractC9925a.m20104x(c11627g.m25662r());
        mapM20104x.put("coil#size", c11634n.m25751k().toString());
        return new InterfaceC10825d.b(strM3316p, mapM20104x);
    }

    /* renamed from: g */
    public final C11638r m23302g(InterfaceC5477a.a aVar, C11627g c11627g, InterfaceC10825d.b bVar, InterfaceC10825d.c cVar) {
        return new C11638r(cVar.m23295b(), c11627g, DataSource.f3610c, bVar, m23297b(cVar), m23300e(cVar), AbstractC5490c.m3315o(aVar));
    }

    /* renamed from: h */
    public final boolean m23303h(InterfaceC10825d.b bVar, C11627g c11627g, EngineInterceptor.C5476b c5476b) {
        InterfaceC10825d interfaceC10825dMo2980e;
        if (bVar == null || !c11627g.m25663s().m3268d() || !c5476b.m3182e().mo19675a() || (interfaceC10825dMo2980e = this.f26123a.mo2980e()) == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("coil#is_sampled", Boolean.valueOf(c5476b.m3183f()));
        String strM3181d = c5476b.m3181d();
        if (strM3181d != null) {
            linkedHashMap.put("coil#disk_cache_key", strM3181d);
        }
        interfaceC10825dMo2980e.mo23287f(bVar, new InterfaceC10825d.c(c5476b.m3182e(), linkedHashMap));
        return true;
    }
}
