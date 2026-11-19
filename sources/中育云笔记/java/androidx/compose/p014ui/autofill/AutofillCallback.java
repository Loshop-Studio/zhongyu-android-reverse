package androidx.compose.p014ui.autofill;

import android.view.View;
import android.view.autofill.AutofillManager$AutofillCallback;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
@RequiresApi(26)
/* loaded from: classes2.dex */
public final class AutofillCallback extends AutofillManager$AutofillCallback {
    public static final int $stable = 0;
    public static final AutofillCallback INSTANCE = new AutofillCallback();

    private AutofillCallback() {
    }

    public void onAutofillEvent(View view, int i10, int i11) {
        super.onAutofillEvent(view, i10, i11);
    }

    public final void register(AndroidAutofill androidAutofill) {
        androidAutofill.getAutofillManager().registerCallback(AbstractC2671y.m1088a(this));
    }

    public final void unregister(AndroidAutofill androidAutofill) {
        androidAutofill.getAutofillManager().unregisterCallback(AbstractC2671y.m1088a(this));
    }
}
