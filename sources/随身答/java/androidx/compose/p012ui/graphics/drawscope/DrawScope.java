package androidx.compose.p012ui.graphics.drawscope;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.p012ui.geometry.CornerRadius;
import androidx.compose.p012ui.geometry.Offset;
import androidx.compose.p012ui.geometry.Rect;
import androidx.compose.p012ui.geometry.Size;
import androidx.compose.p012ui.geometry.SizeKt;
import androidx.compose.p012ui.graphics.BlendMode;
import androidx.compose.p012ui.graphics.Brush;
import androidx.compose.p012ui.graphics.Canvas;
import androidx.compose.p012ui.graphics.ColorFilter;
import androidx.compose.p012ui.graphics.FilterQuality;
import androidx.compose.p012ui.graphics.ImageBitmap;
import androidx.compose.p012ui.graphics.Path;
import androidx.compose.p012ui.graphics.PathEffect;
import androidx.compose.p012ui.graphics.StrokeCap;
import androidx.compose.p012ui.graphics.layer.GraphicsLayer;
import androidx.compose.p012ui.unit.Density;
import androidx.compose.p012ui.unit.DpRect;
import androidx.compose.p012ui.unit.IntOffset;
import androidx.compose.p012ui.unit.IntSize;
import androidx.compose.p012ui.unit.IntSizeKt;
import androidx.compose.p012ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.color.utilities.Contrast;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@DrawScopeMarker
@Metadata(m13412d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 u2\u00020\u0001:\u0001uJp\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\b\"\u0010#Jp\u0010\u0011\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\b&\u0010'JX\u0010(\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010)\u001a\u00020\u00162\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\b*\u0010+JX\u0010(\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010)\u001a\u00020\u00162\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\b,\u0010-JN\u0010.\u001a\u00020\u00122\u0006\u0010/\u001a\u0002002\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\b1\u00102Jl\u0010.\u001a\u00020\u00122\u0006\u0010/\u001a\u0002002\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u0002042\b\b\u0002\u00108\u001a\u0002062\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H'ø\u0001\u0000¢\u0006\u0004\b9\u0010:Jv\u0010.\u001a\u00020\u00122\u0006\u0010/\u001a\u0002002\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u0002042\b\b\u0002\u00108\u001a\u0002062\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010;\u001a\u00020<H\u0016ø\u0001\u0000¢\u0006\u0004\b=\u0010>Jj\u0010?\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010@\u001a\u00020\u00032\u0006\u0010A\u001a\u00020\u00032\b\b\u0002\u0010B\u001a\u00020\u00162\b\b\u0002\u0010C\u001a\u00020D2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\bG\u0010HJj\u0010?\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%2\u0006\u0010@\u001a\u00020\u00032\u0006\u0010A\u001a\u00020\u00032\b\b\u0002\u0010B\u001a\u00020\u00162\b\b\u0002\u0010C\u001a\u00020D2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\bI\u0010JJX\u0010K\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\bL\u0010MJX\u0010K\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\bN\u0010OJL\u0010P\u001a\u00020\u00122\u0006\u0010Q\u001a\u00020R2\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\bS\u0010TJL\u0010P\u001a\u00020\u00122\u0006\u0010Q\u001a\u00020R2\u0006\u0010$\u001a\u00020%2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\bU\u0010VJp\u0010W\u001a\u00020\u00122\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00030Y2\u0006\u0010Z\u001a\u00020[2\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010B\u001a\u00020\u00162\b\b\u0002\u0010C\u001a\u00020D2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\b\\\u0010]Jp\u0010W\u001a\u00020\u00122\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00030Y2\u0006\u0010Z\u001a\u00020[2\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010B\u001a\u00020\u00162\b\b\u0002\u0010C\u001a\u00020D2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\b^\u0010_JX\u0010`\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\ba\u0010MJX\u0010`\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\bb\u0010OJb\u0010c\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010d\u001a\u00020e2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\bf\u0010gJb\u0010c\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010d\u001a\u00020e2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\bh\u0010iJ\u001e\u0010j\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010k\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\bl\u0010mJ9\u0010n\u001a\u00020\u0012*\u00020o2\b\b\u0002\u0010\u000e\u001a\u0002062\u0017\u0010p\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00120q¢\u0006\u0002\brH\u0016ø\u0001\u0000¢\u0006\u0004\bs\u0010tR\u001a\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0005ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006vÀ\u0006\u0003"}, m13413d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/unit/Density;", "center", "Landroidx/compose/ui/geometry/Offset;", "getCenter-F1C5BW0", "()J", "drawContext", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "getDrawContext", "()Landroidx/compose/ui/graphics/drawscope/DrawContext;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "drawArc", "", "brush", "Landroidx/compose/ui/graphics/Brush;", "startAngle", "", "sweepAngle", "useCenter", "", "topLeft", "alpha", "style", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "drawArc-illE91I", "(Landroidx/compose/ui/graphics/Brush;FFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Color;", "drawArc-yD3GUKo", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle", "radius", "drawCircle-V9BoPsw", "(Landroidx/compose/ui/graphics/Brush;FJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle-VaOC9Bg", "(JFJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawImage", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "drawImage-gbVJVH8", "(Landroidx/compose/ui/graphics/ImageBitmap;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "srcOffset", "Landroidx/compose/ui/unit/IntOffset;", "srcSize", "Landroidx/compose/ui/unit/IntSize;", "dstOffset", "dstSize", "drawImage-9jGpkUE", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "drawImage-AZ2fEMs", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;II)V", "drawLine", "start", "end", "strokeWidth", "cap", "Landroidx/compose/ui/graphics/StrokeCap;", "pathEffect", "Landroidx/compose/ui/graphics/PathEffect;", "drawLine-1RTmtNc", "(Landroidx/compose/ui/graphics/Brush;JJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawLine-NGM6Ib0", "(JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval", "drawOval-AsUm42w", "(Landroidx/compose/ui/graphics/Brush;JJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval-n-J9OG0", "(JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath", "path", "Landroidx/compose/ui/graphics/Path;", "drawPath-GBMwjPU", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath-LG529CI", "(Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints", "points", "", "pointMode", "Landroidx/compose/ui/graphics/PointMode;", "drawPoints-Gsft0Ws", "(Ljava/util/List;ILandroidx/compose/ui/graphics/Brush;FILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints-F8ZwMP8", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawRect", "drawRect-AsUm42w", "drawRect-n-J9OG0", "drawRoundRect", "cornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "drawRoundRect-ZuiqVtQ", "(Landroidx/compose/ui/graphics/Brush;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRoundRect-u-Aw5IA", "(JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "offsetSize", TypedValues.CycleType.S_WAVE_OFFSET, "offsetSize-PENXr5M", "(JJ)J", "record", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "record-JVtK1S4", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;JLkotlin/jvm/functions/Function1;)V", "Companion", "ui-graphics_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScope\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 7 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,1008:1\n30#2:1009\n30#2:1011\n80#3:1010\n80#3:1012\n60#3:1014\n70#3:1018\n53#3,3:1021\n57#4:1013\n61#4:1017\n22#5:1015\n65#6:1016\n69#6:1019\n33#7:1020\n*S KotlinDebug\n*F\n+ 1 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScope\n*L\n521#1:1009\n558#1:1011\n521#1:1010\n558#1:1012\n920#1:1014\n920#1:1018\n920#1:1021,3\n920#1:1013\n920#1:1017\n920#1:1015\n920#1:1016\n920#1:1019\n920#1:1020\n*E\n"})
/* loaded from: classes2.dex */
public interface DrawScope extends Density {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m13412d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\n\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, m13413d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope$Companion;", "", "()V", "DefaultBlendMode", "Landroidx/compose/ui/graphics/BlendMode;", "getDefaultBlendMode-0nO6VwU", "()I", "I", "DefaultFilterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "getDefaultFilterQuality-f-v9h1I", "ui-graphics_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int DefaultBlendMode = BlendMode.INSTANCE.m21351getSrcOver0nO6VwU();
        private static final int DefaultFilterQuality = FilterQuality.INSTANCE.m21508getLowfv9h1I();

        private Companion() {
        }

        /* renamed from: getDefaultBlendMode-0nO6VwU, reason: not valid java name */
        public final int m21962getDefaultBlendMode0nO6VwU() {
            return DefaultBlendMode;
        }

        /* renamed from: getDefaultFilterQuality-f-v9h1I, reason: not valid java name */
        public final int m21963getDefaultFilterQualityfv9h1I() {
            return DefaultFilterQuality;
        }
    }

    @Metadata(m13414k = 3, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: drawImage-AZ2fEMs, reason: not valid java name */
        public static void m21969drawImageAZ2fEMs(DrawScope drawScope, ImageBitmap imageBitmap, long j9, long j10, long j11, long j12, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i9, int i10) {
            DrawScope.super.mo21862drawImageAZ2fEMs(imageBitmap, j9, j10, j11, j12, f10, drawStyle, colorFilter, i9, i10);
        }

        @Deprecated
        /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m21984getCenterF1C5BW0(DrawScope drawScope) {
            return DrawScope.super.mo21959getCenterF1C5BW0();
        }

        @Deprecated
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m21985getSizeNHjbRc(DrawScope drawScope) {
            return DrawScope.super.mo21960getSizeNHjbRc();
        }

        @Deprecated
        /* renamed from: record-JVtK1S4, reason: not valid java name */
        public static void m21986recordJVtK1S4(DrawScope drawScope, GraphicsLayer graphicsLayer, long j9, Function1<? super DrawScope, Unit> function1) {
            DrawScope.super.mo21961recordJVtK1S4(graphicsLayer, j9, function1);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m21988roundToPxR2X_6o(DrawScope drawScope, long j9) {
            return DrawScope.super.mo17758roundToPxR2X_6o(j9);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m21989roundToPx0680j_4(DrawScope drawScope, float f10) {
            return DrawScope.super.mo17759roundToPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m21990toDpGaN1DYA(DrawScope drawScope, long j9) {
            return DrawScope.super.mo17760toDpGaN1DYA(j9);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m21991toDpu2uoSUM(DrawScope drawScope, float f10) {
            return DrawScope.super.mo17761toDpu2uoSUM(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m21993toDpSizekrfVVM(DrawScope drawScope, long j9) {
            return DrawScope.super.mo17763toDpSizekrfVVM(j9);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m21994toPxR2X_6o(DrawScope drawScope, long j9) {
            return DrawScope.super.mo17764toPxR2X_6o(j9);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m21995toPx0680j_4(DrawScope drawScope, float f10) {
            return DrawScope.super.mo17765toPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        public static Rect toRect(DrawScope drawScope, DpRect dpRect) {
            return DrawScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m21996toSizeXkaWNTQ(DrawScope drawScope, long j9) {
            return DrawScope.super.mo17766toSizeXkaWNTQ(j9);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m21997toSp0xMU5do(DrawScope drawScope, float f10) {
            return DrawScope.super.mo17767toSp0xMU5do(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m21998toSpkPz2Gy4(DrawScope drawScope, float f10) {
            return DrawScope.super.mo17768toSpkPz2Gy4(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m21992toDpu2uoSUM(DrawScope drawScope, int i9) {
            return DrawScope.super.mo17762toDpu2uoSUM(i9);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m21999toSpkPz2Gy4(DrawScope drawScope, int i9) {
            return DrawScope.super.mo17769toSpkPz2Gy4(i9);
        }
    }

    /* renamed from: drawArc-illE91I$default, reason: not valid java name */
    static /* synthetic */ void m21938drawArcillE91I$default(DrawScope drawScope, Brush brush, float f10, float f11, boolean z9, long j9, long j10, float f12, DrawStyle drawStyle, ColorFilter colorFilter, int i9, int i10, Object obj) {
        DrawScope drawScope2;
        long jM21957offsetSizePENXr5M;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-illE91I");
        }
        long jM21184getZeroF1C5BW0 = (i10 & 16) != 0 ? Offset.INSTANCE.m21184getZeroF1C5BW0() : j9;
        if ((i10 & 32) != 0) {
            drawScope2 = drawScope;
            jM21957offsetSizePENXr5M = drawScope2.m21957offsetSizePENXr5M(drawScope.mo21960getSizeNHjbRc(), jM21184getZeroF1C5BW0);
        } else {
            drawScope2 = drawScope;
            jM21957offsetSizePENXr5M = j10;
        }
        drawScope2.mo21857drawArcillE91I(brush, f10, f11, z9, jM21184getZeroF1C5BW0, jM21957offsetSizePENXr5M, (i10 & 64) != 0 ? 1.0f : f12, (i10 & 128) != 0 ? Fill.INSTANCE : drawStyle, (i10 & 256) != 0 ? null : colorFilter, (i10 & 512) != 0 ? INSTANCE.m21962getDefaultBlendMode0nO6VwU() : i9);
    }

    /* renamed from: drawArc-yD3GUKo$default, reason: not valid java name */
    static /* synthetic */ void m21939drawArcyD3GUKo$default(DrawScope drawScope, long j9, float f10, float f11, boolean z9, long j10, long j11, float f12, DrawStyle drawStyle, ColorFilter colorFilter, int i9, int i10, Object obj) {
        DrawScope drawScope2;
        long jM21957offsetSizePENXr5M;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
        }
        long jM21184getZeroF1C5BW0 = (i10 & 16) != 0 ? Offset.INSTANCE.m21184getZeroF1C5BW0() : j10;
        if ((i10 & 32) != 0) {
            drawScope2 = drawScope;
            jM21957offsetSizePENXr5M = drawScope2.m21957offsetSizePENXr5M(drawScope.mo21960getSizeNHjbRc(), jM21184getZeroF1C5BW0);
        } else {
            drawScope2 = drawScope;
            jM21957offsetSizePENXr5M = j11;
        }
        drawScope2.mo21858drawArcyD3GUKo(j9, f10, f11, z9, jM21184getZeroF1C5BW0, jM21957offsetSizePENXr5M, (i10 & 64) != 0 ? 1.0f : f12, (i10 & 128) != 0 ? Fill.INSTANCE : drawStyle, (i10 & 256) != 0 ? null : colorFilter, (i10 & 512) != 0 ? INSTANCE.m21962getDefaultBlendMode0nO6VwU() : i9);
    }

    /* renamed from: drawCircle-V9BoPsw$default, reason: not valid java name */
    static /* synthetic */ void m21940drawCircleV9BoPsw$default(DrawScope drawScope, Brush brush, float f10, long j9, float f11, DrawStyle drawStyle, ColorFilter colorFilter, int i9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-V9BoPsw");
        }
        drawScope.mo21859drawCircleV9BoPsw(brush, (i10 & 2) != 0 ? Size.m21236getMinDimensionimpl(drawScope.mo21960getSizeNHjbRc()) / 2.0f : f10, (i10 & 4) != 0 ? drawScope.mo21959getCenterF1C5BW0() : j9, (i10 & 8) != 0 ? 1.0f : f11, (i10 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i10 & 32) != 0 ? null : colorFilter, (i10 & 64) != 0 ? INSTANCE.m21962getDefaultBlendMode0nO6VwU() : i9);
    }

    /* renamed from: drawCircle-VaOC9Bg$default, reason: not valid java name */
    static /* synthetic */ void m21941drawCircleVaOC9Bg$default(DrawScope drawScope, long j9, float f10, long j10, float f11, DrawStyle drawStyle, ColorFilter colorFilter, int i9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
        }
        if ((i10 & 2) != 0) {
            f10 = Size.m21236getMinDimensionimpl(drawScope.mo21960getSizeNHjbRc()) / 2.0f;
        }
        drawScope.mo21860drawCircleVaOC9Bg(j9, f10, (i10 & 4) != 0 ? drawScope.mo21959getCenterF1C5BW0() : j10, (i10 & 8) != 0 ? 1.0f : f11, (i10 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i10 & 32) != 0 ? null : colorFilter, (i10 & 64) != 0 ? INSTANCE.m21962getDefaultBlendMode0nO6VwU() : i9);
    }

    /* renamed from: drawImage-9jGpkUE$default, reason: not valid java name */
    static /* synthetic */ void m21942drawImage9jGpkUE$default(DrawScope drawScope, ImageBitmap imageBitmap, long j9, long j10, long j11, long j12, float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-9jGpkUE");
        }
        long jM24133getZeronOccac = (i10 & 2) != 0 ? IntOffset.INSTANCE.m24133getZeronOccac() : j9;
        long jM24160constructorimpl = (i10 & 4) != 0 ? IntSize.m24160constructorimpl((imageBitmap.getHeight() & 4294967295L) | (imageBitmap.getWidth() << 32)) : j10;
        drawScope.mo21861drawImage9jGpkUE(imageBitmap, jM24133getZeronOccac, jM24160constructorimpl, (i10 & 8) != 0 ? IntOffset.INSTANCE.m24133getZeronOccac() : j11, (i10 & 16) != 0 ? jM24160constructorimpl : j12, (i10 & 32) != 0 ? 1.0f : f10, (i10 & 64) != 0 ? Fill.INSTANCE : drawStyle, (i10 & 128) != 0 ? null : colorFilter, (i10 & 256) != 0 ? INSTANCE.m21962getDefaultBlendMode0nO6VwU() : i9);
    }

    /* renamed from: drawImage-AZ2fEMs$default, reason: not valid java name */
    static /* synthetic */ void m21943drawImageAZ2fEMs$default(DrawScope drawScope, ImageBitmap imageBitmap, long j9, long j10, long j11, long j12, float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i9, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
        }
        long jM24133getZeronOccac = (i11 & 2) != 0 ? IntOffset.INSTANCE.m24133getZeronOccac() : j9;
        long jM24160constructorimpl = (i11 & 4) != 0 ? IntSize.m24160constructorimpl((imageBitmap.getHeight() & 4294967295L) | (imageBitmap.getWidth() << 32)) : j10;
        drawScope.mo21862drawImageAZ2fEMs(imageBitmap, jM24133getZeronOccac, jM24160constructorimpl, (i11 & 8) != 0 ? IntOffset.INSTANCE.m24133getZeronOccac() : j11, (i11 & 16) != 0 ? jM24160constructorimpl : j12, (i11 & 32) != 0 ? 1.0f : f10, (i11 & 64) != 0 ? Fill.INSTANCE : drawStyle, (i11 & 128) != 0 ? null : colorFilter, (i11 & 256) != 0 ? INSTANCE.m21962getDefaultBlendMode0nO6VwU() : i9, (i11 & 512) != 0 ? INSTANCE.m21963getDefaultFilterQualityfv9h1I() : i10);
    }

    /* renamed from: drawImage-gbVJVH8$default, reason: not valid java name */
    static /* synthetic */ void m21944drawImagegbVJVH8$default(DrawScope drawScope, ImageBitmap imageBitmap, long j9, float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
        }
        drawScope.mo21863drawImagegbVJVH8(imageBitmap, (i10 & 2) != 0 ? Offset.INSTANCE.m21184getZeroF1C5BW0() : j9, (i10 & 4) != 0 ? 1.0f : f10, (i10 & 8) != 0 ? Fill.INSTANCE : drawStyle, (i10 & 16) != 0 ? null : colorFilter, (i10 & 32) != 0 ? INSTANCE.m21962getDefaultBlendMode0nO6VwU() : i9);
    }

    /* renamed from: drawLine-1RTmtNc$default, reason: not valid java name */
    static /* synthetic */ void m21945drawLine1RTmtNc$default(DrawScope drawScope, Brush brush, long j9, long j10, float f10, int i9, PathEffect pathEffect, float f11, ColorFilter colorFilter, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
        }
        drawScope.mo21864drawLine1RTmtNc(brush, j9, j10, (i11 & 8) != 0 ? 0.0f : f10, (i11 & 16) != 0 ? Stroke.INSTANCE.m22031getDefaultCapKaPHkGw() : i9, (i11 & 32) != 0 ? null : pathEffect, (i11 & 64) != 0 ? 1.0f : f11, (i11 & 128) != 0 ? null : colorFilter, (i11 & 256) != 0 ? INSTANCE.m21962getDefaultBlendMode0nO6VwU() : i10);
    }

    /* renamed from: drawLine-NGM6Ib0$default, reason: not valid java name */
    static /* synthetic */ void m21946drawLineNGM6Ib0$default(DrawScope drawScope, long j9, long j10, long j11, float f10, int i9, PathEffect pathEffect, float f11, ColorFilter colorFilter, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
        }
        drawScope.mo21865drawLineNGM6Ib0(j9, j10, j11, (i11 & 8) != 0 ? 0.0f : f10, (i11 & 16) != 0 ? Stroke.INSTANCE.m22031getDefaultCapKaPHkGw() : i9, (i11 & 32) != 0 ? null : pathEffect, (i11 & 64) != 0 ? 1.0f : f11, (i11 & 128) != 0 ? null : colorFilter, (i11 & 256) != 0 ? INSTANCE.m21962getDefaultBlendMode0nO6VwU() : i10);
    }

    /* renamed from: drawOval-AsUm42w$default, reason: not valid java name */
    static /* synthetic */ void m21947drawOvalAsUm42w$default(DrawScope drawScope, Brush brush, long j9, long j10, float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-AsUm42w");
        }
        long jM21184getZeroF1C5BW0 = (i10 & 2) != 0 ? Offset.INSTANCE.m21184getZeroF1C5BW0() : j9;
        drawScope.mo21866drawOvalAsUm42w(brush, jM21184getZeroF1C5BW0, (i10 & 4) != 0 ? drawScope.m21957offsetSizePENXr5M(drawScope.mo21960getSizeNHjbRc(), jM21184getZeroF1C5BW0) : j10, (i10 & 8) != 0 ? 1.0f : f10, (i10 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i10 & 32) != 0 ? null : colorFilter, (i10 & 64) != 0 ? INSTANCE.m21962getDefaultBlendMode0nO6VwU() : i9);
    }

    /* renamed from: drawOval-n-J9OG0$default, reason: not valid java name */
    static /* synthetic */ void m21948drawOvalnJ9OG0$default(DrawScope drawScope, long j9, long j10, long j11, float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-n-J9OG0");
        }
        long jM21184getZeroF1C5BW0 = (i10 & 2) != 0 ? Offset.INSTANCE.m21184getZeroF1C5BW0() : j10;
        drawScope.mo21867drawOvalnJ9OG0(j9, jM21184getZeroF1C5BW0, (i10 & 4) != 0 ? drawScope.m21957offsetSizePENXr5M(drawScope.mo21960getSizeNHjbRc(), jM21184getZeroF1C5BW0) : j11, (i10 & 8) != 0 ? 1.0f : f10, (i10 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i10 & 32) != 0 ? null : colorFilter, (i10 & 64) != 0 ? INSTANCE.m21962getDefaultBlendMode0nO6VwU() : i9);
    }

    /* renamed from: drawPath-GBMwjPU$default, reason: not valid java name */
    static /* synthetic */ void m21949drawPathGBMwjPU$default(DrawScope drawScope, Path path, Brush brush, float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
        }
        if ((i10 & 4) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i10 & 8) != 0) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        if ((i10 & 16) != 0) {
            colorFilter = null;
        }
        ColorFilter colorFilter2 = colorFilter;
        if ((i10 & 32) != 0) {
            i9 = INSTANCE.m21962getDefaultBlendMode0nO6VwU();
        }
        drawScope.mo21868drawPathGBMwjPU(path, brush, f11, drawStyle2, colorFilter2, i9);
    }

    /* renamed from: drawPath-LG529CI$default, reason: not valid java name */
    static /* synthetic */ void m21950drawPathLG529CI$default(DrawScope drawScope, Path path, long j9, float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-LG529CI");
        }
        if ((i10 & 4) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i10 & 8) != 0) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        if ((i10 & 16) != 0) {
            colorFilter = null;
        }
        drawScope.mo21869drawPathLG529CI(path, j9, f11, drawStyle2, colorFilter, (i10 & 32) != 0 ? INSTANCE.m21962getDefaultBlendMode0nO6VwU() : i9);
    }

    /* renamed from: drawPoints-F8ZwMP8$default, reason: not valid java name */
    static /* synthetic */ void m21951drawPointsF8ZwMP8$default(DrawScope drawScope, List list, int i9, long j9, float f10, int i10, PathEffect pathEffect, float f11, ColorFilter colorFilter, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-F8ZwMP8");
        }
        drawScope.mo21870drawPointsF8ZwMP8(list, i9, j9, (i12 & 8) != 0 ? 0.0f : f10, (i12 & 16) != 0 ? StrokeCap.INSTANCE.m21762getButtKaPHkGw() : i10, (i12 & 32) != 0 ? null : pathEffect, (i12 & 64) != 0 ? 1.0f : f11, (i12 & 128) != 0 ? null : colorFilter, (i12 & 256) != 0 ? INSTANCE.m21962getDefaultBlendMode0nO6VwU() : i11);
    }

    /* renamed from: drawPoints-Gsft0Ws$default, reason: not valid java name */
    static /* synthetic */ void m21952drawPointsGsft0Ws$default(DrawScope drawScope, List list, int i9, Brush brush, float f10, int i10, PathEffect pathEffect, float f11, ColorFilter colorFilter, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-Gsft0Ws");
        }
        drawScope.mo21871drawPointsGsft0Ws(list, i9, brush, (i12 & 8) != 0 ? 0.0f : f10, (i12 & 16) != 0 ? StrokeCap.INSTANCE.m21762getButtKaPHkGw() : i10, (i12 & 32) != 0 ? null : pathEffect, (i12 & 64) != 0 ? 1.0f : f11, (i12 & 128) != 0 ? null : colorFilter, (i12 & 256) != 0 ? INSTANCE.m21962getDefaultBlendMode0nO6VwU() : i11);
    }

    /* renamed from: drawRect-AsUm42w$default, reason: not valid java name */
    static /* synthetic */ void m21953drawRectAsUm42w$default(DrawScope drawScope, Brush brush, long j9, long j10, float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
        }
        long jM21184getZeroF1C5BW0 = (i10 & 2) != 0 ? Offset.INSTANCE.m21184getZeroF1C5BW0() : j9;
        drawScope.mo21872drawRectAsUm42w(brush, jM21184getZeroF1C5BW0, (i10 & 4) != 0 ? drawScope.m21957offsetSizePENXr5M(drawScope.mo21960getSizeNHjbRc(), jM21184getZeroF1C5BW0) : j10, (i10 & 8) != 0 ? 1.0f : f10, (i10 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i10 & 32) != 0 ? null : colorFilter, (i10 & 64) != 0 ? INSTANCE.m21962getDefaultBlendMode0nO6VwU() : i9);
    }

    /* renamed from: drawRect-n-J9OG0$default, reason: not valid java name */
    static /* synthetic */ void m21954drawRectnJ9OG0$default(DrawScope drawScope, long j9, long j10, long j11, float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
        }
        long jM21184getZeroF1C5BW0 = (i10 & 2) != 0 ? Offset.INSTANCE.m21184getZeroF1C5BW0() : j10;
        drawScope.mo21873drawRectnJ9OG0(j9, jM21184getZeroF1C5BW0, (i10 & 4) != 0 ? drawScope.m21957offsetSizePENXr5M(drawScope.mo21960getSizeNHjbRc(), jM21184getZeroF1C5BW0) : j11, (i10 & 8) != 0 ? 1.0f : f10, (i10 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i10 & 32) != 0 ? null : colorFilter, (i10 & 64) != 0 ? INSTANCE.m21962getDefaultBlendMode0nO6VwU() : i9);
    }

    /* renamed from: drawRoundRect-ZuiqVtQ$default, reason: not valid java name */
    static /* synthetic */ void m21955drawRoundRectZuiqVtQ$default(DrawScope drawScope, Brush brush, long j9, long j10, long j11, float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
        }
        long jM21184getZeroF1C5BW0 = (i10 & 2) != 0 ? Offset.INSTANCE.m21184getZeroF1C5BW0() : j9;
        drawScope.mo21874drawRoundRectZuiqVtQ(brush, jM21184getZeroF1C5BW0, (i10 & 4) != 0 ? drawScope.m21957offsetSizePENXr5M(drawScope.mo21960getSizeNHjbRc(), jM21184getZeroF1C5BW0) : j10, (i10 & 8) != 0 ? CornerRadius.INSTANCE.m21140getZerokKHJgLs() : j11, (i10 & 16) != 0 ? 1.0f : f10, (i10 & 32) != 0 ? Fill.INSTANCE : drawStyle, (i10 & 64) != 0 ? null : colorFilter, (i10 & 128) != 0 ? INSTANCE.m21962getDefaultBlendMode0nO6VwU() : i9);
    }

    /* renamed from: drawRoundRect-u-Aw5IA$default, reason: not valid java name */
    static /* synthetic */ void m21956drawRoundRectuAw5IA$default(DrawScope drawScope, long j9, long j10, long j11, long j12, DrawStyle drawStyle, float f10, ColorFilter colorFilter, int i9, int i10, Object obj) {
        DrawScope drawScope2;
        long jM21957offsetSizePENXr5M;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-u-Aw5IA");
        }
        long jM21184getZeroF1C5BW0 = (i10 & 2) != 0 ? Offset.INSTANCE.m21184getZeroF1C5BW0() : j10;
        if ((i10 & 4) != 0) {
            drawScope2 = drawScope;
            jM21957offsetSizePENXr5M = drawScope2.m21957offsetSizePENXr5M(drawScope.mo21960getSizeNHjbRc(), jM21184getZeroF1C5BW0);
        } else {
            drawScope2 = drawScope;
            jM21957offsetSizePENXr5M = j11;
        }
        drawScope2.mo21875drawRoundRectuAw5IA(j9, jM21184getZeroF1C5BW0, jM21957offsetSizePENXr5M, (i10 & 8) != 0 ? CornerRadius.INSTANCE.m21140getZerokKHJgLs() : j12, (i10 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i10 & 32) != 0 ? 1.0f : f10, (i10 & 64) != 0 ? null : colorFilter, (i10 & 128) != 0 ? INSTANCE.m21962getDefaultBlendMode0nO6VwU() : i9);
    }

    /* renamed from: offsetSize-PENXr5M, reason: not valid java name */
    private default long m21957offsetSizePENXr5M(long j9, long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32)) - Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L)) - Float.intBitsToFloat((int) (j10 & 4294967295L));
        return Size.m21228constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    /* renamed from: record-JVtK1S4$default, reason: not valid java name */
    static /* synthetic */ void m21958recordJVtK1S4$default(DrawScope drawScope, GraphicsLayer graphicsLayer, long j9, Function1 function1, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: record-JVtK1S4");
        }
        if ((i9 & 1) != 0) {
            j9 = IntSizeKt.m24176toIntSizeuvyYCjk(drawScope.mo21960getSizeNHjbRc());
        }
        drawScope.mo21961recordJVtK1S4(graphicsLayer, j9, function1);
    }

    /* renamed from: drawArc-illE91I */
    void mo21857drawArcillE91I(Brush brush, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = Contrast.RATIO_MIN) float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode);

    /* renamed from: drawArc-yD3GUKo */
    void mo21858drawArcyD3GUKo(long color, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = Contrast.RATIO_MIN) float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode);

    /* renamed from: drawCircle-V9BoPsw */
    void mo21859drawCircleV9BoPsw(Brush brush, float radius, long center, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = Contrast.RATIO_MIN) float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode);

    /* renamed from: drawCircle-VaOC9Bg */
    void mo21860drawCircleVaOC9Bg(long color, float radius, long center, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = Contrast.RATIO_MIN) float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode);

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @ReplaceWith(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    /* renamed from: drawImage-9jGpkUE */
    /* synthetic */ void mo21861drawImage9jGpkUE(ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = Contrast.RATIO_MIN) float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode);

    /* renamed from: drawImage-AZ2fEMs */
    default void mo21862drawImageAZ2fEMs(ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = Contrast.RATIO_MIN) float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode, int filterQuality) {
        m21943drawImageAZ2fEMs$default(this, image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, 0, 512, null);
    }

    /* renamed from: drawImage-gbVJVH8 */
    void mo21863drawImagegbVJVH8(ImageBitmap image, long topLeft, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = Contrast.RATIO_MIN) float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode);

    /* renamed from: drawLine-1RTmtNc */
    void mo21864drawLine1RTmtNc(Brush brush, long start, long end, float strokeWidth, int cap, PathEffect pathEffect, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = Contrast.RATIO_MIN) float alpha, ColorFilter colorFilter, int blendMode);

    /* renamed from: drawLine-NGM6Ib0 */
    void mo21865drawLineNGM6Ib0(long color, long start, long end, float strokeWidth, int cap, PathEffect pathEffect, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = Contrast.RATIO_MIN) float alpha, ColorFilter colorFilter, int blendMode);

    /* renamed from: drawOval-AsUm42w */
    void mo21866drawOvalAsUm42w(Brush brush, long topLeft, long size, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = Contrast.RATIO_MIN) float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode);

    /* renamed from: drawOval-n-J9OG0 */
    void mo21867drawOvalnJ9OG0(long color, long topLeft, long size, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = Contrast.RATIO_MIN) float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode);

    /* renamed from: drawPath-GBMwjPU */
    void mo21868drawPathGBMwjPU(Path path, Brush brush, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = Contrast.RATIO_MIN) float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode);

    /* renamed from: drawPath-LG529CI */
    void mo21869drawPathLG529CI(Path path, long color, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = Contrast.RATIO_MIN) float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode);

    /* renamed from: drawPoints-F8ZwMP8 */
    void mo21870drawPointsF8ZwMP8(List<Offset> points, int pointMode, long color, float strokeWidth, int cap, PathEffect pathEffect, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = Contrast.RATIO_MIN) float alpha, ColorFilter colorFilter, int blendMode);

    /* renamed from: drawPoints-Gsft0Ws */
    void mo21871drawPointsGsft0Ws(List<Offset> points, int pointMode, Brush brush, float strokeWidth, int cap, PathEffect pathEffect, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = Contrast.RATIO_MIN) float alpha, ColorFilter colorFilter, int blendMode);

    /* renamed from: drawRect-AsUm42w */
    void mo21872drawRectAsUm42w(Brush brush, long topLeft, long size, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = Contrast.RATIO_MIN) float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode);

    /* renamed from: drawRect-n-J9OG0 */
    void mo21873drawRectnJ9OG0(long color, long topLeft, long size, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = Contrast.RATIO_MIN) float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode);

    /* renamed from: drawRoundRect-ZuiqVtQ */
    void mo21874drawRoundRectZuiqVtQ(Brush brush, long topLeft, long size, long cornerRadius, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = Contrast.RATIO_MIN) float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode);

    /* renamed from: drawRoundRect-u-Aw5IA */
    void mo21875drawRoundRectuAw5IA(long color, long topLeft, long size, long cornerRadius, DrawStyle style, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = Contrast.RATIO_MIN) float alpha, ColorFilter colorFilter, int blendMode);

    /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
    default long mo21959getCenterF1C5BW0() {
        return SizeKt.m21247getCenteruvyYCjk(getDrawContext().mo21881getSizeNHjbRc());
    }

    DrawContext getDrawContext();

    LayoutDirection getLayoutDirection();

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    default long mo21960getSizeNHjbRc() {
        return getDrawContext().mo21881getSizeNHjbRc();
    }

    /* renamed from: record-JVtK1S4, reason: not valid java name */
    default void mo21961recordJVtK1S4(GraphicsLayer graphicsLayer, long j9, final Function1<? super DrawScope, Unit> function1) {
        graphicsLayer.m22054recordmLhObY(this, getLayoutDirection(), j9, new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.graphics.drawscope.DrawScope$record$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                DrawScope drawScope2 = this.this$0;
                Density density = drawScope.getDrawContext().getDensity();
                LayoutDirection layoutDirection = drawScope.getDrawContext().getLayoutDirection();
                Canvas canvas = drawScope.getDrawContext().getCanvas();
                long jMo21881getSizeNHjbRc = drawScope.getDrawContext().mo21881getSizeNHjbRc();
                GraphicsLayer graphicsLayer2 = drawScope.getDrawContext().getGraphicsLayer();
                Function1<DrawScope, Unit> function12 = function1;
                Density density2 = drawScope2.getDrawContext().getDensity();
                LayoutDirection layoutDirection2 = drawScope2.getDrawContext().getLayoutDirection();
                Canvas canvas2 = drawScope2.getDrawContext().getCanvas();
                long jMo21881getSizeNHjbRc2 = drawScope2.getDrawContext().mo21881getSizeNHjbRc();
                GraphicsLayer graphicsLayer3 = drawScope2.getDrawContext().getGraphicsLayer();
                DrawContext drawContext = drawScope2.getDrawContext();
                drawContext.setDensity(density);
                drawContext.setLayoutDirection(layoutDirection);
                drawContext.setCanvas(canvas);
                drawContext.mo21882setSizeuvyYCjk(jMo21881getSizeNHjbRc);
                drawContext.setGraphicsLayer(graphicsLayer2);
                canvas.save();
                try {
                    function12.invoke(drawScope2);
                } finally {
                    canvas.restore();
                    DrawContext drawContext2 = drawScope2.getDrawContext();
                    drawContext2.setDensity(density2);
                    drawContext2.setLayoutDirection(layoutDirection2);
                    drawContext2.setCanvas(canvas2);
                    drawContext2.mo21882setSizeuvyYCjk(jMo21881getSizeNHjbRc2);
                    drawContext2.setGraphicsLayer(graphicsLayer3);
                }
            }
        });
    }
}
