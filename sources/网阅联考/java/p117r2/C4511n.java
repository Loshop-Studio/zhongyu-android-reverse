package p117r2;

import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* renamed from: r2.n */
/* loaded from: classes2.dex */
public final class C4511n {

    /* renamed from: a */
    public static final C4511n f5513a = new C4511n();

    /* renamed from: a */
    public static final String m5916a(String username, String password, Charset charset) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return "Basic " + ByteString.INSTANCE.encodeString(username + ':' + password, charset).base64();
    }
}
