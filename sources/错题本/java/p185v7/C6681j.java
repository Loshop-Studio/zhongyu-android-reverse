package p185v7;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import okhttp3.Protocol;

/* renamed from: v7.j */
/* loaded from: classes4.dex */
public final class C6681j extends C6685n {

    /* renamed from: c */
    public final Method f11268c;

    /* renamed from: d */
    public final Method f11269d;

    /* renamed from: e */
    public final Method f11270e;

    /* renamed from: f */
    public final Class f11271f;

    /* renamed from: g */
    public final Class f11272g;

    public C6681j(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f11268c = method;
        this.f11269d = method2;
        this.f11270e = method3;
        this.f11271f = cls;
        this.f11272g = cls2;
    }

    @Override // p185v7.C6685n
    /* renamed from: a */
    public final void mo6360a(SSLSocket sSLSocket) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f11270e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e4) {
            throw new AssertionError("failed to remove ALPN", e4);
        }
    }

    @Override // p185v7.C6685n
    /* renamed from: d */
    public final void mo6331d(SSLSocket sSLSocket, String str, List protocols) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC5830k.m5330g(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((Protocol) obj) != Protocol.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC5806u.m5277p(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((Protocol) obj2).getProtocol());
        }
        try {
            this.f11268c.invoke(null, sSLSocket, Proxy.newProxyInstance(C6685n.class.getClassLoader(), new Class[]{this.f11271f, this.f11272g}, new C6680i(arrayList2)));
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (InvocationTargetException e4) {
            throw new AssertionError("failed to set ALPN", e4);
        }
    }

    @Override // p185v7.C6685n
    /* renamed from: f */
    public final String mo6332f(SSLSocket sSLSocket) throws IllegalArgumentException {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f11269d.invoke(null, sSLSocket));
            AbstractC5830k.m5328e(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            C6680i c6680i = (C6680i) invocationHandler;
            boolean z8 = c6680i.f11266b;
            if (!z8 && c6680i.f11267c == null) {
                C6685n.m6380i("ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 4, null);
                return null;
            }
            if (z8) {
                return null;
            }
            return c6680i.f11267c;
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e4) {
            throw new AssertionError("failed to get ALPN selected protocol", e4);
        }
    }
}
