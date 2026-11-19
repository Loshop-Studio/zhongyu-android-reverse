package p087f3;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142q2.InterfaceC3015g;
import p171x2.InterfaceC3474p;

/* renamed from: f3.l2 */
/* loaded from: classes.dex */
final class C2575l2 implements InterfaceC3015g.b, InterfaceC3015g.c<C2575l2> {

    /* renamed from: a */
    @NotNull
    public static final C2575l2 f10260a = new C2575l2();

    private C2575l2() {
    }

    @Override // p142q2.InterfaceC3015g
    public <R> R fold(R r3, @NotNull InterfaceC3474p<? super R, ? super InterfaceC3015g.b, ? extends R> interfaceC3474p) {
        return (R) InterfaceC3015g.b.a.m10121a(this, r3, interfaceC3474p);
    }

    @Override // p142q2.InterfaceC3015g.b, p142q2.InterfaceC3015g
    @Nullable
    public <E extends InterfaceC3015g.b> E get(@NotNull InterfaceC3015g.c<E> cVar) {
        return (E) InterfaceC3015g.b.a.m10122b(this, cVar);
    }

    @Override // p142q2.InterfaceC3015g.b
    @NotNull
    public InterfaceC3015g.c<?> getKey() {
        return this;
    }

    @Override // p142q2.InterfaceC3015g
    @NotNull
    public InterfaceC3015g minusKey(@NotNull InterfaceC3015g.c<?> cVar) {
        return InterfaceC3015g.b.a.m10123c(this, cVar);
    }

    @Override // p142q2.InterfaceC3015g
    @NotNull
    public InterfaceC3015g plus(@NotNull InterfaceC3015g interfaceC3015g) {
        return InterfaceC3015g.b.a.m10124d(this, interfaceC3015g);
    }
}
