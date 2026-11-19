package androidx.compose.p013ui.platform;

import android.view.ActionMode;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
@RequiresApi(23)
/* loaded from: classes2.dex */
public final class TextToolbarHelperMethods {
    public static final int $stable = 0;
    public static final TextToolbarHelperMethods INSTANCE = new TextToolbarHelperMethods();

    private TextToolbarHelperMethods() {
    }

    @RequiresApi(23)
    public final void invalidateContentRect(ActionMode actionMode) {
        actionMode.invalidateContentRect();
    }

    @RequiresApi(23)
    public final ActionMode startActionMode(View view, ActionMode.Callback callback, int i10) {
        return view.startActionMode(callback, i10);
    }
}
