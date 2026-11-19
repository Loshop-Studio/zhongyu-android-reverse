package androidx.compose.p011ui.graphics.layer;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.compose.p011ui.geometry.InlineClassHelperKt;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.AndroidBlendMode_androidKt;
import androidx.compose.p011ui.graphics.AndroidCanvas;
import androidx.compose.p011ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p011ui.graphics.AndroidColorFilter_androidKt;
import androidx.compose.p011ui.graphics.BlendMode;
import androidx.compose.p011ui.graphics.CanvasHolder;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.ColorKt;
import androidx.compose.p011ui.graphics.RenderEffect;
import androidx.compose.p011ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawContext;
import androidx.compose.p011ui.graphics.layer.CompositingStrategy;
import androidx.compose.p011ui.graphics.layer.view.DrawChildContainer;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.IntSizeKt;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 ¬\u00012\u00020\u0001:\u0002¬\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\u0014\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u001a\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J@\u0010%\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0017\u0010$\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00110!¢\u0006\u0002\b#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00112\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0011H\u0016¢\u0006\u0004\b.\u0010/J\u001a\u00104\u001a\u00020\u00112\u0006\u00101\u001a\u000200H\u0002ø\u0001\u0000¢\u0006\u0004\b2\u00103J\u000f\u00105\u001a\u00020\u0011H\u0002¢\u0006\u0004\b5\u0010/J\u000f\u00107\u001a\u000206H\u0002¢\u0006\u0004\b7\u00108J\u000f\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u000209H\u0002¢\u0006\u0004\b<\u0010;J\u000f\u0010=\u001a\u00020\u0011H\u0002¢\u0006\u0004\b=\u0010/J\u000f\u0010>\u001a\u00020\u0011H\u0002¢\u0006\u0004\b>\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010?R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010C\u001a\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001c\u0010K\u001a\n J*\u0004\u0018\u00010I0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010P\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010S\u001a\u0004\u0018\u00010R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010U\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010W\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010CR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010XR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010XR\u001c\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0010\u0010@R\u0016\u0010Y\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\"\u0010[\u001a\u0002098\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b[\u0010Z\u001a\u0004\b[\u0010;\"\u0004\b\\\u0010]R\u0016\u0010^\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010ZR\u0016\u0010_\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010ZR\u001a\u0010`\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b`\u0010@\u001a\u0004\ba\u0010BR0\u0010d\u001a\u00020b2\u0006\u0010c\u001a\u00020b8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bd\u0010X\u001a\u0004\be\u0010f\"\u0004\bg\u00103R.\u0010i\u001a\u0004\u0018\u00010h2\b\u0010c\u001a\u0004\u0018\u00010h8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR0\u00101\u001a\u0002002\u0006\u0010c\u001a\u0002008\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b1\u0010X\u001a\u0004\bo\u0010f\"\u0004\bp\u00103R*\u0010r\u001a\u00020q2\u0006\u0010c\u001a\u00020q8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\u0016\u0010x\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010ZR0\u0010z\u001a\u00020y2\u0006\u0010c\u001a\u00020y8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bz\u0010@\u001a\u0004\b{\u0010B\"\u0004\b|\u0010}R+\u0010~\u001a\u00020q2\u0006\u0010c\u001a\u00020q8\u0016@VX\u0096\u000e¢\u0006\u0013\n\u0004\b~\u0010s\u001a\u0004\b\u007f\u0010u\"\u0005\b\u0080\u0001\u0010wR.\u0010\u0081\u0001\u001a\u00020q2\u0006\u0010c\u001a\u00020q8\u0016@VX\u0096\u000e¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010s\u001a\u0005\b\u0082\u0001\u0010u\"\u0005\b\u0083\u0001\u0010wR.\u0010\u0084\u0001\u001a\u00020q2\u0006\u0010c\u001a\u00020q8\u0016@VX\u0096\u000e¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010s\u001a\u0005\b\u0085\u0001\u0010u\"\u0005\b\u0086\u0001\u0010wR.\u0010\u0087\u0001\u001a\u00020q2\u0006\u0010c\u001a\u00020q8\u0016@VX\u0096\u000e¢\u0006\u0015\n\u0005\b\u0087\u0001\u0010s\u001a\u0005\b\u0088\u0001\u0010u\"\u0005\b\u0089\u0001\u0010wR.\u0010\u008a\u0001\u001a\u00020q2\u0006\u0010c\u001a\u00020q8\u0016@VX\u0096\u000e¢\u0006\u0015\n\u0005\b\u008a\u0001\u0010s\u001a\u0005\b\u008b\u0001\u0010u\"\u0005\b\u008c\u0001\u0010wR6\u0010\u008e\u0001\u001a\u00030\u008d\u00012\u0007\u0010c\u001a\u00030\u008d\u00018\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0015\n\u0005\b\u008e\u0001\u0010@\u001a\u0005\b\u008f\u0001\u0010B\"\u0005\b\u0090\u0001\u0010}R6\u0010\u0091\u0001\u001a\u00030\u008d\u00012\u0007\u0010c\u001a\u00030\u008d\u00018\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0015\n\u0005\b\u0091\u0001\u0010@\u001a\u0005\b\u0092\u0001\u0010B\"\u0005\b\u0093\u0001\u0010}R.\u0010\u0094\u0001\u001a\u00020q2\u0006\u0010c\u001a\u00020q8\u0016@VX\u0096\u000e¢\u0006\u0015\n\u0005\b\u0094\u0001\u0010s\u001a\u0005\b\u0095\u0001\u0010u\"\u0005\b\u0096\u0001\u0010wR.\u0010\u0097\u0001\u001a\u00020q2\u0006\u0010c\u001a\u00020q8\u0016@VX\u0096\u000e¢\u0006\u0015\n\u0005\b\u0097\u0001\u0010s\u001a\u0005\b\u0098\u0001\u0010u\"\u0005\b\u0099\u0001\u0010wR.\u0010\u009a\u0001\u001a\u00020q2\u0006\u0010c\u001a\u00020q8\u0016@VX\u0096\u000e¢\u0006\u0015\n\u0005\b\u009a\u0001\u0010s\u001a\u0005\b\u009b\u0001\u0010u\"\u0005\b\u009c\u0001\u0010wR7\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009d\u00012\t\u0010c\u001a\u0005\u0018\u00010\u009d\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001\"\u0006\b¢\u0001\u0010£\u0001R\u001d\u0010¤\u0001\u001a\u0002098\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b¤\u0001\u0010Z\u001a\u0005\b¥\u0001\u0010;R'\u0010¨\u0001\u001a\u00020q2\u0006\u0010c\u001a\u00020q8V@VX\u0096\u000e¢\u0006\u000e\u001a\u0005\b¦\u0001\u0010u\"\u0005\b§\u0001\u0010wR'\u0010«\u0001\u001a\u0002092\u0006\u0010c\u001a\u0002098V@VX\u0096\u000e¢\u0006\u000e\u001a\u0005\b©\u0001\u0010;\"\u0005\bª\u0001\u0010]\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u00ad\u0001"}, m5110d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsViewLayer;", "Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;", "layerContainer", "", "ownerId", "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "canvasDrawScope", "<init>", "(Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;JLandroidx/compose/ui/graphics/CanvasHolder;Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;)V", "", "x", "y", "Landroidx/compose/ui/unit/IntSize;", "size", "Ld6/s;", "setPosition-H0pRuoY", "(IIJ)V", "setPosition", "Landroid/graphics/Outline;", "outline", "outlineSize", "setOutline-O0kMr_c", "(Landroid/graphics/Outline;J)V", "setOutline", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "block", "record", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lr6/c;)V", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "draw", "(Landroidx/compose/ui/graphics/Canvas;)V", "Landroid/graphics/Matrix;", "calculateMatrix", "()Landroid/graphics/Matrix;", "discardDisplayList", "()V", "Landroidx/compose/ui/graphics/layer/CompositingStrategy;", "compositingStrategy", "applyCompositingLayer-Wpw9cng", "(I)V", "applyCompositingLayer", "updateLayerProperties", "Landroid/graphics/Paint;", "obtainLayerPaint", "()Landroid/graphics/Paint;", "", "requiresCompositingLayer", "()Z", "requiresLayerPaint", "recordDrawingOperations", "updateClipBounds", "Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;", "J", "getOwnerId", "()J", "Landroidx/compose/ui/graphics/CanvasHolder;", "getCanvasHolder", "()Landroidx/compose/ui/graphics/CanvasHolder;", "Landroidx/compose/ui/graphics/layer/ViewLayer;", "viewLayer", "Landroidx/compose/ui/graphics/layer/ViewLayer;", "Landroid/content/res/Resources;", "kotlin.jvm.PlatformType", "resources", "Landroid/content/res/Resources;", "Landroid/graphics/Rect;", "clipRect", "Landroid/graphics/Rect;", "layerPaint", "Landroid/graphics/Paint;", "Landroid/graphics/Picture;", "picture", "Landroid/graphics/Picture;", "pictureDrawScope", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "pictureCanvasHolder", "I", "clipBoundsInvalidated", "Z", "isInvalidated", "setInvalidated", "(Z)V", "outlineIsProvided", "clipToBounds", "layerId", "getLayerId", "Landroidx/compose/ui/graphics/BlendMode;", "value", "blendMode", "getBlendMode-0nO6VwU", "()I", "setBlendMode-s9anfk8", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "getCompositingStrategy-ke2Ky5w", "setCompositingStrategy-Wpw9cng", "", "alpha", "F", "getAlpha", "()F", "setAlpha", "(F)V", "shouldManuallySetCenterPivot", "Landroidx/compose/ui/geometry/Offset;", "pivotOffset", "getPivotOffset-F1C5BW0", "setPivotOffset-k-4lQ0M", "(J)V", "scaleX", "getScaleX", "setScaleX", "scaleY", "getScaleY", "setScaleY", "translationX", "getTranslationX", "setTranslationX", "translationY", "getTranslationY", "setTranslationY", "shadowElevation", "getShadowElevation", "setShadowElevation", "Landroidx/compose/ui/graphics/Color;", "ambientShadowColor", "getAmbientShadowColor-0d7_KjU", "setAmbientShadowColor-8_81llA", "spotShadowColor", "getSpotShadowColor-0d7_KjU", "setSpotShadowColor-8_81llA", "rotationX", "getRotationX", "setRotationX", "rotationY", "getRotationY", "setRotationY", "rotationZ", "getRotationZ", "setRotationZ", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "supportsSoftwareRendering", "getSupportsSoftwareRendering", "getCameraDistance", "setCameraDistance", "cameraDistance", "getClip", "setClip", "clip", "Companion", "ui-graphics_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nGraphicsViewLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsViewLayer.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsViewLayer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/CanvasHolder\n+ 9 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,583:1\n1#2:584\n278#3:585\n54#4:586\n59#4:588\n54#4:596\n59#4:598\n54#4:600\n59#4:602\n54#4:604\n59#4:606\n85#5:587\n90#5:589\n60#5:591\n70#5:594\n85#5:597\n90#5:599\n85#5:601\n90#5:603\n85#5:605\n90#5:607\n65#6:590\n69#6:593\n22#7:592\n22#7:595\n41#8,3:608\n44#8,2:637\n41#8,5:639\n305#9,26:611\n*S KotlinDebug\n*F\n+ 1 GraphicsViewLayer.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsViewLayer\n*L\n266#1:585\n271#1:586\n272#1:588\n377#1:596\n377#1:598\n380#1:600\n381#1:602\n437#1:604\n437#1:606\n271#1:587\n272#1:589\n276#1:591\n277#1:594\n377#1:597\n377#1:599\n380#1:601\n381#1:603\n437#1:605\n437#1:607\n276#1:590\n277#1:593\n276#1:592\n277#1:595\n439#1:608,3\n439#1:637,2\n460#1:639,5\n440#1:611,26\n*E\n"})
/* loaded from: classes.dex */
public final class GraphicsViewLayer implements GraphicsLayerImpl {
    private float alpha;
    private long ambientShadowColor;
    private int blendMode;

