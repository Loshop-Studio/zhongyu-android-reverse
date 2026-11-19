package p011aa;

import ba.AbstractC5179a;
import ba.InterfaceC5181c;
import com.zykj.board.EzyCommand;
import ga.InterfaceC9284d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p377v9.InterfaceC11552c;
import p437z9.AbstractC12031e;

/* renamed from: aa.i */
/* loaded from: classes5.dex */
public final class C0098i {

    /* renamed from: a */
    public final InterfaceC9284d f105a;

    /* renamed from: b */
    public final InterfaceC11552c f106b;

    public C0098i(InterfaceC9284d sourceLoader, InterfaceC11552c graphControl) {
        AbstractC9979u.m20294g(sourceLoader, "sourceLoader");
        AbstractC9979u.m20294g(graphControl, "graphControl");
        this.f105a = sourceLoader;
        this.f106b = graphControl;
    }

    /* renamed from: a */
    public AbstractC12031e m267a(EzyCommand.CommandSource.CommandInfo.GraphRemove data, long j10) {
        AbstractC9979u.m20294g(data, "data");
        m268b(data);
        return null;
    }

    /* renamed from: b */
    public void m268b(EzyCommand.CommandSource.CommandInfo.GraphRemove data) {
        AbstractC9979u.m20294g(data, "data");
        ArrayList arrayList = new ArrayList();
        List<EzyCommand.CommandSource.CommandInfo.GraphData> listM15103k = data.m15103k();
        AbstractC9979u.m20293f(listM15103k, "data.graphDataList");
        for (EzyCommand.CommandSource.CommandInfo.GraphData graphData : listM15103k) {
            InterfaceC5181c interfaceC5181cMo25454n = this.f106b.mo25454n();
            if (interfaceC5181cMo25454n != null) {
                String strM14998D = graphData.m14998D();
                AbstractC9979u.m20293f(strM14998D, "it.graphId");
                AbstractC5179a abstractC5179aMo2723n = interfaceC5181cMo25454n.mo2723n(strM14998D);
                if (abstractC5179aMo2723n != null) {
                    arrayList.add(abstractC5179aMo2723n);
                }
            }
        }
        this.f106b.mo25456p(arrayList);
    }
}
