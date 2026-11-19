package androidx.compose.p012ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import androidx.compose.p012ui.geometry.CornerRadius;
import androidx.compose.p012ui.geometry.InlineClassHelperKt;
import androidx.compose.p012ui.geometry.Offset;
import androidx.compose.p012ui.geometry.Rect;
import androidx.compose.p012ui.geometry.RoundRectKt;
import androidx.compose.p012ui.geometry.Size;
import androidx.compose.p012ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p012ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p012ui.graphics.AndroidPath;
import androidx.compose.p012ui.graphics.AndroidPath_androidKt;
import androidx.compose.p012ui.graphics.BlendMode;
import androidx.compose.p012ui.graphics.ClipOp;
import androidx.compose.p012ui.graphics.Color;
import androidx.compose.p012ui.graphics.ColorFilter;
import androidx.compose.p012ui.graphics.Outline;
import androidx.compose.p012ui.graphics.Paint;
import androidx.compose.p012ui.graphics.Path;
import androidx.compose.p012ui.graphics.RenderEffect;
import androidx.compose.p012ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.p012ui.graphics.drawscope.DrawContext;
import androidx.compose.p012ui.graphics.drawscope.DrawContextKt;
import androidx.compose.p012ui.graphics.drawscope.DrawScope;
import androidx.compose.p012ui.unit.Density;
import androidx.compose.p012ui.unit.IntOffset;
import androidx.compose.p012ui.unit.IntSize;
import androidx.compose.p012ui.unit.IntSizeKt;
import androidx.compose.p012ui.unit.LayoutDirection;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 ½\u00012\u00020\u0001:\u0002½\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u008a\u0001\u001a\u00020,2\u0007\u0010\u008b\u0001\u001a\u00020\u0000H\u0002J\t\u0010\u008c\u0001\u001a\u00020,H\u0002J\t\u0010\u008d\u0001\u001a\u00020,H\u0002J\u000f\u0010\u008e\u0001\u001a\u00020,H\u0000¢\u0006\u0003\b\u008f\u0001J$\u0010\u0090\u0001\u001a\u00020,2\b\u0010\u0091\u0001\u001a\u00030\u0092\u00012\t\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0003\b\u0094\u0001J\u0019\u0010\u0095\u0001\u001a\u00020,2\b\u0010\u0091\u0001\u001a\u00030\u0092\u0001H\u0000¢\u0006\u0003\b\u0096\u0001J\u000f\u0010\u0097\u0001\u001a\u00020,H\u0001¢\u0006\u0003\b\u0098\u0001J\t\u0010\u0099\u0001\u001a\u00020\u0015H\u0002J\t\u0010\u009a\u0001\u001a\u00020QH\u0002J\t\u0010\u009b\u0001\u001a\u00020,H\u0002J\t\u0010\u009c\u0001\u001a\u00020,H\u0002JE\u0010\u009d\u0001\u001a\u00020,2\u0006\u00108\u001a\u0002092\u0006\u0010D\u001a\u00020E2\u0006\u0010u\u001a\u00020t2\u0018\u0010\u009e\u0001\u001a\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*¢\u0006\u0002\b-ø\u0001\u0000¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\t\u0010¡\u0001\u001a\u00020,H\u0002J\t\u0010¢\u0001\u001a\u00020,H\u0002J\u000f\u0010£\u0001\u001a\u00020,H\u0000¢\u0006\u0003\b¤\u0001J\t\u0010¥\u0001\u001a\u00020,H\u0002J5\u0010¦\u0001\u001a\u0003H§\u0001\"\u0005\b\u0000\u0010§\u00012\u001b\u0010\u009e\u0001\u001a\u0016\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020i\u0012\u0005\u0012\u0003H§\u00010¨\u0001H\u0082\b¢\u0006\u0003\u0010©\u0001J\u0010\u0010ª\u0001\u001a\u00020,2\u0007\u0010«\u0001\u001a\u00020KJ&\u0010¬\u0001\u001a\u00020,2\u0007\u0010\u0080\u0001\u001a\u00020\u007f2\u0006\u0010u\u001a\u00020tH\u0002ø\u0001\u0000¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J(\u0010¯\u0001\u001a\u00020,2\t\b\u0002\u0010\u0080\u0001\u001a\u00020R2\b\b\u0002\u0010u\u001a\u00020iø\u0001\u0000¢\u0006\u0006\b°\u0001\u0010®\u0001J3\u0010±\u0001\u001a\u00020,2\t\b\u0002\u0010\u0080\u0001\u001a\u00020R2\b\b\u0002\u0010u\u001a\u00020i2\t\b\u0002\u0010²\u0001\u001a\u00020\bø\u0001\u0000¢\u0006\u0006\b³\u0001\u0010´\u0001J\u0011\u0010µ\u0001\u001a\u00030¶\u0001H\u0086@¢\u0006\u0003\u0010·\u0001J\u0013\u0010¸\u0001\u001a\u00020,2\b\u0010¹\u0001\u001a\u00030º\u0001H\u0002J\u0014\u0010»\u0001\u001a\u0004\u0018\u00010\u00152\u0007\u0010«\u0001\u001a\u00020KH\u0002J\r\u0010¼\u0001\u001a\u00020,*\u00020+H\u0002R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u000e8F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00168F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u000b\"\u0004\b\u001e\u0010\rR\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\"\u001a\u00020!2\u0006\u0010\u0007\u001a\u00020!8F@FX\u0086\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001f\u0010)\u001a\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*¢\u0006\u0002\b-X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010/\u001a\u0004\u0018\u00010.2\b\u0010\u0007\u001a\u0004\u0018\u00010.8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R*\u00105\u001a\u0002042\u0006\u0010\u0007\u001a\u0002048F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b6\u0010\u0019\"\u0004\b7\u0010\u001bR\u000e\u00108\u001a\u000209X\u0082\u000e¢\u0006\u0002\n\u0000R\u001f\u0010:\u001a\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*¢\u0006\u0002\b-X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0010\u0010=\u001a\u0004\u0018\u00010>X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010@\u001a\u00020!2\u0006\u0010?\u001a\u00020!@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b@\u0010&R\u0011\u0010A\u001a\u00020B8F¢\u0006\u0006\u001a\u0004\bC\u0010\u0011R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020EX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010F\u001a\u00020>8F¢\u0006\u0006\u001a\u0004\bG\u0010HR\u000e\u0010I\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010J\u001a\u0004\u0018\u00010KX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010L\u001a\u00020B8F¢\u0006\u0006\u001a\u0004\bM\u0010\u0011R\u000e\u0010N\u001a\u00020OX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010P\u001a\u0004\u0018\u00010QX\u0082\u000e¢\u0006\u0002\n\u0000R,\u0010S\u001a\u00020R2\u0006\u0010\u0007\u001a\u00020R@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010V\u001a\u0004\bT\u0010\u0011\"\u0004\bU\u0010\u0013R(\u0010X\u001a\u0004\u0018\u00010W2\b\u0010\u0007\u001a\u0004\u0018\u00010W8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R$\u0010]\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b^\u0010\u000b\"\u0004\b_\u0010\rR$\u0010`\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\ba\u0010\u000b\"\u0004\bb\u0010\rR$\u0010c\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bd\u0010\u000b\"\u0004\be\u0010\rR\u0010\u0010f\u001a\u0004\u0018\u00010KX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010g\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010h\u001a\u00020iX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010VR\u0016\u0010j\u001a\u00020RX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010VR$\u0010k\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bl\u0010\u000b\"\u0004\bm\u0010\rR$\u0010n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bo\u0010\u000b\"\u0004\bp\u0010\rR$\u0010q\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\br\u0010\u000b\"\u0004\bs\u0010\rR,\u0010u\u001a\u00020t2\u0006\u0010\u0007\u001a\u00020t@BX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010V\u001a\u0004\bv\u0010\u0011\"\u0004\bw\u0010\u0013R\u0010\u0010x\u001a\u0004\u0018\u00010yX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010z\u001a\u0004\u0018\u00010{X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010|\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u000e8F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b}\u0010\u0011\"\u0004\b~\u0010\u0013R/\u0010\u0080\u0001\u001a\u00020\u007f2\u0006\u0010\u0007\u001a\u00020\u007f@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0002\u0010V\u001a\u0005\b\u0081\u0001\u0010\u0011\"\u0005\b\u0082\u0001\u0010\u0013R'\u0010\u0083\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0084\u0001\u0010\u000b\"\u0005\b\u0085\u0001\u0010\rR'\u0010\u0086\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0087\u0001\u0010\u000b\"\u0005\b\u0088\u0001\u0010\rR\u000f\u0010\u0089\u0001\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006¾\u0001"}, m13413d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "", "impl", "Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "layerManager", "Landroidx/compose/ui/graphics/layer/LayerManager;", "(Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;Landroidx/compose/ui/graphics/layer/LayerManager;)V", "value", "", "alpha", "getAlpha", "()F", "setAlpha", "(F)V", "Landroidx/compose/ui/graphics/Color;", "ambientShadowColor", "getAmbientShadowColor-0d7_KjU", "()J", "setAmbientShadowColor-8_81llA", "(J)V", "androidOutline", "Landroid/graphics/Outline;", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "getBlendMode-0nO6VwU", "()I", "setBlendMode-s9anfk8", "(I)V", "cameraDistance", "getCameraDistance", "setCameraDistance", "childDependenciesTracker", "Landroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker;", "", "clip", "getClip$annotations", "()V", "getClip", "()Z", "setClip", "(Z)V", "clipDrawBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "Landroidx/compose/ui/graphics/layer/CompositingStrategy;", "compositingStrategy", "getCompositingStrategy-ke2Ky5w", "setCompositingStrategy-Wpw9cng", "density", "Landroidx/compose/ui/unit/Density;", "drawBlock", "getImpl$ui_graphics_release", "()Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "internalOutline", "Landroidx/compose/ui/graphics/Outline;", "<set-?>", "isReleased", "layerId", "", "getLayerId", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "outline", "getOutline", "()Landroidx/compose/ui/graphics/Outline;", "outlineDirty", "outlinePath", "Landroidx/compose/ui/graphics/Path;", "ownerViewId", "getOwnerViewId", "parentLayerUsages", "", "pathBounds", "Landroid/graphics/RectF;", "Landroidx/compose/ui/geometry/Offset;", "pivotOffset", "getPivotOffset-F1C5BW0", "setPivotOffset-k-4lQ0M", "J", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "rotationX", "getRotationX", "setRotationX", "rotationY", "getRotationY", "setRotationY", "rotationZ", "getRotationZ", "setRotationZ", "roundRectClipPath", "roundRectCornerRadius", "roundRectOutlineSize", "Landroidx/compose/ui/geometry/Size;", "roundRectOutlineTopLeft", "scaleX", "getScaleX", "setScaleX", "scaleY", "getScaleY", "setScaleY", "shadowElevation", "getShadowElevation", "setShadowElevation", "Landroidx/compose/ui/unit/IntSize;", "size", "getSize-YbymL2g", "setSize-ozmzZPI", "softwareDrawScope", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "softwareLayerPaint", "Landroidx/compose/ui/graphics/Paint;", "spotShadowColor", "getSpotShadowColor-0d7_KjU", "setSpotShadowColor-8_81llA", "Landroidx/compose/ui/unit/IntOffset;", "topLeft", "getTopLeft-nOcc-ac", "setTopLeft--gyyYBs", "translationX", "getTranslationX", "setTranslationX", "translationY", "getTranslationY", "setTranslationY", "usePathForClip", "addSubLayer", "graphicsLayer", "configureOutlineAndClip", "discardContentIfReleasedAndHaveNoParentLayerUsages", "discardDisplayList", "discardDisplayList$ui_graphics_release", "draw", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "parentLayer", "draw$ui_graphics_release", "drawForPersistence", "drawForPersistence$ui_graphics_release", "emulateTrimMemory", "emulateTrimMemory$ui_graphics_release", "obtainAndroidOutline", "obtainPathBounds", "onAddedToParentLayer", "onRemovedFromParentLayer", "record", "block", "record-mL-hObY", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;JLkotlin/jvm/functions/Function1;)V", "recordInternal", "recreateDisplayListIfNeeded", "release", "release$ui_graphics_release", "resetOutlineParams", "resolveOutlinePosition", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function2;", "(Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "setPathOutline", "path", "setPosition", "setPosition-VbeCjmY", "(JJ)V", "setRectOutline", "setRectOutline-tz77jQw", "setRoundRectOutline", "cornerRadius", "setRoundRectOutline-TNW_H78", "(JJF)V", "toImageBitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transformCanvas", "androidCanvas", "Landroid/graphics/Canvas;", "updatePathOutline", "drawWithChildTracking", "Companion", "ui-graphics_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAndroidGraphicsLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidGraphicsLayer.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayer\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 ChildLayerDependenciesTracker.kt\nandroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 8 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 9 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 10 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n+ 11 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 12 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 13 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 14 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 15 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n*L\n1#1,1018:1\n640#1,6:1109\n646#1,3:1116\n644#1,7:1119\n640#1,6:1190\n646#1,3:1197\n644#1,7:1200\n153#2:1019\n153#2:1115\n153#2:1150\n153#2:1196\n44#3,6:1020\n50#3,14:1027\n64#3,4:1066\n104#3,6:1156\n110#3,3:1187\n1#4:1026\n1#4:1074\n231#5,3:1041\n200#5,7:1044\n211#5,3:1052\n214#5,9:1056\n234#5:1065\n231#5,3:1162\n200#5,7:1165\n211#5,3:1173\n214#5,9:1177\n234#5:1186\n1399#6:1051\n1270#6:1055\n1399#6:1172\n1270#6:1176\n54#7:1070\n59#7:1072\n85#8:1071\n90#8:1073\n80#8:1108\n60#8:1127\n70#8:1134\n60#8:1141\n70#8:1146\n60#8:1208\n70#8:1211\n60#8:1214\n70#8:1217\n53#8,3:1220\n305#9,26:1075\n36#10,5:1101\n36#10,5:1151\n26#11:1106\n22#11,5:1128\n22#11,5:1135\n22#11:1142\n26#11:1144\n22#11:1147\n26#11:1149\n22#11:1209\n22#11:1212\n22#11:1215\n22#11:1218\n30#12:1107\n65#13:1126\n69#13:1133\n65#13:1140\n69#13:1145\n65#13:1207\n69#13:1210\n57#14:1143\n61#14:1148\n57#14:1213\n61#14:1216\n33#15:1219\n*S KotlinDebug\n*F\n+ 1 AndroidGraphicsLayer.android.kt\nandroidx/compose/ui/graphics/layer/GraphicsLayer\n*L\n620#1:1109,6\n620#1:1116,3\n620#1:1119,7\n746#1:1190,6\n746#1:1197,3\n746#1:1200,7\n153#1:1019\n620#1:1115\n645#1:1150\n746#1:1196\n440#1:1020,6\n440#1:1027,14\n440#1:1066,4\n710#1:1156,6\n710#1:1187,3\n440#1:1026\n440#1:1041,3\n440#1:1044,7\n440#1:1052,3\n440#1:1056,9\n440#1:1065\n710#1:1162,3\n710#1:1165,7\n710#1:1173,3\n710#1:1177,9\n710#1:1186\n440#1:1051\n440#1:1055\n710#1:1172\n710#1:1176\n456#1:1070\n457#1:1072\n456#1:1071\n457#1:1073\n605#1:1108\n622#1:1127\n623#1:1134\n625#1:1141\n627#1:1146\n747#1:1208\n748#1:1211\n749#1:1214\n750#1:1217\n754#1:1220,3\n558#1:1075,26\n600#1:1101,5\n663#1:1151,5\n605#1:1106\n622#1:1128,5\n623#1:1135,5\n625#1:1142\n625#1:1144\n627#1:1147\n627#1:1149\n747#1:1209\n748#1:1212\n749#1:1215\n750#1:1218\n605#1:1107\n622#1:1126\n623#1:1133\n625#1:1140\n627#1:1145\n747#1:1207\n748#1:1210\n625#1:1143\n627#1:1148\n749#1:1213\n750#1:1216\n754#1:1219\n*E\n"})
/* loaded from: classes2.dex */
public final class GraphicsLayer {
    private static final LayerSnapshotImpl SnapshotImpl;
    private Outline androidOutline;
    private final ChildLayerDependenciesTracker childDependenciesTracker;
    private boolean clip;
    private final GraphicsLayerImpl impl;
    private androidx.compose.p012ui.graphics.Outline internalOutline;
    private boolean isReleased;
    private final LayerManager layerManager;
    private Path outlinePath;
    private int parentLayerUsages;
    private RectF pathBounds;
    private long pivotOffset;
    private Path roundRectClipPath;
    private float roundRectCornerRadius;
    private long roundRectOutlineSize;
    private long roundRectOutlineTopLeft;
    private long size;
    private CanvasDrawScope softwareDrawScope;
    private Paint softwareLayerPaint;
    private long topLeft;
    private boolean usePathForClip;
    private Density density = DrawContextKt.getDefaultDensity();
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;
    private Function1<? super DrawScope, Unit> drawBlock = new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.graphics.layer.GraphicsLayer$drawBlock$1
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DrawScope drawScope) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
            invoke2(drawScope);
            return Unit.INSTANCE;
        }
    };
    private final Function1<DrawScope, Unit> clipDrawBlock = new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.graphics.layer.GraphicsLayer$clipDrawBlock$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
            invoke2(drawScope);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DrawScope drawScope) {
            Path path = this.this$0.outlinePath;
            if (!this.this$0.usePathForClip || !this.this$0.getClip() || path == null) {
                this.this$0.drawWithChildTracking(drawScope);
                return;
            }
            GraphicsLayer graphicsLayer = this.this$0;
            int iM21398getIntersectrtfAjoo = ClipOp.INSTANCE.m21398getIntersectrtfAjoo();
            DrawContext drawContext = drawScope.getDrawContext();
            long jMo21881getSizeNHjbRc = drawContext.mo21881getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo21883clipPathmtrdDE(path, iM21398getIntersectrtfAjoo);
                graphicsLayer.drawWithChildTracking(drawScope);
            } finally {
                drawContext.getCanvas().restore();
                drawContext.mo21882setSizeuvyYCjk(jMo21881getSizeNHjbRc);
            }
        }
    };
    private boolean outlineDirty = true;

    @Metadata(m13414k = 3, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "androidx.compose.ui.graphics.layer.GraphicsLayer", m13451f = "AndroidGraphicsLayer.android.kt", m13452i = {}, m13453l = {878}, m13454m = "toImageBitmap", m13455n = {}, m13456s = {})
    /* renamed from: androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1 */
    public static final class C27121 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C27121(Continuation<? super C27121> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GraphicsLayer.this.toImageBitmap(this);
        }
    }

    static {
        SnapshotImpl = LayerManager.INSTANCE.isRobolectric() ? LayerSnapshotV21.INSTANCE : Build.VERSION.SDK_INT >= 28 ? LayerSnapshotV28.INSTANCE : SurfaceUtils.INSTANCE.isLockHardwareCanvasAvailable() ? LayerSnapshotV22.INSTANCE : LayerSnapshotV21.INSTANCE;
    }

    public GraphicsLayer(GraphicsLayerImpl graphicsLayerImpl, LayerManager layerManager) {
        this.impl = graphicsLayerImpl;
        this.layerManager = layerManager;
        Offset.Companion companion = Offset.INSTANCE;
        this.roundRectOutlineTopLeft = companion.m21184getZeroF1C5BW0();
        this.roundRectOutlineSize = Size.INSTANCE.m21245getUnspecifiedNHjbRc();
        this.childDependenciesTracker = new ChildLayerDependenciesTracker();
        graphicsLayerImpl.setClip(false);
        this.topLeft = IntOffset.INSTANCE.m24133getZeronOccac();
        this.size = IntSize.INSTANCE.m24170getZeroYbymL2g();
        this.pivotOffset = companion.m21183getUnspecifiedF1C5BW0();
    }

    private final void addSubLayer(GraphicsLayer graphicsLayer) {
        if (this.childDependenciesTracker.onDependencyAdded(graphicsLayer)) {
            graphicsLayer.onAddedToParentLayer();
        }
    }

    private final void configureOutlineAndClip() {
        if (this.outlineDirty) {
            Outline outline = null;
            if (this.clip || getShadowElevation() > 0.0f) {
                Path path = this.outlinePath;
                if (path != null) {
                    RectF rectFObtainPathBounds = obtainPathBounds();
                    if (!(path instanceof AndroidPath)) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    ((AndroidPath) path).getInternalPath().computeBounds(rectFObtainPathBounds, false);
                    Outline outlineUpdatePathOutline = updatePathOutline(path);
                    if (outlineUpdatePathOutline != null) {
                        outlineUpdatePathOutline.setAlpha(getAlpha());
                        outline = outlineUpdatePathOutline;
                    }
                    this.impl.mo22071setOutlineO0kMr_c(outline, IntSize.m24160constructorimpl((4294967295L & Math.round(rectFObtainPathBounds.height())) | (Math.round(rectFObtainPathBounds.width()) << 32)));
                    if (this.usePathForClip && this.clip) {
                        this.impl.setClip(false);
                        this.impl.discardDisplayList();
                    } else {
                        this.impl.setClip(this.clip);
                    }
                } else {
                    this.impl.setClip(this.clip);
                    Size.INSTANCE.m21246getZeroNHjbRc();
                    Outline outlineObtainAndroidOutline = obtainAndroidOutline();
                    long jM24177toSizeozmzZPI = IntSizeKt.m24177toSizeozmzZPI(this.size);
                    long j9 = this.roundRectOutlineTopLeft;
                    long j10 = this.roundRectOutlineSize;
                    long j11 = j10 == InlineClassHelperKt.UnspecifiedPackedFloats ? jM24177toSizeozmzZPI : j10;
                    int i9 = (int) (j9 >> 32);
                    int i10 = (int) (j9 & 4294967295L);
                    outlineObtainAndroidOutline.setRoundRect(Math.round(Float.intBitsToFloat(i9)), Math.round(Float.intBitsToFloat(i10)), Math.round(Float.intBitsToFloat(i9) + Float.intBitsToFloat((int) (j11 >> 32))), Math.round(Float.intBitsToFloat(i10) + Float.intBitsToFloat((int) (j11 & 4294967295L))), this.roundRectCornerRadius);
                    outlineObtainAndroidOutline.setAlpha(getAlpha());
                    this.impl.mo22071setOutlineO0kMr_c(outlineObtainAndroidOutline, IntSizeKt.m24173roundToIntSizeuvyYCjk(j11));
                }
            } else {
                this.impl.setClip(false);
                this.impl.mo22071setOutlineO0kMr_c(null, IntSize.INSTANCE.m24170getZeroYbymL2g());
            }
        }
        this.outlineDirty = false;
    }

    private final void discardContentIfReleasedAndHaveNoParentLayerUsages() {
        if (this.isReleased && this.parentLayerUsages == 0) {
            LayerManager layerManager = this.layerManager;
            if (layerManager != null) {
                layerManager.release(this);
            } else {
                discardDisplayList$ui_graphics_release();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void drawWithChildTracking(androidx.compose.p012ui.graphics.drawscope.DrawScope r15) {
        /*
            r14 = this;
            androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker r0 = r14.childDependenciesTracker
            androidx.compose.ui.graphics.layer.GraphicsLayer r1 = androidx.compose.p012ui.graphics.layer.ChildLayerDependenciesTracker.access$getDependency$p(r0)
            androidx.compose.p012ui.graphics.layer.ChildLayerDependenciesTracker.access$setOldDependency$p(r0, r1)
            androidx.collection.MutableScatterSet r1 = androidx.compose.p012ui.graphics.layer.ChildLayerDependenciesTracker.access$getDependenciesSet$p(r0)
            if (r1 == 0) goto L28
            boolean r2 = r1.isNotEmpty()
            if (r2 == 0) goto L28
            androidx.collection.MutableScatterSet r2 = androidx.compose.p012ui.graphics.layer.ChildLayerDependenciesTracker.access$getOldDependenciesSet$p(r0)
            if (r2 != 0) goto L22
            androidx.collection.MutableScatterSet r2 = androidx.collection.ScatterSetKt.mutableScatterSetOf()
            androidx.compose.p012ui.graphics.layer.ChildLayerDependenciesTracker.access$setOldDependenciesSet$p(r0, r2)
        L22:
            r2.addAll(r1)
            r1.clear()
        L28:
            r1 = 1
            androidx.compose.p012ui.graphics.layer.ChildLayerDependenciesTracker.access$setTrackingInProgress$p(r0, r1)
            kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> r1 = r14.drawBlock
            r1.invoke(r15)
            r15 = 0
            androidx.compose.p012ui.graphics.layer.ChildLayerDependenciesTracker.access$setTrackingInProgress$p(r0, r15)
            androidx.compose.ui.graphics.layer.GraphicsLayer r1 = androidx.compose.p012ui.graphics.layer.ChildLayerDependenciesTracker.access$getOldDependency$p(r0)
            if (r1 == 0) goto L3e
            r1.onRemovedFromParentLayer()
        L3e:
            androidx.collection.MutableScatterSet r0 = androidx.compose.p012ui.graphics.layer.ChildLayerDependenciesTracker.access$getOldDependenciesSet$p(r0)
            if (r0 == 0) goto L91
            boolean r1 = r0.isNotEmpty()
            if (r1 == 0) goto L91
            java.lang.Object[] r1 = r0.elements
            long[] r2 = r0.metadata
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L8e
            r4 = r15
        L54:
            r5 = r2[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L89
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r15
        L6e:
            if (r9 >= r7) goto L87
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L83
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            androidx.compose.ui.graphics.layer.GraphicsLayer r10 = (androidx.compose.p012ui.graphics.layer.GraphicsLayer) r10
            r10.onRemovedFromParentLayer()
        L83:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L6e
        L87:
            if (r7 != r8) goto L8e
        L89:
            if (r4 == r3) goto L8e
            int r4 = r4 + 1
            goto L54
        L8e:
            r0.clear()
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p012ui.graphics.layer.GraphicsLayer.drawWithChildTracking(androidx.compose.ui.graphics.drawscope.DrawScope):void");
    }

    public static /* synthetic */ void getClip$annotations() {
    }

    private final Outline obtainAndroidOutline() {
        Outline outline = this.androidOutline;
        if (outline != null) {
            return outline;
        }
        Outline outline2 = new Outline();
        this.androidOutline = outline2;
        return outline2;
    }

    private final RectF obtainPathBounds() {
        RectF rectF = this.pathBounds;
        if (rectF != null) {
            return rectF;
        }
        RectF rectF2 = new RectF();
        this.pathBounds = rectF2;
        return rectF2;
    }

    private final void onAddedToParentLayer() {
        this.parentLayerUsages++;
    }

    private final void onRemovedFromParentLayer() {
        this.parentLayerUsages--;
        discardContentIfReleasedAndHaveNoParentLayerUsages();
    }

    private final void recordInternal() {
        this.impl.record(this.density, this.layoutDirection, this, this.clipDrawBlock);
    }

    private final void recreateDisplayListIfNeeded() {
        if (this.impl.getHasDisplayList()) {
            return;
        }
        try {
            recordInternal();
        } catch (Throwable unused) {
        }
    }

    private final void resetOutlineParams() {
        this.internalOutline = null;
        this.outlinePath = null;
        this.roundRectOutlineSize = Size.INSTANCE.m21245getUnspecifiedNHjbRc();
        this.roundRectOutlineTopLeft = Offset.INSTANCE.m21184getZeroF1C5BW0();
        this.roundRectCornerRadius = 0.0f;
        this.outlineDirty = true;
        this.usePathForClip = false;
    }

    private final <T> T resolveOutlinePosition(Function2<? super Offset, ? super Size, ? extends T> block) {
        long jM24177toSizeozmzZPI = IntSizeKt.m24177toSizeozmzZPI(this.size);
        long j9 = this.roundRectOutlineTopLeft;
        long j10 = this.roundRectOutlineSize;
        if (j10 != InlineClassHelperKt.UnspecifiedPackedFloats) {
            jM24177toSizeozmzZPI = j10;
        }
        return block.invoke(Offset.m21157boximpl(j9), Size.m21225boximpl(jM24177toSizeozmzZPI));
    }

    /* renamed from: setPosition-VbeCjmY, reason: not valid java name */
    private final void m22043setPositionVbeCjmY(long topLeft, long size) {
        this.impl.mo22073setPositionH0pRuoY(IntOffset.m24122getXimpl(topLeft), IntOffset.m24123getYimpl(topLeft), size);
    }

    /* renamed from: setRectOutline-tz77jQw$default, reason: not valid java name */
    public static /* synthetic */ void m22044setRectOutlinetz77jQw$default(GraphicsLayer graphicsLayer, long j9, long j10, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            j9 = Offset.INSTANCE.m21184getZeroF1C5BW0();
        }
        if ((i9 & 2) != 0) {
            j10 = Size.INSTANCE.m21245getUnspecifiedNHjbRc();
        }
        graphicsLayer.m22059setRectOutlinetz77jQw(j9, j10);
    }

    /* renamed from: setRoundRectOutline-TNW_H78$default, reason: not valid java name */
    public static /* synthetic */ void m22045setRoundRectOutlineTNW_H78$default(GraphicsLayer graphicsLayer, long j9, long j10, float f10, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            j9 = Offset.INSTANCE.m21184getZeroF1C5BW0();
        }
        long j11 = j9;
        if ((i9 & 2) != 0) {
            j10 = Size.INSTANCE.m21245getUnspecifiedNHjbRc();
        }
        long j12 = j10;
        if ((i9 & 4) != 0) {
            f10 = 0.0f;
        }
        graphicsLayer.m22060setRoundRectOutlineTNW_H78(j11, j12, f10);
    }

    /* renamed from: setSize-ozmzZPI, reason: not valid java name */
    private final void m22046setSizeozmzZPI(long j9) {
        if (IntSize.m24163equalsimpl0(this.size, j9)) {
            return;
        }
        this.size = j9;
        m22043setPositionVbeCjmY(this.topLeft, j9);
        if (this.roundRectOutlineSize == InlineClassHelperKt.UnspecifiedPackedFloats) {
            this.outlineDirty = true;
            configureOutlineAndClip();
        }
    }

    private final void transformCanvas(Canvas androidCanvas) {
        Canvas canvas;
        float fM24122getXimpl = IntOffset.m24122getXimpl(this.topLeft);
        float fM24123getYimpl = IntOffset.m24123getYimpl(this.topLeft);
        float fM24122getXimpl2 = IntOffset.m24122getXimpl(this.topLeft) + ((int) (this.size >> 32));
        float fM24123getYimpl2 = IntOffset.m24123getYimpl(this.topLeft) + ((int) (this.size & 4294967295L));
        float alpha = getAlpha();
        ColorFilter colorFilter = getColorFilter();
        int iM22048getBlendMode0nO6VwU = m22048getBlendMode0nO6VwU();
        if (alpha < 1.0f || !BlendMode.m21320equalsimpl0(iM22048getBlendMode0nO6VwU, BlendMode.INSTANCE.m21351getSrcOver0nO6VwU()) || colorFilter != null || CompositingStrategy.m22036equalsimpl0(m22049getCompositingStrategyke2Ky5w(), CompositingStrategy.INSTANCE.m22042getOffscreenke2Ky5w())) {
            Paint Paint = this.softwareLayerPaint;
            if (Paint == null) {
                Paint = AndroidPaint_androidKt.Paint();
                this.softwareLayerPaint = Paint;
            }
            Paint.setAlpha(alpha);
            Paint.mo21287setBlendModes9anfk8(iM22048getBlendMode0nO6VwU);
            Paint.setColorFilter(colorFilter);
            canvas = androidCanvas;
            canvas.saveLayer(fM24122getXimpl, fM24123getYimpl, fM24122getXimpl2, fM24123getYimpl2, Paint.getInternalPaint());
        } else {
            androidCanvas.save();
            canvas = androidCanvas;
        }
        canvas.translate(fM24122getXimpl, fM24123getYimpl);
        canvas.concat(this.impl.calculateMatrix());
    }

    private final Outline updatePathOutline(Path path) {
        Outline outline;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 > 28 || path.isConvex()) {
            Outline outlineObtainAndroidOutline = obtainAndroidOutline();
            if (i9 >= 30) {
                OutlineVerificationHelper.INSTANCE.setPath(outlineObtainAndroidOutline, path);
            } else {
                if (!(path instanceof AndroidPath)) {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
                outlineObtainAndroidOutline.setConvexPath(((AndroidPath) path).getInternalPath());
            }
            this.usePathForClip = !outlineObtainAndroidOutline.canClip();
            outline = outlineObtainAndroidOutline;
        } else {
            Outline outline2 = this.androidOutline;
            if (outline2 != null) {
                outline2.setEmpty();
            }
            this.usePathForClip = true;
            this.impl.setInvalidated(true);
            outline = null;
        }
        this.outlinePath = path;
        return outline;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void discardDisplayList$ui_graphics_release() {
        /*
            r15 = this;
            androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker r0 = r15.childDependenciesTracker
            androidx.compose.ui.graphics.layer.GraphicsLayer r1 = androidx.compose.p012ui.graphics.layer.ChildLayerDependenciesTracker.access$getDependency$p(r0)
            if (r1 == 0) goto Lf
            r1.onRemovedFromParentLayer()
            r1 = 0
            androidx.compose.p012ui.graphics.layer.ChildLayerDependenciesTracker.access$setDependency$p(r0, r1)
        Lf:
            androidx.collection.MutableScatterSet r0 = androidx.compose.p012ui.graphics.layer.ChildLayerDependenciesTracker.access$getDependenciesSet$p(r0)
            if (r0 == 0) goto L5d
            java.lang.Object[] r1 = r0.elements
            long[] r2 = r0.metadata
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L5a
            r4 = 0
            r5 = r4
        L20:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L55
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L3a:
            if (r10 >= r8) goto L53
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L4f
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            androidx.compose.ui.graphics.layer.GraphicsLayer r11 = (androidx.compose.p012ui.graphics.layer.GraphicsLayer) r11
            r11.onRemovedFromParentLayer()
        L4f:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L3a
        L53:
            if (r8 != r9) goto L5a
        L55:
            if (r5 == r3) goto L5a
            int r5 = r5 + 1
            goto L20
        L5a:
            r0.clear()
        L5d:
            androidx.compose.ui.graphics.layer.GraphicsLayerImpl r0 = r15.impl
            r0.discardDisplayList()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p012ui.graphics.layer.GraphicsLayer.discardDisplayList$ui_graphics_release():void");
    }

    public final void draw$ui_graphics_release(androidx.compose.p012ui.graphics.Canvas canvas, GraphicsLayer parentLayer) {
        boolean z9;
        boolean z10;
        if (this.isReleased) {
            return;
        }
        configureOutlineAndClip();
        recreateDisplayListIfNeeded();
        boolean z11 = getShadowElevation() > 0.0f;
        if (z11) {
            canvas.enableZ();
        }
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        boolean zIsHardwareAccelerated = nativeCanvas.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            transformCanvas(nativeCanvas);
        }
        boolean z12 = !zIsHardwareAccelerated && this.clip;
        if (z12) {
            canvas.save();
            androidx.compose.p012ui.graphics.Outline outline = getOutline();
            if (outline instanceof Outline.Rectangle) {
                androidx.compose.p012ui.graphics.Canvas.m21382clipRectmtrdDE$default(canvas, outline.getRect(), 0, 2, null);
            } else if (outline instanceof Outline.Rounded) {
                Path Path = this.roundRectClipPath;
                if (Path != null) {
                    Path.rewind();
                } else {
                    Path = AndroidPath_androidKt.Path();
                    this.roundRectClipPath = Path;
                }
                Path.addRoundRect$default(Path, ((Outline.Rounded) outline).getRoundRect(), null, 2, null);
                androidx.compose.p012ui.graphics.Canvas.m21380clipPathmtrdDE$default(canvas, Path, 0, 2, null);
            } else if (outline instanceof Outline.Generic) {
                androidx.compose.p012ui.graphics.Canvas.m21380clipPathmtrdDE$default(canvas, ((Outline.Generic) outline).getPath(), 0, 2, null);
            }
        }
        if (parentLayer != null) {
            parentLayer.addSubLayer(this);
        }
        if (AndroidCanvas_androidKt.getNativeCanvas(canvas).isHardwareAccelerated() || this.impl.getSupportsSoftwareRendering()) {
            z9 = z11;
            z10 = z12;
            this.impl.draw(canvas);
        } else {
            CanvasDrawScope canvasDrawScope = this.softwareDrawScope;
            if (canvasDrawScope == null) {
                canvasDrawScope = new CanvasDrawScope();
                this.softwareDrawScope = canvasDrawScope;
            }
            CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
            Density density = this.density;
            LayoutDirection layoutDirection = this.layoutDirection;
            long jM24177toSizeozmzZPI = IntSizeKt.m24177toSizeozmzZPI(this.size);
            Density density2 = canvasDrawScope2.getDrawContext().getDensity();
            LayoutDirection layoutDirection2 = canvasDrawScope2.getDrawContext().getLayoutDirection();
            androidx.compose.p012ui.graphics.Canvas canvas2 = canvasDrawScope2.getDrawContext().getCanvas();
            long jMo21881getSizeNHjbRc = canvasDrawScope2.getDrawContext().mo21881getSizeNHjbRc();
            z9 = z11;
            GraphicsLayer graphicsLayer = canvasDrawScope2.getDrawContext().getGraphicsLayer();
            z10 = z12;
            DrawContext drawContext = canvasDrawScope2.getDrawContext();
            drawContext.setDensity(density);
            drawContext.setLayoutDirection(layoutDirection);
            drawContext.setCanvas(canvas);
            drawContext.mo21882setSizeuvyYCjk(jM24177toSizeozmzZPI);
            drawContext.setGraphicsLayer(this);
            canvas.save();
            try {
                drawWithChildTracking(canvasDrawScope2);
            } finally {
                canvas.restore();
                DrawContext drawContext2 = canvasDrawScope2.getDrawContext();
                drawContext2.setDensity(density2);
                drawContext2.setLayoutDirection(layoutDirection2);
                drawContext2.setCanvas(canvas2);
                drawContext2.mo21882setSizeuvyYCjk(jMo21881getSizeNHjbRc);
                drawContext2.setGraphicsLayer(graphicsLayer);
            }
        }
        if (z10) {
            canvas.restore();
        }
        if (z9) {
            canvas.disableZ();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        nativeCanvas.restore();
    }

    public final void drawForPersistence$ui_graphics_release(androidx.compose.p012ui.graphics.Canvas canvas) {
        if (AndroidCanvas_androidKt.getNativeCanvas(canvas).isHardwareAccelerated() || this.impl.getSupportsSoftwareRendering()) {
            recreateDisplayListIfNeeded();
            this.impl.draw(canvas);
        }
    }

    public final void emulateTrimMemory$ui_graphics_release() {
        this.impl.discardDisplayList();
    }

    public final float getAlpha() {
        return this.impl.getAlpha();
    }

    /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    public final long m22047getAmbientShadowColor0d7_KjU() {
        return this.impl.getAmbientShadowColor();
    }

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m22048getBlendMode0nO6VwU() {
        return this.impl.getBlendMode();
    }

    public final float getCameraDistance() {
        return this.impl.getCameraDistance();
    }

    public final boolean getClip() {
        return this.clip;
    }

    public final ColorFilter getColorFilter() {
        return this.impl.getColorFilter();
    }

    /* renamed from: getCompositingStrategy-ke2Ky5w, reason: not valid java name */
    public final int m22049getCompositingStrategyke2Ky5w() {
        return this.impl.getCompositingStrategy();
    }

    /* renamed from: getImpl$ui_graphics_release, reason: from getter */
    public final GraphicsLayerImpl getImpl() {
        return this.impl;
    }

    public final long getLayerId() {
        return this.impl.getLayerId();
    }

    public final androidx.compose.p012ui.graphics.Outline getOutline() {
        androidx.compose.p012ui.graphics.Outline rectangle;
        androidx.compose.p012ui.graphics.Outline outline = this.internalOutline;
        Path path = this.outlinePath;
        if (outline != null) {
            return outline;
        }
        if (path != null) {
            Outline.Generic generic = new Outline.Generic(path);
            this.internalOutline = generic;
            return generic;
        }
        long jM24177toSizeozmzZPI = IntSizeKt.m24177toSizeozmzZPI(this.size);
        long j9 = this.roundRectOutlineTopLeft;
        long j10 = this.roundRectOutlineSize;
        if (j10 != InlineClassHelperKt.UnspecifiedPackedFloats) {
            jM24177toSizeozmzZPI = j10;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jM24177toSizeozmzZPI >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = fIntBitsToFloat2 + Float.intBitsToFloat((int) (jM24177toSizeozmzZPI & 4294967295L));
        if (this.roundRectCornerRadius > 0.0f) {
            rectangle = new Outline.Rounded(RoundRectKt.m21222RoundRectgG7oq9Y(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, CornerRadius.m21122constructorimpl((Float.floatToRawIntBits(r0) << 32) | (4294967295L & Float.floatToRawIntBits(r0)))));
        } else {
            rectangle = new Outline.Rectangle(new Rect(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.internalOutline = rectangle;
        return rectangle;
    }

    public final long getOwnerViewId() {
        return this.impl.getOwnerId();
    }

    /* renamed from: getPivotOffset-F1C5BW0, reason: not valid java name and from getter */
    public final long getPivotOffset() {
        return this.pivotOffset;
    }

    public final RenderEffect getRenderEffect() {
        return this.impl.getRenderEffect();
    }

    public final float getRotationX() {
        return this.impl.getRotationX();
    }

    public final float getRotationY() {
        return this.impl.getRotationY();
    }

    public final float getRotationZ() {
        return this.impl.getRotationZ();
    }

    public final float getScaleX() {
        return this.impl.getScaleX();
    }

    public final float getScaleY() {
        return this.impl.getScaleY();
    }

    public final float getShadowElevation() {
        return this.impl.getShadowElevation();
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name and from getter */
    public final long getSize() {
        return this.size;
    }

    /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    public final long m22052getSpotShadowColor0d7_KjU() {
        return this.impl.getSpotShadowColor();
    }

    /* renamed from: getTopLeft-nOcc-ac, reason: not valid java name and from getter */
    public final long getTopLeft() {
        return this.topLeft;
    }

    public final float getTranslationX() {
        return this.impl.getTranslationX();
    }

    public final float getTranslationY() {
        return this.impl.getTranslationY();
    }

    /* renamed from: isReleased, reason: from getter */
    public final boolean getIsReleased() {
        return this.isReleased;
    }

    /* renamed from: record-mL-hObY, reason: not valid java name */
    public final void m22054recordmLhObY(Density density, LayoutDirection layoutDirection, long size, Function1<? super DrawScope, Unit> block) {
        m22046setSizeozmzZPI(size);
        this.density = density;
        this.layoutDirection = layoutDirection;
        this.drawBlock = block;
        this.impl.setInvalidated(true);
        recordInternal();
    }

    public final void release$ui_graphics_release() {
        if (this.isReleased) {
            return;
        }
        this.isReleased = true;
        discardContentIfReleasedAndHaveNoParentLayerUsages();
    }

    public final void setAlpha(float f10) {
        if (this.impl.getAlpha() == f10) {
            return;
        }
        this.impl.setAlpha(f10);
    }

    /* renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
    public final void m22055setAmbientShadowColor8_81llA(long j9) {
        if (Color.m21410equalsimpl0(j9, this.impl.getAmbientShadowColor())) {
            return;
        }
        this.impl.mo22068setAmbientShadowColor8_81llA(j9);
    }

    /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    public final void m22056setBlendModes9anfk8(int i9) {
        if (BlendMode.m21320equalsimpl0(this.impl.getBlendMode(), i9)) {
            return;
        }
        this.impl.mo22069setBlendModes9anfk8(i9);
    }

    public final void setCameraDistance(float f10) {
        if (this.impl.getCameraDistance() == f10) {
            return;
        }
        this.impl.setCameraDistance(f10);
    }

    public final void setClip(boolean z9) {
        if (this.clip != z9) {
            this.clip = z9;
            this.outlineDirty = true;
            configureOutlineAndClip();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (Intrinsics.areEqual(this.impl.getColorFilter(), colorFilter)) {
            return;
        }
        this.impl.setColorFilter(colorFilter);
    }

    /* renamed from: setCompositingStrategy-Wpw9cng, reason: not valid java name */
    public final void m22057setCompositingStrategyWpw9cng(int i9) {
        if (CompositingStrategy.m22036equalsimpl0(this.impl.getCompositingStrategy(), i9)) {
            return;
        }
        this.impl.mo22070setCompositingStrategyWpw9cng(i9);
    }

    public final void setPathOutline(Path path) {
        resetOutlineParams();
        this.outlinePath = path;
        configureOutlineAndClip();
    }

    /* renamed from: setPivotOffset-k-4lQ0M, reason: not valid java name */
    public final void m22058setPivotOffsetk4lQ0M(long j9) {
        if (Offset.m21165equalsimpl0(this.pivotOffset, j9)) {
            return;
        }
        this.pivotOffset = j9;
        this.impl.mo22072setPivotOffsetk4lQ0M(j9);
    }

    /* renamed from: setRectOutline-tz77jQw, reason: not valid java name */
    public final void m22059setRectOutlinetz77jQw(long topLeft, long size) {
        m22060setRoundRectOutlineTNW_H78(topLeft, size, 0.0f);
    }

    public final void setRenderEffect(RenderEffect renderEffect) {
        if (Intrinsics.areEqual(this.impl.getRenderEffect(), renderEffect)) {
            return;
        }
        this.impl.setRenderEffect(renderEffect);
    }

    public final void setRotationX(float f10) {
        if (this.impl.getRotationX() == f10) {
            return;
        }
        this.impl.setRotationX(f10);
    }

    public final void setRotationY(float f10) {
        if (this.impl.getRotationY() == f10) {
            return;
        }
        this.impl.setRotationY(f10);
    }

    public final void setRotationZ(float f10) {
        if (this.impl.getRotationZ() == f10) {
            return;
        }
        this.impl.setRotationZ(f10);
    }

    /* renamed from: setRoundRectOutline-TNW_H78, reason: not valid java name */
    public final void m22060setRoundRectOutlineTNW_H78(long topLeft, long size, float cornerRadius) {
        if (Offset.m21165equalsimpl0(this.roundRectOutlineTopLeft, topLeft) && Size.m21233equalsimpl0(this.roundRectOutlineSize, size) && this.roundRectCornerRadius == cornerRadius && this.outlinePath == null) {
            return;
        }
        resetOutlineParams();
        this.roundRectOutlineTopLeft = topLeft;
        this.roundRectOutlineSize = size;
        this.roundRectCornerRadius = cornerRadius;
        configureOutlineAndClip();
    }

    public final void setScaleX(float f10) {
        if (this.impl.getScaleX() == f10) {
            return;
        }
        this.impl.setScaleX(f10);
    }

    public final void setScaleY(float f10) {
        if (this.impl.getScaleY() == f10) {
            return;
        }
        this.impl.setScaleY(f10);
    }

    public final void setShadowElevation(float f10) {
        if (this.impl.getShadowElevation() == f10) {
            return;
        }
        this.impl.setShadowElevation(f10);
        this.outlineDirty = true;
        configureOutlineAndClip();
    }

    /* renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
    public final void m22061setSpotShadowColor8_81llA(long j9) {
        if (Color.m21410equalsimpl0(j9, this.impl.getSpotShadowColor())) {
            return;
        }
        this.impl.mo22074setSpotShadowColor8_81llA(j9);
    }

    /* renamed from: setTopLeft--gyyYBs, reason: not valid java name */
    public final void m22062setTopLeftgyyYBs(long j9) {
        if (IntOffset.m24121equalsimpl0(this.topLeft, j9)) {
            return;
        }
        this.topLeft = j9;
        m22043setPositionVbeCjmY(j9, this.size);
    }

    public final void setTranslationX(float f10) {
        if (this.impl.getTranslationX() == f10) {
            return;
        }
        this.impl.setTranslationX(f10);
    }

    public final void setTranslationY(float f10) {
        if (this.impl.getTranslationY() == f10) {
            return;
        }
        this.impl.setTranslationY(f10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object toImageBitmap(kotlin.coroutines.Continuation<? super androidx.compose.p012ui.graphics.ImageBitmap> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.p012ui.graphics.layer.GraphicsLayer.C27121
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1 r0 = (androidx.compose.p012ui.graphics.layer.GraphicsLayer.C27121) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1 r0 = new androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.ResultKt.throwOnFailure(r5)
            androidx.compose.ui.graphics.layer.LayerSnapshotImpl r5 = androidx.compose.p012ui.graphics.layer.GraphicsLayer.SnapshotImpl
            r0.label = r3
            java.lang.Object r5 = r5.toBitmap(r4, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            androidx.compose.ui.graphics.ImageBitmap r5 = androidx.compose.p012ui.graphics.AndroidImageBitmap_androidKt.asImageBitmap(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p012ui.graphics.layer.GraphicsLayer.toImageBitmap(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
