package p014b3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p004a3.C0021k;

/* renamed from: b3.n */
/* loaded from: classes2.dex */
public final class C2731n extends C2725h {

    /* renamed from: j */
    public static final a f492j = new a(null);

    /* renamed from: h */
    public final Class f493h;

    /* renamed from: i */
    public final Class f494i;

    /* renamed from: b3.n$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ InterfaceC2730m m1536b(a aVar, String str, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return aVar.m1537a(str);
        }

        /* renamed from: a */
        public final InterfaceC2730m m1537a(String packageName) throws ClassNotFoundException {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            try {
                Class<?> cls = Class.forName(packageName + ".OpenSSLSocketImpl");
                Class<?> cls2 = Class.forName(packageName + ".OpenSSLSocketFactoryImpl");
                Class<?> paramsClass = Class.forName(packageName + ".SSLParametersImpl");
                Intrinsics.checkNotNullExpressionValue(paramsClass, "paramsClass");
                return new C2731n(cls, cls2, paramsClass);
            } catch (Exception e4) {
                C0021k.f39c.m71g().m64j("unable to load android socket classes", 5, e4);
                return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2731n(Class sslSocketClass, Class sslSocketFactoryClass, Class paramClass) {
        super(sslSocketClass);
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        Intrinsics.checkNotNullParameter(sslSocketFactoryClass, "sslSocketFactoryClass");
        Intrinsics.checkNotNullParameter(paramClass, "paramClass");
        this.f493h = sslSocketFactoryClass;
        this.f494i = paramClass;
    }
}
