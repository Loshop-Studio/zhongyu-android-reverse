package p290w8;

import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p089e8.InterfaceC8375c;
import p089e8.InterfaceC8377e;
import p089e8.InterfaceC8387o;
import p289w7.AbstractC10360a;

/* renamed from: w8.v0 */
/* loaded from: classes5.dex */
public final class C10456v0 implements InterfaceC8387o {

    /* renamed from: a */
    public final InterfaceC8387o f20790a;

    public C10456v0(InterfaceC8387o origin) {
        AbstractC9133u.m16133g(origin, "origin");
        this.f20790a = origin;
    }

    @Override // p089e8.InterfaceC8387o
    /* renamed from: a */
    public boolean mo13675a() {
        return this.f20790a.mo13675a();
    }

    @Override // p089e8.InterfaceC8387o
    /* renamed from: b */
    public InterfaceC8377e mo13676b() {
        return this.f20790a.mo13676b();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        InterfaceC8387o interfaceC8387o = this.f20790a;
        C10456v0 c10456v0 = obj instanceof C10456v0 ? (C10456v0) obj : null;
        if (!AbstractC9133u.m16128b(interfaceC8387o, c10456v0 != null ? c10456v0.f20790a : null)) {
            return false;
        }
        InterfaceC8377e interfaceC8377eMo13676b = mo13676b();
        if (interfaceC8377eMo13676b instanceof InterfaceC8375c) {
            InterfaceC8387o interfaceC8387o2 = obj instanceof InterfaceC8387o ? (InterfaceC8387o) obj : null;
            InterfaceC8377e interfaceC8377eMo13676b2 = interfaceC8387o2 != null ? interfaceC8387o2.mo13676b() : null;
            if (interfaceC8377eMo13676b2 != null && (interfaceC8377eMo13676b2 instanceof InterfaceC8375c)) {
                return AbstractC9133u.m16128b(AbstractC10360a.m19298a((InterfaceC8375c) interfaceC8377eMo13676b), AbstractC10360a.m19298a((InterfaceC8375c) interfaceC8377eMo13676b2));
            }
        }
        return false;
    }

    @Override // p089e8.InterfaceC8387o
    public List getArguments() {
        return this.f20790a.getArguments();
    }

    public int hashCode() {
        return this.f20790a.hashCode();
    }

    public String toString() {
        return "KTypeWrapper: " + this.f20790a;
    }
}
