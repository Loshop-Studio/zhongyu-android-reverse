package androidx.compose.p009ui.node;

import androidx.compose.p009ui.internal.InlineClassHelperKt;
import androidx.compose.p009ui.unit.C2452Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a8\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0002\u001a\u00020\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u000b¢\u0006\u0002\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, m7880d2 = {"DpTouchBoundsExpansion", "Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "start", "Landroidx/compose/ui/unit/Dp;", "top", "end", "bottom", "DpTouchBoundsExpansion-a9UjIt4", "(FFFF)Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "TouchBoundsExpansion", "Landroidx/compose/ui/node/TouchBoundsExpansion;", "", "(IIII)J", "ui_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nTouchBoundsExpansion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchBoundsExpansion.kt\nandroidx/compose/ui/node/TouchBoundsExpansionKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,248:1\n102#2,5:249\n102#2,5:254\n102#2,5:259\n102#2,5:264\n113#3:269\n113#3:270\n113#3:271\n113#3:272\n*S KotlinDebug\n*F\n+ 1 TouchBoundsExpansion.kt\nandroidx/compose/ui/node/TouchBoundsExpansionKt\n*L\n215#1:249,5\n218#1:254,5\n221#1:259,5\n224#1:264,5\n241#1:269\n242#1:270\n243#1:271\n244#1:272\n*E\n"})
/* loaded from: classes2.dex */
public final class TouchBoundsExpansionKt {
    /* renamed from: DpTouchBoundsExpansion-a9UjIt4, reason: not valid java name */
    public static final DpTouchBoundsExpansion m15605DpTouchBoundsExpansiona9UjIt4(float f6, float f7, float f8, float f9) {
        return new DpTouchBoundsExpansion(f6, f7, f8, f9, true, null);
    }

    /* renamed from: DpTouchBoundsExpansion-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ DpTouchBoundsExpansion m15606DpTouchBoundsExpansiona9UjIt4$default(float f6, float f7, float f8, float f9, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            f6 = C2452Dp.m16484constructorimpl(0);
        }
        if ((i6 & 2) != 0) {
            f7 = C2452Dp.m16484constructorimpl(0);
        }
        if ((i6 & 4) != 0) {
            f8 = C2452Dp.m16484constructorimpl(0);
        }
        if ((i6 & 8) != 0) {
            f9 = C2452Dp.m16484constructorimpl(0);
        }
        return m15605DpTouchBoundsExpansiona9UjIt4(f6, f7, f8, f9);
    }

    public static final long TouchBoundsExpansion(int i6, int i7, int i8, int i9) {
        if (!(i6 >= 0 && i6 < 32768)) {
            InlineClassHelperKt.throwIllegalArgumentException("Start must be in the range of 0 .. 32767");
        }
        if (!(i7 >= 0 && i7 < 32768)) {
            InlineClassHelperKt.throwIllegalArgumentException("Top must be in the range of 0 .. 32767");
        }
        if (!(i8 >= 0 && i8 < 32768)) {
            InlineClassHelperKt.throwIllegalArgumentException("End must be in the range of 0 .. 32767");
        }
        if (!(i9 >= 0 && i9 < 32768)) {
            InlineClassHelperKt.throwIllegalArgumentException("Bottom must be in the range of 0 .. 32767");
        }
        return TouchBoundsExpansion.m15591constructorimpl(TouchBoundsExpansion.INSTANCE.pack$ui_release(i6, i7, i8, i9, true));
    }

    public static /* synthetic */ long TouchBoundsExpansion$default(int i6, int i7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i6 = 0;
        }
        if ((i10 & 2) != 0) {
            i7 = 0;
        }
        if ((i10 & 4) != 0) {
            i8 = 0;
        }
        if ((i10 & 8) != 0) {
            i9 = 0;
        }
        return TouchBoundsExpansion(i6, i7, i8, i9);
    }
}
