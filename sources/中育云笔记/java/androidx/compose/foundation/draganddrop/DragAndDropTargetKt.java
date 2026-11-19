package androidx.compose.foundation.draganddrop;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.draganddrop.DragAndDropTarget;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
public final class DragAndDropTargetKt {
    public static final Modifier dragAndDropTarget(Modifier modifier, InterfaceC9540l interfaceC9540l, DragAndDropTarget dragAndDropTarget) {
        return modifier.then(new DropTargetElement(interfaceC9540l, dragAndDropTarget));
    }
}
