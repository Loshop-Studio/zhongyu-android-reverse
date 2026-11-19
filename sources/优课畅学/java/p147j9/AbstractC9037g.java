package p147j9;

import java.text.Normalizer;
import kotlin.jvm.internal.AbstractC9133u;

/* renamed from: j9.g */
/* loaded from: classes5.dex */
public abstract class AbstractC9037g {
    /* renamed from: a */
    public static final String m15739a(String string) {
        AbstractC9133u.m16133g(string, "string");
        String strNormalize = Normalizer.normalize(string, Normalizer.Form.NFC);
        AbstractC9133u.m16132f(strNormalize, "normalize(...)");
        return strNormalize;
    }
}
