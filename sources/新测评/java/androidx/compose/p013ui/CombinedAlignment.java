package androidx.compose.p013ui;

import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.p013ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J*\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, m13558d2 = {"Landroidx/compose/ui/CombinedAlignment;", "Landroidx/compose/ui/Alignment;", "horizontal", "Landroidx/compose/ui/Alignment$Horizontal;", "vertical", "Landroidx/compose/ui/Alignment$Vertical;", "(Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;)V", "align", "Landroidx/compose/ui/unit/IntOffset;", "size", "Landroidx/compose/ui/unit/IntSize;", "space", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "align-KFBX0sM", "(JJLandroidx/compose/ui/unit/LayoutDirection;)J", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nAlignment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/CombinedAlignment\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,279:1\n54#2:280\n59#2:282\n85#3:281\n90#3:283\n80#3:285\n32#4:284\n*S KotlinDebug\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/CombinedAlignment\n*L\n115#1:280\n116#1:282\n115#1:281\n116#1:283\n117#1:285\n117#1:284\n*E\n"})
/* loaded from: classes2.dex */
final class CombinedAlignment implements Alignment {
    private final Alignment.Horizontal horizontal;
    private final Alignment.Vertical vertical;

    public CombinedAlignment(Alignment.Horizontal horizontal, Alignment.Vertical vertical) {
        this.horizontal = horizontal;
        this.vertical = vertical;
    }

    @Override // androidx.compose.p013ui.Alignment
    /* renamed from: align-KFBX0sM */
    public long mo20552alignKFBX0sM(long size, long space, LayoutDirection layoutDirection) {
        return IntOffset.m23683constructorimpl((this.horizontal.align((int) (size >> 32), (int) (space >> 32), layoutDirection) << 32) | (this.vertical.align((int) (size & 4294967295L), (int) (space & 4294967295L)) & 4294967295L));
    }
}
