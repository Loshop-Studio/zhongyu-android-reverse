package p157k5;

import com.zykj.board.EzyCommand;
import com.zykj.board.EzyRectF;
import kotlin.jvm.internal.Intrinsics;
import p117g5.AbstractC8053a;
import p147j5.C8214a;
import p169l5.InterfaceC8891e;
import p263u5.AbstractC9694m;

/* renamed from: k5.a */
/* loaded from: classes4.dex */
public final class C8273a implements InterfaceC8276d {
    @Override // p157k5.InterfaceC8276d
    /* renamed from: a */
    public AbstractC8053a mo13375a(EzyCommand.CommandSource.CommandInfo.GraphData graphData, InterfaceC8891e sourceLoad) {
        Intrinsics.checkNotNullParameter(graphData, "graphData");
        Intrinsics.checkNotNullParameter(sourceLoad, "sourceLoad");
        String strM8381G = graphData.m8381G();
        Intrinsics.checkNotNullExpressionValue(strM8381G, "graphData.graphId");
        EzyRectF.RectF rectFM8382H = graphData.m8382H();
        Intrinsics.checkNotNullExpressionValue(rectFM8382H, "graphData.outRect");
        return new C8214a(strM8381G, AbstractC9694m.m16198f(rectFM8382H), sourceLoad, graphData.m8384J(), Integer.valueOf(graphData.m8385K()));
    }
}
