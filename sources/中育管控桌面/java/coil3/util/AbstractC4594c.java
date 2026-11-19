package coil3.util;

import androidx.documentfile.provider.AbstractC3242a;
import coil3.AbstractC4549b;
import coil3.C4548a;
import coil3.decode.InterfaceC4565a;
import coil3.intercept.InterfaceC4581a;
import coil3.intercept.RealInterceptorChain;
import coil3.request.NullRequestDataException;
import coil3.util.AbstractC4594c;
import coil3.util.Logger;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineDispatcher;
import p087k.C6621t;
import p087k.InterfaceC6611j;
import p138r.InterfaceC7633c;
import p187y.C7871d;
import p187y.C7872e;
import p187y.C7880m;

/* renamed from: coil3.util.c */
/* loaded from: classes3.dex */
public abstract class AbstractC4594c {

    /* renamed from: a */
    public static final Function1 f1964a = a.f1965a;

    /* renamed from: coil3.util.c$a */
    public static final class a implements Function1 {

        /* renamed from: a */
        public static final a f1965a = new a();

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(C7872e c7872e) {
            return null;
        }
    }

    /* renamed from: c */
    public static final C7871d m2035c(C7872e c7872e, Throwable th) {
        InterfaceC6611j interfaceC6611jM9572a;
        if (!(th instanceof NullRequestDataException) || (interfaceC6611jM9572a = c7872e.m9573b()) == null) {
            interfaceC6611jM9572a = c7872e.m9572a();
        }
        return new C7871d(interfaceC6611jM9572a, c7872e, th);
    }

    /* renamed from: d */
    public static final C4548a.a m2036d(C4548a.a aVar, final InterfaceC4565a.a aVar2) {
        if (aVar2 != null) {
            aVar.m1698q().add(0, new Function0() { // from class: c0.a0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbstractC4594c.m2039g(aVar2);
                }
            });
        }
        return aVar;
    }

    /* renamed from: e */
    public static final C4548a.a m2037e(C4548a.a aVar, final Pair pair) {
        if (pair != null) {
            aVar.m1699r().add(0, new Function0() { // from class: c0.z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbstractC4594c.m2038f(pair);
                }
            });
        }
        return aVar;
    }

    /* renamed from: f */
    public static final List m2038f(Pair pair) {
        return CollectionsKt.listOf(pair);
    }

    /* renamed from: g */
    public static final List m2039g(InterfaceC4565a.a aVar) {
        return CollectionsKt.listOf(aVar);
    }

    /* renamed from: h */
    public static final void m2040h(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (RuntimeException e6) {
            throw e6;
        } catch (Exception unused) {
        }
    }

    /* renamed from: i */
    public static final void m2041i(AutoCloseable autoCloseable) {
        try {
            AbstractC3242a.m980a(autoCloseable);
        } catch (RuntimeException e6) {
            throw e6;
        } catch (Exception unused) {
        }
    }

    /* renamed from: j */
    public static final CoroutineDispatcher m2042j(CoroutineContext coroutineContext) {
        return (CoroutineDispatcher) coroutineContext.get(CoroutineDispatcher.INSTANCE);
    }

    /* renamed from: k */
    public static final Function1 m2043k() {
        return f1964a;
    }

    /* renamed from: l */
    public static final AbstractC4549b m2044l(InterfaceC4581a.a aVar) {
        return aVar instanceof RealInterceptorChain ? ((RealInterceptorChain) aVar).m1924e() : AbstractC4549b.f1499b;
    }

    /* renamed from: m */
    public static final boolean m2045m(C6621t c6621t) {
        return ((c6621t.m7575c() != null && !Intrinsics.areEqual(c6621t.m7575c(), "file")) || c6621t.m7574b() == null || AbstractC4595d.m2057h(c6621t)) ? false : true;
    }

    /* renamed from: n */
    public static final boolean m2046n(int i6) {
        return i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE;
    }

    /* renamed from: o */
    public static final boolean m2047o(InterfaceC4581a.a aVar) {
        return (aVar instanceof RealInterceptorChain) && ((RealInterceptorChain) aVar).m1925f();
    }

    /* renamed from: p */
    public static final String m2048p(C4548a c4548a, Object obj, C7880m c7880m, Logger logger, String str) {
        List listM1676h = c4548a.m1676h();
        int size = listM1676h.size();
        boolean z6 = false;
        for (int i6 = 0; i6 < size; i6++) {
            Pair pair = (Pair) listM1676h.get(i6);
            InterfaceC7633c interfaceC7633c = (InterfaceC7633c) pair.component1();
            if (((KClass) pair.component2()).isInstance(obj)) {
                Intrinsics.checkNotNull(interfaceC7633c, "null cannot be cast to non-null type coil3.key.Keyer<kotlin.Any>");
                String strMo9070a = interfaceC7633c.mo9070a(obj, c7880m);
                if (strMo9070a != null) {
                    return strMo9070a;
                }
                z6 = true;
            }
        }
        if (!z6 && logger != null) {
            Logger.Level level = Logger.Level.f1946d;
            if (logger.m2023a().compareTo(level) <= 0) {
                logger.m2024b(str, level, "No keyer is registered for data with type '" + Reflection.getOrCreateKotlinClass(obj.getClass()).getSimpleName() + "'. Register Keyer<" + Reflection.getOrCreateKotlinClass(obj.getClass()).getSimpleName() + "> in the component registry to cache the output image in the memory cache.", null);
            }
        }
        return null;
    }
}
