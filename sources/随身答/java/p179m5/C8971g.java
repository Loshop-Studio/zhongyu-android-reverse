package p179m5;

import com.zykj.board.EzyMatrix;
import com.zykj.board.EzySource;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p006a5.InterfaceC0039c;
import p095e5.AbstractC7848c;
import p263u5.AbstractC9695n;

/* renamed from: m5.g */
/* loaded from: classes4.dex */
public final class C8971g extends AbstractC7848c {

    /* renamed from: k */
    public List f15058k;

    @Override // p095e5.AbstractC7848c
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public void mo12304w(EzyMatrix.Matrix info) {
        Intrinsics.checkNotNullParameter(info, "info");
        List list = this.f15058k;
        if (list != null) {
            if (Intrinsics.areEqual(info, CollectionsKt.last(list))) {
                InterfaceC0039c interfaceC0039cM12310b = m12310b();
                if (interfaceC0039cM12310b != null) {
                    interfaceC0039cM12310b.mo177D(AbstractC9695n.m16202d(info));
                    return;
                }
                return;
            }
            if (Intrinsics.areEqual(info, CollectionsKt.first(list))) {
                InterfaceC0039c interfaceC0039cM12310b2 = m12310b();
                if (interfaceC0039cM12310b2 != null) {
                    interfaceC0039cM12310b2.mo211n();
                    return;
                }
                return;
            }
            InterfaceC0039c interfaceC0039cM12310b3 = m12310b();
            if (interfaceC0039cM12310b3 != null) {
                interfaceC0039cM12310b3.mo214q(AbstractC9695n.m16202d(info));
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
    public final void m14324D(EzySource.MatrixSource.MatrixInfo info, long j9) {
        Intrinsics.checkNotNullParameter(info, "info");
        List matrixList = info.getMatrixList();
        Intrinsics.checkNotNullExpressionValue(matrixList, "info.matrixList");
        if (matrixList.isEmpty()) {
            return;
        }
        this.f15058k = info.getMatrixList();
        m12302A(info.getMatrixList().listIterator());
        List matrixList2 = info.getMatrixList();
        Intrinsics.checkNotNullExpressionValue(matrixList2, "info.matrixList");
        m12305x(((EzyMatrix.Matrix) CollectionsKt.first(matrixList2)).getEventTime());
        m12307z(j9);
    }
}
