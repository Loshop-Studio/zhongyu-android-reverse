package androidx.compose.p013ui.autofill;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
@RequiresApi(26)
/* loaded from: classes2.dex */
public final class PlatformAutofillManagerImpl implements PlatformAutofillManager {
    public static final int $stable = 8;
    private final AutofillManager platformAndroidManager;

    public PlatformAutofillManagerImpl(AutofillManager autofillManager) {
        this.platformAndroidManager = autofillManager;
    }

    @Override // androidx.compose.p013ui.autofill.PlatformAutofillManager
    public void cancel() {
        this.platformAndroidManager.cancel();
    }

    @Override // androidx.compose.p013ui.autofill.PlatformAutofillManager
    public void commit() {
        this.platformAndroidManager.commit();
    }

    public final AutofillManager getPlatformAndroidManager() {
        return this.platformAndroidManager;
    }

    @Override // androidx.compose.p013ui.autofill.PlatformAutofillManager
    public void notifyValueChanged(View view, int i10, AutofillValue autofillValue) {
        this.platformAndroidManager.notifyValueChanged(view, i10, autofillValue);
    }

    @Override // androidx.compose.p013ui.autofill.PlatformAutofillManager
    public void notifyViewEntered(View view, int i10, Rect rect) {
        this.platformAndroidManager.notifyViewEntered(view, i10, rect);
    }

    @Override // androidx.compose.p013ui.autofill.PlatformAutofillManager
    public void notifyViewExited(View view, int i10) {
        this.platformAndroidManager.notifyViewExited(view, i10);
    }

    @Override // androidx.compose.p013ui.autofill.PlatformAutofillManager
    public void notifyViewVisibilityChanged(View view, int i10, boolean z10) {
        if (Build.VERSION.SDK_INT >= 27) {
            AutofillApi27Helper.INSTANCE.notifyViewVisibilityChanged(view, this.platformAndroidManager, i10, z10);
        }
    }

    @Override // androidx.compose.p013ui.autofill.PlatformAutofillManager
    public void requestAutofill(View view, int i10, Rect rect) {
        this.platformAndroidManager.requestAutofill(view, i10, rect);
    }
}
