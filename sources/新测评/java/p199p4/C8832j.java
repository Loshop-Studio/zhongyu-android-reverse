package p199p4;

import com.zykj.board.EzyCommand;
import com.zykj.board.EzyHeader;
import com.zykj.board.EzyPageSnapshot;
import kotlin.jvm.internal.Intrinsics;
import p077e5.AbstractC7345f;
import p077e5.C7350k;
import p142k4.InterfaceC7880c;
import p188o4.AbstractC8704e;
import p210q4.AbstractC8886a;
import p265v4.InterfaceC9668d;

/* renamed from: p4.j */
/* loaded from: classes4.dex */
public final class C8832j {

    /* renamed from: a */
    public final InterfaceC9668d f15034a;

    /* renamed from: b */
    public final InterfaceC7880c f15035b;

    public C8832j(InterfaceC9668d sourceLoader, InterfaceC7880c graphControl) {
        Intrinsics.checkNotNullParameter(sourceLoader, "sourceLoader");
        Intrinsics.checkNotNullParameter(graphControl, "graphControl");
        this.f15034a = sourceLoader;
        this.f15035b = graphControl;
    }

    /* renamed from: a */
    public AbstractC8704e m14800a(EzyCommand.CommandSource.CommandInfo.REBUILD data, long j10) {
        Intrinsics.checkNotNullParameter(data, "data");
        m14801b(data);
        return null;
    }

    /* renamed from: b */
    public void m14801b(EzyCommand.CommandSource.CommandInfo.REBUILD data) {
        Intrinsics.checkNotNullParameter(data, "data");
        C7350k c7350k = C7350k.f11918a;
        InterfaceC9668d interfaceC9668d = this.f15034a;
        EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshotM7404s = data.m7404s();
        Intrinsics.checkNotNullExpressionValue(graphSnapshotM7404s, "data.snapshot");
        AbstractC8886a abstractC8886aM11765a = c7350k.m11765a(interfaceC9668d, graphSnapshotM7404s);
        if (abstractC8886aM11765a != null) {
            this.f15035b.mo13451p(abstractC8886aM11765a);
            this.f15035b.mo13438c(data.getBackgroundColor());
            InterfaceC7880c interfaceC7880c = this.f15035b;
            EzyHeader.BackgroundLineConfig backgroundLineConfigM7402o = data.m7402o();
            Intrinsics.checkNotNullExpressionValue(backgroundLineConfigM7402o, "data.backgroundLineConfig");
            interfaceC7880c.mo13455t(AbstractC7345f.m11752c(backgroundLineConfigM7402o));
            this.f15035b.mo13440e();
        }
    }
}
