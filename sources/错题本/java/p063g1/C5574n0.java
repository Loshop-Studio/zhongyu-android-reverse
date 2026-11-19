package p063g1;

import com.google.gson.AbstractC3869p;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.net.URL;
import p104l1.C6046a;
import p104l1.C6047b;

/* renamed from: g1.n0 */
/* loaded from: classes2.dex */
public class C5574n0 extends AbstractC3869p {
    @Override // com.google.gson.AbstractC3869p
    /* renamed from: b */
    public final Object mo2779b(C6046a c6046a) throws IOException {
        if (c6046a.m5764x() == JsonToken.NULL) {
            c6046a.m5760t();
            return null;
        }
        String strM5762v = c6046a.m5762v();
        if (strM5762v.equals("null")) {
            return null;
        }
        return new URL(strM5762v);
    }

    @Override // com.google.gson.AbstractC3869p
    /* renamed from: c */
    public final void mo2780c(C6047b c6047b, Object obj) throws IOException {
        URL url = (URL) obj;
        c6047b.m5783s(url == null ? null : url.toExternalForm());
    }
}
