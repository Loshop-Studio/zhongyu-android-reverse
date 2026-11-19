package p149fa;

import ba.AbstractC5179a;
import ca.C5414d;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyRectF;
import ga.InterfaceC9284d;
import kotlin.jvm.internal.AbstractC9979u;
import na.AbstractC10350m;

/* renamed from: fa.h */
/* loaded from: classes5.dex */
public final class C9216h implements InterfaceC9212d {
    @Override // p149fa.InterfaceC9212d
    /* renamed from: a */
    public AbstractC5179a mo18118a(EzyCommand.CommandSource.CommandInfo.GraphData graphData, InterfaceC9284d sourceLoad) {
        AbstractC9979u.m20294g(graphData, "graphData");
        AbstractC9979u.m20294g(sourceLoad, "sourceLoad");
        String strM14998D = graphData.m14998D();
        AbstractC9979u.m20293f(strM14998D, "graphData.graphId");
        EzyRectF.RectF rectFM14999E = graphData.m14999E();
        AbstractC9979u.m20293f(rectFM14999E, "graphData.outRect");
        return new C5414d(strM14998D, AbstractC10350m.m21658f(rectFM14999E), sourceLoad, graphData.m15001G(), Integer.valueOf(graphData.m15002H()));
    }
}
