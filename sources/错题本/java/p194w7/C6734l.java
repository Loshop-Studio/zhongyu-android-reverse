package p194w7;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC5830k;

/* renamed from: w7.l */
/* loaded from: classes4.dex */
public final class C6734l implements InterfaceC6735m {

    /* renamed from: a */
    public final InterfaceC6733k f11353a;

    /* renamed from: b */
    public InterfaceC6735m f11354b;

    public C6734l(InterfaceC6733k interfaceC6733k) {
        this.f11353a = interfaceC6733k;
    }

    @Override // p194w7.InterfaceC6735m
    /* renamed from: a */
    public final boolean mo6410a(SSLSocket sSLSocket) {
        return this.f11353a.mo6414a(sSLSocket);
    }

    @Override // p194w7.InterfaceC6735m
    /* renamed from: b */
    public final String mo6411b(SSLSocket sSLSocket) {
        InterfaceC6735m interfaceC6735mM6416d = m6416d(sSLSocket);
        if (interfaceC6735mM6416d != null) {
            return interfaceC6735mM6416d.mo6411b(sSLSocket);
        }
        return null;
    }

    @Override // p194w7.InterfaceC6735m
    /* renamed from: c */
    public final void mo6412c(SSLSocket sSLSocket, String str, List protocols) {
        AbstractC5830k.m5330g(protocols, "protocols");
        InterfaceC6735m interfaceC6735mM6416d = m6416d(sSLSocket);
        if (interfaceC6735mM6416d != null) {
            interfaceC6735mM6416d.mo6412c(sSLSocket, str, protocols);
        }
    }

    /* renamed from: d */
    public final synchronized InterfaceC6735m m6416d(SSLSocket sSLSocket) {
        try {
            if (this.f11354b == null && this.f11353a.mo6414a(sSLSocket)) {
                this.f11354b = this.f11353a.mo6415b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f11354b;
    }

    @Override // p194w7.InterfaceC6735m
    public final boolean isSupported() {
        return true;
    }
}
