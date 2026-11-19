package p106f5;

import com.zykj.board.EzyCommand;
import com.zykj.board.EzySource;
import kotlin.jvm.internal.Intrinsics;
import p006a5.InterfaceC0039c;
import p095e5.AbstractC7850e;
import p169l5.InterfaceC8891e;
import p179m5.C8973i;
import p312z4.C9998a;

/* renamed from: f5.e */
/* loaded from: classes4.dex */
public final class C7927e {

    /* renamed from: a */
    public final InterfaceC8891e f13370a;

    /* renamed from: b */
    public final C9998a f13371b;

    /* renamed from: c */
    public final InterfaceC0039c f13372c;

    public C7927e(InterfaceC8891e sourceLoader, C9998a matrixAdapter, InterfaceC0039c graphControl) {
        Intrinsics.checkNotNullParameter(sourceLoader, "sourceLoader");
        Intrinsics.checkNotNullParameter(matrixAdapter, "matrixAdapter");
        Intrinsics.checkNotNullParameter(graphControl, "graphControl");
        this.f13370a = sourceLoader;
        this.f13371b = matrixAdapter;
        this.f13372c = graphControl;
    }

    /* renamed from: a */
    public AbstractC7850e m12481a(EzyCommand.CommandSource.CommandInfo.CursorMove data, long j9) {
        Intrinsics.checkNotNullParameter(data, "data");
        InterfaceC8891e interfaceC8891e = this.f13370a;
        String strM8265q = data.m8265q();
        Intrinsics.checkNotNullExpressionValue(strM8265q, "data.sourceFileName");
        EzySource.TouchSource.TouchInfo touchInfoMo13811a = interfaceC8891e.mo13811a(strM8265q, data.m8266t());
        if (touchInfoMo13811a == null) {
            return null;
        }
        C8973i c8973i = new C8973i();
        c8973i.m12319n(this.f13372c);
        c8973i.m12323r(this.f13370a);
        c8973i.m12320o(this.f13371b);
        c8973i.m14338D(touchInfoMo13811a, j9);
        return c8973i;
    }

    /* renamed from: b */
    public void m12482b(EzyCommand.CommandSource.CommandInfo.CursorMove data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f13372c.mo201d();
    }
}
