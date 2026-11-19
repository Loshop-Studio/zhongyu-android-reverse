package p199p4;

import com.zykj.board.EzyCommand;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p142k4.InterfaceC7880c;
import p188o4.AbstractC8704e;
import p210q4.AbstractC8886a;
import p210q4.InterfaceC8888c;
import p265v4.InterfaceC9668d;

/* renamed from: p4.i */
/* loaded from: classes4.dex */
public final class C8831i {

    /* renamed from: a */
    public final InterfaceC9668d f15032a;

    /* renamed from: b */
    public final InterfaceC7880c f15033b;

    public C8831i(InterfaceC9668d sourceLoader, InterfaceC7880c graphControl) {
        Intrinsics.checkNotNullParameter(sourceLoader, "sourceLoader");
        Intrinsics.checkNotNullParameter(graphControl, "graphControl");
        this.f15032a = sourceLoader;
        this.f15033b = graphControl;
    }

    /* renamed from: a */
    public AbstractC8704e m14798a(EzyCommand.CommandSource.CommandInfo.GraphRemove data, long j10) {
        Intrinsics.checkNotNullParameter(data, "data");
        m14799b(data);
        return null;
    }

    /* renamed from: b */
    public void m14799b(EzyCommand.CommandSource.CommandInfo.GraphRemove data) {
        Intrinsics.checkNotNullParameter(data, "data");
        ArrayList arrayList = new ArrayList();
        List<EzyCommand.CommandSource.CommandInfo.GraphData> listM7367q = data.m7367q();
        Intrinsics.checkNotNullExpressionValue(listM7367q, "data.graphDataList");
        for (EzyCommand.CommandSource.CommandInfo.GraphData graphData : listM7367q) {
            InterfaceC8888c interfaceC8888cMo13449n = this.f15033b.mo13449n();
            if (interfaceC8888cMo13449n != null) {
                String strM7263D = graphData.m7263D();
                Intrinsics.checkNotNullExpressionValue(strM7263D, "it.graphId");
                AbstractC8886a abstractC8886aMo15001n = interfaceC8888cMo13449n.mo15001n(strM7263D);
                if (abstractC8886aMo15001n != null) {
                    arrayList.add(abstractC8886aMo15001n);
                }
            }
        }
        this.f15033b.mo13452q(arrayList);
    }
}
