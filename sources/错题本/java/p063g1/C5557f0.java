package p063g1;

import android.support.v4.media.AbstractC0037f;
import com.google.gson.AbstractC3869p;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import p104l1.C6046a;
import p104l1.C6047b;

/* renamed from: g1.f0 */
/* loaded from: classes2.dex */
public class C5557f0 extends AbstractC3869p {
    @Override // com.google.gson.AbstractC3869p
    /* renamed from: b */
    public final Object mo2779b(C6046a c6046a) throws IOException {
        if (c6046a.m5764x() == JsonToken.NULL) {
            c6046a.m5760t();
            return null;
        }
        String strM5762v = c6046a.m5762v();
        if (strM5762v.length() == 1) {
            return Character.valueOf(strM5762v.charAt(0));
        }
        StringBuilder sbM100y = AbstractC0037f.m100y("Expecting character, got: ", strM5762v, "; at ");
        sbM100y.append(c6046a.m5750h(true));
        throw new JsonSyntaxException(sbM100y.toString());
    }

    @Override // com.google.gson.AbstractC3869p
    /* renamed from: c */
    public final void mo2780c(C6047b c6047b, Object obj) throws IOException {
        Character ch = (Character) obj;
        c6047b.m5783s(ch == null ? null : String.valueOf(ch));
    }
}
