package p152t;

import coil3.AbstractC4549b;
import coil3.InterfaceC4574e;
import coil3.decode.DataSource;
import coil3.intercept.EngineInterceptor;
import coil3.intercept.InterfaceC4581a;
import coil3.request.CachePolicy;
import coil3.size.Precision;
import coil3.size.Scale;
import coil3.util.AbstractC4594c;
import coil3.util.Logger;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p087k.C6602a;
import p152t.InterfaceC7708d;
import p187y.AbstractC7873f;
import p187y.C7872e;
import p187y.C7880m;
import p187y.C7884q;
import p187y.InterfaceC7882o;
import p194z.AbstractC7924f;
import p194z.C7923e;
import p194z.InterfaceC7919a;

/* renamed from: t.e */
/* loaded from: classes3.dex */
public final class C7709e {

    /* renamed from: c */
    public static final a f10173c = new a(null);

    /* renamed from: a */
    public final InterfaceC4574e f10174a;

    /* renamed from: b */
    public final InterfaceC7882o f10175b;

    /* renamed from: t.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: t.e$b */
    public static final /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10176a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f10177b;

        static {
            int[] iArr = new int[Scale.values().length];
            try {
                iArr[Scale.f1919a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Scale.f1920b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f10176a = iArr;
            int[] iArr2 = new int[Precision.values().length];
            try {
                iArr2[Precision.f1915a.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Precision.f1916b.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f10177b = iArr2;
        }
    }

    public C7709e(InterfaceC4574e interfaceC4574e, InterfaceC7882o interfaceC7882o, Logger logger) {
        this.f10174a = interfaceC4574e;
        this.f10175b = interfaceC7882o;
    }

    /* renamed from: a */
    public final InterfaceC7708d.c m9182a(C7872e c7872e, InterfaceC7708d.b bVar, C7923e c7923e, Scale scale) {
        if (!c7872e.m9590s().getReadEnabled()) {
            return null;
        }
        InterfaceC7708d interfaceC7708dMo1655f = this.f10174a.mo1655f();
        InterfaceC7708d.c cVarMo9169a = interfaceC7708dMo1655f != null ? interfaceC7708dMo1655f.mo9169a(bVar) : null;
        if (cVarMo9169a == null || !m9184c(c7872e, bVar, cVarMo9169a, c7923e, scale)) {
            return null;
        }
        return cVarMo9169a;
    }

    /* renamed from: b */
    public final String m9183b(InterfaceC7708d.c cVar) {
        Object obj = cVar.m9180a().get("coil#disk_cache_key");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* renamed from: c */
    public final boolean m9184c(C7872e c7872e, InterfaceC7708d.b bVar, InterfaceC7708d.c cVar, C7923e c7923e, Scale scale) {
        if (this.f10175b.mo9549b(c7872e, cVar)) {
            return m9185d(c7872e, bVar, cVar, c7923e, scale);
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m9185d(C7872e c7872e, InterfaceC7708d.b bVar, InterfaceC7708d.c cVar, C7923e c7923e, Scale scale) {
        int iAbs;
        String str = (String) bVar.m9179a().get("coil#size");
        if (str != null) {
            return Intrinsics.areEqual(str, c7923e.toString());
        }
        if (!m9186e(cVar) && (AbstractC7924f.m9722b(c7923e) || c7872e.m9593v() == Precision.f1916b)) {
            return true;
        }
        int width = cVar.m9181b().getWidth();
        int height = cVar.m9181b().getHeight();
        C7923e c7923eM9639c = cVar.m9181b() instanceof C6602a ? AbstractC7873f.m9639c(c7872e) : C7923e.f10643d;
        InterfaceC7919a interfaceC7919aM9720b = c7923e.m9720b();
        int iM9716f = interfaceC7919aM9720b instanceof InterfaceC7919a.a ? ((InterfaceC7919a.a) interfaceC7919aM9720b).m9716f() : Integer.MAX_VALUE;
        InterfaceC7919a interfaceC7919aM9720b2 = c7923eM9639c.m9720b();
        int iMin = Math.min(iM9716f, interfaceC7919aM9720b2 instanceof InterfaceC7919a.a ? ((InterfaceC7919a.a) interfaceC7919aM9720b2).m9716f() : Integer.MAX_VALUE);
        InterfaceC7919a interfaceC7919aM9719a = c7923e.m9719a();
        int iM9716f2 = interfaceC7919aM9719a instanceof InterfaceC7919a.a ? ((InterfaceC7919a.a) interfaceC7919aM9719a).m9716f() : Integer.MAX_VALUE;
        InterfaceC7919a interfaceC7919aM9719a2 = c7923eM9639c.m9719a();
        int iMin2 = Math.min(iM9716f2, interfaceC7919aM9719a2 instanceof InterfaceC7919a.a ? ((InterfaceC7919a.a) interfaceC7919aM9719a2).m9716f() : Integer.MAX_VALUE);
        double d6 = iMin / width;
        double d7 = iMin2 / height;
        int i6 = b.f10176a[((iMin == Integer.MAX_VALUE || iMin2 == Integer.MAX_VALUE) ? Scale.f1920b : scale).ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (d6 < d7) {
                iAbs = Math.abs(iMin - width);
            } else {
                iAbs = Math.abs(iMin2 - height);
                d6 = d7;
            }
        } else if (d6 > d7) {
            iAbs = Math.abs(iMin - width);
        } else {
            iAbs = Math.abs(iMin2 - height);
            d6 = d7;
        }
        if (iAbs <= 1) {
            return true;
        }
        int i7 = b.f10177b[c7872e.m9593v().ordinal()];
        if (i7 == 1) {
            return d6 == 1.0d;
        }
        if (i7 == 2) {
            return d6 <= 1.0d;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: e */
    public final boolean m9186e(InterfaceC7708d.c cVar) {
        Object obj = cVar.m9180a().get("coil#is_sampled");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: f */
    public final InterfaceC7708d.b m9187f(C7872e c7872e, Object obj, C7880m c7880m, AbstractC4549b abstractC4549b) {
        if (c7872e.m9590s() == CachePolicy.f1896f) {
            return null;
        }
        if (c7872e.m9588q() != null) {
            return new InterfaceC7708d.b(c7872e.m9588q(), c7872e.m9589r());
        }
        abstractC4549b.m1709j(c7872e, obj);
        String strM2048p = AbstractC4594c.m2048p(this.f10174a.mo1654e(), obj, c7880m, null, "MemoryCacheService");
        abstractC4549b.m1708i(c7872e, strM2048p);
        if (strM2048p == null) {
            return null;
        }
        if (AbstractC7873f.m9641e(c7872e).isEmpty()) {
            return new InterfaceC7708d.b(strM2048p, c7872e.m9589r());
        }
        Map mutableMap = MapsKt.toMutableMap(c7872e.m9589r());
        mutableMap.put("coil#size", c7880m.m9669k().toString());
        return new InterfaceC7708d.b(strM2048p, mutableMap);
    }

    /* renamed from: g */
    public final C7884q m9188g(InterfaceC4581a.a aVar, C7872e c7872e, InterfaceC7708d.b bVar, InterfaceC7708d.c cVar) {
        return new C7884q(cVar.m9181b(), c7872e, DataSource.f1619a, bVar, m9183b(cVar), m9186e(cVar), AbstractC4594c.m2047o(aVar));
    }

    /* renamed from: h */
    public final boolean m9189h(InterfaceC7708d.b bVar, C7872e c7872e, EngineInterceptor.C4580b c4580b) {
        InterfaceC7708d interfaceC7708dMo1655f;
        if (bVar == null || !c7872e.m9590s().getWriteEnabled() || !c4580b.m1917e().mo7565a() || (interfaceC7708dMo1655f = this.f10174a.mo1655f()) == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("coil#is_sampled", Boolean.valueOf(c4580b.m1918f()));
        String strM1916d = c4580b.m1916d();
        if (strM1916d != null) {
            linkedHashMap.put("coil#disk_cache_key", strM1916d);
        }
        interfaceC7708dMo1655f.mo9173g(bVar, new InterfaceC7708d.c(c4580b.m1917e(), linkedHashMap));
        return true;
    }
}
