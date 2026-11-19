package androidx.compose.p014ui.autofill;

import android.graphics.Rect;
import android.view.View;
import android.view.autofill.AutofillValue;
import androidx.annotation.RequiresApi;

@RequiresApi(26)
/* loaded from: classes2.dex */
public interface PlatformAutofillManager {
    void cancel();

    void commit();

    void notifyValueChanged(View view, int i10, AutofillValue autofillValue);

    void notifyViewEntered(View view, int i10, Rect rect);

    void notifyViewExited(View view, int i10);

    void notifyViewVisibilityChanged(View view, int i10, boolean z10);

    void requestAutofill(View view, int i10, Rect rect);
}
