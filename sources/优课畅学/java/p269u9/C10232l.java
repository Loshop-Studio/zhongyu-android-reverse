package p269u9;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import okhttp3.internal.platform.AbstractC9570c;
import org.conscrypt.Conscrypt;
import p269u9.C10233m;

/* renamed from: u9.l */
/* loaded from: classes5.dex */
public final class C10232l implements InterfaceC10234n {

    /* renamed from: a */
    public static final b f20418a;

    /* renamed from: b */
    public static final C10233m.a f20419b;

    /* renamed from: c */
    public static final boolean f20420c;

    /* renamed from: u9.l$a */
    public static final class a implements C10233m.a {
        @Override // p269u9.C10233m.a
        /* renamed from: a */
        public boolean mo19135a(SSLSocket sslSocket) {
            AbstractC9133u.m16133g(sslSocket, "sslSocket");
            return C10232l.f20418a.m19145c() && Conscrypt.isConscrypt(sslSocket);
        }

        @Override // p269u9.C10233m.a
        /* renamed from: b */
        public InterfaceC10234n mo19136b(SSLSocket sslSocket) {
            AbstractC9133u.m16133g(sslSocket, "sslSocket");
            return new C10232l();
        }
    }

    /* renamed from: u9.l$b */
    public static final class b {
        public /* synthetic */ b(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final boolean m19143a(int i10, int i11, int i12) {
            Conscrypt.Version version = Conscrypt.version();
            if (version == null) {
                return false;
            }
            return version.major() != i10 ? version.major() > i10 : version.minor() != i11 ? version.minor() > i11 : version.patch() >= i12;
        }

        /* renamed from: b */
        public final C10233m.a m19144b() {
            return C10232l.f20419b;
        }

        /* renamed from: c */
        public final boolean m19145c() {
            return C10232l.f20420c;
        }

        public b() {
        }
    }

    static {
        b bVar = new b(null);
        f20418a = bVar;
        f20419b = new a();
        boolean z10 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, bVar.getClass().getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (bVar.m19143a(2, 1, 0)) {
                    z10 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f20420c = z10;
    }

    @Override // p269u9.InterfaceC10234n
    /* renamed from: a */
    public boolean mo19117a(SSLSocket sslSocket) {
        AbstractC9133u.m16133g(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket);
    }

    @Override // p269u9.InterfaceC10234n
    /* renamed from: b */
    public String mo19118b(SSLSocket sslSocket) {
        AbstractC9133u.m16133g(sslSocket, "sslSocket");
        if (mo19117a(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return null;
    }

    @Override // p269u9.InterfaceC10234n
    /* renamed from: c */
    public void mo19119c(SSLSocket sslSocket, String str, List protocols) {
        AbstractC9133u.m16133g(sslSocket, "sslSocket");
        AbstractC9133u.m16133g(protocols, "protocols");
        if (mo19117a(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) AbstractC9570c.f19216a.m18109b(protocols).toArray(new String[0]));
        }
    }

    @Override // p269u9.InterfaceC10234n
    public boolean isSupported() {
        return f20420c;
    }
}
