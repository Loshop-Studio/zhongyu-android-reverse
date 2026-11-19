package p106f5;

import com.zykj.board.EzyCommand;
import com.zykj.board.EzyMatrix;
import kotlin.jvm.internal.Intrinsics;
import p006a5.InterfaceC0039c;
import p095e5.AbstractC7850e;
import p263u5.AbstractC9695n;
import p312z4.C9998a;

/* renamed from: f5.a */
/* loaded from: classes4.dex */
public final class C7923a {

    /* renamed from: a */
    public final C9998a f13352a;

    /* renamed from: b */
    public final InterfaceC0039c f13353b;

    public C7923a(C9998a matrixAdapter, InterfaceC0039c graphControl) {
        Intrinsics.checkNotNullParameter(matrixAdapter, "matrixAdapter");
        Intrinsics.checkNotNullParameter(graphControl, "graphControl");
        this.f13352a = matrixAdapter;
        this.f13353b = graphControl;
    }

    /* renamed from: a */
    public AbstractC7850e m12475a(EzyCommand.CommandSource.CommandInfo.Camera data, long j9) {
        Intrinsics.checkNotNullParameter(data, "data");
        m12476b(data);
        return null;
    }

    /* renamed from: b */
    public void m12476b(EzyCommand.CommandSource.CommandInfo.Camera data) {
        Intrinsics.checkNotNullParameter(data, "data");
        C9998a c9998a = this.f13352a;
        EzyMatrix.Matrix matrixM8126q = data.m8126q();
        Intrinsics.checkNotNullExpressionValue(matrixM8126q, "data.lastMatrix");
        c9998a.m17352j(AbstractC9695n.m16202d(matrixM8126q));
        this.f13353b.mo202e();
    }
}
