package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p014ui.Modifier;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.InterfaceC10770a;

/* loaded from: classes.dex */
final /* synthetic */ class DragAndDropSourceKt__LegacyDragAndDropSource_androidKt {
    @InterfaceC10770a
    @ExperimentalFoundationApi
    public static final Modifier dragAndDropSource(Modifier modifier, InterfaceC9540l interfaceC9540l, InterfaceC9544p interfaceC9544p) {
        return modifier.then(new LegacyDragAndDropSourceElement(interfaceC9540l, interfaceC9544p));
    }
}
