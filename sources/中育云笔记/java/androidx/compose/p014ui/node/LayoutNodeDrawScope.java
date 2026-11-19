package androidx.compose.p014ui.node;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.graphics.Brush;
import androidx.compose.p014ui.graphics.Canvas;
import androidx.compose.p014ui.graphics.ColorFilter;
import androidx.compose.p014ui.graphics.ImageBitmap;
import androidx.compose.p014ui.graphics.Path;
import androidx.compose.p014ui.graphics.PathEffect;
import androidx.compose.p014ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.p014ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p014ui.graphics.drawscope.DrawContext;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.p014ui.graphics.drawscope.DrawStyle;
import androidx.compose.p014ui.graphics.layer.GraphicsLayer;
import androidx.compose.p014ui.internal.InlineClassHelperKt;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.DpRect;
import androidx.compose.p014ui.unit.IntSizeKt;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.material.color.utilities.Contrast;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class LayoutNodeDrawScope implements DrawScope, ContentDrawScope {
    public static final int $stable = 0;
    private final CanvasDrawScope canvasDrawScope;
    private DrawModifierNode drawNode;

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutNodeDrawScope() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* renamed from: draw-eZhPAX0$ui_release, reason: not valid java name */
    public final void m32426draweZhPAX0$ui_release(Canvas canvas, long j10, NodeCoordinator nodeCoordinator, Modifier.Node node, GraphicsLayer graphicsLayer) {
        int iM32510constructorimpl = NodeKind.m32510constructorimpl(4);
        DelegatingNode delegatingNodePop = node;
        MutableVector mutableVector = null;
        while (delegatingNodePop != 0) {
            if (delegatingNodePop instanceof DrawModifierNode) {
                m32427drawDirecteZhPAX0$ui_release(canvas, j10, nodeCoordinator, delegatingNodePop, graphicsLayer);
            } else if ((delegatingNodePop.getKindSet$ui_release() & iM32510constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                Modifier.Node delegate$ui_release = delegatingNodePop.getDelegate$ui_release();
                int i10 = 0;
                delegatingNodePop = delegatingNodePop;
                while (delegate$ui_release != null) {
                    if ((delegate$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                        i10++;
                        if (i10 == 1) {
                            delegatingNodePop = delegate$ui_release;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (delegatingNodePop != 0) {
                                mutableVector.add(delegatingNodePop);
                                delegatingNodePop = 0;
                            }
                            mutableVector.add(delegate$ui_release);
                        }
                    }
                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                    delegatingNodePop = delegatingNodePop;
                }
                if (i10 == 1) {
                }
            }
            delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
        }
    }

    @Override // androidx.compose.p014ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-illE91I */
    public void mo31326drawArcillE91I(Brush brush, float f10, float f11, boolean z10, long j10, long j11, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f12, DrawStyle drawStyle, ColorFilter colorFilter, int i10) {
        this.canvasDrawScope.mo31326drawArcillE91I(brush, f10, f11, z10, j10, j11, f12, drawStyle, colorFilter, i10);
    }

    @Override // androidx.compose.p014ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-yD3GUKo */
    public void mo31327drawArcyD3GUKo(long j10, float f10, float f11, boolean z10, long j11, long j12, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f12, DrawStyle drawStyle, ColorFilter colorFilter, int i10) {
        this.canvasDrawScope.mo31327drawArcyD3GUKo(j10, f10, f11, z10, j11, j12, f12, drawStyle, colorFilter, i10);
    }

    @Override // androidx.compose.p014ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-V9BoPsw */
    public void mo31328drawCircleV9BoPsw(Brush brush, float f10, long j10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f11, DrawStyle drawStyle, ColorFilter colorFilter, int i10) {
        this.canvasDrawScope.mo31328drawCircleV9BoPsw(brush, f10, j10, f11, drawStyle, colorFilter, i10);
    }

    @Override // androidx.compose.p014ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-VaOC9Bg */
    public void mo31329drawCircleVaOC9Bg(long j10, float f10, long j11, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f11, DrawStyle drawStyle, ColorFilter colorFilter, int i10) {
        this.canvasDrawScope.mo31329drawCircleVaOC9Bg(j10, f10, j11, f11, drawStyle, colorFilter, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    @Override // androidx.compose.p014ui.graphics.drawscope.ContentDrawScope
    public void drawContent() {
        Canvas canvas = getDrawContext().getCanvas();
        DrawModifierNode drawModifierNode = this.drawNode;
        if (drawModifierNode == null) {
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
            throw new KotlinNothingValueException();
        }
        DelegatingNode delegatingNodeNextDrawNode = LayoutNodeDrawScopeKt.nextDrawNode(drawModifierNode);
        if (delegatingNodeNextDrawNode == 0) {
            NodeCoordinator nodeCoordinatorM32356requireCoordinator64DMado = DelegatableNodeKt.m32356requireCoordinator64DMado(drawModifierNode, NodeKind.m32510constructorimpl(4));
            if (nodeCoordinatorM32356requireCoordinator64DMado.getTail() == drawModifierNode.getNode()) {
                nodeCoordinatorM32356requireCoordinator64DMado = nodeCoordinatorM32356requireCoordinator64DMado.getWrapped$ui_release();
                AbstractC9979u.m20291d(nodeCoordinatorM32356requireCoordinator64DMado);
            }
            nodeCoordinatorM32356requireCoordinator64DMado.performDraw(canvas, getDrawContext().getGraphicsLayer());
            return;
        }
        int iM32510constructorimpl = NodeKind.m32510constructorimpl(4);
        MutableVector mutableVector = null;
        while (delegatingNodeNextDrawNode != 0) {
            if (delegatingNodeNextDrawNode instanceof DrawModifierNode) {
                performDraw((DrawModifierNode) delegatingNodeNextDrawNode, canvas, getDrawContext().getGraphicsLayer());
            } else if ((delegatingNodeNextDrawNode.getKindSet$ui_release() & iM32510constructorimpl) != 0 && (delegatingNodeNextDrawNode instanceof DelegatingNode)) {
                Modifier.Node delegate$ui_release = delegatingNodeNextDrawNode.getDelegate$ui_release();
                int i10 = 0;
                delegatingNodeNextDrawNode = delegatingNodeNextDrawNode;
                while (delegate$ui_release != null) {
                    if ((delegate$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                        i10++;
                        if (i10 == 1) {
                            delegatingNodeNextDrawNode = delegate$ui_release;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (delegatingNodeNextDrawNode != 0) {
                                mutableVector.add(delegatingNodeNextDrawNode);
                                delegatingNodeNextDrawNode = 0;
                            }
                            mutableVector.add(delegate$ui_release);
                        }
                    }
                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                    delegatingNodeNextDrawNode = delegatingNodeNextDrawNode;
                }
                if (i10 == 1) {
                }
            }
            delegatingNodeNextDrawNode = DelegatableNodeKt.pop(mutableVector);
        }
    }

    /* renamed from: drawDirect-eZhPAX0$ui_release, reason: not valid java name */
    public final void m32427drawDirecteZhPAX0$ui_release(Canvas canvas, long j10, NodeCoordinator nodeCoordinator, DrawModifierNode drawModifierNode, GraphicsLayer graphicsLayer) {
        DrawModifierNode drawModifierNode2 = this.drawNode;
        this.drawNode = drawModifierNode;
        CanvasDrawScope canvasDrawScope = this.canvasDrawScope;
        LayoutDirection layoutDirection = nodeCoordinator.getLayoutDirection();
        Density density = canvasDrawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = canvasDrawScope.getDrawContext().getLayoutDirection();
        Canvas canvas2 = canvasDrawScope.getDrawContext().getCanvas();
        long jMo31350getSizeNHjbRc = canvasDrawScope.getDrawContext().mo31350getSizeNHjbRc();
        GraphicsLayer graphicsLayer2 = canvasDrawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = canvasDrawScope.getDrawContext();
        drawContext.setDensity(nodeCoordinator);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo31351setSizeuvyYCjk(j10);
        drawContext.setGraphicsLayer(graphicsLayer);
        canvas.save();
        try {
            drawModifierNode.draw(this);
            canvas.restore();
            DrawContext drawContext2 = canvasDrawScope.getDrawContext();
            drawContext2.setDensity(density);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas2);
            drawContext2.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer2);
            this.drawNode = drawModifierNode2;
        } catch (Throwable th) {
            canvas.restore();
            DrawContext drawContext3 = canvasDrawScope.getDrawContext();
            drawContext3.setDensity(density);
            drawContext3.setLayoutDirection(layoutDirection2);
            drawContext3.setCanvas(canvas2);
            drawContext3.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
            drawContext3.setGraphicsLayer(graphicsLayer2);
            throw th;
        }
    }

    @Override // androidx.compose.p014ui.graphics.drawscope.DrawScope
    @InterfaceC10770a
    /* renamed from: drawImage-9jGpkUE */
    public /* synthetic */ void mo31330drawImage9jGpkUE(ImageBitmap imageBitmap, long j10, long j11, long j12, long j13, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10) {
        this.canvasDrawScope.mo31330drawImage9jGpkUE(imageBitmap, j10, j11, j12, j13, f10, drawStyle, colorFilter, i10);
    }

    @Override // androidx.compose.p014ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-AZ2fEMs */
    public void mo31331drawImageAZ2fEMs(ImageBitmap imageBitmap, long j10, long j11, long j12, long j13, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11) {
        this.canvasDrawScope.mo31331drawImageAZ2fEMs(imageBitmap, j10, j11, j12, j13, f10, drawStyle, colorFilter, i10, i11);
    }

    @Override // androidx.compose.p014ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-gbVJVH8 */
    public void mo31332drawImagegbVJVH8(ImageBitmap imageBitmap, long j10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10) {
        this.canvasDrawScope.mo31332drawImagegbVJVH8(imageBitmap, j10, f10, drawStyle, colorFilter, i10);
    }

    @Override // androidx.compose.p014ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-1RTmtNc */
    public void mo31333drawLine1RTmtNc(Brush brush, long j10, long j11, float f10, int i10, PathEffect pathEffect, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f11, ColorFilter colorFilter, int i11) {
        this.canvasDrawScope.mo31333drawLine1RTmtNc(brush, j10, j11, f10, i10, pathEffect, f11, colorFilter, i11);
    }

    @Override // androidx.compose.p014ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-NGM6Ib0 */
    public void mo31334drawLineNGM6Ib0(long j10, long j11, long j12, float f10, int i10, PathEffect pathEffect, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f11, ColorFilter colorFilter, int i11) {
        this.canvasDrawScope.mo31334drawLineNGM6Ib0(j10, j11, j12, f10, i10, pathEffect, f11, colorFilter, i11);
    }

    @Override // androidx.compose.p014ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-AsUm42w */
    public void mo31335drawOvalAsUm42w(Brush brush, long j10, long j11, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10) {
        this.canvasDrawScope.mo31335drawOvalAsUm42w(brush, j10, j11, f10, drawStyle, colorFilter, i10);
    }

    @Override // androidx.compose.p014ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-n-J9OG0 */
    public void mo31336drawOvalnJ9OG0(long j10, long j11, long j12, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10) {
        this.canvasDrawScope.mo31336drawOvalnJ9OG0(j10, j11, j12, f10, drawStyle, colorFilter, i10);
    }

    @Override // androidx.compose.p014ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-GBMwjPU */
    public void mo31337drawPathGBMwjPU(Path path, Brush brush, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10) {
        this.canvasDrawScope.mo31337drawPathGBMwjPU(path, brush, f10, drawStyle, colorFilter, i10);
    }

    @Override // androidx.compose.p014ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-LG529CI */
    public void mo31338drawPathLG529CI(Path path, long j10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10) {
        this.canvasDrawScope.mo31338drawPathLG529CI(path, j10, f10, drawStyle, colorFilter, i10);
    }

    @Override // androidx.compose.p014ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-F8ZwMP8 */
    public void mo31339drawPointsF8ZwMP8(List<Offset> list, int i10, long j10, float f10, int i11, PathEffect pathEffect, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f11, ColorFilter colorFilter, int i12) {
        this.canvasDrawScope.mo31339drawPointsF8ZwMP8(list, i10, j10, f10, i11, pathEffect, f11, colorFilter, i12);
    }

    @Override // androidx.compose.p014ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-Gsft0Ws */
    public void mo31340drawPointsGsft0Ws(List<Offset> list, int i10, Brush brush, float f10, int i11, PathEffect pathEffect, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f11, ColorFilter colorFilter, int i12) {
        this.canvasDrawScope.mo31340drawPointsGsft0Ws(list, i10, brush, f10, i11, pathEffect, f11, colorFilter, i12);
    }

    @Override // androidx.compose.p014ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-AsUm42w */
    public void mo31341drawRectAsUm42w(Brush brush, long j10, long j11, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10) {
        this.canvasDrawScope.mo31341drawRectAsUm42w(brush, j10, j11, f10, drawStyle, colorFilter, i10);
    }

    @Override // androidx.compose.p014ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-n-J9OG0 */
    public void mo31342drawRectnJ9OG0(long j10, long j11, long j12, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10) {
        this.canvasDrawScope.mo31342drawRectnJ9OG0(j10, j11, j12, f10, drawStyle, colorFilter, i10);
    }

    @Override // androidx.compose.p014ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-ZuiqVtQ */
    public void mo31343drawRoundRectZuiqVtQ(Brush brush, long j10, long j11, long j12, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10) {
        this.canvasDrawScope.mo31343drawRoundRectZuiqVtQ(brush, j10, j11, j12, f10, drawStyle, colorFilter, i10);
    }

    @Override // androidx.compose.p014ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-u-Aw5IA */
    public void mo31344drawRoundRectuAw5IA(long j10, long j11, long j12, long j13, DrawStyle drawStyle, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10, ColorFilter colorFilter, int i10) {
        this.canvasDrawScope.mo31344drawRoundRectuAw5IA(j10, j11, j12, j13, drawStyle, f10, colorFilter, i10);
    }

    public final CanvasDrawScope getCanvasDrawScope() {
        return this.canvasDrawScope;
    }

    @Override // androidx.compose.p014ui.graphics.drawscope.DrawScope
    /* renamed from: getCenter-F1C5BW0 */
    public long mo31428getCenterF1C5BW0() {
        return this.canvasDrawScope.mo31428getCenterF1C5BW0();
    }

    @Override // androidx.compose.p014ui.unit.Density
    public float getDensity() {
        return this.canvasDrawScope.getDensity();
    }

    @Override // androidx.compose.p014ui.graphics.drawscope.DrawScope
    public DrawContext getDrawContext() {
        return this.canvasDrawScope.getDrawContext();
    }

    @Override // androidx.compose.p014ui.unit.FontScaling
    public float getFontScale() {
        return this.canvasDrawScope.getFontScale();
    }

    @Override // androidx.compose.p014ui.graphics.drawscope.DrawScope
    public LayoutDirection getLayoutDirection() {
        return this.canvasDrawScope.getLayoutDirection();
    }

    @Override // androidx.compose.p014ui.graphics.drawscope.DrawScope
    /* renamed from: getSize-NH-jbRc */
    public long mo31429getSizeNHjbRc() {
        return this.canvasDrawScope.mo31429getSizeNHjbRc();
    }

    public final void performDraw(DrawModifierNode drawModifierNode, Canvas canvas, GraphicsLayer graphicsLayer) {
        NodeCoordinator nodeCoordinatorM32356requireCoordinator64DMado = DelegatableNodeKt.m32356requireCoordinator64DMado(drawModifierNode, NodeKind.m32510constructorimpl(4));
        nodeCoordinatorM32356requireCoordinator64DMado.getLayoutNode().getMDrawScope$ui_release().m32427drawDirecteZhPAX0$ui_release(canvas, IntSizeKt.m33684toSizeozmzZPI(nodeCoordinatorM32356requireCoordinator64DMado.mo32237getSizeYbymL2g()), nodeCoordinatorM32356requireCoordinator64DMado, drawModifierNode, graphicsLayer);
    }

    @Override // androidx.compose.p014ui.graphics.drawscope.DrawScope
    /* renamed from: record-JVtK1S4 */
    public void mo31430recordJVtK1S4(GraphicsLayer graphicsLayer, long j10, final InterfaceC9540l interfaceC9540l) {
        final DrawModifierNode drawModifierNode = this.drawNode;
        graphicsLayer.m31523recordmLhObY(this, getLayoutDirection(), j10, new InterfaceC9540l() { // from class: androidx.compose.ui.node.LayoutNodeDrawScope$record$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
                invoke((DrawScope) obj);
                return C10786q.f26013a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.node.DrawModifierNode] */
            /* JADX WARN: Type inference failed for: r2v1 */
            /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.node.DrawModifierNode] */
            /* JADX WARN: Type inference failed for: r2v3 */
            /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.graphics.drawscope.DrawContext] */
            /* JADX WARN: Type inference failed for: r2v5 */
            public final void invoke(DrawScope drawScope) throws Throwable {
                LayoutNodeDrawScope layoutNodeDrawScope;
                Density density;
                LayoutDirection layoutDirection;
                Canvas canvas;
                long jMo31350getSizeNHjbRc;
                GraphicsLayer graphicsLayer2;
                InterfaceC9540l interfaceC9540l2;
                Density density2;
                LayoutDirection layoutDirection2;
                Canvas canvas2;
                long jMo31350getSizeNHjbRc2;
                GraphicsLayer graphicsLayer3;
                ?? drawContext = this.this$0.drawNode;
                this.this$0.drawNode = drawModifierNode;
                try {
                    layoutNodeDrawScope = this.this$0;
                    density = drawScope.getDrawContext().getDensity();
                    layoutDirection = drawScope.getDrawContext().getLayoutDirection();
                    canvas = drawScope.getDrawContext().getCanvas();
                    jMo31350getSizeNHjbRc = drawScope.getDrawContext().mo31350getSizeNHjbRc();
                    graphicsLayer2 = drawScope.getDrawContext().getGraphicsLayer();
                    interfaceC9540l2 = interfaceC9540l;
                    density2 = layoutNodeDrawScope.getDrawContext().getDensity();
                    layoutDirection2 = layoutNodeDrawScope.getDrawContext().getLayoutDirection();
                    canvas2 = layoutNodeDrawScope.getDrawContext().getCanvas();
                    jMo31350getSizeNHjbRc2 = layoutNodeDrawScope.getDrawContext().mo31350getSizeNHjbRc();
                    graphicsLayer3 = layoutNodeDrawScope.getDrawContext().getGraphicsLayer();
                } catch (Throwable th) {
                    th = th;
                    this.this$0.drawNode = drawContext;
                    throw th;
                }
                try {
                    drawContext = layoutNodeDrawScope.getDrawContext();
                    drawContext.setDensity(density);
                    drawContext.setLayoutDirection(layoutDirection);
                    drawContext.setCanvas(canvas);
                    drawContext.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc);
                    drawContext.setGraphicsLayer(graphicsLayer2);
                    canvas.save();
                    try {
                        interfaceC9540l2.invoke(layoutNodeDrawScope);
                        canvas.restore();
                        DrawContext drawContext2 = layoutNodeDrawScope.getDrawContext();
                        drawContext2.setDensity(density2);
                        drawContext2.setLayoutDirection(layoutDirection2);
                        drawContext2.setCanvas(canvas2);
                        drawContext2.mo31351setSizeuvyYCjk(jMo31350getSizeNHjbRc2);
                        drawContext2.setGraphicsLayer(graphicsLayer3);
                        this.this$0.drawNode = drawContext;
                    } finally {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    drawContext = drawContext;
                    this.this$0.drawNode = drawContext;
                    throw th;
                }
            }
        });
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o */
    public int mo27092roundToPxR2X_6o(long j10) {
        return this.canvasDrawScope.mo27092roundToPxR2X_6o(j10);
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4 */
    public int mo27093roundToPx0680j_4(float f10) {
        return this.canvasDrawScope.mo27093roundToPx0680j_4(f10);
    }

    @Override // androidx.compose.p014ui.unit.FontScaling
    @Stable
    /* renamed from: toDp-GaN1DYA */
    public float mo27094toDpGaN1DYA(long j10) {
        return this.canvasDrawScope.mo27094toDpGaN1DYA(j10);
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo27095toDpu2uoSUM(float f10) {
        return this.canvasDrawScope.mo27095toDpu2uoSUM(f10);
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    public long mo27097toDpSizekrfVVM(long j10) {
        return this.canvasDrawScope.mo27097toDpSizekrfVVM(j10);
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o */
    public float mo27098toPxR2X_6o(long j10) {
        return this.canvasDrawScope.mo27098toPxR2X_6o(j10);
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4 */
    public float mo27099toPx0680j_4(float f10) {
        return this.canvasDrawScope.mo27099toPx0680j_4(f10);
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    public Rect toRect(DpRect dpRect) {
        return this.canvasDrawScope.toRect(dpRect);
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ */
    public long mo27100toSizeXkaWNTQ(long j10) {
        return this.canvasDrawScope.mo27100toSizeXkaWNTQ(j10);
    }

    @Override // androidx.compose.p014ui.unit.FontScaling
    @Stable
    /* renamed from: toSp-0xMU5do */
    public long mo27101toSp0xMU5do(float f10) {
        return this.canvasDrawScope.mo27101toSp0xMU5do(f10);
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo27102toSpkPz2Gy4(float f10) {
        return this.canvasDrawScope.mo27102toSpkPz2Gy4(f10);
    }

    public LayoutNodeDrawScope(CanvasDrawScope canvasDrawScope) {
        this.canvasDrawScope = canvasDrawScope;
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo27096toDpu2uoSUM(int i10) {
        return this.canvasDrawScope.mo27096toDpu2uoSUM(i10);
    }

    @Override // androidx.compose.p014ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo27103toSpkPz2Gy4(int i10) {
        return this.canvasDrawScope.mo27103toSpkPz2Gy4(i10);
    }

    public /* synthetic */ LayoutNodeDrawScope(CanvasDrawScope canvasDrawScope, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }
}
