package pe;

import anet.channel.request.Request;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: pe.f */
/* loaded from: classes6.dex */
public final class C10679f {

    /* renamed from: a */
    public static final C10679f f25733a = new C10679f();

    /* renamed from: a */
    public static final boolean m22622a(String method) {
        AbstractC9979u.m20294g(method, "method");
        return (AbstractC9979u.m20289b(method, "GET") || AbstractC9979u.m20289b(method, Request.Method.HEAD)) ? false : true;
    }

    /* renamed from: d */
    public static final boolean m22623d(String method) {
        AbstractC9979u.m20294g(method, "method");
        return AbstractC9979u.m20289b(method, "POST") || AbstractC9979u.m20289b(method, Request.Method.PUT) || AbstractC9979u.m20289b(method, "PATCH") || AbstractC9979u.m20289b(method, "PROPPATCH") || AbstractC9979u.m20289b(method, "REPORT");
    }

    /* renamed from: b */
    public final boolean m22624b(String method) {
        AbstractC9979u.m20294g(method, "method");
        return !AbstractC9979u.m20289b(method, "PROPFIND");
    }

    /* renamed from: c */
    public final boolean m22625c(String method) {
        AbstractC9979u.m20294g(method, "method");
        return AbstractC9979u.m20289b(method, "PROPFIND");
    }
}
