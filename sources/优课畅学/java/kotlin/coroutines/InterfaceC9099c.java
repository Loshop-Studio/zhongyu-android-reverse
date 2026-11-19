package kotlin.coroutines;

import kotlin.coroutines.InterfaceC9100d;
import kotlin.jvm.internal.AbstractC9133u;
import p179m7.InterfaceC9324c;

/* renamed from: kotlin.coroutines.c */
/* loaded from: classes5.dex */
public interface InterfaceC9099c extends InterfaceC9100d.b {

    /* renamed from: b0 */
    public static final b f17441b0 = b.f17442a;

    /* renamed from: kotlin.coroutines.c$a */
    public static final class a {
        /* renamed from: a */
        public static InterfaceC9100d.b m16066a(InterfaceC9099c interfaceC9099c, InterfaceC9100d.c key) {
            InterfaceC9100d.b bVarM16065b;
            AbstractC9133u.m16133g(key, "key");
            if (!(key instanceof AbstractC9098b)) {
                if (InterfaceC9099c.f17441b0 != key) {
                    return null;
                }
                AbstractC9133u.m16131e(interfaceC9099c, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return interfaceC9099c;
            }
            AbstractC9098b abstractC9098b = (AbstractC9098b) key;
            if (!abstractC9098b.m16064a(interfaceC9099c.getKey()) || (bVarM16065b = abstractC9098b.m16065b(interfaceC9099c)) == null) {
                return null;
            }
            return bVarM16065b;
        }

        /* renamed from: b */
        public static InterfaceC9100d m16067b(InterfaceC9099c interfaceC9099c, InterfaceC9100d.c key) {
            AbstractC9133u.m16133g(key, "key");
            if (!(key instanceof AbstractC9098b)) {
                return InterfaceC9099c.f17441b0 == key ? EmptyCoroutineContext.f17438a : interfaceC9099c;
            }
            AbstractC9098b abstractC9098b = (AbstractC9098b) key;
            return (!abstractC9098b.m16064a(interfaceC9099c.getKey()) || abstractC9098b.m16065b(interfaceC9099c) == null) ? interfaceC9099c : EmptyCoroutineContext.f17438a;
        }
    }

    /* renamed from: kotlin.coroutines.c$b */
    public static final class b implements InterfaceC9100d.c {

        /* renamed from: a */
        public static final /* synthetic */ b f17442a = new b();
    }

    InterfaceC9324c interceptContinuation(InterfaceC9324c interfaceC9324c);

    void releaseInterceptedContinuation(InterfaceC9324c interfaceC9324c);
}
