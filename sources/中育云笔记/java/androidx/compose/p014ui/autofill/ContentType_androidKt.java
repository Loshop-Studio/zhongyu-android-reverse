package androidx.compose.p014ui.autofill;

import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10981x0;

/* loaded from: classes2.dex */
public final class ContentType_androidKt {
    public static final ContentType ContentType(String str) {
        return new AndroidContentType(AbstractC10981x0.m24158d(str));
    }

    public static final String[] getContentHints(ContentType contentType) {
        AbstractC9979u.m20292e(contentType, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        return (String[]) ((AndroidContentType) contentType).getAndroidAutofillHints().toArray(new String[0]);
    }
}
