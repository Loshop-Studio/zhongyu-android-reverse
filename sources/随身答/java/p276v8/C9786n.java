package p276v8;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p266u8.C9734j;

/* renamed from: v8.n */
/* loaded from: classes5.dex */
public final class C9786n extends C9780h {

    /* renamed from: j */
    public static final a f17410j = new a(null);

    /* renamed from: h */
    public final Class f17411h;

    /* renamed from: i */
    public final Class f17412i;

    /* renamed from: v8.n$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ InterfaceC9785m m16587b(a aVar, String str, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return aVar.m16588a(str);
        }

        /* renamed from: a */
        public final InterfaceC9785m m16588a(String packageName) throws ClassNotFoundException {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            try {
                Class<?> cls = Class.forName(packageName + ".OpenSSLSocketImpl");
                Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
                Class<?> cls2 = Class.forName(packageName + ".OpenSSLSocketFactoryImpl");
                Intrinsics.checkNotNull(cls2, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>");
                Class<?> paramsClass = Class.forName(packageName + ".SSLParametersImpl");
                Intrinsics.checkNotNullExpressionValue(paramsClass, "paramsClass");
                return new C9786n(cls, cls2, paramsClass);
            } catch (Exception e10) {
                C9734j.f17200a.m16271g().m16264j("unable to load android socket classes", 5, e10);
                return null;
            }
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9786n(Class sslSocketClass, Class sslSocketFactoryClass, Class paramClass) {
        super(sslSocketClass);
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        Intrinsics.checkNotNullParameter(sslSocketFactoryClass, "sslSocketFactoryClass");
        Intrinsics.checkNotNullParameter(paramClass, "paramClass");
        this.f17411h = sslSocketFactoryClass;
        this.f17412i = paramClass;
    }
}
