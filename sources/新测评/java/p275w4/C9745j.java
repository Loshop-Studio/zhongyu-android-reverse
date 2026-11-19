package p275w4;

import com.zykj.board.EzyCommand;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzySource;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p077e5.AbstractC7352m;
import p142k4.InterfaceC7880c;
import p188o4.AbstractC8702c;
import p210q4.AbstractC8886a;
import p210q4.InterfaceC8888c;

/* renamed from: w4.j */
/* loaded from: classes4.dex */
public final class C9745j extends AbstractC8702c {

    /* renamed from: k */
    public List f17159k;

    /* renamed from: l */
    public ArrayList f17160l = new ArrayList();

    /* renamed from: m */
    public ArrayList f17161m = new ArrayList();

    @Override // p188o4.AbstractC8702c
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public void mo14313w(EzyMatrix.Matrix info) {
        Intrinsics.checkNotNullParameter(info, "info");
        List list = this.f17159k;
        if (list != null) {
            if (Intrinsics.areEqual(info, CollectionsKt.first(list))) {
                InterfaceC7880c interfaceC7880cM14319b = m14319b();
                if (interfaceC7880cM14319b != null) {
                    interfaceC7880cM14319b.mo13457v(this.f17161m);
                    return;
                }
                return;
            }
            InterfaceC7880c interfaceC7880cM14319b2 = m14319b();
            if (interfaceC7880cM14319b2 != null) {
                interfaceC7880cM14319b2.mo13443h(this.f17161m, AbstractC7352m.m11779d(info));
            }
        }
    }

    @Override // p188o4.AbstractC8702c
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public boolean mo14315y(EzyMatrix.Matrix info, long j10) {
        Intrinsics.checkNotNullParameter(info, "info");
        return info.getEventTime() - m14312v() <= j10;
    }

    /* renamed from: D */
    public final void m16347D(List graphIdList, EzySource.MatrixSource.MatrixInfo info, long j10) {
        InterfaceC8888c interfaceC8888cMo13449n;
        Intrinsics.checkNotNullParameter(graphIdList, "graphIdList");
        Intrinsics.checkNotNullParameter(info, "info");
        this.f17160l.clear();
        this.f17160l.addAll(graphIdList);
        ArrayList arrayList = this.f17160l;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            EzyCommand.CommandSource.CommandInfo.GraphData graphData = (EzyCommand.CommandSource.CommandInfo.GraphData) obj;
            InterfaceC7880c interfaceC7880cM14319b = m14319b();
            if (interfaceC7880cM14319b != null && (interfaceC8888cMo13449n = interfaceC7880cM14319b.mo13449n()) != null) {
                String strM7263D = graphData.m7263D();
                Intrinsics.checkNotNullExpressionValue(strM7263D, "it.graphId");
                AbstractC8886a abstractC8886aMo15001n = interfaceC8888cMo13449n.mo15001n(strM7263D);
                if (abstractC8886aMo15001n != null) {
                    this.f17161m.add(abstractC8886aMo15001n);
                }
            }
        }
        List matrixList = info.getMatrixList();
        Intrinsics.checkNotNullExpressionValue(matrixList, "info.matrixList");
        if (matrixList.isEmpty()) {
            return;
        }
        this.f17159k = info.getMatrixList();
        m14311A(info.getMatrixList().listIterator());
        List matrixList2 = info.getMatrixList();
        Intrinsics.checkNotNullExpressionValue(matrixList2, "info.matrixList");
        m14314x(((EzyMatrix.Matrix) CollectionsKt.first(matrixList2)).getEventTime());
        m14316z(j10);
    }
}
