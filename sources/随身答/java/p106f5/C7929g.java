package p106f5;

import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.blackboard.core.graphBuilder.GraphBuildFactory;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzySource;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p006a5.InterfaceC0039c;
import p095e5.AbstractC7850e;
import p117g5.AbstractC8053a;
import p169l5.InterfaceC8891e;
import p179m5.C8983s;
import p312z4.C9998a;

/* renamed from: f5.g */
/* loaded from: classes4.dex */
public final class C7929g {

    /* renamed from: a */
    public final InterfaceC8891e f13375a;

    /* renamed from: b */
    public final C9998a f13376b;

    /* renamed from: c */
    public final InterfaceC0039c f13377c;

    public C7929g(InterfaceC8891e sourceLoader, C9998a matrixAdapter, InterfaceC0039c graphControl) {
        Intrinsics.checkNotNullParameter(sourceLoader, "sourceLoader");
        Intrinsics.checkNotNullParameter(matrixAdapter, "matrixAdapter");
        Intrinsics.checkNotNullParameter(graphControl, "graphControl");
        this.f13375a = sourceLoader;
        this.f13376b = matrixAdapter;
        this.f13377c = graphControl;
    }

    /* renamed from: a */
    public AbstractC7850e m12485a(EzyCommand.CommandSource.CommandInfo.GraphData data, long j9) {
        Intrinsics.checkNotNullParameter(data, "data");
        InterfaceC8891e interfaceC8891e = this.f13375a;
        String strM8384J = data.m8384J();
        Intrinsics.checkNotNullExpressionValue(strM8384J, "data.sourceFileName");
        EzySource.TouchSource.TouchInfo touchInfoMo13811a = interfaceC8891e.mo13811a(strM8384J, data.m8385K());
        if (touchInfoMo13811a == null) {
            return null;
        }
        C8983s c8983s = new C8983s();
        c8983s.m12319n(this.f13377c);
        c8983s.m12323r(this.f13375a);
        c8983s.m12320o(this.f13376b);
        c8983s.m14344D(touchInfoMo13811a, j9);
        return c8983s;
    }

    /* renamed from: b */
    public void m12486b(EzyCommand.CommandSource.CommandInfo.GraphData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        AbstractC8053a abstractC8053aMo7873c = GraphBuildFactory.INSTANCE.mo7873c(data, this.f13375a);
        if (abstractC8053aMo7873c != null) {
            if (abstractC8053aMo7873c instanceof ImageGraph) {
                String strM8378D = data.m8378D();
                Intrinsics.checkNotNullExpressionValue(strM8378D, "data.extras");
                if (StringsKt.contains$default((CharSequence) strM8378D, (CharSequence) "imageBackground", false, 2, (Object) null)) {
                    this.f13377c.mo198a((ImageGraph) abstractC8053aMo7873c);
                    return;
                }
            }
            this.f13377c.mo222y(data.m8383I(), abstractC8053aMo7873c);
        }
    }
}
