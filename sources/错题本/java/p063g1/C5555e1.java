package p063g1;

import com.google.gson.AbstractC3869p;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import p104l1.C6046a;
import p104l1.C6047b;

/* renamed from: g1.e1 */
/* loaded from: classes2.dex */
public class C5555e1 extends AbstractC3869p {
    @Override // com.google.gson.AbstractC3869p
    /* renamed from: b */
    public final Object mo2779b(C6046a c6046a) {
        return new AtomicBoolean(c6046a.m5754n());
    }

    @Override // com.google.gson.AbstractC3869p
    /* renamed from: c */
    public final void mo2780c(C6047b c6047b, Object obj) throws IOException {
        c6047b.m5784t(((AtomicBoolean) obj).get());
    }
}
