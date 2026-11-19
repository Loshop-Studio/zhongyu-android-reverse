package p106f5;

import com.zykj.board.EzyCommand;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p006a5.InterfaceC0039c;
import p095e5.AbstractC7850e;
import p117g5.AbstractC8053a;
import p117g5.InterfaceC8055c;
import p169l5.InterfaceC8891e;

/* renamed from: f5.i */
/* loaded from: classes4.dex */
public final class C7931i {

    /* renamed from: a */
    public final InterfaceC8891e f13380a;

    /* renamed from: b */
    public final InterfaceC0039c f13381b;

    public C7931i(InterfaceC8891e sourceLoader, InterfaceC0039c graphControl) {
        Intrinsics.checkNotNullParameter(sourceLoader, "sourceLoader");
        Intrinsics.checkNotNullParameter(graphControl, "graphControl");
        this.f13380a = sourceLoader;
        this.f13381b = graphControl;
    }

    /* renamed from: a */
    public AbstractC7850e m12489a(EzyCommand.CommandSource.CommandInfo.GraphRemove data, long j9) {
        Intrinsics.checkNotNullParameter(data, "data");
        m12490b(data);
        return null;
    }

    /* renamed from: b */
    public void m12490b(EzyCommand.CommandSource.CommandInfo.GraphRemove data) {
        Intrinsics.checkNotNullParameter(data, "data");
        ArrayList arrayList = new ArrayList();
        List<EzyCommand.CommandSource.CommandInfo.GraphData> listM8484t = data.m8484t();
        Intrinsics.checkNotNullExpressionValue(listM8484t, "data.graphDataList");
        for (EzyCommand.CommandSource.CommandInfo.GraphData graphData : listM8484t) {
            InterfaceC8055c interfaceC8055cMo210m = this.f13381b.mo210m();
            if (interfaceC8055cMo210m != null) {
                String strM8381G = graphData.m8381G();
                Intrinsics.checkNotNullExpressionValue(strM8381G, "it.graphId");
                AbstractC8053a abstractC8053aMo12801m = interfaceC8055cMo210m.mo12801m(strM8381G);
                if (abstractC8053aMo12801m != null) {
                    arrayList.add(abstractC8053aMo12801m);
                }
            }
        }
        this.f13381b.mo212o(arrayList);
    }
}
