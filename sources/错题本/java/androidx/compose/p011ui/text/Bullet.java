package androidx.compose.p011ui.text;

import androidx.collection.AbstractC0584a;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.graphics.drawscope.DrawStyle;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.unit.TextUnit;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJN\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\u0006\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b#\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010,\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006-"}, m5110d2 = {"Landroidx/compose/ui/text/Bullet;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/unit/TextUnit;", "size", "padding", "Landroidx/compose/ui/graphics/Brush;", "brush", "", "alpha", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "<init>", "(Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Lkotlin/jvm/internal/e;)V", "copy-1XB3EBo", "(Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;)Landroidx/compose/ui/text/Bullet;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "J", "getSize-XSAIIZE", "()J", "getPadding-XSAIIZE", "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "F", "getAlpha", "()F", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "getDrawStyle", "()Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "ui-text_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class Bullet implements AnnotatedString.Annotation {
    public static final int $stable = 8;
    private final float alpha;

    @Nullable
    private final Brush brush;

    @NotNull
    private final DrawStyle drawStyle;
    private final long padding;

    @NotNull
    private final Shape shape;
    private final long size;

    public /* synthetic */ Bullet(Shape shape, long j7, long j8, Brush brush, float f, DrawStyle drawStyle, AbstractC5824e abstractC5824e) {
        this(shape, j7, j8, brush, f, drawStyle);
    }

    /* renamed from: copy-1XB3EBo$default, reason: not valid java name */
    public static /* synthetic */ Bullet m12603copy1XB3EBo$default(Bullet bullet, Shape shape, long j7, long j8, Brush brush, float f, DrawStyle drawStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            shape = bullet.shape;
        }
        if ((i & 2) != 0) {
            j7 = bullet.size;
        }
        if ((i & 4) != 0) {
            j8 = bullet.padding;
        }
        if ((i & 8) != 0) {
            brush = bullet.brush;
        }
        if ((i & 16) != 0) {
            f = bullet.alpha;
        }
        if ((i & 32) != 0) {
            drawStyle = bullet.drawStyle;
        }
        DrawStyle drawStyle2 = drawStyle;
        Brush brush2 = brush;
        long j9 = j8;
        return bullet.m12604copy1XB3EBo(shape, j7, j9, brush2, f, drawStyle2);
    }

    @NotNull
    /* renamed from: copy-1XB3EBo, reason: not valid java name */
    public final Bullet m12604copy1XB3EBo(@NotNull Shape shape, long size, long padding, @Nullable Brush brush, float alpha, @NotNull DrawStyle drawStyle) {
        return new Bullet(shape, size, padding, brush, alpha, drawStyle, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && (other instanceof Bullet)) {
            Bullet bullet = (Bullet) other;
            return AbstractC5830k.m5325b(this.shape, bullet.shape) && TextUnit.m13496equalsimpl0(this.size, bullet.size) && TextUnit.m13496equalsimpl0(this.padding, bullet.padding) && AbstractC5830k.m5325b(this.brush, bullet.brush) && this.alpha == bullet.alpha && AbstractC5830k.m5325b(this.drawStyle, bullet.drawStyle);
        }
        return false;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    @Nullable
    public final Brush getBrush() {
        return this.brush;
    }

    @NotNull
    public final DrawStyle getDrawStyle() {
        return this.drawStyle;
    }

    /* renamed from: getPadding-XSAIIZE, reason: not valid java name and from getter */
    public final long getPadding() {
        return this.padding;
    }

    @NotNull
    public final Shape getShape() {
        return this.shape;
    }

    /* renamed from: getSize-XSAIIZE, reason: not valid java name and from getter */
    public final long getSize() {
        return this.size;
    }

    public int hashCode() {
        int iM13500hashCodeimpl = (TextUnit.m13500hashCodeimpl(this.padding) + ((TextUnit.m13500hashCodeimpl(this.size) + (this.shape.hashCode() * 31)) * 31)) * 31;
        Brush brush = this.brush;
        return this.drawStyle.hashCode() + AbstractC0584a.m901b(this.alpha, (iM13500hashCodeimpl + (brush != null ? brush.hashCode() : 0)) * 31, 31);
    }

    @NotNull
    public String toString() {
        return "Bullet(shape=" + this.shape + ", size=" + ((Object) TextUnit.m13506toStringimpl(this.size)) + ", padding=" + ((Object) TextUnit.m13506toStringimpl(this.padding)) + ", brush=" + this.brush + ", alpha=" + this.alpha + ", drawStyle=" + this.drawStyle + ')';
    }

    private Bullet(Shape shape, long j7, long j8, Brush brush, float f, DrawStyle drawStyle) {
        this.shape = shape;
        this.size = j7;
        this.padding = j8;
        this.brush = brush;
        this.alpha = f;
        this.drawStyle = drawStyle;
    }
}
