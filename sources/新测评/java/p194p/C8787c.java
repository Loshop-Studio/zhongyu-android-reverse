package p194p;

import coil3.InterfaceC5193e;
import coil3.decode.DataSource;
import kotlin.coroutines.Continuation;
import okio.Buffer;
import p172n.AbstractC8604s;
import p194p.InterfaceC8795k;
import p290y.C9892k;

/* renamed from: p.c */
/* loaded from: classes3.dex */
public final class C8787c implements InterfaceC8795k {

    /* renamed from: a */
    public final byte[] f14921a;

    /* renamed from: b */
    public final C9892k f14922b;

    /* renamed from: p.c$a */
    public static final class a implements InterfaceC8795k.a {
        @Override // p194p.InterfaceC8795k.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC8795k mo3134a(byte[] bArr, C9892k c9892k, InterfaceC5193e interfaceC5193e) {
            return new C8787c(bArr, c9892k);
        }
    }

    public C8787c(byte[] bArr, C9892k c9892k) {
        this.f14921a = bArr;
        this.f14922b = c9892k;
    }

    @Override // p194p.InterfaceC8795k
    /* renamed from: a */
    public Object mo3117a(Continuation continuation) {
        Buffer buffer = new Buffer();
        buffer.write(this.f14921a);
        return new C8800p(AbstractC8604s.m14163c(buffer, this.f14922b.m16704g(), null, 4, null), null, DataSource.f2936b);
    }
}
