package p147k9;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p136j9.C7828j;

/* renamed from: k9.n */
/* loaded from: classes5.dex */
public final class C7916n extends C7910h {

    /* renamed from: j */
    public static final a f13803j = new a(null);

    /* renamed from: h */
    public final Class f13804h;

    /* renamed from: i */
    public final Class f13805i;

    /* renamed from: k9.n$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ InterfaceC7915m m13554b(a aVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return aVar.m13555a(str);
        }

        /* renamed from: a */
        public final InterfaceC7915m m13555a(String packageName) throws ClassNotFoundException {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            try {
                Class<?> cls = Class.forName(packageName + ".OpenSSLSocketImpl");
                Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
                Class<?> cls2 = Class.forName(packageName + ".OpenSSLSocketFactoryImpl");
                Intrinsics.checkNotNull(cls2, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>");
                Class<?> paramsClass = Class.forName(packageName + ".SSLParametersImpl");
                Intrinsics.checkNotNullExpressionValue(paramsClass, "paramsClass");
                return new C7916n(cls, cls2, paramsClass);
            } catch (Exception e10) {
                C7828j.f13560a.m13291g().m13284j("unable to load android socket classes", 5, e10);
                return null;
            }
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7916n(Class sslSocketClass, Class sslSocketFactoryClass, Class paramClass) {
        super(sslSocketClass);
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        Intrinsics.checkNotNullParameter(sslSocketFactoryClass, "sslSocketFactoryClass");
        Intrinsics.checkNotNullParameter(paramClass, "paramClass");
        this.f13804h = sslSocketFactoryClass;
        this.f13805i = paramClass;
    }
}
