package androidx.compose.p009ui.graphics.drawscope;

import androidx.annotation.FloatRange;
import androidx.compose.p009ui.geometry.CornerRadius;
import androidx.compose.p009ui.geometry.Offset;
import androidx.compose.p009ui.geometry.Rect;
import androidx.compose.p009ui.geometry.Size;
import androidx.compose.p009ui.geometry.SizeKt;
import androidx.compose.p009ui.graphics.BlendMode;
import androidx.compose.p009ui.graphics.Brush;
import androidx.compose.p009ui.graphics.Canvas;
import androidx.compose.p009ui.graphics.ColorFilter;
import androidx.compose.p009ui.graphics.FilterQuality;
import androidx.compose.p009ui.graphics.ImageBitmap;
import androidx.compose.p009ui.graphics.Path;
import androidx.compose.p009ui.graphics.PathEffect;
import androidx.compose.p009ui.graphics.StrokeCap;
import androidx.compose.p009ui.graphics.layer.GraphicsLayer;
import androidx.compose.p009ui.unit.Density;
import androidx.compose.p009ui.unit.DpRect;
import androidx.compose.p009ui.unit.IntOffset;
import androidx.compose.p009ui.unit.IntSize;
import androidx.compose.p009ui.unit.IntSizeKt;
import androidx.compose.p009ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
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
@Metadata(m7879d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 u2\u00020\u0001:\u0001uJp\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\b\"\u0010#Jp\u0010\u0011\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\b&\u0010'JX\u0010(\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010)\u001a\u00020\u00162\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\b*\u0010+JX\u0010(\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010)\u001a\u00020\u00162\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\b,\u0010-JN\u0010.\u001a\u00020\u00122\u0006\u0010/\u001a\u0002002\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\b1\u00102Jl\u0010.\u001a\u00020\u00122\u0006\u0010/\u001a\u0002002\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u0002042\b\b\u0002\u00108\u001a\u0002062\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H'ø\u0001\u0000¢\u0006\u0004\b9\u0010:Jv\u0010.\u001a\u00020\u00122\u0006\u0010/\u001a\u0002002\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u0002042\b\b\u0002\u00108\u001a\u0002062\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010;\u001a\u00020<H\u0016ø\u0001\u0000¢\u0006\u0004\b=\u0010>Jj\u0010?\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010@\u001a\u00020\u00032\u0006\u0010A\u001a\u00020\u00032\b\b\u0002\u0010B\u001a\u00020\u00162\b\b\u0002\u0010C\u001a\u00020D2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\bG\u0010HJj\u0010?\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%2\u0006\u0010@\u001a\u00020\u00032\u0006\u0010A\u001a\u00020\u00032\b\b\u0002\u0010B\u001a\u00020\u00162\b\b\u0002\u0010C\u001a\u00020D2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\bI\u0010JJX\u0010K\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\bL\u0010MJX\u0010K\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\bN\u0010OJL\u0010P\u001a\u00020\u00122\u0006\u0010Q\u001a\u00020R2\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\bS\u0010TJL\u0010P\u001a\u00020\u00122\u0006\u0010Q\u001a\u00020R2\u0006\u0010$\u001a\u00020%2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\bU\u0010VJp\u0010W\u001a\u00020\u00122\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00030Y2\u0006\u0010Z\u001a\u00020[2\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010B\u001a\u00020\u00162\b\b\u0002\u0010C\u001a\u00020D2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\b\\\u0010]Jp\u0010W\u001a\u00020\u00122\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00030Y2\u0006\u0010Z\u001a\u00020[2\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010B\u001a\u00020\u00162\b\b\u0002\u0010C\u001a\u00020D2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010F2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\b^\u0010_JX\u0010`\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\ba\u0010MJX\u0010`\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\bb\u0010OJb\u0010c\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010d\u001a\u00020e2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\bf\u0010gJb\u0010c\u001a\u00020\u00122\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010d\u001a\u00020e2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0003\u0010\u001b\u001a\u00020\u00162\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\bh\u0010iJ\u001e\u0010j\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010k\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\bl\u0010mJ9\u0010n\u001a\u00020\u0012*\u00020o2\b\b\u0002\u0010\u000e\u001a\u0002062\u0017\u0010p\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00120q¢\u0006\u0002\brH\u0016ø\u0001\u0000¢\u0006\u0004\bs\u0010tR\u001a\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0005ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006vÀ\u0006\u0003"}, m7880d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/unit/Density;", "center", "Landroidx/compose/ui/geometry/Offset;", "getCenter-F1C5BW0", "()J", "drawContext", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "getDrawContext", "()Landroidx/compose/ui/graphics/drawscope/DrawContext;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "drawArc", "", "brush", "Landroidx/compose/ui/graphics/Brush;", "startAngle", "", "sweepAngle", "useCenter", "", "topLeft", "alpha", "style", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "drawArc-illE91I", "(Landroidx/compose/ui/graphics/Brush;FFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Color;", "drawArc-yD3GUKo", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle", "radius", "drawCircle-V9BoPsw", "(Landroidx/compose/ui/graphics/Brush;FJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle-VaOC9Bg", "(JFJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawImage", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "drawImage-gbVJVH8", "(Landroidx/compose/ui/graphics/ImageBitmap;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "srcOffset", "Landroidx/compose/ui/unit/IntOffset;", "srcSize", "Landroidx/compose/ui/unit/IntSize;", "dstOffset", "dstSize", "drawImage-9jGpkUE", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "drawImage-AZ2fEMs", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;II)V", "drawLine", "start", "end", "strokeWidth", "cap", "Landroidx/compose/ui/graphics/StrokeCap;", "pathEffect", "Landroidx/compose/ui/graphics/PathEffect;", "drawLine-1RTmtNc", "(Landroidx/compose/ui/graphics/Brush;JJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawLine-NGM6Ib0", "(JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval", "drawOval-AsUm42w", "(Landroidx/compose/ui/graphics/Brush;JJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval-n-J9OG0", "(JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath", "path", "Landroidx/compose/ui/graphics/Path;", "drawPath-GBMwjPU", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath-LG529CI", "(Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints", "points", "", "pointMode", "Landroidx/compose/ui/graphics/PointMode;", "drawPoints-Gsft0Ws", "(Ljava/util/List;ILandroidx/compose/ui/graphics/Brush;FILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints-F8ZwMP8", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawRect", "drawRect-AsUm42w", "drawRect-n-J9OG0", "drawRoundRect", "cornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "drawRoundRect-ZuiqVtQ", "(Landroidx/compose/ui/graphics/Brush;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRoundRect-u-Aw5IA", "(JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "offsetSize", TypedValues.CycleType.S_WAVE_OFFSET, "offsetSize-PENXr5M", "(JJ)J", "record", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "record-JVtK1S4", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;JLkotlin/jvm/functions/Function1;)V", "Companion", "ui-graphics_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScope\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 7 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,1008:1\n30#2:1009\n30#2:1011\n80#3:1010\n80#3:1012\n60#3:1014\n70#3:1018\n53#3,3:1021\n57#4:1013\n61#4:1017\n22#5:1015\n65#6:1016\n69#6:1019\n33#7:1020\n*S KotlinDebug\n*F\n+ 1 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScope\n*L\n521#1:1009\n558#1:1011\n521#1:1010\n558#1:1012\n920#1:1014\n920#1:1018\n920#1:1021,3\n920#1:1013\n920#1:1017\n920#1:1015\n920#1:1016\n920#1:1019\n920#1:1020\n*E\n"})
/* loaded from: classes2.dex */
public interface DrawScope extends Density {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m7879d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\n\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, m7880d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope$Companion;", "", "()V", "DefaultBlendMode", "Landroidx/compose/ui/graphics/BlendMode;", "getDefaultBlendMode-0nO6VwU", "()I", "I", "DefaultFilterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "getDefaultFilterQuality-f-v9h1I", "ui-graphics_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int DefaultBlendMode = BlendMode.INSTANCE.m13841getSrcOver0nO6VwU();
        private static final int DefaultFilterQuality = FilterQuality.INSTANCE.m13998getLowfv9h1I();

        private Companion() {
        }

        /* renamed from: getDefaultBlendMode-0nO6VwU, reason: not valid java name */
        public final int m14452getDefaultBlendMode0nO6VwU() {
            return DefaultBlendMode;
        }

        /* renamed from: getDefaultFilterQuality-f-v9h1I, reason: not valid java name */
        public final int m14453getDefaultFilterQualityfv9h1I() {
            return DefaultFilterQuality;
        }
    }

    @Metadata(m7881k = 3, m7882mv = {1, 9, 0}, m7884xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: drawImage-AZ2fEMs, reason: not valid java name */
        public static void m14459drawImageAZ2fEMs(DrawScope drawScope, ImageBitmap imageBitmap, long j6, long j7, long j8, long j9, @FloatRange(from = 0.0d, m58to = Contrast.RATIO_MIN) float f6, DrawStyle drawStyle, ColorFilter colorFilter, int i6, int i7) {
            DrawScope.super.mo14352drawImageAZ2fEMs(imageBitmap, j6, j7, j8, j9, f6, drawStyle, colorFilter, i6, i7);
        }

        @Deprecated
        /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m14474getCenterF1C5BW0(DrawScope drawScope) {
            return DrawScope.super.mo14449getCenterF1C5BW0();
        }

        @Deprecated
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m14475getSizeNHjbRc(DrawScope drawScope) {
            return DrawScope.super.mo14450getSizeNHjbRc();
        }

        @Deprecated
        /* renamed from: record-JVtK1S4, reason: not valid java name */
        public static void m14476recordJVtK1S4(DrawScope drawScope, GraphicsLayer graphicsLayer, long j6, Function1<? super DrawScope, Unit> function1) {
            DrawScope.super.mo14451recordJVtK1S4(graphicsLayer, j6, function1);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m14478roundToPxR2X_6o(DrawScope drawScope, long j6) {
            return DrawScope.super.mo10248roundToPxR2X_6o(j6);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m14479roundToPx0680j_4(DrawScope drawScope, float f6) {
            return DrawScope.super.mo10249roundToPx0680j_4(f6);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m14480toDpGaN1DYA(DrawScope drawScope, long j6) {
            return DrawScope.super.mo10250toDpGaN1DYA(j6);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m14481toDpu2uoSUM(DrawScope drawScope, float f6) {
            return DrawScope.super.mo10251toDpu2uoSUM(f6);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m14483toDpSizekrfVVM(DrawScope drawScope, long j6) {
            return DrawScope.super.mo10253toDpSizekrfVVM(j6);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m14484toPxR2X_6o(DrawScope drawScope, long j6) {
            return DrawScope.super.mo10254toPxR2X_6o(j6);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m14485toPx0680j_4(DrawScope drawScope, float f6) {
            return DrawScope.super.mo10255toPx0680j_4(f6);
        }

        @Stable
        @Deprecated
        public static Rect toRect(DrawScope drawScope, DpRect dpRect) {
            return DrawScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m14486toSizeXkaWNTQ(DrawScope drawScope, long j6) {
            return DrawScope.super.mo10256toSizeXkaWNTQ(j6);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m14487toSp0xMU5do(DrawScope drawScope, float f6) {
            return DrawScope.super.mo10257toSp0xMU5do(f6);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m14488toSpkPz2Gy4(DrawScope drawScope, float f6) {
            return DrawScope.super.mo10258toSpkPz2Gy4(f6);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m14482toDpu2uoSUM(DrawScope drawScope, int i6) {
            return DrawScope.super.mo10252toDpu2uoSUM(i6);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m14489toSpkPz2Gy4(DrawScope drawScope, int i6) {
            return DrawScope.super.mo10259toSpkPz2Gy4(i6);
        }
    }

    /* renamed from: drawArc-illE91I$default, reason: not valid java name */
    static /* synthetic */ void m14428drawArcillE91I$default(DrawScope drawScope, Brush brush, float f6, float f7, boolean z6, long j6, long j7, float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i6, int i7, Object obj) {
        DrawScope drawScope2;
        long jM14447offsetSizePENXr5M;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-illE91I");
        }
        long jM13674getZeroF1C5BW0 = (i7 & 16) != 0 ? Offset.INSTANCE.m13674getZeroF1C5BW0() : j6;
        if ((i7 & 32) != 0) {
            drawScope2 = drawScope;
            jM14447offsetSizePENXr5M = drawScope2.m14447offsetSizePENXr5M(drawScope.mo14450getSizeNHjbRc(), jM13674getZeroF1C5BW0);
        } else {
            drawScope2 = drawScope;
            jM14447offsetSizePENXr5M = j7;
        }
        drawScope2.mo14347drawArcillE91I(brush, f6, f7, z6, jM13674getZeroF1C5BW0, jM14447offsetSizePENXr5M, (i7 & 64) != 0 ? 1.0f : f8, (i7 & 128) != 0 ? Fill.INSTANCE : drawStyle, (i7 & 256) != 0 ? null : colorFilter, (i7 & 512) != 0 ? INSTANCE.m14452getDefaultBlendMode0nO6VwU() : i6);
    }

    /* renamed from: drawArc-yD3GUKo$default, reason: not valid java name */
    static /* synthetic */ void m14429drawArcyD3GUKo$default(DrawScope drawScope, long j6, float f6, float f7, boolean z6, long j7, long j8, float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i6, int i7, Object obj) {
        DrawScope drawScope2;
        long jM14447offsetSizePENXr5M;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
        }
        long jM13674getZeroF1C5BW0 = (i7 & 16) != 0 ? Offset.INSTANCE.m13674getZeroF1C5BW0() : j7;
        if ((i7 & 32) != 0) {
            drawScope2 = drawScope;
            jM14447offsetSizePENXr5M = drawScope2.m14447offsetSizePENXr5M(drawScope.mo14450getSizeNHjbRc(), jM13674getZeroF1C5BW0);
        } else {
            drawScope2 = drawScope;
            jM14447offsetSizePENXr5M = j8;
        }
        drawScope2.mo14348drawArcyD3GUKo(j6, f6, f7, z6, jM13674getZeroF1C5BW0, jM14447offsetSizePENXr5M, (i7 & 64) != 0 ? 1.0f : f8, (i7 & 128) != 0 ? Fill.INSTANCE : drawStyle, (i7 & 256) != 0 ? null : colorFilter, (i7 & 512) != 0 ? INSTANCE.m14452getDefaultBlendMode0nO6VwU() : i6);
    }

    /* renamed from: drawCircle-V9BoPsw$default, reason: not valid java name */
    static /* synthetic */ void m14430drawCircleV9BoPsw$default(DrawScope drawScope, Brush brush, float f6, long j6, float f7, DrawStyle drawStyle, ColorFilter colorFilter, int i6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-V9BoPsw");
        }
        drawScope.mo14349drawCircleV9BoPsw(brush, (i7 & 2) != 0 ? Size.m13726getMinDimensionimpl(drawScope.mo14450getSizeNHjbRc()) / 2.0f : f6, (i7 & 4) != 0 ? drawScope.mo14449getCenterF1C5BW0() : j6, (i7 & 8) != 0 ? 1.0f : f7, (i7 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i7 & 32) != 0 ? null : colorFilter, (i7 & 64) != 0 ? INSTANCE.m14452getDefaultBlendMode0nO6VwU() : i6);
    }

    /* renamed from: drawCircle-VaOC9Bg$default, reason: not valid java name */
    static /* synthetic */ void m14431drawCircleVaOC9Bg$default(DrawScope drawScope, long j6, float f6, long j7, float f7, DrawStyle drawStyle, ColorFilter colorFilter, int i6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
        }
        if ((i7 & 2) != 0) {
            f6 = Size.m13726getMinDimensionimpl(drawScope.mo14450getSizeNHjbRc()) / 2.0f;
        }
        drawScope.mo14350drawCircleVaOC9Bg(j6, f6, (i7 & 4) != 0 ? drawScope.mo14449getCenterF1C5BW0() : j7, (i7 & 8) != 0 ? 1.0f : f7, (i7 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i7 & 32) != 0 ? null : colorFilter, (i7 & 64) != 0 ? INSTANCE.m14452getDefaultBlendMode0nO6VwU() : i6);
    }

    /* renamed from: drawImage-9jGpkUE$default, reason: not valid java name */
    static /* synthetic */ void m14432drawImage9jGpkUE$default(DrawScope drawScope, ImageBitmap imageBitmap, long j6, long j7, long j8, long j9, float f6, DrawStyle drawStyle, ColorFilter colorFilter, int i6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-9jGpkUE");
        }
        long jM16623getZeronOccac = (i7 & 2) != 0 ? IntOffset.INSTANCE.m16623getZeronOccac() : j6;
        long jM16650constructorimpl = (i7 & 4) != 0 ? IntSize.m16650constructorimpl((imageBitmap.getHeight() & 4294967295L) | (imageBitmap.getWidth() << 32)) : j7;
        drawScope.mo14351drawImage9jGpkUE(imageBitmap, jM16623getZeronOccac, jM16650constructorimpl, (i7 & 8) != 0 ? IntOffset.INSTANCE.m16623getZeronOccac() : j8, (i7 & 16) != 0 ? jM16650constructorimpl : j9, (i7 & 32) != 0 ? 1.0f : f6, (i7 & 64) != 0 ? Fill.INSTANCE : drawStyle, (i7 & 128) != 0 ? null : colorFilter, (i7 & 256) != 0 ? INSTANCE.m14452getDefaultBlendMode0nO6VwU() : i6);
    }

    /* renamed from: drawImage-AZ2fEMs$default, reason: not valid java name */
    static /* synthetic */ void m14433drawImageAZ2fEMs$default(DrawScope drawScope, ImageBitmap imageBitmap, long j6, long j7, long j8, long j9, float f6, DrawStyle drawStyle, ColorFilter colorFilter, int i6, int i7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
        }
        long jM16623getZeronOccac = (i8 & 2) != 0 ? IntOffset.INSTANCE.m16623getZeronOccac() : j6;
        long jM16650constructorimpl = (i8 & 4) != 0 ? IntSize.m16650constructorimpl((imageBitmap.getHeight() & 4294967295L) | (imageBitmap.getWidth() << 32)) : j7;
        drawScope.mo14352drawImageAZ2fEMs(imageBitmap, jM16623getZeronOccac, jM16650constructorimpl, (i8 & 8) != 0 ? IntOffset.INSTANCE.m16623getZeronOccac() : j8, (i8 & 16) != 0 ? jM16650constructorimpl : j9, (i8 & 32) != 0 ? 1.0f : f6, (i8 & 64) != 0 ? Fill.INSTANCE : drawStyle, (i8 & 128) != 0 ? null : colorFilter, (i8 & 256) != 0 ? INSTANCE.m14452getDefaultBlendMode0nO6VwU() : i6, (i8 & 512) != 0 ? INSTANCE.m14453getDefaultFilterQualityfv9h1I() : i7);
    }

    /* renamed from: drawImage-gbVJVH8$default, reason: not valid java name */
    static /* synthetic */ void m14434drawImagegbVJVH8$default(DrawScope drawScope, ImageBitmap imageBitmap, long j6, float f6, DrawStyle drawStyle, ColorFilter colorFilter, int i6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
        }
        drawScope.mo14353drawImagegbVJVH8(imageBitmap, (i7 & 2) != 0 ? Offset.INSTANCE.m13674getZeroF1C5BW0() : j6, (i7 & 4) != 0 ? 1.0f : f6, (i7 & 8) != 0 ? Fill.INSTANCE : drawStyle, (i7 & 16) != 0 ? null : colorFilter, (i7 & 32) != 0 ? INSTANCE.m14452getDefaultBlendMode0nO6VwU() : i6);
    }

    /* renamed from: drawLine-1RTmtNc$default, reason: not valid java name */
    static /* synthetic */ void m14435drawLine1RTmtNc$default(DrawScope drawScope, Brush brush, long j6, long j7, float f6, int i6, PathEffect pathEffect, float f7, ColorFilter colorFilter, int i7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
        }
        drawScope.mo14354drawLine1RTmtNc(brush, j6, j7, (i8 & 8) != 0 ? 0.0f : f6, (i8 & 16) != 0 ? Stroke.INSTANCE.m14521getDefaultCapKaPHkGw() : i6, (i8 & 32) != 0 ? null : pathEffect, (i8 & 64) != 0 ? 1.0f : f7, (i8 & 128) != 0 ? null : colorFilter, (i8 & 256) != 0 ? INSTANCE.m14452getDefaultBlendMode0nO6VwU() : i7);
    }

    /* renamed from: drawLine-NGM6Ib0$default, reason: not valid java name */
    static /* synthetic */ void m14436drawLineNGM6Ib0$default(DrawScope drawScope, long j6, long j7, long j8, float f6, int i6, PathEffect pathEffect, float f7, ColorFilter colorFilter, int i7, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
        }
        drawScope.mo14355drawLineNGM6Ib0(j6, j7, j8, (i8 & 8) != 0 ? 0.0f : f6, (i8 & 16) != 0 ? Stroke.INSTANCE.m14521getDefaultCapKaPHkGw() : i6, (i8 & 32) != 0 ? null : pathEffect, (i8 & 64) != 0 ? 1.0f : f7, (i8 & 128) != 0 ? null : colorFilter, (i8 & 256) != 0 ? INSTANCE.m14452getDefaultBlendMode0nO6VwU() : i7);
    }

    /* renamed from: drawOval-AsUm42w$default, reason: not valid java name */
    static /* synthetic */ void m14437drawOvalAsUm42w$default(DrawScope drawScope, Brush brush, long j6, long j7, float f6, DrawStyle drawStyle, ColorFilter colorFilter, int i6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-AsUm42w");
        }
        long jM13674getZeroF1C5BW0 = (i7 & 2) != 0 ? Offset.INSTANCE.m13674getZeroF1C5BW0() : j6;
        drawScope.mo14356drawOvalAsUm42w(brush, jM13674getZeroF1C5BW0, (i7 & 4) != 0 ? drawScope.m14447offsetSizePENXr5M(drawScope.mo14450getSizeNHjbRc(), jM13674getZeroF1C5BW0) : j7, (i7 & 8) != 0 ? 1.0f : f6, (i7 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i7 & 32) != 0 ? null : colorFilter, (i7 & 64) != 0 ? INSTANCE.m14452getDefaultBlendMode0nO6VwU() : i6);
    }

    /* renamed from: drawOval-n-J9OG0$default, reason: not valid java name */
    static /* synthetic */ void m14438drawOvalnJ9OG0$default(DrawScope drawScope, long j6, long j7, long j8, float f6, DrawStyle drawStyle, ColorFilter colorFilter, int i6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-n-J9OG0");
        }
        long jM13674getZeroF1C5BW0 = (i7 & 2) != 0 ? Offset.INSTANCE.m13674getZeroF1C5BW0() : j7;
        drawScope.mo14357drawOvalnJ9OG0(j6, jM13674getZeroF1C5BW0, (i7 & 4) != 0 ? drawScope.m14447offsetSizePENXr5M(drawScope.mo14450getSizeNHjbRc(), jM13674getZeroF1C5BW0) : j8, (i7 & 8) != 0 ? 1.0f : f6, (i7 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i7 & 32) != 0 ? null : colorFilter, (i7 & 64) != 0 ? INSTANCE.m14452getDefaultBlendMode0nO6VwU() : i6);
    }

    /* renamed from: drawPath-GBMwjPU$default, reason: not valid java name */
    static /* synthetic */ void m14439drawPathGBMwjPU$default(DrawScope drawScope, Path path, Brush brush, float f6, DrawStyle drawStyle, ColorFilter colorFilter, int i6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
        }
        if ((i7 & 4) != 0) {
            f6 = 1.0f;
        }
        float f7 = f6;
        if ((i7 & 8) != 0) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        if ((i7 & 16) != 0) {
            colorFilter = null;
        }
        ColorFilter colorFilter2 = colorFilter;
        if ((i7 & 32) != 0) {
            i6 = INSTANCE.m14452getDefaultBlendMode0nO6VwU();
        }
        drawScope.mo14358drawPathGBMwjPU(path, brush, f7, drawStyle2, colorFilter2, i6);
    }

    /* renamed from: drawPath-LG529CI$default, reason: not valid java name */
    static /* synthetic */ void m14440drawPathLG529CI$default(DrawScope drawScope, Path path, long j6, float f6, DrawStyle drawStyle, ColorFilter colorFilter, int i6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-LG529CI");
        }
        if ((i7 & 4) != 0) {
            f6 = 1.0f;
        }
        float f7 = f6;
        if ((i7 & 8) != 0) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        if ((i7 & 16) != 0) {
            colorFilter = null;
        }
        drawScope.mo14359drawPathLG529CI(path, j6, f7, drawStyle2, colorFilter, (i7 & 32) != 0 ? INSTANCE.m14452getDefaultBlendMode0nO6VwU() : i6);
    }

    /* renamed from: drawPoints-F8ZwMP8$default, reason: not valid java name */
    static /* synthetic */ void m14441drawPointsF8ZwMP8$default(DrawScope drawScope, List list, int i6, long j6, float f6, int i7, PathEffect pathEffect, float f7, ColorFilter colorFilter, int i8, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-F8ZwMP8");
        }
        drawScope.mo14360drawPointsF8ZwMP8(list, i6, j6, (i9 & 8) != 0 ? 0.0f : f6, (i9 & 16) != 0 ? StrokeCap.INSTANCE.m14252getButtKaPHkGw() : i7, (i9 & 32) != 0 ? null : pathEffect, (i9 & 64) != 0 ? 1.0f : f7, (i9 & 128) != 0 ? null : colorFilter, (i9 & 256) != 0 ? INSTANCE.m14452getDefaultBlendMode0nO6VwU() : i8);
    }

    /* renamed from: drawPoints-Gsft0Ws$default, reason: not valid java name */
    static /* synthetic */ void m14442drawPointsGsft0Ws$default(DrawScope drawScope, List list, int i6, Brush brush, float f6, int i7, PathEffect pathEffect, float f7, ColorFilter colorFilter, int i8, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-Gsft0Ws");
        }
        drawScope.mo14361drawPointsGsft0Ws(list, i6, brush, (i9 & 8) != 0 ? 0.0f : f6, (i9 & 16) != 0 ? StrokeCap.INSTANCE.m14252getButtKaPHkGw() : i7, (i9 & 32) != 0 ? null : pathEffect, (i9 & 64) != 0 ? 1.0f : f7, (i9 & 128) != 0 ? null : colorFilter, (i9 & 256) != 0 ? INSTANCE.m14452getDefaultBlendMode0nO6VwU() : i8);
    }

    /* renamed from: drawRect-AsUm42w$default, reason: not valid java name */
    static /* synthetic */ void m14443drawRectAsUm42w$default(DrawScope drawScope, Brush brush, long j6, long j7, float f6, DrawStyle drawStyle, ColorFilter colorFilter, int i6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
        }
        long jM13674getZeroF1C5BW0 = (i7 & 2) != 0 ? Offset.INSTANCE.m13674getZeroF1C5BW0() : j6;
        drawScope.mo14362drawRectAsUm42w(brush, jM13674getZeroF1C5BW0, (i7 & 4) != 0 ? drawScope.m14447offsetSizePENXr5M(drawScope.mo14450getSizeNHjbRc(), jM13674getZeroF1C5BW0) : j7, (i7 & 8) != 0 ? 1.0f : f6, (i7 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i7 & 32) != 0 ? null : colorFilter, (i7 & 64) != 0 ? INSTANCE.m14452getDefaultBlendMode0nO6VwU() : i6);
    }

    /* renamed from: drawRect-n-J9OG0$default, reason: not valid java name */
    static /* synthetic */ void m14444drawRectnJ9OG0$default(DrawScope drawScope, long j6, long j7, long j8, float f6, DrawStyle drawStyle, ColorFilter colorFilter, int i6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
        }
        long jM13674getZeroF1C5BW0 = (i7 & 2) != 0 ? Offset.INSTANCE.m13674getZeroF1C5BW0() : j7;
        drawScope.mo14363drawRectnJ9OG0(j6, jM13674getZeroF1C5BW0, (i7 & 4) != 0 ? drawScope.m14447offsetSizePENXr5M(drawScope.mo14450getSizeNHjbRc(), jM13674getZeroF1C5BW0) : j8, (i7 & 8) != 0 ? 1.0f : f6, (i7 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i7 & 32) != 0 ? null : colorFilter, (i7 & 64) != 0 ? INSTANCE.m14452getDefaultBlendMode0nO6VwU() : i6);
    }

    /* renamed from: drawRoundRect-ZuiqVtQ$default, reason: not valid java name */
    static /* synthetic */ void m14445drawRoundRectZuiqVtQ$default(DrawScope drawScope, Brush brush, long j6, long j7, long j8, float f6, DrawStyle drawStyle, ColorFilter colorFilter, int i6, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
        }
        long jM13674getZeroF1C5BW0 = (i7 & 2) != 0 ? Offset.INSTANCE.m13674getZeroF1C5BW0() : j6;
        drawScope.mo14364drawRoundRectZuiqVtQ(brush, jM13674getZeroF1C5BW0, (i7 & 4) != 0 ? drawScope.m14447offsetSizePENXr5M(drawScope.mo14450getSizeNHjbRc(), jM13674getZeroF1C5BW0) : j7, (i7 & 8) != 0 ? CornerRadius.INSTANCE.m13630getZerokKHJgLs() : j8, (i7 & 16) != 0 ? 1.0f : f6, (i7 & 32) != 0 ? Fill.INSTANCE : drawStyle, (i7 & 64) != 0 ? null : colorFilter, (i7 & 128) != 0 ? INSTANCE.m14452getDefaultBlendMode0nO6VwU() : i6);
    }

    /* renamed from: drawRoundRect-u-Aw5IA$default, reason: not valid java name */
    static /* synthetic */ void m14446drawRoundRectuAw5IA$default(DrawScope drawScope, long j6, long j7, long j8, long j9, DrawStyle drawStyle, float f6, ColorFilter colorFilter, int i6, int i7, Object obj) {
        DrawScope drawScope2;
        long jM14447offsetSizePENXr5M;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-u-Aw5IA");
        }
        long jM13674getZeroF1C5BW0 = (i7 & 2) != 0 ? Offset.INSTANCE.m13674getZeroF1C5BW0() : j7;
        if ((i7 & 4) != 0) {
            drawScope2 = drawScope;
            jM14447offsetSizePENXr5M = drawScope2.m14447offsetSizePENXr5M(drawScope.mo14450getSizeNHjbRc(), jM13674getZeroF1C5BW0);
        } else {
            drawScope2 = drawScope;
            jM14447offsetSizePENXr5M = j8;
        }
        drawScope2.mo14365drawRoundRectuAw5IA(j6, jM13674getZeroF1C5BW0, jM14447offsetSizePENXr5M, (i7 & 8) != 0 ? CornerRadius.INSTANCE.m13630getZerokKHJgLs() : j9, (i7 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i7 & 32) != 0 ? 1.0f : f6, (i7 & 64) != 0 ? null : colorFilter, (i7 & 128) != 0 ? INSTANCE.m14452getDefaultBlendMode0nO6VwU() : i6);
    }

    /* renamed from: offsetSize-PENXr5M, reason: not valid java name */
    private default long m14447offsetSizePENXr5M(long j6, long j7) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32)) - Float.intBitsToFloat((int) (j7 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L)) - Float.intBitsToFloat((int) (j7 & 4294967295L));
        return Size.m13718constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    /* renamed from: record-JVtK1S4$default, reason: not valid java name */
    static /* synthetic */ void m14448recordJVtK1S4$default(DrawScope drawScope, GraphicsLayer graphicsLayer, long j6, Function1 function1, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: record-JVtK1S4");
        }
        if ((i6 & 1) != 0) {
            j6 = IntSizeKt.m16666toIntSizeuvyYCjk(drawScope.mo14450getSizeNHjbRc());
        }
        drawScope.mo14451recordJVtK1S4(graphicsLayer, j6, function1);
    }

    /* renamed from: drawArc-illE91I */
    void mo14347drawArcillE91I(Brush brush, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, @FloatRange(from = 0.0d, m58to = Contrast.RATIO_MIN) float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode);

    /* renamed from: drawArc-yD3GUKo */
    void mo14348drawArcyD3GUKo(long color, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, @FloatRange(from = 0.0d, m58to = Contrast.RATIO_MIN) float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode);

    /* renamed from: drawCircle-V9BoPsw */
    void mo14349drawCircleV9BoPsw(Brush brush, float radius, long center, @FloatRange(from = 0.0d, m58to = Contrast.RATIO_MIN) float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode);

    /* renamed from: drawCircle-VaOC9Bg */
    void mo14350drawCircleVaOC9Bg(long color, float radius, long center, @FloatRange(from = 0.0d, m58to = Contrast.RATIO_MIN) float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode);

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @ReplaceWith(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    /* renamed from: drawImage-9jGpkUE */
    /* synthetic */ void mo14351drawImage9jGpkUE(ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, @FloatRange(from = 0.0d, m58to = Contrast.RATIO_MIN) float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode);

    /* renamed from: drawImage-AZ2fEMs */
    default void mo14352drawImageAZ2fEMs(ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, @FloatRange(from = 0.0d, m58to = Contrast.RATIO_MIN) float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode, int filterQuality) {
        m14433drawImageAZ2fEMs$default(this, image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, 0, 512, null);
    }

    /* renamed from: drawImage-gbVJVH8 */
    void mo14353drawImagegbVJVH8(ImageBitmap image, long topLeft, @FloatRange(from = 0.0d, m58to = Contrast.RATIO_MIN) float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode);

    /* renamed from: drawLine-1RTmtNc */
    void mo14354drawLine1RTmtNc(Brush brush, long start, long end, float strokeWidth, int cap, PathEffect pathEffect, @FloatRange(from = 0.0d, m58to = Contrast.RATIO_MIN) float alpha, ColorFilter colorFilter, int blendMode);

    /* renamed from: drawLine-NGM6Ib0 */
    void mo14355drawLineNGM6Ib0(long color, long start, long end, float strokeWidth, int cap, PathEffect pathEffect, @FloatRange(from = 0.0d, m58to = Contrast.RATIO_MIN) float alpha, ColorFilter colorFilter, int blendMode);

    /* renamed from: drawOval-AsUm42w */
    void mo14356drawOvalAsUm42w(Brush brush, long topLeft, long size, @FloatRange(from = 0.0d, m58to = Contrast.RATIO_MIN) float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode);

    /* renamed from: drawOval-n-J9OG0 */
    void mo14357drawOvalnJ9OG0(long color, long topLeft, long size, @FloatRange(from = 0.0d, m58to = Contrast.RATIO_MIN) float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode);

    /* renamed from: drawPath-GBMwjPU */
    void mo14358drawPathGBMwjPU(Path path, Brush brush, @FloatRange(from = 0.0d, m58to = Contrast.RATIO_MIN) float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode);

    /* renamed from: drawPath-LG529CI */
    void mo14359drawPathLG529CI(Path path, long color, @FloatRange(from = 0.0d, m58to = Contrast.RATIO_MIN) float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode);

    /* renamed from: drawPoints-F8ZwMP8 */
    void mo14360drawPointsF8ZwMP8(List<Offset> points, int pointMode, long color, float strokeWidth, int cap, PathEffect pathEffect, @FloatRange(from = 0.0d, m58to = Contrast.RATIO_MIN) float alpha, ColorFilter colorFilter, int blendMode);

    /* renamed from: drawPoints-Gsft0Ws */
    void mo14361drawPointsGsft0Ws(List<Offset> points, int pointMode, Brush brush, float strokeWidth, int cap, PathEffect pathEffect, @FloatRange(from = 0.0d, m58to = Contrast.RATIO_MIN) float alpha, ColorFilter colorFilter, int blendMode);

    /* renamed from: drawRect-AsUm42w */
    void mo14362drawRectAsUm42w(Brush brush, long topLeft, long size, @FloatRange(from = 0.0d, m58to = Contrast.RATIO_MIN) float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode);

    /* renamed from: drawRect-n-J9OG0 */
    void mo14363drawRectnJ9OG0(long color, long topLeft, long size, @FloatRange(from = 0.0d, m58to = Contrast.RATIO_MIN) float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode);

    /* renamed from: drawRoundRect-ZuiqVtQ */
    void mo14364drawRoundRectZuiqVtQ(Brush brush, long topLeft, long size, long cornerRadius, @FloatRange(from = 0.0d, m58to = Contrast.RATIO_MIN) float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode);

    /* renamed from: drawRoundRect-u-Aw5IA */
    void mo14365drawRoundRectuAw5IA(long color, long topLeft, long size, long cornerRadius, DrawStyle style, @FloatRange(from = 0.0d, m58to = Contrast.RATIO_MIN) float alpha, ColorFilter colorFilter, int blendMode);

    /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
    default long mo14449getCenterF1C5BW0() {
        return SizeKt.m13737getCenteruvyYCjk(getDrawContext().mo14371getSizeNHjbRc());
    }

    DrawContext getDrawContext();

    LayoutDirection getLayoutDirection();

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    default long mo14450getSizeNHjbRc() {
        return getDrawContext().mo14371getSizeNHjbRc();
    }

    /* renamed from: record-JVtK1S4, reason: not valid java name */
    default void mo14451recordJVtK1S4(GraphicsLayer graphicsLayer, long j6, final Function1<? super DrawScope, Unit> function1) {
        graphicsLayer.m14544recordmLhObY(this, getLayoutDirection(), j6, new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.graphics.drawscope.DrawScope$record$1
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
                long jMo14371getSizeNHjbRc = drawScope.getDrawContext().mo14371getSizeNHjbRc();
                GraphicsLayer graphicsLayer2 = drawScope.getDrawContext().getGraphicsLayer();
                Function1<DrawScope, Unit> function12 = function1;
                Density density2 = drawScope2.getDrawContext().getDensity();
                LayoutDirection layoutDirection2 = drawScope2.getDrawContext().getLayoutDirection();
                Canvas canvas2 = drawScope2.getDrawContext().getCanvas();
                long jMo14371getSizeNHjbRc2 = drawScope2.getDrawContext().mo14371getSizeNHjbRc();
                GraphicsLayer graphicsLayer3 = drawScope2.getDrawContext().getGraphicsLayer();
                DrawContext drawContext = drawScope2.getDrawContext();
                drawContext.setDensity(density);
                drawContext.setLayoutDirection(layoutDirection);
                drawContext.setCanvas(canvas);
                drawContext.mo14372setSizeuvyYCjk(jMo14371getSizeNHjbRc);
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
                    drawContext2.mo14372setSizeuvyYCjk(jMo14371getSizeNHjbRc2);
                    drawContext2.setGraphicsLayer(graphicsLayer3);
                }
            }
        });
    }
}
