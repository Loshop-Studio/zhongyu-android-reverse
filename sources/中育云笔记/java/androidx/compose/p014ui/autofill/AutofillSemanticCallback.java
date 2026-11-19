package androidx.compose.p014ui.autofill;

import android.view.View;
import android.view.autofill.AutofillManager$AutofillCallback;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
@RequiresApi(26)
/* loaded from: classes2.dex */
public final class AutofillSemanticCallback extends AutofillManager$AutofillCallback {
    public static final int $stable = 0;
    public static final AutofillSemanticCallback INSTANCE = new AutofillSemanticCallback();

    private AutofillSemanticCallback() {
    }

    public void onAutofillEvent(View view, int i10, int i11) {
        super.onAutofillEvent(view, i10, i11);
    }

    public final void register(AndroidAutofillManager androidAutofillManager) {
        PlatformAutofillManager platformAutofillManager = androidAutofillManager.getPlatformAutofillManager();
        AbstractC9979u.m20292e(platformAutofillManager, "null cannot be cast to non-null type androidx.compose.ui.autofill.PlatformAutofillManagerImpl");
        ((PlatformAutofillManagerImpl) platformAutofillManager).getPlatformAndroidManager().registerCallback(AbstractC2671y.m1088a(this));
    }

    public final void unregister(AndroidAutofillManager androidAutofillManager) {
        PlatformAutofillManager platformAutofillManager = androidAutofillManager.getPlatformAutofillManager();
        AbstractC9979u.m20292e(platformAutofillManager, "null cannot be cast to non-null type androidx.compose.ui.autofill.PlatformAutofillManagerImpl");
        ((PlatformAutofillManagerImpl) platformAutofillManager).getPlatformAndroidManager().unregisterCallback(AbstractC2671y.m1088a(this));
    }
}
