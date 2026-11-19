package androidx.compose.material3;

import androidx.collection.AbstractC0584a;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m5109d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJL\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0014\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001d\u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b \u0010\u001dR\u001d\u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b!\u0010\u001dR\u001d\u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\"\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, m5110d2 = {"Landroidx/compose/material3/IconToggleButtonColors;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "disabledContainerColor", "disabledContentColor", "checkedContainerColor", "checkedContentColor", "<init>", "(JJJJJJLkotlin/jvm/internal/e;)V", "copy-tNS2XkQ", "(JJJJJJ)Landroidx/compose/material3/IconToggleButtonColors;", "copy", "", "enabled", "checked", "Landroidx/compose/runtime/State;", "containerColor$material3_release", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "contentColor$material3_release", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getContainerColor-0d7_KjU", "()J", "getContentColor-0d7_KjU", "getDisabledContainerColor-0d7_KjU", "getDisabledContentColor-0d7_KjU", "getCheckedContainerColor-0d7_KjU", "getCheckedContentColor-0d7_KjU", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nIconButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconToggleButtonColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,1292:1\n708#2:1293\n696#2:1294\n708#2:1295\n696#2:1296\n708#2:1297\n696#2:1298\n708#2:1299\n696#2:1300\n708#2:1301\n696#2:1302\n708#2:1303\n696#2:1304\n*S KotlinDebug\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconToggleButtonColors\n*L\n1225#1:1293\n1225#1:1294\n1226#1:1295\n1226#1:1296\n1227#1:1297\n1227#1:1298\n1228#1:1299\n1228#1:1300\n1229#1:1301\n1229#1:1302\n1230#1:1303\n1230#1:1304\n*E\n"})
/* loaded from: classes.dex */
public final class IconToggleButtonColors {
    public static final int $stable = 0;
    private final long checkedContainerColor;
    private final long checkedContentColor;
    private final long containerColor;
    private final long contentColor;
    private final long disabledContainerColor;
    private final long disabledContentColor;

    public /* synthetic */ IconToggleButtonColors(long j7, long j8, long j9, long j10, long j11, long j12, AbstractC5824e abstractC5824e) {
        this(j7, j8, j9, j10, j11, j12);
    }

    /* renamed from: copy-tNS2XkQ$default, reason: not valid java name */
    public static /* synthetic */ IconToggleButtonColors m8553copytNS2XkQ$default(IconToggleButtonColors iconToggleButtonColors, long j7, long j8, long j9, long j10, long j11, long j12, int i, Object obj) {
        if ((i & 1) != 0) {
            j7 = iconToggleButtonColors.containerColor;
        }
        return iconToggleButtonColors.m8554copytNS2XkQ(j7, (i & 2) != 0 ? iconToggleButtonColors.contentColor : j8, (i & 4) != 0 ? iconToggleButtonColors.disabledContainerColor : j9, (i & 8) != 0 ? iconToggleButtonColors.disabledContentColor : j10, (i & 16) != 0 ? iconToggleButtonColors.checkedContainerColor : j11, (i & 32) != 0 ? iconToggleButtonColors.checkedContentColor : j12);
    }

    @Composable
    @NotNull
    public final State<Color> containerColor$material3_release(boolean z8, boolean z9, @Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1175394478, i, -1, "androidx.compose.material3.IconToggleButtonColors.containerColor (IconButton.kt:1239)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m10672boximpl(!z8 ? this.disabledContainerColor : !z9 ? this.containerColor : this.checkedContainerColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateRememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> contentColor$material3_release(boolean z8, boolean z9, @Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1340854054, i, -1, "androidx.compose.material3.IconToggleButtonColors.contentColor (IconButton.kt:1256)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m10672boximpl(!z8 ? this.disabledContentColor : !z9 ? this.contentColor : this.checkedContentColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateRememberUpdatedState;
    }

    @NotNull
    /* renamed from: copy-tNS2XkQ, reason: not valid java name */
    public final IconToggleButtonColors m8554copytNS2XkQ(long containerColor, long contentColor, long disabledContainerColor, long disabledContentColor, long checkedContainerColor, long checkedContentColor) {
        return new IconToggleButtonColors(containerColor != 16 ? containerColor : this.containerColor, contentColor != 16 ? contentColor : this.contentColor, disabledContainerColor != 16 ? disabledContainerColor : this.disabledContainerColor, disabledContentColor != 16 ? disabledContentColor : this.disabledContentColor, checkedContainerColor != 16 ? checkedContainerColor : this.checkedContainerColor, checkedContentColor != 16 ? checkedContentColor : this.checkedContentColor, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof IconToggleButtonColors)) {
            return false;
        }
        IconToggleButtonColors iconToggleButtonColors = (IconToggleButtonColors) other;
        return Color.m10683equalsimpl0(this.containerColor, iconToggleButtonColors.containerColor) && Color.m10683equalsimpl0(this.contentColor, iconToggleButtonColors.contentColor) && Color.m10683equalsimpl0(this.disabledContainerColor, iconToggleButtonColors.disabledContainerColor) && Color.m10683equalsimpl0(this.disabledContentColor, iconToggleButtonColors.disabledContentColor) && Color.m10683equalsimpl0(this.checkedContainerColor, iconToggleButtonColors.checkedContainerColor) && Color.m10683equalsimpl0(this.checkedContentColor, iconToggleButtonColors.checkedContentColor);
    }

    /* renamed from: getCheckedContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getCheckedContainerColor() {
        return this.checkedContainerColor;
    }

    /* renamed from: getCheckedContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getCheckedContentColor() {
        return this.checkedContentColor;
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    /* renamed from: getContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getContentColor() {
        return this.contentColor;
    }

    /* renamed from: getDisabledContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledContainerColor() {
        return this.disabledContainerColor;
    }

    /* renamed from: getDisabledContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledContentColor() {
        return this.disabledContentColor;
    }

    public int hashCode() {
        return Color.m10689hashCodeimpl(this.checkedContentColor) + AbstractC0584a.m904e(this.checkedContainerColor, AbstractC0584a.m904e(this.disabledContentColor, AbstractC0584a.m904e(this.disabledContainerColor, AbstractC0584a.m904e(this.contentColor, Color.m10689hashCodeimpl(this.containerColor) * 31, 31), 31), 31), 31);
    }

    private IconToggleButtonColors(long j7, long j8, long j9, long j10, long j11, long j12) {
        this.containerColor = j7;
        this.contentColor = j8;
        this.disabledContainerColor = j9;
        this.disabledContentColor = j10;
        this.checkedContainerColor = j11;
        this.checkedContentColor = j12;
    }
}