    @NotNull
    private final CanvasHolder canvasHolder;
    private boolean clipBoundsInvalidated;

    @NotNull
    private final Rect clipRect;
    private boolean clipToBounds;

    @Nullable
    private ColorFilter colorFilter;
    private int compositingStrategy;
    private boolean isInvalidated;

    @NotNull
    private final DrawChildContainer layerContainer;
    private final long layerId;

    @Nullable
    private Paint layerPaint;
    private boolean outlineIsProvided;
    private final long ownerId;

    @Nullable
    private final Picture picture;

    @Nullable
    private final CanvasHolder pictureCanvasHolder;

    @Nullable
    private final CanvasDrawScope pictureDrawScope;
    private long pivotOffset;

    @Nullable
    private RenderEffect renderEffect;
    private final Resources resources;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX;
    private float scaleY;
    private float shadowElevation;
    private boolean shouldManuallySetCenterPivot;
    private long size;
    private long spotShadowColor;
    private final boolean supportsSoftwareRendering;
    private float translationX;
    private float translationY;

    @NotNull
    private final ViewLayer viewLayer;
    private int x;
    private int y;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final boolean mayRenderInSoftware = !SurfaceUtils.INSTANCE.isLockHardwareCanvasAvailable();

    @NotNull
    private static final Canvas PlaceholderCanvas = new Canvas() { // from class: androidx.compose.ui.graphics.layer.GraphicsViewLayer$Companion$PlaceholderCanvas$1
        @Override // android.graphics.Canvas
        public boolean isHardwareAccelerated() {
            return true;
        }
    };

