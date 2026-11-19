package androidx.compose.foundation;

import androidx.compose.p006ui.AbstractC1266a;
import androidx.compose.p006ui.AbstractC1267b;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.draw.DrawModifier;
import androidx.compose.p006ui.geometry.Size;
import androidx.compose.p006ui.graphics.Brush;
import androidx.compose.p006ui.graphics.Color;
import androidx.compose.p006ui.graphics.Outline;
import androidx.compose.p006ui.graphics.OutlineKt;
import androidx.compose.p006ui.graphics.RectangleShapeKt;
import androidx.compose.p006ui.graphics.Shape;
import androidx.compose.p006ui.graphics.drawscope.AbstractC1312b;
import androidx.compose.p006ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p006ui.graphics.drawscope.DrawScope;
import androidx.compose.p006ui.graphics.drawscope.Fill;
import androidx.compose.p006ui.platform.InspectorInfo;
import androidx.compose.p006ui.platform.InspectorValueInfo;
import androidx.compose.p006ui.unit.LayoutDirection;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002BK\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\f\u0010\u001f\u001a\u00020\u000e*\u00020 H\u0016J\f\u0010!\u001a\u00020\u000e*\u00020 H\u0002J\f\u0010\"\u001a\u00020\u000e*\u00020 H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, m5175d2 = {"Landroidx/compose/foundation/Background;", "Landroidx/compose/ui/draw/DrawModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "color", "Landroidx/compose/ui/graphics/Color;", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shape;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "lastLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "lastOutline", "Landroidx/compose/ui/graphics/Outline;", "lastSize", "Landroidx/compose/ui/geometry/Size;", "equals", "", "other", "", "hashCode", "", "toString", "", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "drawOutline", "drawRect", "foundation_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nBackground.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Background.kt\nandroidx/compose/foundation/Background\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
/* loaded from: classes.dex */
final class Background extends InspectorValueInfo implements DrawModifier {
    private final float alpha;
    private final Brush brush;
    private final Color color;
    private LayoutDirection lastLayoutDirection;
    private Outline lastOutline;
    private Size lastSize;
    private final Shape shape;

    public /* synthetic */ Background(Color color, Brush brush, float f4, Shape shape, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(color, brush, f4, shape, function1);
    }

    private final void drawOutline(ContentDrawScope contentDrawScope) {
        Outline outlineMo7110createOutlinePq9zytI;
        if (Size.m9009equalsimpl(contentDrawScope.mo9614getSizeNHjbRc(), this.lastSize) && contentDrawScope.getLayoutDirection() == this.lastLayoutDirection) {
            outlineMo7110createOutlinePq9zytI = this.lastOutline;
            Intrinsics.checkNotNull(outlineMo7110createOutlinePq9zytI);
        } else {
            outlineMo7110createOutlinePq9zytI = this.shape.mo7110createOutlinePq9zytI(contentDrawScope.mo9614getSizeNHjbRc(), contentDrawScope.getLayoutDirection(), contentDrawScope);
        }
        Color color = this.color;
        if (color != null) {
            color.m9188unboximpl();
            OutlineKt.m9410drawOutlinewDX37Ww(contentDrawScope, outlineMo7110createOutlinePq9zytI, this.color.m9188unboximpl(), (60 & 4) != 0 ? 1.0f : 0.0f, (60 & 8) != 0 ? Fill.INSTANCE : null, (60 & 16) != 0 ? null : null, (60 & 32) != 0 ? DrawScope.INSTANCE.m9644getDefaultBlendMode0nO6VwU() : 0);
        }
        Brush brush = this.brush;
        if (brush != null) {
            OutlineKt.m9409drawOutlinehn5TExg$default(contentDrawScope, outlineMo7110createOutlinePq9zytI, brush, this.alpha, null, null, 0, 56, null);
        }
        this.lastOutline = outlineMo7110createOutlinePq9zytI;
        this.lastSize = Size.m9002boximpl(contentDrawScope.mo9614getSizeNHjbRc());
        this.lastLayoutDirection = contentDrawScope.getLayoutDirection();
    }

    private final void drawRect(ContentDrawScope contentDrawScope) {
        Color color = this.color;
        if (color != null) {
            AbstractC1312b.m436K(contentDrawScope, color.m9188unboximpl(), 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
        Brush brush = this.brush;
        if (brush != null) {
            AbstractC1312b.m435J(contentDrawScope, brush, 0L, 0L, this.alpha, null, null, 0, 118, null);
        }
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return AbstractC1267b.m309a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return AbstractC1267b.m310b(this, function1);
    }

    @Override // androidx.compose.p006ui.draw.DrawModifier
    public void draw(ContentDrawScope contentDrawScope) {
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        if (this.shape == RectangleShapeKt.getRectangleShape()) {
            drawRect(contentDrawScope);
        } else {
            drawOutline(contentDrawScope);
        }
        contentDrawScope.drawContent();
    }

    public boolean equals(Object other) {
        Background background = other instanceof Background ? (Background) other : null;
        if (background != null && Intrinsics.areEqual(this.color, background.color) && Intrinsics.areEqual(this.brush, background.brush)) {
            return ((this.alpha > background.alpha ? 1 : (this.alpha == background.alpha ? 0 : -1)) == 0) && Intrinsics.areEqual(this.shape, background.shape);
        }
        return false;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return AbstractC1267b.m311c(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return AbstractC1267b.m312d(this, obj, function2);
    }

    public int hashCode() {
        Color color = this.color;
        int iM9185hashCodeimpl = (color != null ? Color.m9185hashCodeimpl(color.m9188unboximpl()) : 0) * 31;
        Brush brush = this.brush;
        return ((((iM9185hashCodeimpl + (brush != null ? brush.hashCode() : 0)) * 31) + Float.floatToIntBits(this.alpha)) * 31) + this.shape.hashCode();
    }

    @Override // androidx.compose.p006ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return AbstractC1266a.m307a(this, modifier);
    }

    public String toString() {
        return "Background(color=" + this.color + ", brush=" + this.brush + ", alpha = " + this.alpha + ", shape=" + this.shape + ')';
    }

    public /* synthetic */ Background(Color color, Brush brush, float f4, Shape shape, Function1 function1, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : color, (i4 & 2) != 0 ? null : brush, (i4 & 4) != 0 ? 1.0f : f4, shape, function1, null);
    }

    private Background(Color color, Brush brush, float f4, Shape shape, Function1<? super InspectorInfo, Unit> function1) {
        super(function1);
        this.color = color;
        this.brush = brush;
        this.alpha = f4;
        this.shape = shape;
    }
}
