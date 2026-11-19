package p207p;

import coil3.InterfaceC5328e;
import coil3.decode.DataSource;
import kotlin.coroutines.Continuation;
import okio.Buffer;
import p183n.AbstractC9074s;
import p207p.InterfaceC9298k;
import p297y.C9932m;

/* renamed from: p.c */
/* loaded from: classes3.dex */
public final class C9290c implements InterfaceC9298k {

    /* renamed from: a */
    public final byte[] f16086a;

    /* renamed from: b */
    public final C9932m f16087b;

    /* renamed from: p.c$a */
    public static final class a implements InterfaceC9298k.a {
        @Override // p207p.InterfaceC9298k.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC9298k mo2854a(byte[] bArr, C9932m c9932m, InterfaceC5328e interfaceC5328e) {
            return new C9290c(bArr, c9932m);
        }
    }

    public C9290c(byte[] bArr, C9932m c9932m) {
        this.f16086a = bArr;
        this.f16087b = c9932m;
    }

    @Override // p207p.InterfaceC9298k
    /* renamed from: a */
    public Object mo2837a(Continuation continuation) {
        Buffer buffer = new Buffer();
        buffer.write(this.f16086a);
        return new C9303p(AbstractC9074s.m14554c(buffer, this.f16087b.m17112g(), null, 4, null), null, DataSource.f2865b);
    }
}
