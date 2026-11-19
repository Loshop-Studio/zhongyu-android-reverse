package p107j3;

import kotlin.jvm.internal.C2764g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142q2.InterfaceC3015g;
import p171x2.InterfaceC3474p;

/* renamed from: j3.d */
/* loaded from: classes.dex */
public final class C2697d implements InterfaceC3015g.b {

    /* renamed from: c */
    @NotNull
    public static final a f10659c = new a(null);

    /* renamed from: a */
    @NotNull
    public final Throwable f10660a;

    /* renamed from: b */
    @NotNull
    private final InterfaceC3015g.c<?> f10661b = f10659c;

    /* renamed from: j3.d$a */
    public static final class a implements InterfaceC3015g.c<C2697d> {
        private a() {
        }

        public /* synthetic */ a(C2764g c2764g) {
            this();
        }
    }

    public C2697d(@NotNull Throwable th) {
        this.f10660a = th;
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
        return this.f10661b;
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
