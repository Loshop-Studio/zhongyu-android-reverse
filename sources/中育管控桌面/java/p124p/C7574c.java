package p124p;

import coil3.InterfaceC4574e;
import coil3.decode.DataSource;
import kotlin.coroutines.Continuation;
import okio.Buffer;
import p110n.AbstractC7436s;
import p124p.InterfaceC7582k;
import p187y.C7880m;

/* renamed from: p.c */
/* loaded from: classes3.dex */
public final class C7574c implements InterfaceC7582k {

    /* renamed from: a */
    public final byte[] f10021a;

    /* renamed from: b */
    public final C7880m f10022b;

    /* renamed from: p.c$a */
    public static final class a implements InterfaceC7582k.a {
        @Override // p124p.InterfaceC7582k.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC7582k mo1960a(byte[] bArr, C7880m c7880m, InterfaceC4574e interfaceC4574e) {
            return new C7574c(bArr, c7880m);
        }
    }

    public C7574c(byte[] bArr, C7880m c7880m) {
        this.f10021a = bArr;
        this.f10022b = c7880m;
    }

    @Override // p124p.InterfaceC7582k
    /* renamed from: a */
    public Object mo1943a(Continuation continuation) {
        Buffer buffer = new Buffer();
        buffer.write(this.f10021a);
        return new C7587p(AbstractC7436s.m8484c(buffer, this.f10022b.m9665g(), null, 4, null), null, DataSource.f1620b);
    }
}
