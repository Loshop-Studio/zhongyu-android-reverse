package androidx.compose.material3;

import androidx.compose.p014ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class IconToggleButtonColors {
    public static final int $stable = 0;
    private final long checkedContainerColor;
    private final long checkedContentColor;
    private final long containerColor;
    private final long contentColor;
    private final long disabledContainerColor;
    private final long disabledContentColor;

    public /* synthetic */ IconToggleButtonColors(long j10, long j11, long j12, long j13, long j14, long j15, AbstractC9972n abstractC9972n) {
        this(j10, j11, j12, j13, j14, j15);
    }

    /* renamed from: copy-tNS2XkQ$default, reason: not valid java name */
    public static /* synthetic */ IconToggleButtonColors m28749copytNS2XkQ$default(IconToggleButtonColors iconToggleButtonColors, long j10, long j11, long j12, long j13, long j14, long j15, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = iconToggleButtonColors.containerColor;
        }
        return iconToggleButtonColors.m28750copytNS2XkQ(j10, (i10 & 2) != 0 ? iconToggleButtonColors.contentColor : j11, (i10 & 4) != 0 ? iconToggleButtonColors.disabledContainerColor : j12, (i10 & 8) != 0 ? iconToggleButtonColors.disabledContentColor : j13, (i10 & 16) != 0 ? iconToggleButtonColors.checkedContainerColor : j14, (i10 & 32) != 0 ? iconToggleButtonColors.checkedContentColor : j15);
    }

    @Composable
    public final State<Color> containerColor$material3_release(boolean z10, boolean z11, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1175394478, i10, -1, "androidx.compose.material3.IconToggleButtonColors.containerColor (IconButton.kt:1239)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m30868boximpl(!z10 ? this.disabledContainerColor : !z11 ? this.containerColor : this.checkedContainerColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateRememberUpdatedState;
    }

    @Composable
    public final State<Color> contentColor$material3_release(boolean z10, boolean z11, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1340854054, i10, -1, "androidx.compose.material3.IconToggleButtonColors.contentColor (IconButton.kt:1256)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m30868boximpl(!z10 ? this.disabledContentColor : !z11 ? this.contentColor : this.checkedContentColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateRememberUpdatedState;
    }

    /* renamed from: copy-tNS2XkQ, reason: not valid java name */
    public final IconToggleButtonColors m28750copytNS2XkQ(long j10, long j11, long j12, long j13, long j14, long j15) {
        return new IconToggleButtonColors(j10 != 16 ? j10 : this.containerColor, j11 != 16 ? j11 : this.contentColor, j12 != 16 ? j12 : this.disabledContainerColor, j13 != 16 ? j13 : this.disabledContentColor, j14 != 16 ? j14 : this.checkedContainerColor, j15 != 16 ? j15 : this.checkedContentColor, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof IconToggleButtonColors)) {
            return false;
        }
        IconToggleButtonColors iconToggleButtonColors = (IconToggleButtonColors) obj;
        return Color.m30879equalsimpl0(this.containerColor, iconToggleButtonColors.containerColor) && Color.m30879equalsimpl0(this.contentColor, iconToggleButtonColors.contentColor) && Color.m30879equalsimpl0(this.disabledContainerColor, iconToggleButtonColors.disabledContainerColor) && Color.m30879equalsimpl0(this.disabledContentColor, iconToggleButtonColors.disabledContentColor) && Color.m30879equalsimpl0(this.checkedContainerColor, iconToggleButtonColors.checkedContainerColor) && Color.m30879equalsimpl0(this.checkedContentColor, iconToggleButtonColors.checkedContentColor);
    }

    /* renamed from: getCheckedContainerColor-0d7_KjU, reason: not valid java name */
    public final long m28751getCheckedContainerColor0d7_KjU() {
        return this.checkedContainerColor;
    }

    /* renamed from: getCheckedContentColor-0d7_KjU, reason: not valid java name */
    public final long m28752getCheckedContentColor0d7_KjU() {
        return this.checkedContentColor;
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m28753getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* renamed from: getContentColor-0d7_KjU, reason: not valid java name */
    public final long m28754getContentColor0d7_KjU() {
        return this.contentColor;
    }

    /* renamed from: getDisabledContainerColor-0d7_KjU, reason: not valid java name */
    public final long m28755getDisabledContainerColor0d7_KjU() {
        return this.disabledContainerColor;
    }

    /* renamed from: getDisabledContentColor-0d7_KjU, reason: not valid java name */
    public final long m28756getDisabledContentColor0d7_KjU() {
        return this.disabledContentColor;
    }

    public int hashCode() {
        return (((((((((Color.m30885hashCodeimpl(this.containerColor) * 31) + Color.m30885hashCodeimpl(this.contentColor)) * 31) + Color.m30885hashCodeimpl(this.disabledContainerColor)) * 31) + Color.m30885hashCodeimpl(this.disabledContentColor)) * 31) + Color.m30885hashCodeimpl(this.checkedContainerColor)) * 31) + Color.m30885hashCodeimpl(this.checkedContentColor);
    }

    private IconToggleButtonColors(long j10, long j11, long j12, long j13, long j14, long j15) {
        this.containerColor = j10;
        this.contentColor = j11;
        this.disabledContainerColor = j12;
        this.disabledContentColor = j13;
        this.checkedContainerColor = j14;
        this.checkedContentColor = j15;
    }
}
