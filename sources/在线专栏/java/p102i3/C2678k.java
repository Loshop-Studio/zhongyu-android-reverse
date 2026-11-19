package p102i3;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p107j3.AbstractC2696c;
import p128o2.C2925r;
import p142q2.InterfaceC3012d;

/* renamed from: i3.k */
/* loaded from: classes.dex */
final class C2678k extends AbstractC2696c<C2676i<?>> {

    /* renamed from: a */
    public long f10628a = -1;

    /* renamed from: b */
    @Nullable
    public InterfaceC3012d<? super C2925r> f10629b;

    @Override // p107j3.AbstractC2696c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo8995a(@NotNull C2676i<?> c2676i) {
        if (this.f10628a >= 0) {
            return false;
        }
        this.f10628a = c2676i.m8985T();
        return true;
    }

    @Override // p107j3.AbstractC2696c
    @NotNull
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceC3012d<C2925r>[] mo8996b(@NotNull C2676i<?> c2676i) {
        long j4 = this.f10628a;
        this.f10628a = -1L;
        this.f10629b = null;
        return c2676i.m8984S(j4);
    }
}
