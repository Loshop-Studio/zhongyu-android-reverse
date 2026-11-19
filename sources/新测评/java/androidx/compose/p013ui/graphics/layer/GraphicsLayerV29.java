package androidx.compose.p013ui.graphics.layer;

import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.AbstractC1333k;
import androidx.compose.p013ui.geometry.InlineClassHelperKt;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.graphics.AndroidBlendMode_androidKt;
import androidx.compose.p013ui.graphics.AndroidCanvas;
import androidx.compose.p013ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p013ui.graphics.AndroidColorFilter_androidKt;
import androidx.compose.p013ui.graphics.BlendMode;
import androidx.compose.p013ui.graphics.Canvas;
import androidx.compose.p013ui.graphics.CanvasHolder;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorFilter;
import androidx.compose.p013ui.graphics.ColorKt;
import androidx.compose.p013ui.graphics.RenderEffect;
import androidx.compose.p013ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.p013ui.graphics.drawscope.DrawContext;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.graphics.layer.CompositingStrategy;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.IntSizeKt;
import androidx.compose.p013ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@RequiresApi(29)
@Metadata(m13557d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010h\u001a\u00020iH\u0002J\b\u0010j\u001a\u00020<H\u0016J\b\u0010k\u001a\u00020iH\u0016J\u0010\u0010l\u001a\u00020i2\u0006\u0010m\u001a\u00020nH\u0016J\b\u0010o\u001a\u00020:H\u0002J9\u0010p\u001a\u00020i2\u0006\u0010q\u001a\u00020r2\u0006\u0010s\u001a\u00020t2\u0006\u0010u\u001a\u00020v2\u0017\u0010w\u001a\u0013\u0012\u0004\u0012\u00020y\u0012\u0004\u0012\u00020i0x¢\u0006\u0002\bzH\u0016J\b\u0010{\u001a\u00020!H\u0002J\b\u0010|\u001a\u00020!H\u0002J(\u0010}\u001a\u00020i2\b\u0010~\u001a\u0004\u0018\u00010\u007f2\b\u0010\u0080\u0001\u001a\u00030\u0081\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J2\u0010\u0084\u0001\u001a\u00020i2\b\u0010\u0085\u0001\u001a\u00030\u0086\u00012\b\u0010\u0087\u0001\u001a\u00030\u0086\u00012\u0007\u0010]\u001a\u00030\u0081\u0001H\u0016ø\u0001\u0000¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\t\u0010\u008a\u0001\u001a\u00020iH\u0002J!\u0010\u008b\u0001\u001a\u00020i*\u00020J2\u0006\u00100\u001a\u00020/H\u0002ø\u0001\u0000¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001R$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR,\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R,\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\u0017@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\"\u001a\u00020!2\u0006\u0010\t\u001a\u00020!@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u000e\u0010'\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010*\u001a\u0004\u0018\u00010)2\b\u0010\t\u001a\u0004\u0018\u00010)@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R,\u00100\u001a\u00020/2\u0006\u0010\t\u001a\u00020/@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b1\u0010\u001a\"\u0004\b2\u0010\u001cR\u0014\u00103\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010$R\u001a\u00105\u001a\u00020!X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010$\"\u0004\b6\u0010&R\u0014\u00107\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u0010\u0013R\u0010\u00109\u001a\u0004\u0018\u00010:X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010;\u001a\u0004\u0018\u00010<X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010\u0013R,\u0010@\u001a\u00020?2\u0006\u0010\t\u001a\u00020?@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\bA\u0010\u0013\"\u0004\bB\u0010\u0015R(\u0010D\u001a\u0004\u0018\u00010C2\b\u0010\t\u001a\u0004\u0018\u00010C@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u000e\u0010I\u001a\u00020JX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010K\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\r\"\u0004\bM\u0010\u000fR$\u0010N\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\r\"\u0004\bP\u0010\u000fR$\u0010Q\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\r\"\u0004\bS\u0010\u000fR$\u0010T\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\r\"\u0004\bV\u0010\u000fR$\u0010W\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\r\"\u0004\bY\u0010\u000fR$\u0010Z\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\r\"\u0004\b\\\u0010\u000fR\u0016\u0010]\u001a\u00020^X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0016R,\u0010_\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b`\u0010\u0013\"\u0004\ba\u0010\u0015R$\u0010b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010\r\"\u0004\bd\u0010\u000fR$\u0010e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010\r\"\u0004\bg\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u008e\u0001"}, m13558d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayerV29;", "Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "ownerId", "", "canvasHolder", "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasDrawScope", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "(JLandroidx/compose/ui/graphics/CanvasHolder;Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;)V", "value", "", "alpha", "getAlpha", "()F", "setAlpha", "(F)V", "Landroidx/compose/ui/graphics/Color;", "ambientShadowColor", "getAmbientShadowColor-0d7_KjU", "()J", "setAmbientShadowColor-8_81llA", "(J)V", "J", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "getBlendMode-0nO6VwU", "()I", "setBlendMode-s9anfk8", "(I)V", "I", "cameraDistance", "getCameraDistance", "setCameraDistance", "", "clip", "getClip", "()Z", "setClip", "(Z)V", "clipToBounds", "clipToOutline", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "Landroidx/compose/ui/graphics/layer/CompositingStrategy;", "compositingStrategy", "getCompositingStrategy-ke2Ky5w", "setCompositingStrategy-Wpw9cng", "hasDisplayList", "getHasDisplayList", "isInvalidated", "setInvalidated", "layerId", "getLayerId", "layerPaint", "Landroid/graphics/Paint;", "matrix", "Landroid/graphics/Matrix;", "outlineIsProvided", "getOwnerId", "Landroidx/compose/ui/geometry/Offset;", "pivotOffset", "getPivotOffset-F1C5BW0", "setPivotOffset-k-4lQ0M", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "renderNode", "Landroid/graphics/RenderNode;", "rotationX", "getRotationX", "setRotationX", "rotationY", "getRotationY", "setRotationY", "rotationZ", "getRotationZ", "setRotationZ", "scaleX", "getScaleX", "setScaleX", "scaleY", "getScaleY", "setScaleY", "shadowElevation", "getShadowElevation", "setShadowElevation", "size", "Landroidx/compose/ui/geometry/Size;", "spotShadowColor", "getSpotShadowColor-0d7_KjU", "setSpotShadowColor-8_81llA", "translationX", "getTranslationX", "setTranslationX", "translationY", "getTranslationY", "setTranslationY", "applyClip", "", "calculateMatrix", "discardDisplayList", "draw", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "obtainLayerPaint", "record", "density", "Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "layer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "requiresCompositingLayer", "requiresLayerPaint", "setOutline", "outline", "Landroid/graphics/Outline;", "outlineSize", "Landroidx/compose/ui/unit/IntSize;", "setOutline-O0kMr_c", "(Landroid/graphics/Outline;J)V", "setPosition", "x", "", "y", "setPosition-H0pRuoY", "(IIJ)V", "updateLayerProperties", "applyCompositingStrategy", "applyCompositingStrategy-Z1X6vPc", "(Landroid/graphics/RenderNode;I)V", "ui-graphics_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nGraphicsLayerV29.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsLayerV29.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayerV29\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 8 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n*L\n1#1,298:1\n1#2:299\n278#3:300\n65#4:301\n69#4:304\n60#5:302\n70#5:305\n85#5:308\n90#5:310\n22#6:303\n22#6:306\n54#7:307\n59#7:309\n41#8,5:311\n*S KotlinDebug\n*F\n+ 1 GraphicsLayerV29.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayerV29\n*L\n86#1:300\n89#1:301\n90#1:304\n89#1:302\n90#1:305\n222#1:308\n222#1:310\n89#1:303\n90#1:306\n222#1:307\n222#1:309\n243#1:311,5\n*E\n"})
/* loaded from: classes2.dex */
public final class GraphicsLayerV29 implements GraphicsLayerImpl {
    private float alpha;
    private long ambientShadowColor;
    private int blendMode;
    private float cameraDistance;
    private final CanvasDrawScope canvasDrawScope;
    private final CanvasHolder canvasHolder;
    private boolean clip;
    private boolean clipToBounds;
    private boolean clipToOutline;
    private ColorFilter colorFilter;
    private int compositingStrategy;
    private boolean isInvalidated;
    private Paint layerPaint;
    private Matrix matrix;
    private boolean outlineIsProvided;
    private final long ownerId;
    private long pivotOffset;
    private RenderEffect renderEffect;
    private final RenderNode renderNode;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX;
    private float scaleY;
    private float shadowElevation;
    private long size;
    private long spotShadowColor;
    private float translationX;
    private float translationY;

