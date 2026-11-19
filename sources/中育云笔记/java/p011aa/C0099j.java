package p011aa;

import ba.AbstractC5179a;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyHeader;
import com.zykj.board.EzyPageSnapshot;
import ga.InterfaceC9284d;
import kotlin.jvm.internal.AbstractC9979u;
import na.AbstractC10344g;
import na.C10349l;
import p377v9.InterfaceC11552c;
import p437z9.AbstractC12031e;

/* renamed from: aa.j */
/* loaded from: classes5.dex */
public final class C0099j {

    /* renamed from: a */
    public final InterfaceC9284d f107a;

    /* renamed from: b */
    public final InterfaceC11552c f108b;

    public C0099j(InterfaceC9284d sourceLoader, InterfaceC11552c graphControl) {
        AbstractC9979u.m20294g(sourceLoader, "sourceLoader");
        AbstractC9979u.m20294g(graphControl, "graphControl");
        this.f107a = sourceLoader;
        this.f108b = graphControl;
    }

    /* renamed from: a */
    public AbstractC12031e m269a(EzyCommand.CommandSource.CommandInfo.REBUILD data, long j10) {
        AbstractC9979u.m20294g(data, "data");
        m270b(data);
        return null;
    }

    /* renamed from: b */
    public void m270b(EzyCommand.CommandSource.CommandInfo.REBUILD data) {
        AbstractC9979u.m20294g(data, "data");
        C10349l c10349l = C10349l.f24656a;
        InterfaceC9284d interfaceC9284d = this.f107a;
        EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshotM15139n = data.m15139n();
        AbstractC9979u.m20293f(graphSnapshotM15139n, "data.snapshot");
        AbstractC5179a abstractC5179aM21648a = c10349l.m21648a(interfaceC9284d, graphSnapshotM15139n);
        if (abstractC5179aM21648a != null) {
            this.f108b.mo25419E(abstractC5179aM21648a);
            this.f108b.mo25444d(data.getBackgroundColor());
            InterfaceC11552c interfaceC11552c = this.f108b;
            EzyHeader.BackgroundLineConfig backgroundLineConfigM15137g = data.m15137g();
            AbstractC9979u.m20293f(backgroundLineConfigM15137g, "data.backgroundLineConfig");
            interfaceC11552c.mo25459s(AbstractC10344g.m21634c(backgroundLineConfigM15137g));
            this.f108b.mo25447g();
        }
    }
}
