package p167t4;

import com.zykj.mistake.entity.req.SearchMistakeCollectionReq;
import com.zykj.mistake.feature.ask.C4534m;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC5785e0;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.AbstractC5832m;
import kotlin.jvm.internal.C5823d;
import kotlin.jvm.internal.C5833n;
import kotlin.jvm.internal.C5837r;
import kotlin.reflect.KVariance;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import p016b0.C3080k0;
import p125n7.AbstractC6227b;
import p125n7.C6226a;
import p125n7.C6232g;
import p125n7.C6240o;
import p133o7.AbstractC6281e;
import p133o7.AbstractC6283g;
import p137p4.C6390i;
import p207y6.C6795s;

/* renamed from: t4.i */
/* loaded from: classes3.dex */
public abstract class AbstractC6596i {

    /* renamed from: a */
    public static final C6240o f11012a;

    /* renamed from: b */
    public static final Map f11013b;

    /* renamed from: c */
    public static final Map f11014c;

    /* renamed from: d */
    public static final Map f11015d;

    static {
        C6226a from = AbstractC6227b.f9965d;
        AbstractC5830k.m5330g(from, "from");
        C6232g c6232g = from.f9966a;
        boolean z8 = c6232g.f9977c;
        String str = c6232g.f9978d;
        String str2 = c6232g.f9979e;
        ClassDiscriminatorMode classDiscriminatorMode = c6232g.f9981g;
        boolean z9 = c6232g.f9980f;
        AbstractC6281e module = from.f9967b;
        if (!AbstractC5830k.m5325b(str, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        C6232g c6232g2 = new C6232g(true, true, z8, str, str2, z9, classDiscriminatorMode);
        AbstractC5830k.m5330g(module, "module");
        C6240o c6240o = new C6240o(c6232g2, module);
        if (!module.equals(AbstractC6283g.f10039a)) {
            module.mo5873a(new C3080k0(c6232g2));
        }
        f11012a = c6240o;
        int i = C6795s.f11461c;
        C5837r c5837rM5341b = AbstractC5832m.m5341b(C6390i.class);
        KVariance kVariance = KVariance.INVARIANT;
        C6795s c6795s = new C6795s(kVariance, c5837rM5341b);
        C5833n c5833n = AbstractC5832m.f9223a;
        C5823d c5823dM5340a = AbstractC5832m.m5340a(List.class);
        List listSingletonList = Collections.singletonList(c6795s);
        c5833n.getClass();
        f11013b = AbstractC5785e0.m5150D(new Pair(new C5837r(c5823dM5340a, listSingletonList), new C6590c("List<MistakeTagUiState>", AbstractC5806u.m5264c(C6390i.Companion.serializer()))));
        f11014c = AbstractC5785e0.m5150D(new Pair(AbstractC5832m.m5341b(SearchMistakeCollectionReq.class), new C6590c("SearchMistakeCollectionReq", SearchMistakeCollectionReq.INSTANCE.serializer())));
        C6795s c6795s2 = new C6795s(kVariance, AbstractC5832m.m5341b(C4534m.class));
        C5823d c5823dM5340a2 = AbstractC5832m.m5340a(List.class);
        List listSingletonList2 = Collections.singletonList(c6795s2);
        c5833n.getClass();
        f11015d = AbstractC5785e0.m5150D(new Pair(new C5837r(c5823dM5340a2, listSingletonList2), new C6590c("List<AskMaterialGroup>", AbstractC5806u.m5264c(C4534m.Companion.serializer()))));
    }
}
