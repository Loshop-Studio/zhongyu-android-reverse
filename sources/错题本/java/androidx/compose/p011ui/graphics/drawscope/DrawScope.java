package androidx.compose.p011ui.graphics.drawscope;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.p011ui.geometry.CornerRadius;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.geometry.SizeKt;
import androidx.compose.p011ui.graphics.BlendMode;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Canvas;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.FilterQuality;
import androidx.compose.p011ui.graphics.ImageBitmap;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.PathEffect;
import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.graphics.layer.GraphicsLayer;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.DpRect;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.unit.IntSizeKt;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@DrawScopeMarker
@Metadata(m5109d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 u2\u00020\u0001:\u0001uJ\u001e\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006Jj\u0010\u001a\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0003\u0010\u0012\u001a\u00020\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019Jj\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0003\u0010\u0012\u001a\u00020\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJX\u0010%\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0003\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\b#\u0010$JX\u0010%\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0003\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\b&\u0010'JN\u0010,\u001a\u00020\u00172\u0006\u0010)\u001a\u00020(2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0003\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\b*\u0010+Jl\u0010,\u001a\u00020\u00172\u0006\u0010)\u001a\u00020(2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00101\u001a\u00020-2\b\b\u0002\u00102\u001a\u00020/2\b\b\u0003\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H'ø\u0001\u0000¢\u0006\u0004\b3\u00104Jv\u0010,\u001a\u00020\u00172\u0006\u0010)\u001a\u00020(2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u00100\u001a\u00020/2\b\b\u0002\u00101\u001a\u00020-2\b\b\u0002\u00102\u001a\u00020/2\b\b\u0003\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u00106\u001a\u000205H\u0016ø\u0001\u0000¢\u0006\u0004\b7\u00108Jb\u0010=\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010:\u001a\u0002092\b\b\u0003\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\b;\u0010<Jb\u0010=\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010:\u001a\u0002092\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0003\u0010\u0012\u001a\u00020\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\b>\u0010?JX\u0010D\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010@\u001a\u00020\f2\b\b\u0002\u0010A\u001a\u00020\u00032\b\b\u0003\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\bB\u0010CJX\u0010D\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010@\u001a\u00020\f2\b\b\u0002\u0010A\u001a\u00020\u00032\b\b\u0003\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\bE\u0010FJX\u0010H\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0003\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\bG\u0010$JX\u0010H\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0003\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\bI\u0010'Jp\u0010P\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\b2\u0006\u0010J\u001a\u00020\f2\u0006\u0010K\u001a\u00020\f2\u0006\u0010M\u001a\u00020L2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0003\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\bN\u0010OJp\u0010P\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010J\u001a\u00020\f2\u0006\u0010K\u001a\u00020\f2\u0006\u0010M\u001a\u00020L2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0003\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\bQ\u0010RJL\u0010W\u001a\u00020\u00172\u0006\u0010T\u001a\u00020S2\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0003\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\bU\u0010VJL\u0010W\u001a\u00020\u00172\u0006\u0010T\u001a\u00020S2\u0006\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\bX\u0010YJp\u0010`\u001a\u00020\u00172\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00030Z2\u0006\u0010]\u001a\u00020\\2\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0003\u0010\u0012\u001a\u00020\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\b^\u0010_Jp\u0010`\u001a\u00020\u00172\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00030Z2\u0006\u0010]\u001a\u00020\\2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0003\u0010\u0012\u001a\u00020\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H&ø\u0001\u0000¢\u0006\u0004\ba\u0010bJ9\u0010i\u001a\u00020\u0017*\u00020c2\b\b\u0002\u0010 \u001a\u00020/2\u0017\u0010f\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00170d¢\u0006\u0002\beH\u0016ø\u0001\u0000¢\u0006\u0004\bg\u0010hR\u0014\u0010m\u001a\u00020j8&X¦\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lR\u001a\u0010A\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bn\u0010oR\u001a\u0010 \u001a\u00020\u00028VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bp\u0010oR\u0014\u0010t\u001a\u00020q8&X¦\u0004¢\u0006\u0006\u001a\u0004\br\u0010sø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006vÀ\u0006\u0003"}, m5110d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/geometry/Offset;", TypedValues.CycleType.S_WAVE_OFFSET, "offsetSize-PENXr5M", "(JJ)J", "offsetSize", "Landroidx/compose/ui/graphics/Brush;", "brush", "start", "end", "", "strokeWidth", "Landroidx/compose/ui/graphics/StrokeCap;", "cap", "Landroidx/compose/ui/graphics/PathEffect;", "pathEffect", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "Ld6/s;", "drawLine-1RTmtNc", "(Landroidx/compose/ui/graphics/Brush;JJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawLine", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "drawLine-NGM6Ib0", "(JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "topLeft", "size", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "style", "drawRect-AsUm42w", "(Landroidx/compose/ui/graphics/Brush;JJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRect", "drawRect-n-J9OG0", "(JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/ImageBitmap;", "image", "drawImage-gbVJVH8", "(Landroidx/compose/ui/graphics/ImageBitmap;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawImage", "Landroidx/compose/ui/unit/IntOffset;", "srcOffset", "Landroidx/compose/ui/unit/IntSize;", "srcSize", "dstOffset", "dstSize", "drawImage-9jGpkUE", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/FilterQuality;", "filterQuality", "drawImage-AZ2fEMs", "(Landroidx/compose/ui/graphics/ImageBitmap;JJJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;II)V", "Landroidx/compose/ui/geometry/CornerRadius;", "cornerRadius", "drawRoundRect-ZuiqVtQ", "(Landroidx/compose/ui/graphics/Brush;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawRoundRect", "drawRoundRect-u-Aw5IA", "(JJJJLandroidx/compose/ui/graphics/drawscope/DrawStyle;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "radius", "center", "drawCircle-V9BoPsw", "(Landroidx/compose/ui/graphics/Brush;FJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawCircle", "drawCircle-VaOC9Bg", "(JFJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawOval-AsUm42w", "drawOval", "drawOval-n-J9OG0", "startAngle", "sweepAngle", "", "useCenter", "drawArc-illE91I", "(Landroidx/compose/ui/graphics/Brush;FFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawArc", "drawArc-yD3GUKo", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/Path;", "path", "drawPath-LG529CI", "(Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "drawPath", "drawPath-GBMwjPU", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;I)V", "", "points", "Landroidx/compose/ui/graphics/PointMode;", "pointMode", "drawPoints-F8ZwMP8", "(Ljava/util/List;IJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "drawPoints", "drawPoints-Gsft0Ws", "(Ljava/util/List;ILandroidx/compose/ui/graphics/Brush;FILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;I)V", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "block", "record-JVtK1S4", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;JLr6/c;)V", "record", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "getDrawContext", "()Landroidx/compose/ui/graphics/drawscope/DrawContext;", "drawContext", "getCenter-F1C5BW0", "()J", "getSize-NH-jbRc", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Companion", "ui-graphics_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScope\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 7 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,1008:1\n30#2:1009\n30#2:1011\n80#3:1010\n80#3:1012\n60#3:1014\n70#3:1018\n53#3,3:1021\n57#4:1013\n61#4:1017\n22#5:1015\n65#6:1016\n69#6:1019\n33#7:1020\n*S KotlinDebug\n*F\n+ 1 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScope\n*L\n521#1:1009\n558#1:1011\n521#1:1010\n558#1:1012\n920#1:1014\n920#1:1018\n920#1:1021,3\n920#1:1013\n920#1:1017\n920#1:1015\n920#1:1016\n920#1:1019\n920#1:1020\n*E\n"})
/* loaded from: classes.dex */
public interface DrawScope extends Density {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m5109d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\n\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, m5110d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope$Companion;", "", "()V", "DefaultBlendMode", "Landroidx/compose/ui/graphics/BlendMode;", "getDefaultBlendMode-0nO6VwU", "()I", "I", "DefaultFilterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "getDefaultFilterQuality-f-v9h1I", "ui-graphics_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int DefaultBlendMode = BlendMode.INSTANCE.m10624getSrcOver0nO6VwU();
        private static final int DefaultFilterQuality = FilterQuality.INSTANCE.m10781getLowfv9h1I();

        private Companion() {
        }

        /* renamed from: getDefaultBlendMode-0nO6VwU, reason: not valid java name */
        public final int m11235getDefaultBlendMode0nO6VwU() {
            return DefaultBlendMode;
        }

        /* renamed from: getDefaultFilterQuality-f-v9h1I, reason: not valid java name */
        public final int m11236getDefaultFilterQualityfv9h1I() {
            return DefaultFilterQuality;
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: drawImage-AZ2fEMs, reason: not valid java name */
        public static void m11242drawImageAZ2fEMs(@NotNull DrawScope drawScope, @NotNull ImageBitmap imageBitmap, long j7, long j8, long j9, long j10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float f, @NotNull DrawStyle drawStyle, @Nullable ColorFilter colorFilter, int i, int i8) {
            DrawScope.super.mo11135drawImageAZ2fEMs(imageBitmap, j7, j8, j9, j10, f, drawStyle, colorFilter, i, i8);
        }

        @Deprecated
        /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m11257getCenterF1C5BW0(@NotNull DrawScope drawScope) {
            return DrawScope.super.mo11232getCenterF1C5BW0();
        }

        @Deprecated
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m11258getSizeNHjbRc(@NotNull DrawScope drawScope) {
            return DrawScope.super.mo11233getSizeNHjbRc();
        }

        @Deprecated
        /* renamed from: record-JVtK1S4, reason: not valid java name */
        public static void m11259recordJVtK1S4(@NotNull DrawScope drawScope, @NotNull GraphicsLayer graphicsLayer, long j7, @NotNull InterfaceC6471c interfaceC6471c) {
            DrawScope.super.mo11234recordJVtK1S4(graphicsLayer, j7, interfaceC6471c);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m11261roundToPxR2X_6o(@NotNull DrawScope drawScope, long j7) {
            return DrawScope.super.mo6896roundToPxR2X_6o(j7);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m11262roundToPx0680j_4(@NotNull DrawScope drawScope, float f) {
            return DrawScope.super.mo6897roundToPx0680j_4(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m11263toDpGaN1DYA(@NotNull DrawScope drawScope, long j7) {
            return DrawScope.super.mo6898toDpGaN1DYA(j7);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m11264toDpu2uoSUM(@NotNull DrawScope drawScope, float f) {
            return DrawScope.super.mo6899toDpu2uoSUM(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m11266toDpSizekrfVVM(@NotNull DrawScope drawScope, long j7) {
            return DrawScope.super.mo6901toDpSizekrfVVM(j7);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m11267toPxR2X_6o(@NotNull DrawScope drawScope, long j7) {
            return DrawScope.super.mo6902toPxR2X_6o(j7);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m11268toPx0680j_4(@NotNull DrawScope drawScope, float f) {
            return DrawScope.super.mo6903toPx0680j_4(f);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull DrawScope drawScope, @NotNull DpRect dpRect) {
            return DrawScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m11269toSizeXkaWNTQ(@NotNull DrawScope drawScope, long j7) {
            return DrawScope.super.mo6904toSizeXkaWNTQ(j7);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m11270toSp0xMU5do(@NotNull DrawScope drawScope, float f) {
            return DrawScope.super.mo6905toSp0xMU5do(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m11271toSpkPz2Gy4(@NotNull DrawScope drawScope, float f) {
            return DrawScope.super.mo6906toSpkPz2Gy4(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m11265toDpu2uoSUM(@NotNull DrawScope drawScope, int i) {
            return DrawScope.super.mo6900toDpu2uoSUM(i);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m11272toSpkPz2Gy4(@NotNull DrawScope drawScope, int i) {
            return DrawScope.super.mo6907toSpkPz2Gy4(i);
        }
    }

    /* renamed from: drawArc-illE91I$default, reason: not valid java name */
    static /* synthetic */ void m11211drawArcillE91I$default(DrawScope drawScope, Brush brush, float f, float f7, boolean z8, long j7, long j8, float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i8, Object obj) {
        DrawScope drawScope2;
        long jM11230offsetSizePENXr5M;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-illE91I");
        }
        long jM10457getZeroF1C5BW0 = (i8 & 16) != 0 ? Offset.INSTANCE.m10457getZeroF1C5BW0() : j7;
        if ((i8 & 32) != 0) {
            drawScope2 = drawScope;
            jM11230offsetSizePENXr5M = drawScope2.m11230offsetSizePENXr5M(drawScope.mo11233getSizeNHjbRc(), jM10457getZeroF1C5BW0);
        } else {
            drawScope2 = drawScope;
            jM11230offsetSizePENXr5M = j8;
        }
        drawScope2.mo11130drawArcillE91I(brush, f, f7, z8, jM10457getZeroF1C5BW0, jM11230offsetSizePENXr5M, (i8 & 64) != 0 ? 1.0f : f8, (i8 & 128) != 0 ? Fill.INSTANCE : drawStyle, (i8 & 256) != 0 ? null : colorFilter, (i8 & 512) != 0 ? INSTANCE.m11235getDefaultBlendMode0nO6VwU() : i);
    }

    /* renamed from: drawArc-yD3GUKo$default, reason: not valid java name */
    static /* synthetic */ void m11212drawArcyD3GUKo$default(DrawScope drawScope, long j7, float f, float f7, boolean z8, long j8, long j9, float f8, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i8, Object obj) {
        DrawScope drawScope2;
        long jM11230offsetSizePENXr5M;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
        }
        long jM10457getZeroF1C5BW0 = (i8 & 16) != 0 ? Offset.INSTANCE.m10457getZeroF1C5BW0() : j8;
        if ((i8 & 32) != 0) {
            drawScope2 = drawScope;
            jM11230offsetSizePENXr5M = drawScope2.m11230offsetSizePENXr5M(drawScope.mo11233getSizeNHjbRc(), jM10457getZeroF1C5BW0);
        } else {
            drawScope2 = drawScope;
            jM11230offsetSizePENXr5M = j9;
        }
        drawScope2.mo11131drawArcyD3GUKo(j7, f, f7, z8, jM10457getZeroF1C5BW0, jM11230offsetSizePENXr5M, (i8 & 64) != 0 ? 1.0f : f8, (i8 & 128) != 0 ? Fill.INSTANCE : drawStyle, (i8 & 256) != 0 ? null : colorFilter, (i8 & 512) != 0 ? INSTANCE.m11235getDefaultBlendMode0nO6VwU() : i);
    }

    /* renamed from: drawCircle-V9BoPsw$default, reason: not valid java name */
    static /* synthetic */ void m11213drawCircleV9BoPsw$default(DrawScope drawScope, Brush brush, float f, long j7, float f7, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-V9BoPsw");
        }
        drawScope.mo11132drawCircleV9BoPsw(brush, (i8 & 2) != 0 ? Size.m10509getMinDimensionimpl(drawScope.mo11233getSizeNHjbRc()) / 2.0f : f, (i8 & 4) != 0 ? drawScope.mo11232getCenterF1C5BW0() : j7, (i8 & 8) != 0 ? 1.0f : f7, (i8 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i8 & 32) != 0 ? null : colorFilter, (i8 & 64) != 0 ? INSTANCE.m11235getDefaultBlendMode0nO6VwU() : i);
    }

    /* renamed from: drawCircle-VaOC9Bg$default, reason: not valid java name */
    static /* synthetic */ void m11214drawCircleVaOC9Bg$default(DrawScope drawScope, long j7, float f, long j8, float f7, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
        }
        if ((i8 & 2) != 0) {
            f = Size.m10509getMinDimensionimpl(drawScope.mo11233getSizeNHjbRc()) / 2.0f;
        }
        drawScope.mo11133drawCircleVaOC9Bg(j7, f, (i8 & 4) != 0 ? drawScope.mo11232getCenterF1C5BW0() : j8, (i8 & 8) != 0 ? 1.0f : f7, (i8 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i8 & 32) != 0 ? null : colorFilter, (i8 & 64) != 0 ? INSTANCE.m11235getDefaultBlendMode0nO6VwU() : i);
    }

    /* renamed from: drawImage-9jGpkUE$default, reason: not valid java name */
    static /* synthetic */ void m11215drawImage9jGpkUE$default(DrawScope drawScope, ImageBitmap imageBitmap, long j7, long j8, long j9, long j10, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-9jGpkUE");
        }
        long jM13444getZeronOccac = (i8 & 2) != 0 ? IntOffset.INSTANCE.m13444getZeronOccac() : j7;
        long jM13471constructorimpl = (i8 & 4) != 0 ? IntSize.m13471constructorimpl((imageBitmap.getHeight() & 4294967295L) | (imageBitmap.getWidth() << 32)) : j8;
        drawScope.mo11134drawImage9jGpkUE(imageBitmap, jM13444getZeronOccac, jM13471constructorimpl, (i8 & 8) != 0 ? IntOffset.INSTANCE.m13444getZeronOccac() : j9, (i8 & 16) != 0 ? jM13471constructorimpl : j10, (i8 & 32) != 0 ? 1.0f : f, (i8 & 64) != 0 ? Fill.INSTANCE : drawStyle, (i8 & 128) != 0 ? null : colorFilter, (i8 & 256) != 0 ? INSTANCE.m11235getDefaultBlendMode0nO6VwU() : i);
    }

    /* renamed from: drawImage-AZ2fEMs$default, reason: not valid java name */
    static /* synthetic */ void m11216drawImageAZ2fEMs$default(DrawScope drawScope, ImageBitmap imageBitmap, long j7, long j8, long j9, long j10, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i8, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
        }
        long jM13444getZeronOccac = (i9 & 2) != 0 ? IntOffset.INSTANCE.m13444getZeronOccac() : j7;
        long jM13471constructorimpl = (i9 & 4) != 0 ? IntSize.m13471constructorimpl((imageBitmap.getHeight() & 4294967295L) | (imageBitmap.getWidth() << 32)) : j8;
        drawScope.mo11135drawImageAZ2fEMs(imageBitmap, jM13444getZeronOccac, jM13471constructorimpl, (i9 & 8) != 0 ? IntOffset.INSTANCE.m13444getZeronOccac() : j9, (i9 & 16) != 0 ? jM13471constructorimpl : j10, (i9 & 32) != 0 ? 1.0f : f, (i9 & 64) != 0 ? Fill.INSTANCE : drawStyle, (i9 & 128) != 0 ? null : colorFilter, (i9 & 256) != 0 ? INSTANCE.m11235getDefaultBlendMode0nO6VwU() : i, (i9 & 512) != 0 ? INSTANCE.m11236getDefaultFilterQualityfv9h1I() : i8);
    }

    /* renamed from: drawImage-gbVJVH8$default, reason: not valid java name */
    static /* synthetic */ void m11217drawImagegbVJVH8$default(DrawScope drawScope, ImageBitmap imageBitmap, long j7, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
        }
        drawScope.mo11136drawImagegbVJVH8(imageBitmap, (i8 & 2) != 0 ? Offset.INSTANCE.m10457getZeroF1C5BW0() : j7, (i8 & 4) != 0 ? 1.0f : f, (i8 & 8) != 0 ? Fill.INSTANCE : drawStyle, (i8 & 16) != 0 ? null : colorFilter, (i8 & 32) != 0 ? INSTANCE.m11235getDefaultBlendMode0nO6VwU() : i);
    }

    /* renamed from: drawLine-1RTmtNc$default, reason: not valid java name */
    static /* synthetic */ void m11218drawLine1RTmtNc$default(DrawScope drawScope, Brush brush, long j7, long j8, float f, int i, PathEffect pathEffect, float f7, ColorFilter colorFilter, int i8, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
        }
        drawScope.mo11137drawLine1RTmtNc(brush, j7, j8, (i9 & 8) != 0 ? 0.0f : f, (i9 & 16) != 0 ? Stroke.INSTANCE.m11304getDefaultCapKaPHkGw() : i, (i9 & 32) != 0 ? null : pathEffect, (i9 & 64) != 0 ? 1.0f : f7, (i9 & 128) != 0 ? null : colorFilter, (i9 & 256) != 0 ? INSTANCE.m11235getDefaultBlendMode0nO6VwU() : i8);
    }

    /* renamed from: drawLine-NGM6Ib0$default, reason: not valid java name */
    static /* synthetic */ void m11219drawLineNGM6Ib0$default(DrawScope drawScope, long j7, long j8, long j9, float f, int i, PathEffect pathEffect, float f7, ColorFilter colorFilter, int i8, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
        }
        drawScope.mo11138drawLineNGM6Ib0(j7, j8, j9, (i9 & 8) != 0 ? 0.0f : f, (i9 & 16) != 0 ? Stroke.INSTANCE.m11304getDefaultCapKaPHkGw() : i, (i9 & 32) != 0 ? null : pathEffect, (i9 & 64) != 0 ? 1.0f : f7, (i9 & 128) != 0 ? null : colorFilter, (i9 & 256) != 0 ? INSTANCE.m11235getDefaultBlendMode0nO6VwU() : i8);
    }

    /* renamed from: drawOval-AsUm42w$default, reason: not valid java name */
    static /* synthetic */ void m11220drawOvalAsUm42w$default(DrawScope drawScope, Brush brush, long j7, long j8, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-AsUm42w");
        }
        long jM10457getZeroF1C5BW0 = (i8 & 2) != 0 ? Offset.INSTANCE.m10457getZeroF1C5BW0() : j7;
        drawScope.mo11139drawOvalAsUm42w(brush, jM10457getZeroF1C5BW0, (i8 & 4) != 0 ? drawScope.m11230offsetSizePENXr5M(drawScope.mo11233getSizeNHjbRc(), jM10457getZeroF1C5BW0) : j8, (i8 & 8) != 0 ? 1.0f : f, (i8 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i8 & 32) != 0 ? null : colorFilter, (i8 & 64) != 0 ? INSTANCE.m11235getDefaultBlendMode0nO6VwU() : i);
    }

    /* renamed from: drawOval-n-J9OG0$default, reason: not valid java name */
    static /* synthetic */ void m11221drawOvalnJ9OG0$default(DrawScope drawScope, long j7, long j8, long j9, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-n-J9OG0");
        }
        long jM10457getZeroF1C5BW0 = (i8 & 2) != 0 ? Offset.INSTANCE.m10457getZeroF1C5BW0() : j8;
        drawScope.mo11140drawOvalnJ9OG0(j7, jM10457getZeroF1C5BW0, (i8 & 4) != 0 ? drawScope.m11230offsetSizePENXr5M(drawScope.mo11233getSizeNHjbRc(), jM10457getZeroF1C5BW0) : j9, (i8 & 8) != 0 ? 1.0f : f, (i8 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i8 & 32) != 0 ? null : colorFilter, (i8 & 64) != 0 ? INSTANCE.m11235getDefaultBlendMode0nO6VwU() : i);
    }

    /* renamed from: drawPath-GBMwjPU$default, reason: not valid java name */
    static /* synthetic */ void m11222drawPathGBMwjPU$default(DrawScope drawScope, Path path, Brush brush, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
        }
        if ((i8 & 4) != 0) {
            f = 1.0f;
        }
        float f7 = f;
        if ((i8 & 8) != 0) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        if ((i8 & 16) != 0) {
            colorFilter = null;
        }
        ColorFilter colorFilter2 = colorFilter;
        if ((i8 & 32) != 0) {
            i = INSTANCE.m11235getDefaultBlendMode0nO6VwU();
        }
        drawScope.mo11141drawPathGBMwjPU(path, brush, f7, drawStyle2, colorFilter2, i);
    }

    /* renamed from: drawPath-LG529CI$default, reason: not valid java name */
    static /* synthetic */ void m11223drawPathLG529CI$default(DrawScope drawScope, Path path, long j7, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-LG529CI");
        }
        if ((i8 & 4) != 0) {
            f = 1.0f;
        }
        float f7 = f;
        if ((i8 & 8) != 0) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        if ((i8 & 16) != 0) {
            colorFilter = null;
        }
        drawScope.mo11142drawPathLG529CI(path, j7, f7, drawStyle2, colorFilter, (i8 & 32) != 0 ? INSTANCE.m11235getDefaultBlendMode0nO6VwU() : i);
    }

    /* renamed from: drawPoints-F8ZwMP8$default, reason: not valid java name */
    static /* synthetic */ void m11224drawPointsF8ZwMP8$default(DrawScope drawScope, List list, int i, long j7, float f, int i8, PathEffect pathEffect, float f7, ColorFilter colorFilter, int i9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-F8ZwMP8");
        }
        drawScope.mo11143drawPointsF8ZwMP8(list, i, j7, (i10 & 8) != 0 ? 0.0f : f, (i10 & 16) != 0 ? StrokeCap.INSTANCE.m11035getButtKaPHkGw() : i8, (i10 & 32) != 0 ? null : pathEffect, (i10 & 64) != 0 ? 1.0f : f7, (i10 & 128) != 0 ? null : colorFilter, (i10 & 256) != 0 ? INSTANCE.m11235getDefaultBlendMode0nO6VwU() : i9);
    }

    /* renamed from: drawPoints-Gsft0Ws$default, reason: not valid java name */
    static /* synthetic */ void m11225drawPointsGsft0Ws$default(DrawScope drawScope, List list, int i, Brush brush, float f, int i8, PathEffect pathEffect, float f7, ColorFilter colorFilter, int i9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-Gsft0Ws");
        }
        drawScope.mo11144drawPointsGsft0Ws(list, i, brush, (i10 & 8) != 0 ? 0.0f : f, (i10 & 16) != 0 ? StrokeCap.INSTANCE.m11035getButtKaPHkGw() : i8, (i10 & 32) != 0 ? null : pathEffect, (i10 & 64) != 0 ? 1.0f : f7, (i10 & 128) != 0 ? null : colorFilter, (i10 & 256) != 0 ? INSTANCE.m11235getDefaultBlendMode0nO6VwU() : i9);
    }

    /* renamed from: drawRect-AsUm42w$default, reason: not valid java name */
    static /* synthetic */ void m11226drawRectAsUm42w$default(DrawScope drawScope, Brush brush, long j7, long j8, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
        }
        long jM10457getZeroF1C5BW0 = (i8 & 2) != 0 ? Offset.INSTANCE.m10457getZeroF1C5BW0() : j7;
        drawScope.mo11145drawRectAsUm42w(brush, jM10457getZeroF1C5BW0, (i8 & 4) != 0 ? drawScope.m11230offsetSizePENXr5M(drawScope.mo11233getSizeNHjbRc(), jM10457getZeroF1C5BW0) : j8, (i8 & 8) != 0 ? 1.0f : f, (i8 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i8 & 32) != 0 ? null : colorFilter, (i8 & 64) != 0 ? INSTANCE.m11235getDefaultBlendMode0nO6VwU() : i);
    }

    /* renamed from: drawRect-n-J9OG0$default, reason: not valid java name */
    static /* synthetic */ void m11227drawRectnJ9OG0$default(DrawScope drawScope, long j7, long j8, long j9, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
        }
        long jM10457getZeroF1C5BW0 = (i8 & 2) != 0 ? Offset.INSTANCE.m10457getZeroF1C5BW0() : j8;
        drawScope.mo11146drawRectnJ9OG0(j7, jM10457getZeroF1C5BW0, (i8 & 4) != 0 ? drawScope.m11230offsetSizePENXr5M(drawScope.mo11233getSizeNHjbRc(), jM10457getZeroF1C5BW0) : j9, (i8 & 8) != 0 ? 1.0f : f, (i8 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i8 & 32) != 0 ? null : colorFilter, (i8 & 64) != 0 ? INSTANCE.m11235getDefaultBlendMode0nO6VwU() : i);
    }

    /* renamed from: drawRoundRect-ZuiqVtQ$default, reason: not valid java name */
    static /* synthetic */ void m11228drawRoundRectZuiqVtQ$default(DrawScope drawScope, Brush brush, long j7, long j8, long j9, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
        }
        long jM10457getZeroF1C5BW0 = (i8 & 2) != 0 ? Offset.INSTANCE.m10457getZeroF1C5BW0() : j7;
        drawScope.mo11147drawRoundRectZuiqVtQ(brush, jM10457getZeroF1C5BW0, (i8 & 4) != 0 ? drawScope.m11230offsetSizePENXr5M(drawScope.mo11233getSizeNHjbRc(), jM10457getZeroF1C5BW0) : j8, (i8 & 8) != 0 ? CornerRadius.INSTANCE.m10413getZerokKHJgLs() : j9, (i8 & 16) != 0 ? 1.0f : f, (i8 & 32) != 0 ? Fill.INSTANCE : drawStyle, (i8 & 64) != 0 ? null : colorFilter, (i8 & 128) != 0 ? INSTANCE.m11235getDefaultBlendMode0nO6VwU() : i);
    }

    /* renamed from: drawRoundRect-u-Aw5IA$default, reason: not valid java name */
    static /* synthetic */ void m11229drawRoundRectuAw5IA$default(DrawScope drawScope, long j7, long j8, long j9, long j10, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i, int i8, Object obj) {
        DrawScope drawScope2;
        long jM11230offsetSizePENXr5M;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-u-Aw5IA");
        }
        long jM10457getZeroF1C5BW0 = (i8 & 2) != 0 ? Offset.INSTANCE.m10457getZeroF1C5BW0() : j8;
        if ((i8 & 4) != 0) {
            drawScope2 = drawScope;
            jM11230offsetSizePENXr5M = drawScope2.m11230offsetSizePENXr5M(drawScope.mo11233getSizeNHjbRc(), jM10457getZeroF1C5BW0);
        } else {
            drawScope2 = drawScope;
            jM11230offsetSizePENXr5M = j9;
        }
        drawScope2.mo11148drawRoundRectuAw5IA(j7, jM10457getZeroF1C5BW0, jM11230offsetSizePENXr5M, (i8 & 8) != 0 ? CornerRadius.INSTANCE.m10413getZerokKHJgLs() : j10, (i8 & 16) != 0 ? Fill.INSTANCE : drawStyle, (i8 & 32) != 0 ? 1.0f : f, (i8 & 64) != 0 ? null : colorFilter, (i8 & 128) != 0 ? INSTANCE.m11235getDefaultBlendMode0nO6VwU() : i);
    }

    /* renamed from: offsetSize-PENXr5M, reason: not valid java name */
    private default long m11230offsetSizePENXr5M(long j7, long j8) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32)) - Float.intBitsToFloat((int) (j8 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L)) - Float.intBitsToFloat((int) (j8 & 4294967295L));
        return Size.m10501constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    /* renamed from: record-JVtK1S4$default, reason: not valid java name */
    static /* synthetic */ void m11231recordJVtK1S4$default(DrawScope drawScope, GraphicsLayer graphicsLayer, long j7, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: record-JVtK1S4");
        }
        if ((i & 1) != 0) {
            j7 = IntSizeKt.m13487toIntSizeuvyYCjk(drawScope.mo11233getSizeNHjbRc());
        }
        drawScope.mo11234recordJVtK1S4(graphicsLayer, j7, interfaceC6471c);
    }

    /* renamed from: drawArc-illE91I */
    void mo11130drawArcillE91I(@NotNull Brush brush, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode);

    /* renamed from: drawArc-yD3GUKo */
    void mo11131drawArcyD3GUKo(long color, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode);

    /* renamed from: drawCircle-V9BoPsw */
    void mo11132drawCircleV9BoPsw(@NotNull Brush brush, float radius, long center, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode);

    /* renamed from: drawCircle-VaOC9Bg */
    void mo11133drawCircleVaOC9Bg(long color, float radius, long center, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode);

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Prefer usage of drawImage that consumes an optional FilterQuality parameter", replaceWith = @ReplaceWith(expression = "drawImage(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, FilterQuality.Low)", imports = {"androidx.compose.ui.graphics.drawscope", "androidx.compose.ui.graphics.FilterQuality"}))
    /* renamed from: drawImage-9jGpkUE */
    /* synthetic */ void mo11134drawImage9jGpkUE(ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float alpha, DrawStyle style, ColorFilter colorFilter, int blendMode);

    /* renamed from: drawImage-AZ2fEMs */
    default void mo11135drawImageAZ2fEMs(@NotNull ImageBitmap image, long srcOffset, long srcSize, long dstOffset, long dstSize, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode, int filterQuality) {
        m11216drawImageAZ2fEMs$default(this, image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, 0, 512, null);
    }

    /* renamed from: drawImage-gbVJVH8 */
    void mo11136drawImagegbVJVH8(@NotNull ImageBitmap image, long topLeft, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode);

    /* renamed from: drawLine-1RTmtNc */
    void mo11137drawLine1RTmtNc(@NotNull Brush brush, long start, long end, float strokeWidth, int cap, @Nullable PathEffect pathEffect, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float alpha, @Nullable ColorFilter colorFilter, int blendMode);

    /* renamed from: drawLine-NGM6Ib0 */
    void mo11138drawLineNGM6Ib0(long color, long start, long end, float strokeWidth, int cap, @Nullable PathEffect pathEffect, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float alpha, @Nullable ColorFilter colorFilter, int blendMode);

    /* renamed from: drawOval-AsUm42w */
    void mo11139drawOvalAsUm42w(@NotNull Brush brush, long topLeft, long size, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode);

    /* renamed from: drawOval-n-J9OG0 */
    void mo11140drawOvalnJ9OG0(long color, long topLeft, long size, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode);

    /* renamed from: drawPath-GBMwjPU */
    void mo11141drawPathGBMwjPU(@NotNull Path path, @NotNull Brush brush, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode);

    /* renamed from: drawPath-LG529CI */
    void mo11142drawPathLG529CI(@NotNull Path path, long color, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode);

    /* renamed from: drawPoints-F8ZwMP8 */
    void mo11143drawPointsF8ZwMP8(@NotNull List<Offset> points, int pointMode, long color, float strokeWidth, int cap, @Nullable PathEffect pathEffect, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float alpha, @Nullable ColorFilter colorFilter, int blendMode);

    /* renamed from: drawPoints-Gsft0Ws */
    void mo11144drawPointsGsft0Ws(@NotNull List<Offset> points, int pointMode, @NotNull Brush brush, float strokeWidth, int cap, @Nullable PathEffect pathEffect, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float alpha, @Nullable ColorFilter colorFilter, int blendMode);

    /* renamed from: drawRect-AsUm42w */
    void mo11145drawRectAsUm42w(@NotNull Brush brush, long topLeft, long size, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode);

    /* renamed from: drawRect-n-J9OG0 */
    void mo11146drawRectnJ9OG0(long color, long topLeft, long size, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode);

    /* renamed from: drawRoundRect-ZuiqVtQ */
    void mo11147drawRoundRectZuiqVtQ(@NotNull Brush brush, long topLeft, long size, long cornerRadius, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float alpha, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int blendMode);

    /* renamed from: drawRoundRect-u-Aw5IA */
    void mo11148drawRoundRectuAw5IA(long color, long topLeft, long size, long cornerRadius, @NotNull DrawStyle style, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float alpha, @Nullable ColorFilter colorFilter, int blendMode);

    /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
    default long mo11232getCenterF1C5BW0() {
        return SizeKt.m10520getCenteruvyYCjk(getDrawContext().mo11154getSizeNHjbRc());
    }

    @NotNull
    DrawContext getDrawContext();

    @NotNull
    LayoutDirection getLayoutDirection();

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    default long mo11233getSizeNHjbRc() {
        return getDrawContext().mo11154getSizeNHjbRc();
    }

    /* renamed from: record-JVtK1S4, reason: not valid java name */
    default void mo11234recordJVtK1S4(@NotNull GraphicsLayer graphicsLayer, long j7, @NotNull final InterfaceC6471c interfaceC6471c) {
        graphicsLayer.m11327recordmLhObY(this, getLayoutDirection(), j7, new InterfaceC6471c() { // from class: androidx.compose.ui.graphics.drawscope.DrawScope$record$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DrawScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(DrawScope drawScope) {
                DrawScope drawScope2 = this.this$0;
                Density density = drawScope.getDrawContext().getDensity();
                LayoutDirection layoutDirection = drawScope.getDrawContext().getLayoutDirection();
                Canvas canvas = drawScope.getDrawContext().getCanvas();
                long jMo11154getSizeNHjbRc = drawScope.getDrawContext().mo11154getSizeNHjbRc();
                GraphicsLayer graphicsLayer2 = drawScope.getDrawContext().getGraphicsLayer();
                InterfaceC6471c interfaceC6471c2 = interfaceC6471c;
                Density density2 = drawScope2.getDrawContext().getDensity();
                LayoutDirection layoutDirection2 = drawScope2.getDrawContext().getLayoutDirection();
                Canvas canvas2 = drawScope2.getDrawContext().getCanvas();
                long jMo11154getSizeNHjbRc2 = drawScope2.getDrawContext().mo11154getSizeNHjbRc();
                GraphicsLayer graphicsLayer3 = drawScope2.getDrawContext().getGraphicsLayer();
                DrawContext drawContext = drawScope2.getDrawContext();
                drawContext.setDensity(density);
                drawContext.setLayoutDirection(layoutDirection);
                drawContext.setCanvas(canvas);
                drawContext.mo11155setSizeuvyYCjk(jMo11154getSizeNHjbRc);
                drawContext.setGraphicsLayer(graphicsLayer2);
                canvas.save();
                try {
                    interfaceC6471c2.invoke(drawScope2);
                } finally {
                    canvas.restore();
                    DrawContext drawContext2 = drawScope2.getDrawContext();
                    drawContext2.setDensity(density2);
                    drawContext2.setLayoutDirection(layoutDirection2);
                    drawContext2.setCanvas(canvas2);
                    drawContext2.mo11155setSizeuvyYCjk(jMo11154getSizeNHjbRc2);
                    drawContext2.setGraphicsLayer(graphicsLayer3);
                }
            }
        });
    }
}
