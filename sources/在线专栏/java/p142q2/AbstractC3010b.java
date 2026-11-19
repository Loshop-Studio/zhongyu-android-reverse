package p142q2;

import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142q2.InterfaceC3015g;
import p142q2.InterfaceC3015g.b;
import p171x2.InterfaceC3470l;

/* renamed from: q2.b */
/* loaded from: classes.dex */
public abstract class AbstractC3010b<B extends InterfaceC3015g.b, E extends B> implements InterfaceC3015g.c<E> {

    /* renamed from: a */
    @NotNull
    private final InterfaceC3470l<InterfaceC3015g.b, E> f11670a;

    /* renamed from: b */
    @NotNull
    private final InterfaceC3015g.c<?> f11671b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [q2.g$c<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, x2.l<? super q2.g$b, ? extends E extends B>, x2.l<q2.g$b, E extends B>] */
    public AbstractC3010b(@NotNull InterfaceC3015g.c<B> baseKey, @NotNull InterfaceC3470l<? super InterfaceC3015g.b, ? extends E> safeCast) {
        C2769l.m9241e(baseKey, "baseKey");
        C2769l.m9241e(safeCast, "safeCast");
        this.f11670a = safeCast;
        this.f11671b = baseKey instanceof AbstractC3010b ? (InterfaceC3015g.c<B>) ((AbstractC3010b) baseKey).f11671b : baseKey;
    }

    /* renamed from: a */
    public final boolean m10110a(@NotNull InterfaceC3015g.c<?> key) {
        C2769l.m9241e(key, "key");
        return key == this || this.f11671b == key;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lq2/g$b;)TE; */
    @Nullable
    /* renamed from: b */
    public final InterfaceC3015g.b m10111b(@NotNull InterfaceC3015g.b element) {
        C2769l.m9241e(element, "element");
        return (InterfaceC3015g.b) this.f11670a.invoke(element);
    }
}
