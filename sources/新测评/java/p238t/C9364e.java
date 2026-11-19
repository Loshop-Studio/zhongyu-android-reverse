package p238t;

import coil3.AbstractC5168b;
import coil3.InterfaceC5193e;
import coil3.decode.DataSource;
import coil3.intercept.EngineInterceptor;
import coil3.intercept.InterfaceC5200a;
import coil3.request.CachePolicy;
import coil3.size.Precision;
import coil3.size.Scale;
import coil3.util.AbstractC5213c;
import coil3.util.Logger;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p137k.C7829a;
import p238t.InterfaceC9363d;
import p290y.AbstractC9887f;
import p290y.C9886e;
import p290y.C9892k;
import p290y.C9896o;
import p290y.InterfaceC9894m;
import p300z.AbstractC9959f;
import p300z.C9958e;
import p300z.InterfaceC9954a;

/* renamed from: t.e */
/* loaded from: classes3.dex */
public final class C9364e {

    /* renamed from: c */
    public static final a f16235c = new a(null);

    /* renamed from: a */
    public final InterfaceC5193e f16236a;

    /* renamed from: b */
    public final InterfaceC9894m f16237b;

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
        public static final /* synthetic */ int[] f16238a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f16239b;

        static {
            int[] iArr = new int[Scale.values().length];
            try {
                iArr[Scale.f3235a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Scale.f3236b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f16238a = iArr;
            int[] iArr2 = new int[Precision.values().length];
            try {
                iArr2[Precision.f3231a.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Precision.f3232b.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f16239b = iArr2;
        }
    }

    public C9364e(InterfaceC5193e interfaceC5193e, InterfaceC9894m interfaceC9894m, Logger logger) {
        this.f16236a = interfaceC5193e;
        this.f16237b = interfaceC9894m;
    }

    /* renamed from: a */
    public final InterfaceC9363d.c m15633a(C9886e c9886e, InterfaceC9363d.b bVar, C9958e c9958e, Scale scale) {
        if (!c9886e.m16633s().getReadEnabled()) {
            return null;
        }
        InterfaceC9363d interfaceC9363dMo2821f = this.f16236a.mo2821f();
        InterfaceC9363d.c cVarMo15620a = interfaceC9363dMo2821f != null ? interfaceC9363dMo2821f.mo15620a(bVar) : null;
        if (cVarMo15620a == null || !m15635c(c9886e, bVar, cVarMo15620a, c9958e, scale)) {
            return null;
        }
        return cVarMo15620a;
    }

    /* renamed from: b */
    public final String m15634b(InterfaceC9363d.c cVar) {
        Object obj = cVar.m15631a().get("coil#disk_cache_key");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* renamed from: c */
    public final boolean m15635c(C9886e c9886e, InterfaceC9363d.b bVar, InterfaceC9363d.c cVar, C9958e c9958e, Scale scale) {
        if (this.f16237b.mo16592b(c9886e, cVar)) {
            return m15636d(c9886e, bVar, cVar, c9958e, scale);
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m15636d(C9886e c9886e, InterfaceC9363d.b bVar, InterfaceC9363d.c cVar, C9958e c9958e, Scale scale) {
        int iAbs;
        String str = (String) bVar.m15630a().get("coil#size");
        if (str != null) {
            return Intrinsics.areEqual(str, c9958e.toString());
        }
        if (!m15637e(cVar) && (AbstractC9959f.m16774b(c9958e) || c9886e.m16636v() == Precision.f3232b)) {
            return true;
        }
        int width = cVar.m15632b().getWidth();
        int height = cVar.m15632b().getHeight();
        C9958e c9958eM16684c = cVar.m15632b() instanceof C7829a ? AbstractC9887f.m16684c(c9886e) : C9958e.f17800d;
        InterfaceC9954a interfaceC9954aM16772b = c9958e.m16772b();
        int iM16768f = interfaceC9954aM16772b instanceof InterfaceC9954a.a ? ((InterfaceC9954a.a) interfaceC9954aM16772b).m16768f() : Integer.MAX_VALUE;
        InterfaceC9954a interfaceC9954aM16772b2 = c9958eM16684c.m16772b();
        int iMin = Math.min(iM16768f, interfaceC9954aM16772b2 instanceof InterfaceC9954a.a ? ((InterfaceC9954a.a) interfaceC9954aM16772b2).m16768f() : Integer.MAX_VALUE);
        InterfaceC9954a interfaceC9954aM16771a = c9958e.m16771a();
        int iM16768f2 = interfaceC9954aM16771a instanceof InterfaceC9954a.a ? ((InterfaceC9954a.a) interfaceC9954aM16771a).m16768f() : Integer.MAX_VALUE;
        InterfaceC9954a interfaceC9954aM16771a2 = c9958eM16684c.m16771a();
        int iMin2 = Math.min(iM16768f2, interfaceC9954aM16771a2 instanceof InterfaceC9954a.a ? ((InterfaceC9954a.a) interfaceC9954aM16771a2).m16768f() : Integer.MAX_VALUE);
        double d10 = iMin / width;
        double d11 = iMin2 / height;
        int i10 = b.f16238a[((iMin == Integer.MAX_VALUE || iMin2 == Integer.MAX_VALUE) ? Scale.f3236b : scale).ordinal()];
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
        int i11 = b.f16239b[c9886e.m16636v().ordinal()];
        if (i11 == 1) {
            return d10 == 1.0d;
        }
        if (i11 == 2) {
            return d10 <= 1.0d;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: e */
    public final boolean m15637e(InterfaceC9363d.c cVar) {
        Object obj = cVar.m15631a().get("coil#is_sampled");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: f */
    public final InterfaceC9363d.b m15638f(C9886e c9886e, Object obj, C9892k c9892k, AbstractC5168b abstractC5168b) {
        if (c9886e.m16633s() == CachePolicy.f3212f) {
            return null;
        }
        if (c9886e.m16631q() != null) {
            return new InterfaceC9363d.b(c9886e.m16631q(), c9886e.m16632r());
        }
        abstractC5168b.m2875j(c9886e, obj);
        String strM3222p = AbstractC5213c.m3222p(this.f16236a.mo2820e(), obj, c9892k, null, "MemoryCacheService");
        abstractC5168b.m2874i(c9886e, strM3222p);
        if (strM3222p == null) {
            return null;
        }
        if (AbstractC9887f.m16686e(c9886e).isEmpty()) {
            return new InterfaceC9363d.b(strM3222p, c9886e.m16632r());
        }
        Map mutableMap = MapsKt.toMutableMap(c9886e.m16632r());
        mutableMap.put("coil#size", c9892k.m16708k().toString());
        return new InterfaceC9363d.b(strM3222p, mutableMap);
    }

    /* renamed from: g */
    public final C9896o m15639g(InterfaceC5200a.a aVar, C9886e c9886e, InterfaceC9363d.b bVar, InterfaceC9363d.c cVar) {
        return new C9896o(cVar.m15632b(), c9886e, DataSource.f2935a, bVar, m15634b(cVar), m15637e(cVar), AbstractC5213c.m3221o(aVar));
    }

    /* renamed from: h */
    public final boolean m15640h(InterfaceC9363d.b bVar, C9886e c9886e, EngineInterceptor.C5199b c5199b) {
        InterfaceC9363d interfaceC9363dMo2821f;
        if (bVar == null || !c9886e.m16633s().getWriteEnabled() || !c5199b.m3091e().mo13296a() || (interfaceC9363dMo2821f = this.f16236a.mo2821f()) == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("coil#is_sampled", Boolean.valueOf(c5199b.m3092f()));
        String strM3090d = c5199b.m3090d();
        if (strM3090d != null) {
            linkedHashMap.put("coil#disk_cache_key", strM3090d);
        }
        interfaceC9363dMo2821f.mo15624g(bVar, new InterfaceC9363d.c(c5199b.m3091e(), linkedHashMap));
        return true;
    }
}
