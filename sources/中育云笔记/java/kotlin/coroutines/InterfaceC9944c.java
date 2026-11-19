package kotlin.coroutines;

import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9979u;
import vc.InterfaceC11588c;

/* renamed from: kotlin.coroutines.c */
/* loaded from: classes6.dex */
public interface InterfaceC9944c extends InterfaceC9945d.b {

    /* renamed from: a0 */
    public static final b f23354a0 = b.f23355c;

    /* renamed from: kotlin.coroutines.c$a */
    public static final class a {
        /* renamed from: a */
        public static InterfaceC9945d.b m20211a(InterfaceC9944c interfaceC9944c, InterfaceC9945d.c key) {
            InterfaceC9945d.b bVarM20210b;
            AbstractC9979u.m20294g(key, "key");
            if (!(key instanceof AbstractC9943b)) {
                if (InterfaceC9944c.f23354a0 != key) {
                    return null;
                }
                AbstractC9979u.m20292e(interfaceC9944c, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return interfaceC9944c;
            }
            AbstractC9943b abstractC9943b = (AbstractC9943b) key;
            if (!abstractC9943b.m20209a(interfaceC9944c.getKey()) || (bVarM20210b = abstractC9943b.m20210b(interfaceC9944c)) == null) {
                return null;
            }
            return bVarM20210b;
        }

        /* renamed from: b */
        public static InterfaceC9945d m20212b(InterfaceC9944c interfaceC9944c, InterfaceC9945d.c key) {
            AbstractC9979u.m20294g(key, "key");
            if (!(key instanceof AbstractC9943b)) {
                return InterfaceC9944c.f23354a0 == key ? EmptyCoroutineContext.f23351c : interfaceC9944c;
            }
            AbstractC9943b abstractC9943b = (AbstractC9943b) key;
            return (!abstractC9943b.m20209a(interfaceC9944c.getKey()) || abstractC9943b.m20210b(interfaceC9944c) == null) ? interfaceC9944c : EmptyCoroutineContext.f23351c;
        }
    }

    /* renamed from: kotlin.coroutines.c$b */
    public static final class b implements InterfaceC9945d.c {

        /* renamed from: c */
        public static final /* synthetic */ b f23355c = new b();
    }

    InterfaceC11588c interceptContinuation(InterfaceC11588c interfaceC11588c);

    void releaseInterceptedContinuation(InterfaceC11588c interfaceC11588c);
}
