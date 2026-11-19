package p039d0;

import io.reactivex.internal.operators.observable.C5712h;
import p180v0.AbstractC6664k;
import p180v0.C6660g;
import p187w0.AbstractC6699g;
import p187w0.C6696d;
import p202y.InterfaceC6760c;

/* renamed from: d0.j */
/* loaded from: classes2.dex */
public final class C5407j {

    /* renamed from: a */
    public final C6660g f8366a = new C6660g(1000);

    /* renamed from: b */
    public final C6696d f8367b = AbstractC6699g.m6398a(10, new C5712h(3));

    /* renamed from: a */
    public final String m4799a(InterfaceC6760c interfaceC6760c) {
        String str;
        synchronized (this.f8366a) {
            str = (String) this.f8366a.m6316a(interfaceC6760c);
        }
        if (str == null) {
            C5406i c5406i = (C5406i) this.f8367b.acquire();
            try {
                interfaceC6760c.mo2013b(c5406i.f8364a);
                byte[] bArrDigest = c5406i.f8364a.digest();
                char[] cArr = AbstractC6664k.f11244b;
                synchronized (cArr) {
                    for (int i = 0; i < bArrDigest.length; i++) {
                        byte b6 = bArrDigest[i];
                        int i8 = i * 2;
                        char[] cArr2 = AbstractC6664k.f11243a;
                        cArr[i8] = cArr2[(b6 & 255) >>> 4];
                        cArr[i8 + 1] = cArr2[b6 & 15];
                    }
                    str = new String(cArr);
                }
            } finally {
                this.f8367b.release(c5406i);
            }
        }
        synchronized (this.f8366a) {
            this.f8366a.m6317d(interfaceC6760c, str);
        }
        return str;
    }
}
