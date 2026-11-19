package androidx.compose.p013ui.text;

import androidx.annotation.IntRange;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.graphics.AndroidPath_androidKt;
import androidx.compose.p013ui.graphics.Brush;
import androidx.compose.p013ui.graphics.Canvas;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.Path;
import androidx.compose.p013ui.graphics.Shadow;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.graphics.drawscope.DrawStyle;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.p013ui.text.font.Font;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.internal.InlineClassHelperKt;
import androidx.compose.p013ui.text.platform.AndroidMultiParagraphDraw_androidKt;
import androidx.compose.p013ui.text.style.ResolvedTextDirection;
import androidx.compose.p013ui.text.style.TextDecoration;
import androidx.compose.p013ui.text.style.TextOverflow;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.ConstraintsKt;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B+\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB+\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rBY\b\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u0010\u001aBY\b\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u001dBY\b\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u001eBY\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001f\u001a\u00020 ¢\u0006\u0002\u0010!B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001f\u001a\u00020 ¢\u0006\u0002\u0010\"J*\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020B2\b\b\u0001\u0010F\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\bG\u0010HJ\u000e\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\u0007J\u000e\u0010L\u001a\u00020>2\u0006\u0010K\u001a\u00020\u0007J\u000e\u0010M\u001a\u00020>2\u0006\u0010K\u001a\u00020\u0007J\u0016\u0010N\u001a\u00020\f2\u0006\u0010K\u001a\u00020\u00072\u0006\u0010O\u001a\u00020\tJ\u000e\u0010P\u001a\u00020\f2\u0006\u0010Q\u001a\u00020\u0007J\u000e\u0010R\u001a\u00020\f2\u0006\u0010Q\u001a\u00020\u0007J\u0018\u0010S\u001a\u00020\u00072\u0006\u0010Q\u001a\u00020\u00072\b\b\u0002\u0010T\u001a\u00020\tJ\u000e\u0010U\u001a\u00020\u00072\u0006\u0010K\u001a\u00020\u0007J\u000e\u0010V\u001a\u00020\u00072\u0006\u0010W\u001a\u00020\fJ\u000e\u0010X\u001a\u00020\f2\u0006\u0010Q\u001a\u00020\u0007J\u000e\u0010Y\u001a\u00020\f2\u0006\u0010Q\u001a\u00020\u0007J\u000e\u0010Z\u001a\u00020\f2\u0006\u0010Q\u001a\u00020\u0007J\u000e\u0010[\u001a\u00020\u00072\u0006\u0010Q\u001a\u00020\u0007J\u000e\u0010\\\u001a\u00020\f2\u0006\u0010Q\u001a\u00020\u0007J\u000e\u0010]\u001a\u00020\f2\u0006\u0010Q\u001a\u00020\u0007J\u0018\u0010^\u001a\u00020\u00072\u0006\u0010_\u001a\u00020`ø\u0001\u0000¢\u0006\u0004\ba\u0010bJ\u000e\u0010c\u001a\u00020J2\u0006\u0010K\u001a\u00020\u0007J\u0016\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020\u00072\u0006\u0010g\u001a\u00020\u0007J(\u0010h\u001a\u00020D2\u0006\u0010i\u001a\u00020>2\u0006\u0010j\u001a\u00020k2\u0006\u0010l\u001a\u00020mø\u0001\u0000¢\u0006\u0004\bn\u0010oJ\u001b\u0010p\u001a\u00020D2\u0006\u0010K\u001a\u00020\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bq\u0010rJ\u000e\u0010s\u001a\u00020\t2\u0006\u0010Q\u001a\u00020\u0007J]\u0010t\u001a\u00020u2\u0006\u0010v\u001a\u00020w2\u0006\u0010x\u001a\u00020y2\b\b\u0002\u0010z\u001a\u00020\f2\n\b\u0002\u0010{\u001a\u0004\u0018\u00010|2\n\b\u0002\u0010}\u001a\u0004\u0018\u00010~2\u000b\b\u0002\u0010\u007f\u001a\u0005\u0018\u00010\u0080\u00012\n\b\u0002\u0010\u0081\u0001\u001a\u00030\u0082\u0001ø\u0001\u0000¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J@\u0010t\u001a\u00020u2\u0006\u0010v\u001a\u00020w2\n\b\u0002\u0010\u0085\u0001\u001a\u00030\u0086\u00012\n\b\u0002\u0010{\u001a\u0004\u0018\u00010|2\n\b\u0002\u0010}\u001a\u0004\u0018\u00010~H\u0007ø\u0001\u0000¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001JW\u0010t\u001a\u00020u2\u0006\u0010v\u001a\u00020w2\n\b\u0002\u0010\u0085\u0001\u001a\u00030\u0086\u00012\n\b\u0002\u0010{\u001a\u0004\u0018\u00010|2\n\b\u0002\u0010}\u001a\u0004\u0018\u00010~2\u000b\b\u0002\u0010\u007f\u001a\u0005\u0018\u00010\u0080\u00012\n\b\u0002\u0010\u0081\u0001\u001a\u00030\u0082\u0001ø\u0001\u0000¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u0011\u0010\u008b\u0001\u001a\u00020u2\u0006\u0010K\u001a\u00020\u0007H\u0002J\u0011\u0010\u008c\u0001\u001a\u00020u2\u0006\u0010K\u001a\u00020\u0007H\u0002J\u0011\u0010\u008d\u0001\u001a\u00020u2\u0006\u0010Q\u001a\u00020\u0007H\u0002R\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010(\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010+\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010*R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010/\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b0\u0010*R\u0011\u00101\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u00104\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b5\u0010*R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b6\u00103R\u0011\u00107\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b8\u0010*R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u0013X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0019\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010>0\u0013¢\u0006\b\n\u0000\u001a\u0004\b?\u0010<R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b@\u0010*\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u008e\u0001"}, m13558d2 = {"Landroidx/compose/ui/text/MultiParagraph;", "", "intrinsics", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "maxLines", "", "ellipsis", "", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;JIZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "width", "", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;IZF)V", "annotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "density", "Landroidx/compose/ui/unit/Density;", "resourceLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IZFLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/Font$ResourceLoader;)V", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;FLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;IZ)V", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;JLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;IZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;JLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;IILkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;JIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "didExceedMaxLines", "getDidExceedMaxLines", "()Z", "firstBaseline", "getFirstBaseline", "()F", "height", "getHeight", "getIntrinsics", "()Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "lastBaseline", "getLastBaseline", "lineCount", "getLineCount", "()I", "maxIntrinsicWidth", "getMaxIntrinsicWidth", "getMaxLines", "minIntrinsicWidth", "getMinIntrinsicWidth", "paragraphInfoList", "Landroidx/compose/ui/text/ParagraphInfo;", "getParagraphInfoList$ui_text_release", "()Ljava/util/List;", "placeholderRects", "Landroidx/compose/ui/geometry/Rect;", "getPlaceholderRects", "getWidth", "fillBoundingBoxes", "", "range", "Landroidx/compose/ui/text/TextRange;", "array", "arrayStart", "fillBoundingBoxes-8ffj60Q", "(J[FI)[F", "getBidiRunDirection", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", TypedValues.CycleType.S_WAVE_OFFSET, "getBoundingBox", "getCursorRect", "getHorizontalPosition", "usePrimaryDirection", "getLineBaseline", "lineIndex", "getLineBottom", "getLineEnd", "visibleEnd", "getLineForOffset", "getLineForVerticalPosition", "vertical", "getLineHeight", "getLineLeft", "getLineRight", "getLineStart", "getLineTop", "getLineWidth", "getOffsetForPosition", RequestParameters.POSITION, "Landroidx/compose/ui/geometry/Offset;", "getOffsetForPosition-k-4lQ0M", "(J)I", "getParagraphDirection", "getPathForRange", "Landroidx/compose/ui/graphics/Path;", "start", "end", "getRangeForRect", "rect", "granularity", "Landroidx/compose/ui/text/TextGranularity;", "inclusionStrategy", "Landroidx/compose/ui/text/TextInclusionStrategy;", "getRangeForRect-8-6BmAI", "(Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "getWordBoundary", "getWordBoundary--jx7JFs", "(I)J", "isLineEllipsized", "paint", "", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "decoration", "Landroidx/compose/ui/text/style/TextDecoration;", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "paint-hn5TExg", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Color;", "paint-RPmYEkk", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;)V", "paint-LG529CI", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "requireIndexInRange", "requireIndexInRangeInclusiveEnd", "requireLineIndexInRange", "ui-text_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nMultiParagraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraph\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1227:1\n114#2,8:1228\n114#2,8:1271\n114#2,8:1282\n114#2,8:1290\n114#2,8:1298\n529#3,3:1236\n34#3,4:1239\n532#3:1243\n150#3,3:1245\n34#3,6:1248\n153#3:1254\n533#3,2:1255\n39#3:1257\n535#3:1258\n34#3,6:1259\n34#3,6:1265\n1#4:1244\n69#5:1279\n70#6:1280\n22#7:1281\n*S KotlinDebug\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraph\n*L\n389#1:1228,8\n522#1:1271,8\n988#1:1282,8\n994#1:1290,8\n1000#1:1298,8\n455#1:1236,3\n455#1:1239,4\n455#1:1243\n456#1:1245,3\n456#1:1248,6\n456#1:1254\n455#1:1255,2\n455#1:1257\n455#1:1258\n483#1:1259,6\n500#1:1265,6\n564#1:1279\n564#1:1280\n564#1:1281\n*E\n"})
/* loaded from: classes2.dex */
public final class MultiParagraph {
    public static final int $stable = 8;
    private final boolean didExceedMaxLines;
    private final float height;
    private final MultiParagraphIntrinsics intrinsics;
    private final int lineCount;
    private final int maxLines;
    private final List<ParagraphInfo> paragraphInfoList;
    private final List<Rect> placeholderRects;
    private final float width;

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j10, Density density, FontFamily.Resolver resolver, List list, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, j10, density, resolver, (List<AnnotatedString.Range<Placeholder>>) list, i10, i11);
    }

    private final AnnotatedString getAnnotatedString() {
        return this.intrinsics.getAnnotatedString();
    }

    public static /* synthetic */ int getLineEnd$default(MultiParagraph multiParagraph, int i10, boolean z9, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z9 = false;
        }
        return multiParagraph.getLineEnd(i10, z9);
    }

    /* renamed from: paint-RPmYEkk$default, reason: not valid java name */
    public static /* synthetic */ void m22875paintRPmYEkk$default(MultiParagraph multiParagraph, Canvas canvas, long j10, Shadow shadow, TextDecoration textDecoration, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = Color.INSTANCE.m21012getUnspecified0d7_KjU();
        }
        multiParagraph.m22882paintRPmYEkk(canvas, j10, (i10 & 4) != 0 ? null : shadow, (i10 & 8) != 0 ? null : textDecoration);
    }

    /* renamed from: paint-hn5TExg$default, reason: not valid java name */
    public static /* synthetic */ void m22876painthn5TExg$default(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f10, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f10 = Float.NaN;
        }
        multiParagraph.m22883painthn5TExg(canvas, brush, f10, (i11 & 8) != 0 ? null : shadow, (i11 & 16) != 0 ? null : textDecoration, (i11 & 32) != 0 ? null : drawStyle, (i11 & 64) != 0 ? DrawScope.INSTANCE.m21529getDefaultBlendMode0nO6VwU() : i10);
    }

    private final void requireIndexInRange(int offset) {
        boolean z9 = false;
        if (offset >= 0 && offset < getAnnotatedString().getText().length()) {
            z9 = true;
        }
        if (z9) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("offset(" + offset + ") is out of bounds [0, " + getAnnotatedString().length() + ')');
    }

    private final void requireIndexInRangeInclusiveEnd(int offset) {
        boolean z9 = false;
        if (offset >= 0 && offset <= getAnnotatedString().getText().length()) {
            z9 = true;
        }
        if (z9) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("offset(" + offset + ") is out of bounds [0, " + getAnnotatedString().length() + ']');
    }

    private final void requireLineIndexInRange(int lineIndex) {
        boolean z9 = false;
        if (lineIndex >= 0 && lineIndex < this.lineCount) {
            z9 = true;
        }
        if (z9) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("lineIndex(" + lineIndex + ") is out of bounds [0, " + this.lineCount + ')');
    }

    /* renamed from: fillBoundingBoxes-8ffj60Q, reason: not valid java name */
    public final float[] m22877fillBoundingBoxes8ffj60Q(final long range, final float[] array, @IntRange(from = 0) int arrayStart) {
        requireIndexInRange(TextRange.m23025getMinimpl(range));
        requireIndexInRangeInclusiveEnd(TextRange.m23024getMaximpl(range));
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = arrayStart;
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        MultiParagraphKt.m22884findParagraphsByRangeSbBc2M(this.paragraphInfoList, range, new Function1<ParagraphInfo, Unit>() { // from class: androidx.compose.ui.text.MultiParagraph$fillBoundingBoxes$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ParagraphInfo paragraphInfo) {
                invoke2(paragraphInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ParagraphInfo paragraphInfo) {
                long j10 = range;
                float[] fArr = array;
                Ref.IntRef intRef2 = intRef;
                Ref.FloatRef floatRef2 = floatRef;
                long jTextRange = TextRangeKt.TextRange(paragraphInfo.toLocalIndex(paragraphInfo.getStartIndex() > TextRange.m23025getMinimpl(j10) ? paragraphInfo.getStartIndex() : TextRange.m23025getMinimpl(j10)), paragraphInfo.toLocalIndex(paragraphInfo.getEndIndex() < TextRange.m23024getMaximpl(j10) ? paragraphInfo.getEndIndex() : TextRange.m23024getMaximpl(j10)));
                paragraphInfo.getParagraph().mo22835fillBoundingBoxes8ffj60Q(jTextRange, fArr, intRef2.element);
                int iM23023getLengthimpl = intRef2.element + (TextRange.m23023getLengthimpl(jTextRange) * 4);
                for (int i10 = intRef2.element; i10 < iM23023getLengthimpl; i10 += 4) {
                    int i11 = i10 + 1;
                    float f10 = fArr[i11];
                    float f11 = floatRef2.element;
                    fArr[i11] = f10 + f11;
                    int i12 = i10 + 3;
                    fArr[i12] = fArr[i12] + f11;
                }
                intRef2.element = iM23023getLengthimpl;
                floatRef2.element += paragraphInfo.getParagraph().getHeight();
            }
        });
        return array;
    }

    public final ResolvedTextDirection getBidiRunDirection(int offset) {
        requireIndexInRangeInclusiveEnd(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == getAnnotatedString().length() ? CollectionsKt.getLastIndex(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
        return paragraphInfo.getParagraph().getBidiRunDirection(paragraphInfo.toLocalIndex(offset));
    }

    public final Rect getBoundingBox(int offset) {
        requireIndexInRange(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
        return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getBoundingBox(paragraphInfo.toLocalIndex(offset)));
    }

    public final Rect getCursorRect(int offset) {
        requireIndexInRangeInclusiveEnd(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == getAnnotatedString().length() ? CollectionsKt.getLastIndex(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
        return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getCursorRect(paragraphInfo.toLocalIndex(offset)));
    }

    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final float getFirstBaseline() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        return this.paragraphInfoList.get(0).getParagraph().getFirstBaseline();
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getHorizontalPosition(int offset, boolean usePrimaryDirection) {
        requireIndexInRangeInclusiveEnd(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == getAnnotatedString().length() ? CollectionsKt.getLastIndex(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
        return paragraphInfo.getParagraph().getHorizontalPosition(paragraphInfo.toLocalIndex(offset), usePrimaryDirection);
    }

    public final MultiParagraphIntrinsics getIntrinsics() {
        return this.intrinsics;
    }

    public final float getLastBaseline() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) CollectionsKt.last((List) this.paragraphInfoList);
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLastBaseline());
    }

    public final float getLineBaseline(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineBaseline(paragraphInfo.toLocalLineIndex(lineIndex)));
    }

    public final float getLineBottom(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineBottom(paragraphInfo.toLocalLineIndex(lineIndex)));
    }

    public final int getLineCount() {
        return this.lineCount;
    }

    public final int getLineEnd(int lineIndex, boolean visibleEnd) {
        requireLineIndexInRange(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().getLineEnd(paragraphInfo.toLocalLineIndex(lineIndex), visibleEnd));
    }

    public final int getLineForOffset(int offset) {
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset >= getAnnotatedString().length() ? CollectionsKt.getLastIndex(this.paragraphInfoList) : offset < 0 ? 0 : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
        return paragraphInfo.toGlobalLineIndex(paragraphInfo.getParagraph().getLineForOffset(paragraphInfo.toLocalIndex(offset)));
    }

    public final int getLineForVerticalPosition(float vertical) {
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByY(this.paragraphInfoList, vertical));
        return paragraphInfo.getLength() == 0 ? paragraphInfo.getStartLineIndex() : paragraphInfo.toGlobalLineIndex(paragraphInfo.getParagraph().getLineForVerticalPosition(paragraphInfo.toLocalYPosition(vertical)));
    }

    public final float getLineHeight(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.getParagraph().getLineHeight(paragraphInfo.toLocalLineIndex(lineIndex));
    }

    public final float getLineLeft(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.getParagraph().getLineLeft(paragraphInfo.toLocalLineIndex(lineIndex));
    }

    public final float getLineRight(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.getParagraph().getLineRight(paragraphInfo.toLocalLineIndex(lineIndex));
    }

    public final int getLineStart(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().getLineStart(paragraphInfo.toLocalLineIndex(lineIndex)));
    }

    public final float getLineTop(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineTop(paragraphInfo.toLocalLineIndex(lineIndex)));
    }

    public final float getLineWidth(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex));
        return paragraphInfo.getParagraph().getLineWidth(paragraphInfo.toLocalLineIndex(lineIndex));
    }

    public final float getMaxIntrinsicWidth() {
        return this.intrinsics.getMaxIntrinsicWidth();
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final float getMinIntrinsicWidth() {
        return this.intrinsics.getMinIntrinsicWidth();
    }

    /* renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public final int m22878getOffsetForPositionk4lQ0M(long position) {
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByY(this.paragraphInfoList, Float.intBitsToFloat((int) (4294967295L & position))));
        return paragraphInfo.getLength() == 0 ? paragraphInfo.getStartIndex() : paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().mo22837getOffsetForPositionk4lQ0M(paragraphInfo.m22893toLocalMKHz9U(position)));
    }

    public final ResolvedTextDirection getParagraphDirection(int offset) {
        requireIndexInRangeInclusiveEnd(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == getAnnotatedString().length() ? CollectionsKt.getLastIndex(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
        return paragraphInfo.getParagraph().getParagraphDirection(paragraphInfo.toLocalIndex(offset));
    }

    public final List<ParagraphInfo> getParagraphInfoList$ui_text_release() {
        return this.paragraphInfoList;
    }

    public final Path getPathForRange(final int start, final int end) {
        if (!(start >= 0 && start <= end && end <= getAnnotatedString().getText().length())) {
            InlineClassHelperKt.throwIllegalArgumentException("Start(" + start + ") or End(" + end + ") is out of range [0.." + getAnnotatedString().getText().length() + "), or start > end!");
        }
        if (start == end) {
            return AndroidPath_androidKt.Path();
        }
        final Path Path = AndroidPath_androidKt.Path();
        MultiParagraphKt.m22884findParagraphsByRangeSbBc2M(this.paragraphInfoList, TextRangeKt.TextRange(start, end), new Function1<ParagraphInfo, Unit>() { // from class: androidx.compose.ui.text.MultiParagraph.getPathForRange.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ParagraphInfo paragraphInfo) {
                invoke2(paragraphInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ParagraphInfo paragraphInfo) {
                Path.m21246addPathUv8p0NA$default(Path, paragraphInfo.toGlobal(paragraphInfo.getParagraph().getPathForRange(paragraphInfo.toLocalIndex(start), paragraphInfo.toLocalIndex(end))), 0L, 2, null);
            }
        });
        return Path;
    }

    public final List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    /* renamed from: getRangeForRect-8-6BmAI, reason: not valid java name */
    public final long m22879getRangeForRect86BmAI(Rect rect, int granularity, TextInclusionStrategy inclusionStrategy) {
        TextRange.Companion companion;
        TextRange.Companion companion2;
        int iFindParagraphByY = MultiParagraphKt.findParagraphByY(this.paragraphInfoList, rect.getTop());
        if (this.paragraphInfoList.get(iFindParagraphByY).getBottom() >= rect.getBottom() || iFindParagraphByY == CollectionsKt.getLastIndex(this.paragraphInfoList)) {
            ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iFindParagraphByY);
            return ParagraphInfo.m22891toGlobalxdX6G0$default(paragraphInfo, paragraphInfo.getParagraph().mo22839getRangeForRect86BmAI(paragraphInfo.toLocal(rect), granularity, inclusionStrategy), false, 1, null);
        }
        int iFindParagraphByY2 = MultiParagraphKt.findParagraphByY(this.paragraphInfoList, rect.getBottom());
        long jM23032getZerod9O1mEE = TextRange.INSTANCE.m23032getZerod9O1mEE();
        while (true) {
            companion = TextRange.INSTANCE;
            if (!TextRange.m23020equalsimpl0(jM23032getZerod9O1mEE, companion.m23032getZerod9O1mEE()) || iFindParagraphByY > iFindParagraphByY2) {
                break;
            }
            ParagraphInfo paragraphInfo2 = this.paragraphInfoList.get(iFindParagraphByY);
            jM23032getZerod9O1mEE = ParagraphInfo.m22891toGlobalxdX6G0$default(paragraphInfo2, paragraphInfo2.getParagraph().mo22839getRangeForRect86BmAI(paragraphInfo2.toLocal(rect), granularity, inclusionStrategy), false, 1, null);
            iFindParagraphByY++;
        }
        if (TextRange.m23020equalsimpl0(jM23032getZerod9O1mEE, companion.m23032getZerod9O1mEE())) {
            return companion.m23032getZerod9O1mEE();
        }
        long jM23032getZerod9O1mEE2 = companion.m23032getZerod9O1mEE();
        while (true) {
            companion2 = TextRange.INSTANCE;
            if (!TextRange.m23020equalsimpl0(jM23032getZerod9O1mEE2, companion2.m23032getZerod9O1mEE()) || iFindParagraphByY > iFindParagraphByY2) {
                break;
            }
            ParagraphInfo paragraphInfo3 = this.paragraphInfoList.get(iFindParagraphByY2);
            jM23032getZerod9O1mEE2 = ParagraphInfo.m22891toGlobalxdX6G0$default(paragraphInfo3, paragraphInfo3.getParagraph().mo22839getRangeForRect86BmAI(paragraphInfo3.toLocal(rect), granularity, inclusionStrategy), false, 1, null);
            iFindParagraphByY2--;
        }
        return TextRange.m23020equalsimpl0(jM23032getZerod9O1mEE2, companion2.m23032getZerod9O1mEE()) ? jM23032getZerod9O1mEE : TextRangeKt.TextRange(TextRange.m23027getStartimpl(jM23032getZerod9O1mEE), TextRange.m23022getEndimpl(jM23032getZerod9O1mEE2));
    }

    public final float getWidth() {
        return this.width;
    }

    /* renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public final long m22880getWordBoundaryjx7JFs(int offset) {
        requireIndexInRangeInclusiveEnd(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == getAnnotatedString().length() ? CollectionsKt.getLastIndex(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
        return paragraphInfo.m22892toGlobalxdX6G0(paragraphInfo.getParagraph().mo22840getWordBoundaryjx7JFs(paragraphInfo.toLocalIndex(offset)), false);
    }

    public final boolean isLineEllipsized(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        return this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex)).getParagraph().isLineEllipsized(lineIndex);
    }

    /* renamed from: paint-LG529CI, reason: not valid java name */
    public final void m22881paintLG529CI(Canvas canvas, long color, Shadow shadow, TextDecoration decoration, DrawStyle drawStyle, int blendMode) {
        canvas.save();
        List<ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ParagraphInfo paragraphInfo = list.get(i10);
            paragraphInfo.getParagraph().mo22841paintLG529CI(canvas, color, shadow, decoration, drawStyle, blendMode);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
        canvas.restore();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the new paint function that takes canvas as the only required parameter.")
    /* renamed from: paint-RPmYEkk, reason: not valid java name */
    public final /* synthetic */ void m22882paintRPmYEkk(Canvas canvas, long color, Shadow shadow, TextDecoration decoration) {
        canvas.save();
        List<ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            ParagraphInfo paragraphInfo = list.get(i10);
            Canvas canvas2 = canvas;
            long j10 = color;
            paragraphInfo.getParagraph().mo22842paintRPmYEkk(canvas2, j10, shadow, decoration);
            canvas2.translate(0.0f, paragraphInfo.getParagraph().getHeight());
            i10++;
            canvas = canvas2;
            color = j10;
        }
        canvas.restore();
    }

    /* renamed from: paint-hn5TExg, reason: not valid java name */
    public final void m22883painthn5TExg(Canvas canvas, Brush brush, float alpha, Shadow shadow, TextDecoration decoration, DrawStyle drawStyle, int blendMode) {
        AndroidMultiParagraphDraw_androidKt.m23280drawMultiParagraph7AXcY_I(this, canvas, brush, alpha, shadow, decoration, drawStyle, blendMode);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Constructor with `ellipsis: Boolean` is deprecated, pass TextOverflow instead")
    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j10, Density density, FontFamily.Resolver resolver, List list, int i10, boolean z9, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, j10, density, resolver, (List<AnnotatedString.Range<Placeholder>>) list, i10, z9);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, j10, i10, i11);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Constructor with `ellipsis: Boolean` is deprecated, pass TextOverflow instead")
    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j10, int i10, boolean z9, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, j10, i10, z9);
    }

    private MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j10, int i10, int i11) {
        int iM23513getMaxHeightimpl;
        this.intrinsics = multiParagraphIntrinsics;
        this.maxLines = i10;
        boolean z9 = true;
        if (!(Constraints.m23516getMinWidthimpl(j10) == 0 && Constraints.m23515getMinHeightimpl(j10) == 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        List<ParagraphIntrinsicInfo> infoList$ui_text_release = multiParagraphIntrinsics.getInfoList$ui_text_release();
        int size = infoList$ui_text_release.size();
        int i12 = 0;
        float f10 = 0.0f;
        int i13 = 0;
        while (i13 < size) {
            ParagraphIntrinsicInfo paragraphIntrinsicInfo = infoList$ui_text_release.get(i13);
            ParagraphIntrinsics intrinsics = paragraphIntrinsicInfo.getIntrinsics();
            int iM23514getMaxWidthimpl = Constraints.m23514getMaxWidthimpl(j10);
            if (Constraints.m23509getHasBoundedHeightimpl(j10)) {
                iM23513getMaxHeightimpl = RangesKt.coerceAtLeast(Constraints.m23513getMaxHeightimpl(j10) - ParagraphKt.ceilToInt(f10), 0);
            } else {
                iM23513getMaxHeightimpl = Constraints.m23513getMaxHeightimpl(j10);
            }
            Paragraph paragraphM22900ParagraphczeNHc = ParagraphKt.m22900ParagraphczeNHc(intrinsics, ConstraintsKt.Constraints$default(0, iM23514getMaxWidthimpl, 0, iM23513getMaxHeightimpl, 5, null), this.maxLines - i12, i11);
            float height = f10 + paragraphM22900ParagraphczeNHc.getHeight();
            int lineCount = i12 + paragraphM22900ParagraphczeNHc.getLineCount();
            arrayList.add(new ParagraphInfo(paragraphM22900ParagraphczeNHc, paragraphIntrinsicInfo.getStartIndex(), paragraphIntrinsicInfo.getEndIndex(), i12, lineCount, f10, height));
            if (paragraphM22900ParagraphczeNHc.getDidExceedMaxLines() || (lineCount == this.maxLines && i13 != CollectionsKt.getLastIndex(this.intrinsics.getInfoList$ui_text_release()))) {
                i12 = lineCount;
                f10 = height;
                break;
            } else {
                i13++;
                i12 = lineCount;
                f10 = height;
            }
        }
        z9 = false;
        this.height = f10;
        this.lineCount = i12;
        this.didExceedMaxLines = z9;
        this.paragraphInfoList = arrayList;
        this.width = Constraints.m23514getMaxWidthimpl(j10);
        List<Rect> arrayList2 = new ArrayList<>(arrayList.size());
        int size2 = arrayList.size();
        for (int i14 = 0; i14 < size2; i14++) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i14);
            List<Rect> placeholderRects = paragraphInfo.getParagraph().getPlaceholderRects();
            ArrayList arrayList3 = new ArrayList(placeholderRects.size());
            int size3 = placeholderRects.size();
            for (int i15 = 0; i15 < size3; i15++) {
                Rect rect = placeholderRects.get(i15);
                arrayList3.add(rect != null ? paragraphInfo.toGlobal(rect) : null);
            }
            CollectionsKt.addAll(arrayList2, arrayList3);
        }
        if (arrayList2.size() < this.intrinsics.getPlaceholders().size()) {
            int size4 = this.intrinsics.getPlaceholders().size() - arrayList2.size();
            ArrayList arrayList4 = new ArrayList(size4);
            for (int i16 = 0; i16 < size4; i16++) {
                arrayList4.add(null);
            }
            arrayList2 = CollectionsKt.plus((Collection) arrayList2, (Iterable) arrayList4);
        }
        this.placeholderRects = arrayList2;
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j10, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, j10, (i12 & 4) != 0 ? Integer.MAX_VALUE : i10, (i12 & 8) != 0 ? TextOverflow.INSTANCE.m23496getClipgIe3tQ8() : i11, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j10, int i10, boolean z9, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, j10, (i11 & 4) != 0 ? Integer.MAX_VALUE : i10, (i11 & 8) != 0 ? false : z9, (DefaultConstructorMarker) null);
    }

    private MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j10, int i10, boolean z9) {
        this(multiParagraphIntrinsics, j10, i10, z9 ? TextOverflow.INSTANCE.m23497getEllipsisgIe3tQ8() : TextOverflow.INSTANCE.m23496getClipgIe3tQ8(), (DefaultConstructorMarker) null);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, int i10, boolean z9, float f10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, (i11 & 2) != 0 ? Integer.MAX_VALUE : i10, (i11 & 4) != 0 ? false : z9, f10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated(message = "MultiParagraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @ReplaceWith(expression = "MultiParagraph(intrinsics, Constraints(maxWidth = ceil(width).toInt()), maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, int i10, boolean z9, float f10) {
        long jConstraints$default = ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f10), 0, 0, 13, null);
        TextOverflow.Companion companion = TextOverflow.INSTANCE;
        this(multiParagraphIntrinsics, jConstraints$default, i10, z9 ? companion.m23497getEllipsisgIe3tQ8() : companion.m23496getClipgIe3tQ8(), (DefaultConstructorMarker) null);
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, List list, int i10, boolean z9, float f10, Density density, Font.ResourceLoader resourceLoader, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, (List<AnnotatedString.Range<Placeholder>>) ((i11 & 4) != 0 ? CollectionsKt.emptyList() : list), (i11 & 8) != 0 ? Integer.MAX_VALUE : i10, (i11 & 16) != 0 ? false : z9, f10, density, resourceLoader);
    }

    @Deprecated(message = "Font.ResourceLoader is deprecated, use fontFamilyResolver instead", replaceWith = @ReplaceWith(expression = "MultiParagraph(annotatedString, style, placeholders, maxLines, ellipsis, width, density, fontFamilyResolver)", imports = {}))
    public MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i10, boolean z9, float f10, Density density, Font.ResourceLoader resourceLoader) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader));
        TextOverflow.Companion companion = TextOverflow.INSTANCE;
        this(multiParagraphIntrinsics, ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f10), 0, 0, 13, null), i10, z9 ? companion.m23497getEllipsisgIe3tQ8() : companion.m23496getClipgIe3tQ8(), (DefaultConstructorMarker) null);
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, float f10, Density density, FontFamily.Resolver resolver, List list, int i10, boolean z9, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, f10, density, resolver, (List<AnnotatedString.Range<Placeholder>>) ((i11 & 32) != 0 ? CollectionsKt.emptyList() : list), (i11 & 64) != 0 ? Integer.MAX_VALUE : i10, (i11 & 128) != 0 ? false : z9);
    }

    @Deprecated(message = "MultiParagraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @ReplaceWith(expression = "MultiParagraph(annotatedString, style, Constraints(maxWidth = ceil(width).toInt()), density, fontFamilyResolver, placeholders, maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, float f10, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, int i10, boolean z9) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, resolver);
        TextOverflow.Companion companion = TextOverflow.INSTANCE;
        this(multiParagraphIntrinsics, ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f10), 0, 0, 13, null), i10, z9 ? companion.m23497getEllipsisgIe3tQ8() : companion.m23496getClipgIe3tQ8(), (DefaultConstructorMarker) null);
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j10, Density density, FontFamily.Resolver resolver, List list, int i10, boolean z9, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, j10, density, resolver, (i11 & 32) != 0 ? CollectionsKt.emptyList() : list, (i11 & 64) != 0 ? Integer.MAX_VALUE : i10, (i11 & 128) != 0 ? false : z9, (DefaultConstructorMarker) null);
    }

    private MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j10, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, int i10, boolean z9) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, resolver);
        TextOverflow.Companion companion = TextOverflow.INSTANCE;
        this(multiParagraphIntrinsics, j10, i10, z9 ? companion.m23497getEllipsisgIe3tQ8() : companion.m23496getClipgIe3tQ8(), (DefaultConstructorMarker) null);
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j10, Density density, FontFamily.Resolver resolver, List list, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, j10, density, resolver, (i12 & 32) != 0 ? CollectionsKt.emptyList() : list, (i12 & 64) != 0 ? Integer.MAX_VALUE : i10, (i12 & 128) != 0 ? TextOverflow.INSTANCE.m23496getClipgIe3tQ8() : i11, (DefaultConstructorMarker) null);
    }

    private MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j10, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, int i10, int i11) {
        this(new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, resolver), j10, i10, i11, (DefaultConstructorMarker) null);
    }
}
