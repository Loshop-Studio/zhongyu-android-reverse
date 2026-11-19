package androidx.compose.p006ui.autofill;

import android.view.View;
import android.view.autofill.AutofillManager$AutofillCallback;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p006ui.ExperimentalComposeUiApi;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p015c.AbstractC2747p;

@RequiresApi(26)
@Metadata(m5174d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\u000e"}, m5175d2 = {"Landroidx/compose/ui/autofill/AutofillCallback;", "Landroid/view/autofill/AutofillManager$AutofillCallback;", "()V", "onAutofillEvent", "", "view", "Landroid/view/View;", "virtualId", "", NotificationCompat.CATEGORY_EVENT, "register", "autofill", "Landroidx/compose/ui/autofill/AndroidAutofill;", "unregister", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class AutofillCallback extends AutofillManager$AutofillCallback {
    public static final AutofillCallback INSTANCE = new AutofillCallback();

    private AutofillCallback() {
    }

    public void onAutofillEvent(View view, int virtualId, int event) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAutofillEvent(view, virtualId, event);
    }

    @DoNotInline
    @ExperimentalComposeUiApi
    public final void register(AndroidAutofill autofill) {
        Intrinsics.checkNotNullParameter(autofill, "autofill");
        autofill.getAutofillManager().registerCallback(AbstractC2747p.m1553a(this));
    }

    @DoNotInline
    @ExperimentalComposeUiApi
    public final void unregister(AndroidAutofill autofill) {
        Intrinsics.checkNotNullParameter(autofill, "autofill");
        autofill.getAutofillManager().unregisterCallback(AbstractC2747p.m1553a(this));
    }
}
