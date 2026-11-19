package je;

import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC9979u;
import okio.ByteString;

/* renamed from: je.l */
/* loaded from: classes6.dex */
public final class C9732l {

    /* renamed from: a */
    public static final C9732l f22726a = new C9732l();

    /* renamed from: a */
    public static final String m19342a(String username, String password, Charset charset) {
        AbstractC9979u.m20294g(username, "username");
        AbstractC9979u.m20294g(password, "password");
        AbstractC9979u.m20294g(charset, "charset");
        return "Basic " + ByteString.Companion.encodeString(username + ':' + password, charset).base64();
    }
}
