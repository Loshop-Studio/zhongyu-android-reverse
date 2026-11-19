package androidx.core.view.autofill;

import android.view.autofill.AutofillId;
import androidx.annotation.RequiresApi;
import androidx.compose.p011ui.graphics.AbstractC2117e;

/* loaded from: classes2.dex */
public class AutofillIdCompat {
    private final Object mWrappedObj;

    @RequiresApi(26)
    private AutofillIdCompat(AutofillId autofillId) {
        this.mWrappedObj = autofillId;
    }

    @RequiresApi(26)
    public static AutofillIdCompat toAutofillIdCompat(AutofillId autofillId) {
        return new AutofillIdCompat(autofillId);
    }

    @RequiresApi(26)
    public AutofillId toAutofillId() {
        return AbstractC2117e.m1305o(this.mWrappedObj);
    }
}
