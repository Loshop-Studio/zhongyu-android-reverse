package p011aa;

import com.zykj.board.EzyCommand;
import com.zykj.board.EzyMatrix;
import kotlin.jvm.internal.AbstractC9979u;
import na.AbstractC10351n;
import p362u9.C11373a;
import p377v9.InterfaceC11552c;
import p437z9.AbstractC12031e;

/* renamed from: aa.a */
/* loaded from: classes5.dex */
public final class C0090a {

    /* renamed from: a */
    public final C11373a f77a;

    /* renamed from: b */
    public final InterfaceC11552c f78b;

    public C0090a(C11373a matrixAdapter, InterfaceC11552c graphControl) {
        AbstractC9979u.m20294g(matrixAdapter, "matrixAdapter");
        AbstractC9979u.m20294g(graphControl, "graphControl");
        this.f77a = matrixAdapter;
        this.f78b = graphControl;
    }

    /* renamed from: a */
    public AbstractC12031e m251a(EzyCommand.CommandSource.CommandInfo.Camera data, long j10) {
        AbstractC9979u.m20294g(data, "data");
        m252b(data);
        return null;
    }

    /* renamed from: b */
    public void m252b(EzyCommand.CommandSource.CommandInfo.Camera data) {
        AbstractC9979u.m20294g(data, "data");
        C11373a c11373a = this.f77a;
        EzyMatrix.Matrix matrixM14744g = data.m14744g();
        AbstractC9979u.m20293f(matrixM14744g, "data.lastMatrix");
        c11373a.m25319j(AbstractC10351n.m21665g(matrixM14744g));
        this.f78b.mo25447g();
    }
}
