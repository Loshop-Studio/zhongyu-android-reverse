package p124p;

import coil3.InterfaceC4574e;
import coil3.decode.DataSource;
import coil3.util.AbstractC4595d;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import okio.Okio;
import p023c0.C4473r;
import p087k.AbstractC6622u;
import p087k.C6621t;
import p110n.AbstractC7436s;
import p110n.C7408a;
import p124p.InterfaceC7582k;
import p187y.C7880m;

/* renamed from: p.a */
/* loaded from: classes3.dex */
public final class C7572a implements InterfaceC7582k {

    /* renamed from: a */
    public final C6621t f10017a;

    /* renamed from: b */
    public final C7880m f10018b;

    /* renamed from: p.a$a */
    public static final class a implements InterfaceC7582k.a {
        @Override // p124p.InterfaceC7582k.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC7582k mo1960a(C6621t c6621t, C7880m c7880m, InterfaceC4574e interfaceC4574e) {
            if (AbstractC4595d.m2057h(c6621t)) {
                return new C7572a(c6621t, c7880m);
            }
            return null;
        }
    }

    public C7572a(C6621t c6621t, C7880m c7880m) {
        this.f10017a = c6621t;
        this.f10018b = c7880m;
    }

    @Override // p124p.InterfaceC7582k
    /* renamed from: a */
    public Object mo1943a(Continuation continuation) {
        String strJoinToString$default = CollectionsKt.joinToString$default(CollectionsKt.drop(AbstractC6622u.m7582f(this.f10017a), 1), "/", null, null, 0, null, null, 62, null);
        return new C7587p(AbstractC7436s.m8482a(Okio.buffer(Okio.source(this.f10018b.m9661c().getAssets().open(strJoinToString$default))), this.f10018b.m9665g(), new C7408a(strJoinToString$default)), C4473r.f1339a.m1566b(strJoinToString$default), DataSource.f1621c);
    }
}
