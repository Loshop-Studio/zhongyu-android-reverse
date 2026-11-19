package p124p;

import coil3.InterfaceC4574e;
import coil3.decode.DataSource;
import java.nio.ByteBuffer;
import kotlin.coroutines.Continuation;
import okio.Okio;
import p110n.AbstractC7436s;
import p110n.C7416e;
import p124p.InterfaceC7582k;
import p187y.C7880m;

/* renamed from: p.d */
/* loaded from: classes3.dex */
public final class C7575d implements InterfaceC7582k {

    /* renamed from: a */
    public final ByteBuffer f10023a;

    /* renamed from: b */
    public final C7880m f10024b;

    /* renamed from: p.d$a */
    public static final class a implements InterfaceC7582k.a {
        @Override // p124p.InterfaceC7582k.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC7582k mo1960a(ByteBuffer byteBuffer, C7880m c7880m, InterfaceC4574e interfaceC4574e) {
            return new C7575d(byteBuffer, c7880m);
        }
    }

    public C7575d(ByteBuffer byteBuffer, C7880m c7880m) {
        this.f10023a = byteBuffer;
        this.f10024b = c7880m;
    }

    @Override // p124p.InterfaceC7582k
    /* renamed from: a */
    public Object mo1943a(Continuation continuation) {
        return new C7587p(AbstractC7436s.m8482a(Okio.buffer(AbstractC7576e.m8973a(this.f10023a)), this.f10024b.m9665g(), new C7416e(this.f10023a)), null, DataSource.f1620b);
    }
}
