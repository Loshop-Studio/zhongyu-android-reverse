package p194w7;

import io.reactivex.internal.operators.observable.C5707c;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC5830k;
import org.conscrypt.Conscrypt;
import p185v7.C6679h;
import p185v7.C6685n;

/* renamed from: w7.j */
/* loaded from: classes4.dex */
public final class C6732j implements InterfaceC6735m {

    /* renamed from: a */
    public static final C6731i f11352a = new C6731i();

    @Override // p194w7.InterfaceC6735m
    /* renamed from: a */
    public final boolean mo6410a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // p194w7.InterfaceC6735m
    /* renamed from: b */
    public final String mo6411b(SSLSocket sSLSocket) {
        if (mo6410a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // p194w7.InterfaceC6735m
    /* renamed from: c */
    public final void mo6412c(SSLSocket sSLSocket, String str, List protocols) {
        AbstractC5830k.m5330g(protocols, "protocols");
        if (mo6410a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            C6685n c6685n = C6685n.f11276a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C5707c.m5077k(protocols).toArray(new String[0]));
        }
    }

    @Override // p194w7.InterfaceC6735m
    public final boolean isSupported() {
        boolean z8 = C6679h.f11263d;
        return C6679h.f11263d;
    }
}
