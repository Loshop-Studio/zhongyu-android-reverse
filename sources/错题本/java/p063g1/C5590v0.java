package p063g1;

import android.support.v4.media.AbstractC0037f;
import com.google.gson.AbstractC3869p;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.BitSet;
import p104l1.C6046a;
import p104l1.C6047b;

/* renamed from: g1.v0 */
/* loaded from: classes2.dex */
public class C5590v0 extends AbstractC3869p {
    @Override // com.google.gson.AbstractC3869p
    /* renamed from: b */
    public final Object mo2779b(C6046a c6046a) throws IOException, NumberFormatException {
        BitSet bitSet = new BitSet();
        c6046a.m5743a();
        JsonToken jsonTokenM5764x = c6046a.m5764x();
        int i = 0;
        while (jsonTokenM5764x != JsonToken.END_ARRAY) {
            int i8 = AbstractC5594x0.f8684a[jsonTokenM5764x.ordinal()];
            boolean zM5754n = true;
            if (i8 == 1 || i8 == 2) {
                int iM5756p = c6046a.m5756p();
                if (iM5756p == 0) {
                    zM5754n = false;
                } else if (iM5756p != 1) {
                    StringBuilder sbM94s = AbstractC0037f.m94s(iM5756p, "Invalid bitset value ", ", expected 0 or 1; at path ");
                    sbM94s.append(c6046a.m5750h(true));
                    throw new JsonSyntaxException(sbM94s.toString());
                }
            } else {
                if (i8 != 3) {
                    throw new JsonSyntaxException("Invalid bitset value type: " + jsonTokenM5764x + "; at path " + c6046a.m5750h(false));
                }
                zM5754n = c6046a.m5754n();
            }
            if (zM5754n) {
                bitSet.set(i);
            }
            i++;
            jsonTokenM5764x = c6046a.m5764x();
        }
        c6046a.m5747e();
        return bitSet;
    }

    @Override // com.google.gson.AbstractC3869p
    /* renamed from: c */
    public final void mo2780c(C6047b c6047b, Object obj) throws IOException {
        BitSet bitSet = (BitSet) obj;
        c6047b.m5768b();
        int length = bitSet.length();
        for (int i = 0; i < length; i++) {
            c6047b.m5781q(bitSet.get(i) ? 1L : 0L);
        }
        c6047b.m5771e();
    }
}
