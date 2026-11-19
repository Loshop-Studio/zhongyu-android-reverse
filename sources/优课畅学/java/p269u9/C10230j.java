package p269u9;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import okhttp3.internal.platform.AbstractC9570c;
import okhttp3.internal.platform.C9569b;
import p113g8.AbstractC8687z;
import p113g8.C8660c;
import p269u9.C10233m;

/* renamed from: u9.j */
/* loaded from: classes5.dex */
public class C10230j implements InterfaceC10234n {

    /* renamed from: f */
    public static final a f20407f;

    /* renamed from: g */
    public static final C10233m.a f20408g;

    /* renamed from: a */
    public final Class f20409a;

    /* renamed from: b */
    public final Method f20410b;

    /* renamed from: c */
    public final Method f20411c;

    /* renamed from: d */
    public final Method f20412d;

    /* renamed from: e */
    public final Method f20413e;

    /* renamed from: u9.j$a */
    public static final class a {

        /* renamed from: u9.j$a$a, reason: collision with other inner class name */
        public static final class C10817a implements C10233m.a {

            /* renamed from: a */
            public final /* synthetic */ String f20414a;

            public C10817a(String str) {
                this.f20414a = str;
            }

            @Override // p269u9.C10233m.a
            /* renamed from: a */
            public boolean mo19135a(SSLSocket sslSocket) {
                AbstractC9133u.m16133g(sslSocket, "sslSocket");
                String name = sslSocket.getClass().getName();
                AbstractC9133u.m16132f(name, "getName(...)");
                return AbstractC8687z.m14105M(name, this.f20414a + '.', false, 2, null);
            }

            @Override // p269u9.C10233m.a
            /* renamed from: b */
            public InterfaceC10234n mo19136b(SSLSocket sslSocket) {
                AbstractC9133u.m16133g(sslSocket, "sslSocket");
                return C10230j.f20407f.m19132b(sslSocket.getClass());
            }
        }

        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: b */
        public final C10230j m19132b(Class cls) {
            Class superclass = cls;
            while (superclass != null && !AbstractC9133u.m16128b(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            AbstractC9133u.m16130d(superclass);
            return new C10230j(superclass);
        }

        /* renamed from: c */
        public final C10233m.a m19133c(String packageName) {
            AbstractC9133u.m16133g(packageName, "packageName");
            return new C10817a(packageName);
        }

        /* renamed from: d */
        public final C10233m.a m19134d() {
            return C10230j.f20408g;
        }

        public a() {
        }
    }

    static {
        a aVar = new a(null);
        f20407f = aVar;
        f20408g = aVar.m19133c("com.google.android.gms.org.conscrypt");
    }

    public C10230j(Class sslSocketClass) throws NoSuchMethodException, SecurityException {
        AbstractC9133u.m16133g(sslSocketClass, "sslSocketClass");
        this.f20409a = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        AbstractC9133u.m16132f(declaredMethod, "getDeclaredMethod(...)");
        this.f20410b = declaredMethod;
        this.f20411c = sslSocketClass.getMethod("setHostname", String.class);
        this.f20412d = sslSocketClass.getMethod("getAlpnSelectedProtocol", null);
        this.f20413e = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // p269u9.InterfaceC10234n
    /* renamed from: a */
    public boolean mo19117a(SSLSocket sslSocket) {
        AbstractC9133u.m16133g(sslSocket, "sslSocket");
        return this.f20409a.isInstance(sslSocket);
    }

    @Override // p269u9.InterfaceC10234n
    /* renamed from: b */
    public String mo19118b(SSLSocket sslSocket) {
        AbstractC9133u.m16133g(sslSocket, "sslSocket");
        if (!mo19117a(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f20412d.invoke(sslSocket, null);
            if (bArr != null) {
                return new String(bArr, C8660c.f16206b);
            }
            return null;
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if ((cause instanceof NullPointerException) && AbstractC9133u.m16128b(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e11);
        }
    }

    @Override // p269u9.InterfaceC10234n
    /* renamed from: c */
    public void mo19119c(SSLSocket sslSocket, String str, List protocols) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC9133u.m16133g(sslSocket, "sslSocket");
        AbstractC9133u.m16133g(protocols, "protocols");
        if (mo19117a(sslSocket)) {
            try {
                this.f20410b.invoke(sslSocket, Boolean.TRUE);
                this.f20413e.invoke(sslSocket, AbstractC9570c.f19216a.m18110c(protocols));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }

    @Override // p269u9.InterfaceC10234n
    public boolean isSupported() {
        return C9569b.f19209f.m18102b();
    }
}
