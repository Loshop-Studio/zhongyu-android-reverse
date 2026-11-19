package ge;

import gd.AbstractC9293a;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p280od.InterfaceC10469c;
import p280od.InterfaceC10471e;
import p280od.InterfaceC10481o;

/* renamed from: ge.v0 */
/* loaded from: classes6.dex */
public final class C9389v0 implements InterfaceC10481o {

    /* renamed from: c */
    public final InterfaceC10481o f21817c;

    public C9389v0(InterfaceC10481o origin) {
        AbstractC9979u.m20294g(origin, "origin");
        this.f21817c = origin;
    }

    @Override // p280od.InterfaceC10481o
    /* renamed from: a */
    public boolean mo18565a() {
        return this.f21817c.mo18565a();
    }

    @Override // p280od.InterfaceC10481o
    /* renamed from: c */
    public InterfaceC10471e mo18566c() {
        return this.f21817c.mo18566c();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        InterfaceC10481o interfaceC10481o = this.f21817c;
        C9389v0 c9389v0 = obj instanceof C9389v0 ? (C9389v0) obj : null;
        if (!AbstractC9979u.m20289b(interfaceC10481o, c9389v0 != null ? c9389v0.f21817c : null)) {
            return false;
        }
        InterfaceC10471e interfaceC10471eMo18566c = mo18566c();
        if (interfaceC10471eMo18566c instanceof InterfaceC10469c) {
            InterfaceC10481o interfaceC10481o2 = obj instanceof InterfaceC10481o ? (InterfaceC10481o) obj : null;
            InterfaceC10471e interfaceC10471eMo18566c2 = interfaceC10481o2 != null ? interfaceC10481o2.mo18566c() : null;
            if (interfaceC10471eMo18566c2 != null && (interfaceC10471eMo18566c2 instanceof InterfaceC10469c)) {
                return AbstractC9979u.m20289b(AbstractC9293a.m18324a((InterfaceC10469c) interfaceC10471eMo18566c), AbstractC9293a.m18324a((InterfaceC10469c) interfaceC10471eMo18566c2));
            }
        }
        return false;
    }

    @Override // p280od.InterfaceC10481o
    public List getArguments() {
        return this.f21817c.getArguments();
    }

    public int hashCode() {
        return this.f21817c.hashCode();
    }

    public String toString() {
        return "KTypeWrapper: " + this.f21817c;
    }
}
