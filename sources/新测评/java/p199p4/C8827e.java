package p199p4;

import com.zykj.board.EzyCommand;
import com.zykj.board.EzySource;
import kotlin.jvm.internal.Intrinsics;
import p131j4.C7792a;
import p142k4.InterfaceC7880c;
import p188o4.AbstractC8704e;
import p265v4.InterfaceC9668d;
import p275w4.C9744i;

/* renamed from: p4.e */
/* loaded from: classes4.dex */
public final class C8827e {

    /* renamed from: a */
    public final InterfaceC9668d f15022a;

    /* renamed from: b */
    public final C7792a f15023b;

    /* renamed from: c */
    public final InterfaceC7880c f15024c;

    public C8827e(InterfaceC9668d sourceLoader, C7792a matrixAdapter, InterfaceC7880c graphControl) {
        Intrinsics.checkNotNullParameter(sourceLoader, "sourceLoader");
        Intrinsics.checkNotNullParameter(matrixAdapter, "matrixAdapter");
        Intrinsics.checkNotNullParameter(graphControl, "graphControl");
        this.f15022a = sourceLoader;
        this.f15023b = matrixAdapter;
        this.f15024c = graphControl;
    }

    /* renamed from: a */
    public AbstractC8704e m14790a(EzyCommand.CommandSource.CommandInfo.CursorMove data, long j10) {
        Intrinsics.checkNotNullParameter(data, "data");
        InterfaceC9668d interfaceC9668d = this.f15022a;
        String strM7149o = data.m7149o();
        Intrinsics.checkNotNullExpressionValue(strM7149o, "data.sourceFileName");
        EzySource.TouchSource.TouchInfo touchInfoMo16166a = interfaceC9668d.mo16166a(strM7149o, data.m7150q());
        if (touchInfoMo16166a == null) {
            return null;
        }
        C9744i c9744i = new C9744i();
        c9744i.m14328n(this.f15024c);
        c9744i.m14332r(this.f15022a);
        c9744i.m14329o(this.f15023b);
        c9744i.m16344D(touchInfoMo16166a, j10);
        return c9744i;
    }

    /* renamed from: b */
    public void m14791b(EzyCommand.CommandSource.CommandInfo.CursorMove data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f15024c.mo13439d();
    }
}
