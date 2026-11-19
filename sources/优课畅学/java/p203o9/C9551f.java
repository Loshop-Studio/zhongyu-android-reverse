package p203o9;

import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: o9.f */
/* loaded from: classes5.dex */
public final class C9551f {

    /* renamed from: a */
    public static final C9551f f18917a = new C9551f();

    /* renamed from: a */
    public static final boolean m17844a(String method) {
        AbstractC9133u.m16133g(method, "method");
        return (AbstractC9133u.m16128b(method, "GET") || AbstractC9133u.m16128b(method, "HEAD")) ? false : true;
    }

    /* renamed from: d */
    public static final boolean m17845d(String method) {
        AbstractC9133u.m16133g(method, "method");
        return AbstractC9133u.m16128b(method, "POST") || AbstractC9133u.m16128b(method, "PUT") || AbstractC9133u.m16128b(method, "PATCH") || AbstractC9133u.m16128b(method, "PROPPATCH") || AbstractC9133u.m16128b(method, "REPORT");
    }

    /* renamed from: b */
    public final boolean m17846b(String method) {
        AbstractC9133u.m16133g(method, "method");
        return !AbstractC9133u.m16128b(method, "PROPFIND");
    }

    /* renamed from: c */
    public final boolean m17847c(String method) {
        AbstractC9133u.m16133g(method, "method");
        return AbstractC9133u.m16128b(method, "PROPFIND");
    }
}
