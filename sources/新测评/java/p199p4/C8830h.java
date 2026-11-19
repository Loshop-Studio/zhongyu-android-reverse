package p199p4;

import com.zykj.board.EzyCommand;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzySource;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p077e5.AbstractC7352m;
import p142k4.InterfaceC7880c;
import p188o4.AbstractC8704e;
import p210q4.AbstractC8886a;
import p210q4.InterfaceC8888c;
import p265v4.InterfaceC9668d;
import p275w4.C9745j;

/* renamed from: p4.h */
/* loaded from: classes4.dex */
public final class C8830h {

    /* renamed from: a */
    public final InterfaceC9668d f15030a;

    /* renamed from: b */
    public final InterfaceC7880c f15031b;

    public C8830h(InterfaceC9668d sourceLoader, InterfaceC7880c graphControl) {
        Intrinsics.checkNotNullParameter(sourceLoader, "sourceLoader");
        Intrinsics.checkNotNullParameter(graphControl, "graphControl");
        this.f15030a = sourceLoader;
        this.f15031b = graphControl;
    }

    /* renamed from: a */
    public AbstractC8704e m14796a(EzyCommand.CommandSource.CommandInfo.GraphMatrix data, long j10) {
        Intrinsics.checkNotNullParameter(data, "data");
        InterfaceC9668d interfaceC9668d = this.f15030a;
        String strM7315A = data.m7315A();
        Intrinsics.checkNotNullExpressionValue(strM7315A, "data.sourceFileName");
        EzySource.MatrixSource.MatrixInfo matrixInfoMo16167b = interfaceC9668d.mo16167b(strM7315A, data.m7316B());
        if (matrixInfoMo16167b == null) {
            return null;
        }
        C9745j c9745j = new C9745j();
        c9745j.m14328n(this.f15031b);
        c9745j.m14332r(this.f15030a);
        List listM7324x = data.m7324x();
        Intrinsics.checkNotNullExpressionValue(listM7324x, "data.graphDataList");
        c9745j.m16347D(listM7324x, matrixInfoMo16167b, j10);
        return c9745j;
    }

    /* renamed from: b */
    public void m14797b(EzyCommand.CommandSource.CommandInfo.GraphMatrix data) {
        Intrinsics.checkNotNullParameter(data, "data");
        InterfaceC9668d interfaceC9668d = this.f15030a;
        String strM7315A = data.m7315A();
        Intrinsics.checkNotNullExpressionValue(strM7315A, "data.sourceFileName");
        EzySource.MatrixSource.MatrixInfo matrixInfoMo16167b = interfaceC9668d.mo16167b(strM7315A, data.m7316B());
        if (matrixInfoMo16167b != null) {
            ArrayList arrayList = new ArrayList();
            List<EzyCommand.CommandSource.CommandInfo.GraphData> listM7324x = data.m7324x();
            Intrinsics.checkNotNullExpressionValue(listM7324x, "data.graphDataList");
            for (EzyCommand.CommandSource.CommandInfo.GraphData graphData : listM7324x) {
                InterfaceC8888c interfaceC8888cMo13449n = this.f15031b.mo13449n();
                if (interfaceC8888cMo13449n != null) {
                    String strM7263D = graphData.m7263D();
                    Intrinsics.checkNotNullExpressionValue(strM7263D, "graph.graphId");
                    AbstractC8886a abstractC8886aMo15001n = interfaceC8888cMo13449n.mo15001n(strM7263D);
                    if (abstractC8886aMo15001n != null) {
                        arrayList.add(abstractC8886aMo15001n);
                    }
                }
            }
            InterfaceC7880c interfaceC7880c = this.f15031b;
            List matrixList = matrixInfoMo16167b.getMatrixList();
            Intrinsics.checkNotNullExpressionValue(matrixList, "it.matrixList");
            Object objLast = CollectionsKt.last((List<? extends Object>) matrixList);
            Intrinsics.checkNotNullExpressionValue(objLast, "it.matrixList.last()");
            interfaceC7880c.mo13459x(arrayList, AbstractC7352m.m11779d((EzyMatrix.Matrix) objLast));
        }
    }
}
