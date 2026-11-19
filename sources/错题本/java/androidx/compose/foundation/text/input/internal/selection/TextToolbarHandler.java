package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.p011ui.geometry.Rect;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;

@Metadata(m5109d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m5110d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextToolbarHandler;", "", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "selectionState", "Landroidx/compose/ui/geometry/Rect;", "rect", "Ld6/s;", "showTextToolbar", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/geometry/Rect;Lh6/c;)Ljava/lang/Object;", "hideTextToolbar", "()V", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public interface TextToolbarHandler {
    void hideTextToolbar();

    @Nullable
    Object showTextToolbar(@NotNull TextFieldSelectionState textFieldSelectionState, @NotNull Rect rect, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c);
}
