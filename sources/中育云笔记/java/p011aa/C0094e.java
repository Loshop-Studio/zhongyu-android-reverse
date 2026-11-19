package p011aa;

import com.zykj.board.EzyCommand;
import com.zykj.board.EzySource;
import ga.InterfaceC9284d;
import kotlin.jvm.internal.AbstractC9979u;
import p178ha.C9512i;
import p362u9.C11373a;
import p377v9.InterfaceC11552c;
import p437z9.AbstractC12031e;

/* renamed from: aa.e */
/* loaded from: classes5.dex */
public final class C0094e {

    /* renamed from: a */
    public final InterfaceC9284d f95a;

    /* renamed from: b */
    public final C11373a f96b;

    /* renamed from: c */
    public final InterfaceC11552c f97c;

    public C0094e(InterfaceC9284d sourceLoader, C11373a matrixAdapter, InterfaceC11552c graphControl) {
        AbstractC9979u.m20294g(sourceLoader, "sourceLoader");
        AbstractC9979u.m20294g(matrixAdapter, "matrixAdapter");
        AbstractC9979u.m20294g(graphControl, "graphControl");
        this.f95a = sourceLoader;
        this.f96b = matrixAdapter;
        this.f97c = graphControl;
    }

    /* renamed from: a */
    public AbstractC12031e m259a(EzyCommand.CommandSource.CommandInfo.CursorMove data, long j10) {
        AbstractC9979u.m20294g(data, "data");
        InterfaceC9284d interfaceC9284d = this.f95a;
        String strM14884g = data.m14884g();
        AbstractC9979u.m20293f(strM14884g, "data.sourceFileName");
        EzySource.TouchSource.TouchInfo touchInfoMo18289a = interfaceC9284d.mo18289a(strM14884g, data.m14885k());
        if (touchInfoMo18289a == null) {
            return null;
        }
        C9512i c9512i = new C9512i();
        c9512i.m26652n(this.f97c);
        c9512i.m26656r(this.f95a);
        c9512i.m26653o(this.f96b);
        c9512i.m18768D(touchInfoMo18289a, j10);
        return c9512i;
    }

    /* renamed from: b */
    public void m260b(EzyCommand.CommandSource.CommandInfo.CursorMove data) {
        AbstractC9979u.m20294g(data, "data");
        this.f97c.mo25445e();
    }
}
