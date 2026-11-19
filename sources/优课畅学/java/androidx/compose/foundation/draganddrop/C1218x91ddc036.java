package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p013ui.Modifier;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10574p;

/* renamed from: androidx.compose.foundation.draganddrop.AndroidDragAndDropSource_androidKt__LegacyDragAndDropSourceWithDefaultPainter_androidKt */
/* loaded from: classes.dex */
final /* synthetic */ class C1218x91ddc036 {
    @InterfaceC8721a
    @ExperimentalFoundationApi
    public static final Modifier dragAndDropSource(Modifier modifier, InterfaceC10574p interfaceC10574p) {
        return modifier.then(new LegacyDragAndDropSourceWithDefaultShadowElement(interfaceC10574p));
    }
}
