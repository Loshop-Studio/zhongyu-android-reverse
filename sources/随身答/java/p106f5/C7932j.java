package p106f5;

import com.zykj.board.EzyCommand;
import com.zykj.board.EzyHeader;
import com.zykj.board.EzyPageSnapshot;
import kotlin.jvm.internal.Intrinsics;
import p006a5.InterfaceC0039c;
import p095e5.AbstractC7850e;
import p117g5.AbstractC8053a;
import p169l5.InterfaceC8891e;
import p263u5.AbstractC9688g;
import p263u5.C9693l;

/* renamed from: f5.j */
/* loaded from: classes4.dex */
public final class C7932j {

    /* renamed from: a */
    public final InterfaceC8891e f13382a;

    /* renamed from: b */
    public final InterfaceC0039c f13383b;

    public C7932j(InterfaceC8891e sourceLoader, InterfaceC0039c graphControl) {
        Intrinsics.checkNotNullParameter(sourceLoader, "sourceLoader");
        Intrinsics.checkNotNullParameter(graphControl, "graphControl");
        this.f13382a = sourceLoader;
        this.f13383b = graphControl;
    }

    /* renamed from: a */
    public AbstractC7850e m12491a(EzyCommand.CommandSource.CommandInfo.REBUILD data, long j9) {
        Intrinsics.checkNotNullParameter(data, "data");
        m12492b(data);
        return null;
    }

    /* renamed from: b */
    public void m12492b(EzyCommand.CommandSource.CommandInfo.REBUILD data) {
        Intrinsics.checkNotNullParameter(data, "data");
        C9693l c9693l = C9693l.f17131a;
        InterfaceC8891e interfaceC8891e = this.f13382a;
        EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshotM8522v = data.m8522v();
        Intrinsics.checkNotNullExpressionValue(graphSnapshotM8522v, "data.snapshot");
        AbstractC8053a abstractC8053aM16188a = c9693l.m16188a(interfaceC8891e, graphSnapshotM8522v);
        if (abstractC8053aM16188a != null) {
            this.f13383b.mo221x(abstractC8053aM16188a);
            this.f13383b.mo200c(data.getBackgroundColor());
            InterfaceC0039c interfaceC0039c = this.f13383b;
            EzyHeader.BackgroundLineConfig backgroundLineConfigM8520q = data.m8520q();
            Intrinsics.checkNotNullExpressionValue(backgroundLineConfigM8520q, "data.backgroundLineConfig");
            interfaceC0039c.mo215r(AbstractC9688g.m16173c(backgroundLineConfigM8520q));
            this.f13383b.mo202e();
        }
    }
}
