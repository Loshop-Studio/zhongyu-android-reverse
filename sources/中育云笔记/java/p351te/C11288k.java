package p351te;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import org.conscrypt.Conscrypt;
import p351te.C11289l;
import se.C11186d;
import se.C11192j;

/* renamed from: te.k */
/* loaded from: classes6.dex */
public final class C11288k implements InterfaceC11290m {

    /* renamed from: a */
    public static final b f27110a = new b(null);

    /* renamed from: b */
    public static final C11289l.a f27111b = new a();

    /* renamed from: te.k$a */
    public static final class a implements C11289l.a {
        @Override // p351te.C11289l.a
        /* renamed from: a */
        public boolean mo25234a(SSLSocket sslSocket) {
            AbstractC9979u.m20294g(sslSocket, "sslSocket");
            return C11186d.f26864e.m24877c() && Conscrypt.isConscrypt(sslSocket);
        }

        @Override // p351te.C11289l.a
        /* renamed from: b */
        public InterfaceC11290m mo25235b(SSLSocket sslSocket) {
            AbstractC9979u.m20294g(sslSocket, "sslSocket");
            return new C11288k();
        }
    }

    /* renamed from: te.k$b */
    public static final class b {
        public /* synthetic */ b(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final C11289l.a m25242a() {
            return C11288k.f27111b;
        }

        public b() {
        }
    }

    @Override // p351te.InterfaceC11290m
    /* renamed from: a */
    public boolean mo25216a(SSLSocket sslSocket) {
        AbstractC9979u.m20294g(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket);
    }

    @Override // p351te.InterfaceC11290m
    /* renamed from: b */
    public String mo25217b(SSLSocket sslSocket) {
        AbstractC9979u.m20294g(sslSocket, "sslSocket");
        if (mo25216a(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return null;
    }

    @Override // p351te.InterfaceC11290m
    /* renamed from: c */
    public void mo25218c(SSLSocket sslSocket, String str, List protocols) {
        AbstractC9979u.m20294g(sslSocket, "sslSocket");
        AbstractC9979u.m20294g(protocols, "protocols");
        if (mo25216a(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) C11192j.f26882a.m24894b(protocols).toArray(new String[0]));
        }
    }

    @Override // p351te.InterfaceC11290m
    public boolean isSupported() {
        return C11186d.f26864e.m24877c();
    }
}
