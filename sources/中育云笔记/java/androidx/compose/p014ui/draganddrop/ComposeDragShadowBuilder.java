package androidx.compose.p014ui.draganddrop;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import androidx.compose.p014ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p014ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class ComposeDragShadowBuilder extends View.DragShadowBuilder {
    public static final int $stable = 0;
    private final long decorationSize;
    private final Density density;
    private final InterfaceC9540l drawDragDecoration;

    public /* synthetic */ ComposeDragShadowBuilder(Density density, long j10, InterfaceC9540l interfaceC9540l, AbstractC9972n abstractC9972n) {
        this(density, j10, interfaceC9540l);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onDrawShadow(Canvas canvas) {
        CanvasDrawScope canvasDrawScope = new CanvasDrawScope();
        Density density = this.density;
        long j10 = this.decorationSize;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        androidx.compose.p014ui.graphics.Canvas Canvas = AndroidCanvas_androidKt.Canvas(canvas);
        InterfaceC9540l interfaceC9540l = this.drawDragDecoration;
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope.getDrawParams();
        Density densityComponent1 = drawParams.component1();
        LayoutDirection layoutDirectionComponent2 = drawParams.component2();
        androidx.compose.p014ui.graphics.Canvas canvasComponent3 = drawParams.component3();
        long jM31346component4NHjbRc = drawParams.m31346component4NHjbRc();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.getDrawParams();
        drawParams2.setDensity(density);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(Canvas);
        drawParams2.m31349setSizeuvyYCjk(j10);
        Canvas.save();
        interfaceC9540l.invoke(canvasDrawScope);
        Canvas.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope.getDrawParams();
        drawParams3.setDensity(densityComponent1);
        drawParams3.setLayoutDirection(layoutDirectionComponent2);
        drawParams3.setCanvas(canvasComponent3);
        drawParams3.m31349setSizeuvyYCjk(jM31346component4NHjbRc);
    }

    @Override // android.view.View.DragShadowBuilder
    public void onProvideShadowMetrics(Point point, Point point2) {
        Density density = this.density;
        point.set(density.mo27093roundToPx0680j_4(density.mo27095toDpu2uoSUM(Float.intBitsToFloat((int) (this.decorationSize >> 32)))), density.mo27093roundToPx0680j_4(density.mo27095toDpu2uoSUM(Float.intBitsToFloat((int) (this.decorationSize & 4294967295L)))));
        point2.set(point.x / 2, point.y / 2);
    }

    private ComposeDragShadowBuilder(Density density, long j10, InterfaceC9540l interfaceC9540l) {
        this.density = density;
        this.decorationSize = j10;
        this.drawDragDecoration = interfaceC9540l;
    }
}
