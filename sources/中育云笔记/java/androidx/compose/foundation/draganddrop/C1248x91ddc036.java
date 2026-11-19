package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p014ui.Modifier;
import p181hd.InterfaceC9544p;
import p309qc.InterfaceC10770a;

/* renamed from: androidx.compose.foundation.draganddrop.AndroidDragAndDropSource_androidKt__LegacyDragAndDropSourceWithDefaultPainter_androidKt */
/* loaded from: classes.dex */
final /* synthetic */ class C1248x91ddc036 {
    @InterfaceC10770a
    @ExperimentalFoundationApi
    public static final Modifier dragAndDropSource(Modifier modifier, InterfaceC9544p interfaceC9544p) {
        return modifier.then(new LegacyDragAndDropSourceWithDefaultShadowElement(interfaceC9544p));
    }
}
