package androidx.compose.foundation.draganddrop;

import androidx.compose.p014ui.Modifier;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
final /* synthetic */ class DragAndDropSourceKt__DragAndDropSourceKt {
    public static final Modifier dragAndDropSource(Modifier modifier, InterfaceC9540l interfaceC9540l) {
        return modifier.then(new DragAndDropSourceWithDefaultShadowElement(DragAndDropSourceDefaults.INSTANCE.getDefaultStartDetector(), interfaceC9540l));
    }

    public static final Modifier dragAndDropSource(Modifier modifier, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2) {
        return modifier.then(new DragAndDropSourceElement(interfaceC9540l, DragAndDropSourceDefaults.INSTANCE.getDefaultStartDetector(), interfaceC9540l2));
    }
}
