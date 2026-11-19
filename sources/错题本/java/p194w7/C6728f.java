package p194w7;

import io.reactivex.internal.operators.observable.C5707c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5840a;
import p185v7.C6674c;
import p185v7.C6685n;

/* renamed from: w7.f */
/* loaded from: classes4.dex */
public class C6728f implements InterfaceC6735m {

    /* renamed from: f */
    public static final C6727e f11345f = new C6727e();

    /* renamed from: a */
    public final Class f11346a;

    /* renamed from: b */
    public final Method f11347b;

    /* renamed from: c */
    public final Method f11348c;

    /* renamed from: d */
    public final Method f11349d;

    /* renamed from: e */
    public final Method f11350e;

    public C6728f(Class cls) throws NoSuchMethodException, SecurityException {
        this.f11346a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        AbstractC5830k.m5329f(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f11347b = declaredMethod;
        this.f11348c = cls.getMethod("setHostname", String.class);
        this.f11349d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f11350e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // p194w7.InterfaceC6735m
    /* renamed from: a */
    public final boolean mo6410a(SSLSocket sSLSocket) {
        return this.f11346a.isInstance(sSLSocket);
    }

    @Override // p194w7.InterfaceC6735m
    /* renamed from: b */
    public final String mo6411b(SSLSocket sSLSocket) {
        if (this.f11346a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.f11349d.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, AbstractC5840a.f9235a);
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e4) {
                Throwable cause = e4.getCause();
                if (!(cause instanceof NullPointerException) || !AbstractC5830k.m5325b(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e4);
                }
            }
        }
        return null;
    }

    @Override // p194w7.InterfaceC6735m
    /* renamed from: c */
    public final void mo6412c(SSLSocket sSLSocket, String str, List protocols) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC5830k.m5330g(protocols, "protocols");
        if (this.f11346a.isInstance(sSLSocket)) {
            try {
                this.f11347b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f11348c.invoke(sSLSocket, str);
                }
                Method method = this.f11350e;
                C6685n c6685n = C6685n.f11276a;
                method.invoke(sSLSocket, C5707c.m5078m(protocols));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e4) {
                throw new AssertionError(e4);
            }
        }
    }

    @Override // p194w7.InterfaceC6735m
    public final boolean isSupported() {
        boolean z8 = C6674c.f11257e;
        return C6674c.f11257e;
    }
}
