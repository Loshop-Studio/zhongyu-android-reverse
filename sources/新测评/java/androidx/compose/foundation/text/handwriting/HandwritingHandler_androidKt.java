package androidx.compose.foundation.text.handwriting;

import androidx.compose.p013ui.Modifier;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, m13558d2 = {"handwritingHandler", "Landroidx/compose/ui/Modifier;", "foundation_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes.dex */
public final class HandwritingHandler_androidKt {
    public static final Modifier handwritingHandler(Modifier modifier) {
        return StylusHandwriting_androidKt.isStylusHandwritingSupported() ? modifier.then(new HandwritingHandlerElement()) : modifier;
    }
}
