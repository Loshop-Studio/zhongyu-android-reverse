package p102i3;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p087f3.InterfaceC2578m1;
import p128o2.C2925r;
import p142q2.InterfaceC3012d;

/* renamed from: i3.g */
/* loaded from: classes.dex */
final class C2674g<T> implements InterfaceC2675h<T>, InterfaceC2668a {

    /* renamed from: a */
    @Nullable
    private final InterfaceC2578m1 f10605a;

    /* renamed from: b */
    private final /* synthetic */ InterfaceC2675h<T> f10606b;

    /* JADX WARN: Multi-variable type inference failed */
    public C2674g(@NotNull InterfaceC2675h<? extends T> interfaceC2675h, @Nullable InterfaceC2578m1 interfaceC2578m1) {
        this.f10605a = interfaceC2578m1;
        this.f10606b = interfaceC2675h;
    }

    @Override // p102i3.InterfaceC2668a
    @Nullable
    /* renamed from: c */
    public Object mo8948c(@NotNull InterfaceC2669b<? super T> interfaceC2669b, @NotNull InterfaceC3012d<? super C2925r> interfaceC3012d) {
        return this.f10606b.mo8948c(interfaceC2669b, interfaceC3012d);
    }
}
