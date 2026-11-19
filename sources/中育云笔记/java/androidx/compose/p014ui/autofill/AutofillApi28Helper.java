package androidx.compose.p014ui.autofill;

import android.view.ViewStructure;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
@RequiresApi(28)
/* loaded from: classes2.dex */
public final class AutofillApi28Helper {
    public static final int $stable = 0;
    public static final AutofillApi28Helper INSTANCE = new AutofillApi28Helper();

    private AutofillApi28Helper() {
    }

    @RequiresApi(28)
    public final void setMaxTextLength(ViewStructure viewStructure, int i10) {
        viewStructure.setMaxTextLength(i10);
    }
}
