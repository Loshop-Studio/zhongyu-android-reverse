package p087j1;

import com.google.gson.AbstractC3869p;
import com.google.gson.C3841g;
import com.google.gson.InterfaceC3870q;
import java.sql.Timestamp;
import java.util.Date;
import p095k1.C5752a;

/* renamed from: j1.c */
/* loaded from: classes2.dex */
public class C5734c implements InterfaceC3870q {
    @Override // com.google.gson.InterfaceC3870q
    /* renamed from: c */
    public final AbstractC3869p mo2798c(C3841g c3841g, C5752a c5752a) {
        if (c5752a.f9103a != Timestamp.class) {
            return null;
        }
        c3841g.getClass();
        return new C5735d(c3841g.m2785d(new C5752a(Date.class)));
    }
}
