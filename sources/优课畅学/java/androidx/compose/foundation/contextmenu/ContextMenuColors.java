package androidx.compose.foundation.contextmenu;

import androidx.annotation.VisibleForTesting;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9126n;

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

    public /* synthetic */ ContextMenuColors(long j10, long j11, long j12, long j13, long j14, AbstractC9126n abstractC9126n) {
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
        return Color.m24277equalsimpl0(this.backgroundColor, contextMenuColors.backgroundColor) && Color.m24277equalsimpl0(this.textColor, contextMenuColors.textColor) && Color.m24277equalsimpl0(this.iconColor, contextMenuColors.iconColor) && Color.m24277equalsimpl0(this.disabledTextColor, contextMenuColors.disabledTextColor) && Color.m24277equalsimpl0(this.disabledIconColor, contextMenuColors.disabledIconColor);
    }

    /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m20459getBackgroundColor0d7_KjU() {
        return this.backgroundColor;
    }

    /* renamed from: getDisabledIconColor-0d7_KjU, reason: not valid java name */
    public final long m20460getDisabledIconColor0d7_KjU() {
        return this.disabledIconColor;
    }

    /* renamed from: getDisabledTextColor-0d7_KjU, reason: not valid java name */
    public final long m20461getDisabledTextColor0d7_KjU() {
        return this.disabledTextColor;
    }

    /* renamed from: getIconColor-0d7_KjU, reason: not valid java name */
    public final long m20462getIconColor0d7_KjU() {
        return this.iconColor;
    }

    /* renamed from: getTextColor-0d7_KjU, reason: not valid java name */
    public final long m20463getTextColor0d7_KjU() {
        return this.textColor;
    }

    public int hashCode() {
        return (((((((Color.m24283hashCodeimpl(this.backgroundColor) * 31) + Color.m24283hashCodeimpl(this.textColor)) * 31) + Color.m24283hashCodeimpl(this.iconColor)) * 31) + Color.m24283hashCodeimpl(this.disabledTextColor)) * 31) + Color.m24283hashCodeimpl(this.disabledIconColor);
    }

    public String toString() {
        return "ContextMenuColors(backgroundColor=" + ((Object) Color.m24284toStringimpl(this.backgroundColor)) + ", textColor=" + ((Object) Color.m24284toStringimpl(this.textColor)) + ", iconColor=" + ((Object) Color.m24284toStringimpl(this.iconColor)) + ", disabledTextColor=" + ((Object) Color.m24284toStringimpl(this.disabledTextColor)) + ", disabledIconColor=" + ((Object) Color.m24284toStringimpl(this.disabledIconColor)) + ')';
    }

    private ContextMenuColors(long j10, long j11, long j12, long j13, long j14) {
        this.backgroundColor = j10;
        this.textColor = j11;
        this.iconColor = j12;
        this.disabledTextColor = j13;
        this.disabledIconColor = j14;
    }
}
