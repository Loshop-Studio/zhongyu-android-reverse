package p125n7;

import coil3.network.AbstractC3315g;
import java.util.List;
import kotlin.AbstractC5773a;
import kotlin.jvm.internal.AbstractC5830k;
import p045d6.InterfaceC5429e;
import p101k7.InterfaceC5765g;
import p152r6.InterfaceC6469a;

/* renamed from: n7.n */
/* loaded from: classes4.dex */
public final class C6239n implements InterfaceC5765g {

    /* renamed from: a */
    public final InterfaceC5429e f9986a;

    public C6239n(InterfaceC6469a interfaceC6469a) {
        this.f9986a = AbstractC5773a.m5117b(interfaceC6469a);
    }

    /* renamed from: a */
    public final InterfaceC5765g m5853a() {
        return (InterfaceC5765g) this.f9986a.getValue();
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: c */
    public final int mo5100c(String name) {
        AbstractC5830k.m5330g(name, "name");
        return m5853a().mo5100c(name);
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: d */
    public final int mo5101d() {
        return m5853a().mo5101d();
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: e */
    public final String mo5102e(int i) {
        return m5853a().mo5102e(i);
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: f */
    public final List mo5103f(int i) {
        return m5853a().mo5103f(i);
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: g */
    public final InterfaceC5765g mo5104g(int i) {
        return m5853a().mo5104g(i);
    }

    @Override // p101k7.InterfaceC5765g
    public final AbstractC3315g getKind() {
        return m5853a().getKind();
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: h */
    public final String mo5105h() {
        return m5853a().mo5105h();
    }

    @Override // p101k7.InterfaceC5765g
    /* renamed from: i */
    public final boolean mo5106i(int i) {
        return m5853a().mo5106i(i);
    }
}
