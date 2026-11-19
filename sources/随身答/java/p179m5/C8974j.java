package p179m5;

import com.zykj.board.EzyCommand;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzySource;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p006a5.InterfaceC0039c;
import p095e5.AbstractC7848c;
import p117g5.AbstractC8053a;
import p117g5.InterfaceC8055c;
import p263u5.AbstractC9695n;

/* renamed from: m5.j */
/* loaded from: classes4.dex */
public final class C8974j extends AbstractC7848c {

    /* renamed from: k */
    public List f15077k;

    /* renamed from: l */
    public ArrayList f15078l = new ArrayList();

    /* renamed from: m */
    public ArrayList f15079m = new ArrayList();

    @Override // p095e5.AbstractC7848c
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public void mo12304w(EzyMatrix.Matrix info) {
        Intrinsics.checkNotNullParameter(info, "info");
        List list = this.f15077k;
        if (list != null) {
            if (Intrinsics.areEqual(info, CollectionsKt.first(list))) {
                InterfaceC0039c interfaceC0039cM12310b = m12310b();
                if (interfaceC0039cM12310b != null) {
                    interfaceC0039cM12310b.mo218u(this.f15079m);
                    return;
                }
                return;
            }
            InterfaceC0039c interfaceC0039cM12310b2 = m12310b();
            if (interfaceC0039cM12310b2 != null) {
                interfaceC0039cM12310b2.mo206i(this.f15079m, AbstractC9695n.m16202d(info));
            }
        }
    }

    @Override // p095e5.AbstractC7848c
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public boolean mo12306y(EzyMatrix.Matrix info, long j9) {
        Intrinsics.checkNotNullParameter(info, "info");
        return info.getEventTime() - m12303v() <= j9;
    }

    /* renamed from: D */
    public final void m14341D(List graphIdList, EzySource.MatrixSource.MatrixInfo info, long j9) {
        InterfaceC8055c interfaceC8055cMo210m;
        Intrinsics.checkNotNullParameter(graphIdList, "graphIdList");
        Intrinsics.checkNotNullParameter(info, "info");
        this.f15078l.clear();
        this.f15078l.addAll(graphIdList);
        ArrayList arrayList = this.f15078l;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            EzyCommand.CommandSource.CommandInfo.GraphData graphData = (EzyCommand.CommandSource.CommandInfo.GraphData) obj;
            InterfaceC0039c interfaceC0039cM12310b = m12310b();
            if (interfaceC0039cM12310b != null && (interfaceC8055cMo210m = interfaceC0039cM12310b.mo210m()) != null) {
                String strM8381G = graphData.m8381G();
                Intrinsics.checkNotNullExpressionValue(strM8381G, "it.graphId");
                AbstractC8053a abstractC8053aMo12801m = interfaceC8055cMo210m.mo12801m(strM8381G);
                if (abstractC8053aMo12801m != null) {
                    this.f15079m.add(abstractC8053aMo12801m);
                }
            }
        }
        List matrixList = info.getMatrixList();
        Intrinsics.checkNotNullExpressionValue(matrixList, "info.matrixList");
        if (matrixList.isEmpty()) {
            return;
        }
        this.f15077k = info.getMatrixList();
        m12302A(info.getMatrixList().listIterator());
        List matrixList2 = info.getMatrixList();
        Intrinsics.checkNotNullExpressionValue(matrixList2, "info.matrixList");
        m12305x(((EzyMatrix.Matrix) CollectionsKt.first(matrixList2)).getEventTime());
        m12307z(j9);
    }
}
