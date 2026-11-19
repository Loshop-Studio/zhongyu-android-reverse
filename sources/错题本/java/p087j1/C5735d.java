package p087j1;

import com.google.gson.AbstractC3869p;
import java.sql.Timestamp;
import java.util.Date;
import p104l1.C6046a;
import p104l1.C6047b;

/* renamed from: j1.d */
/* loaded from: classes2.dex */
public final class C5735d extends AbstractC3869p {

    /* renamed from: b */
    public static final C5734c f9069b = new C5734c();

    /* renamed from: a */
    public final AbstractC3869p f9070a;

    public C5735d(AbstractC3869p abstractC3869p) {
        this.f9070a = abstractC3869p;
    }

    @Override // com.google.gson.AbstractC3869p
    /* renamed from: b */
    public final Object mo2779b(C6046a c6046a) {
        Date date = (Date) this.f9070a.mo2779b(c6046a);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.google.gson.AbstractC3869p
    /* renamed from: c */
    public final void mo2780c(C6047b c6047b, Object obj) {
        this.f9070a.mo2780c(c6047b, (Timestamp) obj);
    }
}
