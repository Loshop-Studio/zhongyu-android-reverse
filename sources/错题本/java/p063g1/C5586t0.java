package p063g1;

import com.google.gson.AbstractC3869p;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.util.Locale;
import java.util.StringTokenizer;
import p104l1.C6046a;
import p104l1.C6047b;

/* renamed from: g1.t0 */
/* loaded from: classes2.dex */
public class C5586t0 extends AbstractC3869p {
    @Override // com.google.gson.AbstractC3869p
    /* renamed from: b */
    public final Object mo2779b(C6046a c6046a) {
        if (c6046a.m5764x() == JsonToken.NULL) {
            c6046a.m5760t();
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(c6046a.m5762v(), "_");
        String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
    }

    @Override // com.google.gson.AbstractC3869p
    /* renamed from: c */
    public final void mo2780c(C6047b c6047b, Object obj) throws IOException {
        Locale locale = (Locale) obj;
        c6047b.m5783s(locale == null ? null : locale.toString());
    }
}
