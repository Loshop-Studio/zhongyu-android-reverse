package p253n;

import coil3.InterfaceC5470e;
import coil3.decode.DataSource;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.p227io.encoding.Base64;
import okio.Buffer;
import p212k.C9766t;
import p228l.AbstractC10086s;
import p253n.InterfaceC10281k;
import p310qd.AbstractC10793c0;
import p380w.C11634n;
import vc.InterfaceC11588c;

/* renamed from: n.h */
/* loaded from: classes3.dex */
public final class C10278h implements InterfaceC10281k {

    /* renamed from: c */
    public static final a f24465c = new a(null);

    /* renamed from: a */
    public final C9766t f24466a;

    /* renamed from: b */
    public final C11634n f24467b;

    /* renamed from: n.h$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: n.h$b */
    public static final class b implements InterfaceC10281k.a {
        @Override // p253n.InterfaceC10281k.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC10281k mo3225a(C9766t c9766t, C11634n c11634n, InterfaceC5470e interfaceC5470e) {
            if (AbstractC9979u.m20289b(c9766t.m19685c(), "data")) {
                return new C10278h(c9766t, c11634n);
            }
            return null;
        }
    }

    public C10278h(C9766t c9766t, C11634n c11634n) {
        this.f24466a = c9766t;
        this.f24467b = c11634n;
    }

    @Override // p253n.InterfaceC10281k
    /* renamed from: a */
    public Object mo3208a(InterfaceC11588c interfaceC11588c) {
        int iM23130f0 = AbstractC10793c0.m23130f0(this.f24466a.toString(), ";base64,", 0, false, 6, null);
        if (iM23130f0 == -1) {
            throw new IllegalStateException(("invalid data uri: " + this.f24466a).toString());
        }
        int iM23128e0 = AbstractC10793c0.m23128e0(this.f24466a.toString(), ':', 0, false, 6, null);
        if (iM23128e0 == -1) {
            throw new IllegalStateException(("invalid data uri: " + this.f24466a).toString());
        }
        String strSubstring = this.f24466a.toString().substring(iM23128e0 + 1, iM23130f0);
        AbstractC9979u.m20293f(strSubstring, "substring(...)");
        byte[] bArrM20232f = Base64.m20232f(Base64.f23381f, this.f24466a.toString(), iM23130f0 + 8, 0, 4, null);
        Buffer buffer = new Buffer();
        buffer.write(bArrM20232f);
        return new C10286p(AbstractC10086s.m21096c(buffer, this.f24467b.m25747g(), null, 4, null), strSubstring, DataSource.f3611d);
    }
}
