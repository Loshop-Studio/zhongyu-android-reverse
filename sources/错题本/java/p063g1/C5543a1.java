package p063g1;

import android.support.v4.media.AbstractC0037f;
import com.google.gson.AbstractC3869p;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import p104l1.C6046a;
import p104l1.C6047b;

/* renamed from: g1.a1 */
/* loaded from: classes2.dex */
public class C5543a1 extends AbstractC3869p {
    @Override // com.google.gson.AbstractC3869p
    /* renamed from: b */
    public final Object mo2779b(C6046a c6046a) throws IOException {
        if (c6046a.m5764x() == JsonToken.NULL) {
            c6046a.m5760t();
            return null;
        }
        try {
            int iM5756p = c6046a.m5756p();
            if (iM5756p <= 255 && iM5756p >= -128) {
                return Byte.valueOf((byte) iM5756p);
            }
            StringBuilder sbM94s = AbstractC0037f.m94s(iM5756p, "Lossy conversion from ", " to byte; at path ");
            sbM94s.append(c6046a.m5750h(true));
            throw new JsonSyntaxException(sbM94s.toString());
        } catch (NumberFormatException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // com.google.gson.AbstractC3869p
    /* renamed from: c */
    public final void mo2780c(C6047b c6047b, Object obj) throws IOException {
        if (((Number) obj) == null) {
            c6047b.m5775k();
        } else {
            c6047b.m5781q(r4.byteValue());
        }
    }
}
