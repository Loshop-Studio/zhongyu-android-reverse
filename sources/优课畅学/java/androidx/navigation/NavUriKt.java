package androidx.navigation;

import android.net.Uri;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class NavUriKt {
    public static final Uri NavUri(String uriString) {
        AbstractC9133u.m16133g(uriString, "uriString");
        return NavUriUtils.INSTANCE.parse(uriString);
    }
}
