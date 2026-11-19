package androidx.core.app;

import android.app.Dialog;
import android.os.Build;
import android.view.View;
import androidx.annotation.RequiresApi;

/* loaded from: classes2.dex */
public class DialogCompat {

    @RequiresApi(28)
    public static class Api28Impl {
        private Api28Impl() {
        }

        public static <T> T requireViewById(Dialog dialog, int i10) {
            return (T) dialog.requireViewById(i10);
        }
    }

    private DialogCompat() {
    }

    public static View requireViewById(Dialog dialog, int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) Api28Impl.requireViewById(dialog, i10);
        }
        View viewFindViewById = dialog.findViewById(i10);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Dialog");
    }
}
