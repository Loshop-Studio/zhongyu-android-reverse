package p207p;

import coil3.InterfaceC5328e;
import coil3.decode.DataSource;
import java.nio.ByteBuffer;
import kotlin.coroutines.Continuation;
import okio.Okio;
import p183n.AbstractC9074s;
import p183n.C9054e;
import p207p.InterfaceC9298k;
import p297y.C9932m;

/* renamed from: p.d */
/* loaded from: classes3.dex */
public final class C9291d implements InterfaceC9298k {

    /* renamed from: a */
    public final ByteBuffer f16088a;

    /* renamed from: b */
    public final C9932m f16089b;

    /* renamed from: p.d$a */
    public static final class a implements InterfaceC9298k.a {
        @Override // p207p.InterfaceC9298k.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC9298k mo2854a(ByteBuffer byteBuffer, C9932m c9932m, InterfaceC5328e interfaceC5328e) {
            return new C9291d(byteBuffer, c9932m);
        }
    }

    public C9291d(ByteBuffer byteBuffer, C9932m c9932m) {
        this.f16088a = byteBuffer;
        this.f16089b = c9932m;
    }

    @Override // p207p.InterfaceC9298k
    /* renamed from: a */
    public Object mo2837a(Continuation continuation) {
        return new C9303p(AbstractC9074s.m14552a(Okio.buffer(AbstractC9292e.m15132a(this.f16088a)), this.f16089b.m17112g(), new C9054e(this.f16088a)), null, DataSource.f2865b);
    }
}
