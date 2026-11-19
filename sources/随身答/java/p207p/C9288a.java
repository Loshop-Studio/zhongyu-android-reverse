package p207p;

import coil3.InterfaceC5328e;
import coil3.decode.DataSource;
import coil3.util.AbstractC5349d;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import okio.Okio;
import p090e0.C7819q;
import p151k.AbstractC8248s;
import p151k.C8247r;
import p183n.AbstractC9074s;
import p183n.C9046a;
import p207p.InterfaceC9298k;
import p297y.C9932m;

/* renamed from: p.a */
/* loaded from: classes3.dex */
public final class C9288a implements InterfaceC9298k {

    /* renamed from: a */
    public final C8247r f16082a;

    /* renamed from: b */
    public final C9932m f16083b;

    /* renamed from: p.a$a */
    public static final class a implements InterfaceC9298k.a {
        @Override // p207p.InterfaceC9298k.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC9298k mo2854a(C8247r c8247r, C9932m c9932m, InterfaceC5328e interfaceC5328e) {
            if (AbstractC5349d.m2948h(c8247r)) {
                return new C9288a(c8247r, c9932m);
            }
            return null;
        }
    }

    public C9288a(C8247r c8247r, C9932m c9932m) {
        this.f16082a = c8247r;
        this.f16083b = c9932m;
    }

    @Override // p207p.InterfaceC9298k
    /* renamed from: a */
    public Object mo2837a(Continuation continuation) {
        String strJoinToString$default = CollectionsKt.joinToString$default(CollectionsKt.drop(AbstractC8248s.m13284f(this.f16082a), 1), "/", null, null, 0, null, null, 62, null);
        return new C9303p(AbstractC9074s.m14552a(Okio.buffer(Okio.source(this.f16083b.m17108c().getAssets().open(strJoinToString$default))), this.f16083b.m17112g(), new C9046a(strJoinToString$default)), C7819q.f13131a.m12215b(strJoinToString$default), DataSource.f2866c);
    }
}
