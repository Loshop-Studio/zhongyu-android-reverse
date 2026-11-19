package androidx.compose.p013ui.platform;

import android.content.Context;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p013ui.input.pointer.AndroidPointerIcon;
import androidx.compose.p013ui.input.pointer.AndroidPointerIconType;
import androidx.compose.p013ui.input.pointer.PointerIcon;
import kotlin.jvm.internal.AbstractC9133u;

@RequiresApi(24)
/* loaded from: classes2.dex */
final class AndroidComposeViewVerificationHelperMethodsN {
    public static final AndroidComposeViewVerificationHelperMethodsN INSTANCE = new AndroidComposeViewVerificationHelperMethodsN();

    private AndroidComposeViewVerificationHelperMethodsN() {
    }

    @DoNotInline
    @RequiresApi(24)
    public final void setPointerIcon(View view, PointerIcon pointerIcon) {
        android.view.PointerIcon androidPointerIcon = toAndroidPointerIcon(view.getContext(), pointerIcon);
        if (AbstractC9133u.m16128b(view.getPointerIcon(), androidPointerIcon)) {
            return;
        }
        view.setPointerIcon(androidPointerIcon);
    }

    @RequiresApi(24)
    public final android.view.PointerIcon toAndroidPointerIcon(Context context, PointerIcon pointerIcon) {
        return pointerIcon instanceof AndroidPointerIcon ? ((AndroidPointerIcon) pointerIcon).getPointerIcon() : pointerIcon instanceof AndroidPointerIconType ? android.view.PointerIcon.getSystemIcon(context, ((AndroidPointerIconType) pointerIcon).getType()) : android.view.PointerIcon.getSystemIcon(context, 1000);
    }
}
