package p011a9;

import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* renamed from: a9.l */
/* loaded from: classes5.dex */
public final class C0049l {

    /* renamed from: a */
    public static final C0049l f145a = new C0049l();

    /* renamed from: a */
    public static final String m133a(String username, String password, Charset charset) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return "Basic " + ByteString.INSTANCE.encodeString(username + ':' + password, charset).base64();
    }
}
