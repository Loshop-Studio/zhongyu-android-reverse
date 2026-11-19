package coil3.util;

import androidx.documentfile.provider.AbstractC3902a;
import coil3.AbstractC5303b;
import coil3.C5302a;
import coil3.decode.InterfaceC5319a;
import coil3.intercept.InterfaceC5335a;
import coil3.intercept.RealInterceptorChain;
import coil3.request.NullRequestDataException;
import coil3.util.AbstractC5348c;
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
import p151k.C8247r;
import p151k.InterfaceC8239j;
import p227r.InterfaceC9388c;
import p297y.C9923d;
import p297y.C9924e;
import p297y.C9932m;

/* renamed from: coil3.util.c */
/* loaded from: classes3.dex */
public abstract class AbstractC5348c {

    /* renamed from: a */
    public static final Function1 f3162a = a.f3163a;

    /* renamed from: coil3.util.c$a */
    public static final class a implements Function1 {

        /* renamed from: a */
        public static final a f3163a = new a();

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(C9924e c9924e) {
            return null;
        }
    }

    /* renamed from: c */
    public static final C9923d m2926c(C9924e c9924e, Throwable th) {
        InterfaceC8239j interfaceC8239jM17017a;
        if (!(th instanceof NullRequestDataException) || (interfaceC8239jM17017a = c9924e.m17018b()) == null) {
            interfaceC8239jM17017a = c9924e.m17017a();
        }
        return new C9923d(interfaceC8239jM17017a, c9924e, th);
    }

    /* renamed from: d */
    public static final C5302a.a m2927d(C5302a.a aVar, final InterfaceC5319a.a aVar2) {
        if (aVar2 != null) {
            aVar.m2592q().add(0, new Function0() { // from class: e0.z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbstractC5348c.m2930g(aVar2);
                }
            });
        }
        return aVar;
    }

    /* renamed from: e */
    public static final C5302a.a m2928e(C5302a.a aVar, final Pair pair) {
        if (pair != null) {
            aVar.m2593r().add(0, new Function0() { // from class: e0.y
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbstractC5348c.m2929f(pair);
                }
            });
        }
        return aVar;
    }

    /* renamed from: f */
    public static final List m2929f(Pair pair) {
        return CollectionsKt.listOf(pair);
    }

    /* renamed from: g */
    public static final List m2930g(InterfaceC5319a.a aVar) {
        return CollectionsKt.listOf(aVar);
    }

    /* renamed from: h */
    public static final void m2931h(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    /* renamed from: i */
    public static final void m2932i(AutoCloseable autoCloseable) {
        try {
            AbstractC3902a.m1693a(autoCloseable);
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    /* renamed from: j */
    public static final CoroutineDispatcher m2933j(CoroutineContext coroutineContext) {
        return (CoroutineDispatcher) coroutineContext.get(CoroutineDispatcher.INSTANCE);
    }

    /* renamed from: k */
    public static final Function1 m2934k() {
        return f3162a;
    }

    /* renamed from: l */
    public static final AbstractC5303b m2935l(InterfaceC5335a.a aVar) {
        return aVar instanceof RealInterceptorChain ? ((RealInterceptorChain) aVar).m2818e() : AbstractC5303b.f2750b;
    }

    /* renamed from: m */
    public static final boolean m2936m(C8247r c8247r) {
        return ((c8247r.m13277c() != null && !Intrinsics.areEqual(c8247r.m13277c(), "file")) || c8247r.m13276b() == null || AbstractC5349d.m2948h(c8247r)) ? false : true;
    }

    /* renamed from: n */
    public static final boolean m2937n(int i9) {
        return i9 == Integer.MIN_VALUE || i9 == Integer.MAX_VALUE;
    }

    /* renamed from: o */
    public static final boolean m2938o(InterfaceC5335a.a aVar) {
        return (aVar instanceof RealInterceptorChain) && ((RealInterceptorChain) aVar).m2819f();
    }

    /* renamed from: p */
    public static final String m2939p(C5302a c5302a, Object obj, C9932m c9932m, Logger logger, String str) {
        List listM2570h = c5302a.m2570h();
        int size = listM2570h.size();
        boolean z9 = false;
        for (int i9 = 0; i9 < size; i9++) {
            Pair pair = (Pair) listM2570h.get(i9);
            InterfaceC9388c interfaceC9388c = (InterfaceC9388c) pair.component1();
            if (((KClass) pair.component2()).isInstance(obj)) {
                Intrinsics.checkNotNull(interfaceC9388c, "null cannot be cast to non-null type coil3.key.Keyer<kotlin.Any>");
                String strMo15444a = interfaceC9388c.mo15444a(obj, c9932m);
                if (strMo15444a != null) {
                    return strMo15444a;
                }
                z9 = true;
            }
        }
        if (!z9 && logger != null) {
            Logger.Level level = Logger.Level.f3149d;
            if (logger.m2917a().compareTo(level) <= 0) {
                logger.m2918b(str, level, "No keyer is registered for data with type '" + Reflection.getOrCreateKotlinClass(obj.getClass()).getSimpleName() + "'. Register Keyer<" + Reflection.getOrCreateKotlinClass(obj.getClass()).getSimpleName() + "> in the component registry to cache the output image in the memory cache.", null);
            }
        }
        return null;
    }
}
