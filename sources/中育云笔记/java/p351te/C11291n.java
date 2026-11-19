package p351te;

import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import se.C11192j;

/* renamed from: te.n */
/* loaded from: classes6.dex */
public final class C11291n extends C11285h {

    /* renamed from: j */
    public static final a f27114j = new a(null);

    /* renamed from: h */
    public final Class f27115h;

    /* renamed from: i */
    public final Class f27116i;

    /* renamed from: te.n$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ InterfaceC11290m m25244b(a aVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return aVar.m25245a(str);
        }

        /* renamed from: a */
        public final InterfaceC11290m m25245a(String packageName) throws ClassNotFoundException {
            AbstractC9979u.m20294g(packageName, "packageName");
            try {
                Class<?> cls = Class.forName(packageName + ".OpenSSLSocketImpl");
                AbstractC9979u.m20292e(cls, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
                Class<?> cls2 = Class.forName(packageName + ".OpenSSLSocketFactoryImpl");
                AbstractC9979u.m20292e(cls2, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>");
                Class<?> paramsClass = Class.forName(packageName + ".SSLParametersImpl");
                AbstractC9979u.m20293f(paramsClass, "paramsClass");
                return new C11291n(cls, cls2, paramsClass);
            } catch (Exception e10) {
                C11192j.f26882a.m24899g().m24892j("unable to load android socket classes", 5, e10);
                return null;
            }
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11291n(Class sslSocketClass, Class sslSocketFactoryClass, Class paramClass) {
        super(sslSocketClass);
        AbstractC9979u.m20294g(sslSocketClass, "sslSocketClass");
        AbstractC9979u.m20294g(sslSocketFactoryClass, "sslSocketFactoryClass");
        AbstractC9979u.m20294g(paramClass, "paramClass");
        this.f27115h = sslSocketFactoryClass;
        this.f27116i = paramClass;
    }
}
