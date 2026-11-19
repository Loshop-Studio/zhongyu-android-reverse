package p188o4;

import kotlin.jvm.internal.Intrinsics;
import p131j4.C7792a;
import p142k4.InterfaceC7880c;
import p199p4.C8825c;
import p265v4.InterfaceC9668d;

/* renamed from: o4.b */
/* loaded from: classes4.dex */
public final class C8701b {

    /* renamed from: a */
    public static final C8701b f14468a = new C8701b();

    /* renamed from: a */
    public final AbstractC8700a m14310a(int i10, InterfaceC9668d sourceLoader, C7792a matrixAdapter, InterfaceC7880c graphControl) {
        Intrinsics.checkNotNullParameter(sourceLoader, "sourceLoader");
        Intrinsics.checkNotNullParameter(matrixAdapter, "matrixAdapter");
        Intrinsics.checkNotNullParameter(graphControl, "graphControl");
        return i10 == 6 ? new C8825c(sourceLoader, matrixAdapter, graphControl) : new C8825c(sourceLoader, matrixAdapter, graphControl);
    }
}
