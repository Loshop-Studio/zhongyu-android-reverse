package androidx.compose.p013ui.autofill;

import android.view.View;
import android.view.autofill.AutofillManager$AutofillCallback;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@RequiresApi(26)
@Metadata(m13557d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f¨\u0006\u000e"}, m13558d2 = {"Landroidx/compose/ui/autofill/AutofillSemanticCallback;", "Landroid/view/autofill/AutofillManager$AutofillCallback;", "()V", "onAutofillEvent", "", "view", "Landroid/view/View;", "virtualId", "", NotificationCompat.CATEGORY_EVENT, "register", "androidAutofillManager", "Landroidx/compose/ui/autofill/AndroidAutofillManager;", "unregister", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class AutofillSemanticCallback extends AutofillManager$AutofillCallback {
    public static final int $stable = 0;
    public static final AutofillSemanticCallback INSTANCE = new AutofillSemanticCallback();

    private AutofillSemanticCallback() {
    }

    public void onAutofillEvent(View view, int virtualId, int event) {
        super.onAutofillEvent(view, virtualId, event);
    }

    public final void register(AndroidAutofillManager androidAutofillManager) {
        PlatformAutofillManager platformAutofillManager = androidAutofillManager.getPlatformAutofillManager();
        Intrinsics.checkNotNull(platformAutofillManager, "null cannot be cast to non-null type androidx.compose.ui.autofill.PlatformAutofillManagerImpl");
        ((PlatformAutofillManagerImpl) platformAutofillManager).getPlatformAndroidManager().registerCallback(AbstractC2612y.m1238a(this));
    }

    public final void unregister(AndroidAutofillManager androidAutofillManager) {
        PlatformAutofillManager platformAutofillManager = androidAutofillManager.getPlatformAutofillManager();
        Intrinsics.checkNotNull(platformAutofillManager, "null cannot be cast to non-null type androidx.compose.ui.autofill.PlatformAutofillManagerImpl");
        ((PlatformAutofillManagerImpl) platformAutofillManager).getPlatformAndroidManager().unregisterCallback(AbstractC2612y.m1238a(this));
    }
}
