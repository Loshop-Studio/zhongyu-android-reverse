package androidx.navigation;

import android.net.Uri;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class NavUriUtils {
    public static final NavUriUtils INSTANCE = new NavUriUtils();

    private NavUriUtils() {
    }

    public static /* synthetic */ String encode$default(NavUriUtils navUriUtils, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return navUriUtils.encode(str, str2);
    }

    public final String decode(String s10) {
        AbstractC9133u.m16133g(s10, "s");
        String strDecode = Uri.decode(s10);
        AbstractC9133u.m16132f(strDecode, "decode(...)");
        return strDecode;
    }

    public final String encode(String s10, String str) {
        AbstractC9133u.m16133g(s10, "s");
        String strEncode = Uri.encode(s10, str);
        AbstractC9133u.m16132f(strEncode, "encode(...)");
        return strEncode;
    }

    public final Uri parse(String uriString) {
        AbstractC9133u.m16133g(uriString, "uriString");
        Uri uri = Uri.parse(uriString);
        AbstractC9133u.m16132f(uri, "parse(...)");
        return uri;
    }
}
