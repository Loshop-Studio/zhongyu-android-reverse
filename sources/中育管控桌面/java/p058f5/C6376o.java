package p058f5;

import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* renamed from: f5.o */
/* loaded from: classes4.dex */
public final class C6376o {

    /* renamed from: a */
    public static final C6376o f7939a = new C6376o();

    /* renamed from: a */
    public static final String m6750a(String username, String password, Charset charset) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return "Basic " + ByteString.INSTANCE.encodeString(username + ':' + password, charset).base64();
    }
}
