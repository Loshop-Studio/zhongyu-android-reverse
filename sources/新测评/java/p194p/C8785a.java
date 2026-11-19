package p194p;

import coil3.InterfaceC5193e;
import coil3.decode.DataSource;
import coil3.util.AbstractC5214d;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import okio.Okio;
import p030c0.C5093r;
import p137k.AbstractC7849u;
import p137k.C7848t;
import p172n.AbstractC8604s;
import p172n.C8576a;
import p194p.InterfaceC8795k;
import p290y.C9892k;

/* renamed from: p.a */
/* loaded from: classes3.dex */
public final class C8785a implements InterfaceC8795k {

    /* renamed from: a */
    public final C7848t f14917a;

    /* renamed from: b */
    public final C9892k f14918b;

    /* renamed from: p.a$a */
    public static final class a implements InterfaceC8795k.a {
        @Override // p194p.InterfaceC8795k.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC8795k mo3134a(C7848t c7848t, C9892k c9892k, InterfaceC5193e interfaceC5193e) {
            if (AbstractC5214d.m3231h(c7848t)) {
                return new C8785a(c7848t, c9892k);
            }
            return null;
        }
    }

    public C8785a(C7848t c7848t, C9892k c9892k) {
        this.f14917a = c7848t;
        this.f14918b = c9892k;
    }

    @Override // p194p.InterfaceC8795k
    /* renamed from: a */
    public Object mo3117a(Continuation continuation) {
        String strJoinToString$default = CollectionsKt.joinToString$default(CollectionsKt.drop(AbstractC7849u.m13316f(this.f14917a), 1), "/", null, null, 0, null, null, 62, null);
        return new C8800p(AbstractC8604s.m14161a(Okio.buffer(Okio.source(this.f14918b.m16700c().getAssets().open(strJoinToString$default))), this.f14918b.m16704g(), new C8576a(strJoinToString$default)), C5093r.f2659a.m2708b(strJoinToString$default), DataSource.f2937c);
    }
}
