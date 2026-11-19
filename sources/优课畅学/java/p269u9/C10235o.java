package p269u9;

import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p136i9.C8897a0;

/* renamed from: u9.o */
/* loaded from: classes5.dex */
public final class C10235o extends C10230j {

    /* renamed from: j */
    public static final a f20423j = new a(null);

    /* renamed from: h */
    public final Class f20424h;

    /* renamed from: i */
    public final Class f20425i;

    /* renamed from: u9.o$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ InterfaceC10234n m19147b(a aVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return aVar.m19148a(str);
        }

        /* renamed from: a */
        public final InterfaceC10234n m19148a(String packageName) throws ClassNotFoundException {
            AbstractC9133u.m16133g(packageName, "packageName");
            try {
                Class<?> cls = Class.forName(packageName + ".OpenSSLSocketImpl");
                AbstractC9133u.m16131e(cls, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
                Class<?> cls2 = Class.forName(packageName + ".OpenSSLSocketFactoryImpl");
                AbstractC9133u.m16131e(cls2, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>");
                Class<?> cls3 = Class.forName(packageName + ".SSLParametersImpl");
                AbstractC9133u.m16130d(cls3);
                return new C10235o(cls, cls2, cls3);
            } catch (Exception e10) {
                C10227g c10227g = C10227g.f20403a;
                String name = C8897a0.class.getName();
                AbstractC9133u.m16132f(name, "getName(...)");
                c10227g.m19124a(name, 5, "unable to load android socket classes", e10);
                return null;
            }
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10235o(Class sslSocketClass, Class sslSocketFactoryClass, Class paramClass) {
        super(sslSocketClass);
        AbstractC9133u.m16133g(sslSocketClass, "sslSocketClass");
        AbstractC9133u.m16133g(sslSocketFactoryClass, "sslSocketFactoryClass");
        AbstractC9133u.m16133g(paramClass, "paramClass");
        this.f20424h = sslSocketFactoryClass;
        this.f20425i = paramClass;
    }
}
