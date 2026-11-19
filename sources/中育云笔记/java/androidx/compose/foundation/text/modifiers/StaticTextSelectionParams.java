package androidx.compose.foundation.text.modifiers;

import androidx.compose.p014ui.graphics.Path;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.text.TextLayoutResult;
import androidx.compose.p014ui.text.style.TextOverflow;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public class StaticTextSelectionParams {
    private final LayoutCoordinates layoutCoordinates;
    private final TextLayoutResult textLayoutResult;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final StaticTextSelectionParams Empty = new StaticTextSelectionParams(null, null);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final StaticTextSelectionParams getEmpty() {
            return StaticTextSelectionParams.Empty;
        }

        private Companion() {
        }
    }

    public StaticTextSelectionParams(LayoutCoordinates layoutCoordinates, TextLayoutResult textLayoutResult) {
        this.layoutCoordinates = layoutCoordinates;
        this.textLayoutResult = textLayoutResult;
    }

    public static /* synthetic */ StaticTextSelectionParams copy$default(StaticTextSelectionParams staticTextSelectionParams, LayoutCoordinates layoutCoordinates, TextLayoutResult textLayoutResult, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i10 & 1) != 0) {
            layoutCoordinates = staticTextSelectionParams.layoutCoordinates;
        }
        if ((i10 & 2) != 0) {
            textLayoutResult = staticTextSelectionParams.textLayoutResult;
        }
        return staticTextSelectionParams.copy(layoutCoordinates, textLayoutResult);
    }

    public final StaticTextSelectionParams copy(LayoutCoordinates layoutCoordinates, TextLayoutResult textLayoutResult) {
        return new StaticTextSelectionParams(layoutCoordinates, textLayoutResult);
    }

    public final LayoutCoordinates getLayoutCoordinates() {
        return this.layoutCoordinates;
    }

    public Path getPathForRange(int i10, int i11) {
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        if (textLayoutResult != null) {
            return textLayoutResult.getPathForRange(i10, i11);
        }
        return null;
    }

    public boolean getShouldClip() {
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        return (textLayoutResult == null || TextOverflow.m33427equalsimpl0(textLayoutResult.getLayoutInput().m32933getOverflowgIe3tQ8(), TextOverflow.Companion.m33440getVisiblegIe3tQ8()) || !textLayoutResult.getHasVisualOverflow()) ? false : true;
    }

    public final TextLayoutResult getTextLayoutResult() {
        return this.textLayoutResult;
    }
}
