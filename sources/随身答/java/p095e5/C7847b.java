package p095e5;

import kotlin.jvm.internal.Intrinsics;
import p006a5.InterfaceC0039c;
import p106f5.C7925c;
import p169l5.InterfaceC8891e;
import p312z4.C9998a;

/* renamed from: e5.b */
/* loaded from: classes4.dex */
public final class C7847b {

    /* renamed from: a */
    public static final C7847b f13183a = new C7847b();

    /* renamed from: a */
    public final AbstractC7846a m12301a(int i9, InterfaceC8891e sourceLoader, C9998a matrixAdapter, InterfaceC0039c graphControl) {
        Intrinsics.checkNotNullParameter(sourceLoader, "sourceLoader");
        Intrinsics.checkNotNullParameter(matrixAdapter, "matrixAdapter");
        Intrinsics.checkNotNullParameter(graphControl, "graphControl");
        return i9 == 6 ? new C7925c(sourceLoader, matrixAdapter, graphControl) : new C7925c(sourceLoader, matrixAdapter, graphControl);
    }
}
