package androidx.compose.p013ui.graphics.drawscope;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p013ui.graphics.BlendMode;
import androidx.compose.p013ui.graphics.Brush;
import androidx.compose.p013ui.graphics.Canvas;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorFilter;
import androidx.compose.p013ui.graphics.FilterQuality;
import androidx.compose.p013ui.graphics.ImageBitmap;
import androidx.compose.p013ui.graphics.Paint;
import androidx.compose.p013ui.graphics.PaintingStyle;
import androidx.compose.p013ui.graphics.Path;
import androidx.compose.p013ui.graphics.PathEffect;
import androidx.compose.p013ui.graphics.StrokeCap;
import androidx.compose.p013ui.graphics.StrokeJoin;
import androidx.compose.p013ui.graphics.layer.GraphicsLayer;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.material.color.utilities.Contrast;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0002\u0092\u0001B\u0005¢\u0006\u0002\u0010\u0002JJ\u0010\u0019\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$H\u0002ø\u0001\u0000¢\u0006\u0004\b%\u0010&JH\u0010\u0019\u001a\u00020\u00112\u0006\u0010'\u001a\u00020(2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$H\u0002ø\u0001\u0000¢\u0006\u0004\b)\u0010*Jl\u0010+\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u0001032\b\b\u0001\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$H\u0002ø\u0001\u0000¢\u0006\u0004\b4\u00105Jj\u0010+\u001a\u00020\u00112\u0006\u0010'\u001a\u00020(2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u0001032\b\b\u0001\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$H\u0002ø\u0001\u0000¢\u0006\u0004\b6\u00107JL\u00108\u001a\u0002092\u0006\u0010\u0003\u001a\u00020:2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0017\u0010?\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002090@¢\u0006\u0002\bAH\u0086\bø\u0001\u0000¢\u0006\u0004\bB\u0010CJf\u0010D\u001a\u0002092\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010E\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u00042\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010=\u001a\u00020>2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\bK\u0010LJf\u0010D\u001a\u0002092\u0006\u0010'\u001a\u00020(2\u0006\u0010E\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u00042\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010=\u001a\u00020>2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\bM\u0010NJN\u0010O\u001a\u0002092\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010P\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020J2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\bR\u0010SJN\u0010O\u001a\u0002092\u0006\u0010'\u001a\u00020(2\u0006\u0010P\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020J2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\bT\u0010UJF\u0010V\u001a\u0002092\u0006\u0010W\u001a\u00020X2\u0006\u0010I\u001a\u00020J2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\bY\u0010ZJ^\u0010V\u001a\u0002092\u0006\u0010W\u001a\u00020X2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020\\2\u0006\u0010`\u001a\u00020^2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0017ø\u0001\u0000¢\u0006\u0004\ba\u0010bJf\u0010V\u001a\u0002092\u0006\u0010W\u001a\u00020X2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020\\2\u0006\u0010`\u001a\u00020^2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016ø\u0001\u0000¢\u0006\u0004\bc\u0010dJ`\u0010e\u001a\u0002092\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010f\u001a\u00020J2\u0006\u0010g\u001a\u00020J2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/2\b\u00102\u001a\u0004\u0018\u0001032\b\b\u0001\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\bh\u0010iJ`\u0010e\u001a\u0002092\u0006\u0010'\u001a\u00020(2\u0006\u0010f\u001a\u00020J2\u0006\u0010g\u001a\u00020J2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/2\b\u00102\u001a\u0004\u0018\u0001032\b\b\u0001\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\bj\u0010kJN\u0010l\u001a\u0002092\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010I\u001a\u00020J2\u0006\u0010=\u001a\u00020>2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\bm\u0010nJN\u0010l\u001a\u0002092\u0006\u0010'\u001a\u00020(2\u0006\u0010I\u001a\u00020J2\u0006\u0010=\u001a\u00020>2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\bo\u0010pJF\u0010q\u001a\u0002092\u0006\u0010r\u001a\u00020s2\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\bt\u0010uJF\u0010q\u001a\u0002092\u0006\u0010r\u001a\u00020s2\u0006\u0010'\u001a\u00020(2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\bv\u0010wJf\u0010x\u001a\u0002092\f\u0010y\u001a\b\u0012\u0004\u0012\u00020J0z2\u0006\u0010{\u001a\u00020|2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/2\b\u00102\u001a\u0004\u0018\u0001032\b\b\u0001\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0004\b}\u0010~Jg\u0010x\u001a\u0002092\f\u0010y\u001a\b\u0012\u0004\u0012\u00020J0z2\u0006\u0010{\u001a\u00020|2\u0006\u0010'\u001a\u00020(2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010.\u001a\u00020/2\b\u00102\u001a\u0004\u0018\u0001032\b\b\u0001\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0005\b\u007f\u0010\u0080\u0001JP\u0010\u0081\u0001\u001a\u0002092\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010I\u001a\u00020J2\u0006\u0010=\u001a\u00020>2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0005\b\u0082\u0001\u0010nJP\u0010\u0081\u0001\u001a\u0002092\u0006\u0010'\u001a\u00020(2\u0006\u0010I\u001a\u00020J2\u0006\u0010=\u001a\u00020>2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0005\b\u0083\u0001\u0010pJ[\u0010\u0084\u0001\u001a\u0002092\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010I\u001a\u00020J2\u0006\u0010=\u001a\u00020>2\b\u0010\u0085\u0001\u001a\u00030\u0086\u00012\b\b\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J[\u0010\u0084\u0001\u001a\u0002092\u0006\u0010'\u001a\u00020(2\u0006\u0010I\u001a\u00020J2\u0006\u0010=\u001a\u00020>2\b\u0010\u0085\u0001\u001a\u00030\u0086\u00012\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0001\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016ø\u0001\u0000¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\t\u0010\u008b\u0001\u001a\u00020\u0011H\u0002J\t\u0010\u008c\u0001\u001a\u00020\u0011H\u0002J\u0012\u0010\u008d\u0001\u001a\u00020\u00112\u0007\u0010\u008e\u0001\u001a\u00020\u001dH\u0002J!\u0010\u008f\u0001\u001a\u00020(*\u00020(2\u0006\u0010\u001e\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0093\u0001"}, m13558d2 = {"Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "()V", "density", "", "getDensity", "()F", "drawContext", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "getDrawContext", "()Landroidx/compose/ui/graphics/drawscope/DrawContext;", "drawParams", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "getDrawParams$annotations", "getDrawParams", "()Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "fillPaint", "Landroidx/compose/ui/graphics/Paint;", "fontScale", "getFontScale", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "strokePaint", "configurePaint", "brush", "Landroidx/compose/ui/graphics/Brush;", "style", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "alpha", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "configurePaint-swdJneE", "(Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;II)Landroidx/compose/ui/graphics/Paint;", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Color;", "configurePaint-2qPWKa0", "(JLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;II)Landroidx/compose/ui/graphics/Paint;", "configureStrokePaint", "strokeWidth", "miter", "cap", "Landroidx/compose/ui/graphics/StrokeCap;", "join", "Landroidx/compose/ui/graphics/StrokeJoin;", "pathEffect", "Landroidx/compose/ui/graphics/PathEffect;", "configureStrokePaint-ho4zsrM", "(Landroidx/compose/ui/graphics/Brush;FFIILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;II)Landroidx/compose/ui/graphics/Paint;", "configureStrokePaint-Q_0CZUI", "(JFFIILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;II)Landroidx/compose/ui/graphics/Paint;", "draw", "", "Landroidx/compose/ui/unit/Density;", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "size", "Landroidx/compose/ui/geometry/Size;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "draw-yzxVdVo", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;JLkotlin/jvm/functions/Function1;)V", "drawArc", "startAngle", "sweepAngle", "useCenter", "", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "drawArc-illE91I", "(Landroidx/compose/ui/graphics/Brush;FFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawArc-yD3GUKo", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle", "radius", "center", "drawCircle-V9BoPsw", "(Landroidx/compose/ui/graphics/Brush;FJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle-VaOC9Bg", "(JFJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawImage", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "drawImage-gbVJVH8", "(Landroidx/compose/ui/graphics/ImageBitmap;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "srcOffset", "Landroidx/compose/ui/unit/IntOffset;", "srcSize", "Landroidx/compose/ui/unit/IntSize;", "dstOffset", "dstSize", "drawImage-9jGpkUE", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawImage-AZ2fEMs", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;II)V", "drawLine", "start", "end", "drawLine-1RTmtNc", "(Landroidx/compose/ui/graphics/Brush;JJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawLine-NGM6Ib0", "(JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval", "drawOval-AsUm42w", "(Landroidx/compose/ui/graphics/Brush;JJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval-n-J9OG0", "(JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath", "path", "Landroidx/compose/ui/graphics/Path;", "drawPath-GBMwjPU", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath-LG529CI", "(Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints", "points", "", "pointMode", "Landroidx/compose/ui/graphics/PointMode;", "drawPoints-Gsft0Ws", "(Ljava/util/List;ILandroidx/compose/ui/graphics/Brush;FILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints-F8ZwMP8", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawRect", "drawRect-AsUm42w", "drawRect-n-J9OG0", "drawRoundRect", "cornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "drawRoundRect-ZuiqVtQ", "(Landroidx/compose/ui/graphics/Brush;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRoundRect-u-Aw5IA", "(JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "obtainFillPaint", "obtainStrokePaint", "selectPaint", "drawStyle", "modulate", "modulate-5vOe2sY", "(JF)J", "DrawParams", "ui-graphics_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nCanvasDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 6 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,775:1\n65#2:776\n69#2:779\n65#2:782\n69#2:786\n65#2:790\n69#2:793\n65#2:796\n69#2:800\n65#2:804\n69#2:807\n65#2:810\n69#2:814\n65#2:824\n69#2:827\n65#2:830\n69#2:834\n65#2:844\n69#2:847\n65#2:850\n69#2:854\n65#2:858\n69#2:861\n65#2:864\n69#2:868\n65#2:872\n69#2:875\n65#2:878\n69#2:882\n65#2:886\n69#2:889\n65#2:892\n69#2:896\n60#3:777\n70#3:780\n60#3:783\n70#3:787\n60#3:791\n70#3:794\n60#3:797\n70#3:801\n60#3:805\n70#3:808\n60#3:811\n70#3:815\n60#3:819\n70#3:822\n60#3:825\n70#3:828\n60#3:831\n70#3:835\n60#3:839\n70#3:842\n60#3:845\n70#3:848\n60#3:851\n70#3:855\n60#3:859\n70#3:862\n60#3:865\n70#3:869\n60#3:873\n70#3:876\n60#3:879\n70#3:883\n60#3:887\n70#3:890\n60#3:893\n70#3:897\n22#4:778\n22#4:781\n22#4:784\n22#4:788\n22#4:792\n22#4:795\n22#4:798\n22#4:802\n22#4:806\n22#4:809\n22#4:812\n22#4:816\n22#4:820\n22#4:823\n22#4:826\n22#4:829\n22#4:832\n22#4:836\n22#4:840\n22#4:843\n22#4:846\n22#4:849\n22#4:852\n22#4:856\n22#4:860\n22#4:863\n22#4:866\n22#4:870\n22#4:874\n22#4:877\n22#4:880\n22#4:884\n22#4:888\n22#4:891\n22#4:894\n22#4:898\n57#5:785\n61#5:789\n57#5:799\n61#5:803\n57#5:813\n61#5:817\n57#5:833\n61#5:837\n57#5:853\n61#5:857\n57#5:867\n61#5:871\n57#5:881\n61#5:885\n57#5:895\n61#5:899\n48#6:818\n53#6:821\n48#6:838\n53#6:841\n1#7:900\n*S KotlinDebug\n*F\n+ 1 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n*L\n177#1:776\n178#1:779\n179#1:782\n180#1:786\n195#1:790\n196#1:793\n197#1:796\n198#1:800\n283#1:804\n284#1:807\n285#1:810\n286#1:814\n304#1:824\n305#1:827\n306#1:830\n307#1:834\n356#1:844\n357#1:847\n358#1:850\n359#1:854\n374#1:858\n375#1:861\n376#1:864\n377#1:868\n395#1:872\n396#1:875\n397#1:878\n398#1:882\n419#1:886\n420#1:889\n421#1:892\n422#1:896\n177#1:777\n178#1:780\n179#1:783\n180#1:787\n195#1:791\n196#1:794\n197#1:797\n198#1:801\n283#1:805\n284#1:808\n285#1:811\n286#1:815\n287#1:819\n288#1:822\n304#1:825\n305#1:828\n306#1:831\n307#1:835\n308#1:839\n309#1:842\n356#1:845\n357#1:848\n358#1:851\n359#1:855\n374#1:859\n375#1:862\n376#1:865\n377#1:869\n395#1:873\n396#1:876\n397#1:879\n398#1:883\n419#1:887\n420#1:890\n421#1:893\n422#1:897\n177#1:778\n178#1:781\n179#1:784\n180#1:788\n195#1:792\n196#1:795\n197#1:798\n198#1:802\n283#1:806\n284#1:809\n285#1:812\n286#1:816\n287#1:820\n288#1:823\n304#1:826\n305#1:829\n306#1:832\n307#1:836\n308#1:840\n309#1:843\n356#1:846\n357#1:849\n358#1:852\n359#1:856\n374#1:860\n375#1:863\n376#1:866\n377#1:870\n395#1:874\n396#1:877\n397#1:880\n398#1:884\n419#1:888\n420#1:891\n421#1:894\n422#1:898\n179#1:785\n180#1:789\n197#1:799\n198#1:803\n285#1:813\n286#1:817\n306#1:833\n307#1:837\n358#1:853\n359#1:857\n376#1:867\n377#1:871\n397#1:881\n398#1:885\n421#1:895\n422#1:899\n287#1:818\n288#1:821\n308#1:838\n309#1:841\n*E\n"})
/* loaded from: classes2.dex */
public final class CanvasDrawScope implements DrawScope {
    private Paint fillPaint;
    private Paint strokePaint;
    private final DrawParams drawParams = new DrawParams(null, null, null, 0, 15, null);
    private final DrawContext drawContext = new DrawContext() { // from class: androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1
        private GraphicsLayer graphicsLayer;
        private final DrawTransform transform = CanvasDrawScopeKt.asDrawTransform(this);

        @Override // androidx.compose.p013ui.graphics.drawscope.DrawContext
        public Canvas getCanvas() {
            return this.this$0.getDrawParams().getCanvas();
        }

        @Override // androidx.compose.p013ui.graphics.drawscope.DrawContext
        public Density getDensity() {
            return this.this$0.getDrawParams().getDensity();
        }

        @Override // androidx.compose.p013ui.graphics.drawscope.DrawContext
        public GraphicsLayer getGraphicsLayer() {
            return this.graphicsLayer;
        }

        @Override // androidx.compose.p013ui.graphics.drawscope.DrawContext
        public LayoutDirection getLayoutDirection() {
            return this.this$0.getDrawParams().getLayoutDirection();
        }

        @Override // androidx.compose.p013ui.graphics.drawscope.DrawContext
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public long mo21448getSizeNHjbRc() {
            return this.this$0.getDrawParams().m21446getSizeNHjbRc();
        }

        @Override // androidx.compose.p013ui.graphics.drawscope.DrawContext
        public DrawTransform getTransform() {
            return this.transform;
        }

        @Override // androidx.compose.p013ui.graphics.drawscope.DrawContext
        public void setCanvas(Canvas canvas) {
            this.this$0.getDrawParams().setCanvas(canvas);
        }

        @Override // androidx.compose.p013ui.graphics.drawscope.DrawContext
        public void setDensity(Density density) {
            this.this$0.getDrawParams().setDensity(density);
        }

        @Override // androidx.compose.p013ui.graphics.drawscope.DrawContext
        public void setGraphicsLayer(GraphicsLayer graphicsLayer) {
            this.graphicsLayer = graphicsLayer;
        }

        @Override // androidx.compose.p013ui.graphics.drawscope.DrawContext
        public void setLayoutDirection(LayoutDirection layoutDirection) {
            this.this$0.getDrawParams().setLayoutDirection(layoutDirection);
        }

        @Override // androidx.compose.p013ui.graphics.drawscope.DrawContext
        /* renamed from: setSize-uvyYCjk, reason: not valid java name */
        public void mo21449setSizeuvyYCjk(long j10) {
            this.this$0.getDrawParams().m21447setSizeuvyYCjk(j10);
        }
    };

    @Metadata(m13557d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u0016\u0010\u001f\u001a\u00020\tHÆ\u0003ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\u0018J;\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\b\u001a\u00020\tX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, m13558d2 = {"Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "", "density", "Landroidx/compose/ui/unit/Density;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "size", "Landroidx/compose/ui/geometry/Size;", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCanvas", "()Landroidx/compose/ui/graphics/Canvas;", "setCanvas", "(Landroidx/compose/ui/graphics/Canvas;)V", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "getSize-NH-jbRc", "()J", "setSize-uvyYCjk", "(J)V", "J", "component1", "component2", "component3", "component4", "component4-NH-jbRc", "copy", "copy-Ug5Nnss", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/Canvas;J)Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope$DrawParams;", "equals", "", "other", "hashCode", "", "toString", "", "ui-graphics_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    @PublishedApi
    public static final /* data */ class DrawParams {
        private Canvas canvas;
        private Density density;
        private LayoutDirection layoutDirection;
        private long size;

        public /* synthetic */ DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long j10, DefaultConstructorMarker defaultConstructorMarker) {
            this(density, layoutDirection, canvas, j10);
        }

        /* renamed from: copy-Ug5Nnss$default, reason: not valid java name */
        public static /* synthetic */ DrawParams m21443copyUg5Nnss$default(DrawParams drawParams, Density density, LayoutDirection layoutDirection, Canvas canvas, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                density = drawParams.density;
            }
            if ((i10 & 2) != 0) {
                layoutDirection = drawParams.layoutDirection;
            }
            if ((i10 & 4) != 0) {
                canvas = drawParams.canvas;
            }
            if ((i10 & 8) != 0) {
                j10 = drawParams.size;
            }
            Canvas canvas2 = canvas;
            return drawParams.m21445copyUg5Nnss(density, layoutDirection, canvas2, j10);
        }

        /* renamed from: component1, reason: from getter */
        public final Density getDensity() {
            return this.density;
        }

        /* renamed from: component2, reason: from getter */
        public final LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        /* renamed from: component3, reason: from getter */
        public final Canvas getCanvas() {
            return this.canvas;
        }

        /* renamed from: component4-NH-jbRc, reason: not valid java name and from getter */
        public final long getSize() {
            return this.size;
        }

        /* renamed from: copy-Ug5Nnss, reason: not valid java name */
        public final DrawParams m21445copyUg5Nnss(Density density, LayoutDirection layoutDirection, Canvas canvas, long size) {
            return new DrawParams(density, layoutDirection, canvas, size, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DrawParams)) {
                return false;
            }
            DrawParams drawParams = (DrawParams) other;
            return Intrinsics.areEqual(this.density, drawParams.density) && this.layoutDirection == drawParams.layoutDirection && Intrinsics.areEqual(this.canvas, drawParams.canvas) && Size.m20800equalsimpl0(this.size, drawParams.size);
        }

        public final Canvas getCanvas() {
            return this.canvas;
        }

        public final Density getDensity() {
            return this.density;
        }

        public final LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public final long m21446getSizeNHjbRc() {
            return this.size;
        }

        public int hashCode() {
            return (((((this.density.hashCode() * 31) + this.layoutDirection.hashCode()) * 31) + this.canvas.hashCode()) * 31) + Size.m20805hashCodeimpl(this.size);
        }

        public final void setCanvas(Canvas canvas) {
            this.canvas = canvas;
        }

        public final void setDensity(Density density) {
            this.density = density;
        }

        public final void setLayoutDirection(LayoutDirection layoutDirection) {
            this.layoutDirection = layoutDirection;
        }

        /* renamed from: setSize-uvyYCjk, reason: not valid java name */
        public final void m21447setSizeuvyYCjk(long j10) {
            this.size = j10;
        }

        public String toString() {
            return "DrawParams(density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", canvas=" + this.canvas + ", size=" + ((Object) Size.m20808toStringimpl(this.size)) + ')';
        }

        private DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long j10) {
            this.density = density;
            this.layoutDirection = layoutDirection;
            this.canvas = canvas;
            this.size = j10;
        }

        public /* synthetic */ DrawParams(Density density, LayoutDirection layoutDirection, Canvas canvas, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? DrawContextKt.getDefaultDensity() : density, (i10 & 2) != 0 ? LayoutDirection.Ltr : layoutDirection, (i10 & 4) != 0 ? EmptyCanvas.INSTANCE : canvas, (i10 & 8) != 0 ? Size.INSTANCE.m20813getZeroNHjbRc() : j10, null);
        }
    }

    /* renamed from: configurePaint-2qPWKa0, reason: not valid java name */
    private final Paint m21414configurePaint2qPWKa0(long color, DrawStyle style, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = Contrast.RATIO_MIN) float alpha, ColorFilter colorFilter, int blendMode, int filterQuality) {
        Paint paintSelectPaint = selectPaint(style);
        long jM21422modulate5vOe2sY = m21422modulate5vOe2sY(color, alpha);
        if (!Color.m20977equalsimpl0(paintSelectPaint.mo20849getColor0d7_KjU(), jM21422modulate5vOe2sY)) {
            paintSelectPaint.mo20855setColor8_81llA(jM21422modulate5vOe2sY);
        }
        if (paintSelectPaint.getInternalShader() != null) {
            paintSelectPaint.setShader(null);
        }
        if (!Intrinsics.areEqual(paintSelectPaint.getInternalColorFilter(), colorFilter)) {
            paintSelectPaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m20887equalsimpl0(paintSelectPaint.get_blendMode(), blendMode)) {
            paintSelectPaint.mo20854setBlendModes9anfk8(blendMode);
        }
        if (!FilterQuality.m21070equalsimpl0(paintSelectPaint.mo20850getFilterQualityfv9h1I(), filterQuality)) {
            paintSelectPaint.mo20856setFilterQualityvDHp3xo(filterQuality);
        }
        return paintSelectPaint;
    }

    /* renamed from: configurePaint-2qPWKa0$default, reason: not valid java name */
    public static /* synthetic */ Paint m21415configurePaint2qPWKa0$default(CanvasDrawScope canvasDrawScope, long j10, DrawStyle drawStyle, float f10, ColorFilter colorFilter, int i10, int i11, int i12, Object obj) {
        return canvasDrawScope.m21414configurePaint2qPWKa0(j10, drawStyle, f10, colorFilter, i10, (i12 & 32) != 0 ? DrawScope.INSTANCE.m21530getDefaultFilterQualityfv9h1I() : i11);
    }

    /* renamed from: configurePaint-swdJneE, reason: not valid java name */
    private final Paint m21416configurePaintswdJneE(Brush brush, DrawStyle style, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = Contrast.RATIO_MIN) float alpha, ColorFilter colorFilter, int blendMode, int filterQuality) {
        Paint paintSelectPaint = selectPaint(style);
        if (brush != null) {
            brush.mo20923applyToPq9zytI(mo21527getSizeNHjbRc(), paintSelectPaint, alpha);
        } else {
            if (paintSelectPaint.getInternalShader() != null) {
                paintSelectPaint.setShader(null);
            }
            long jMo20849getColor0d7_KjU = paintSelectPaint.mo20849getColor0d7_KjU();
            Color.Companion companion = Color.INSTANCE;
            if (!Color.m20977equalsimpl0(jMo20849getColor0d7_KjU, companion.m21002getBlack0d7_KjU())) {
                paintSelectPaint.mo20855setColor8_81llA(companion.m21002getBlack0d7_KjU());
            }
            if (paintSelectPaint.getAlpha() != alpha) {
                paintSelectPaint.setAlpha(alpha);
            }
        }
        if (!Intrinsics.areEqual(paintSelectPaint.getInternalColorFilter(), colorFilter)) {
            paintSelectPaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m20887equalsimpl0(paintSelectPaint.get_blendMode(), blendMode)) {
            paintSelectPaint.mo20854setBlendModes9anfk8(blendMode);
        }
        if (!FilterQuality.m21070equalsimpl0(paintSelectPaint.mo20850getFilterQualityfv9h1I(), filterQuality)) {
            paintSelectPaint.mo20856setFilterQualityvDHp3xo(filterQuality);
        }
        return paintSelectPaint;
    }

    /* renamed from: configurePaint-swdJneE$default, reason: not valid java name */
    public static /* synthetic */ Paint m21417configurePaintswdJneE$default(CanvasDrawScope canvasDrawScope, Brush brush, DrawStyle drawStyle, float f10, ColorFilter colorFilter, int i10, int i11, int i12, Object obj) {
        if ((i12 & 32) != 0) {
            i11 = DrawScope.INSTANCE.m21530getDefaultFilterQualityfv9h1I();
        }
        return canvasDrawScope.m21416configurePaintswdJneE(brush, drawStyle, f10, colorFilter, i10, i11);
    }

    /* renamed from: configureStrokePaint-Q_0CZUI, reason: not valid java name */
    private final Paint m21418configureStrokePaintQ_0CZUI(long color, float strokeWidth, float miter, int cap, int join, PathEffect pathEffect, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = Contrast.RATIO_MIN) float alpha, ColorFilter colorFilter, int blendMode, int filterQuality) {
        Paint paintObtainStrokePaint = obtainStrokePaint();
        long jM21422modulate5vOe2sY = m21422modulate5vOe2sY(color, alpha);
        if (!Color.m20977equalsimpl0(paintObtainStrokePaint.mo20849getColor0d7_KjU(), jM21422modulate5vOe2sY)) {
            paintObtainStrokePaint.mo20855setColor8_81llA(jM21422modulate5vOe2sY);
        }
        if (paintObtainStrokePaint.getInternalShader() != null) {
            paintObtainStrokePaint.setShader(null);
        }
        if (!Intrinsics.areEqual(paintObtainStrokePaint.getInternalColorFilter(), colorFilter)) {
            paintObtainStrokePaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m20887equalsimpl0(paintObtainStrokePaint.get_blendMode(), blendMode)) {
            paintObtainStrokePaint.mo20854setBlendModes9anfk8(blendMode);
        }
        if (paintObtainStrokePaint.getStrokeWidth() != strokeWidth) {
            paintObtainStrokePaint.setStrokeWidth(strokeWidth);
        }
        if (paintObtainStrokePaint.getStrokeMiterLimit() != miter) {
            paintObtainStrokePaint.setStrokeMiterLimit(miter);
        }
        if (!StrokeCap.m21325equalsimpl0(paintObtainStrokePaint.mo20851getStrokeCapKaPHkGw(), cap)) {
            paintObtainStrokePaint.mo20857setStrokeCapBeK7IIE(cap);
        }
        if (!StrokeJoin.m21335equalsimpl0(paintObtainStrokePaint.mo20852getStrokeJoinLxFBmk8(), join)) {
            paintObtainStrokePaint.mo20858setStrokeJoinWw9F2mQ(join);
        }
        if (!Intrinsics.areEqual(paintObtainStrokePaint.getPathEffect(), pathEffect)) {
            paintObtainStrokePaint.setPathEffect(pathEffect);
        }
        if (!FilterQuality.m21070equalsimpl0(paintObtainStrokePaint.mo20850getFilterQualityfv9h1I(), filterQuality)) {
            paintObtainStrokePaint.mo20856setFilterQualityvDHp3xo(filterQuality);
        }
        return paintObtainStrokePaint;
    }

    /* renamed from: configureStrokePaint-Q_0CZUI$default, reason: not valid java name */
    public static /* synthetic */ Paint m21419configureStrokePaintQ_0CZUI$default(CanvasDrawScope canvasDrawScope, long j10, float f10, float f11, int i10, int i11, PathEffect pathEffect, float f12, ColorFilter colorFilter, int i12, int i13, int i14, Object obj) {
        return canvasDrawScope.m21418configureStrokePaintQ_0CZUI(j10, f10, f11, i10, i11, pathEffect, f12, colorFilter, i12, (i14 & 512) != 0 ? DrawScope.INSTANCE.m21530getDefaultFilterQualityfv9h1I() : i13);
    }

    /* renamed from: configureStrokePaint-ho4zsrM, reason: not valid java name */
    private final Paint m21420configureStrokePaintho4zsrM(Brush brush, float strokeWidth, float miter, int cap, int join, PathEffect pathEffect, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = Contrast.RATIO_MIN) float alpha, ColorFilter colorFilter, int blendMode, int filterQuality) {
        Paint paintObtainStrokePaint = obtainStrokePaint();
        if (brush != null) {
            brush.mo20923applyToPq9zytI(mo21527getSizeNHjbRc(), paintObtainStrokePaint, alpha);
        } else if (paintObtainStrokePaint.getAlpha() != alpha) {
            paintObtainStrokePaint.setAlpha(alpha);
        }
        if (!Intrinsics.areEqual(paintObtainStrokePaint.getInternalColorFilter(), colorFilter)) {
            paintObtainStrokePaint.setColorFilter(colorFilter);
        }
        if (!BlendMode.m20887equalsimpl0(paintObtainStrokePaint.get_blendMode(), blendMode)) {
            paintObtainStrokePaint.mo20854setBlendModes9anfk8(blendMode);
        }
        if (paintObtainStrokePaint.getStrokeWidth() != strokeWidth) {
            paintObtainStrokePaint.setStrokeWidth(strokeWidth);
        }
        if (paintObtainStrokePaint.getStrokeMiterLimit() != miter) {
            paintObtainStrokePaint.setStrokeMiterLimit(miter);
        }
        if (!StrokeCap.m21325equalsimpl0(paintObtainStrokePaint.mo20851getStrokeCapKaPHkGw(), cap)) {
            paintObtainStrokePaint.mo20857setStrokeCapBeK7IIE(cap);
        }
        if (!StrokeJoin.m21335equalsimpl0(paintObtainStrokePaint.mo20852getStrokeJoinLxFBmk8(), join)) {
            paintObtainStrokePaint.mo20858setStrokeJoinWw9F2mQ(join);
        }
        if (!Intrinsics.areEqual(paintObtainStrokePaint.getPathEffect(), pathEffect)) {
            paintObtainStrokePaint.setPathEffect(pathEffect);
        }
        if (!FilterQuality.m21070equalsimpl0(paintObtainStrokePaint.mo20850getFilterQualityfv9h1I(), filterQuality)) {
            paintObtainStrokePaint.mo20856setFilterQualityvDHp3xo(filterQuality);
        }
        return paintObtainStrokePaint;
    }

    /* renamed from: configureStrokePaint-ho4zsrM$default, reason: not valid java name */
    public static /* synthetic */ Paint m21421configureStrokePaintho4zsrM$default(CanvasDrawScope canvasDrawScope, Brush brush, float f10, float f11, int i10, int i11, PathEffect pathEffect, float f12, ColorFilter colorFilter, int i12, int i13, int i14, Object obj) {
        return canvasDrawScope.m21420configureStrokePaintho4zsrM(brush, f10, f11, i10, i11, pathEffect, f12, colorFilter, i12, (i14 & 512) != 0 ? DrawScope.INSTANCE.m21530getDefaultFilterQualityfv9h1I() : i13);
    }

    @PublishedApi
    public static /* synthetic */ void getDrawParams$annotations() {
    }

    /* renamed from: modulate-5vOe2sY, reason: not valid java name */
    private final long m21422modulate5vOe2sY(long j10, float f10) {
        return f10 == 1.0f ? j10 : Color.m20975copywmQWz5c$default(j10, Color.m20978getAlphaimpl(j10) * f10, 0.0f, 0.0f, 0.0f, 14, null);
    }

    private final Paint obtainFillPaint() {
        Paint paint = this.fillPaint;
        if (paint != null) {
            return paint;
        }
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo20859setStylek9PVt8s(PaintingStyle.INSTANCE.m21243getFillTiuSbCo());
        this.fillPaint = Paint;
        return Paint;
    }

    private final Paint obtainStrokePaint() {
        Paint paint = this.strokePaint;
        if (paint != null) {
            return paint;
        }
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo20859setStylek9PVt8s(PaintingStyle.INSTANCE.m21244getStrokeTiuSbCo());
        this.strokePaint = Paint;
        return Paint;
    }

    private final Paint selectPaint(DrawStyle drawStyle) {
        if (Intrinsics.areEqual(drawStyle, Fill.INSTANCE)) {
            return obtainFillPaint();
        }
        if (!(drawStyle instanceof Stroke)) {
            throw new NoWhenBranchMatchedException();
        }
        Paint paintObtainStrokePaint = obtainStrokePaint();
        Stroke stroke = (Stroke) drawStyle;
        if (paintObtainStrokePaint.getStrokeWidth() != stroke.getWidth()) {
            paintObtainStrokePaint.setStrokeWidth(stroke.getWidth());
        }
        if (!StrokeCap.m21325equalsimpl0(paintObtainStrokePaint.mo20851getStrokeCapKaPHkGw(), stroke.getCap())) {
            paintObtainStrokePaint.mo20857setStrokeCapBeK7IIE(stroke.getCap());
        }
        if (paintObtainStrokePaint.getStrokeMiterLimit() != stroke.getMiter()) {
            paintObtainStrokePaint.setStrokeMiterLimit(stroke.getMiter());
        }
        if (!StrokeJoin.m21335equalsimpl0(paintObtainStrokePaint.mo20852getStrokeJoinLxFBmk8(), stroke.getJoin())) {
            paintObtainStrokePaint.mo20858setStrokeJoinWw9F2mQ(stroke.getJoin());
        }
        if (!Intrinsics.areEqual(paintObtainStrokePaint.getPathEffect(), stroke.getPathEffect())) {
            paintObtainStrokePaint.setPathEffect(stroke.getPathEffect());
        }
        return paintObtainStrokePaint;
    }

    /* renamed from: draw-yzxVdVo, reason: not valid java name */
    public final void m21423drawyzxVdVo(Density density, LayoutDirection layoutDirection, Canvas canvas, long size, Function1<? super DrawScope, Unit> block) {
        DrawParams drawParams = getDrawParams();
        Density density2 = drawParams.getDensity();
        LayoutDirection layoutDirection2 = drawParams.getLayoutDirection();
        Canvas canvas2 = drawParams.getCanvas();
        long size2 = drawParams.getSize();
        DrawParams drawParams2 = getDrawParams();
        drawParams2.setDensity(density);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m21447setSizeuvyYCjk(size);
        canvas.save();
        block.invoke(this);
        canvas.restore();
        DrawParams drawParams3 = getDrawParams();
        drawParams3.setDensity(density2);
        drawParams3.setLayoutDirection(layoutDirection2);
        drawParams3.setCanvas(canvas2);
        drawParams3.m21447setSizeuvyYCjk(size2);
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-illE91I, reason: not valid java name */
    public void mo21424drawArcillE91I(Brush brush, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = Contrast.RATIO_MIN) float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        int i10 = (int) (topLeft >> 32);
        int i11 = (int) (topLeft & 4294967295L);
        this.drawParams.getCanvas().drawArc(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat(i10) + Float.intBitsToFloat((int) (size >> 32)), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (size & 4294967295L)), startAngle, sweepAngle, useCenter, m21417configurePaintswdJneE$default(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawArc-yD3GUKo, reason: not valid java name */
    public void mo21425drawArcyD3GUKo(long color, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = Contrast.RATIO_MIN) float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        int i10 = (int) (topLeft >> 32);
        int i11 = (int) (topLeft & 4294967295L);
        this.drawParams.getCanvas().drawArc(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat(i10) + Float.intBitsToFloat((int) (size >> 32)), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (size & 4294967295L)), startAngle, sweepAngle, useCenter, m21415configurePaint2qPWKa0$default(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-V9BoPsw, reason: not valid java name */
    public void mo21426drawCircleV9BoPsw(Brush brush, float radius, long center, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = Contrast.RATIO_MIN) float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().mo20832drawCircle9KIMszo(center, radius, m21417configurePaintswdJneE$default(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawCircle-VaOC9Bg, reason: not valid java name */
    public void mo21427drawCircleVaOC9Bg(long color, float radius, long center, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = Contrast.RATIO_MIN) float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().mo20832drawCircle9KIMszo(center, radius, m21415configurePaint2qPWKa0$default(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @ReplaceWith(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    /* renamed from: drawImage-9jGpkUE, reason: not valid java name */
    public /* synthetic */ void mo21428drawImage9jGpkUE(ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = Contrast.RATIO_MIN) float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().mo20834drawImageRectHPBpro0(image, srcOffset, srcSize, dstOffset, dstSize, m21417configurePaintswdJneE$default(this, null, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-AZ2fEMs, reason: not valid java name */
    public void mo21429drawImageAZ2fEMs(ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = Contrast.RATIO_MIN) float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode, int filterQuality) {
        this.drawParams.getCanvas().mo20834drawImageRectHPBpro0(image, srcOffset, srcSize, dstOffset, dstSize, m21416configurePaintswdJneE(null, style, alpha, colorFilter, blendMode, filterQuality));
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawImage-gbVJVH8, reason: not valid java name */
    public void mo21430drawImagegbVJVH8(ImageBitmap image, long topLeft, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = Contrast.RATIO_MIN) float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().mo20833drawImaged4ec7I(image, topLeft, m21417configurePaintswdJneE$default(this, null, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-1RTmtNc, reason: not valid java name */
    public void mo21431drawLine1RTmtNc(Brush brush, long start, long end, float strokeWidth, int cap, PathEffect pathEffect, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = Contrast.RATIO_MIN) float alpha, ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().mo20835drawLineWko1d7g(start, end, m21421configureStrokePaintho4zsrM$default(this, brush, strokeWidth, 4.0f, cap, StrokeJoin.INSTANCE.m21340getMiterLxFBmk8(), pathEffect, alpha, colorFilter, blendMode, 0, 512, null));
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawLine-NGM6Ib0, reason: not valid java name */
    public void mo21432drawLineNGM6Ib0(long color, long start, long end, float strokeWidth, int cap, PathEffect pathEffect, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = Contrast.RATIO_MIN) float alpha, ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().mo20835drawLineWko1d7g(start, end, m21419configureStrokePaintQ_0CZUI$default(this, color, strokeWidth, 4.0f, cap, StrokeJoin.INSTANCE.m21340getMiterLxFBmk8(), pathEffect, alpha, colorFilter, blendMode, 0, 512, null));
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-AsUm42w, reason: not valid java name */
    public void mo21433drawOvalAsUm42w(Brush brush, long topLeft, long size, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = Contrast.RATIO_MIN) float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        int i10 = (int) (topLeft >> 32);
        int i11 = (int) (topLeft & 4294967295L);
        this.drawParams.getCanvas().drawOval(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat(i10) + Float.intBitsToFloat((int) (size >> 32)), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (size & 4294967295L)), m21417configurePaintswdJneE$default(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawOval-n-J9OG0, reason: not valid java name */
    public void mo21434drawOvalnJ9OG0(long color, long topLeft, long size, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = Contrast.RATIO_MIN) float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        int i10 = (int) (topLeft >> 32);
        int i11 = (int) (topLeft & 4294967295L);
        this.drawParams.getCanvas().drawOval(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat(i10) + Float.intBitsToFloat((int) (size >> 32)), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (size & 4294967295L)), m21415configurePaint2qPWKa0$default(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-GBMwjPU, reason: not valid java name */
    public void mo21435drawPathGBMwjPU(Path path, Brush brush, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = Contrast.RATIO_MIN) float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().drawPath(path, m21417configurePaintswdJneE$default(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawPath-LG529CI, reason: not valid java name */
    public void mo21436drawPathLG529CI(Path path, long color, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = Contrast.RATIO_MIN) float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().drawPath(path, m21415configurePaint2qPWKa0$default(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-F8ZwMP8, reason: not valid java name */
    public void mo21437drawPointsF8ZwMP8(List<Offset> points, int pointMode, long color, float strokeWidth, int cap, PathEffect pathEffect, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = Contrast.RATIO_MIN) float alpha, ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().mo20836drawPointsO7TthRY(pointMode, points, m21419configureStrokePaintQ_0CZUI$default(this, color, strokeWidth, 4.0f, cap, StrokeJoin.INSTANCE.m21340getMiterLxFBmk8(), pathEffect, alpha, colorFilter, blendMode, 0, 512, null));
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawPoints-Gsft0Ws, reason: not valid java name */
    public void mo21438drawPointsGsft0Ws(List<Offset> points, int pointMode, Brush brush, float strokeWidth, int cap, PathEffect pathEffect, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = Contrast.RATIO_MIN) float alpha, ColorFilter colorFilter, int blendMode) {
        this.drawParams.getCanvas().mo20836drawPointsO7TthRY(pointMode, points, m21421configureStrokePaintho4zsrM$default(this, brush, strokeWidth, 4.0f, cap, StrokeJoin.INSTANCE.m21340getMiterLxFBmk8(), pathEffect, alpha, colorFilter, blendMode, 0, 512, null));
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-AsUm42w, reason: not valid java name */
    public void mo21439drawRectAsUm42w(Brush brush, long topLeft, long size, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = Contrast.RATIO_MIN) float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        int i10 = (int) (topLeft >> 32);
        int i11 = (int) (topLeft & 4294967295L);
        this.drawParams.getCanvas().drawRect(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat(i10) + Float.intBitsToFloat((int) (size >> 32)), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (size & 4294967295L)), m21417configurePaintswdJneE$default(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawRect-n-J9OG0, reason: not valid java name */
    public void mo21440drawRectnJ9OG0(long color, long topLeft, long size, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = Contrast.RATIO_MIN) float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        int i10 = (int) (topLeft >> 32);
        int i11 = (int) (topLeft & 4294967295L);
        this.drawParams.getCanvas().drawRect(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat(i10) + Float.intBitsToFloat((int) (size >> 32)), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (size & 4294967295L)), m21415configurePaint2qPWKa0$default(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-ZuiqVtQ, reason: not valid java name */
    public void mo21441drawRoundRectZuiqVtQ(Brush brush, long topLeft, long size, long cornerRadius, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = Contrast.RATIO_MIN) float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode) {
        int i10 = (int) (topLeft >> 32);
        int i11 = (int) (topLeft & 4294967295L);
        this.drawParams.getCanvas().drawRoundRect(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat(i10) + Float.intBitsToFloat((int) (size >> 32)), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (size & 4294967295L)), Float.intBitsToFloat((int) (cornerRadius >> 32)), Float.intBitsToFloat((int) (cornerRadius & 4294967295L)), m21417configurePaintswdJneE$default(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    /* renamed from: drawRoundRect-u-Aw5IA, reason: not valid java name */
    public void mo21442drawRoundRectuAw5IA(long color, long topLeft, long size, long cornerRadius, DrawStyle style, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = Contrast.RATIO_MIN) float alpha, ColorFilter colorFilter, int blendMode) {
        int i10 = (int) (topLeft >> 32);
        int i11 = (int) (topLeft & 4294967295L);
        this.drawParams.getCanvas().drawRoundRect(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat(i10) + Float.intBitsToFloat((int) (size >> 32)), Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (size & 4294967295L)), Float.intBitsToFloat((int) (cornerRadius >> 32)), Float.intBitsToFloat((int) (cornerRadius & 4294967295L)), m21415configurePaint2qPWKa0$default(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.p013ui.unit.Density
    public float getDensity() {
        return this.drawParams.getDensity().getDensity();
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    public DrawContext getDrawContext() {
        return this.drawContext;
    }

    public final DrawParams getDrawParams() {
        return this.drawParams;
    }

    @Override // androidx.compose.p013ui.unit.FontScaling
    public float getFontScale() {
        return this.drawParams.getDensity().getFontScale();
    }

    @Override // androidx.compose.p013ui.graphics.drawscope.DrawScope
    public LayoutDirection getLayoutDirection() {
        return this.drawParams.getLayoutDirection();
    }
}
