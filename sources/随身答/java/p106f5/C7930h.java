package p106f5;

import com.zykj.board.EzyCommand;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzySource;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p006a5.InterfaceC0039c;
import p095e5.AbstractC7850e;
import p117g5.AbstractC8053a;
import p117g5.InterfaceC8055c;
import p169l5.InterfaceC8891e;
import p179m5.C8974j;
import p263u5.AbstractC9695n;

/* renamed from: f5.h */
/* loaded from: classes4.dex */
public final class C7930h {

    /* renamed from: a */
    public final InterfaceC8891e f13378a;

    /* renamed from: b */
    public final InterfaceC0039c f13379b;

    public C7930h(InterfaceC8891e sourceLoader, InterfaceC0039c graphControl) {
        Intrinsics.checkNotNullParameter(sourceLoader, "sourceLoader");
        Intrinsics.checkNotNullParameter(graphControl, "graphControl");
        this.f13378a = sourceLoader;
        this.f13379b = graphControl;
    }

    /* renamed from: a */
    public AbstractC7850e m12487a(EzyCommand.CommandSource.CommandInfo.GraphMatrix data, long j9) {
        Intrinsics.checkNotNullParameter(data, "data");
        InterfaceC8891e interfaceC8891e = this.f13378a;
        String strM8435D = data.m8435D();
        Intrinsics.checkNotNullExpressionValue(strM8435D, "data.sourceFileName");
        EzySource.MatrixSource.MatrixInfo matrixInfoMo13812b = interfaceC8891e.mo13812b(strM8435D, data.m8436E());
        if (matrixInfoMo13812b == null) {
            return null;
        }
        C8974j c8974j = new C8974j();
        c8974j.m12319n(this.f13379b);
        c8974j.m12323r(this.f13378a);
        List listM8432A = data.m8432A();
        Intrinsics.checkNotNullExpressionValue(listM8432A, "data.graphDataList");
        c8974j.m14341D(listM8432A, matrixInfoMo13812b, j9);
        return c8974j;
    }

    /* renamed from: b */
    public void m12488b(EzyCommand.CommandSource.CommandInfo.GraphMatrix data) {
        Intrinsics.checkNotNullParameter(data, "data");
        InterfaceC8891e interfaceC8891e = this.f13378a;
        String strM8435D = data.m8435D();
        Intrinsics.checkNotNullExpressionValue(strM8435D, "data.sourceFileName");
        EzySource.MatrixSource.MatrixInfo matrixInfoMo13812b = interfaceC8891e.mo13812b(strM8435D, data.m8436E());
        if (matrixInfoMo13812b != null) {
            ArrayList arrayList = new ArrayList();
            List<EzyCommand.CommandSource.CommandInfo.GraphData> listM8432A = data.m8432A();
            Intrinsics.checkNotNullExpressionValue(listM8432A, "data.graphDataList");
            for (EzyCommand.CommandSource.CommandInfo.GraphData graphData : listM8432A) {
                InterfaceC8055c interfaceC8055cMo210m = this.f13379b.mo210m();
                if (interfaceC8055cMo210m != null) {
                    String strM8381G = graphData.m8381G();
                    Intrinsics.checkNotNullExpressionValue(strM8381G, "graph.graphId");
                    AbstractC8053a abstractC8053aMo12801m = interfaceC8055cMo210m.mo12801m(strM8381G);
                    if (abstractC8053aMo12801m != null) {
                        arrayList.add(abstractC8053aMo12801m);
                    }
                }
            }
            InterfaceC0039c interfaceC0039c = this.f13379b;
            List matrixList = matrixInfoMo13812b.getMatrixList();
            Intrinsics.checkNotNullExpressionValue(matrixList, "it.matrixList");
            Object objLast = CollectionsKt.last((List<? extends Object>) matrixList);
            Intrinsics.checkNotNullExpressionValue(objLast, "it.matrixList.last()");
            interfaceC0039c.mo223z(arrayList, AbstractC9695n.m16202d((EzyMatrix.Matrix) objLast));
        }
    }
}
