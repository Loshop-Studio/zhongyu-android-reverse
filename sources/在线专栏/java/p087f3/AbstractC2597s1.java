package p087f3;

import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: f3.s1 */
/* loaded from: classes.dex */
public abstract class AbstractC2597s1 extends AbstractC2529a0 implements InterfaceC2608w0, InterfaceC2558h1 {

    /* renamed from: d */
    public C2600t1 f10279d;

    @Override // p087f3.InterfaceC2558h1
    @Nullable
    /* renamed from: a */
    public C2615y1 mo8563a() {
        return null;
    }

    @Override // p087f3.InterfaceC2608w0
    /* renamed from: b */
    public void mo8520b() {
        m8666t().m8707h0(this);
    }

    @Override // p087f3.InterfaceC2558h1
    public boolean isActive() {
        return true;
    }

    @NotNull
    /* renamed from: t */
    public final C2600t1 m8666t() {
        C2600t1 c2600t1 = this.f10279d;
        if (c2600t1 != null) {
            return c2600t1;
        }
        C2769l.m9256t("job");
        throw null;
    }

    @Override // kotlinx.coroutines.internal.C2796k
    @NotNull
    public String toString() {
        return C2573l0.m8591a(this) + '@' + C2573l0.m8592b(this) + "[job@" + C2573l0.m8592b(m8666t()) + ']';
    }

    /* renamed from: u */
    public final void m8667u(@NotNull C2600t1 c2600t1) {
        this.f10279d = c2600t1;
    }
}
