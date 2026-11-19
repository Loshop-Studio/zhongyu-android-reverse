package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.InterfaceC9100d;
import p101f8.InterfaceC8469g;
import p135i8.InterfaceC8849k0;
import p135i8.InterfaceC8860o;
import p135i8.InterfaceC8866q;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* renamed from: kotlinx.coroutines.n */
/* loaded from: classes5.dex */
public interface InterfaceC9212n extends InterfaceC9100d.b {

    /* renamed from: c0 */
    public static final b f18095c0 = b.f18096a;

    /* renamed from: kotlinx.coroutines.n$a */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m16777a(InterfaceC9212n interfaceC9212n, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            interfaceC9212n.cancel(cancellationException);
        }

        /* renamed from: b */
        public static Object m16778b(InterfaceC9212n interfaceC9212n, Object obj, InterfaceC10574p interfaceC10574p) {
            return InterfaceC9100d.b.a.m16071a(interfaceC9212n, obj, interfaceC10574p);
        }

        /* renamed from: c */
        public static InterfaceC9100d.b m16779c(InterfaceC9212n interfaceC9212n, InterfaceC9100d.c cVar) {
            return InterfaceC9100d.b.a.m16072b(interfaceC9212n, cVar);
        }

        /* renamed from: d */
        public static InterfaceC9100d m16780d(InterfaceC9212n interfaceC9212n, InterfaceC9100d.c cVar) {
            return InterfaceC9100d.b.a.m16073c(interfaceC9212n, cVar);
        }

        /* renamed from: e */
        public static InterfaceC9100d m16781e(InterfaceC9212n interfaceC9212n, InterfaceC9100d interfaceC9100d) {
            return InterfaceC9100d.b.a.m16074d(interfaceC9212n, interfaceC9100d);
        }
    }

    /* renamed from: kotlinx.coroutines.n$b */
    public static final class b implements InterfaceC9100d.c {

        /* renamed from: a */
        public static final /* synthetic */ b f18096a = new b();
    }

    void cancel(CancellationException cancellationException);

    /* renamed from: d */
    InterfaceC8469g mo16279d();

    /* renamed from: e */
    CancellationException mo16281e();

    InterfaceC9212n getParent();

    boolean isActive();

    boolean isCancelled();

    /* renamed from: k */
    InterfaceC8849k0 mo16287k(InterfaceC10570l interfaceC10570l);

    /* renamed from: l */
    boolean mo16289l();

    /* renamed from: n */
    Object mo16291n(InterfaceC9324c interfaceC9324c);

    /* renamed from: p */
    InterfaceC8849k0 mo16294p(boolean z10, boolean z11, InterfaceC10570l interfaceC10570l);

    /* renamed from: s */
    InterfaceC8860o mo16297s(InterfaceC8866q interfaceC8866q);

    boolean start();
}
