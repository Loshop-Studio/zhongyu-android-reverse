package p081j0;

import androidx.core.util.Pools;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p016b1.AbstractC4408j;
import p016b1.AbstractC4409k;
import p016b1.C4405g;
import p024c1.AbstractC4482a;
import p024c1.AbstractC4484c;
import p053f0.InterfaceC6283b;

/* renamed from: j0.j */
/* loaded from: classes3.dex */
public class C6582j {

    /* renamed from: a */
    public final C4405g f8545a = new C4405g(1000);

    /* renamed from: b */
    public final Pools.Pool f8546b = AbstractC4482a.m1580d(10, new a());

    /* renamed from: j0.j$a */
    public class a implements AbstractC4482a.d {
        public a() {
        }

        @Override // p024c1.AbstractC4482a.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b create() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e6) {
                throw new RuntimeException(e6);
            }
        }
    }

    /* renamed from: j0.j$b */
    public static final class b implements AbstractC4482a.f {

        /* renamed from: a */
        public final MessageDigest f8548a;

        /* renamed from: b */
        public final AbstractC4484c f8549b = AbstractC4484c.m1593a();

        public b(MessageDigest messageDigest) {
            this.f8548a = messageDigest;
        }

        @Override // p024c1.AbstractC4482a.f
        /* renamed from: d */
        public AbstractC4484c mo1586d() {
            return this.f8549b;
        }
    }

    /* renamed from: a */
    public final String m7464a(InterfaceC6283b interfaceC6283b) {
        b bVar = (b) AbstractC4408j.m1438d(this.f8546b.acquire());
        try {
            interfaceC6283b.mo9b(bVar.f8548a);
            return AbstractC4409k.m1462w(bVar.f8548a.digest());
        } finally {
            this.f8546b.release(bVar);
        }
    }

    /* renamed from: b */
    public String m7465b(InterfaceC6283b interfaceC6283b) {
        String strM7464a;
        synchronized (this.f8545a) {
            strM7464a = (String) this.f8545a.m1425g(interfaceC6283b);
        }
        if (strM7464a == null) {
            strM7464a = m7464a(interfaceC6283b);
        }
        synchronized (this.f8545a) {
            this.f8545a.m1429k(interfaceC6283b, strM7464a);
        }
        return strM7464a;
    }
}