    @Metadata(m5109d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m5110d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsViewLayer$Companion;", "", "()V", "PlaceholderCanvas", "Landroid/graphics/Canvas;", "getPlaceholderCanvas", "()Landroid/graphics/Canvas;", "mayRenderInSoftware", "", "getMayRenderInSoftware", "()Z", "ui-graphics_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        public final boolean getMayRenderInSoftware() {
            return GraphicsViewLayer.mayRenderInSoftware;
        }

        @NotNull
        public final Canvas getPlaceholderCanvas() {
            return GraphicsViewLayer.PlaceholderCanvas;
        }

        private Companion() {
        }
    }

    public GraphicsViewLayer(@NotNull DrawChildContainer drawChildContainer, long j7, @NotNull CanvasHolder canvasHolder, @NotNull CanvasDrawScope canvasDrawScope) {
        this.layerContainer = drawChildContainer;
        this.ownerId = j7;
        this.canvasHolder = canvasHolder;
        ViewLayer viewLayer = new ViewLayer(drawChildContainer, canvasHolder, canvasDrawScope);
        this.viewLayer = viewLayer;
        this.resources = drawChildContainer.getResources();
        this.clipRect = new Rect();
        boolean z8 = mayRenderInSoftware;
        this.picture = z8 ? new Picture() : null;
        this.pictureDrawScope = z8 ? new CanvasDrawScope() : null;
        this.pictureCanvasHolder = z8 ? new CanvasHolder() : null;
        drawChildContainer.addView(viewLayer);
        viewLayer.setClipBounds(null);
        this.size = IntSize.INSTANCE.m13481getZeroYbymL2g();
        this.isInvalidated = true;
        this.layerId = View.generateViewId();
        this.blendMode = BlendMode.INSTANCE.m10624getSrcOver0nO6VwU();
        this.compositingStrategy = CompositingStrategy.INSTANCE.m11313getAutoke2Ky5w();
        this.alpha = 1.0f;
        this.pivotOffset = Offset.INSTANCE.m10457getZeroF1C5BW0();
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        Color.Companion companion = Color.INSTANCE;
        this.ambientShadowColor = companion.m10708getBlack0d7_KjU();
        this.spotShadowColor = companion.m10708getBlack0d7_KjU();
        this.supportsSoftwareRendering = z8;
    }

