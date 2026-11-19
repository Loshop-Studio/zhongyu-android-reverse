package androidx.compose.p013ui.autofill;

import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8810v0;

/* loaded from: classes2.dex */
public final class ContentType_androidKt {
    public static final ContentType ContentType(String str) {
        return new AndroidContentType(AbstractC8810v0.m14784d(str));
    }

    public static final String[] getContentHints(ContentType contentType) {
        AbstractC9133u.m16131e(contentType, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        return (String[]) ((AndroidContentType) contentType).getAndroidAutofillHints().toArray(new String[0]);
    }
}
