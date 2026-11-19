package p174m0;

import androidx.core.util.Pools;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p091e1.AbstractC7837i;
import p091e1.AbstractC7838j;
import p091e1.C7834f;
import p102f1.AbstractC7909a;
import p102f1.AbstractC7911c;
import p122h0.InterfaceC8082b;

/* renamed from: m0.j */
/* loaded from: classes3.dex */
public class C8948j {

    /* renamed from: a */
    public final C7834f f15004a = new C7834f(1000);

    /* renamed from: b */
    public final Pools.Pool f15005b = AbstractC7909a.m12438d(10, new a());

    /* renamed from: m0.j$a */
    public class a implements AbstractC7909a.d {
        public a() {
        }

        @Override // p102f1.AbstractC7909a.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b create() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* renamed from: m0.j$b */
    public static final class b implements AbstractC7909a.f {

        /* renamed from: a */
        public final MessageDigest f15007a;

        /* renamed from: b */
        public final AbstractC7911c f15008b = AbstractC7911c.m12448a();

        public b(MessageDigest messageDigest) {
            this.f15007a = messageDigest;
        }

        @Override // p102f1.AbstractC7909a.f
        /* renamed from: b */
        public AbstractC7911c mo3094b() {
            return this.f15008b;
        }
    }

    /* renamed from: a */
    public final String m14275a(InterfaceC8082b interfaceC8082b) {
        b bVar = (b) AbstractC7837i.m12256d(this.f15005b.acquire());
        try {
            interfaceC8082b.mo12082a(bVar.f15007a);
            return AbstractC7838j.m12276s(bVar.f15007a.digest());
        } finally {
            this.f15005b.release(bVar);
        }
    }

    /* renamed from: b */
    public String m14276b(InterfaceC8082b interfaceC8082b) {
        String strM14275a;
        synchronized (this.f15004a) {
            strM14275a = (String) this.f15004a.m12243g(interfaceC8082b);
        }
        if (strM14275a == null) {
            strM14275a = m14275a(interfaceC8082b);
        }
        synchronized (this.f15004a) {
            this.f15004a.m12247k(interfaceC8082b, strM14275a);
        }
        return strM14275a;
    }
}
