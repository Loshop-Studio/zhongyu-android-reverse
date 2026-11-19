package androidx.compose.p012ui.node;

import androidx.compose.p012ui.internal.InlineClassHelperKt;
import androidx.compose.p012ui.unit.C3115Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a8\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0002\u001a\u00020\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u000b¢\u0006\u0002\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, m13413d2 = {"DpTouchBoundsExpansion", "Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "start", "Landroidx/compose/ui/unit/Dp;", "top", "end", "bottom", "DpTouchBoundsExpansion-a9UjIt4", "(FFFF)Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "TouchBoundsExpansion", "Landroidx/compose/ui/node/TouchBoundsExpansion;", "", "(IIII)J", "ui_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTouchBoundsExpansion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchBoundsExpansion.kt\nandroidx/compose/ui/node/TouchBoundsExpansionKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,248:1\n102#2,5:249\n102#2,5:254\n102#2,5:259\n102#2,5:264\n113#3:269\n113#3:270\n113#3:271\n113#3:272\n*S KotlinDebug\n*F\n+ 1 TouchBoundsExpansion.kt\nandroidx/compose/ui/node/TouchBoundsExpansionKt\n*L\n215#1:249,5\n218#1:254,5\n221#1:259,5\n224#1:264,5\n241#1:269\n242#1:270\n243#1:271\n244#1:272\n*E\n"})
/* loaded from: classes2.dex */
public final class TouchBoundsExpansionKt {
    /* renamed from: DpTouchBoundsExpansion-a9UjIt4, reason: not valid java name */
    public static final DpTouchBoundsExpansion m23115DpTouchBoundsExpansiona9UjIt4(float f10, float f11, float f12, float f13) {
        return new DpTouchBoundsExpansion(f10, f11, f12, f13, true, null);
    }

    /* renamed from: DpTouchBoundsExpansion-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ DpTouchBoundsExpansion m23116DpTouchBoundsExpansiona9UjIt4$default(float f10, float f11, float f12, float f13, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            f10 = C3115Dp.m23994constructorimpl(0);
        }
        if ((i9 & 2) != 0) {
            f11 = C3115Dp.m23994constructorimpl(0);
        }
        if ((i9 & 4) != 0) {
            f12 = C3115Dp.m23994constructorimpl(0);
        }
        if ((i9 & 8) != 0) {
            f13 = C3115Dp.m23994constructorimpl(0);
        }
        return m23115DpTouchBoundsExpansiona9UjIt4(f10, f11, f12, f13);
    }

    public static final long TouchBoundsExpansion(int i9, int i10, int i11, int i12) {
        if (!(i9 >= 0 && i9 < 32768)) {
            InlineClassHelperKt.throwIllegalArgumentException("Start must be in the range of 0 .. 32767");
        }
        if (!(i10 >= 0 && i10 < 32768)) {
            InlineClassHelperKt.throwIllegalArgumentException("Top must be in the range of 0 .. 32767");
        }
        if (!(i11 >= 0 && i11 < 32768)) {
            InlineClassHelperKt.throwIllegalArgumentException("End must be in the range of 0 .. 32767");
        }
        if (!(i12 >= 0 && i12 < 32768)) {
            InlineClassHelperKt.throwIllegalArgumentException("Bottom must be in the range of 0 .. 32767");
        }
        return TouchBoundsExpansion.m23101constructorimpl(TouchBoundsExpansion.INSTANCE.pack$ui_release(i9, i10, i11, i12, true));
    }

    public static /* synthetic */ long TouchBoundsExpansion$default(int i9, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i9 = 0;
        }
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = 0;
        }
        return TouchBoundsExpansion(i9, i10, i11, i12);
    }
}
