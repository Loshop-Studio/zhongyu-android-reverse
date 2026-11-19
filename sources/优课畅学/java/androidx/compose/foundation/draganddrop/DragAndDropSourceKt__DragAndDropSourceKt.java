package androidx.compose.foundation.draganddrop;

import androidx.compose.p013ui.Modifier;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
final /* synthetic */ class DragAndDropSourceKt__DragAndDropSourceKt {
    public static final Modifier dragAndDropSource(Modifier modifier, InterfaceC10570l interfaceC10570l) {
        return modifier.then(new DragAndDropSourceWithDefaultShadowElement(DragAndDropSourceDefaults.INSTANCE.getDefaultStartDetector(), interfaceC10570l));
    }

    public static final Modifier dragAndDropSource(Modifier modifier, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2) {
        return modifier.then(new DragAndDropSourceElement(interfaceC10570l, DragAndDropSourceDefaults.INSTANCE.getDefaultStartDetector(), interfaceC10570l2));
    }
}
