package androidx.compose.p013ui.autofill;

import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
@RequiresApi(27)
/* loaded from: classes2.dex */
public final class AutofillApi27Helper {
    public static final int $stable = 0;
    public static final AutofillApi27Helper INSTANCE = new AutofillApi27Helper();

    private AutofillApi27Helper() {
    }

    @RequiresApi(27)
    public final void notifyViewVisibilityChanged(View view, AutofillManager autofillManager, int i10, boolean z10) {
        autofillManager.notifyViewVisibilityChanged(view, i10, z10);
    }
}
