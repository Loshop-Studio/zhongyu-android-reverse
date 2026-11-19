package p144r5;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.platform.AbstractC7536c;
import org.conscrypt.Conscrypt;
import p144r5.C7663m;

/* renamed from: r5.l */
/* loaded from: classes4.dex */
public final class C7662l implements InterfaceC7664n {

    /* renamed from: a */
    public static final b f10111a;

    /* renamed from: b */
    public static final C7663m.a f10112b;

    /* renamed from: c */
    public static final boolean f10113c;

    /* renamed from: r5.l$a */
    public static final class a implements C7663m.a {
        @Override // p144r5.C7663m.a
        /* renamed from: a */
        public boolean mo9099a(SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            return C7662l.f10111a.m9109c() && Conscrypt.isConscrypt(sslSocket);
        }

        @Override // p144r5.C7663m.a
        /* renamed from: b */
        public InterfaceC7664n mo9100b(SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            return new C7662l();
        }
    }

    /* renamed from: r5.l$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean m9107a(int i6, int i7, int i8) {
            Conscrypt.Version version = Conscrypt.version();
            if (version == null) {
                return false;
            }
            return version.major() != i6 ? version.major() > i6 : version.minor() != i7 ? version.minor() > i7 : version.patch() >= i8;
        }

        /* renamed from: b */
        public final C7663m.a m9108b() {
            return C7662l.f10112b;
        }

        /* renamed from: c */
        public final boolean m9109c() {
            return C7662l.f10113c;
        }

        public b() {
        }
    }

    static {
        b bVar = new b(null);
        f10111a = bVar;
        f10112b = new a();
        boolean z6 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, bVar.getClass().getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (bVar.m9107a(2, 1, 0)) {
                    z6 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f10113c = z6;
    }

    @Override // p144r5.InterfaceC7664n
    /* renamed from: a */
    public boolean mo9081a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket);
    }

    @Override // p144r5.InterfaceC7664n
    /* renamed from: b */
    public String mo9082b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (mo9081a(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return null;
    }

    @Override // p144r5.InterfaceC7664n
    /* renamed from: c */
    public void mo9083c(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (mo9081a(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) AbstractC7536c.f9994a.m8928b(protocols).toArray(new String[0]));
        }
    }

    @Override // p144r5.InterfaceC7664n
    public boolean isSupported() {
        return f10113c;
    }
}
