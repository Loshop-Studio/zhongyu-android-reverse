package androidx.core.view;

import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.ReplaceWith;
import androidx.annotation.RequiresApi;
import androidx.core.internal.view.SupportMenu;

/* loaded from: classes2.dex */
public final class MenuCompat {

    @RequiresApi(28)
    public static class Api28Impl {
        private Api28Impl() {
        }

        public static void setGroupDividerEnabled(Menu menu, boolean z9) {
            menu.setGroupDividerEnabled(z9);
        }
    }

    private MenuCompat() {
    }

    public static void setGroupDividerEnabled(Menu menu, boolean z9) {
        if (menu instanceof SupportMenu) {
            ((SupportMenu) menu).setGroupDividerEnabled(z9);
        } else if (Build.VERSION.SDK_INT >= 28) {
            Api28Impl.setGroupDividerEnabled(menu, z9);
        }
    }

    @ReplaceWith(expression = "item.setShowAsAction(actionEnum)")
    @Deprecated
    public static void setShowAsAction(MenuItem menuItem, int i10) {
        menuItem.setShowAsAction(i10);
    }
}
