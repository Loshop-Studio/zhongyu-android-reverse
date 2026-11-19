package p063g1;

import android.support.v4.media.AbstractC0037f;
import com.google.gson.AbstractC3869p;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.AbstractC3848e;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.math.BigInteger;
import p104l1.C6046a;
import p104l1.C6047b;

/* renamed from: g1.i0 */
/* loaded from: classes2.dex */
public class C5564i0 extends AbstractC3869p {
    @Override // com.google.gson.AbstractC3869p
    /* renamed from: b */
    public final Object mo2779b(C6046a c6046a) throws IOException {
        if (c6046a.m5764x() == JsonToken.NULL) {
            c6046a.m5760t();
            return null;
        }
        String strM5762v = c6046a.m5762v();
        try {
            AbstractC3848e.m2803d(strM5762v);
            return new BigInteger(strM5762v);
        } catch (NumberFormatException e) {
            StringBuilder sbM100y = AbstractC0037f.m100y("Failed parsing '", strM5762v, "' as BigInteger; at path ");
            sbM100y.append(c6046a.m5750h(true));
            throw new JsonSyntaxException(sbM100y.toString(), e);
        }
    }

    @Override // com.google.gson.AbstractC3869p
    /* renamed from: c */
    public final void mo2780c(C6047b c6047b, Object obj) throws IOException {
        c6047b.m5782r((BigInteger) obj);
    }
}
