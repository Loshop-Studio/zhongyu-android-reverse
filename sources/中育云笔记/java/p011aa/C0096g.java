package p011aa;

import ba.AbstractC5179a;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.blackboard.core.graphBuilder.GraphBuildFactory;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzySource;
import ga.InterfaceC9284d;
import kotlin.jvm.internal.AbstractC9979u;
import p178ha.C9522s;
import p310qd.AbstractC10793c0;
import p362u9.C11373a;
import p377v9.InterfaceC11552c;
import p437z9.AbstractC12031e;

/* renamed from: aa.g */
/* loaded from: classes5.dex */
public final class C0096g {

    /* renamed from: a */
    public final InterfaceC9284d f100a;

    /* renamed from: b */
    public final C11373a f101b;

    /* renamed from: c */
    public final InterfaceC11552c f102c;

    public C0096g(InterfaceC9284d sourceLoader, C11373a matrixAdapter, InterfaceC11552c graphControl) {
        AbstractC9979u.m20294g(sourceLoader, "sourceLoader");
        AbstractC9979u.m20294g(matrixAdapter, "matrixAdapter");
        AbstractC9979u.m20294g(graphControl, "graphControl");
        this.f100a = sourceLoader;
        this.f101b = matrixAdapter;
        this.f102c = graphControl;
    }

    /* renamed from: a */
    public AbstractC12031e m263a(EzyCommand.CommandSource.CommandInfo.GraphData data, long j10) {
        AbstractC9979u.m20294g(data, "data");
        InterfaceC9284d interfaceC9284d = this.f100a;
        String strM15001G = data.m15001G();
        AbstractC9979u.m20293f(strM15001G, "data.sourceFileName");
        EzySource.TouchSource.TouchInfo touchInfoMo18289a = interfaceC9284d.mo18289a(strM15001G, data.m15002H());
        if (touchInfoMo18289a == null) {
            return null;
        }
        C9522s c9522s = new C9522s();
        c9522s.m26652n(this.f102c);
        c9522s.m26656r(this.f100a);
        c9522s.m26653o(this.f101b);
        c9522s.m18774D(touchInfoMo18289a, j10);
        return c9522s;
    }

    /* renamed from: b */
    public void m264b(EzyCommand.CommandSource.CommandInfo.GraphData data) {
        AbstractC9979u.m20294g(data, "data");
        AbstractC5179a abstractC5179aMo14497c = GraphBuildFactory.INSTANCE.mo14497c(data, this.f100a);
        if (abstractC5179aMo14497c != null) {
            if (abstractC5179aMo14497c instanceof ImageGraph) {
                String strM15007z = data.m15007z();
                AbstractC9979u.m20293f(strM15007z, "data.extras");
                if (AbstractC10793c0.m23108U(strM15007z, "imageBackground", false, 2, null)) {
                    this.f102c.mo25441a((ImageGraph) abstractC5179aMo14497c);
                    return;
                }
            }
            this.f102c.mo25446f(data.m15000F(), abstractC5179aMo14497c);
        }
    }
}
