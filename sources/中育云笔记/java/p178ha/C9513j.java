package p178ha;

import ba.AbstractC5179a;
import ba.InterfaceC5181c;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzySource;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import na.AbstractC10351n;
import p325rc.AbstractC10947g0;
import p377v9.InterfaceC11552c;
import p437z9.AbstractC12029c;

/* renamed from: ha.j */
/* loaded from: classes5.dex */
public final class C9513j extends AbstractC12029c {

    /* renamed from: m */
    public List f22031m;

    /* renamed from: n */
    public ArrayList f22032n = new ArrayList();

    /* renamed from: o */
    public ArrayList f22033o = new ArrayList();

    @Override // p437z9.AbstractC12029c
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public void mo18751w(EzyMatrix.Matrix info) {
        AbstractC9979u.m20294g(info, "info");
        List list = this.f22031m;
        if (list != null) {
            if (AbstractC9979u.m20289b(info, AbstractC10947g0.m23944m0(list))) {
                InterfaceC11552c interfaceC11552cM26643b = m26643b();
                if (interfaceC11552cM26643b != null) {
                    interfaceC11552cM26643b.mo25464x(this.f22033o);
                    return;
                }
                return;
            }
            InterfaceC11552c interfaceC11552cM26643b2 = m26643b();
            if (interfaceC11552cM26643b2 != null) {
                interfaceC11552cM26643b2.mo25451k(this.f22033o, AbstractC10351n.m21665g(info));
            }
        }
    }

    @Override // p437z9.AbstractC12029c
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public boolean mo18752y(EzyMatrix.Matrix info, long j10) {
        AbstractC9979u.m20294g(info, "info");
        return info.getEventTime() - m26639v() <= j10;
    }

    /* renamed from: D */
    public final void m18771D(List graphIdList, EzySource.MatrixSource.MatrixInfo info, long j10) {
        InterfaceC5181c interfaceC5181cMo25454n;
        AbstractC9979u.m20294g(graphIdList, "graphIdList");
        AbstractC9979u.m20294g(info, "info");
        this.f22032n.clear();
        this.f22032n.addAll(graphIdList);
        ArrayList arrayList = this.f22032n;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            EzyCommand.CommandSource.CommandInfo.GraphData graphData = (EzyCommand.CommandSource.CommandInfo.GraphData) obj;
            InterfaceC11552c interfaceC11552cM26643b = m26643b();
            if (interfaceC11552cM26643b != null && (interfaceC5181cMo25454n = interfaceC11552cM26643b.mo25454n()) != null) {
                String strM14998D = graphData.m14998D();
                AbstractC9979u.m20293f(strM14998D, "it.graphId");
                AbstractC5179a abstractC5179aMo2723n = interfaceC5181cMo25454n.mo2723n(strM14998D);
                if (abstractC5179aMo2723n != null) {
                    this.f22033o.add(abstractC5179aMo2723n);
                }
            }
        }
        List matrixList = info.getMatrixList();
        AbstractC9979u.m20293f(matrixList, "info.matrixList");
        if (matrixList.isEmpty()) {
            return;
        }
        this.f22031m = info.getMatrixList();
        m26638A(info.getMatrixList().listIterator());
        List matrixList2 = info.getMatrixList();
        AbstractC9979u.m20293f(matrixList2, "info.matrixList");
        m26640x(((EzyMatrix.Matrix) AbstractC10947g0.m23944m0(matrixList2)).getEventTime());
        m26641z(j10);
    }
}
