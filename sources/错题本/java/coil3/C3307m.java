package coil3;

import coil3.disk.AbstractC3293k;
import coil3.disk.InterfaceC3283a;
import coil3.network.C3317i;
import coil3.network.okhttp.internal.C3328c;
import coil3.util.AbstractC3346j;
import com.zykj.view.board.play.C5353b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5832m;
import p152r6.InterfaceC6469a;

/* renamed from: coil3.m */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3307m implements InterfaceC6469a {

    /* renamed from: a */
    public final /* synthetic */ int f1998a;

    public /* synthetic */ C3307m(int i) {
        this.f1998a = i;
    }

    @Override // p152r6.InterfaceC6469a
    public final Object invoke() {
        switch (this.f1998a) {
            case 0:
                return (InterfaceC3283a) AbstractC3293k.f1975a.getValue();
            case 1:
                List listM5244x0 = AbstractC5805t.m5244x0((List) AbstractC3346j.f2080a.getValue(), new C3335t(0));
                ArrayList arrayList = new ArrayList();
                int size = listM5244x0.size();
                for (int i = 0; i < size; i++) {
                    AbstractC5830k.m5328e((C3328c) listM5244x0.get(i), "null cannot be cast to non-null type coil3.util.FetcherServiceLoaderTarget<kotlin.Any>");
                    arrayList.add(new Pair(new C3317i(new C5353b(24)), AbstractC5832m.m5340a(C3351x.class)));
                }
                return arrayList;
            default:
                List listM5244x02 = AbstractC5805t.m5244x0((List) AbstractC3346j.f2081b.getValue(), new C3335t(1));
                ArrayList arrayList2 = new ArrayList();
                if (listM5244x02.size() <= 0) {
                    return arrayList2;
                }
                listM5244x02.get(0).getClass();
                throw new ClassCastException();
        }
    }
}
