package p011aa;

import ba.AbstractC5179a;
import ba.InterfaceC5181c;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzySource;
import ga.InterfaceC9284d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import na.AbstractC10351n;
import p178ha.C9513j;
import p325rc.AbstractC10947g0;
import p377v9.InterfaceC11552c;
import p437z9.AbstractC12031e;

/* renamed from: aa.h */
/* loaded from: classes5.dex */
public final class C0097h {

    /* renamed from: a */
    public final InterfaceC9284d f103a;

    /* renamed from: b */
    public final InterfaceC11552c f104b;

    public C0097h(InterfaceC9284d sourceLoader, InterfaceC11552c graphControl) {
        AbstractC9979u.m20294g(sourceLoader, "sourceLoader");
        AbstractC9979u.m20294g(graphControl, "graphControl");
        this.f103a = sourceLoader;
        this.f104b = graphControl;
    }

    /* renamed from: a */
    public AbstractC12031e m265a(EzyCommand.CommandSource.CommandInfo.GraphMatrix data, long j10) {
        AbstractC9979u.m20294g(data, "data");
        InterfaceC9284d interfaceC9284d = this.f103a;
        String strM15062z = data.m15062z();
        AbstractC9979u.m20293f(strM15062z, "data.sourceFileName");
        EzySource.MatrixSource.MatrixInfo matrixInfoMo18290b = interfaceC9284d.mo18290b(strM15062z, data.m15051A());
        if (matrixInfoMo18290b == null) {
            return null;
        }
        C9513j c9513j = new C9513j();
        c9513j.m26652n(this.f104b);
        c9513j.m26656r(this.f103a);
        List listM15059u = data.m15059u();
        AbstractC9979u.m20293f(listM15059u, "data.graphDataList");
        c9513j.m18771D(listM15059u, matrixInfoMo18290b, j10);
        return c9513j;
    }

    /* renamed from: b */
    public void m266b(EzyCommand.CommandSource.CommandInfo.GraphMatrix data) {
        AbstractC9979u.m20294g(data, "data");
        InterfaceC9284d interfaceC9284d = this.f103a;
        String strM15062z = data.m15062z();
        AbstractC9979u.m20293f(strM15062z, "data.sourceFileName");
        EzySource.MatrixSource.MatrixInfo matrixInfoMo18290b = interfaceC9284d.mo18290b(strM15062z, data.m15051A());
        if (matrixInfoMo18290b != null) {
            ArrayList arrayList = new ArrayList();
            List<EzyCommand.CommandSource.CommandInfo.GraphData> listM15059u = data.m15059u();
            AbstractC9979u.m20293f(listM15059u, "data.graphDataList");
            for (EzyCommand.CommandSource.CommandInfo.GraphData graphData : listM15059u) {
                InterfaceC5181c interfaceC5181cMo25454n = this.f104b.mo25454n();
                if (interfaceC5181cMo25454n != null) {
                    String strM14998D = graphData.m14998D();
                    AbstractC9979u.m20293f(strM14998D, "graph.graphId");
                    AbstractC5179a abstractC5179aMo2723n = interfaceC5181cMo25454n.mo2723n(strM14998D);
                    if (abstractC5179aMo2723n != null) {
                        arrayList.add(abstractC5179aMo2723n);
                    }
                }
            }
            InterfaceC11552c interfaceC11552c = this.f104b;
            List matrixList = matrixInfoMo18290b.getMatrixList();
            AbstractC9979u.m20293f(matrixList, "it.matrixList");
            Object objM23956y0 = AbstractC10947g0.m23956y0(matrixList);
            AbstractC9979u.m20293f(objM23956y0, "it.matrixList.last()");
            interfaceC11552c.mo25466z(arrayList, AbstractC10351n.m21665g((EzyMatrix.Matrix) objM23956y0));
        }
    }
}
