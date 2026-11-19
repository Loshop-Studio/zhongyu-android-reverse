package p206q0;

import androidx.core.util.Pools;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p117i1.AbstractC7651j;
import p117i1.AbstractC7652k;
import p117i1.C7648g;
import p128j1.AbstractC7778a;
import p128j1.AbstractC7780c;
import p162m0.InterfaceC8537b;

/* renamed from: q0.j */
/* loaded from: classes3.dex */
public class C8875j {

    /* renamed from: a */
    public final C7648g f15100a = new C7648g(1000);

    /* renamed from: b */
    public final Pools.Pool f15101b = AbstractC7778a.m13137d(10, new a());

    /* renamed from: q0.j$a */
    public class a implements AbstractC7778a.d {
        public a() {
        }

        @Override // p128j1.AbstractC7778a.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b create() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* renamed from: q0.j$b */
    public static final class b implements AbstractC7778a.f {

        /* renamed from: a */
        public final MessageDigest f15103a;

        /* renamed from: b */
        public final AbstractC7780c f15104b = AbstractC7780c.m13149a();

        public b(MessageDigest messageDigest) {
            this.f15103a = messageDigest;
        }

        @Override // p128j1.AbstractC7778a.f
        /* renamed from: d */
        public AbstractC7780c mo3443d() {
            return this.f15104b;
        }
    }

    /* renamed from: a */
    public final String m14893a(InterfaceC8537b interfaceC8537b) {
        b bVar = (b) AbstractC7651j.m12683d(this.f15101b.acquire());
        try {
            interfaceC8537b.mo12541a(bVar.f15103a);
            return AbstractC7652k.m12707w(bVar.f15103a.digest());
        } finally {
            this.f15101b.release(bVar);
        }
    }

    /* renamed from: b */
    public String m14894b(InterfaceC8537b interfaceC8537b) {
        String strM14893a;
        synchronized (this.f15100a) {
            strM14893a = (String) this.f15100a.m12670g(interfaceC8537b);
        }
        if (strM14893a == null) {
            strM14893a = m14893a(interfaceC8537b);
        }
        synchronized (this.f15100a) {
            this.f15100a.m12674k(interfaceC8537b, strM14893a);
        }
        return strM14893a;
    }
}
