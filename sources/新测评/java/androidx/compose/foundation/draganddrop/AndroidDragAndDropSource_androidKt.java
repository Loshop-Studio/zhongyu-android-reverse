package androidx.compose.foundation.draganddrop;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p013ui.Modifier;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

@Metadata(m13557d1 = {"androidx/compose/foundation/draganddrop/AndroidDragAndDropSource_androidKt__LegacyDragAndDropSourceWithDefaultPainter_androidKt"}, m13559k = 4, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes.dex */
public final class AndroidDragAndDropSource_androidKt {
    @Deprecated(message = "Replaced by overload with a callback for obtain a transfer data,start detection is performed by Compose itself", replaceWith = @ReplaceWith(expression = "Modifier.dragAndDropSource(transferData)", imports = {}))
    @ExperimentalFoundationApi
    public static final Modifier dragAndDropSource(Modifier modifier, Function2<? super DragAndDropSourceScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return C1189x91ddc036.dragAndDropSource(modifier, function2);
    }
}
