package coil3;

import coil3.AbstractC5473h;
import coil3.C5452a;
import coil3.RealImageLoader;
import coil3.util.Logger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.AbstractC9942a;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import kotlinx.coroutines.AbstractC10006d;
import okio.Path;
import p001a0.C0026w;
import p001a0.InterfaceC0011h;
import p181hd.InterfaceC9529a;
import p212k.AbstractC9764r;
import p212k.C9766t;
import p253n.C10273c;
import p253n.C10278h;
import p253n.C10282l;
import p253n.InterfaceC10281k;
import p280od.InterfaceC10469c;
import p283p.C10591b;
import p283p.C10593d;
import p297q.C10688d;
import p297q.C10690f;
import p309qc.AbstractC10776g;
import p325rc.AbstractC10947g0;
import p364uc.AbstractC11382b;
import sd.AbstractC11108e2;
import sd.InterfaceC11110f0;
import sd.InterfaceC11122i0;

/* renamed from: coil3.h */
/* loaded from: classes3.dex */
public abstract class AbstractC5473h {

    /* renamed from: coil3.h$a */
    public static final class a extends AbstractC9942a implements InterfaceC11110f0 {
        public a(InterfaceC11110f0.a aVar, Logger logger) {
            super(aVar);
        }

        @Override // sd.InterfaceC11110f0
        public void handleException(InterfaceC9945d interfaceC9945d, Throwable th) {
        }
    }

    /* renamed from: coil3.h$b */
    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC11382b.m25330d(Integer.valueOf(((InterfaceC0011h) obj2).priority()), Integer.valueOf(((InterfaceC0011h) obj).priority()));
        }
    }

    /* renamed from: coil3.h$c */
    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            AbstractC9764r.m19682a(obj2);
            throw null;
        }
    }

    /* renamed from: c */
    public static final InterfaceC11122i0 m3160c(Logger logger) {
        return AbstractC10006d.m20744a(AbstractC11108e2.m24701b(null, 1, null).plus(new a(InterfaceC11110f0.f26779d0, logger)));
    }

    /* renamed from: e */
    public static final C5452a.a m3162e(C5452a.a aVar) {
        return aVar.m3019k(new C10690f(), AbstractC9983y.m20315b(String.class)).m3019k(new C10688d(), AbstractC9983y.m20315b(Path.class)).m3018j(new C10591b(), AbstractC9983y.m20315b(C9766t.class)).m3018j(new C10593d(), AbstractC9983y.m20315b(C9766t.class)).m3017i(new C10282l.a(), AbstractC9983y.m20315b(C9766t.class)).m3017i(new C10273c.a(), AbstractC9983y.m20315b(byte[].class)).m3017i(new C10278h.b(), AbstractC9983y.m20315b(C9766t.class));
    }

    /* renamed from: f */
    public static final C5452a.a m3163f(C5452a.a aVar, RealImageLoader.C5451a c5451a) {
        if (AbstractC5471f.m3153a(c5451a)) {
            aVar.m3021o(new InterfaceC9529a() { // from class: k.p
                @Override // p181hd.InterfaceC9529a
                public final Object invoke() {
                    return AbstractC5473h.m3164g();
                }
            });
            aVar.m3020n(new InterfaceC9529a() { // from class: k.q
                @Override // p181hd.InterfaceC9529a
                public final Object invoke() {
                    return AbstractC5473h.m3165h();
                }
            });
        }
        return aVar;
    }

    /* renamed from: g */
    public static final List m3164g() {
        InterfaceC10469c interfaceC10469cType;
        List listM23914P0 = AbstractC10947g0.m23914P0(C0026w.f11a.m57f(), new b());
        ArrayList arrayList = new ArrayList();
        int size = listM23914P0.size();
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC0011h interfaceC0011h = (InterfaceC0011h) listM23914P0.get(i10);
            AbstractC9979u.m20292e(interfaceC0011h, "null cannot be cast to non-null type coil3.util.FetcherServiceLoaderTarget<kotlin.Any>");
            InterfaceC10281k.a aVarFactory = interfaceC0011h.factory();
            Pair pairM22975a = null;
            if (aVarFactory != null && (interfaceC10469cType = interfaceC0011h.type()) != null) {
                pairM22975a = AbstractC10776g.m22975a(aVarFactory, interfaceC10469cType);
            }
            if (pairM22975a != null) {
                arrayList.add(pairM22975a);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public static final List m3165h() {
        List listM23914P0 = AbstractC10947g0.m23914P0(C0026w.f11a.m56e(), new c());
        ArrayList arrayList = new ArrayList();
        if (listM23914P0.size() <= 0) {
            return arrayList;
        }
        AbstractC9764r.m19682a(listM23914P0.get(0));
        throw null;
    }
}
