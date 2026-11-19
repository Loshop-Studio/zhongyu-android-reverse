package p178ha;

import android.graphics.Matrix;
import com.blankj.utilcode.util.LogUtils;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzySource;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import na.AbstractC10351n;
import p325rc.AbstractC10947g0;
import p377v9.InterfaceC11552c;
import p437z9.AbstractC12029c;

/* renamed from: ha.g */
/* loaded from: classes5.dex */
public final class C9510g extends AbstractC12029c {

    /* renamed from: m */
    public List f22012m;

    @Override // p437z9.AbstractC12029c
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public void mo18751w(EzyMatrix.Matrix info) {
        AbstractC9979u.m20294g(info, "info");
        List list = this.f22012m;
        if (list != null) {
            Matrix matrixM21665g = AbstractC10351n.m21665g(info);
            if (!AbstractC10351n.m21661c(matrixM21665g)) {
                LogUtils.m3887e("CameraMatrixThread -> handle，拦截非法播放相机矩阵，eventTime=" + info.getEventTime());
                return;
            }
            if (AbstractC9979u.m20289b(info, AbstractC10947g0.m23956y0(list))) {
                InterfaceC11552c interfaceC11552cM26643b = m26643b();
                if (interfaceC11552cM26643b != null) {
                    interfaceC11552cM26643b.mo25418D(matrixM21665g);
                    return;
                }
                return;
            }
            if (AbstractC9979u.m20289b(info, AbstractC10947g0.m23944m0(list))) {
                InterfaceC11552c interfaceC11552cM26643b2 = m26643b();
                if (interfaceC11552cM26643b2 != null) {
                    interfaceC11552cM26643b2.mo25455o();
                    return;
                }
                return;
            }
            InterfaceC11552c interfaceC11552cM26643b3 = m26643b();
            if (interfaceC11552cM26643b3 != null) {
                interfaceC11552cM26643b3.mo25458r(matrixM21665g);
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
    public final void m18750D(EzySource.MatrixSource.MatrixInfo info, long j10) {
        AbstractC9979u.m20294g(info, "info");
        List matrixList = info.getMatrixList();
        AbstractC9979u.m20293f(matrixList, "info.matrixList");
        if (matrixList.isEmpty()) {
            return;
        }
        this.f22012m = info.getMatrixList();
        m26638A(info.getMatrixList().listIterator());
        List matrixList2 = info.getMatrixList();
        AbstractC9979u.m20293f(matrixList2, "info.matrixList");
        m26640x(((EzyMatrix.Matrix) AbstractC10947g0.m23944m0(matrixList2)).getEventTime());
        m26641z(j10);
    }
}
