package p102l5;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: l5.f */
/* loaded from: classes4.dex */
public final class C7352f {

    /* renamed from: a */
    public static final C7352f f9330a = new C7352f();

    /* renamed from: a */
    public static final boolean m8339a(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return (Intrinsics.areEqual(method, "GET") || Intrinsics.areEqual(method, "HEAD")) ? false : true;
    }

    /* renamed from: d */
    public static final boolean m8340d(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return Intrinsics.areEqual(method, "POST") || Intrinsics.areEqual(method, "PUT") || Intrinsics.areEqual(method, "PATCH") || Intrinsics.areEqual(method, "PROPPATCH") || Intrinsics.areEqual(method, "REPORT");
    }

    /* renamed from: b */
    public final boolean m8341b(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return !Intrinsics.areEqual(method, "PROPFIND");
    }

    /* renamed from: c */
    public final boolean m8342c(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return Intrinsics.areEqual(method, "PROPFIND");
    }
}
