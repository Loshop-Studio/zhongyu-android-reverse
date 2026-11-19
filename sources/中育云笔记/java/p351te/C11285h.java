package p351te;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10819z;
import p310qd.C10792c;
import p351te.C11289l;
import se.C11184b;
import se.C11192j;

/* renamed from: te.h */
/* loaded from: classes6.dex */
public class C11285h implements InterfaceC11290m {

    /* renamed from: f */
    public static final a f27096f;

    /* renamed from: g */
    public static final C11289l.a f27097g;

    /* renamed from: a */
    public final Class f27098a;

    /* renamed from: b */
    public final Method f27099b;

    /* renamed from: c */
    public final Method f27100c;

    /* renamed from: d */
    public final Method f27101d;

    /* renamed from: e */
    public final Method f27102e;

    /* renamed from: te.h$a */
    public static final class a {

        /* renamed from: te.h$a$a, reason: collision with other inner class name */
        public static final class C12151a implements C11289l.a {

            /* renamed from: a */
            public final /* synthetic */ String f27103a;

            public C12151a(String str) {
                this.f27103a = str;
            }

            @Override // p351te.C11289l.a
            /* renamed from: a */
            public boolean mo25234a(SSLSocket sslSocket) {
                AbstractC9979u.m20294g(sslSocket, "sslSocket");
                String name = sslSocket.getClass().getName();
                AbstractC9979u.m20293f(name, "sslSocket.javaClass.name");
                return AbstractC10819z.m23242O(name, this.f27103a + '.', false, 2, null);
            }

            @Override // p351te.C11289l.a
            /* renamed from: b */
            public InterfaceC11290m mo25235b(SSLSocket sslSocket) {
                AbstractC9979u.m20294g(sslSocket, "sslSocket");
                return C11285h.f27096f.m25231b(sslSocket.getClass());
            }
        }

        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: b */
        public final C11285h m25231b(Class cls) {
            Class superclass = cls;
            while (superclass != null && !AbstractC9979u.m20289b(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            AbstractC9979u.m20291d(superclass);
            return new C11285h(superclass);
        }

        /* renamed from: c */
        public final C11289l.a m25232c(String packageName) {
            AbstractC9979u.m20294g(packageName, "packageName");
            return new C12151a(packageName);
        }

        /* renamed from: d */
        public final C11289l.a m25233d() {
            return C11285h.f27097g;
        }

        public a() {
        }
    }

    static {
        a aVar = new a(null);
        f27096f = aVar;
        f27097g = aVar.m25232c("com.google.android.gms.org.conscrypt");
    }

    public C11285h(Class sslSocketClass) throws NoSuchMethodException, SecurityException {
        AbstractC9979u.m20294g(sslSocketClass, "sslSocketClass");
        this.f27098a = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        AbstractC9979u.m20293f(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f27099b = declaredMethod;
        this.f27100c = sslSocketClass.getMethod("setHostname", String.class);
        this.f27101d = sslSocketClass.getMethod("getAlpnSelectedProtocol", null);
        this.f27102e = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // p351te.InterfaceC11290m
    /* renamed from: a */
    public boolean mo25216a(SSLSocket sslSocket) {
        AbstractC9979u.m20294g(sslSocket, "sslSocket");
        return this.f27098a.isInstance(sslSocket);
    }

    @Override // p351te.InterfaceC11290m
    /* renamed from: b */
    public String mo25217b(SSLSocket sslSocket) {
        AbstractC9979u.m20294g(sslSocket, "sslSocket");
        if (!mo25216a(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f27101d.invoke(sslSocket, null);
            if (bArr != null) {
                return new String(bArr, C10792c.f26019b);
            }
            return null;
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if ((cause instanceof NullPointerException) && AbstractC9979u.m20289b(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e11);
        }
    }

    @Override // p351te.InterfaceC11290m
    /* renamed from: c */
    public void mo25218c(SSLSocket sslSocket, String str, List protocols) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC9979u.m20294g(sslSocket, "sslSocket");
        AbstractC9979u.m20294g(protocols, "protocols");
        if (mo25216a(sslSocket)) {
            try {
                this.f27099b.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.f27100c.invoke(sslSocket, str);
                }
                this.f27102e.invoke(sslSocket, C11192j.f26882a.m24895c(protocols));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }

    @Override // p351te.InterfaceC11290m
    public boolean isSupported() {
        return C11184b.f26855f.m24866b();
    }
}
