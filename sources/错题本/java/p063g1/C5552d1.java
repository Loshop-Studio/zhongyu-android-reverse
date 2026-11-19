package p063g1;

import com.google.gson.AbstractC3869p;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import p104l1.C6046a;
import p104l1.C6047b;

/* renamed from: g1.d1 */
/* loaded from: classes2.dex */
public class C5552d1 extends AbstractC3869p {
    @Override // com.google.gson.AbstractC3869p
    /* renamed from: b */
    public final Object mo2779b(C6046a c6046a) {
        try {
            return new AtomicInteger(c6046a.m5756p());
        } catch (NumberFormatException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // com.google.gson.AbstractC3869p
    /* renamed from: c */
    public final void mo2780c(C6047b c6047b, Object obj) throws IOException {
        c6047b.m5781q(((AtomicInteger) obj).get());
    }
}
