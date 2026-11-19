package androidx.compose.p013ui.node;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.graphics.Brush;
import androidx.compose.p013ui.graphics.Canvas;
import androidx.compose.p013ui.graphics.ColorFilter;
import androidx.compose.p013ui.graphics.ImageBitmap;
import androidx.compose.p013ui.graphics.Path;
import androidx.compose.p013ui.graphics.PathEffect;
import androidx.compose.p013ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.p013ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p013ui.graphics.drawscope.DrawContext;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.graphics.drawscope.DrawStyle;
import androidx.compose.p013ui.graphics.layer.GraphicsLayer;
import androidx.compose.p013ui.internal.InlineClassHelperKt;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.DpRect;
import androidx.compose.p013ui.unit.IntSizeKt;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.material.color.utilities.Contrast;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10570l;

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
    public final void m25824draweZhPAX0$ui_release(Canvas canvas, long j10, NodeCoordinator nodeCoordinator, Modifier.Node node, GraphicsLayer graphicsLayer) {
        int iM25908constructorimpl = NodeKind.m25908constructorimpl(4);
        DelegatingNode delegatingNodePop = node;
        MutableVector mutableVector = null;
        while (delegatingNodePop != 0) {
            if (delegatingNodePop instanceof DrawModifierNode) {
                m25825drawDirecteZhPAX0$ui_release(canvas, j10, nodeCoordinator, delegatingNodePop, graphicsLayer);
            } else if ((delegatingNodePop.getKindSet$ui_release() & iM25908constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                Modifier.Node delegate$ui_release = delegatingNodePop.getDelegate$ui_release();
                int i10 = 0;
                delegatingNodePop = delegatingNodePop;
                while (delegate$ui_release != null) {
                    if ((delegate$ui_release.getKindSet$ui_release() & iM25908constructorimpl) != 0) {
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

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-illE91I */
    public void mo24724drawArcillE91I(Brush brush, float f10, float f11, boolean z10, long j10, long j11, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f12, DrawStyle drawStyle, ColorFilter colorFilter, int i10) {
        this.canvasDrawScope.mo24724drawArcillE91I(brush, f10, f11, z10, j10, j11, f12, drawStyle, colorFilter, i10);
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-yD3GUKo */
    public void mo24725drawArcyD3GUKo(long j10, float f10, float f11, boolean z10, long j11, long j12, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f12, DrawStyle drawStyle, ColorFilter colorFilter, int i10) {
        this.canvasDrawScope.mo24725drawArcyD3GUKo(j10, f10, f11, z10, j11, j12, f12, drawStyle, colorFilter, i10);
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-V9BoPsw */
    public void mo24726drawCircleV9BoPsw(Brush brush, float f10, long j10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f11, DrawStyle drawStyle, ColorFilter colorFilter, int i10) {
        this.canvasDrawScope.mo24726drawCircleV9BoPsw(brush, f10, j10, f11, drawStyle, colorFilter, i10);
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-VaOC9Bg */
    public void mo24727drawCircleVaOC9Bg(long j10, float f10, long j11, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f11, DrawStyle drawStyle, ColorFilter colorFilter, int i10) {
        this.canvasDrawScope.mo24727drawCircleVaOC9Bg(j10, f10, j11, f11, drawStyle, colorFilter, i10);
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
    @Override // androidx.compose.p013ui.graphics.drawscope.ContentDrawScope
    public void drawContent() {
        Canvas canvas = getDrawContext().getCanvas();
        DrawModifierNode drawModifierNode = this.drawNode;
        if (drawModifierNode == null) {
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
            throw new KotlinNothingValueException();
        }
        DelegatingNode delegatingNodeNextDrawNode = LayoutNodeDrawScopeKt.nextDrawNode(drawModifierNode);
        if (delegatingNodeNextDrawNode == 0) {
            NodeCoordinator nodeCoordinatorM25754requireCoordinator64DMado = DelegatableNodeKt.m25754requireCoordinator64DMado(drawModifierNode, NodeKind.m25908constructorimpl(4));
            if (nodeCoordinatorM25754requireCoordinator64DMado.getTail() == drawModifierNode.getNode()) {
                nodeCoordinatorM25754requireCoordinator64DMado = nodeCoordinatorM25754requireCoordinator64DMado.getWrapped$ui_release();
                AbstractC9133u.m16130d(nodeCoordinatorM25754requireCoordinator64DMado);
            }
            nodeCoordinatorM25754requireCoordinator64DMado.performDraw(canvas, getDrawContext().getGraphicsLayer());
            return;
        }
        int iM25908constructorimpl = NodeKind.m25908constructorimpl(4);
        MutableVector mutableVector = null;
        while (delegatingNodeNextDrawNode != 0) {
            if (delegatingNodeNextDrawNode instanceof DrawModifierNode) {
                performDraw((DrawModifierNode) delegatingNodeNextDrawNode, canvas, getDrawContext().getGraphicsLayer());
            } else if ((delegatingNodeNextDrawNode.getKindSet$ui_release() & iM25908constructorimpl) != 0 && (delegatingNodeNextDrawNode instanceof DelegatingNode)) {
                Modifier.Node delegate$ui_release = delegatingNodeNextDrawNode.getDelegate$ui_release();
                int i10 = 0;
                delegatingNodeNextDrawNode = delegatingNodeNextDrawNode;
                while (delegate$ui_release != null) {
                    if ((delegate$ui_release.getKindSet$ui_release() & iM25908constructorimpl) != 0) {
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
    public final void m25825drawDirecteZhPAX0$ui_release(Canvas canvas, long j10, NodeCoordinator nodeCoordinator, DrawModifierNode drawModifierNode, GraphicsLayer graphicsLayer) {
        DrawModifierNode drawModifierNode2 = this.drawNode;
        this.drawNode = drawModifierNode;
        CanvasDrawScope canvasDrawScope = this.canvasDrawScope;
        LayoutDirection layoutDirection = nodeCoordinator.getLayoutDirection();
        Density density = canvasDrawScope.getDrawContext().getDensity();
        LayoutDirection layoutDirection2 = canvasDrawScope.getDrawContext().getLayoutDirection();
        Canvas canvas2 = canvasDrawScope.getDrawContext().getCanvas();
        long jMo24748getSizeNHjbRc = canvasDrawScope.getDrawContext().mo24748getSizeNHjbRc();
        GraphicsLayer graphicsLayer2 = canvasDrawScope.getDrawContext().getGraphicsLayer();
        DrawContext drawContext = canvasDrawScope.getDrawContext();
        drawContext.setDensity(nodeCoordinator);
        drawContext.setLayoutDirection(layoutDirection);
        drawContext.setCanvas(canvas);
        drawContext.mo24749setSizeuvyYCjk(j10);
        drawContext.setGraphicsLayer(graphicsLayer);
        canvas.save();
        try {
            drawModifierNode.draw(this);
            canvas.restore();
            DrawContext drawContext2 = canvasDrawScope.getDrawContext();
            drawContext2.setDensity(density);
            drawContext2.setLayoutDirection(layoutDirection2);
            drawContext2.setCanvas(canvas2);
            drawContext2.mo24749setSizeuvyYCjk(jMo24748getSizeNHjbRc);
            drawContext2.setGraphicsLayer(graphicsLayer2);
            this.drawNode = drawModifierNode2;
        } catch (Throwable th) {
            canvas.restore();
            DrawContext drawContext3 = canvasDrawScope.getDrawContext();
            drawContext3.setDensity(density);
            drawContext3.setLayoutDirection(layoutDirection2);
            drawContext3.setCanvas(canvas2);
            drawContext3.mo24749setSizeuvyYCjk(jMo24748getSizeNHjbRc);
            drawContext3.setGraphicsLayer(graphicsLayer2);
            throw th;
        }
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    @InterfaceC8721a
    /* renamed from: drawImage-9jGpkUE */
    public /* synthetic */ void mo24728drawImage9jGpkUE(ImageBitmap imageBitmap, long j10, long j11, long j12, long j13, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10) {
        this.canvasDrawScope.mo24728drawImage9jGpkUE(imageBitmap, j10, j11, j12, j13, f10, drawStyle, colorFilter, i10);
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-AZ2fEMs */
    public void mo24729drawImageAZ2fEMs(ImageBitmap imageBitmap, long j10, long j11, long j12, long j13, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11) {
        this.canvasDrawScope.mo24729drawImageAZ2fEMs(imageBitmap, j10, j11, j12, j13, f10, drawStyle, colorFilter, i10, i11);
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-gbVJVH8 */
    public void mo24730drawImagegbVJVH8(ImageBitmap imageBitmap, long j10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10) {
        this.canvasDrawScope.mo24730drawImagegbVJVH8(imageBitmap, j10, f10, drawStyle, colorFilter, i10);
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-1RTmtNc */
    public void mo24731drawLine1RTmtNc(Brush brush, long j10, long j11, float f10, int i10, PathEffect pathEffect, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f11, ColorFilter colorFilter, int i11) {
        this.canvasDrawScope.mo24731drawLine1RTmtNc(brush, j10, j11, f10, i10, pathEffect, f11, colorFilter, i11);
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-NGM6Ib0 */
    public void mo24732drawLineNGM6Ib0(long j10, long j11, long j12, float f10, int i10, PathEffect pathEffect, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f11, ColorFilter colorFilter, int i11) {
        this.canvasDrawScope.mo24732drawLineNGM6Ib0(j10, j11, j12, f10, i10, pathEffect, f11, colorFilter, i11);
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-AsUm42w */
    public void mo24733drawOvalAsUm42w(Brush brush, long j10, long j11, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10) {
        this.canvasDrawScope.mo24733drawOvalAsUm42w(brush, j10, j11, f10, drawStyle, colorFilter, i10);
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-n-J9OG0 */
    public void mo24734drawOvalnJ9OG0(long j10, long j11, long j12, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10) {
        this.canvasDrawScope.mo24734drawOvalnJ9OG0(j10, j11, j12, f10, drawStyle, colorFilter, i10);
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-GBMwjPU */
    public void mo24735drawPathGBMwjPU(Path path, Brush brush, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10) {
        this.canvasDrawScope.mo24735drawPathGBMwjPU(path, brush, f10, drawStyle, colorFilter, i10);
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-LG529CI */
    public void mo24736drawPathLG529CI(Path path, long j10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10) {
        this.canvasDrawScope.mo24736drawPathLG529CI(path, j10, f10, drawStyle, colorFilter, i10);
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-F8ZwMP8 */
    public void mo24737drawPointsF8ZwMP8(List<Offset> list, int i10, long j10, float f10, int i11, PathEffect pathEffect, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f11, ColorFilter colorFilter, int i12) {
        this.canvasDrawScope.mo24737drawPointsF8ZwMP8(list, i10, j10, f10, i11, pathEffect, f11, colorFilter, i12);
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-Gsft0Ws */
    public void mo24738drawPointsGsft0Ws(List<Offset> list, int i10, Brush brush, float f10, int i11, PathEffect pathEffect, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f11, ColorFilter colorFilter, int i12) {
        this.canvasDrawScope.mo24738drawPointsGsft0Ws(list, i10, brush, f10, i11, pathEffect, f11, colorFilter, i12);
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-AsUm42w */
    public void mo24739drawRectAsUm42w(Brush brush, long j10, long j11, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10) {
        this.canvasDrawScope.mo24739drawRectAsUm42w(brush, j10, j11, f10, drawStyle, colorFilter, i10);
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-n-J9OG0 */
    public void mo24740drawRectnJ9OG0(long j10, long j11, long j12, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10) {
        this.canvasDrawScope.mo24740drawRectnJ9OG0(j10, j11, j12, f10, drawStyle, colorFilter, i10);
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-ZuiqVtQ */
    public void mo24741drawRoundRectZuiqVtQ(Brush brush, long j10, long j11, long j12, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10) {
        this.canvasDrawScope.mo24741drawRoundRectZuiqVtQ(brush, j10, j11, j12, f10, drawStyle, colorFilter, i10);
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-u-Aw5IA */
    public void mo24742drawRoundRectuAw5IA(long j10, long j11, long j12, long j13, DrawStyle drawStyle, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f10, ColorFilter colorFilter, int i10) {
        this.canvasDrawScope.mo24742drawRoundRectuAw5IA(j10, j11, j12, j13, drawStyle, f10, colorFilter, i10);
    }

    public final CanvasDrawScope getCanvasDrawScope() {
        return this.canvasDrawScope;
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: getCenter-F1C5BW0 */
    public long mo24826getCenterF1C5BW0() {
        return this.canvasDrawScope.mo24826getCenterF1C5BW0();
    }

    @Override // androidx.compose.p013ui.unit.Density
    public float getDensity() {
        return this.canvasDrawScope.getDensity();
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    public DrawContext getDrawContext() {
        return this.canvasDrawScope.getDrawContext();
    }

    @Override // androidx.compose.p013ui.unit.FontScaling
    public float getFontScale() {
        return this.canvasDrawScope.getFontScale();
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    public LayoutDirection getLayoutDirection() {
        return this.canvasDrawScope.getLayoutDirection();
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: getSize-NH-jbRc */
    public long mo24827getSizeNHjbRc() {
        return this.canvasDrawScope.mo24827getSizeNHjbRc();
    }

    public final void performDraw(DrawModifierNode drawModifierNode, Canvas canvas, GraphicsLayer graphicsLayer) {
        NodeCoordinator nodeCoordinatorM25754requireCoordinator64DMado = DelegatableNodeKt.m25754requireCoordinator64DMado(drawModifierNode, NodeKind.m25908constructorimpl(4));
        nodeCoordinatorM25754requireCoordinator64DMado.getLayoutNode().getMDrawScope$ui_release().m25825drawDirecteZhPAX0$ui_release(canvas, IntSizeKt.m27082toSizeozmzZPI(nodeCoordinatorM25754requireCoordinator64DMado.mo25635getSizeYbymL2g()), nodeCoordinatorM25754requireCoordinator64DMado, drawModifierNode, graphicsLayer);
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: record-JVtK1S4 */
    public void mo24828recordJVtK1S4(GraphicsLayer graphicsLayer, long j10, final InterfaceC10570l interfaceC10570l) {
        final DrawModifierNode drawModifierNode = this.drawNode;
        graphicsLayer.m24921recordmLhObY(this, getLayoutDirection(), j10, new InterfaceC10570l() { // from class: androidx.compose.ui.node.LayoutNodeDrawScope$record$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
                invoke((DrawScope) obj);
                return C8736p.f16368a;
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
                long jMo24748getSizeNHjbRc;
                GraphicsLayer graphicsLayer2;
                InterfaceC10570l interfaceC10570l2;
                Density density2;
                LayoutDirection layoutDirection2;
                Canvas canvas2;
                long jMo24748getSizeNHjbRc2;
                GraphicsLayer graphicsLayer3;
                ?? drawContext = this.this$0.drawNode;
                this.this$0.drawNode = drawModifierNode;
                try {
                    layoutNodeDrawScope = this.this$0;
                    density = drawScope.getDrawContext().getDensity();
                    layoutDirection = drawScope.getDrawContext().getLayoutDirection();
                    canvas = drawScope.getDrawContext().getCanvas();
                    jMo24748getSizeNHjbRc = drawScope.getDrawContext().mo24748getSizeNHjbRc();
                    graphicsLayer2 = drawScope.getDrawContext().getGraphicsLayer();
                    interfaceC10570l2 = interfaceC10570l;
                    density2 = layoutNodeDrawScope.getDrawContext().getDensity();
                    layoutDirection2 = layoutNodeDrawScope.getDrawContext().getLayoutDirection();
                    canvas2 = layoutNodeDrawScope.getDrawContext().getCanvas();
                    jMo24748getSizeNHjbRc2 = layoutNodeDrawScope.getDrawContext().mo24748getSizeNHjbRc();
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
                    drawContext.mo24749setSizeuvyYCjk(jMo24748getSizeNHjbRc);
                    drawContext.setGraphicsLayer(graphicsLayer2);
                    canvas.save();
                    try {
                        interfaceC10570l2.invoke(layoutNodeDrawScope);
                        canvas.restore();
                        DrawContext drawContext2 = layoutNodeDrawScope.getDrawContext();
                        drawContext2.setDensity(density2);
                        drawContext2.setLayoutDirection(layoutDirection2);
                        drawContext2.setCanvas(canvas2);
                        drawContext2.mo24749setSizeuvyYCjk(jMo24748getSizeNHjbRc2);
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

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o */
    public int mo20490roundToPxR2X_6o(long j10) {
        return this.canvasDrawScope.mo20490roundToPxR2X_6o(j10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4 */
    public int mo20491roundToPx0680j_4(float f10) {
        return this.canvasDrawScope.mo20491roundToPx0680j_4(f10);
    }

    @Override // androidx.compose.p013ui.unit.FontScaling
    @Stable
    /* renamed from: toDp-GaN1DYA */
    public float mo20492toDpGaN1DYA(long j10) {
        return this.canvasDrawScope.mo20492toDpGaN1DYA(j10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo20493toDpu2uoSUM(float f10) {
        return this.canvasDrawScope.mo20493toDpu2uoSUM(f10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    public long mo20495toDpSizekrfVVM(long j10) {
        return this.canvasDrawScope.mo20495toDpSizekrfVVM(j10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o */
    public float mo20496toPxR2X_6o(long j10) {
        return this.canvasDrawScope.mo20496toPxR2X_6o(j10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4 */
    public float mo20497toPx0680j_4(float f10) {
        return this.canvasDrawScope.mo20497toPx0680j_4(f10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    public Rect toRect(DpRect dpRect) {
        return this.canvasDrawScope.toRect(dpRect);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ */
    public long mo20498toSizeXkaWNTQ(long j10) {
        return this.canvasDrawScope.mo20498toSizeXkaWNTQ(j10);
    }

    @Override // androidx.compose.p013ui.unit.FontScaling
    @Stable
    /* renamed from: toSp-0xMU5do */
    public long mo20499toSp0xMU5do(float f10) {
        return this.canvasDrawScope.mo20499toSp0xMU5do(f10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo20500toSpkPz2Gy4(float f10) {
        return this.canvasDrawScope.mo20500toSpkPz2Gy4(f10);
    }

    public LayoutNodeDrawScope(CanvasDrawScope canvasDrawScope) {
        this.canvasDrawScope = canvasDrawScope;
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo20494toDpu2uoSUM(int i10) {
        return this.canvasDrawScope.mo20494toDpu2uoSUM(i10);
    }

    @Override // androidx.compose.p013ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo20501toSpkPz2Gy4(int i10) {
        return this.canvasDrawScope.mo20501toSpkPz2Gy4(i10);
    }

    public /* synthetic */ LayoutNodeDrawScope(CanvasDrawScope canvasDrawScope, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }
}
