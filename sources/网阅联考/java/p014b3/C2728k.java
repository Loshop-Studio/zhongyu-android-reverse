package p014b3;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.Conscrypt;
import p004a3.C0015e;
import p004a3.C0021k;
import p014b3.C2729l;

/* renamed from: b3.k */
/* loaded from: classes2.dex */
public final class C2728k implements InterfaceC2730m {

    /* renamed from: b */
    public static final b f489b = new b(null);

    /* renamed from: a */
    public static final C2729l.a f488a = new a();

    /* renamed from: b3.k$a */
    public static final class a implements C2729l.a {
        @Override // p014b3.C2729l.a
        /* renamed from: a */
        public boolean mo1526a(SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            return C0015e.f20f.m49c() && Conscrypt.isConscrypt(sslSocket);
        }

        @Override // p014b3.C2729l.a
        /* renamed from: b */
        public InterfaceC2730m mo1527b(SSLSocket sslSocket) {
            Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
            return new C2728k();
        }
    }

    /* renamed from: b3.k$b */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C2729l.a m1534a() {
            return C2728k.f488a;
        }
    }

    @Override // p014b3.InterfaceC2730m
    /* renamed from: a */
    public boolean mo1507a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket);
    }

    @Override // p014b3.InterfaceC2730m
    /* renamed from: b */
    public boolean mo1508b() {
        return C0015e.f20f.m49c();
    }

    @Override // p014b3.InterfaceC2730m
    /* renamed from: c */
    public String mo1509c(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (mo1507a(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return null;
    }

    @Override // p014b3.InterfaceC2730m
    /* renamed from: d */
    public void mo1510d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (mo1507a(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Object[] array = C0021k.f39c.m66b(protocols).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) array);
        }
    }
}
