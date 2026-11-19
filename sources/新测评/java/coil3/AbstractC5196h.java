package coil3;

import coil3.AbstractC5196h;
import coil3.C5167a;
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
import p030c0.C5098w;
import p030c0.InterfaceC5083h;
import p137k.AbstractC7846r;
import p137k.C7848t;
import p194p.C8787c;
import p194p.C8792h;
import p194p.C8796l;
import p194p.InterfaceC8795k;
import p216r.C8992b;
import p216r.C8994d;
import p227s.C9096d;
import p227s.C9098f;

/* renamed from: coil3.h */
/* loaded from: classes3.dex */
public abstract class AbstractC5196h {

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
            return ComparisonsKt.compareValues(Integer.valueOf(((InterfaceC5083h) obj2).priority()), Integer.valueOf(((InterfaceC5083h) obj).priority()));
        }
    }

    /* renamed from: coil3.h$c */
    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            AbstractC7846r.m13306a(obj2);
            throw null;
        }
    }

    /* renamed from: c */
    public static final CoroutineScope m3068c(Logger logger) {
        return CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(new a(CoroutineExceptionHandler.INSTANCE, logger)));
    }

    /* renamed from: e */
    public static final C5167a.a m3070e(C5167a.a aVar) {
        return aVar.m2860k(new C9098f(), Reflection.getOrCreateKotlinClass(String.class)).m2860k(new C9096d(), Reflection.getOrCreateKotlinClass(Path.class)).m2859j(new C8992b(), Reflection.getOrCreateKotlinClass(C7848t.class)).m2859j(new C8994d(), Reflection.getOrCreateKotlinClass(C7848t.class)).m2858i(new C8796l.a(), Reflection.getOrCreateKotlinClass(C7848t.class)).m2858i(new C8787c.a(), Reflection.getOrCreateKotlinClass(byte[].class)).m2858i(new C8792h.b(), Reflection.getOrCreateKotlinClass(C7848t.class));
    }

    /* renamed from: f */
    public static final C5167a.a m3071f(C5167a.a aVar, RealImageLoader.C5166a c5166a) {
        if (AbstractC5194f.m3061b(c5166a)) {
            aVar.m2862o(new Function0() { // from class: k.p
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbstractC5196h.m3072g();
                }
            });
            aVar.m2861n(new Function0() { // from class: k.q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AbstractC5196h.m3073h();
                }
            });
        }
        return aVar;
    }

    /* renamed from: g */
    public static final List m3072g() {
        KClass kClassType;
        List listSortedWith = CollectionsKt.sortedWith(C5098w.f2661a.m2716f(), new b());
        ArrayList arrayList = new ArrayList();
        int size = listSortedWith.size();
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC5083h interfaceC5083h = (InterfaceC5083h) listSortedWith.get(i10);
            Intrinsics.checkNotNull(interfaceC5083h, "null cannot be cast to non-null type coil3.util.FetcherServiceLoaderTarget<kotlin.Any>");
            InterfaceC8795k.a aVarFactory = interfaceC5083h.factory();
            Pair pairM13565to = null;
            if (aVarFactory != null && (kClassType = interfaceC5083h.type()) != null) {
                pairM13565to = TuplesKt.m13565to(aVarFactory, kClassType);
            }
            if (pairM13565to != null) {
                arrayList.add(pairM13565to);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public static final List m3073h() {
        List listSortedWith = CollectionsKt.sortedWith(C5098w.f2661a.m2715e(), new c());
        ArrayList arrayList = new ArrayList();
        if (listSortedWith.size() <= 0) {
            return arrayList;
        }
        AbstractC7846r.m13306a(listSortedWith.get(0));
        throw null;
    }
}
