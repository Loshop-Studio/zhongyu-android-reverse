package p147k9;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import p136j9.C7820b;
import p136j9.C7828j;
import p147k9.C7914l;

/* renamed from: k9.h */
/* loaded from: classes5.dex */
public class C7910h implements InterfaceC7915m {

    /* renamed from: f */
    public static final a f13785f;

    /* renamed from: g */
    public static final C7914l.a f13786g;

    /* renamed from: a */
    public final Class f13787a;

    /* renamed from: b */
    public final Method f13788b;

    /* renamed from: c */
    public final Method f13789c;

    /* renamed from: d */
    public final Method f13790d;

    /* renamed from: e */
    public final Method f13791e;

    /* renamed from: k9.h$a */
    public static final class a {

        /* renamed from: k9.h$a$a, reason: collision with other inner class name */
        public static final class C10149a implements C7914l.a {

            /* renamed from: a */
            public final /* synthetic */ String f13792a;

            public C10149a(String str) {
                this.f13792a = str;
            }

            @Override // p147k9.C7914l.a
            /* renamed from: a */
            public boolean mo13544a(SSLSocket sslSocket) {
                Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
                String name = sslSocket.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "sslSocket.javaClass.name");
                return StringsKt.startsWith$default(name, this.f13792a + '.', false, 2, (Object) null);
            }

            @Override // p147k9.C7914l.a
            /* renamed from: b */
            public InterfaceC7915m mo13545b(SSLSocket sslSocket) {
                Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
                return C7910h.f13785f.m13541b(sslSocket.getClass());
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final C7910h m13541b(Class cls) {
            Class superclass = cls;
            while (superclass != null && !Intrinsics.areEqual(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            Intrinsics.checkNotNull(superclass);
            return new C7910h(superclass);
        }

        /* renamed from: c */
        public final C7914l.a m13542c(String packageName) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            return new C10149a(packageName);
        }

        /* renamed from: d */
        public final C7914l.a m13543d() {
            return C7910h.f13786g;
        }

        public a() {
        }
    }

    static {
        a aVar = new a(null);
        f13785f = aVar;
        f13786g = aVar.m13542c("com.google.android.gms.org.conscrypt");
    }

    public C7910h(Class sslSocketClass) throws NoSuchMethodException, SecurityException {
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        this.f13787a = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Intrinsics.checkNotNullExpressionValue(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f13788b = declaredMethod;
        this.f13789c = sslSocketClass.getMethod("setHostname", String.class);
        this.f13790d = sslSocketClass.getMethod("getAlpnSelectedProtocol", null);
        this.f13791e = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // p147k9.InterfaceC7915m
    /* renamed from: a */
    public boolean mo13526a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f13787a.isInstance(sslSocket);
    }

    @Override // p147k9.InterfaceC7915m
    /* renamed from: b */
    public String mo13527b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (!mo13526a(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f13790d.invoke(sslSocket, null);
            if (bArr != null) {
                return new String(bArr, Charsets.UTF_8);
            }
            return null;
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if ((cause instanceof NullPointerException) && Intrinsics.areEqual(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e11);
        }
    }

    @Override // p147k9.InterfaceC7915m
    /* renamed from: c */
    public void mo13528c(SSLSocket sslSocket, String str, List protocols) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (mo13526a(sslSocket)) {
            try {
                this.f13788b.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.f13789c.invoke(sslSocket, str);
                }
                this.f13791e.invoke(sslSocket, C7828j.f13560a.m13287c(protocols));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }

    @Override // p147k9.InterfaceC7915m
    public boolean isSupported() {
        return C7820b.f13533f.m13258b();
    }
}
