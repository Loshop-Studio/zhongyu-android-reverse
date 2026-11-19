package p118m7;

import java.util.List;
import kotlin.jvm.internal.AbstractC5830k;
import p185v7.AbstractC6675d;
import p207y6.InterfaceC6779c;
import p207y6.InterfaceC6793q;

/* renamed from: m7.k0 */
/* loaded from: classes4.dex */
public final class C6149k0 implements InterfaceC6793q {

    /* renamed from: a */
    public final InterfaceC6793q f9821a;

    public C6149k0(InterfaceC6793q origin) {
        AbstractC5830k.m5330g(origin, "origin");
        this.f9821a = origin;
    }

    @Override // p207y6.InterfaceC6793q
    /* renamed from: a */
    public final boolean mo5360a() {
        return this.f9821a.mo5360a();
    }

    @Override // p207y6.InterfaceC6793q
    /* renamed from: b */
    public final InterfaceC6779c mo5361b() {
        return this.f9821a.mo5361b();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        C6149k0 c6149k0 = obj instanceof C6149k0 ? (C6149k0) obj : null;
        InterfaceC6793q interfaceC6793q = c6149k0 != null ? c6149k0.f9821a : null;
        InterfaceC6793q interfaceC6793q2 = this.f9821a;
        if (!AbstractC5830k.m5325b(interfaceC6793q2, interfaceC6793q)) {
            return false;
        }
        InterfaceC6779c interfaceC6779cMo5361b = interfaceC6793q2.mo5361b();
        if (!(interfaceC6779cMo5361b instanceof InterfaceC6779c)) {
            return false;
        }
        InterfaceC6793q interfaceC6793q3 = obj instanceof InterfaceC6793q ? (InterfaceC6793q) obj : null;
        InterfaceC6779c interfaceC6779cMo5361b2 = interfaceC6793q3 != null ? interfaceC6793q3.mo5361b() : null;
        if (interfaceC6779cMo5361b2 == null || !(interfaceC6779cMo5361b2 instanceof InterfaceC6779c)) {
            return false;
        }
        return AbstractC6675d.m6349m(interfaceC6779cMo5361b).equals(AbstractC6675d.m6349m(interfaceC6779cMo5361b2));
    }

    @Override // p207y6.InterfaceC6793q
    public final List getArguments() {
        return this.f9821a.getArguments();
    }

    public final int hashCode() {
        return this.f9821a.hashCode();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.f9821a;
    }
}
