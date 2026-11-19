package p236r8;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: r8.f */
/* loaded from: classes5.dex */
public final class C9444f {

    /* renamed from: a */
    public static final C9444f f16460a = new C9444f();

    /* renamed from: a */
    public static final boolean m15596a(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return (Intrinsics.areEqual(method, "GET") || Intrinsics.areEqual(method, "HEAD")) ? false : true;
    }

    /* renamed from: d */
    public static final boolean m15597d(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return Intrinsics.areEqual(method, "POST") || Intrinsics.areEqual(method, "PUT") || Intrinsics.areEqual(method, "PATCH") || Intrinsics.areEqual(method, "PROPPATCH") || Intrinsics.areEqual(method, "REPORT");
    }

    /* renamed from: b */
    public final boolean m15598b(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return !Intrinsics.areEqual(method, "PROPFIND");
    }

    /* renamed from: c */
    public final boolean m15599c(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return Intrinsics.areEqual(method, "PROPFIND");
    }
}
