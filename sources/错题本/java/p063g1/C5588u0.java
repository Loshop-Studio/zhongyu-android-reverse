package p063g1;

import com.google.gson.AbstractC3869p;
import com.google.gson.C3841g;
import com.google.gson.InterfaceC3870q;
import p095k1.C5752a;

/* renamed from: g1.u0 */
/* loaded from: classes2.dex */
public final class C5588u0 implements InterfaceC3870q {

    /* renamed from: a */
    public final /* synthetic */ int f8673a;

    /* renamed from: b */
    public final /* synthetic */ Class f8674b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC3869p f8675c;

    public /* synthetic */ C5588u0(Class cls, AbstractC3869p abstractC3869p, int i) {
        this.f8673a = i;
        this.f8674b = cls;
        this.f8675c = abstractC3869p;
    }

    @Override // com.google.gson.InterfaceC3870q
    /* renamed from: c */
    public final AbstractC3869p mo2798c(C3841g c3841g, C5752a c5752a) {
        switch (this.f8673a) {
            case 0:
                if (c5752a.f9103a == this.f8674b) {
                    return this.f8675c;
                }
                return null;
            default:
                Class<?> cls = c5752a.f9103a;
                if (this.f8674b.isAssignableFrom(cls)) {
                    return new C5547c(this, cls);
                }
                return null;
        }
    }

    public final String toString() {
        switch (this.f8673a) {
            case 0:
                return "Factory[type=" + this.f8674b.getName() + ",adapter=" + this.f8675c + "]";
            default:
                return "Factory[typeHierarchy=" + this.f8674b.getName() + ",adapter=" + this.f8675c + "]";
        }
    }
}
