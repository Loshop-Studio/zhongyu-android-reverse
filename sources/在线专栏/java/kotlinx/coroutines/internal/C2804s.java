package kotlinx.coroutines.internal;

import kotlin.coroutines.jvm.internal.InterfaceC2749e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p087f3.AbstractC2528a;
import p087f3.C2537c0;
import p087f3.InterfaceC2578m1;
import p087f3.InterfaceC2589q;
import p142q2.InterfaceC3012d;
import p142q2.InterfaceC3015g;
import p146r2.C3032c;

/* renamed from: kotlinx.coroutines.internal.s */
/* loaded from: classes.dex */
public class C2804s<T> extends AbstractC2528a<T> implements InterfaceC2749e {

    /* renamed from: c */
    @NotNull
    public final InterfaceC3012d<T> f10786c;

    /* JADX WARN: Multi-variable type inference failed */
    public C2804s(@NotNull InterfaceC3015g interfaceC3015g, @NotNull InterfaceC3012d<? super T> interfaceC3012d) {
        super(interfaceC3015g, true, true);
        this.f10786c = interfaceC3012d;
    }

    @Override // p087f3.C2600t1
    /* renamed from: U */
    protected final boolean mo8545U() {
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.InterfaceC2749e
    @Nullable
    public final InterfaceC2749e getCallerFrame() {
        InterfaceC3012d<T> interfaceC3012d = this.f10786c;
        if (interfaceC3012d instanceof InterfaceC2749e) {
            return (InterfaceC2749e) interfaceC3012d;
        }
        return null;
    }

    @Override // p087f3.C2600t1
    /* renamed from: l */
    protected void mo8546l(@Nullable Object obj) {
        C2791f.m9290c(C3032c.m10174b(this.f10786c), C2537c0.m8531a(obj, this.f10786c), null, 2, null);
    }

    @Override // p087f3.AbstractC2528a
    /* renamed from: t0 */
    protected void mo8498t0(@Nullable Object obj) {
        InterfaceC3012d<T> interfaceC3012d = this.f10786c;
        interfaceC3012d.resumeWith(C2537c0.m8531a(obj, interfaceC3012d));
    }

    @Nullable
    /* renamed from: x0 */
    public final InterfaceC2578m1 m9342x0() {
        InterfaceC2589q interfaceC2589qM8699N = m8699N();
        if (interfaceC2589qM8699N == null) {
            return null;
        }
        return interfaceC2589qM8699N.getParent();
    }
}
