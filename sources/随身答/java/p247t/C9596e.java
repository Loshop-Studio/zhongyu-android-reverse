package p247t;

import coil3.AbstractC5303b;
import coil3.InterfaceC5328e;
import coil3.decode.DataSource;
import coil3.intercept.EngineInterceptor;
import coil3.intercept.InterfaceC5335a;
import coil3.size.Precision;
import coil3.size.Scale;
import coil3.util.AbstractC5348c;
import coil3.util.Logger;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p151k.C8230a;
import p247t.InterfaceC9595d;
import p297y.AbstractC9925f;
import p297y.C9924e;
import p297y.C9932m;
import p297y.C9936q;
import p297y.InterfaceC9934o;
import p307z.AbstractC9976f;
import p307z.C9975e;
import p307z.InterfaceC9971a;

/* renamed from: t.e */
/* loaded from: classes3.dex */
public final class C9596e {

    /* renamed from: c */
    public static final a f16802c = new a(null);

    /* renamed from: a */
    public final InterfaceC5328e f16803a;

    /* renamed from: b */
    public final InterfaceC9934o f16804b;

    /* renamed from: t.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: t.e$b */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16805a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f16806b;

        static {
            int[] iArr = new int[Scale.values().length];
            try {
                iArr[Scale.f3123a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Scale.f3124b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f16805a = iArr;
            int[] iArr2 = new int[Precision.values().length];
            try {
                iArr2[Precision.f3119a.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Precision.f3120b.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f16806b = iArr2;
        }
    }

    public C9596e(InterfaceC5328e interfaceC5328e, InterfaceC9934o interfaceC9934o, Logger logger) {
        this.f16803a = interfaceC5328e;
        this.f16804b = interfaceC9934o;
    }

    /* renamed from: a */
    public final InterfaceC9595d.c m15805a(C9924e c9924e, InterfaceC9595d.b bVar, C9975e c9975e, Scale scale) {
        if (!c9924e.m17035s().getReadEnabled()) {
            return null;
        }
        InterfaceC9595d interfaceC9595dMo2550f = this.f16803a.mo2550f();
        InterfaceC9595d.c cVarMo15794a = interfaceC9595dMo2550f != null ? interfaceC9595dMo2550f.mo15794a(bVar) : null;
        if (cVarMo15794a == null || !m15807c(c9924e, bVar, cVarMo15794a, c9975e, scale)) {
            return null;
        }
        return cVarMo15794a;
    }

    /* renamed from: b */
    public final String m15806b(InterfaceC9595d.c cVar) {
        Object obj = cVar.m15803a().get("coil#disk_cache_key");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* renamed from: c */
    public final boolean m15807c(C9924e c9924e, InterfaceC9595d.b bVar, InterfaceC9595d.c cVar, C9975e c9975e, Scale scale) {
        if (this.f16804b.mo16993b(c9924e, cVar)) {
            return m15808d(c9924e, bVar, cVar, c9975e, scale);
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m15808d(C9924e c9924e, InterfaceC9595d.b bVar, InterfaceC9595d.c cVar, C9975e c9975e, Scale scale) {
        int iAbs;
        String str = (String) bVar.m15802a().get("coil#size");
        if (str != null) {
            return Intrinsics.areEqual(str, c9975e.toString());
        }
        if (!m15809e(cVar) && (AbstractC9976f.m17261b(c9975e) || c9924e.m17038v() == Precision.f3120b)) {
            return true;
        }
        int width = cVar.m15804b().getWidth();
        int height = cVar.m15804b().getHeight();
        C9975e c9975eM17085c = cVar.m15804b() instanceof C8230a ? AbstractC9925f.m17085c(c9924e) : C9975e.f17944d;
        InterfaceC9971a interfaceC9971aM17259b = c9975e.m17259b();
        int iM17255f = interfaceC9971aM17259b instanceof InterfaceC9971a.a ? ((InterfaceC9971a.a) interfaceC9971aM17259b).m17255f() : Integer.MAX_VALUE;
        InterfaceC9971a interfaceC9971aM17259b2 = c9975eM17085c.m17259b();
        int iMin = Math.min(iM17255f, interfaceC9971aM17259b2 instanceof InterfaceC9971a.a ? ((InterfaceC9971a.a) interfaceC9971aM17259b2).m17255f() : Integer.MAX_VALUE);
        InterfaceC9971a interfaceC9971aM17258a = c9975e.m17258a();
        int iM17255f2 = interfaceC9971aM17258a instanceof InterfaceC9971a.a ? ((InterfaceC9971a.a) interfaceC9971aM17258a).m17255f() : Integer.MAX_VALUE;
        InterfaceC9971a interfaceC9971aM17258a2 = c9975eM17085c.m17258a();
        int iMin2 = Math.min(iM17255f2, interfaceC9971aM17258a2 instanceof InterfaceC9971a.a ? ((InterfaceC9971a.a) interfaceC9971aM17258a2).m17255f() : Integer.MAX_VALUE);
        double d10 = iMin / width;
        double d11 = iMin2 / height;
        int i9 = b.f16805a[((iMin == Integer.MAX_VALUE || iMin2 == Integer.MAX_VALUE) ? Scale.f3124b : scale).ordinal()];
        if (i9 != 1) {
            if (i9 != 2) {
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
        int i10 = b.f16806b[c9924e.m17038v().ordinal()];
        if (i10 == 1) {
            return d10 == 1.0d;
        }
        if (i10 == 2) {
            return d10 <= 1.0d;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: e */
    public final boolean m15809e(InterfaceC9595d.c cVar) {
        Object obj = cVar.m15803a().get("coil#is_sampled");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: f */
    public final InterfaceC9595d.b m15810f(C9924e c9924e, Object obj, C9932m c9932m, AbstractC5303b abstractC5303b) {
        if (c9924e.m17033q() != null) {
            return new InterfaceC9595d.b(c9924e.m17033q(), c9924e.m17034r());
        }
        abstractC5303b.m2603j(c9924e, obj);
        String strM2939p = AbstractC5348c.m2939p(this.f16803a.mo2549e(), obj, c9932m, null, "MemoryCacheService");
        abstractC5303b.m2602i(c9924e, strM2939p);
        if (strM2939p == null) {
            return null;
        }
        if (AbstractC9925f.m17087e(c9924e).isEmpty()) {
            return new InterfaceC9595d.b(strM2939p, c9924e.m17034r());
        }
        Map mutableMap = MapsKt.toMutableMap(c9924e.m17034r());
        mutableMap.put("coil#size", c9932m.m17116k().toString());
        return new InterfaceC9595d.b(strM2939p, mutableMap);
    }

    /* renamed from: g */
    public final C9936q m15811g(InterfaceC5335a.a aVar, C9924e c9924e, InterfaceC9595d.b bVar, InterfaceC9595d.c cVar) {
        return new C9936q(cVar.m15804b(), c9924e, DataSource.f2864a, bVar, m15806b(cVar), m15809e(cVar), AbstractC5348c.m2938o(aVar));
    }

    /* renamed from: h */
    public final boolean m15812h(InterfaceC9595d.b bVar, C9924e c9924e, EngineInterceptor.C5334b c5334b) {
        InterfaceC9595d interfaceC9595dMo2550f;
        if (bVar == null || !c9924e.m17035s().getWriteEnabled() || !c5334b.m2811e().mo12a() || (interfaceC9595dMo2550f = this.f16803a.mo2550f()) == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("coil#is_sampled", Boolean.valueOf(c5334b.m2812f()));
        String strM2810d = c5334b.m2810d();
        if (strM2810d != null) {
            linkedHashMap.put("coil#disk_cache_key", strM2810d);
        }
        interfaceC9595dMo2550f.mo15796e(bVar, new InterfaceC9595d.c(c5334b.m2811e(), linkedHashMap));
        return true;
    }
}
