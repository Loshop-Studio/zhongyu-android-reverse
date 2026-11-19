package p142q2;

import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142q2.InterfaceC3015g;
import p171x2.InterfaceC3474p;

/* renamed from: q2.a */
/* loaded from: classes.dex */
public abstract class AbstractC3009a implements InterfaceC3015g.b {

    @NotNull
    private final InterfaceC3015g.c<?> key;

    public AbstractC3009a(@NotNull InterfaceC3015g.c<?> key) {
        C2769l.m9241e(key, "key");
        this.key = key;
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
        return this.key;
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
