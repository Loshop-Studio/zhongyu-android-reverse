package androidx.navigation;

import android.net.Uri;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
public final class NavUriKt {
    public static final Uri NavUri(String uriString) {
        AbstractC9979u.m20294g(uriString, "uriString");
        return NavUriUtils.INSTANCE.parse(uriString);
    }
}
