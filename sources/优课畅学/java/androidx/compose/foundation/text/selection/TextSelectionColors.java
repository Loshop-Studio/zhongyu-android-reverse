package androidx.compose.foundation.text.selection;

import androidx.compose.p013ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes.dex */
public final class TextSelectionColors {
    public static final int $stable = 0;
    private final long backgroundColor;
    private final long handleColor;

    public /* synthetic */ TextSelectionColors(long j10, long j11, AbstractC9126n abstractC9126n) {
        this(j10, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextSelectionColors)) {
            return false;
        }
        TextSelectionColors textSelectionColors = (TextSelectionColors) obj;
        return Color.m24277equalsimpl0(this.handleColor, textSelectionColors.handleColor) && Color.m24277equalsimpl0(this.backgroundColor, textSelectionColors.backgroundColor);
    }

    /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m21706getBackgroundColor0d7_KjU() {
        return this.backgroundColor;
    }

    /* renamed from: getHandleColor-0d7_KjU, reason: not valid java name */
    public final long m21707getHandleColor0d7_KjU() {
        return this.handleColor;
    }

    public int hashCode() {
        return (Color.m24283hashCodeimpl(this.handleColor) * 31) + Color.m24283hashCodeimpl(this.backgroundColor);
    }

    public String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) Color.m24284toStringimpl(this.handleColor)) + ", selectionBackgroundColor=" + ((Object) Color.m24284toStringimpl(this.backgroundColor)) + ')';
    }

    private TextSelectionColors(long j10, long j11) {
        this.handleColor = j10;
        this.backgroundColor = j11;
    }
}