    public GraphicsLayerV29(long j10, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope) {
        this.ownerId = j10;
        this.canvasHolder = canvasHolder;
        this.canvasDrawScope = canvasDrawScope;
        RenderNode renderNodeM1063a = AbstractC1333k.m1063a("graphicsLayer");
        this.renderNode = renderNodeM1063a;
        this.size = Size.INSTANCE.m20813getZeroNHjbRc();
        renderNodeM1063a.setClipToBounds(false);
        CompositingStrategy.Companion companion = CompositingStrategy.INSTANCE;
        m21643applyCompositingStrategyZ1X6vPc(renderNodeM1063a, companion.m21607getAutoke2Ky5w());
        this.alpha = 1.0f;
        this.blendMode = BlendMode.INSTANCE.m20918getSrcOver0nO6VwU();
        this.pivotOffset = Offset.INSTANCE.m20750getUnspecifiedF1C5BW0();
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        Color.Companion companion2 = Color.INSTANCE;
        this.ambientShadowColor = companion2.m21002getBlack0d7_KjU();
        this.spotShadowColor = companion2.m21002getBlack0d7_KjU();
        this.cameraDistance = 8.0f;
        this.compositingStrategy = companion.m21607getAutoke2Ky5w();
        this.isInvalidated = true;
    }

