package p276v8;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.Conscrypt;
import p266u8.C9728d;
import p266u8.C9734j;
import p276v8.C9784l;

/* renamed from: v8.k */
/* loaded from: classes5.dex */
public final class C9783k implements InterfaceC9785m {

    /* renamed from: a */
    public static final b f17406a = new b(null);

    /* renamed from: b */
    public static final C9784l.a f17407b = new a();

    /* renamed from: v8.k$a */
    public static final class a implements C9784l.a {
        @Override // p276v8.C9784l.a
        /* renamed from: a */
        public boolean mo16577a(SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            return C9728d.f17182e.m16249c() && Conscrypt.isConscrypt(sslSocket);
        }

        @Override // p276v8.C9784l.a
        /* renamed from: b */
        public InterfaceC9785m mo16578b(SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            return new C9783k();
        }
    }

    /* renamed from: v8.k$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C9784l.a m16585a() {
            return C9783k.f17407b;
        }

        public b() {
        }
    }

    @Override // p276v8.InterfaceC9785m
    /* renamed from: a */
    public boolean mo16559a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket);
    }

    @Override // p276v8.InterfaceC9785m
    /* renamed from: b */
    public String mo16560b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (mo16559a(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return null;
    }

    @Override // p276v8.InterfaceC9785m
    /* renamed from: c */
    public void mo16561c(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (mo16559a(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) C9734j.f17200a.m16266b(protocols).toArray(new String[0]));
        }
    }

    @Override // p276v8.InterfaceC9785m
    public boolean isSupported() {
        return C9728d.f17182e.m16249c();
    }
}
