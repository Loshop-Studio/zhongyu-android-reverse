package p199p4;

import com.zykj.board.EzyCommand;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzySource;
import kotlin.jvm.internal.Intrinsics;
import p077e5.AbstractC7352m;
import p131j4.C7792a;
import p142k4.InterfaceC7880c;
import p188o4.AbstractC8704e;
import p265v4.InterfaceC9668d;
import p275w4.C9742g;

/* renamed from: p4.b */
/* loaded from: classes4.dex */
public final class C8824b {

    /* renamed from: a */
    public final InterfaceC9668d f15006a;

    /* renamed from: b */
    public final C7792a f15007b;

    /* renamed from: c */
    public final InterfaceC7880c f15008c;

    public C8824b(InterfaceC9668d sourceLoader, C7792a matrixAdapter, InterfaceC7880c graphControl) {
        Intrinsics.checkNotNullParameter(sourceLoader, "sourceLoader");
        Intrinsics.checkNotNullParameter(matrixAdapter, "matrixAdapter");
        Intrinsics.checkNotNullParameter(graphControl, "graphControl");
        this.f15006a = sourceLoader;
        this.f15007b = matrixAdapter;
        this.f15008c = graphControl;
    }

    /* renamed from: a */
    public AbstractC8704e m14786a(EzyCommand.CommandSource.CommandInfo.CameraMatrix data, long j10) {
        Intrinsics.checkNotNullParameter(data, "data");
        InterfaceC9668d interfaceC9668d = this.f15006a;
        String strM7058u = data.m7058u();
        Intrinsics.checkNotNullExpressionValue(strM7058u, "data.sourceFileName");
        EzySource.MatrixSource.MatrixInfo matrixInfoMo16167b = interfaceC9668d.mo16167b(strM7058u, data.m7059v());
        if (matrixInfoMo16167b == null) {
            return null;
        }
        C9742g c9742g = new C9742g();
        c9742g.m14328n(this.f15008c);
        c9742g.m14332r(this.f15006a);
        c9742g.m14329o(this.f15007b);
        c9742g.m16330D(matrixInfoMo16167b, j10);
        return c9742g;
    }

    /* renamed from: b */
    public void m14787b(EzyCommand.CommandSource.CommandInfo.CameraMatrix data) {
        Intrinsics.checkNotNullParameter(data, "data");
        C7792a c7792a = this.f15007b;
        EzyMatrix.Matrix matrixM7056s = data.m7056s();
        Intrinsics.checkNotNullExpressionValue(matrixM7056s, "data.lastMatrix");
        c7792a.m13196j(AbstractC7352m.m11779d(matrixM7056s));
        this.f15008c.mo13440e();
    }
}
