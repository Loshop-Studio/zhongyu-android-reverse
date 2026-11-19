package p063g1;

import com.google.gson.AbstractC3869p;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.net.InetAddress;
import p104l1.C6046a;
import p104l1.C6047b;

/* renamed from: g1.p0 */
/* loaded from: classes2.dex */
public class C5578p0 extends AbstractC3869p {
    @Override // com.google.gson.AbstractC3869p
    /* renamed from: b */
    public final Object mo2779b(C6046a c6046a) {
        if (c6046a.m5764x() != JsonToken.NULL) {
            return InetAddress.getByName(c6046a.m5762v());
        }
        c6046a.m5760t();
        return null;
    }

    @Override // com.google.gson.AbstractC3869p
    /* renamed from: c */
    public final void mo2780c(C6047b c6047b, Object obj) throws IOException {
        InetAddress inetAddress = (InetAddress) obj;
        c6047b.m5783s(inetAddress == null ? null : inetAddress.getHostAddress());
    }
}
