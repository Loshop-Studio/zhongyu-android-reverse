package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p013ui.Modifier;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes.dex */
final /* synthetic */ class DragAndDropSourceKt__LegacyDragAndDropSource_androidKt {
    @InterfaceC8721a
    @ExperimentalFoundationApi
    public static final Modifier dragAndDropSource(Modifier modifier, InterfaceC10570l interfaceC10570l, InterfaceC10574p interfaceC10574p) {
        return modifier.then(new LegacyDragAndDropSourceElement(interfaceC10570l, interfaceC10574p));
    }
}
