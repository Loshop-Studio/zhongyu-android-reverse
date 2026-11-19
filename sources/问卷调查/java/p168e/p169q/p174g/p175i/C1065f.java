package p168e.p169q.p174g.p175i;

import java.util.Objects;
import javax.net.ssl.SSLSocket;
import p160d.p162f.p164b.C1010c;
import p160d.p162f.p164b.C1011d;
import p168e.p169q.p174g.C1053b;
import p168e.p169q.p174g.p175i.C1069j;

/* renamed from: e.q.g.i.f */
/* loaded from: classes.dex */
public class C1065f implements InterfaceC1070k {

    /* renamed from: b */
    public static final C1069j.a f5634b;

    /* renamed from: c */
    public static final a f5635c;

    /* renamed from: a */
    public final Class<? super SSLSocket> f5636a;

    /* renamed from: e.q.g.i.f$a */
    public static final class a {
        public a(C1010c c1010c) {
        }
    }

    static {
        a aVar = new a(null);
        f5635c = aVar;
        Objects.requireNonNull(aVar);
        C1011d.m2809e("com.google.android.gms.org.conscrypt", "packageName");
        f5634b = new C1064e("com.google.android.gms.org.conscrypt");
    }

    public C1065f(Class<? super SSLSocket> cls) throws NoSuchMethodException, SecurityException {
        C1011d.m2809e(cls, "sslSocketClass");
        this.f5636a = cls;
        C1011d.m2808d(cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE), "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        cls.getMethod("setHostname", String.class);
        cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // p168e.p169q.p174g.p175i.InterfaceC1070k
    /* renamed from: a */
    public boolean mo2858a() {
        C1053b.a aVar = C1053b.f5610f;
        return C1053b.f5609e;
    }
}
