package p157k5;

import android.graphics.RectF;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyRectF;
import kotlin.jvm.internal.Intrinsics;
import p117g5.AbstractC8053a;
import p169l5.InterfaceC8891e;
import p263u5.AbstractC9694m;

/* renamed from: k5.f */
/* loaded from: classes4.dex */
public final class C8278f implements InterfaceC8276d {
    @Override // p157k5.InterfaceC8276d
    /* renamed from: a */
    public AbstractC8053a mo13375a(EzyCommand.CommandSource.CommandInfo.GraphData graphData, InterfaceC8891e sourceLoad) {
        Intrinsics.checkNotNullParameter(graphData, "graphData");
        Intrinsics.checkNotNullParameter(sourceLoad, "sourceLoad");
        String strM8381G = graphData.m8381G();
        Intrinsics.checkNotNullExpressionValue(strM8381G, "graphData.graphId");
        EzyRectF.RectF rectFM8382H = graphData.m8382H();
        Intrinsics.checkNotNullExpressionValue(rectFM8382H, "graphData.outRect");
        RectF rectFM16198f = AbstractC9694m.m16198f(rectFM8382H);
        String strM8384J = graphData.m8384J();
        Intrinsics.checkNotNullExpressionValue(strM8384J, "graphData.sourceFileName");
        return new ImageGraph(strM8381G, rectFM16198f, sourceLoad, strM8384J, graphData.m8385K());
    }
}
