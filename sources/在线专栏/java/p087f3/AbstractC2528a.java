package p087f3;

import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142q2.InterfaceC3012d;
import p142q2.InterfaceC3015g;
import p171x2.InterfaceC3474p;

/* renamed from: f3.a */
/* loaded from: classes.dex */
public abstract class AbstractC2528a<T> extends C2600t1 implements InterfaceC3012d<T>, InterfaceC2557h0 {

    /* renamed from: b */
    @NotNull
    private final InterfaceC3015g f10220b;

    public AbstractC2528a(@NotNull InterfaceC3015g interfaceC3015g, boolean z3, boolean z4) {
        super(z4);
        if (z3) {
            m8701R((InterfaceC2578m1) interfaceC3015g.get(InterfaceC2578m1.f10268P));
        }
        this.f10220b = interfaceC3015g.plus(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p087f3.C2600t1
    @NotNull
    /* renamed from: A */
    public String mo8494A() {
        return C2769l.m9248l(C2573l0.m8591a(this), " was cancelled");
    }

    @Override // p087f3.C2600t1
    /* renamed from: Q */
    public final void mo8495Q(@NotNull Throwable th) {
        C2553g0.m8561a(this.f10220b, th);
    }

    @Override // p087f3.C2600t1
    @NotNull
    /* renamed from: Y */
    public String mo8496Y() {
        String strM8537b = C2541d0.m8537b(this.f10220b);
        if (strM8537b == null) {
            return super.mo8496Y();
        }
        return '\"' + strM8537b + "\":" + super.mo8496Y();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p087f3.C2600t1
    /* renamed from: d0 */
    protected final void mo8497d0(@Nullable Object obj) {
        if (!(obj instanceof C2613y)) {
            m8500v0(obj);
        } else {
            C2613y c2613y = (C2613y) obj;
            m8499u0(c2613y.f10316a, c2613y.m8759a());
        }
    }

    @Override // p087f3.InterfaceC2557h0
    @NotNull
    /* renamed from: e */
    public InterfaceC3015g mo2809e() {
        return this.f10220b;
    }

    @Override // p142q2.InterfaceC3012d
    @NotNull
    public final InterfaceC3015g getContext() {
        return this.f10220b;
    }

    @Override // p087f3.C2600t1, p087f3.InterfaceC2578m1
    public boolean isActive() {
        return super.isActive();
    }

    @Override // p142q2.InterfaceC3012d
    public final void resumeWith(@NotNull Object obj) {
        Object objM8704W = m8704W(C2537c0.m8534d(obj, null, 1, null));
        if (objM8704W == C2603u1.f10294b) {
            return;
        }
        mo8498t0(objM8704W);
    }

    /* renamed from: t0 */
    protected void mo8498t0(@Nullable Object obj) {
        mo8546l(obj);
    }

    /* renamed from: u0 */
    protected void m8499u0(@NotNull Throwable th, boolean z3) {
    }

    /* renamed from: v0 */
    protected void m8500v0(T t3) {
    }

    /* renamed from: w0 */
    public final <R> void m8501w0(@NotNull EnumC2565j0 enumC2565j0, R r3, @NotNull InterfaceC3474p<? super R, ? super InterfaceC3012d<? super T>, ? extends Object> interfaceC3474p) {
        enumC2565j0.m8583b(interfaceC3474p, r3, this);
    }
}
