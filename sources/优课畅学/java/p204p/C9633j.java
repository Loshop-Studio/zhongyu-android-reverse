package p204p;

import androidx.core.util.Pools;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p116h0.AbstractC8706j;
import p116h0.AbstractC8707k;
import p116h0.C8703g;
import p127i0.AbstractC8748a;
import p127i0.AbstractC8750c;
import p160l.InterfaceC9228b;

/* renamed from: p.j */
/* loaded from: classes3.dex */
public class C9633j {

    /* renamed from: a */
    public final C8703g f19273a = new C8703g(1000);

    /* renamed from: b */
    public final Pools.Pool f19274b = AbstractC8748a.m14409d(10, new a());

    /* renamed from: p.j$a */
    public class a implements AbstractC8748a.d {
        public a() {
        }

        @Override // p127i0.AbstractC8748a.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b create() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* renamed from: p.j$b */
    public static final class b implements AbstractC8748a.f {

        /* renamed from: a */
        public final MessageDigest f19276a;

        /* renamed from: b */
        public final AbstractC8750c f19277b = AbstractC8750c.m14421a();

        public b(MessageDigest messageDigest) {
            this.f19276a = messageDigest;
        }

        @Override // p127i0.AbstractC8748a.f
        /* renamed from: a */
        public AbstractC8750c mo2886a() {
            return this.f19277b;
        }
    }

    /* renamed from: a */
    public final String m18194a(InterfaceC9228b interfaceC9228b) {
        b bVar = (b) AbstractC8706j.m14181d(this.f19274b.acquire());
        try {
            interfaceC9228b.mo13883b(bVar.f19276a);
            return AbstractC8707k.m14206x(bVar.f19276a.digest());
        } finally {
            this.f19274b.release(bVar);
        }
    }

    /* renamed from: b */
    public String m18195b(InterfaceC9228b interfaceC9228b) {
        String strM18194a;
        synchronized (this.f19273a) {
            strM18194a = (String) this.f19273a.m14168f(interfaceC9228b);
        }
        if (strM18194a == null) {
            strM18194a = m18194a(interfaceC9228b);
        }
        synchronized (this.f19273a) {
            this.f19273a.m14172j(interfaceC9228b, strM18194a);
        }
        return strM18194a;
    }
}
