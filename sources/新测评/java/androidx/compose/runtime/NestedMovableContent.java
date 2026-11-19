package androidx.compose.runtime;

import kotlin.Metadata;

@InternalComposeApi
@Metadata(m13557d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, m13558d2 = {"Landroidx/compose/runtime/NestedMovableContent;", "", "content", "Landroidx/compose/runtime/MovableContentStateReference;", "container", "(Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentStateReference;)V", "getContainer", "()Landroidx/compose/runtime/MovableContentStateReference;", "getContent", "runtime_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
final class NestedMovableContent {
    private final MovableContentStateReference container;
    private final MovableContentStateReference content;

    public NestedMovableContent(MovableContentStateReference movableContentStateReference, MovableContentStateReference movableContentStateReference2) {
        this.content = movableContentStateReference;
        this.container = movableContentStateReference2;
    }

    public final MovableContentStateReference getContainer() {
        return this.container;
    }

    public final MovableContentStateReference getContent() {
        return this.content;
    }
}
