package p136i9;

import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC9133u;
import okio.ByteString;

/* renamed from: i9.o */
/* loaded from: classes5.dex */
public final class C8917o {

    /* renamed from: a */
    public static final C8917o f16771a = new C8917o();

    /* renamed from: a */
    public static final String m15211a(String username, String password, Charset charset) {
        AbstractC9133u.m16133g(username, "username");
        AbstractC9133u.m16133g(password, "password");
        AbstractC9133u.m16133g(charset, "charset");
        return "Basic " + ByteString.Companion.encodeString(username + ':' + password, charset).base64();
    }
}
