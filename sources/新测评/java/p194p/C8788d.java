package p194p;

import coil3.InterfaceC5193e;
import coil3.decode.DataSource;
import java.nio.ByteBuffer;
import kotlin.coroutines.Continuation;
import okio.Okio;
import p172n.AbstractC8604s;
import p172n.C8584e;
import p194p.InterfaceC8795k;
import p290y.C9892k;

/* renamed from: p.d */
/* loaded from: classes3.dex */
public final class C8788d implements InterfaceC8795k {

    /* renamed from: a */
    public final ByteBuffer f14923a;

    /* renamed from: b */
    public final C9892k f14924b;

    /* renamed from: p.d$a */
    public static final class a implements InterfaceC8795k.a {
        @Override // p194p.InterfaceC8795k.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC8795k mo3134a(ByteBuffer byteBuffer, C9892k c9892k, InterfaceC5193e interfaceC5193e) {
            return new C8788d(byteBuffer, c9892k);
        }
    }

    public C8788d(ByteBuffer byteBuffer, C9892k c9892k) {
        this.f14923a = byteBuffer;
        this.f14924b = c9892k;
    }

    @Override // p194p.InterfaceC8795k
    /* renamed from: a */
    public Object mo3117a(Continuation continuation) {
        return new C8800p(AbstractC8604s.m14161a(Okio.buffer(AbstractC8789e.m14681a(this.f14923a)), this.f14924b.m16704g(), new C8584e(this.f14923a)), null, DataSource.f2936b);
    }
}
