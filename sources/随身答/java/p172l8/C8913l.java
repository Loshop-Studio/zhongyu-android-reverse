package p172l8;

import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* renamed from: l8.l */
/* loaded from: classes5.dex */
public final class C8913l {

    /* renamed from: a */
    public static final C8913l f14773a = new C8913l();

    /* renamed from: a */
    public static final String m13890a(String username, String password, Charset charset) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return "Basic " + ByteString.INSTANCE.encodeString(username + ':' + password, charset).base64();
    }
}
