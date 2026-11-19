package p087f3;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p128o2.C2925r;
import p142q2.InterfaceC3015g;
import p171x2.InterfaceC3470l;
import p171x2.InterfaceC3474p;

/* renamed from: f3.m1 */
/* loaded from: classes.dex */
public interface InterfaceC2578m1 extends InterfaceC3015g.b {

    /* renamed from: P */
    @NotNull
    public static final b f10268P = b.f10269a;

    /* renamed from: f3.m1$a */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m8633a(InterfaceC2578m1 interfaceC2578m1, CancellationException cancellationException, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i4 & 1) != 0) {
                cancellationException = null;
            }
            interfaceC2578m1.mo8629B(cancellationException);
        }

        /* renamed from: b */
        public static <R> R m8634b(@NotNull InterfaceC2578m1 interfaceC2578m1, R r3, @NotNull InterfaceC3474p<? super R, ? super InterfaceC3015g.b, ? extends R> interfaceC3474p) {
            return (R) InterfaceC3015g.b.a.m10121a(interfaceC2578m1, r3, interfaceC3474p);
        }

        @Nullable
        /* renamed from: c */
        public static <E extends InterfaceC3015g.b> E m8635c(@NotNull InterfaceC2578m1 interfaceC2578m1, @NotNull InterfaceC3015g.c<E> cVar) {
            return (E) InterfaceC3015g.b.a.m10122b(interfaceC2578m1, cVar);
        }

        /* renamed from: d */
        public static /* synthetic */ InterfaceC2608w0 m8636d(InterfaceC2578m1 interfaceC2578m1, boolean z3, boolean z4, InterfaceC3470l interfaceC3470l, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i4 & 1) != 0) {
                z3 = false;
            }
            if ((i4 & 2) != 0) {
                z4 = true;
            }
            return interfaceC2578m1.mo8631r(z3, z4, interfaceC3470l);
        }

        @NotNull
        /* renamed from: e */
        public static InterfaceC3015g m8637e(@NotNull InterfaceC2578m1 interfaceC2578m1, @NotNull InterfaceC3015g.c<?> cVar) {
            return InterfaceC3015g.b.a.m10123c(interfaceC2578m1, cVar);
        }

        @NotNull
        /* renamed from: f */
        public static InterfaceC3015g m8638f(@NotNull InterfaceC2578m1 interfaceC2578m1, @NotNull InterfaceC3015g interfaceC3015g) {
            return InterfaceC3015g.b.a.m10124d(interfaceC2578m1, interfaceC3015g);
        }
    }

    /* renamed from: f3.m1$b */
    public static final class b implements InterfaceC3015g.c<InterfaceC2578m1> {

        /* renamed from: a */
        static final /* synthetic */ b f10269a = new b();

        private b() {
        }
    }

    /* renamed from: B */
    void mo8629B(@Nullable CancellationException cancellationException);

    @NotNull
    /* renamed from: a */
    InterfaceC2589q mo8630a(@NotNull InterfaceC2595s interfaceC2595s);

    boolean isActive();

    @NotNull
    /* renamed from: r */
    InterfaceC2608w0 mo8631r(boolean z3, boolean z4, @NotNull InterfaceC3470l<? super Throwable, C2925r> interfaceC3470l);

    boolean start();

    @NotNull
    /* renamed from: u */
    CancellationException mo8632u();
}
