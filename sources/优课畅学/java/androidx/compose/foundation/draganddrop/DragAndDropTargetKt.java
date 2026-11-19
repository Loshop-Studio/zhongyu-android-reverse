package androidx.compose.foundation.draganddrop;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.draganddrop.DragAndDropTarget;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public final class DragAndDropTargetKt {
    public static final Modifier dragAndDropTarget(Modifier modifier, InterfaceC10570l interfaceC10570l, DragAndDropTarget dragAndDropTarget) {
        return modifier.then(new DropTargetElement(interfaceC10570l, dragAndDropTarget));
    }
}
