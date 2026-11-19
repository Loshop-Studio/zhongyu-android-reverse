package p141x2;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: x2.f */
/* loaded from: classes2.dex */
public final class C4669f {

    /* renamed from: a */
    public static final C4669f f5968a = new C4669f();

    /* renamed from: a */
    public static final boolean m6582a(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return (Intrinsics.areEqual(method, "GET") || Intrinsics.areEqual(method, "HEAD")) ? false : true;
    }

    /* renamed from: d */
    public static final boolean m6583d(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return Intrinsics.areEqual(method, "POST") || Intrinsics.areEqual(method, "PUT") || Intrinsics.areEqual(method, "PATCH") || Intrinsics.areEqual(method, "PROPPATCH") || Intrinsics.areEqual(method, "REPORT");
    }

    /* renamed from: b */
    public final boolean m6584b(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return !Intrinsics.areEqual(method, "PROPFIND");
    }

    /* renamed from: c */
    public final boolean m6585c(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return Intrinsics.areEqual(method, "PROPFIND");
    }
}
