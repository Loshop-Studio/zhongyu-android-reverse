package androidx.compose.p011ui.autofill;

import androidx.collection.MutableScatterMap;
import androidx.compose.p011ui.semantics.SemanticsActions;
import androidx.compose.p011ui.semantics.SemanticsConfiguration;
import androidx.compose.p011ui.semantics.SemanticsProperties;
import androidx.compose.p011ui.semantics.SemanticsPropertyKey;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u00020\u0003*\u00020\u0004H\u0002\u001a\f\u0010\u0005\u001a\u00020\u0003*\u00020\u0004H\u0002\u001a\f\u0010\u0006\u001a\u00020\u0003*\u00020\u0004H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m5110d2 = {"logTag", "", "isAutofillable", "", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "isRelatedToAutoCommit", "isRelatedToAutofill", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class AndroidAutofillManager_androidKt {

    @NotNull
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
