package p275w4;

import com.zykj.board.EzyMatrix;
import com.zykj.board.EzySource;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p077e5.AbstractC7352m;
import p142k4.InterfaceC7880c;
import p188o4.AbstractC8702c;

/* renamed from: w4.g */
/* loaded from: classes4.dex */
public final class C9742g extends AbstractC8702c {

    /* renamed from: k */
    public List f17140k;

    @Override // p188o4.AbstractC8702c
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public void mo14313w(EzyMatrix.Matrix info) {
        Intrinsics.checkNotNullParameter(info, "info");
        List list = this.f17140k;
        if (list != null) {
            if (Intrinsics.areEqual(info, CollectionsKt.last(list))) {
                InterfaceC7880c interfaceC7880cM14319b = m14319b();
                if (interfaceC7880cM14319b != null) {
                    interfaceC7880cM14319b.mo13417D(AbstractC7352m.m11779d(info));
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(info, CollectionsKt.first(list))) {
                InterfaceC7880c interfaceC7880cM14319b2 = m14319b();
                if (interfaceC7880cM14319b2 != null) {
                    interfaceC7880cM14319b2.mo13450o();
                    return;
                }
                return;
            }
            InterfaceC7880c interfaceC7880cM14319b3 = m14319b();
            if (interfaceC7880cM14319b3 != null) {
                interfaceC7880cM14319b3.mo13454s(AbstractC7352m.m11779d(info));
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
    public final void m16330D(EzySource.MatrixSource.MatrixInfo info, long j10) {
        Intrinsics.checkNotNullParameter(info, "info");
        List matrixList = info.getMatrixList();
        Intrinsics.checkNotNullExpressionValue(matrixList, "info.matrixList");
        if (matrixList.isEmpty()) {
            return;
        }
        this.f17140k = info.getMatrixList();
        m14311A(info.getMatrixList().listIterator());
        List matrixList2 = info.getMatrixList();
        Intrinsics.checkNotNullExpressionValue(matrixList2, "info.matrixList");
        m14314x(((EzyMatrix.Matrix) CollectionsKt.first(matrixList2)).getEventTime());
        m14316z(j10);
    }
}
