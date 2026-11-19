package p063g1;

import com.google.gson.AbstractC3869p;
import com.google.gson.C3841g;
import com.google.gson.InterfaceC3867n;
import com.google.gson.InterfaceC3870q;
import java.util.Calendar;
import java.util.GregorianCalendar;
import p095k1.C5752a;

/* renamed from: g1.p */
/* loaded from: classes2.dex */
public final class C5577p implements InterfaceC3870q {

    /* renamed from: a */
    public final /* synthetic */ int f8655a;

    /* renamed from: b */
    public final /* synthetic */ Object f8656b;

    public /* synthetic */ C5577p(Object obj, int i) {
        this.f8655a = i;
        this.f8656b = obj;
    }

    @Override // com.google.gson.InterfaceC3870q
    /* renamed from: c */
    public final AbstractC3869p mo2798c(C3841g c3841g, C5752a c5752a) {
        switch (this.f8655a) {
            case 0:
                if (c5752a.f9103a == Number.class) {
                    return (C5581r) this.f8656b;
                }
                return null;
            case 1:
                if (c5752a.f9103a == Object.class) {
                    return new C5585t(c3841g, (InterfaceC3867n) this.f8656b);
                }
                return null;
            default:
                Class cls = c5752a.f9103a;
                if (cls == Calendar.class || cls == GregorianCalendar.class) {
                    return (C5584s0) this.f8656b;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f8655a) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((C5584s0) this.f8656b) + "]";
            default:
                return super.toString();
        }
    }
}
