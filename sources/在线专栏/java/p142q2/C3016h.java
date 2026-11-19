package p142q2;

import java.io.Serializable;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142q2.InterfaceC3015g;
import p171x2.InterfaceC3474p;

/* renamed from: q2.h */
/* loaded from: classes.dex */
public final class C3016h implements InterfaceC3015g, Serializable {

    /* renamed from: a */
    @NotNull
    public static final C3016h f11678a = new C3016h();

    private C3016h() {
    }

    @Override // p142q2.InterfaceC3015g
    public <R> R fold(R r3, @NotNull InterfaceC3474p<? super R, ? super InterfaceC3015g.b, ? extends R> operation) {
        C2769l.m9241e(operation, "operation");
        return r3;
    }

    @Override // p142q2.InterfaceC3015g
    @Nullable
    public <E extends InterfaceC3015g.b> E get(@NotNull InterfaceC3015g.c<E> key) {
        C2769l.m9241e(key, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // p142q2.InterfaceC3015g
    @NotNull
    public InterfaceC3015g minusKey(@NotNull InterfaceC3015g.c<?> key) {
        C2769l.m9241e(key, "key");
        return this;
    }

    @Override // p142q2.InterfaceC3015g
    @NotNull
    public InterfaceC3015g plus(@NotNull InterfaceC3015g context) {
        C2769l.m9241e(context, "context");
        return context;
    }

    @NotNull
    public String toString() {
        return "EmptyCoroutineContext";
    }
}
