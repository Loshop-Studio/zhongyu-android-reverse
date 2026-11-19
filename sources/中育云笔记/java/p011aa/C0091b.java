package p011aa;

import android.graphics.Matrix;
import com.blankj.utilcode.util.LogUtils;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzySource;
import ga.InterfaceC9284d;
import kotlin.jvm.internal.AbstractC9979u;
import na.AbstractC10351n;
import p178ha.C9510g;
import p362u9.C11373a;
import p377v9.InterfaceC11552c;
import p437z9.AbstractC12031e;

/* renamed from: aa.b */
/* loaded from: classes5.dex */
public final class C0091b {

    /* renamed from: a */
    public final InterfaceC9284d f79a;

    /* renamed from: b */
    public final C11373a f80b;

    /* renamed from: c */
    public final InterfaceC11552c f81c;

    public C0091b(InterfaceC9284d sourceLoader, C11373a matrixAdapter, InterfaceC11552c graphControl) {
        AbstractC9979u.m20294g(sourceLoader, "sourceLoader");
        AbstractC9979u.m20294g(matrixAdapter, "matrixAdapter");
        AbstractC9979u.m20294g(graphControl, "graphControl");
        this.f79a = sourceLoader;
        this.f80b = matrixAdapter;
        this.f81c = graphControl;
    }

    /* renamed from: a */
    public AbstractC12031e m253a(EzyCommand.CommandSource.CommandInfo.CameraMatrix data, long j10) {
        AbstractC9979u.m20294g(data, "data");
        InterfaceC9284d interfaceC9284d = this.f79a;
        String strM14792p = data.m14792p();
        AbstractC9979u.m20293f(strM14792p, "data.sourceFileName");
        EzySource.MatrixSource.MatrixInfo matrixInfoMo18290b = interfaceC9284d.mo18290b(strM14792p, data.m14793r());
        if (matrixInfoMo18290b == null) {
            return null;
        }
        C9510g c9510g = new C9510g();
        c9510g.m26652n(this.f81c);
        c9510g.m26656r(this.f79a);
        c9510g.m26653o(this.f80b);
        c9510g.m18750D(matrixInfoMo18290b, j10);
        return c9510g;
    }

    /* renamed from: b */
    public void m254b(EzyCommand.CommandSource.CommandInfo.CameraMatrix data) {
        AbstractC9979u.m20294g(data, "data");
        EzyMatrix.Matrix matrixM14790n = data.m14790n();
        AbstractC9979u.m20293f(matrixM14790n, "data.lastMatrix");
        Matrix matrixM21665g = AbstractC10351n.m21665g(matrixM14790n);
        if (AbstractC10351n.m21661c(matrixM21665g)) {
            this.f80b.m25319j(matrixM21665g);
            this.f81c.mo25447g();
            return;
        }
        LogUtils.m3887e("CameraMatrixExecute -> execute，拦截非法相机矩阵，source=" + data.m14792p() + "，sourceId=" + data.m14793r());
        this.f80b.m25318i();
        this.f81c.mo25447g();
    }
}
