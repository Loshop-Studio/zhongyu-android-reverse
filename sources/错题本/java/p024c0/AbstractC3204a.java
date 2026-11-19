package p024c0;

import java.util.ArrayDeque;
import p055f0.C5492a0;
import p055f0.C5495c;
import p055f0.C5519x;
import p055f0.InterfaceC5511p;
import p055f0.InterfaceC5512q;
import p180v0.AbstractC6664k;

/* renamed from: c0.a */
/* loaded from: classes2.dex */
public abstract class AbstractC3204a implements InterfaceC5512q {

    /* renamed from: a */
    public final Object f1740a;

    public AbstractC3204a() {
        char[] cArr = AbstractC6664k.f11243a;
        this.f1740a = new ArrayDeque(20);
    }

    /* renamed from: a */
    public void m2139a(InterfaceC3212i interfaceC3212i) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f1740a;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(interfaceC3212i);
        }
    }

    @Override // p055f0.InterfaceC5512q
    /* renamed from: r */
    public InterfaceC5511p mo2140r(C5519x c5519x) {
        return new C5495c((C5492a0) this.f1740a, 2);
    }

    public AbstractC3204a(C5492a0 c5492a0) {
        this.f1740a = c5492a0;
    }
}
