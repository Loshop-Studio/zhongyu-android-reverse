package coil3.util;

import androidx.documentfile.provider.AbstractC3754a;
import coil3.AbstractC5453b;
import coil3.C5452a;
import coil3.decode.InterfaceC5461a;
import coil3.intercept.InterfaceC5477a;
import coil3.intercept.RealInterceptorChain;
import coil3.request.NullRequestDataException;
import coil3.util.AbstractC5490c;
import coil3.util.Logger;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p212k.C9766t;
import p212k.InterfaceC9756j;
import p280od.InterfaceC10469c;
import p283p.InterfaceC10592c;
import p325rc.AbstractC10976v;
import p380w.C11624d;
import p380w.C11627g;
import p380w.C11634n;
import sd.AbstractC11106e0;

/* renamed from: coil3.util.c */
/* loaded from: classes3.dex */
public abstract class AbstractC5490c {

    /* renamed from: a */
    public static final InterfaceC9540l f3955a = a.f3956c;

    /* renamed from: coil3.util.c$a */
    public static final class a implements InterfaceC9540l {

        /* renamed from: c */
        public static final a f3956c = new a();

        @Override // p181hd.InterfaceC9540l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(C11627g c11627g) {
            return null;
        }
    }

    /* renamed from: c */
    public static final C11624d m3303c(C11627g c11627g, Throwable th) {
        InterfaceC9756j interfaceC9756jM25645a;
        if (!(th instanceof NullRequestDataException) || (interfaceC9756jM25645a = c11627g.m25646b()) == null) {
            interfaceC9756jM25645a = c11627g.m25645a();
        }
        return new C11624d(interfaceC9756jM25645a, c11627g, th);
    }

    /* renamed from: d */
    public static final C5452a.a m3304d(C5452a.a aVar, final InterfaceC5461a.a aVar2) {
        if (aVar2 != null) {
            aVar.m3023q().add(0, new InterfaceC9529a() { // from class: a0.a0
                @Override // p181hd.InterfaceC9529a
                public final Object invoke() {
                    return AbstractC5490c.m3307g(aVar2);
                }
            });
        }
        return aVar;
    }

    /* renamed from: e */
    public static final C5452a.a m3305e(C5452a.a aVar, final Pair pair) {
        if (pair != null) {
            aVar.m3024r().add(0, new InterfaceC9529a() { // from class: a0.z
                @Override // p181hd.InterfaceC9529a
                public final Object invoke() {
                    return AbstractC5490c.m3306f(pair);
                }
            });
        }
        return aVar;
    }

    /* renamed from: f */
    public static final List m3306f(Pair pair) {
        return AbstractC10976v.m24126e(pair);
    }

    /* renamed from: g */
    public static final List m3307g(InterfaceC5461a.a aVar) {
        return AbstractC10976v.m24126e(aVar);
    }

    /* renamed from: h */
    public static final void m3308h(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    /* renamed from: i */
    public static final void m3309i(AutoCloseable autoCloseable) {
        try {
            AbstractC3754a.m1748a(autoCloseable);
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    /* renamed from: j */
    public static final AbstractC11106e0 m3310j(InterfaceC9945d interfaceC9945d) {
        return (AbstractC11106e0) interfaceC9945d.get(AbstractC11106e0.Key);
    }

    /* renamed from: k */
    public static final InterfaceC9540l m3311k() {
        return f3955a;
    }

    /* renamed from: l */
    public static final AbstractC5453b m3312l(InterfaceC5477a.a aVar) {
        return aVar instanceof RealInterceptorChain ? ((RealInterceptorChain) aVar).m3189e() : AbstractC5453b.f3586b;
    }

    /* renamed from: m */
    public static final boolean m3313m(C9766t c9766t) {
        return ((c9766t.m19685c() != null && !AbstractC9979u.m20289b(c9766t.m19685c(), "file")) || c9766t.m19684b() == null || AbstractC5491d.m3325h(c9766t)) ? false : true;
    }

    /* renamed from: n */
    public static final boolean m3314n(int i10) {
        return i10 == Integer.MIN_VALUE || i10 == Integer.MAX_VALUE;
    }

    /* renamed from: o */
    public static final boolean m3315o(InterfaceC5477a.a aVar) {
        return (aVar instanceof RealInterceptorChain) && ((RealInterceptorChain) aVar).m3190f();
    }

    /* renamed from: p */
    public static final String m3316p(C5452a c5452a, Object obj, C11634n c11634n, Logger logger, String str) {
        List listM3001h = c5452a.m3001h();
        int size = listM3001h.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            Pair pair = (Pair) listM3001h.get(i10);
            InterfaceC10592c interfaceC10592c = (InterfaceC10592c) pair.m20048a();
            if (((InterfaceC10469c) pair.m20049c()).mo20275d(obj)) {
                AbstractC9979u.m20292e(interfaceC10592c, "null cannot be cast to non-null type coil3.key.Keyer<kotlin.Any>");
                String strMo22414a = interfaceC10592c.mo22414a(obj, c11634n);
                if (strMo22414a != null) {
                    return strMo22414a;
                }
                z10 = true;
            }
        }
        if (!z10 && logger != null) {
            Logger.Level level = Logger.Level.f3937f;
            if (logger.m3291a().compareTo(level) <= 0) {
                logger.m3292b(str, level, "No keyer is registered for data with type '" + AbstractC9983y.m20315b(obj.getClass()).mo20277f() + "'. Register Keyer<" + AbstractC9983y.m20315b(obj.getClass()).mo20277f() + "> in the component registry to cache the output image in the memory cache.", null);
            }
        }
        return null;
    }
}
