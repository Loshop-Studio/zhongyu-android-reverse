package androidx.compose.p011ui.autofill;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Deprecated(message = "\n        You no longer have to call these apis when focus changes. They will be called\n        automatically when you Use the new semantics based APIs for autofill. Use the\n        androidx.compose.ui.autofill.ContentType and androidx.compose.ui.autofill.ContentDataType\n        semantics properties instead.\n        ")
@Metadata(m5109d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m5110d2 = {"Landroidx/compose/ui/autofill/Autofill;", "", "Landroidx/compose/ui/autofill/AutofillNode;", "autofillNode", "Ld6/s;", "requestAutofillForNode", "(Landroidx/compose/ui/autofill/AutofillNode;)V", "cancelAutofillForNode", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public interface Autofill {
    void cancelAutofillForNode(@NotNull AutofillNode autofillNode);

    void requestAutofillForNode(@NotNull AutofillNode autofillNode);
}
