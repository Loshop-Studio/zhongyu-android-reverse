package p253n;

import coil3.InterfaceC5470e;
import coil3.decode.DataSource;
import okio.Buffer;
import p228l.AbstractC10086s;
import p253n.InterfaceC10281k;
import p380w.C11634n;
import vc.InterfaceC11588c;

/* renamed from: n.c */
/* loaded from: classes3.dex */
public final class C10273c implements InterfaceC10281k {

    /* renamed from: a */
    public final byte[] f24457a;

    /* renamed from: b */
    public final C11634n f24458b;

    /* renamed from: n.c$a */
    public static final class a implements InterfaceC10281k.a {
        @Override // p253n.InterfaceC10281k.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC10281k mo3225a(byte[] bArr, C11634n c11634n, InterfaceC5470e interfaceC5470e) {
            return new C10273c(bArr, c11634n);
        }
    }

    public C10273c(byte[] bArr, C11634n c11634n) {
        this.f24457a = bArr;
        this.f24458b = c11634n;
    }

    @Override // p253n.InterfaceC10281k
    /* renamed from: a */
    public Object mo3208a(InterfaceC11588c interfaceC11588c) {
        Buffer buffer = new Buffer();
        buffer.write(this.f24457a);
        return new C10286p(AbstractC10086s.m21096c(buffer, this.f24458b.m25747g(), null, 4, null), null, DataSource.f3611d);
    }
}
