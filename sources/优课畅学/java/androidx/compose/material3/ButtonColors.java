package androidx.compose.material3;

import androidx.compose.p013ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
public final class ButtonColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long contentColor;
    private final long disabledContainerColor;
    private final long disabledContentColor;

    public /* synthetic */ ButtonColors(long j10, long j11, long j12, long j13, AbstractC9126n abstractC9126n) {
        this(j10, j11, j12, j13);
    }

    /* renamed from: copy-jRlVdoo$default, reason: not valid java name */
    public static /* synthetic */ ButtonColors m21779copyjRlVdoo$default(ButtonColors buttonColors, long j10, long j11, long j12, long j13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = buttonColors.containerColor;
        }
        long j14 = j10;
        if ((i10 & 2) != 0) {
            j11 = buttonColors.contentColor;
        }
        long j15 = j11;
        if ((i10 & 4) != 0) {
            j12 = buttonColors.disabledContainerColor;
        }
        return buttonColors.m21782copyjRlVdoo(j14, j15, j12, (i10 & 8) != 0 ? buttonColors.disabledContentColor : j13);
    }

    @Stable
    /* renamed from: containerColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m21780containerColorvNxB06k$material3_release(boolean z10) {
        return z10 ? this.containerColor : this.disabledContainerColor;
    }

    @Stable
    /* renamed from: contentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m21781contentColorvNxB06k$material3_release(boolean z10) {
        return z10 ? this.contentColor : this.disabledContentColor;
    }

    /* renamed from: copy-jRlVdoo, reason: not valid java name */
    public final ButtonColors m21782copyjRlVdoo(long j10, long j11, long j12, long j13) {
        return new ButtonColors(j10 != 16 ? j10 : this.containerColor, j11 != 16 ? j11 : this.contentColor, j12 != 16 ? j12 : this.disabledContainerColor, j13 != 16 ? j13 : this.disabledContentColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ButtonColors)) {
            return false;
        }
        ButtonColors buttonColors = (ButtonColors) obj;
        return Color.m24277equalsimpl0(this.containerColor, buttonColors.containerColor) && Color.m24277equalsimpl0(this.contentColor, buttonColors.contentColor) && Color.m24277equalsimpl0(this.disabledContainerColor, buttonColors.disabledContainerColor) && Color.m24277equalsimpl0(this.disabledContentColor, buttonColors.disabledContentColor);
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m21783getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* renamed from: getContentColor-0d7_KjU, reason: not valid java name */
    public final long m21784getContentColor0d7_KjU() {
        return this.contentColor;
    }

    /* renamed from: getDisabledContainerColor-0d7_KjU, reason: not valid java name */
    public final long m21785getDisabledContainerColor0d7_KjU() {
        return this.disabledContainerColor;
    }

    /* renamed from: getDisabledContentColor-0d7_KjU, reason: not valid java name */
    public final long m21786getDisabledContentColor0d7_KjU() {
        return this.disabledContentColor;
    }

    public int hashCode() {
        return (((((Color.m24283hashCodeimpl(this.containerColor) * 31) + Color.m24283hashCodeimpl(this.contentColor)) * 31) + Color.m24283hashCodeimpl(this.disabledContainerColor)) * 31) + Color.m24283hashCodeimpl(this.disabledContentColor);
    }

    private ButtonColors(long j10, long j11, long j12, long j13) {
        this.containerColor = j10;
        this.contentColor = j11;
        this.disabledContainerColor = j12;
        this.disabledContentColor = j13;
    }
}
