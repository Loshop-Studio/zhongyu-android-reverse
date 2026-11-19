package androidx.compose.foundation.layout;

import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ2\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0004\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R(\u0010\u0006\u001a\u00020\u00058\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R(\u0010\u0007\u001a\u00020\u00058\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, m5110d2 = {"Landroidx/compose/foundation/layout/FlowLineInfo;", "", "", "lineIndex", "positionInLine", "Landroidx/compose/ui/unit/Dp;", "maxMainAxisSize", "maxCrossAxisSize", "<init>", "(IIFFLkotlin/jvm/internal/e;)V", "Ld6/s;", "update-4j6BHR0$foundation_layout_release", "(IIFF)V", "update", "I", "getLineIndex$foundation_layout_release", "()I", "setLineIndex$foundation_layout_release", "(I)V", "getPositionInLine$foundation_layout_release", "setPositionInLine$foundation_layout_release", "F", "getMaxMainAxisSize-D9Ej5fM$foundation_layout_release", "()F", "setMaxMainAxisSize-0680j_4$foundation_layout_release", "(F)V", "getMaxCrossAxisSize-D9Ej5fM$foundation_layout_release", "setMaxCrossAxisSize-0680j_4$foundation_layout_release", "foundation-layout_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nContextualFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextualFlowLayout.kt\nandroidx/compose/foundation/layout/FlowLineInfo\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,594:1\n113#2:595\n113#2:596\n*S KotlinDebug\n*F\n+ 1 ContextualFlowLayout.kt\nandroidx/compose/foundation/layout/FlowLineInfo\n*L\n577#1:595\n578#1:596\n*E\n"})
/* loaded from: classes.dex */
public final class FlowLineInfo {
    public static final int $stable = 8;
    private int lineIndex;
    private float maxCrossAxisSize;
    private float maxMainAxisSize;
    private int positionInLine;

    public /* synthetic */ FlowLineInfo(int i, int i8, float f, float f7, AbstractC5824e abstractC5824e) {
        this(i, i8, f, f7);
    }

    /* renamed from: getLineIndex$foundation_layout_release, reason: from getter */
    public final int getLineIndex() {
        return this.lineIndex;
    }

    /* renamed from: getMaxCrossAxisSize-D9Ej5fM$foundation_layout_release, reason: not valid java name and from getter */
    public final float getMaxCrossAxisSize() {
        return this.maxCrossAxisSize;
    }

    /* renamed from: getMaxMainAxisSize-D9Ej5fM$foundation_layout_release, reason: not valid java name and from getter */
    public final float getMaxMainAxisSize() {
        return this.maxMainAxisSize;
    }

    /* renamed from: getPositionInLine$foundation_layout_release, reason: from getter */
    public final int getPositionInLine() {
        return this.positionInLine;
    }

    public final void setLineIndex$foundation_layout_release(int i) {
        this.lineIndex = i;
    }

    /* renamed from: setMaxCrossAxisSize-0680j_4$foundation_layout_release, reason: not valid java name */
    public final void m7195setMaxCrossAxisSize0680j_4$foundation_layout_release(float f) {
        this.maxCrossAxisSize = f;
    }

    /* renamed from: setMaxMainAxisSize-0680j_4$foundation_layout_release, reason: not valid java name */
    public final void m7196setMaxMainAxisSize0680j_4$foundation_layout_release(float f) {
        this.maxMainAxisSize = f;
    }

    public final void setPositionInLine$foundation_layout_release(int i) {
        this.positionInLine = i;
    }

    /* renamed from: update-4j6BHR0$foundation_layout_release, reason: not valid java name */
    public final void m7197update4j6BHR0$foundation_layout_release(int lineIndex, int positionInLine, float maxMainAxisSize, float maxCrossAxisSize) {
        this.lineIndex = lineIndex;
        this.positionInLine = positionInLine;
        this.maxMainAxisSize = maxMainAxisSize;
        this.maxCrossAxisSize = maxCrossAxisSize;
    }

    private FlowLineInfo(int i, int i8, float f, float f7) {
        this.lineIndex = i;
        this.positionInLine = i8;
        this.maxMainAxisSize = f;
        this.maxCrossAxisSize = f7;
    }

    public /* synthetic */ FlowLineInfo(int i, int i8, float f, float f7, int i9, AbstractC5824e abstractC5824e) {
        this((i9 & 1) != 0 ? 0 : i, (i9 & 2) != 0 ? 0 : i8, (i9 & 4) != 0 ? C2331Dp.m13305constructorimpl(0) : f, (i9 & 8) != 0 ? C2331Dp.m13305constructorimpl(0) : f7, null);
    }
}
