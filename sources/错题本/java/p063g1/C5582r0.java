package p063g1;

import android.support.v4.media.AbstractC0037f;
import com.google.gson.AbstractC3869p;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.Currency;
import p104l1.C6046a;
import p104l1.C6047b;

/* renamed from: g1.r0 */
/* loaded from: classes2.dex */
public class C5582r0 extends AbstractC3869p {
    @Override // com.google.gson.AbstractC3869p
    /* renamed from: b */
    public final Object mo2779b(C6046a c6046a) throws IOException {
        String strM5762v = c6046a.m5762v();
        try {
            return Currency.getInstance(strM5762v);
        } catch (IllegalArgumentException e) {
            StringBuilder sbM100y = AbstractC0037f.m100y("Failed parsing '", strM5762v, "' as Currency; at path ");
            sbM100y.append(c6046a.m5750h(true));
            throw new JsonSyntaxException(sbM100y.toString(), e);
        }
    }

    @Override // com.google.gson.AbstractC3869p
    /* renamed from: c */
    public final void mo2780c(C6047b c6047b, Object obj) throws IOException {
        c6047b.m5783s(((Currency) obj).getCurrencyCode());
    }
}
