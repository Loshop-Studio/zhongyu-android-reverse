package p136j9;

import androidx.core.os.EnvironmentCompat;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: j9.e */
/* loaded from: classes5.dex */
public final class C7823e extends C7828j {

    /* renamed from: i */
    public static final b f13546i = new b(null);

    /* renamed from: d */
    public final Method f13547d;

    /* renamed from: e */
    public final Method f13548e;

    /* renamed from: f */
    public final Method f13549f;

    /* renamed from: g */
    public final Class f13550g;

    /* renamed from: h */
    public final Class f13551h;

    /* renamed from: j9.e$a */
    public static final class a implements InvocationHandler {

        /* renamed from: a */
        public final List f13552a;

        /* renamed from: b */
        public boolean f13553b;

        /* renamed from: c */
        public String f13554c;

        public a(List protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            this.f13552a = protocols;
        }

        /* renamed from: a */
        public final String m13271a() {
            return this.f13554c;
        }

        /* renamed from: b */
        public final boolean m13272b() {
            return this.f13553b;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method method, Object[] objArr) {
            Intrinsics.checkNotNullParameter(proxy, "proxy");
            Intrinsics.checkNotNullParameter(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (Intrinsics.areEqual(name, "supports") && Intrinsics.areEqual(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (Intrinsics.areEqual(name, "unsupported") && Intrinsics.areEqual(Void.TYPE, returnType)) {
                this.f13553b = true;
                return null;
            }
            if (Intrinsics.areEqual(name, "protocols") && objArr.length == 0) {
                return this.f13552a;
            }
            if ((Intrinsics.areEqual(name, "selectProtocol") || Intrinsics.areEqual(name, "select")) && Intrinsics.areEqual(String.class, returnType) && objArr.length == 1) {
                Object obj = objArr[0];
                if (obj instanceof List) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    List list = (List) obj;
                    int size = list.size();
                    if (size >= 0) {
                        int i10 = 0;
                        while (true) {
                            Object obj2 = list.get(i10);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            if (!this.f13552a.contains(str)) {
                                if (i10 == size) {
                                    break;
                                }
                                i10++;
                            } else {
                                this.f13554c = str;
                                return str;
                            }
                        }
                    }
                    String str2 = (String) this.f13552a.get(0);
                    this.f13554c = str2;
                    return str2;
                }
            }
            if ((!Intrinsics.areEqual(name, "protocolSelected") && !Intrinsics.areEqual(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj3 = objArr[0];
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
            this.f13554c = (String) obj3;
            return null;
        }
    }

    /* renamed from: j9.e$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7828j m13273a() {
            String jvmVersion = System.getProperty("java.specification.version", EnvironmentCompat.MEDIA_UNKNOWN);
            try {
                Intrinsics.checkNotNullExpressionValue(jvmVersion, "jvmVersion");
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
                Intrinsics.checkNotNullExpressionValue(putMethod, "putMethod");
                Intrinsics.checkNotNullExpressionValue(getMethod, "getMethod");
                Intrinsics.checkNotNullExpressionValue(removeMethod, "removeMethod");
                Intrinsics.checkNotNullExpressionValue(clientProviderClass, "clientProviderClass");
                Intrinsics.checkNotNullExpressionValue(serverProviderClass, "serverProviderClass");
                return new C7823e(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }

        public b() {
        }
    }

    public C7823e(Method putMethod, Method getMethod, Method removeMethod, Class clientProviderClass, Class serverProviderClass) {
        Intrinsics.checkNotNullParameter(putMethod, "putMethod");
        Intrinsics.checkNotNullParameter(getMethod, "getMethod");
        Intrinsics.checkNotNullParameter(removeMethod, "removeMethod");
        Intrinsics.checkNotNullParameter(clientProviderClass, "clientProviderClass");
        Intrinsics.checkNotNullParameter(serverProviderClass, "serverProviderClass");
        this.f13547d = putMethod;
        this.f13548e = getMethod;
        this.f13549f = removeMethod;
        this.f13550g = clientProviderClass;
        this.f13551h = serverProviderClass;
    }

    @Override // p136j9.C7828j
    /* renamed from: b */
    public void mo13270b(SSLSocket sslSocket) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            this.f13549f.invoke(null, sslSocket);
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to remove ALPN", e11);
        }
    }

    @Override // p136j9.C7828j
    /* renamed from: e */
    public void mo13247e(SSLSocket sslSocket, String str, List protocols) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        try {
            this.f13547d.invoke(null, sslSocket, Proxy.newProxyInstance(C7828j.class.getClassLoader(), new Class[]{this.f13550g, this.f13551h}, new a(C7828j.f13560a.m13286b(protocols))));
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to set ALPN", e11);
        }
    }

    @Override // p136j9.C7828j
    /* renamed from: g */
    public String mo13248g(SSLSocket sslSocket) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f13548e.invoke(null, sslSocket));
            Intrinsics.checkNotNull(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            a aVar = (a) invocationHandler;
            if (!aVar.m13272b() && aVar.m13271a() == null) {
                C7828j.m13283k(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            }
            if (aVar.m13272b()) {
                return null;
            }
            return aVar.m13271a();
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}
