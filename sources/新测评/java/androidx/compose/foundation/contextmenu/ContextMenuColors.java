package androidx.compose.foundation.contextmenu;

import androidx.annotation.VisibleForTesting;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Stable
@Metadata(m13557d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0019\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u0019\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000e\u0010\nR\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u000f\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, m13558d2 = {"Landroidx/compose/foundation/contextmenu/ContextMenuColors;", "", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "textColor", "iconColor", "disabledTextColor", "disabledIconColor", "(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackgroundColor-0d7_KjU", "()J", "J", "getDisabledIconColor-0d7_KjU", "getDisabledTextColor-0d7_KjU", "getIconColor-0d7_KjU", "getTextColor-0d7_KjU", "equals", "", "other", "hashCode", "", "toString", "", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@VisibleForTesting
/* loaded from: classes.dex */
public final class ContextMenuColors {
    public static final int $stable = 0;
    private final long backgroundColor;
    private final long disabledIconColor;
    private final long disabledTextColor;
    private final long iconColor;
    private final long textColor;

    public /* synthetic */ ContextMenuColors(long j10, long j11, long j12, long j13, long j14, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof ContextMenuColors)) {
            return false;
        }
        ContextMenuColors contextMenuColors = (ContextMenuColors) other;
        return Color.m20977equalsimpl0(this.backgroundColor, contextMenuColors.backgroundColor) && Color.m20977equalsimpl0(this.textColor, contextMenuColors.textColor) && Color.m20977equalsimpl0(this.iconColor, contextMenuColors.iconColor) && Color.m20977equalsimpl0(this.disabledTextColor, contextMenuColors.disabledTextColor) && Color.m20977equalsimpl0(this.disabledIconColor, contextMenuColors.disabledIconColor);
    }

    /* renamed from: getBackgroundColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: getDisabledIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledIconColor() {
        return this.disabledIconColor;
    }

    /* renamed from: getDisabledTextColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledTextColor() {
        return this.disabledTextColor;
    }

    /* renamed from: getIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getIconColor() {
        return this.iconColor;
    }

    /* renamed from: getTextColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        return (((((((Color.m20983hashCodeimpl(this.backgroundColor) * 31) + Color.m20983hashCodeimpl(this.textColor)) * 31) + Color.m20983hashCodeimpl(this.iconColor)) * 31) + Color.m20983hashCodeimpl(this.disabledTextColor)) * 31) + Color.m20983hashCodeimpl(this.disabledIconColor);
    }

    public String toString() {
        return "ContextMenuColors(backgroundColor=" + ((Object) Color.m20984toStringimpl(this.backgroundColor)) + ", textColor=" + ((Object) Color.m20984toStringimpl(this.textColor)) + ", iconColor=" + ((Object) Color.m20984toStringimpl(this.iconColor)) + ", disabledTextColor=" + ((Object) Color.m20984toStringimpl(this.disabledTextColor)) + ", disabledIconColor=" + ((Object) Color.m20984toStringimpl(this.disabledIconColor)) + ')';
    }

    private ContextMenuColors(long j10, long j11, long j12, long j13, long j14) {
        this.backgroundColor = j10;
        this.textColor = j11;
        this.iconColor = j12;
        this.disabledTextColor = j13;
        this.disabledIconColor = j14;
    }
}
