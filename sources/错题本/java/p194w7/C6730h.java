package p194w7;

import io.reactivex.internal.operators.observable.C5707c;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC5830k;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import p185v7.C6676e;
import p185v7.C6685n;

/* renamed from: w7.h */
/* loaded from: classes4.dex */
public final class C6730h implements InterfaceC6735m {

    /* renamed from: a */
    public static final C6729g f11351a = new C6729g();

    @Override // p194w7.InterfaceC6735m
    /* renamed from: a */
    public final boolean mo6410a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // p194w7.InterfaceC6735m
    /* renamed from: b */
    public final String mo6411b(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p194w7.InterfaceC6735m
    /* renamed from: c */
    public final void mo6412c(SSLSocket sSLSocket, String str, List protocols) {
        AbstractC5830k.m5330g(protocols, "protocols");
        if (mo6410a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            C6685n c6685n = C6685n.f11276a;
            parameters.setApplicationProtocols((String[]) C5707c.m5077k(protocols).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // p194w7.InterfaceC6735m
    public final boolean isSupported() {
        boolean z8 = C6676e.f11260d;
        return C6676e.f11260d;
    }
}