    /* renamed from: applyCompositingLayer-Wpw9cng, reason: not valid java name */
    private final void m11350applyCompositingLayerWpw9cng(int compositingStrategy) {
        ViewLayer viewLayer = this.viewLayer;
        CompositingStrategy.Companion companion = CompositingStrategy.INSTANCE;
        boolean z8 = true;
        if (CompositingStrategy.m11309equalsimpl0(compositingStrategy, companion.m11315getOffscreenke2Ky5w())) {
            this.viewLayer.setLayerType(2, this.layerPaint);
        } else if (CompositingStrategy.m11309equalsimpl0(compositingStrategy, companion.m11314getModulateAlphake2Ky5w())) {
            this.viewLayer.setLayerType(0, this.layerPaint);
            z8 = false;
        } else {
            this.viewLayer.setLayerType(0, this.layerPaint);
        }
        viewLayer.setCanUseCompositingLayer$ui_graphics_release(z8);
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

    private final void recordDrawingOperations() {
        try {
            CanvasHolder canvasHolder = this.canvasHolder;
            Canvas canvas = PlaceholderCanvas;
            Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
            canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
            AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
            DrawChildContainer drawChildContainer = this.layerContainer;
            ViewLayer viewLayer = this.viewLayer;
            drawChildContainer.drawChild$ui_graphics_release(androidCanvas, viewLayer, viewLayer.getDrawingTime());
            canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        } catch (Throwable unused) {
        }
    }

    private final boolean requiresCompositingLayer() {
        return CompositingStrategy.m11309equalsimpl0(getCompositingStrategy(), CompositingStrategy.INSTANCE.m11315getOffscreenke2Ky5w()) || requiresLayerPaint();
    }

    private final boolean requiresLayerPaint() {
        return (BlendMode.m10593equalsimpl0(getBlendMode(), BlendMode.INSTANCE.m10624getSrcOver0nO6VwU()) && getColorFilter() == null) ? false : true;
    }

    private final void updateClipBounds() {
        Rect rect;
        if (this.clipBoundsInvalidated) {
            ViewLayer viewLayer = this.viewLayer;
            if (!getClip() || this.outlineIsProvided) {
                rect = null;
            } else {
                rect = this.clipRect;
                rect.left = 0;
                rect.top = 0;
                rect.right = this.viewLayer.getWidth();
                rect.bottom = this.viewLayer.getHeight();
            }
            viewLayer.setClipBounds(rect);
        }
    }

    private final void updateLayerProperties() {
        if (requiresCompositingLayer()) {
            m11350applyCompositingLayerWpw9cng(CompositingStrategy.INSTANCE.m11315getOffscreenke2Ky5w());
        } else {
            m11350applyCompositingLayerWpw9cng(getCompositingStrategy());
        }
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    @NotNull
    public Matrix calculateMatrix() {
        return this.viewLayer.getMatrix();
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    public void discardDisplayList() {
        this.layerContainer.removeViewInLayout(this.viewLayer);
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    public void draw(@NotNull androidx.compose.p011ui.graphics.Canvas canvas) {
        updateClipBounds();
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (nativeCanvas.isHardwareAccelerated()) {
            DrawChildContainer drawChildContainer = this.layerContainer;
            ViewLayer viewLayer = this.viewLayer;
            drawChildContainer.drawChild$ui_graphics_release(canvas, viewLayer, viewLayer.getDrawingTime());
        } else {
            Picture picture = this.picture;
            if (picture != null) {
                nativeCanvas.drawPicture(picture);
            }
        }
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    public float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: getAmbientShadowColor-0d7_KjU, reason: from getter */
    public long getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: getBlendMode-0nO6VwU, reason: from getter */
    public int getBlendMode() {
        return this.blendMode;
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    public float getCameraDistance() {
        return this.viewLayer.getCameraDistance() / this.resources.getDisplayMetrics().densityDpi;
    }

    @NotNull
    public final CanvasHolder getCanvasHolder() {
        return this.canvasHolder;
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    public boolean getClip() {
        return this.clipToBounds || this.viewLayer.getClipToOutline();
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    @Nullable
    public ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: getCompositingStrategy-ke2Ky5w, reason: from getter */
    public int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    public long getLayerId() {
        return this.layerId;
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    public long getOwnerId() {
        return this.ownerId;
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: getPivotOffset-F1C5BW0, reason: from getter */
    public long getPivotOffset() {
        return this.pivotOffset;
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    @Nullable
    public RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    public float getRotationX() {
        return this.rotationX;
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    public float getRotationY() {
        return this.rotationY;
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    public float getRotationZ() {
        return this.rotationZ;
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    public float getScaleX() {
        return this.scaleX;
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    public float getScaleY() {
        return this.scaleY;
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    public float getShadowElevation() {
        return this.shadowElevation;
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: getSpotShadowColor-0d7_KjU, reason: from getter */
    public long getSpotShadowColor() {
        return this.spotShadowColor;
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    public boolean getSupportsSoftwareRendering() {
        return this.supportsSoftwareRendering;
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    public float getTranslationX() {
        return this.translationX;
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    public float getTranslationY() {
        return this.translationY;
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: isInvalidated, reason: from getter */
    public boolean getIsInvalidated() {
        return this.isInvalidated;
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    public void record(@NotNull Density density, @NotNull LayoutDirection layoutDirection, @NotNull GraphicsLayer layer, @NotNull InterfaceC6471c block) {
        CanvasHolder canvasHolder;
        Canvas canvas;
        if (this.viewLayer.getParent() == null) {
            this.layerContainer.addView(this.viewLayer);
        }
        this.viewLayer.setDrawParams(density, layoutDirection, layer, block);
        if (this.viewLayer.isAttachedToWindow()) {
            this.viewLayer.setVisibility(4);
            this.viewLayer.setVisibility(0);
            recordDrawingOperations();
            Picture picture = this.picture;
            if (picture != null) {
                long j7 = this.size;
                Canvas canvasBeginRecording = picture.beginRecording((int) (j7 >> 32), (int) (j7 & 4294967295L));
                try {
                    CanvasHolder canvasHolder2 = this.pictureCanvasHolder;
                    if (canvasHolder2 != null) {
                        Canvas internalCanvas = canvasHolder2.getAndroidCanvas().getInternalCanvas();
                        canvasHolder2.getAndroidCanvas().setInternalCanvas(canvasBeginRecording);
                        AndroidCanvas androidCanvas = canvasHolder2.getAndroidCanvas();
                        CanvasDrawScope canvasDrawScope = this.pictureDrawScope;
                        if (canvasDrawScope != null) {
                            long jM13488toSizeozmzZPI = IntSizeKt.m13488toSizeozmzZPI(this.size);
                            Density density2 = canvasDrawScope.getDrawContext().getDensity();
                            LayoutDirection layoutDirection2 = canvasDrawScope.getDrawContext().getLayoutDirection();
                            androidx.compose.p011ui.graphics.Canvas canvas2 = canvasDrawScope.getDrawContext().getCanvas();
                            canvasHolder = canvasHolder2;
                            canvas = internalCanvas;
                            long jMo11154getSizeNHjbRc = canvasDrawScope.getDrawContext().mo11154getSizeNHjbRc();
                            GraphicsLayer graphicsLayer = canvasDrawScope.getDrawContext().getGraphicsLayer();
                            DrawContext drawContext = canvasDrawScope.getDrawContext();
                            drawContext.setDensity(density);
                            drawContext.setLayoutDirection(layoutDirection);
                            drawContext.setCanvas(androidCanvas);
                            drawContext.mo11155setSizeuvyYCjk(jM13488toSizeozmzZPI);
                            drawContext.setGraphicsLayer(layer);
                            androidCanvas.save();
                            try {
                                block.invoke(canvasDrawScope);
                                androidCanvas.restore();
                                DrawContext drawContext2 = canvasDrawScope.getDrawContext();
                                drawContext2.setDensity(density2);
                                drawContext2.setLayoutDirection(layoutDirection2);
                                drawContext2.setCanvas(canvas2);
                                drawContext2.mo11155setSizeuvyYCjk(jMo11154getSizeNHjbRc);
                                drawContext2.setGraphicsLayer(graphicsLayer);
                            } catch (Throwable th) {
                                androidCanvas.restore();
                                DrawContext drawContext3 = canvasDrawScope.getDrawContext();
                                drawContext3.setDensity(density2);
                                drawContext3.setLayoutDirection(layoutDirection2);
                                drawContext3.setCanvas(canvas2);
                                drawContext3.mo11155setSizeuvyYCjk(jMo11154getSizeNHjbRc);
                                drawContext3.setGraphicsLayer(graphicsLayer);
                                throw th;
                            }
                        } else {
                            canvasHolder = canvasHolder2;
                            canvas = internalCanvas;
                        }
                        canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
                    }
                    picture.endRecording();
                } catch (Throwable th2) {
                    picture.endRecording();
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    public void setAlpha(float f) {
        this.alpha = f;
        this.viewLayer.setAlpha(f);
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setAmbientShadowColor-8_81llA */
    public void mo11341setAmbientShadowColor8_81llA(long j7) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.ambientShadowColor = j7;
            ViewLayerVerificationHelper28.INSTANCE.setOutlineAmbientShadowColor(this.viewLayer, ColorKt.m10736toArgb8_81llA(j7));
        }
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setBlendMode-s9anfk8 */
    public void mo11342setBlendModes9anfk8(int i) {
        this.blendMode = i;
        obtainLayerPaint().setXfermode(new PorterDuffXfermode(AndroidBlendMode_androidKt.m10534toPorterDuffModes9anfk8(i)));
        updateLayerProperties();
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    public void setCameraDistance(float f) {
        this.viewLayer.setCameraDistance(f * this.resources.getDisplayMetrics().densityDpi);
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    public void setClip(boolean z8) {
        boolean z9 = false;
        this.clipToBounds = z8 && !this.outlineIsProvided;
        this.clipBoundsInvalidated = true;
        ViewLayer viewLayer = this.viewLayer;
        if (z8 && this.outlineIsProvided) {
            z9 = true;
        }
        viewLayer.setClipToOutline(z9);
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        obtainLayerPaint().setColorFilter(colorFilter != null ? AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter) : null);
        updateLayerProperties();
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setCompositingStrategy-Wpw9cng */
    public void mo11343setCompositingStrategyWpw9cng(int i) {
        this.compositingStrategy = i;
        updateLayerProperties();
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    public void setInvalidated(boolean z8) {
        this.isInvalidated = z8;
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setOutline-O0kMr_c */
    public void mo11344setOutlineO0kMr_c(@Nullable Outline outline, long outlineSize) {
        boolean layerOutline = this.viewLayer.setLayerOutline(outline);
        if (getClip() && outline != null) {
            this.viewLayer.setClipToOutline(true);
            if (this.clipToBounds) {
                this.clipToBounds = false;
                this.clipBoundsInvalidated = true;
            }
        }
        this.outlineIsProvided = outline != null;
        if (layerOutline) {
            return;
        }
        this.viewLayer.invalidate();
        recordDrawingOperations();
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setPivotOffset-k-4lQ0M */
    public void mo11345setPivotOffsetk4lQ0M(long j7) {
        this.pivotOffset = j7;
        if ((9223372034707292159L & j7) != InlineClassHelperKt.UnspecifiedPackedFloats) {
            this.shouldManuallySetCenterPivot = false;
            this.viewLayer.setPivotX(Float.intBitsToFloat((int) (j7 >> 32)));
            this.viewLayer.setPivotY(Float.intBitsToFloat((int) (j7 & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                ViewLayerVerificationHelper28.INSTANCE.resetPivot(this.viewLayer);
                return;
            }
            this.shouldManuallySetCenterPivot = true;
            this.viewLayer.setPivotX(((int) (this.size >> 32)) / 2.0f);
            this.viewLayer.setPivotY(((int) (4294967295L & this.size)) / 2.0f);
        }
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setPosition-H0pRuoY */
    public void mo11346setPositionH0pRuoY(int x3, int y2, long size) {
        if (IntSize.m13474equalsimpl0(this.size, size)) {
            int i = this.x;
            if (i != x3) {
                this.viewLayer.offsetLeftAndRight(x3 - i);
            }
            int i8 = this.y;
            if (i8 != y2) {
                this.viewLayer.offsetTopAndBottom(y2 - i8);
            }
        } else {
            if (getClip()) {
                this.clipBoundsInvalidated = true;
            }
            int i9 = (int) (size >> 32);
            int i10 = (int) (4294967295L & size);
            this.viewLayer.layout(x3, y2, x3 + i9, y2 + i10);
            this.size = size;
            if (this.shouldManuallySetCenterPivot) {
                this.viewLayer.setPivotX(i9 / 2.0f);
                this.viewLayer.setPivotY(i10 / 2.0f);
            }
        }
        this.x = x3;
        this.y = y2;
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    public void setRenderEffect(@Nullable RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
        if (Build.VERSION.SDK_INT >= 31) {
            ViewLayerVerificationHelper31.INSTANCE.setRenderEffect(this.viewLayer, renderEffect);
        }
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    public void setRotationX(float f) {
        this.rotationX = f;
        this.viewLayer.setRotationX(f);
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    public void setRotationY(float f) {
        this.rotationY = f;
        this.viewLayer.setRotationY(f);
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    public void setRotationZ(float f) {
        this.rotationZ = f;
        this.viewLayer.setRotation(f);
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    public void setScaleX(float f) {
        this.scaleX = f;
        this.viewLayer.setScaleX(f);
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    public void setScaleY(float f) {
        this.scaleY = f;
        this.viewLayer.setScaleY(f);
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    public void setShadowElevation(float f) {
        this.shadowElevation = f;
        this.viewLayer.setElevation(f);
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    /* renamed from: setSpotShadowColor-8_81llA */
    public void mo11347setSpotShadowColor8_81llA(long j7) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.spotShadowColor = j7;
            ViewLayerVerificationHelper28.INSTANCE.setOutlineSpotShadowColor(this.viewLayer, ColorKt.m10736toArgb8_81llA(j7));
        }
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    public void setTranslationX(float f) {
        this.translationX = f;
        this.viewLayer.setTranslationX(f);
    }

    @Override // androidx.compose.p011ui.graphics.layer.GraphicsLayerImpl
    public void setTranslationY(float f) {
        this.translationY = f;
        this.viewLayer.setTranslationY(f);
    }

    public /* synthetic */ GraphicsViewLayer(DrawChildContainer drawChildContainer, long j7, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope, int i, AbstractC5824e abstractC5824e) {
        this(drawChildContainer, j7, (i & 4) != 0 ? new CanvasHolder() : canvasHolder, (i & 8) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }
}
