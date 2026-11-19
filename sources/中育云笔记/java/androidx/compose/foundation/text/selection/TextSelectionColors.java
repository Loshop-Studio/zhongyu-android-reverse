package androidx.compose.foundation.text.selection;

import androidx.compose.p014ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes.dex */
public final class TextSelectionColors {
    public static final int $stable = 0;
    private final long backgroundColor;
    private final long handleColor;

    public /* synthetic */ TextSelectionColors(long j10, long j11, AbstractC9972n abstractC9972n) {
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
        return Color.m30879equalsimpl0(this.handleColor, textSelectionColors.handleColor) && Color.m30879equalsimpl0(this.backgroundColor, textSelectionColors.backgroundColor);
    }

    /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m28308getBackgroundColor0d7_KjU() {
        return this.backgroundColor;
    }

    /* renamed from: getHandleColor-0d7_KjU, reason: not valid java name */
    public final long m28309getHandleColor0d7_KjU() {
        return this.handleColor;
    }

    public int hashCode() {
        return (Color.m30885hashCodeimpl(this.handleColor) * 31) + Color.m30885hashCodeimpl(this.backgroundColor);
    }

    public String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) Color.m30886toStringimpl(this.handleColor)) + ", selectionBackgroundColor=" + ((Object) Color.m30886toStringimpl(this.backgroundColor)) + ')';
    }

    private TextSelectionColors(long j10, long j11) {
        this.handleColor = j10;
        this.backgroundColor = j11;
    }
}
