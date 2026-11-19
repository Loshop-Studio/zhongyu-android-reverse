package androidx.compose.p014ui.autofill;

import java.util.Set;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10985z0;

/* loaded from: classes2.dex */
final class AndroidContentType implements ContentType {
    private final Set<String> androidAutofillHints;

    public AndroidContentType(Set<String> set) {
        this.androidAutofillHints = set;
    }

    public final Set<String> getAndroidAutofillHints() {
        return this.androidAutofillHints;
    }

    @Override // androidx.compose.p014ui.autofill.ContentType
    public ContentType plus(ContentType contentType) {
        AbstractC9979u.m20292e(contentType, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        return new AndroidContentType(AbstractC10985z0.m24167m(this.androidAutofillHints, ((AndroidContentType) contentType).androidAutofillHints));
    }
}
