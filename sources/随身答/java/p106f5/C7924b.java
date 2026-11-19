package p106f5;

import com.zykj.board.EzyCommand;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzySource;
import kotlin.jvm.internal.Intrinsics;
import p006a5.InterfaceC0039c;
import p095e5.AbstractC7850e;
import p169l5.InterfaceC8891e;
import p179m5.C8971g;
import p263u5.AbstractC9695n;
import p312z4.C9998a;

/* renamed from: f5.b */
/* loaded from: classes4.dex */
public final class C7924b {

    /* renamed from: a */
    public final InterfaceC8891e f13354a;

    /* renamed from: b */
    public final C9998a f13355b;

    /* renamed from: c */
    public final InterfaceC0039c f13356c;

    public C7924b(InterfaceC8891e sourceLoader, C9998a matrixAdapter, InterfaceC0039c graphControl) {
        Intrinsics.checkNotNullParameter(sourceLoader, "sourceLoader");
        Intrinsics.checkNotNullParameter(matrixAdapter, "matrixAdapter");
        Intrinsics.checkNotNullParameter(graphControl, "graphControl");
        this.f13354a = sourceLoader;
        this.f13355b = matrixAdapter;
        this.f13356c = graphControl;
    }

    /* renamed from: a */
    public AbstractC7850e m12477a(EzyCommand.CommandSource.CommandInfo.CameraMatrix data, long j9) {
        Intrinsics.checkNotNullParameter(data, "data");
        InterfaceC8891e interfaceC8891e = this.f13354a;
        String strM8176x = data.m8176x();
        Intrinsics.checkNotNullExpressionValue(strM8176x, "data.sourceFileName");
        EzySource.MatrixSource.MatrixInfo matrixInfoMo13812b = interfaceC8891e.mo13812b(strM8176x, data.m8177y());
        if (matrixInfoMo13812b == null) {
            return null;
        }
        C8971g c8971g = new C8971g();
        c8971g.m12319n(this.f13356c);
        c8971g.m12323r(this.f13354a);
        c8971g.m12320o(this.f13355b);
        c8971g.m14324D(matrixInfoMo13812b, j9);
        return c8971g;
    }

    /* renamed from: b */
    public void m12478b(EzyCommand.CommandSource.CommandInfo.CameraMatrix data) {
        Intrinsics.checkNotNullParameter(data, "data");
        C9998a c9998a = this.f13355b;
        EzyMatrix.Matrix matrixM8174v = data.m8174v();
        Intrinsics.checkNotNullExpressionValue(matrixM8174v, "data.lastMatrix");
        c9998a.m17352j(AbstractC9695n.m16202d(matrixM8174v));
        this.f13356c.mo202e();
    }
}
