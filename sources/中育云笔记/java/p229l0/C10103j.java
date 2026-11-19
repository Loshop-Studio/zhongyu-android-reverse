package p229l0;

import androidx.core.util.Pools;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p109d1.AbstractC8909j;
import p109d1.AbstractC8910k;
import p109d1.C8906g;
import p125e1.AbstractC9069a;
import p125e1.AbstractC9071c;
import p168h0.InterfaceC9435b;

/* renamed from: l0.j */
/* loaded from: classes3.dex */
public class C10103j {

    /* renamed from: a */
    public final C8906g f24144a = new C8906g(1000);

    /* renamed from: b */
    public final Pools.Pool f24145b = AbstractC9069a.m17858d(10, new a());

    /* renamed from: l0.j$a */
    public class a implements AbstractC9069a.d {
        public a() {
        }

        @Override // p125e1.AbstractC9069a.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b create() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* renamed from: l0.j$b */
    public static final class b implements AbstractC9069a.f {

        /* renamed from: c */
        public final MessageDigest f24147c;

        /* renamed from: d */
        public final AbstractC9071c f24148d = AbstractC9071c.m17870a();

        public b(MessageDigest messageDigest) {
            this.f24147c = messageDigest;
        }

        @Override // p125e1.AbstractC9069a.f
        /* renamed from: d */
        public AbstractC9071c mo4093d() {
            return this.f24148d;
        }
    }

    /* renamed from: a */
    public final String m21131a(InterfaceC9435b interfaceC9435b) {
        b bVar = (b) AbstractC8909j.m17468d(this.f24145b.acquire());
        try {
            interfaceC9435b.mo2797b(bVar.f24147c);
            return AbstractC8910k.m17493x(bVar.f24147c.digest());
        } finally {
            this.f24145b.release(bVar);
        }
    }

    /* renamed from: b */
    public String m21132b(InterfaceC9435b interfaceC9435b) {
        String strM21131a;
        synchronized (this.f24144a) {
            strM21131a = (String) this.f24144a.m17455g(interfaceC9435b);
        }
        if (strM21131a == null) {
            strM21131a = m21131a(interfaceC9435b);
        }
        synchronized (this.f24144a) {
            this.f24144a.m17459k(interfaceC9435b, strM21131a);
        }
        return strM21131a;
    }
}
