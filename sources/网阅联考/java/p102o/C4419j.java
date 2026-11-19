package p102o;

import androidx.core.util.Pools;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p062g0.AbstractC3749i;
import p062g0.AbstractC3750j;
import p062g0.C3746f;
import p067h0.AbstractC3762a;
import p067h0.AbstractC3764c;
import p076j.InterfaceC3792b;

/* renamed from: o.j */
/* loaded from: classes2.dex */
public class C4419j {

    /* renamed from: a */
    public final C3746f f4976a = new C3746f(1000);

    /* renamed from: b */
    public final Pools.Pool f4977b = AbstractC3762a.m4853d(10, new a());

    /* renamed from: o.j$a */
    public class a implements AbstractC3762a.d {
        public a() {
        }

        @Override // p067h0.AbstractC3762a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b mo1871a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e4) {
                throw new RuntimeException(e4);
            }
        }
    }

    /* renamed from: o.j$b */
    public static final class b implements AbstractC3762a.f {

        /* renamed from: a */
        public final MessageDigest f4979a;

        /* renamed from: b */
        public final AbstractC3764c f4980b = AbstractC3764c.m4863a();

        public b(MessageDigest messageDigest) {
            this.f4979a = messageDigest;
        }

        @Override // p067h0.AbstractC3762a.f
        /* renamed from: e */
        public AbstractC3764c mo1772e() {
            return this.f4980b;
        }
    }

    /* renamed from: a */
    public final String m5522a(InterfaceC3792b interfaceC3792b) {
        b bVar = (b) AbstractC3749i.m4768d(this.f4977b.acquire());
        try {
            interfaceC3792b.mo4729b(bVar.f4979a);
            return AbstractC3750j.m4788s(bVar.f4979a.digest());
        } finally {
            this.f4977b.release(bVar);
        }
    }

    /* renamed from: b */
    public String m5523b(InterfaceC3792b interfaceC3792b) {
        String strM5522a;
        synchronized (this.f4976a) {
            strM5522a = (String) this.f4976a.m4755g(interfaceC3792b);
        }
        if (strM5522a == null) {
            strM5522a = m5522a(interfaceC3792b);
        }
        synchronized (this.f4976a) {
            this.f4976a.m4759k(interfaceC3792b, strM5522a);
        }
        return strM5522a;
    }
}
