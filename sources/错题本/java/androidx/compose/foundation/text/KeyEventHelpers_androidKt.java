package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.p011ui.input.key.KeyEventType;
import androidx.compose.p011ui.input.key.KeyEvent_androidKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u000f\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\b"}, m5110d2 = {"Landroidx/compose/ui/input/key/KeyEvent;", "", "cancelsTextSelection-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "cancelsTextSelection", "Ld6/s;", "showCharacterPalette", "()V", "foundation_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class KeyEventHelpers_androidKt {
    /* renamed from: cancelsTextSelection-ZmokQxo, reason: not valid java name */
    public static final boolean m7606cancelsTextSelectionZmokQxo(@NotNull KeyEvent keyEvent) {
        return keyEvent.getKeyCode() == 4 && KeyEventType.m11756equalsimpl0(KeyEvent_androidKt.m11764getTypeZmokQxo(keyEvent), KeyEventType.INSTANCE.m11761getKeyUpCS__XNY());
    }

    public static final void showCharacterPalette() {
    }
}
