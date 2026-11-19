package coil3;

import coil3.AbstractC4577h;
import coil3.C4548a;
import coil3.RealImageLoader;
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
import p023c0.C4478w;
import p023c0.InterfaceC4463h;
import p087k.AbstractC6619r;
import p087k.C6621t;
import p124p.C7574c;
import p124p.C7579h;
import p124p.C7583l;
import p124p.InterfaceC7582k;
import p138r.C7632b;
import p138r.C7634d;
import p145s.C7676d;
import p145s.C7678f;

/* renamed from: coil3.h */
/* loaded from: classes3.dex */
public abstract class AbstractC4577h {

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
            return ComparisonsKt.compareValues(Integer.valueOf(((InterfaceC4463h) obj2).mo1539a()), Integer.valueOf(((InterfaceC4463h) obj).mo1539a()));
        }
    }

    /* renamed from: coil3.h$c */
    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            AbstractC6619r.m7572a(obj2);
            throw null;
        }
    }

    /* renamed from: c */
    public static final CoroutineScope m1894c(Logger logger) {
        return CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(new a(CoroutineExceptionHandler.INSTANCE, logger)));
    }

    /* renamed from: e */
    public static final C4548a.a m1896e(C4548a.a aVar) {
        return aVar.m1694k(new C7678f(), Reflection.getOrCreateKotlinClass(String.class)).m1694k(new C7676d(), Reflection.getOrCreateKotlinClass(Path.class)).m1693j(new C7632b(), Reflection.getOrCreateKotlinClass(C6621t.class)).m1693j(new C7634d(), Reflection.getOrCreateKotlinClass(C6621t.class)).m1692i(new C7583l.a(), Reflection.getOrCreateKotlinClass(C6621t.class)).m1692i(new C7574c.a(), Reflection.getOrCreateKotlinClass(byte[].class)).m1692i(new C7579h.b(), Reflection.getOrCreateKotlinClass(C6621t.class));
    }

    /* renamed from: f */
    public static final C4548a.a m1897f(C4548a.a aVar, RealImageLoader.C4547a c4547a) {
        if (AbstractC4575f.m1887a(c4547a)) {
            aVar.m1696o(new Function0() { // from class: k.p
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbstractC4577h.m1898g();
                }
            });
            aVar.m1695n(new Function0() { // from class: k.q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbstractC4577h.m1899h();
                }
            });
        }
        return aVar;
    }

    /* renamed from: g */
    public static final List m1898g() {
        KClass kClassType;
        List listSortedWith = CollectionsKt.sortedWith(C4478w.f1341a.m1574f(), new b());
        ArrayList arrayList = new ArrayList();
        int size = listSortedWith.size();
        for (int i6 = 0; i6 < size; i6++) {
            InterfaceC4463h interfaceC4463h = (InterfaceC4463h) listSortedWith.get(i6);
            Intrinsics.checkNotNull(interfaceC4463h, "null cannot be cast to non-null type coil3.util.FetcherServiceLoaderTarget<kotlin.Any>");
            InterfaceC7582k.a aVarFactory = interfaceC4463h.factory();
            Pair pairM7887to = null;
            if (aVarFactory != null && (kClassType = interfaceC4463h.type()) != null) {
                pairM7887to = TuplesKt.m7887to(aVarFactory, kClassType);
            }
            if (pairM7887to != null) {
                arrayList.add(pairM7887to);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public static final List m1899h() {
        List listSortedWith = CollectionsKt.sortedWith(C4478w.f1341a.m1573e(), new c());
        ArrayList arrayList = new ArrayList();
        if (listSortedWith.size() <= 0) {
            return arrayList;
        }
        AbstractC6619r.m7572a(listSortedWith.get(0));
        throw null;
    }
}
