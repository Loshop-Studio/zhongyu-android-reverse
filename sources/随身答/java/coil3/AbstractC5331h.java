package coil3;

import coil3.AbstractC5331h;
import coil3.C5302a;
import coil3.RealImageLoader;
import coil3.decode.InterfaceC5319a;
import coil3.util.Logger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import okio.Path;
import p090e0.C7824v;
import p090e0.InterfaceC7807e;
import p090e0.InterfaceC7809g;
import p151k.C8247r;
import p207p.C9290c;
import p207p.C9295h;
import p207p.C9299l;
import p207p.InterfaceC9298k;
import p227r.C9387b;
import p227r.C9389d;
import p237s.C9460d;
import p237s.C9462f;

/* renamed from: coil3.h */
/* loaded from: classes3.dex */
public abstract class AbstractC5331h {

    /* renamed from: coil3.h$a */
    public static final class a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public a(CoroutineExceptionHandler.Companion companion, Logger logger) {
            super(companion);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th) {
        }
    }

    /* renamed from: coil3.h$b */
    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((InterfaceC7809g) obj2).priority()), Integer.valueOf(((InterfaceC7809g) obj).priority()));
        }
    }

    /* renamed from: coil3.h$c */
    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((InterfaceC7807e) obj2).priority()), Integer.valueOf(((InterfaceC7807e) obj).priority()));
        }
    }

    /* renamed from: c */
    public static final CoroutineScope m2788c(Logger logger) {
        return CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(new a(CoroutineExceptionHandler.INSTANCE, logger)));
    }

    /* renamed from: e */
    public static final C5302a.a m2790e(C5302a.a aVar) {
        return aVar.m2588k(new C9462f(), Reflection.getOrCreateKotlinClass(String.class)).m2588k(new C9460d(), Reflection.getOrCreateKotlinClass(Path.class)).m2587j(new C9387b(), Reflection.getOrCreateKotlinClass(C8247r.class)).m2587j(new C9389d(), Reflection.getOrCreateKotlinClass(C8247r.class)).m2586i(new C9299l.a(), Reflection.getOrCreateKotlinClass(C8247r.class)).m2586i(new C9290c.a(), Reflection.getOrCreateKotlinClass(byte[].class)).m2586i(new C9295h.b(), Reflection.getOrCreateKotlinClass(C8247r.class));
    }

    /* renamed from: f */
    public static final C5302a.a m2791f(C5302a.a aVar, RealImageLoader.C5301a c5301a) {
        if (AbstractC5329f.m2782a(c5301a)) {
            aVar.m2590o(new Function0() { // from class: k.o
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbstractC5331h.m2792g();
                }
            });
            aVar.m2589n(new Function0() { // from class: k.p
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbstractC5331h.m2793h();
                }
            });
        }
        return aVar;
    }

    /* renamed from: g */
    public static final List m2792g() {
        KClass kClassType;
        List listSortedWith = CollectionsKt.sortedWith(C7824v.f13133a.m12223f(), new b());
        ArrayList arrayList = new ArrayList();
        int size = listSortedWith.size();
        for (int i9 = 0; i9 < size; i9++) {
            InterfaceC7809g interfaceC7809g = (InterfaceC7809g) listSortedWith.get(i9);
            Intrinsics.checkNotNull(interfaceC7809g, "null cannot be cast to non-null type coil3.util.FetcherServiceLoaderTarget<kotlin.Any>");
            InterfaceC9298k.a aVarFactory = interfaceC7809g.factory();
            Pair pairM13420to = null;
            if (aVarFactory != null && (kClassType = interfaceC7809g.type()) != null) {
                pairM13420to = TuplesKt.m13420to(aVarFactory, kClassType);
            }
            if (pairM13420to != null) {
                arrayList.add(pairM13420to);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public static final List m2793h() {
        List listSortedWith = CollectionsKt.sortedWith(C7824v.f13133a.m12222e(), new c());
        ArrayList arrayList = new ArrayList();
        int size = listSortedWith.size();
        for (int i9 = 0; i9 < size; i9++) {
            InterfaceC5319a.a aVarFactory = ((InterfaceC7807e) listSortedWith.get(i9)).factory();
            if (aVarFactory != null) {
                arrayList.add(aVarFactory);
            }
        }
        return arrayList;
    }
}
