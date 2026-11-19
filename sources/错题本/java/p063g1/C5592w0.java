package p063g1;

import com.google.gson.AbstractC3869p;
import com.google.gson.C3841g;
import com.google.gson.InterfaceC3870q;
import p095k1.C5752a;

/* renamed from: g1.w0 */
/* loaded from: classes2.dex */
public final class C5592w0 implements InterfaceC3870q {

    /* renamed from: a */
    public final /* synthetic */ Class f8678a;

    /* renamed from: b */
    public final /* synthetic */ Class f8679b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC3869p f8680c;

    public C5592w0(Class cls, Class cls2, AbstractC3869p abstractC3869p) {
        this.f8678a = cls;
        this.f8679b = cls2;
        this.f8680c = abstractC3869p;
    }

    @Override // com.google.gson.InterfaceC3870q
    /* renamed from: c */
    public final AbstractC3869p mo2798c(C3841g c3841g, C5752a c5752a) {
        Class cls = c5752a.f9103a;
        if (cls == this.f8678a || cls == this.f8679b) {
            return this.f8680c;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f8679b.getName() + "+" + this.f8678a.getName() + ",adapter=" + this.f8680c + "]";
    }
}
