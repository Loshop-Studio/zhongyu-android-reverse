package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.InterfaceC9945d;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p296pd.InterfaceC10659g;
import sd.InterfaceC11149p;
import sd.InterfaceC11156r;
import sd.InterfaceC11163t0;
import vc.InterfaceC11588c;

/* renamed from: kotlinx.coroutines.g */
/* loaded from: classes6.dex */
public interface InterfaceC10045g extends InterfaceC9945d.b {

    /* renamed from: b0 */
    public static final b f23976b0 = b.f23977c;

    /* renamed from: kotlinx.coroutines.g$a */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m20900a(InterfaceC10045g interfaceC10045g, CancellationException cancellationException, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                cancellationException = null;
            }
            interfaceC10045g.cancel(cancellationException);
        }

        /* renamed from: b */
        public static Object m20901b(InterfaceC10045g interfaceC10045g, Object obj, InterfaceC9544p interfaceC9544p) {
            return InterfaceC9945d.b.a.m20216a(interfaceC10045g, obj, interfaceC9544p);
        }

        /* renamed from: c */
        public static InterfaceC9945d.b m20902c(InterfaceC10045g interfaceC10045g, InterfaceC9945d.c cVar) {
            return InterfaceC9945d.b.a.m20217b(interfaceC10045g, cVar);
        }

        /* renamed from: d */
        public static InterfaceC9945d m20903d(InterfaceC10045g interfaceC10045g, InterfaceC9945d.c cVar) {
            return InterfaceC9945d.b.a.m20218c(interfaceC10045g, cVar);
        }

        /* renamed from: e */
        public static InterfaceC9945d m20904e(InterfaceC10045g interfaceC10045g, InterfaceC9945d interfaceC9945d) {
            return InterfaceC9945d.b.a.m20219d(interfaceC10045g, interfaceC9945d);
        }
    }

    /* renamed from: kotlinx.coroutines.g$b */
    public static final class b implements InterfaceC9945d.c {

        /* renamed from: c */
        public static final /* synthetic */ b f23977c = new b();
    }

    /* renamed from: A */
    InterfaceC11163t0 mo20404A(InterfaceC9540l interfaceC9540l);

    void cancel(CancellationException cancellationException);

    /* renamed from: f */
    InterfaceC10659g mo20436f();

    /* renamed from: g */
    CancellationException mo20438g();

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    boolean start();

    /* renamed from: t */
    InterfaceC11163t0 mo20455t(boolean z10, boolean z11, InterfaceC9540l interfaceC9540l);

    /* renamed from: v */
    Object mo20458v(InterfaceC11588c interfaceC11588c);

    /* renamed from: y */
    InterfaceC11149p mo20464y(InterfaceC11156r interfaceC11156r);
}
