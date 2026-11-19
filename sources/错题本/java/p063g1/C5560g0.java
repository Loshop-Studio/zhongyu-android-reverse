package p063g1;

import com.google.gson.AbstractC3869p;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import p104l1.C6046a;
import p104l1.C6047b;

/* renamed from: g1.g0 */
/* loaded from: classes2.dex */
public class C5560g0 extends AbstractC3869p {
    @Override // com.google.gson.AbstractC3869p
    /* renamed from: b */
    public final Object mo2779b(C6046a c6046a) throws IOException {
        JsonToken jsonTokenM5764x = c6046a.m5764x();
        if (jsonTokenM5764x != JsonToken.NULL) {
            return jsonTokenM5764x == JsonToken.BOOLEAN ? Boolean.toString(c6046a.m5754n()) : c6046a.m5762v();
        }
        c6046a.m5760t();
        return null;
    }

    @Override // com.google.gson.AbstractC3869p
    /* renamed from: c */
    public final void mo2780c(C6047b c6047b, Object obj) throws IOException {
        c6047b.m5783s((String) obj);
    }
}
