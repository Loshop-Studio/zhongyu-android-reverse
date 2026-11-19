package androidx.compose.p011ui.graphics.vector;

import androidx.autofill.HintConstants;
import androidx.collection.AbstractC0584a;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.PathFillType;
import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.graphics.StrokeJoin;
import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m5109d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001B\u009b\u0001\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b0\u0010,R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b1\u0010/R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b2\u0010/R\u001d\u0010\u0011\u001a\u00020\u00108\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0011\u0010(\u001a\u0004\b3\u0010!R\u001d\u0010\u0013\u001a\u00020\u00128\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010(\u001a\u0004\b4\u0010!R\u0017\u0010\u0014\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010-\u001a\u0004\b5\u0010/R\u0017\u0010\u0015\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010-\u001a\u0004\b6\u0010/R\u0017\u0010\u0016\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010-\u001a\u0004\b7\u0010/R\u0017\u0010\u0017\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010-\u001a\u0004\b8\u0010/\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, m5110d2 = {"Landroidx/compose/ui/graphics/vector/VectorPath;", "Landroidx/compose/ui/graphics/vector/VectorNode;", "", HintConstants.AUTOFILL_HINT_NAME, "", "Landroidx/compose/ui/graphics/vector/PathNode;", "pathData", "Landroidx/compose/ui/graphics/PathFillType;", "pathFillType", "Landroidx/compose/ui/graphics/Brush;", "fill", "", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineJoin", "strokeLineMiter", "trimPathStart", "trimPathEnd", "trimPathOffset", "<init>", "(Ljava/lang/String;Ljava/util/List;ILandroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFLkotlin/jvm/internal/e;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Ljava/util/List;", "getPathData", "()Ljava/util/List;", "I", "getPathFillType-Rg-k1Os", "Landroidx/compose/ui/graphics/Brush;", "getFill", "()Landroidx/compose/ui/graphics/Brush;", "F", "getFillAlpha", "()F", "getStroke", "getStrokeAlpha", "getStrokeLineWidth", "getStrokeLineCap-KaPHkGw", "getStrokeLineJoin-LxFBmk8", "getStrokeLineMiter", "getTrimPathStart", "getTrimPathEnd", "getTrimPathOffset", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class VectorPath extends VectorNode {
    public static final int $stable = 0;

    @Nullable
    private final Brush fill;
    private final float fillAlpha;

    @NotNull
    private final String name;

    @NotNull
    private final List<PathNode> pathData;
    private final int pathFillType;

    @Nullable
    private final Brush stroke;
    private final float strokeAlpha;
    private final int strokeLineCap;
    private final int strokeLineJoin;
    private final float strokeLineMiter;
    private final float strokeLineWidth;
    private final float trimPathEnd;
    private final float trimPathOffset;
    private final float trimPathStart;

    public /* synthetic */ VectorPath(String str, List list, int i, Brush brush, float f, Brush brush2, float f7, float f8, int i8, int i9, float f9, float f10, float f11, float f12, AbstractC5824e abstractC5824e) {
        this(str, list, i, brush, f, brush2, f7, f8, i8, i9, f9, f10, f11, f12);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && VectorPath.class == other.getClass()) {
            VectorPath vectorPath = (VectorPath) other;
            return AbstractC5830k.m5325b(this.name, vectorPath.name) && AbstractC5830k.m5325b(this.fill, vectorPath.fill) && this.fillAlpha == vectorPath.fillAlpha && AbstractC5830k.m5325b(this.stroke, vectorPath.stroke) && this.strokeAlpha == vectorPath.strokeAlpha && this.strokeLineWidth == vectorPath.strokeLineWidth && StrokeCap.m11031equalsimpl0(this.strokeLineCap, vectorPath.strokeLineCap) && StrokeJoin.m11041equalsimpl0(this.strokeLineJoin, vectorPath.strokeLineJoin) && this.strokeLineMiter == vectorPath.strokeLineMiter && this.trimPathStart == vectorPath.trimPathStart && this.trimPathEnd == vectorPath.trimPathEnd && this.trimPathOffset == vectorPath.trimPathOffset && PathFillType.m10960equalsimpl0(this.pathFillType, vectorPath.pathFillType) && AbstractC5830k.m5325b(this.pathData, vectorPath.pathData);
        }
        return false;
    }

    @Nullable
    public final Brush getFill() {
        return this.fill;
    }

    public final float getFillAlpha() {
        return this.fillAlpha;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<PathNode> getPathData() {
        return this.pathData;
    }

    /* renamed from: getPathFillType-Rg-k1Os, reason: not valid java name and from getter */
    public final int getPathFillType() {
        return this.pathFillType;
    }

    @Nullable
    public final Brush getStroke() {
        return this.stroke;
    }

    public final float getStrokeAlpha() {
        return this.strokeAlpha;
    }

    /* renamed from: getStrokeLineCap-KaPHkGw, reason: not valid java name and from getter */
    public final int getStrokeLineCap() {
        return this.strokeLineCap;
    }

    /* renamed from: getStrokeLineJoin-LxFBmk8, reason: not valid java name and from getter */
    public final int getStrokeLineJoin() {
        return this.strokeLineJoin;
    }

    public final float getStrokeLineMiter() {
        return this.strokeLineMiter;
    }

    public final float getStrokeLineWidth() {
        return this.strokeLineWidth;
    }

    public final float getTrimPathEnd() {
        return this.trimPathEnd;
    }

    public final float getTrimPathOffset() {
        return this.trimPathOffset;
    }

    public final float getTrimPathStart() {
        return this.trimPathStart;
    }

    public int hashCode() {
        int iM907h = AbstractC0584a.m907h(this.pathData, this.name.hashCode() * 31, 31);
        Brush brush = this.fill;
        int iM901b = AbstractC0584a.m901b(this.fillAlpha, (iM907h + (brush != null ? brush.hashCode() : 0)) * 31, 31);
        Brush brush2 = this.stroke;
        return PathFillType.m10961hashCodeimpl(this.pathFillType) + AbstractC0584a.m901b(this.trimPathOffset, AbstractC0584a.m901b(this.trimPathEnd, AbstractC0584a.m901b(this.trimPathStart, AbstractC0584a.m901b(this.strokeLineMiter, (StrokeJoin.m11042hashCodeimpl(this.strokeLineJoin) + ((StrokeCap.m11032hashCodeimpl(this.strokeLineCap) + AbstractC0584a.m901b(this.strokeLineWidth, AbstractC0584a.m901b(this.strokeAlpha, (iM901b + (brush2 != null ? brush2.hashCode() : 0)) * 31, 31), 31)) * 31)) * 31, 31), 31), 31), 31);
    }

    public /* synthetic */ VectorPath(String str, List list, int i, Brush brush, float f, Brush brush2, float f7, float f8, int i8, int i9, float f9, float f10, float f11, float f12, int i10, AbstractC5824e abstractC5824e) {
        this((i10 & 1) != 0 ? "" : str, list, i, (i10 & 8) != 0 ? null : brush, (i10 & 16) != 0 ? 1.0f : f, (i10 & 32) != 0 ? null : brush2, (i10 & 64) != 0 ? 1.0f : f7, (i10 & 128) != 0 ? 0.0f : f8, (i10 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : i8, (i10 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : i9, (i10 & 1024) != 0 ? 4.0f : f9, (i10 & 2048) != 0 ? 0.0f : f10, (i10 & 4096) != 0 ? 1.0f : f11, (i10 & 8192) != 0 ? 0.0f : f12, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private VectorPath(String str, List<? extends PathNode> list, int i, Brush brush, float f, Brush brush2, float f7, float f8, int i8, int i9, float f9, float f10, float f11, float f12) {
        super(null);
        this.name = str;
        this.pathData = list;
        this.pathFillType = i;
        this.fill = brush;
        this.fillAlpha = f;
        this.stroke = brush2;
        this.strokeAlpha = f7;
        this.strokeLineWidth = f8;
        this.strokeLineCap = i8;
        this.strokeLineJoin = i9;
        this.strokeLineMiter = f9;
        this.trimPathStart = f10;
        this.trimPathEnd = f11;
        this.trimPathOffset = f12;
    }
}
