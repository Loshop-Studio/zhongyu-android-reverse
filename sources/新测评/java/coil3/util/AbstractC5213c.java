package coil3.util;

import androidx.documentfile.provider.AbstractC3757a;
import coil3.AbstractC5168b;
import coil3.C5167a;
import coil3.decode.InterfaceC5184a;
import coil3.intercept.InterfaceC5200a;
import coil3.intercept.RealInterceptorChain;
import coil3.request.NullRequestDataException;
import coil3.util.AbstractC5213c;
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
import p137k.C7848t;
import p137k.InterfaceC7838j;
import p216r.InterfaceC8993c;
import p290y.C9885d;
import p290y.C9886e;
import p290y.C9892k;

/* renamed from: coil3.util.c */
/* loaded from: classes3.dex */
public abstract class AbstractC5213c {

    /* renamed from: a */
    public static final Function1 f3280a = a.f3281a;

    /* renamed from: coil3.util.c$a */
    public static final class a implements Function1 {

        /* renamed from: a */
        public static final a f3281a = new a();

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(C9886e c9886e) {
            return null;
        }
    }

    /* renamed from: c */
    public static final C9885d m3209c(C9886e c9886e, Throwable th) {
        InterfaceC7838j interfaceC7838jM16615a;
        if (!(th instanceof NullRequestDataException) || (interfaceC7838jM16615a = c9886e.m16616b()) == null) {
            interfaceC7838jM16615a = c9886e.m16615a();
        }
        return new C9885d(interfaceC7838jM16615a, c9886e, th);
    }

    /* renamed from: d */
    public static final C5167a.a m3210d(C5167a.a aVar, final InterfaceC5184a.a aVar2) {
        if (aVar2 != null) {
            aVar.m2864q().add(0, new Function0() { // from class: c0.a0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbstractC5213c.m3213g(aVar2);
                }
            });
        }
        return aVar;
    }

    /* renamed from: e */
    public static final C5167a.a m3211e(C5167a.a aVar, final Pair pair) {
        if (pair != null) {
            aVar.m2865r().add(0, new Function0() { // from class: c0.z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbstractC5213c.m3212f(pair);
                }
            });
        }
        return aVar;
    }

    /* renamed from: f */
    public static final List m3212f(Pair pair) {
        return CollectionsKt.listOf(pair);
    }

    /* renamed from: g */
    public static final List m3213g(InterfaceC5184a.a aVar) {
        return CollectionsKt.listOf(aVar);
    }

    /* renamed from: h */
    public static final void m3214h(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    /* renamed from: i */
    public static final void m3215i(AutoCloseable autoCloseable) {
        try {
            AbstractC3757a.m1902a(autoCloseable);
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    /* renamed from: j */
    public static final CoroutineDispatcher m3216j(CoroutineContext coroutineContext) {
        return (CoroutineDispatcher) coroutineContext.get(CoroutineDispatcher.INSTANCE);
    }

    /* renamed from: k */
    public static final Function1 m3217k() {
        return f3280a;
    }

    /* renamed from: l */
    public static final AbstractC5168b m3218l(InterfaceC5200a.a aVar) {
        return aVar instanceof RealInterceptorChain ? ((RealInterceptorChain) aVar).m3100g() : AbstractC5168b.f2815b;
    }

    /* renamed from: m */
    public static final boolean m3219m(C7848t c7848t) {
        return ((c7848t.m13309c() != null && !Intrinsics.areEqual(c7848t.m13309c(), "file")) || c7848t.m13308b() == null || AbstractC5214d.m3231h(c7848t)) ? false : true;
    }

    /* renamed from: n */
    public static final boolean m3220n(int i10) {
        return i10 == Integer.MIN_VALUE || i10 == Integer.MAX_VALUE;
    }

    /* renamed from: o */
    public static final boolean m3221o(InterfaceC5200a.a aVar) {
        return (aVar instanceof RealInterceptorChain) && ((RealInterceptorChain) aVar).m3101h();
    }

    /* renamed from: p */
    public static final String m3222p(C5167a c5167a, Object obj, C9892k c9892k, Logger logger, String str) {
        List listM2842h = c5167a.m2842h();
        int size = listM2842h.size();
        boolean z9 = false;
        for (int i10 = 0; i10 < size; i10++) {
            Pair pair = (Pair) listM2842h.get(i10);
            InterfaceC8993c interfaceC8993c = (InterfaceC8993c) pair.component1();
            if (((KClass) pair.component2()).isInstance(obj)) {
                Intrinsics.checkNotNull(interfaceC8993c, "null cannot be cast to non-null type coil3.key.Keyer<kotlin.Any>");
                String strMo15095a = interfaceC8993c.mo15095a(obj, c9892k);
                if (strMo15095a != null) {
                    return strMo15095a;
                }
                z9 = true;
            }
        }
        if (!z9 && logger != null) {
            Logger.Level level = Logger.Level.f3262d;
            if (logger.m3197a().compareTo(level) <= 0) {
                logger.m3198b(str, level, "No keyer is registered for data with type '" + Reflection.getOrCreateKotlinClass(obj.getClass()).getSimpleName() + "'. Register Keyer<" + Reflection.getOrCreateKotlinClass(obj.getClass()).getSimpleName() + "> in the component registry to cache the output image in the memory cache.", null);
            }
        }
        return null;
    }
}
