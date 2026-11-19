package p011aa;

import com.zykj.board.EzyCommand;
import com.zykj.board.EzyHeader;
import ga.InterfaceC9284d;
import kotlin.jvm.internal.AbstractC9979u;
import na.AbstractC10344g;
import p377v9.InterfaceC11552c;
import p437z9.AbstractC12031e;

/* renamed from: aa.d */
/* loaded from: classes5.dex */
public final class C0093d {

    /* renamed from: a */
    public final InterfaceC9284d f93a;

    /* renamed from: b */
    public final InterfaceC11552c f94b;

    public C0093d(InterfaceC9284d sourceLoader, InterfaceC11552c graphControl) {
        AbstractC9979u.m20294g(sourceLoader, "sourceLoader");
        AbstractC9979u.m20294g(graphControl, "graphControl");
        this.f93a = sourceLoader;
        this.f94b = graphControl;
    }

    /* renamed from: a */
    public AbstractC12031e m257a(EzyCommand.CommandSource.CommandInfo.Config data, long j10) {
        AbstractC9979u.m20294g(data, "data");
        m258b(data);
        return null;
    }

    /* renamed from: b */
    public void m258b(EzyCommand.CommandSource.CommandInfo.Config data) {
        AbstractC9979u.m20294g(data, "data");
        this.f94b.mo25444d(data.m14839n());
        InterfaceC11552c interfaceC11552c = this.f94b;
        EzyHeader.BackgroundLineConfig backgroundLineConfigM14840o = data.m14840o();
        AbstractC9979u.m20293f(backgroundLineConfigM14840o, "data.lastBackgroundLineConfig");
        interfaceC11552c.mo25459s(AbstractC10344g.m21634c(backgroundLineConfigM14840o));
        this.f94b.mo25447g();
    }
}
