package se;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: se.e */
/* loaded from: classes6.dex */
public final class C11187e extends C11192j {

    /* renamed from: i */
    public static final b f26868i = new b(null);

    /* renamed from: d */
    public final Method f26869d;

    /* renamed from: e */
    public final Method f26870e;

    /* renamed from: f */
    public final Method f26871f;

    /* renamed from: g */
    public final Class f26872g;

    /* renamed from: h */
    public final Class f26873h;

    /* renamed from: se.e$a */
    public static final class a implements InvocationHandler {

        /* renamed from: c */
        public final List f26874c;

        /* renamed from: d */
        public boolean f26875d;

        /* renamed from: e */
        public String f26876e;

        public a(List protocols) {
            AbstractC9979u.m20294g(protocols, "protocols");
            this.f26874c = protocols;
        }

        /* renamed from: a */
        public final String m24879a() {
            return this.f26876e;
        }

        /* renamed from: b */
        public final boolean m24880b() {
            return this.f26875d;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method method, Object[] objArr) {
            AbstractC9979u.m20294g(proxy, "proxy");
            AbstractC9979u.m20294g(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (AbstractC9979u.m20289b(name, "supports") && AbstractC9979u.m20289b(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (AbstractC9979u.m20289b(name, "unsupported") && AbstractC9979u.m20289b(Void.TYPE, returnType)) {
                this.f26875d = true;
                return null;
            }
            if (AbstractC9979u.m20289b(name, "protocols") && objArr.length == 0) {
                return this.f26874c;
            }
            if ((AbstractC9979u.m20289b(name, "selectProtocol") || AbstractC9979u.m20289b(name, "select")) && AbstractC9979u.m20289b(String.class, returnType) && objArr.length == 1) {
                Object obj = objArr[0];
                if (obj instanceof List) {
                    AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    List list = (List) obj;
                    int size = list.size();
                    if (size >= 0) {
                        int i10 = 0;
                        while (true) {
                            Object obj2 = list.get(i10);
                            AbstractC9979u.m20292e(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            if (!this.f26874c.contains(str)) {
                                if (i10 == size) {
                                    break;
                                }
                                i10++;
                            } else {
                                this.f26876e = str;
                                return str;
                            }
                        }
                    }
                    String str2 = (String) this.f26874c.get(0);
                    this.f26876e = str2;
                    return str2;
                }
            }
            if ((!AbstractC9979u.m20289b(name, "protocolSelected") && !AbstractC9979u.m20289b(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj3 = objArr[0];
            AbstractC9979u.m20292e(obj3, "null cannot be cast to non-null type kotlin.String");
            this.f26876e = (String) obj3;
            return null;
        }
    }

    /* renamed from: se.e$b */
    public static final class b {
        public /* synthetic */ b(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final C11192j m24881a() {
            String jvmVersion = System.getProperty("java.specification.version", "unknown");
            try {
                AbstractC9979u.m20293f(jvmVersion, "jvmVersion");
                if (Integer.parseInt(jvmVersion) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                Class<?> clientProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                Class<?> serverProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                Method putMethod = cls.getMethod("put", SSLSocket.class, cls2);
                Method getMethod = cls.getMethod("get", SSLSocket.class);
                Method removeMethod = cls.getMethod("remove", SSLSocket.class);
                AbstractC9979u.m20293f(putMethod, "putMethod");
                AbstractC9979u.m20293f(getMethod, "getMethod");
                AbstractC9979u.m20293f(removeMethod, "removeMethod");
                AbstractC9979u.m20293f(clientProviderClass, "clientProviderClass");
                AbstractC9979u.m20293f(serverProviderClass, "serverProviderClass");
                return new C11187e(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }

        public b() {
        }
    }

    public C11187e(Method putMethod, Method getMethod, Method removeMethod, Class clientProviderClass, Class serverProviderClass) {
        AbstractC9979u.m20294g(putMethod, "putMethod");
        AbstractC9979u.m20294g(getMethod, "getMethod");
        AbstractC9979u.m20294g(removeMethod, "removeMethod");
        AbstractC9979u.m20294g(clientProviderClass, "clientProviderClass");
        AbstractC9979u.m20294g(serverProviderClass, "serverProviderClass");
        this.f26869d = putMethod;
        this.f26870e = getMethod;
        this.f26871f = removeMethod;
        this.f26872g = clientProviderClass;
        this.f26873h = serverProviderClass;
    }

    @Override // se.C11192j
    /* renamed from: b */
    public void mo24878b(SSLSocket sslSocket) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC9979u.m20294g(sslSocket, "sslSocket");
        try {
            this.f26871f.invoke(null, sslSocket);
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to remove ALPN", e11);
        }
    }

    @Override // se.C11192j
    /* renamed from: e */
    public void mo24855e(SSLSocket sslSocket, String str, List protocols) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC9979u.m20294g(sslSocket, "sslSocket");
        AbstractC9979u.m20294g(protocols, "protocols");
        try {
            this.f26869d.invoke(null, sslSocket, Proxy.newProxyInstance(C11192j.class.getClassLoader(), new Class[]{this.f26872g, this.f26873h}, new a(C11192j.f26882a.m24894b(protocols))));
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to set ALPN", e11);
        }
    }

    @Override // se.C11192j
    /* renamed from: g */
    public String mo24856g(SSLSocket sslSocket) throws IllegalArgumentException {
        AbstractC9979u.m20294g(sslSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f26870e.invoke(null, sslSocket));
            AbstractC9979u.m20292e(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            a aVar = (a) invocationHandler;
            if (!aVar.m24880b() && aVar.m24879a() == null) {
                C11192j.m24891k(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            }
            if (aVar.m24880b()) {
                return null;
            }
            return aVar.m24879a();
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}
