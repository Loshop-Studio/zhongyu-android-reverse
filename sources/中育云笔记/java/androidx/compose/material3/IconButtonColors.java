package androidx.compose.material3;

import androidx.compose.p014ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class IconButtonColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long contentColor;
    private final long disabledContainerColor;
    private final long disabledContentColor;

    public /* synthetic */ IconButtonColors(long j10, long j11, long j12, long j13, AbstractC9972n abstractC9972n) {
        this(j10, j11, j12, j13);
    }

    /* renamed from: copy-jRlVdoo$default, reason: not valid java name */
    public static /* synthetic */ IconButtonColors m28724copyjRlVdoo$default(IconButtonColors iconButtonColors, long j10, long j11, long j12, long j13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = iconButtonColors.containerColor;
        }
        long j14 = j10;
        if ((i10 & 2) != 0) {
            j11 = iconButtonColors.contentColor;
        }
        long j15 = j11;
        if ((i10 & 4) != 0) {
            j12 = iconButtonColors.disabledContainerColor;
        }
        return iconButtonColors.m28727copyjRlVdoo(j14, j15, j12, (i10 & 8) != 0 ? iconButtonColors.disabledContentColor : j13);
    }

    @Stable
    /* renamed from: containerColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m28725containerColorvNxB06k$material3_release(boolean z10) {
        return z10 ? this.containerColor : this.disabledContainerColor;
    }

    @Stable
    /* renamed from: contentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m28726contentColorvNxB06k$material3_release(boolean z10) {
        return z10 ? this.contentColor : this.disabledContentColor;
    }

    /* renamed from: copy-jRlVdoo, reason: not valid java name */
    public final IconButtonColors m28727copyjRlVdoo(long j10, long j11, long j12, long j13) {
        return new IconButtonColors(j10 != 16 ? j10 : this.containerColor, j11 != 16 ? j11 : this.contentColor, j12 != 16 ? j12 : this.disabledContainerColor, j13 != 16 ? j13 : this.disabledContentColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof IconButtonColors)) {
            return false;
        }
        IconButtonColors iconButtonColors = (IconButtonColors) obj;
        return Color.m30879equalsimpl0(this.containerColor, iconButtonColors.containerColor) && Color.m30879equalsimpl0(this.contentColor, iconButtonColors.contentColor) && Color.m30879equalsimpl0(this.disabledContainerColor, iconButtonColors.disabledContainerColor) && Color.m30879equalsimpl0(this.disabledContentColor, iconButtonColors.disabledContentColor);
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m28728getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* renamed from: getContentColor-0d7_KjU, reason: not valid java name */
    public final long m28729getContentColor0d7_KjU() {
        return this.contentColor;
    }

    /* renamed from: getDisabledContainerColor-0d7_KjU, reason: not valid java name */
    public final long m28730getDisabledContainerColor0d7_KjU() {
        return this.disabledContainerColor;
    }

    /* renamed from: getDisabledContentColor-0d7_KjU, reason: not valid java name */
    public final long m28731getDisabledContentColor0d7_KjU() {
        return this.disabledContentColor;
    }

    public int hashCode() {
        return (((((Color.m30885hashCodeimpl(this.containerColor) * 31) + Color.m30885hashCodeimpl(this.contentColor)) * 31) + Color.m30885hashCodeimpl(this.disabledContainerColor)) * 31) + Color.m30885hashCodeimpl(this.disabledContentColor);
    }

    private IconButtonColors(long j10, long j11, long j12, long j13) {
        this.containerColor = j10;
        this.contentColor = j11;
        this.disabledContainerColor = j12;
        this.disabledContentColor = j13;
    }
}
