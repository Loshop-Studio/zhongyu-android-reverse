package androidx.compose.foundation.contextmenu;

import androidx.annotation.VisibleForTesting;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;

@Stable
@VisibleForTesting
/* loaded from: classes.dex */
public final class ContextMenuColors {
    public static final int $stable = 0;
    private final long backgroundColor;
    private final long disabledIconColor;
    private final long disabledTextColor;
    private final long iconColor;
    private final long textColor;

    public /* synthetic */ ContextMenuColors(long j10, long j11, long j12, long j13, long j14, AbstractC9972n abstractC9972n) {
        this(j10, j11, j12, j13, j14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ContextMenuColors)) {
            return false;
        }
        ContextMenuColors contextMenuColors = (ContextMenuColors) obj;
        return Color.m30879equalsimpl0(this.backgroundColor, contextMenuColors.backgroundColor) && Color.m30879equalsimpl0(this.textColor, contextMenuColors.textColor) && Color.m30879equalsimpl0(this.iconColor, contextMenuColors.iconColor) && Color.m30879equalsimpl0(this.disabledTextColor, contextMenuColors.disabledTextColor) && Color.m30879equalsimpl0(this.disabledIconColor, contextMenuColors.disabledIconColor);
    }

    /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m27061getBackgroundColor0d7_KjU() {
        return this.backgroundColor;
    }

    /* renamed from: getDisabledIconColor-0d7_KjU, reason: not valid java name */
    public final long m27062getDisabledIconColor0d7_KjU() {
        return this.disabledIconColor;
    }

    /* renamed from: getDisabledTextColor-0d7_KjU, reason: not valid java name */
    public final long m27063getDisabledTextColor0d7_KjU() {
        return this.disabledTextColor;
    }

    /* renamed from: getIconColor-0d7_KjU, reason: not valid java name */
    public final long m27064getIconColor0d7_KjU() {
        return this.iconColor;
    }

    /* renamed from: getTextColor-0d7_KjU, reason: not valid java name */
    public final long m27065getTextColor0d7_KjU() {
        return this.textColor;
    }

    public int hashCode() {
        return (((((((Color.m30885hashCodeimpl(this.backgroundColor) * 31) + Color.m30885hashCodeimpl(this.textColor)) * 31) + Color.m30885hashCodeimpl(this.iconColor)) * 31) + Color.m30885hashCodeimpl(this.disabledTextColor)) * 31) + Color.m30885hashCodeimpl(this.disabledIconColor);
    }

    public String toString() {
        return "ContextMenuColors(backgroundColor=" + ((Object) Color.m30886toStringimpl(this.backgroundColor)) + ", textColor=" + ((Object) Color.m30886toStringimpl(this.textColor)) + ", iconColor=" + ((Object) Color.m30886toStringimpl(this.iconColor)) + ", disabledTextColor=" + ((Object) Color.m30886toStringimpl(this.disabledTextColor)) + ", disabledIconColor=" + ((Object) Color.m30886toStringimpl(this.disabledIconColor)) + ')';
    }

    private ContextMenuColors(long j10, long j11, long j12, long j13, long j14) {
        this.backgroundColor = j10;
        this.textColor = j11;
        this.iconColor = j12;
        this.disabledTextColor = j13;
        this.disabledIconColor = j14;
    }
}
