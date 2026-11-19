package p135i8;

import kotlinx.coroutines.InterfaceC9212n;
import kotlinx.coroutines.JobSupport;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;

/* renamed from: i8.s */
/* loaded from: classes5.dex */
public final class C8872s extends JobSupport implements InterfaceC8869r {
    public C8872s(InterfaceC9212n interfaceC9212n) {
        super(true);
        m16278c0(interfaceC9212n);
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: U */
    public boolean mo14801U() {
        return true;
    }

    @Override // p135i8.InterfaceC8869r
    /* renamed from: a */
    public boolean mo14904a(Throwable th) {
        return m16285i0(new C8884w(th, false, 2, null));
    }

    @Override // p135i8.InterfaceC8831e0
    /* renamed from: c */
    public Object mo14832c() {
        return m16271Q();
    }

    @Override // p135i8.InterfaceC8869r
    /* renamed from: h */
    public boolean mo14905h(Object obj) {
        return m16285i0(obj);
    }

    @Override // p135i8.InterfaceC8831e0
    /* renamed from: u */
    public Object mo14833u(InterfaceC9324c interfaceC9324c) throws Throwable {
        Object objM16255C = m16255C(interfaceC9324c);
        AbstractC9434a.m17291f();
        return objM16255C;
    }
}
