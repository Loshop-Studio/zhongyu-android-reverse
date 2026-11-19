package androidx.compose.p011ui.platform;

import android.content.ClipboardManager;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

@RequiresApi(28)
@Metadata(m5109d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m5110d2 = {"Landroidx/compose/ui/platform/Api28ClipboardManagerClipClear;", "", "<init>", "()V", "Landroid/content/ClipboardManager;", "clipboardManager", "Ld6/s;", "clearPrimaryClip", "(Landroid/content/ClipboardManager;)V", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
final class Api28ClipboardManagerClipClear {

    @NotNull
    public static final Api28ClipboardManagerClipClear INSTANCE = new Api28ClipboardManagerClipClear();

    private Api28ClipboardManagerClipClear() {
    }

    @JvmStatic
    public static final void clearPrimaryClip(@NotNull ClipboardManager clipboardManager) {
        clipboardManager.clearPrimaryClip();
    }
}
