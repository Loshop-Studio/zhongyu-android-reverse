package androidx.compose.p014ui.autofill;

import androidx.collection.MutableScatterMap;
import androidx.compose.p014ui.semantics.SemanticsActions;
import androidx.compose.p014ui.semantics.SemanticsConfiguration;
import androidx.compose.p014ui.semantics.SemanticsProperties;
import androidx.compose.p014ui.semantics.SemanticsPropertyKey;

/* loaded from: classes2.dex */
public final class AndroidAutofillManager_androidKt {
    private static final String logTag = "ComposeAutofillManager";

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isAutofillable(SemanticsConfiguration semanticsConfiguration) {
        return semanticsConfiguration.getProps$ui_release().contains(SemanticsActions.INSTANCE.getOnAutofillText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isRelatedToAutoCommit(SemanticsConfiguration semanticsConfiguration) {
        return semanticsConfiguration.getProps$ui_release().contains(SemanticsProperties.INSTANCE.getContentType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isRelatedToAutofill(SemanticsConfiguration semanticsConfiguration) {
        if (semanticsConfiguration.getProps$ui_release().contains(SemanticsActions.INSTANCE.getOnAutofillText())) {
            return true;
        }
        MutableScatterMap<SemanticsPropertyKey<?>, Object> props$ui_release = semanticsConfiguration.getProps$ui_release();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return props$ui_release.contains(semanticsProperties.getContentType()) || semanticsConfiguration.getProps$ui_release().contains(semanticsProperties.getContentDataType());
    }
}
