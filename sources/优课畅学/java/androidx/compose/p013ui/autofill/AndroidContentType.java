package androidx.compose.p013ui.autofill;

import java.util.Set;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8814x0;

/* loaded from: classes2.dex */
final class AndroidContentType implements ContentType {
    private final Set<String> androidAutofillHints;

    public AndroidContentType(Set<String> set) {
        this.androidAutofillHints = set;
    }

    public final Set<String> getAndroidAutofillHints() {
        return this.androidAutofillHints;
    }

    @Override // androidx.compose.p013ui.autofill.ContentType
    public ContentType plus(ContentType contentType) {
        AbstractC9133u.m16131e(contentType, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        return new AndroidContentType(AbstractC8814x0.m14793k(this.androidAutofillHints, ((AndroidContentType) contentType).androidAutofillHints));
    }
}
