package p147k9;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.Conscrypt;
import p136j9.C7822d;
import p136j9.C7828j;
import p147k9.C7914l;

/* renamed from: k9.k */
/* loaded from: classes5.dex */
public final class C7913k implements InterfaceC7915m {

    /* renamed from: a */
    public static final b f13799a = new b(null);

    /* renamed from: b */
    public static final C7914l.a f13800b = new a();

    /* renamed from: k9.k$a */
    public static final class a implements C7914l.a {
        @Override // p147k9.C7914l.a
        /* renamed from: a */
        public boolean mo13544a(SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            return C7822d.f13542e.m13269c() && Conscrypt.isConscrypt(sslSocket);
        }

        @Override // p147k9.C7914l.a
        /* renamed from: b */
        public InterfaceC7915m mo13545b(SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            return new C7913k();
        }
    }

    /* renamed from: k9.k$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7914l.a m13552a() {
            return C7913k.f13800b;
        }

        public b() {
        }
    }

    @Override // p147k9.InterfaceC7915m
    /* renamed from: a */
    public boolean mo13526a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket);
    }

    @Override // p147k9.InterfaceC7915m
    /* renamed from: b */
    public String mo13527b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (mo13526a(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return null;
    }

    @Override // p147k9.InterfaceC7915m
    /* renamed from: c */
    public void mo13528c(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (mo13526a(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) C7828j.f13560a.m13286b(protocols).toArray(new String[0]));
        }
    }

    @Override // p147k9.InterfaceC7915m
    public boolean isSupported() {
        return C7822d.f13542e.m13269c();
    }
}
