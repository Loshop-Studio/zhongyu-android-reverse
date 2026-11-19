package androidx.compose.foundation.text.input.internal;

import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
@RequiresApi(34)
/* loaded from: classes.dex */
public final class Api34StartStylusHandwriting {
    public static final int $stable = 0;
    public static final Api34StartStylusHandwriting INSTANCE = new Api34StartStylusHandwriting();

    private Api34StartStylusHandwriting() {
    }

    public final void startStylusHandwriting(android.view.inputmethod.InputMethodManager inputMethodManager, View view) {
        inputMethodManager.startStylusHandwriting(view);
    }
}
