package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.text.style.ResolvedTextDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class TextFieldHandleState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final TextFieldHandleState Hidden = new TextFieldHandleState(false, Offset.Companion.m30652getUnspecifiedF1C5BW0(), 0.0f, ResolvedTextDirection.Ltr, false, null);
    private final ResolvedTextDirection direction;
    private final boolean handlesCrossed;
    private final float lineHeight;
    private final long position;
    private final boolean visible;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final TextFieldHandleState getHidden() {
            return TextFieldHandleState.Hidden;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TextFieldHandleState(boolean z10, long j10, float f10, ResolvedTextDirection resolvedTextDirection, boolean z11, AbstractC9972n abstractC9972n) {
        this(z10, j10, f10, resolvedTextDirection, z11);
    }

    /* renamed from: copy-YqVAtuI$default, reason: not valid java name */
    public static /* synthetic */ TextFieldHandleState m28106copyYqVAtuI$default(TextFieldHandleState textFieldHandleState, boolean z10, long j10, float f10, ResolvedTextDirection resolvedTextDirection, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = textFieldHandleState.visible;
        }
        if ((i10 & 2) != 0) {
            j10 = textFieldHandleState.position;
        }
        if ((i10 & 4) != 0) {
            f10 = textFieldHandleState.lineHeight;
        }
        if ((i10 & 8) != 0) {
            resolvedTextDirection = textFieldHandleState.direction;
        }
        if ((i10 & 16) != 0) {
            z11 = textFieldHandleState.handlesCrossed;
        }
        boolean z12 = z11;
        float f11 = f10;
        return textFieldHandleState.m28108copyYqVAtuI(z10, j10, f11, resolvedTextDirection, z12);
    }

    public final boolean component1() {
        return this.visible;
    }

    /* renamed from: component2-F1C5BW0, reason: not valid java name */
    public final long m28107component2F1C5BW0() {
        return this.position;
    }

    public final float component3() {
        return this.lineHeight;
    }

    public final ResolvedTextDirection component4() {
        return this.direction;
    }

    public final boolean component5() {
        return this.handlesCrossed;
    }

    /* renamed from: copy-YqVAtuI, reason: not valid java name */
    public final TextFieldHandleState m28108copyYqVAtuI(boolean z10, long j10, float f10, ResolvedTextDirection resolvedTextDirection, boolean z11) {
        return new TextFieldHandleState(z10, j10, f10, resolvedTextDirection, z11, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldHandleState)) {
            return false;
        }
        TextFieldHandleState textFieldHandleState = (TextFieldHandleState) obj;
        return this.visible == textFieldHandleState.visible && Offset.m30634equalsimpl0(this.position, textFieldHandleState.position) && Float.compare(this.lineHeight, textFieldHandleState.lineHeight) == 0 && this.direction == textFieldHandleState.direction && this.handlesCrossed == textFieldHandleState.handlesCrossed;
    }

    public final ResolvedTextDirection getDirection() {
        return this.direction;
    }

    public final boolean getHandlesCrossed() {
        return this.handlesCrossed;
    }

    public final float getLineHeight() {
        return this.lineHeight;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m28109getPositionF1C5BW0() {
        return this.position;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.visible) * 31) + Offset.m30639hashCodeimpl(this.position)) * 31) + Float.hashCode(this.lineHeight)) * 31) + this.direction.hashCode()) * 31) + Boolean.hashCode(this.handlesCrossed);
    }

    public String toString() {
        return "TextFieldHandleState(visible=" + this.visible + ", position=" + ((Object) Offset.m30645toStringimpl(this.position)) + ", lineHeight=" + this.lineHeight + ", direction=" + this.direction + ", handlesCrossed=" + this.handlesCrossed + ')';
    }

    private TextFieldHandleState(boolean z10, long j10, float f10, ResolvedTextDirection resolvedTextDirection, boolean z11) {
        this.visible = z10;
        this.position = j10;
        this.lineHeight = f10;
        this.direction = resolvedTextDirection;
        this.handlesCrossed = z11;
    }
}