    private final void applyClip() {
        boolean z9 = false;
        boolean z10 = getClip() && !this.outlineIsProvided;
        if (getClip() && this.outlineIsProvided) {
            z9 = true;
        }
        if (z10 != this.clipToBounds) {
            this.clipToBounds = z10;
            this.renderNode.setClipToBounds(z10);
        }
        if (z9 != this.clipToOutline) {
            this.clipToOutline = z9;
            this.renderNode.setClipToOutline(z9);
        }
    }

    /* renamed from: applyCompositingStrategy-Z1X6vPc, reason: not valid java name */
    private final void m21643applyCompositingStrategyZ1X6vPc(RenderNode renderNode, int i10) {
        CompositingStrategy.Companion companion = CompositingStrategy.INSTANCE;
        if (CompositingStrategy.m21603equalsimpl0(i10, companion.m21609getOffscreenke2Ky5w())) {
            renderNode.setUseCompositingLayer(true, this.layerPaint);
            renderNode.setHasOverlappingRendering(true);
        } else if (CompositingStrategy.m21603equalsimpl0(i10, companion.m21608getModulateAlphake2Ky5w())) {
            renderNode.setUseCompositingLayer(false, this.layerPaint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, this.layerPaint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    private final Paint obtainLayerPaint() {
        Paint paint = this.layerPaint;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint();
        this.layerPaint = paint2;
        return paint2;
    }

    private final boolean requiresCompositingLayer() {
        return CompositingStrategy.m21603equalsimpl0(getCompositingStrategy(), CompositingStrategy.INSTANCE.m21609getOffscreenke2Ky5w()) || requiresLayerPaint() || getRenderEffect() != null;
    }

    private final boolean requiresLayerPaint() {
        return (BlendMode.m20887equalsimpl0(getBlendMode(), BlendMode.INSTANCE.m20918getSrcOver0nO6VwU()) && getColorFilter() == null) ? false : true;
    }

    private final void updateLayerProperties() {
        if (requiresCompositingLayer()) {
            m21643applyCompositingStrategyZ1X6vPc(this.renderNode, CompositingStrategy.INSTANCE.m21609getOffscreenke2Ky5w());
        } else {
            m21643applyCompositingStrategyZ1X6vPc(this.renderNode, getCompositingStrategy());
        }
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    public Matrix calculateMatrix() {
        Matrix matrix = this.matrix;
        if (matrix == null) {
            matrix = new Matrix();
            this.matrix = matrix;
        }
        this.renderNode.getMatrix(matrix);
        return matrix;
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    public void discardDisplayList() {
        this.renderNode.discardDisplayList();
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    public void draw(Canvas canvas) {
        AndroidCanvas_androidKt.getNativeCanvas(canvas).drawRenderNode(this.renderNode);
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    public float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: getAmbientShadowColor-0d7_KjU, reason: from getter */
    public long getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: getBlendMode-0nO6VwU, reason: from getter */
    public int getBlendMode() {
        return this.blendMode;
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    public float getCameraDistance() {
        return this.cameraDistance;
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    public boolean getClip() {
        return this.clip;
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    public ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: getCompositingStrategy-ke2Ky5w, reason: from getter */
    public int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    public boolean getHasDisplayList() {
        return this.renderNode.hasDisplayList();
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    public long getLayerId() {
        return this.renderNode.getUniqueId();
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    public long getOwnerId() {
        return this.ownerId;
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: getPivotOffset-F1C5BW0, reason: from getter */
    public long getPivotOffset() {
        return this.pivotOffset;
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    public RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    public float getRotationX() {
        return this.rotationX;
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    public float getRotationY() {
        return this.rotationY;
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    public float getRotationZ() {
        return this.rotationZ;
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    public float getScaleX() {
        return this.scaleX;
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    public float getScaleY() {
        return this.scaleY;
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    public float getShadowElevation() {
        return this.shadowElevation;
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: getSpotShadowColor-0d7_KjU, reason: from getter */
    public long getSpotShadowColor() {
        return this.spotShadowColor;
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    public float getTranslationX() {
        return this.translationX;
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    public float getTranslationY() {
        return this.translationY;
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: isInvalidated, reason: from getter */
    public boolean getIsInvalidated() {
        return this.isInvalidated;
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    public void record(Density density, LayoutDirection layoutDirection, GraphicsLayer layer, Function1<? super DrawScope, Unit> block) {
        RecordingCanvas recordingCanvasBeginRecording = this.renderNode.beginRecording();
        try {
            CanvasHolder canvasHolder = this.canvasHolder;
            android.graphics.Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
            canvasHolder.getAndroidCanvas().setInternalCanvas(recordingCanvasBeginRecording);
            AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
            DrawContext drawContext = this.canvasDrawScope.getDrawContext();
            drawContext.setDensity(density);
            drawContext.setLayoutDirection(layoutDirection);
            drawContext.setGraphicsLayer(layer);
            drawContext.mo21449setSizeuvyYCjk(this.size);
            drawContext.setCanvas(androidCanvas);
            block.invoke(this.canvasDrawScope);
            canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
            this.renderNode.endRecording();
            setInvalidated(false);
        } catch (Throwable th) {
            this.renderNode.endRecording();
            throw th;
        }
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    public void setAlpha(float f10) {
        this.alpha = f10;
        this.renderNode.setAlpha(f10);
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setAmbientShadowColor-8_81llA */
    public void mo21635setAmbientShadowColor8_81llA(long j10) {
        this.ambientShadowColor = j10;
        this.renderNode.setAmbientShadowColor(ColorKt.m21030toArgb8_81llA(j10));
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setBlendMode-s9anfk8 */
    public void mo21636setBlendModes9anfk8(int i10) {
        this.blendMode = i10;
        obtainLayerPaint().setBlendMode(AndroidBlendMode_androidKt.m20827toAndroidBlendModes9anfk8(i10));
        updateLayerProperties();
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    public void setCameraDistance(float f10) {
        this.cameraDistance = f10;
        this.renderNode.setCameraDistance(f10);
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    public void setClip(boolean z9) {
        this.clip = z9;
        applyClip();
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    public void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        obtainLayerPaint().setColorFilter(colorFilter != null ? AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter) : null);
        updateLayerProperties();
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setCompositingStrategy-Wpw9cng */
    public void mo21637setCompositingStrategyWpw9cng(int i10) {
        this.compositingStrategy = i10;
        updateLayerProperties();
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    public void setInvalidated(boolean z9) {
        this.isInvalidated = z9;
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setOutline-O0kMr_c */
    public void mo21638setOutlineO0kMr_c(Outline outline, long outlineSize) {
        this.renderNode.setOutline(outline);
        this.outlineIsProvided = outline != null;
        applyClip();
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setPivotOffset-k-4lQ0M */
    public void mo21639setPivotOffsetk4lQ0M(long j10) {
        this.pivotOffset = j10;
        if ((9223372034707292159L & j10) == InlineClassHelperKt.UnspecifiedPackedFloats) {
            this.renderNode.resetPivot();
        } else {
            this.renderNode.setPivotX(Float.intBitsToFloat((int) (j10 >> 32)));
            this.renderNode.setPivotY(Float.intBitsToFloat((int) (j10 & 4294967295L)));
        }
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setPosition-H0pRuoY */
    public void mo21640setPositionH0pRuoY(int x9, int y9, long size) {
        this.renderNode.setPosition(x9, y9, ((int) (size >> 32)) + x9, ((int) (4294967295L & size)) + y9);
        this.size = IntSizeKt.m23744toSizeozmzZPI(size);
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    public void setRenderEffect(RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
        if (Build.VERSION.SDK_INT >= 31) {
            RenderNodeVerificationHelper.INSTANCE.setRenderEffect(this.renderNode, renderEffect);
        }
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    public void setRotationX(float f10) {
        this.rotationX = f10;
        this.renderNode.setRotationX(f10);
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    public void setRotationY(float f10) {
        this.rotationY = f10;
        this.renderNode.setRotationY(f10);
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    public void setRotationZ(float f10) {
        this.rotationZ = f10;
        this.renderNode.setRotationZ(f10);
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    public void setScaleX(float f10) {
        this.scaleX = f10;
        this.renderNode.setScaleX(f10);
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    public void setScaleY(float f10) {
        this.scaleY = f10;
        this.renderNode.setScaleY(f10);
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    public void setShadowElevation(float f10) {
        this.shadowElevation = f10;
        this.renderNode.setElevation(f10);
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setSpotShadowColor-8_81llA */
    public void mo21641setSpotShadowColor8_81llA(long j10) {
        this.spotShadowColor = j10;
        this.renderNode.setSpotShadowColor(ColorKt.m21030toArgb8_81llA(j10));
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    public void setTranslationX(float f10) {
        this.translationX = f10;
        this.renderNode.setTranslationX(f10);
    }

    @Override // androidx.compose.p013ui.graphics.layer.GraphicsLayerImpl
    public void setTranslationY(float f10) {
        this.translationY = f10;
        this.renderNode.setTranslationY(f10);
    }

    public /* synthetic */ GraphicsLayerV29(long j10, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, (i10 & 2) != 0 ? new CanvasHolder() : canvasHolder, (i10 & 4) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }
}
