package p078i4;

import android.content.Context;
import com.bumptech.glide.ComponentCallbacks2C4678c;
import com.bumptech.glide.ComponentCallbacks2C4684i;
import p160u0.InterfaceC7757j;
import p160u0.InterfaceC7763p;
import p181x0.C7826d;

/* renamed from: i4.n */
/* loaded from: classes4.dex */
public class C6544n extends ComponentCallbacks2C4684i {
    public C6544n(ComponentCallbacks2C4678c componentCallbacks2C4678c, InterfaceC7757j interfaceC7757j, InterfaceC7763p interfaceC7763p, Context context) {
        super(componentCallbacks2C4678c, interfaceC7757j, interfaceC7763p, context);
    }

    @Override // com.bumptech.glide.ComponentCallbacks2C4684i
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public C6543m mo2534j(Class cls) {
        return new C6543m(this.f2238a, this, cls, this.f2239b);
    }

    @Override // com.bumptech.glide.ComponentCallbacks2C4684i
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public C6543m mo2535k() {
        return (C6543m) super.mo2535k();
    }

    @Override // com.bumptech.glide.ComponentCallbacks2C4684i
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public C6543m mo2536l() {
        return (C6543m) super.mo2536l();
    }

    @Override // com.bumptech.glide.ComponentCallbacks2C4684i
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public C6543m mo2537m() {
        return (C6543m) super.mo2537m();
    }

    @Override // com.bumptech.glide.ComponentCallbacks2C4684i
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public C6543m mo2543s(Object obj) {
        return (C6543m) super.mo2543s(obj);
    }

    @Override // com.bumptech.glide.ComponentCallbacks2C4684i
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public C6543m mo2544t(String str) {
        return (C6543m) super.mo2544t(str);
    }

    @Override // com.bumptech.glide.ComponentCallbacks2C4684i
    /* renamed from: y */
    public void mo2549y(C7826d c7826d) {
        if (c7826d instanceof C6542l) {
            super.mo2549y(c7826d);
        } else {
            super.mo2549y(new C6542l().mo2514b(c7826d));
        }
    }
}
