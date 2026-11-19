package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p011ui.Modifier;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"androidx/compose/foundation/draganddrop/DragAndDropSourceKt__DragAndDropSourceKt", "androidx/compose/foundation/draganddrop/DragAndDropSourceKt__LegacyDragAndDropSource_androidKt"}, m5111k = 4, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class DragAndDropSourceKt {
    @NotNull
    public static final Modifier dragAndDropSource(@NotNull Modifier modifier, @NotNull InterfaceC6471c interfaceC6471c) {
        return DragAndDropSourceKt__DragAndDropSourceKt.dragAndDropSource(modifier, interfaceC6471c);
    }

    @NotNull
    public static final Modifier dragAndDropSource(@NotNull Modifier modifier, @NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC6471c interfaceC6471c2) {
        return DragAndDropSourceKt__DragAndDropSourceKt.dragAndDropSource(modifier, interfaceC6471c, interfaceC6471c2);
    }

    @Deprecated(message = "Replaced by overload with a callback for obtain a transfer data,start detection is performed by Compose itself", replaceWith = @ReplaceWith(expression = "Modifier.dragAndDropSource(transferData)", imports = {}))
    @ExperimentalFoundationApi
    @NotNull
    public static final Modifier dragAndDropSource(@NotNull Modifier modifier, @NotNull InterfaceC6471c interfaceC6471c, @NotNull InterfaceC6473e interfaceC6473e) {
        return DragAndDropSourceKt__LegacyDragAndDropSource_androidKt.dragAndDropSource(modifier, interfaceC6471c, interfaceC6473e);
    }
}
