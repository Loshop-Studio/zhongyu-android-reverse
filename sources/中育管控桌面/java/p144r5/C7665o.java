package p144r5;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p058f5.C6356a0;

/* renamed from: r5.o */
/* loaded from: classes4.dex */
public final class C7665o extends C7660j {

    /* renamed from: j */
    public static final a f10116j = new a(null);

    /* renamed from: h */
    public final Class f10117h;

    /* renamed from: i */
    public final Class f10118i;

    /* renamed from: r5.o$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ InterfaceC7664n m9111b(a aVar, String str, int i6, Object obj) {
            if ((i6 & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return aVar.m9112a(str);
        }

        /* renamed from: a */
        public final InterfaceC7664n m9112a(String packageName) throws ClassNotFoundException {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            try {
                Class<?> cls = Class.forName(packageName + ".OpenSSLSocketImpl");
                Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
                Class<?> cls2 = Class.forName(packageName + ".OpenSSLSocketFactoryImpl");
                Intrinsics.checkNotNull(cls2, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>");
                Class<?> cls3 = Class.forName(packageName + ".SSLParametersImpl");
                Intrinsics.checkNotNull(cls3);
                return new C7665o(cls, cls2, cls3);
            } catch (Exception e6) {
                C7657g c7657g = C7657g.f10096a;
                String name = C6356a0.class.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                c7657g.m9088a(name, 5, "unable to load android socket classes", e6);
                return null;
            }
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7665o(Class sslSocketClass, Class sslSocketFactoryClass, Class paramClass) {
        super(sslSocketClass);
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        Intrinsics.checkNotNullParameter(sslSocketFactoryClass, "sslSocketFactoryClass");
        Intrinsics.checkNotNullParameter(paramClass, "paramClass");
        this.f10117h = sslSocketFactoryClass;
        this.f10118i = paramClass;
    }
}
