package p253n;

import coil3.InterfaceC5470e;
import coil3.decode.DataSource;
import java.nio.ByteBuffer;
import okio.Okio;
import p228l.AbstractC10086s;
import p228l.C10066e;
import p253n.InterfaceC10281k;
import p380w.C11634n;
import vc.InterfaceC11588c;

/* renamed from: n.d */
/* loaded from: classes3.dex */
public final class C10274d implements InterfaceC10281k {

    /* renamed from: a */
    public final ByteBuffer f24459a;

    /* renamed from: b */
    public final C11634n f24460b;

    /* renamed from: n.d$a */
    public static final class a implements InterfaceC10281k.a {
        @Override // p253n.InterfaceC10281k.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC10281k mo3225a(ByteBuffer byteBuffer, C11634n c11634n, InterfaceC5470e interfaceC5470e) {
            return new C10274d(byteBuffer, c11634n);
        }
    }

    public C10274d(ByteBuffer byteBuffer, C11634n c11634n) {
        this.f24459a = byteBuffer;
        this.f24460b = c11634n;
    }

    @Override // p253n.InterfaceC10281k
    /* renamed from: a */
    public Object mo3208a(InterfaceC11588c interfaceC11588c) {
        return new C10286p(AbstractC10086s.m21094a(Okio.buffer(AbstractC10275e.m21400a(this.f24459a)), this.f24460b.m25747g(), new C10066e(this.f24459a)), null, DataSource.f3611d);
    }
}
