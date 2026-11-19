package p103g9;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: g9.f */
/* loaded from: classes5.dex */
public final class C7605f {

    /* renamed from: a */
    public static final C7605f f12748a = new C7605f();

    /* renamed from: a */
    public static final boolean m12509a(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return (Intrinsics.areEqual(method, "GET") || Intrinsics.areEqual(method, "HEAD")) ? false : true;
    }

    /* renamed from: d */
    public static final boolean m12510d(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return Intrinsics.areEqual(method, "POST") || Intrinsics.areEqual(method, "PUT") || Intrinsics.areEqual(method, "PATCH") || Intrinsics.areEqual(method, "PROPPATCH") || Intrinsics.areEqual(method, "REPORT");
    }

    /* renamed from: b */
    public final boolean m12511b(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return !Intrinsics.areEqual(method, "PROPFIND");
    }

    /* renamed from: c */
    public final boolean m12512c(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return Intrinsics.areEqual(method, "PROPFIND");
    }
}
