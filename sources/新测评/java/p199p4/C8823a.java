package p199p4;

import com.zykj.board.EzyCommand;
import com.zykj.board.EzyMatrix;
import kotlin.jvm.internal.Intrinsics;
import p077e5.AbstractC7352m;
import p131j4.C7792a;
import p142k4.InterfaceC7880c;
import p188o4.AbstractC8704e;

/* renamed from: p4.a */
/* loaded from: classes4.dex */
public final class C8823a {

    /* renamed from: a */
    public final C7792a f15004a;

    /* renamed from: b */
    public final InterfaceC7880c f15005b;

    public C8823a(C7792a matrixAdapter, InterfaceC7880c graphControl) {
        Intrinsics.checkNotNullParameter(matrixAdapter, "matrixAdapter");
        Intrinsics.checkNotNullParameter(graphControl, "graphControl");
        this.f15004a = matrixAdapter;
        this.f15005b = graphControl;
    }

    /* renamed from: a */
    public AbstractC8704e m14784a(EzyCommand.CommandSource.CommandInfo.Camera data, long j10) {
        Intrinsics.checkNotNullParameter(data, "data");
        m14785b(data);
        return null;
    }

    /* renamed from: b */
    public void m14785b(EzyCommand.CommandSource.CommandInfo.Camera data) {
        Intrinsics.checkNotNullParameter(data, "data");
        C7792a c7792a = this.f15004a;
        EzyMatrix.Matrix matrixM7009o = data.m7009o();
        Intrinsics.checkNotNullExpressionValue(matrixM7009o, "data.lastMatrix");
        c7792a.m13196j(AbstractC7352m.m11779d(matrixM7009o));
        this.f15005b.mo13440e();
    }
}
