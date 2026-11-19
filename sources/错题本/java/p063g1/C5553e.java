package p063g1;

import com.google.gson.AbstractC3869p;
import com.google.gson.C3841g;
import com.google.gson.InterfaceC3870q;
import java.util.Date;
import p095k1.C5752a;

/* renamed from: g1.e */
/* loaded from: classes2.dex */
public class C5553e implements InterfaceC3870q {
    @Override // com.google.gson.InterfaceC3870q
    /* renamed from: c */
    public final AbstractC3869p mo2798c(C3841g c3841g, C5752a c5752a) {
        if (c5752a.f9103a == Date.class) {
            return new C5561h(AbstractC5559g.f8637b, 2, 2);
        }
        return null;
    }

    public final String toString() {
        return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
    }
}
