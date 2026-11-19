package p144r5;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import okhttp3.internal.platform.AbstractC7536c;
import okhttp3.internal.platform.C7535b;
import p144r5.C7663m;

/* renamed from: r5.j */
/* loaded from: classes4.dex */
public class C7660j implements InterfaceC7664n {

    /* renamed from: f */
    public static final a f10100f;

    /* renamed from: g */
    public static final C7663m.a f10101g;

    /* renamed from: a */
    public final Class f10102a;

    /* renamed from: b */
    public final Method f10103b;

    /* renamed from: c */
    public final Method f10104c;

    /* renamed from: d */
    public final Method f10105d;

    /* renamed from: e */
    public final Method f10106e;

    /* renamed from: r5.j$a */
    public static final class a {

        /* renamed from: r5.j$a$a, reason: collision with other inner class name */
        public static final class C8039a implements C7663m.a {

            /* renamed from: a */
            public final /* synthetic */ String f10107a;

            public C8039a(String str) {
                this.f10107a = str;
            }

            @Override // p144r5.C7663m.a
            /* renamed from: a */
            public boolean mo9099a(SSLSocket sslSocket) {
                Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
                String name = sslSocket.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                return StringsKt.startsWith$default(name, this.f10107a + '.', false, 2, (Object) null);
            }

            @Override // p144r5.C7663m.a
            /* renamed from: b */
            public InterfaceC7664n mo9100b(SSLSocket sslSocket) {
                Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
                return C7660j.f10100f.m9096b(sslSocket.getClass());
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final C7660j m9096b(Class cls) {
            Class superclass = cls;
            while (superclass != null && !Intrinsics.areEqual(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            Intrinsics.checkNotNull(superclass);
            return new C7660j(superclass);
        }

        /* renamed from: c */
        public final C7663m.a m9097c(String packageName) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            return new C8039a(packageName);
        }

        /* renamed from: d */
        public final C7663m.a m9098d() {
            return C7660j.f10101g;
        }

        public a() {
        }
    }

    static {
        a aVar = new a(null);
        f10100f = aVar;
        f10101g = aVar.m9097c("com.google.android.gms.org.conscrypt");
    }

    public C7660j(Class sslSocketClass) throws NoSuchMethodException, SecurityException {
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        this.f10102a = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Intrinsics.checkNotNullExpressionValue(declaredMethod, "getDeclaredMethod(...)");
        this.f10103b = declaredMethod;
        this.f10104c = sslSocketClass.getMethod("setHostname", String.class);
        this.f10105d = sslSocketClass.getMethod("getAlpnSelectedProtocol", null);
        this.f10106e = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // p144r5.InterfaceC7664n
    /* renamed from: a */
    public boolean mo9081a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f10102a.isInstance(sslSocket);
    }

    @Override // p144r5.InterfaceC7664n
    /* renamed from: b */
    public String mo9082b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (!mo9081a(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f10105d.invoke(sslSocket, null);
            if (bArr != null) {
                return new String(bArr, Charsets.UTF_8);
            }
            return null;
        } catch (IllegalAccessException e6) {
            throw new AssertionError(e6);
        } catch (InvocationTargetException e7) {
            Throwable cause = e7.getCause();
            if ((cause instanceof NullPointerException) && Intrinsics.areEqual(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e7);
        }
    }

    @Override // p144r5.InterfaceC7664n
    /* renamed from: c */
    public void mo9083c(SSLSocket sslSocket, String str, List protocols) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (mo9081a(sslSocket)) {
            try {
                this.f10103b.invoke(sslSocket, Boolean.TRUE);
                this.f10106e.invoke(sslSocket, AbstractC7536c.f9994a.m8929c(protocols));
            } catch (IllegalAccessException e6) {
                throw new AssertionError(e6);
            } catch (InvocationTargetException e7) {
                throw new AssertionError(e7);
            }
        }
    }

    @Override // p144r5.InterfaceC7664n
    public boolean isSupported() {
        return C7535b.f9987f.m8921b();
    }
}
