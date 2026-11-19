package p276v8;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import p266u8.C9726b;
import p266u8.C9734j;
import p276v8.C9784l;

/* renamed from: v8.h */
/* loaded from: classes5.dex */
public class C9780h implements InterfaceC9785m {

    /* renamed from: f */
    public static final a f17392f;

    /* renamed from: g */
    public static final C9784l.a f17393g;

    /* renamed from: a */
    public final Class f17394a;

    /* renamed from: b */
    public final Method f17395b;

    /* renamed from: c */
    public final Method f17396c;

    /* renamed from: d */
    public final Method f17397d;

    /* renamed from: e */
    public final Method f17398e;

    /* renamed from: v8.h$a */
    public static final class a {

        /* renamed from: v8.h$a$a, reason: collision with other inner class name */
        public static final class C10089a implements C9784l.a {

            /* renamed from: a */
            public final /* synthetic */ String f17399a;

            public C10089a(String str) {
                this.f17399a = str;
            }

            @Override // p276v8.C9784l.a
            /* renamed from: a */
            public boolean mo16577a(SSLSocket sslSocket) {
                Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
                String name = sslSocket.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "sslSocket.javaClass.name");
                return StringsKt.startsWith$default(name, this.f17399a + '.', false, 2, (Object) null);
            }

            @Override // p276v8.C9784l.a
            /* renamed from: b */
            public InterfaceC9785m mo16578b(SSLSocket sslSocket) {
                Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
                return C9780h.f17392f.m16574b(sslSocket.getClass());
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final C9780h m16574b(Class cls) {
            Class superclass = cls;
            while (superclass != null && !Intrinsics.areEqual(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            Intrinsics.checkNotNull(superclass);
            return new C9780h(superclass);
        }

        /* renamed from: c */
        public final C9784l.a m16575c(String packageName) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            return new C10089a(packageName);
        }

        /* renamed from: d */
        public final C9784l.a m16576d() {
            return C9780h.f17393g;
        }

        public a() {
        }
    }

    static {
        a aVar = new a(null);
        f17392f = aVar;
        f17393g = aVar.m16575c("com.google.android.gms.org.conscrypt");
    }

    public C9780h(Class sslSocketClass) throws NoSuchMethodException, SecurityException {
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        this.f17394a = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Intrinsics.checkNotNullExpressionValue(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f17395b = declaredMethod;
        this.f17396c = sslSocketClass.getMethod("setHostname", String.class);
        this.f17397d = sslSocketClass.getMethod("getAlpnSelectedProtocol", null);
        this.f17398e = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // p276v8.InterfaceC9785m
    /* renamed from: a */
    public boolean mo16559a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f17394a.isInstance(sslSocket);
    }

    @Override // p276v8.InterfaceC9785m
    /* renamed from: b */
    public String mo16560b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (!mo16559a(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f17397d.invoke(sslSocket, null);
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

    @Override // p276v8.InterfaceC9785m
    /* renamed from: c */
    public void mo16561c(SSLSocket sslSocket, String str, List protocols) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (mo16559a(sslSocket)) {
            try {
                this.f17395b.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.f17396c.invoke(sslSocket, str);
                }
                this.f17398e.invoke(sslSocket, C9734j.f17200a.m16267c(protocols));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }

    @Override // p276v8.InterfaceC9785m
    public boolean isSupported() {
        return C9726b.f17173f.m16238b();
    }
}
