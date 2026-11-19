package p199p4;

import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.blackboard.core.graphBuilder.GraphBuildFactory;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzySource;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p131j4.C7792a;
import p142k4.InterfaceC7880c;
import p188o4.AbstractC8704e;
import p210q4.AbstractC8886a;
import p265v4.InterfaceC9668d;
import p275w4.C9754s;

/* renamed from: p4.g */
/* loaded from: classes4.dex */
public final class C8829g {

    /* renamed from: a */
    public final InterfaceC9668d f15027a;

    /* renamed from: b */
    public final C7792a f15028b;

    /* renamed from: c */
    public final InterfaceC7880c f15029c;

    public C8829g(InterfaceC9668d sourceLoader, C7792a matrixAdapter, InterfaceC7880c graphControl) {
        Intrinsics.checkNotNullParameter(sourceLoader, "sourceLoader");
        Intrinsics.checkNotNullParameter(matrixAdapter, "matrixAdapter");
        Intrinsics.checkNotNullParameter(graphControl, "graphControl");
        this.f15027a = sourceLoader;
        this.f15028b = matrixAdapter;
        this.f15029c = graphControl;
    }

    /* renamed from: a */
    public AbstractC8704e m14794a(EzyCommand.CommandSource.CommandInfo.GraphData data, long j10) {
        Intrinsics.checkNotNullParameter(data, "data");
        InterfaceC9668d interfaceC9668d = this.f15027a;
        String strM7266G = data.m7266G();
        Intrinsics.checkNotNullExpressionValue(strM7266G, "data.sourceFileName");
        EzySource.TouchSource.TouchInfo touchInfoMo16166a = interfaceC9668d.mo16166a(strM7266G, data.m7267H());
        if (touchInfoMo16166a == null) {
            return null;
        }
        C9754s c9754s = new C9754s();
        c9754s.m14328n(this.f15029c);
        c9754s.m14332r(this.f15027a);
        c9754s.m14329o(this.f15028b);
        c9754s.m16350D(touchInfoMo16166a, j10);
        return c9754s;
    }

    /* renamed from: b */
    public void m14795b(EzyCommand.CommandSource.CommandInfo.GraphData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        AbstractC8886a abstractC8886aMo6761f = GraphBuildFactory.INSTANCE.mo6761f(data, this.f15027a);
        if (abstractC8886aMo6761f != null) {
            if (abstractC8886aMo6761f instanceof ImageGraph) {
                String strM7260A = data.m7260A();
                Intrinsics.checkNotNullExpressionValue(strM7260A, "data.extras");
                if (StringsKt.contains$default((CharSequence) strM7260A, (CharSequence) "imageBackground", false, 2, (Object) null)) {
                    this.f15029c.mo13436a((ImageGraph) abstractC8886aMo6761f);
                    return;
                }
            }
            this.f15029c.mo13460y(data.m7265F(), abstractC8886aMo6761f);
        }
    }
}
