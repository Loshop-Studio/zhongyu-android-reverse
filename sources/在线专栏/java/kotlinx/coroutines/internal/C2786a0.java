package kotlinx.coroutines.internal;

import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p087f3.InterfaceC2559h2;
import p142q2.InterfaceC3015g;

/* renamed from: kotlinx.coroutines.internal.a0 */
/* loaded from: classes.dex */
final class C2786a0 {

    /* renamed from: a */
    @NotNull
    public final InterfaceC3015g f10745a;

    /* renamed from: b */
    @NotNull
    private final Object[] f10746b;

    /* renamed from: c */
    @NotNull
    private final InterfaceC2559h2<Object>[] f10747c;

    /* renamed from: d */
    private int f10748d;

    public C2786a0(@NotNull InterfaceC3015g interfaceC3015g, int i4) {
        this.f10745a = interfaceC3015g;
        this.f10746b = new Object[i4];
        this.f10747c = new InterfaceC2559h2[i4];
    }

    /* renamed from: a */
    public final void m9275a(@NotNull InterfaceC2559h2<?> interfaceC2559h2, @Nullable Object obj) {
        Object[] objArr = this.f10746b;
        int i4 = this.f10748d;
        objArr[i4] = obj;
        InterfaceC2559h2<Object>[] interfaceC2559h2Arr = this.f10747c;
        this.f10748d = i4 + 1;
        interfaceC2559h2Arr[i4] = interfaceC2559h2;
    }

    /* renamed from: b */
    public final void m9276b(@NotNull InterfaceC3015g interfaceC3015g) {
        int length = this.f10747c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i4 = length - 1;
            InterfaceC2559h2<Object> interfaceC2559h2 = this.f10747c[length];
            C2769l.m9239c(interfaceC2559h2);
            interfaceC2559h2.m8570o(interfaceC3015g, this.f10746b[length]);
            if (i4 < 0) {
                return;
            } else {
                length = i4;
            }
        }
    }
}
