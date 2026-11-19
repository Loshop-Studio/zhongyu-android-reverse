package p194w7;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import p185v7.C6679h;

/* renamed from: w7.i */
/* loaded from: classes4.dex */
public final class C6731i implements InterfaceC6733k {
    @Override // p194w7.InterfaceC6733k
    /* renamed from: a */
    public final boolean mo6414a(SSLSocket sSLSocket) {
        return C6679h.f11263d && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // p194w7.InterfaceC6733k
    /* renamed from: b */
    public final InterfaceC6735m mo6415b(SSLSocket sSLSocket) {
        return new C6732j();
    }
}
