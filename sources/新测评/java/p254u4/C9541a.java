package p254u4;

import com.zykj.board.EzyCommand;
import com.zykj.board.EzyRectF;
import kotlin.jvm.internal.Intrinsics;
import p077e5.AbstractC7351l;
import p210q4.AbstractC8886a;
import p243t4.C9382a;
import p265v4.InterfaceC9668d;

/* renamed from: u4.a */
/* loaded from: classes4.dex */
public final class C9541a implements InterfaceC9544d {
    @Override // p254u4.InterfaceC9544d
    /* renamed from: a */
    public AbstractC8886a mo15976a(EzyCommand.CommandSource.CommandInfo.GraphData graphData, InterfaceC9668d sourceLoad) {
        Intrinsics.checkNotNullParameter(graphData, "graphData");
        Intrinsics.checkNotNullParameter(sourceLoad, "sourceLoad");
        String strM7263D = graphData.m7263D();
        Intrinsics.checkNotNullExpressionValue(strM7263D, "graphData.graphId");
        EzyRectF.RectF rectFM7264E = graphData.m7264E();
        Intrinsics.checkNotNullExpressionValue(rectFM7264E, "graphData.outRect");
        return new C9382a(strM7263D, AbstractC7351l.m11775f(rectFM7264E), sourceLoad, graphData.m7266G(), Integer.valueOf(graphData.m7267H()));
    }
}
