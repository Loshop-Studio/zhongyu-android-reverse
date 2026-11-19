package p014b3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import p004a3.C0013c;
import p004a3.C0021k;
import p014b3.C2729l;

/* renamed from: b3.h */
/* loaded from: classes2.dex */
public class C2725h implements InterfaceC2730m {

    /* renamed from: f */
    public static final C2729l.a f474f;

    /* renamed from: g */
    public static final a f475g;

    /* renamed from: a */
    public final Method f476a;

    /* renamed from: b */
    public final Method f477b;

    /* renamed from: c */
    public final Method f478c;

    /* renamed from: d */
    public final Method f479d;

    /* renamed from: e */
    public final Class f480e;

    /* renamed from: b3.h$a */
    public static final class a {

        /* renamed from: b3.h$a$a, reason: collision with other inner class name */
        public static final class C4750a implements C2729l.a {

            /* renamed from: a */
            public final /* synthetic */ String f481a;

            public C4750a(String str) {
                this.f481a = str;
            }

            @Override // p014b3.C2729l.a
            /* renamed from: a */
            public boolean mo1526a(SSLSocket sslSocket) {
                Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
                String name = sslSocket.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "sslSocket.javaClass.name");
                return StringsKt__StringsJVMKt.startsWith$default(name, this.f481a + '.', false, 2, null);
            }

            @Override // p014b3.C2729l.a
            /* renamed from: b */
            public InterfaceC2730m mo1527b(SSLSocket sslSocket) {
                Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
                return C2725h.f475g.m1523b(sslSocket.getClass());
            }
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final C2725h m1523b(Class cls) {
            Class superclass = cls;
            while (superclass != null && (!Intrinsics.areEqual(superclass.getSimpleName(), "OpenSSLSocketImpl"))) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            Intrinsics.checkNotNull(superclass);
            return new C2725h(superclass);
        }

        /* renamed from: c */
        public final C2729l.a m1524c(String packageName) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            return new C4750a(packageName);
        }

        /* renamed from: d */
        public final C2729l.a m1525d() {
            return C2725h.f474f;
        }
    }

    static {
        a aVar = new a(null);
        f475g = aVar;
        f474f = aVar.m1524c("com.google.android.gms.org.conscrypt");
    }

    public C2725h(Class sslSocketClass) throws NoSuchMethodException, SecurityException {
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        this.f480e = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Intrinsics.checkNotNullExpressionValue(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f476a = declaredMethod;
        this.f477b = sslSocketClass.getMethod("setHostname", String.class);
        this.f478c = sslSocketClass.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f479d = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // p014b3.InterfaceC2730m
    /* renamed from: a */
    public boolean mo1507a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f480e.isInstance(sslSocket);
    }

    @Override // p014b3.InterfaceC2730m
    /* renamed from: b */
    public boolean mo1508b() {
        return C0013c.f11g.m38b();
    }

    @Override // p014b3.InterfaceC2730m
    /* renamed from: c */
    public String mo1509c(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (!mo1507a(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f478c.invoke(sslSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            Charset charset = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(charset, "StandardCharsets.UTF_8");
            return new String(bArr, charset);
        } catch (IllegalAccessException e4) {
            throw new AssertionError(e4);
        } catch (NullPointerException e5) {
            if (Intrinsics.areEqual(e5.getMessage(), "ssl == null")) {
                return null;
            }
            throw e5;
        } catch (InvocationTargetException e6) {
            throw new AssertionError(e6);
        }
    }

    @Override // p014b3.InterfaceC2730m
    /* renamed from: d */
    public void mo1510d(SSLSocket sslSocket, String str, List protocols) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (mo1507a(sslSocket)) {
            try {
                this.f476a.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.f477b.invoke(sslSocket, str);
                }
                this.f479d.invoke(sslSocket, C0021k.f39c.m67c(protocols));
            } catch (IllegalAccessException e4) {
                throw new AssertionError(e4);
            } catch (InvocationTargetException e5) {
                throw new AssertionError(e5);
            }
        }
    }
}
