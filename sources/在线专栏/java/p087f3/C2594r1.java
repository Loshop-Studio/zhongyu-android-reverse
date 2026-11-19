package p087f3;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142q2.InterfaceC3015g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: f3.r1 */
/* loaded from: classes.dex */
public final /* synthetic */ class C2594r1 {
    @NotNull
    /* renamed from: a */
    public static final InterfaceC2607w m8656a(@Nullable InterfaceC2578m1 interfaceC2578m1) {
        return new C2588p1(interfaceC2578m1);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC2607w m8657b(InterfaceC2578m1 interfaceC2578m1, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            interfaceC2578m1 = null;
        }
        return C2591q1.m8648a(interfaceC2578m1);
    }

    /* renamed from: c */
    public static final void m8658c(@NotNull InterfaceC3015g interfaceC3015g, @Nullable CancellationException cancellationException) {
        InterfaceC2578m1 interfaceC2578m1 = (InterfaceC2578m1) interfaceC3015g.get(InterfaceC2578m1.f10268P);
        if (interfaceC2578m1 == null) {
            return;
        }
        interfaceC2578m1.mo8629B(cancellationException);
    }

    /* renamed from: d */
    public static /* synthetic */ void m8659d(InterfaceC3015g interfaceC3015g, CancellationException cancellationException, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            cancellationException = null;
        }
        C2591q1.m8650c(interfaceC3015g, cancellationException);
    }

    /* renamed from: e */
    public static final void m8660e(@NotNull InterfaceC2578m1 interfaceC2578m1) {
        if (!interfaceC2578m1.isActive()) {
            throw interfaceC2578m1.mo8632u();
        }
    }

    /* renamed from: f */
    public static final void m8661f(@NotNull InterfaceC3015g interfaceC3015g) {
        InterfaceC2578m1 interfaceC2578m1 = (InterfaceC2578m1) interfaceC3015g.get(InterfaceC2578m1.f10268P);
        if (interfaceC2578m1 == null) {
            return;
        }
        C2591q1.m8652e(interfaceC2578m1);
    }
}
