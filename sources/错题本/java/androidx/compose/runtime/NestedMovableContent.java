package androidx.compose.runtime;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@InternalComposeApi
@Metadata(m5109d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, m5110d2 = {"Landroidx/compose/runtime/NestedMovableContent;", "", "content", "Landroidx/compose/runtime/MovableContentStateReference;", "container", "(Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentStateReference;)V", "getContainer", "()Landroidx/compose/runtime/MovableContentStateReference;", "getContent", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class NestedMovableContent {

    @NotNull
    private final MovableContentStateReference container;

    @NotNull
    private final MovableContentStateReference content;

    public NestedMovableContent(@NotNull MovableContentStateReference movableContentStateReference, @NotNull MovableContentStateReference movableContentStateReference2) {
        this.content = movableContentStateReference;
        this.container = movableContentStateReference2;
    }

    @NotNull
    public final MovableContentStateReference getContainer() {
        return this.container;
    }

    @NotNull
    public final MovableContentStateReference getContent() {
        return this.content;
    }
}
