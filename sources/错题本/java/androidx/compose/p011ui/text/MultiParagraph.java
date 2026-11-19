package androidx.compose.p011ui.text;

import android.support.v4.media.AbstractC0037f;
import androidx.annotation.IntRange;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.graphics.AndroidPath_androidKt;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Canvas;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Path;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawStyle;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.p011ui.text.font.Font;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.internal.InlineClassHelperKt;
import androidx.compose.p011ui.text.platform.AndroidMultiParagraphDraw_androidKt;
import androidx.compose.p011ui.text.style.ResolvedTextDirection;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.ConstraintsKt;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.AbstractC5810y;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B-\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB[\b\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\n\u0010\u0018B[\b\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u001bB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\n\u0010 B-\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010!B[\b\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\"B[\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\n\u0010#J<\u0010/\u001a\u00020,2\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*H\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010.JP\u0010/\u001a\u00020,2\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\b\b\u0002\u00103\u001a\u000202ø\u0001\u0000¢\u0006\u0004\b4\u00105JX\u0010/\u001a\u00020,2\u0006\u0010%\u001a\u00020$2\u0006\u00107\u001a\u0002062\b\b\u0002\u00108\u001a\u00020\b2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\b\b\u0002\u00103\u001a\u000202ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u001d\u0010>\u001a\u00020=2\u0006\u0010;\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\u0004¢\u0006\u0004\b>\u0010?J\u0015\u0010A\u001a\u00020\u00042\u0006\u0010@\u001a\u00020\b¢\u0006\u0004\bA\u0010BJ\u0018\u0010G\u001a\u00020\u00042\u0006\u0010D\u001a\u00020Cø\u0001\u0000¢\u0006\u0004\bE\u0010FJ(\u0010Q\u001a\u00020N2\u0006\u0010I\u001a\u00020H2\u0006\u0010K\u001a\u00020J2\u0006\u0010M\u001a\u00020Lø\u0001\u0000¢\u0006\u0004\bO\u0010PJ\u0015\u0010S\u001a\u00020H2\u0006\u0010R\u001a\u00020\u0004¢\u0006\u0004\bS\u0010TJ*\u0010[\u001a\u00020V2\u0006\u0010U\u001a\u00020N2\u0006\u0010W\u001a\u00020V2\b\b\u0001\u0010X\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\bY\u0010ZJ\u001d\u0010]\u001a\u00020\b2\u0006\u0010R\u001a\u00020\u00042\u0006\u0010\\\u001a\u00020\u0006¢\u0006\u0004\b]\u0010^J\u0015\u0010`\u001a\u00020_2\u0006\u0010R\u001a\u00020\u0004¢\u0006\u0004\b`\u0010aJ\u0015\u0010b\u001a\u00020_2\u0006\u0010R\u001a\u00020\u0004¢\u0006\u0004\bb\u0010aJ\u001b\u0010e\u001a\u00020N2\u0006\u0010R\u001a\u00020\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bc\u0010dJ\u0015\u0010f\u001a\u00020H2\u0006\u0010R\u001a\u00020\u0004¢\u0006\u0004\bf\u0010TJ\u0015\u0010g\u001a\u00020\u00042\u0006\u0010R\u001a\u00020\u0004¢\u0006\u0004\bg\u0010hJ\u0015\u0010j\u001a\u00020\b2\u0006\u0010i\u001a\u00020\u0004¢\u0006\u0004\bj\u0010kJ\u0015\u0010l\u001a\u00020\b2\u0006\u0010i\u001a\u00020\u0004¢\u0006\u0004\bl\u0010kJ\u0015\u0010m\u001a\u00020\b2\u0006\u0010i\u001a\u00020\u0004¢\u0006\u0004\bm\u0010kJ\u0015\u0010n\u001a\u00020\b2\u0006\u0010i\u001a\u00020\u0004¢\u0006\u0004\bn\u0010kJ\u0015\u0010o\u001a\u00020\b2\u0006\u0010i\u001a\u00020\u0004¢\u0006\u0004\bo\u0010kJ\u0015\u0010p\u001a\u00020\b2\u0006\u0010i\u001a\u00020\u0004¢\u0006\u0004\bp\u0010kJ\u0015\u0010q\u001a\u00020\b2\u0006\u0010i\u001a\u00020\u0004¢\u0006\u0004\bq\u0010kJ\u0015\u0010r\u001a\u00020\u00042\u0006\u0010i\u001a\u00020\u0004¢\u0006\u0004\br\u0010hJ\u001f\u0010t\u001a\u00020\u00042\u0006\u0010i\u001a\u00020\u00042\b\b\u0002\u0010s\u001a\u00020\u0006¢\u0006\u0004\bt\u0010uJ\u0015\u0010v\u001a\u00020\u00062\u0006\u0010i\u001a\u00020\u0004¢\u0006\u0004\bv\u0010wJ\u0017\u0010x\u001a\u00020,2\u0006\u0010R\u001a\u00020\u0004H\u0002¢\u0006\u0004\bx\u0010yJ\u0017\u0010z\u001a\u00020,2\u0006\u0010R\u001a\u00020\u0004H\u0002¢\u0006\u0004\bz\u0010yJ\u0017\u0010{\u001a\u00020,2\u0006\u0010i\u001a\u00020\u0004H\u0002¢\u0006\u0004\b{\u0010yR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010|\u001a\u0004\b}\u0010~R\u0019\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0004\b\u0005\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001c\u0010\u0082\u0001\u001a\u00020\u00068\u0006¢\u0006\u0010\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001a\u0010\t\u001a\u00020\b8\u0006¢\u0006\u000f\n\u0005\b\t\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001c\u0010\u0089\u0001\u001a\u00020\b8\u0006¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u0086\u0001\u001a\u0006\b\u008a\u0001\u0010\u0088\u0001R\u001b\u0010\u008b\u0001\u001a\u00020\u00048\u0006¢\u0006\u000f\n\u0005\b\u008b\u0001\u0010\u007f\u001a\u0006\b\u008c\u0001\u0010\u0081\u0001R$\u0010\u008d\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010H0\u00108\u0006¢\u0006\u0010\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R&\u0010\u0092\u0001\u001a\t\u0012\u0005\u0012\u00030\u0091\u00010\u00108\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0092\u0001\u0010\u008e\u0001\u001a\u0006\b\u0093\u0001\u0010\u0090\u0001R\u0014\u0010\u0095\u0001\u001a\u00020\b8F¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0088\u0001R\u0014\u0010\u0097\u0001\u001a\u00020\b8F¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0088\u0001R\u0014\u0010\u0099\u0001\u001a\u00020\b8F¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u0088\u0001R\u0014\u0010\u009b\u0001\u001a\u00020\b8F¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010\u0088\u0001R\u0016\u0010\r\u001a\u00020\f8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u009e\u0001"}, m5110d2 = {"Landroidx/compose/ui/text/MultiParagraph;", "", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "intrinsics", "", "maxLines", "", "ellipsis", "", "width", "<init>", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;IZF)V", "Landroidx/compose/ui/text/AnnotatedString;", "annotatedString", "Landroidx/compose/ui/text/TextStyle;", "style", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "resourceLoader", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IZFLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/Font$ResourceLoader;)V", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;FLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;IZ)V", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/text/style/TextOverflow;", "overflow", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;JIILkotlin/jvm/internal/e;)V", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;JIZLkotlin/jvm/internal/e;)V", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;JLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;IZLkotlin/jvm/internal/e;)V", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;JLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;IILkotlin/jvm/internal/e;)V", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Shadow;", "shadow", "Landroidx/compose/ui/text/style/TextDecoration;", "decoration", "Ld6/s;", "paint-RPmYEkk", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;)V", "paint", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "drawStyle", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "paint-LG529CI", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "Landroidx/compose/ui/graphics/Brush;", "brush", "alpha", "paint-hn5TExg", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "start", "end", "Landroidx/compose/ui/graphics/Path;", "getPathForRange", "(II)Landroidx/compose/ui/graphics/Path;", "vertical", "getLineForVerticalPosition", "(F)I", "Landroidx/compose/ui/geometry/Offset;", RequestParameters.POSITION, "getOffsetForPosition-k-4lQ0M", "(J)I", "getOffsetForPosition", "Landroidx/compose/ui/geometry/Rect;", "rect", "Landroidx/compose/ui/text/TextGranularity;", "granularity", "Landroidx/compose/ui/text/TextInclusionStrategy;", "inclusionStrategy", "Landroidx/compose/ui/text/TextRange;", "getRangeForRect-8-6BmAI", "(Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J", "getRangeForRect", TypedValues.CycleType.S_WAVE_OFFSET, "getBoundingBox", "(I)Landroidx/compose/ui/geometry/Rect;", "range", "", "array", "arrayStart", "fillBoundingBoxes-8ffj60Q", "(J[FI)[F", "fillBoundingBoxes", "usePrimaryDirection", "getHorizontalPosition", "(IZ)F", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getParagraphDirection", "(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;", "getBidiRunDirection", "getWordBoundary--jx7JFs", "(I)J", "getWordBoundary", "getCursorRect", "getLineForOffset", "(I)I", "lineIndex", "getLineLeft", "(I)F", "getLineRight", "getLineTop", "getLineBaseline", "getLineBottom", "getLineHeight", "getLineWidth", "getLineStart", "visibleEnd", "getLineEnd", "(IZ)I", "isLineEllipsized", "(I)Z", "requireIndexInRange", "(I)V", "requireIndexInRangeInclusiveEnd", "requireLineIndexInRange", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "getIntrinsics", "()Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "I", "getMaxLines", "()I", "didExceedMaxLines", "Z", "getDidExceedMaxLines", "()Z", "F", "getWidth", "()F", "height", "getHeight", "lineCount", "getLineCount", "placeholderRects", "Ljava/util/List;", "getPlaceholderRects", "()Ljava/util/List;", "Landroidx/compose/ui/text/ParagraphInfo;", "paragraphInfoList", "getParagraphInfoList$ui_text_release", "getMinIntrinsicWidth", "minIntrinsicWidth", "getMaxIntrinsicWidth", "maxIntrinsicWidth", "getFirstBaseline", "firstBaseline", "getLastBaseline", "lastBaseline", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "ui-text_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMultiParagraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraph\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,1227:1\n114#2,8:1228\n114#2,8:1271\n114#2,8:1282\n114#2,8:1290\n114#2,8:1298\n529#3,3:1236\n34#3,4:1239\n532#3:1243\n150#3,3:1245\n34#3,6:1248\n153#3:1254\n533#3,2:1255\n39#3:1257\n535#3:1258\n34#3,6:1259\n34#3,6:1265\n1#4:1244\n69#5:1279\n70#6:1280\n22#7:1281\n*S KotlinDebug\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraph\n*L\n389#1:1228,8\n522#1:1271,8\n988#1:1282,8\n994#1:1290,8\n1000#1:1298,8\n455#1:1236,3\n455#1:1239,4\n455#1:1243\n456#1:1245,3\n456#1:1248,6\n456#1:1254\n455#1:1255,2\n455#1:1257\n455#1:1258\n483#1:1259,6\n500#1:1265,6\n564#1:1279\n564#1:1280\n564#1:1281\n*E\n"})
/* loaded from: classes2.dex */
public final class MultiParagraph {
    public static final int $stable = 8;
    private final boolean didExceedMaxLines;
    private final float height;

    @NotNull
    private final MultiParagraphIntrinsics intrinsics;
    private final int lineCount;
    private final int maxLines;

    @NotNull
    private final List<ParagraphInfo> paragraphInfoList;

    @NotNull
    private final List<Rect> placeholderRects;
    private final float width;

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j7, Density density, FontFamily.Resolver resolver, List list, int i, int i8, AbstractC5824e abstractC5824e) {
        this(annotatedString, textStyle, j7, density, resolver, (List<AnnotatedString.Range<Placeholder>>) list, i, i8);
    }

    private final AnnotatedString getAnnotatedString() {
        return this.intrinsics.getAnnotatedString();
    }

    public static /* synthetic */ int getLineEnd$default(MultiParagraph multiParagraph, int i, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return multiParagraph.getLineEnd(i, z8);
    }

    /* renamed from: paint-RPmYEkk$default, reason: not valid java name */
    public static /* synthetic */ void m12618paintRPmYEkk$default(MultiParagraph multiParagraph, Canvas canvas, long j7, Shadow shadow, TextDecoration textDecoration, int i, Object obj) {
        if ((i & 2) != 0) {
            j7 = Color.INSTANCE.m10718getUnspecified0d7_KjU();
        }
        multiParagraph.m12625paintRPmYEkk(canvas, j7, (i & 4) != 0 ? null : shadow, (i & 8) != 0 ? null : textDecoration);
    }

    /* renamed from: paint-hn5TExg$default, reason: not valid java name */
    public static /* synthetic */ void m12619painthn5TExg$default(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            f = Float.NaN;
        }
        multiParagraph.m12626painthn5TExg(canvas, brush, f, (i8 & 8) != 0 ? null : shadow, (i8 & 16) != 0 ? null : textDecoration, (i8 & 32) != 0 ? null : drawStyle, (i8 & 64) != 0 ? DrawScope.INSTANCE.m11235getDefaultBlendMode0nO6VwU() : i);
    }

    private final void requireIndexInRange(int offset) {
        boolean z8 = false;
        if (offset >= 0 && offset < getAnnotatedString().getText().length()) {
            z8 = true;
        }
        if (z8) {
            return;
        }
        StringBuilder sbM94s = AbstractC0037f.m94s(offset, "offset(", ") is out of bounds [0, ");
        sbM94s.append(getAnnotatedString().length());
        sbM94s.append(')');
        InlineClassHelperKt.throwIllegalArgumentException(sbM94s.toString());
    }

    private final void requireIndexInRangeInclusiveEnd(int offset) {
        boolean z8 = false;
        if (offset >= 0 && offset <= getAnnotatedString().getText().length()) {
            z8 = true;
        }
        if (z8) {
            return;
        }
        StringBuilder sbM94s = AbstractC0037f.m94s(offset, "offset(", ") is out of bounds [0, ");
        sbM94s.append(getAnnotatedString().length());
        sbM94s.append(']');
        InlineClassHelperKt.throwIllegalArgumentException(sbM94s.toString());
    }

    private final void requireLineIndexInRange(int lineIndex) {
        boolean z8 = false;
        if (lineIndex >= 0 && lineIndex < this.lineCount) {
            z8 = true;
        }
        if (z8) {
            return;
        }
        StringBuilder sbM94s = AbstractC0037f.m94s(lineIndex, "lineIndex(", ") is out of bounds [0, ");
        sbM94s.append(this.lineCount);
        sbM94s.append(')');
        InlineClassHelperKt.throwIllegalArgumentException(sbM94s.toString());
    }

    @NotNull
    /* renamed from: fillBoundingBoxes-8ffj60Q, reason: not valid java name */
    public final float[] m12620fillBoundingBoxes8ffj60Q(final long range, @NotNull final float[] array, @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int arrayStart) {
        requireIndexInRange(TextRange.m12768getMinimpl(range));
        requireIndexInRangeInclusiveEnd(TextRange.m12767getMaximpl(range));
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = arrayStart;
        final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        MultiParagraphKt.m12627findParagraphsByRangeSbBc2M(this.paragraphInfoList, range, new InterfaceC6471c() { // from class: androidx.compose.ui.text.MultiParagraph$fillBoundingBoxes$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ParagraphInfo) obj);
                return C5443s.f8405a;
            }

            public final void invoke(ParagraphInfo paragraphInfo) {
                long j7 = range;
                float[] fArr = array;
                Ref$IntRef ref$IntRef2 = ref$IntRef;
                Ref$FloatRef ref$FloatRef2 = ref$FloatRef;
                long jTextRange = TextRangeKt.TextRange(paragraphInfo.toLocalIndex(paragraphInfo.getStartIndex() > TextRange.m12768getMinimpl(j7) ? paragraphInfo.getStartIndex() : TextRange.m12768getMinimpl(j7)), paragraphInfo.toLocalIndex(paragraphInfo.getEndIndex() < TextRange.m12767getMaximpl(j7) ? paragraphInfo.getEndIndex() : TextRange.m12767getMaximpl(j7)));
                paragraphInfo.getParagraph().mo12578fillBoundingBoxes8ffj60Q(jTextRange, fArr, ref$IntRef2.element);
                int iM12766getLengthimpl = (TextRange.m12766getLengthimpl(jTextRange) * 4) + ref$IntRef2.element;
                for (int i = ref$IntRef2.element; i < iM12766getLengthimpl; i += 4) {
                    int i8 = i + 1;
                    float f = fArr[i8];
                    float f7 = ref$FloatRef2.element;
                    fArr[i8] = f + f7;
                    int i9 = i + 3;
                    fArr[i9] = fArr[i9] + f7;
                }
                ref$IntRef2.element = iM12766getLengthimpl;
                ref$FloatRef2.element = paragraphInfo.getParagraph().getHeight() + ref$FloatRef2.element;
            }
        });
        return array;
    }

    @NotNull
    public final ResolvedTextDirection getBidiRunDirection(int offset) {
        requireIndexInRangeInclusiveEnd(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == getAnnotatedString().length() ? AbstractC5806u.m5282u(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
        return paragraphInfo.getParagraph().getBidiRunDirection(paragraphInfo.toLocalIndex(offset));
    }

    @NotNull
    public final Rect getBoundingBox(int offset) {
        requireIndexInRange(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
        return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getBoundingBox(paragraphInfo.toLocalIndex(offset)));
    }

    @NotNull
    public final Rect getCursorRect(int offset) {
        requireIndexInRangeInclusiveEnd(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == getAnnotatedString().length() ? AbstractC5806u.m5282u(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
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
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == getAnnotatedString().length() ? AbstractC5806u.m5282u(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
        return paragraphInfo.getParagraph().getHorizontalPosition(paragraphInfo.toLocalIndex(offset), usePrimaryDirection);
    }

    @NotNull
    public final MultiParagraphIntrinsics getIntrinsics() {
        return this.intrinsics;
    }

    public final float getLastBaseline() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) AbstractC5805t.m5235o0(this.paragraphInfoList);
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
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset >= getAnnotatedString().length() ? AbstractC5806u.m5282u(this.paragraphInfoList) : offset < 0 ? 0 : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
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
    public final int m12621getOffsetForPositionk4lQ0M(long position) {
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByY(this.paragraphInfoList, Float.intBitsToFloat((int) (4294967295L & position))));
        return paragraphInfo.getLength() == 0 ? paragraphInfo.getStartIndex() : paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().mo12580getOffsetForPositionk4lQ0M(paragraphInfo.m12636toLocalMKHz9U(position)));
    }

    @NotNull
    public final ResolvedTextDirection getParagraphDirection(int offset) {
        requireIndexInRangeInclusiveEnd(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == getAnnotatedString().length() ? AbstractC5806u.m5282u(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
        return paragraphInfo.getParagraph().getParagraphDirection(paragraphInfo.toLocalIndex(offset));
    }

    @NotNull
    public final List<ParagraphInfo> getParagraphInfoList$ui_text_release() {
        return this.paragraphInfoList;
    }

    @NotNull
    public final Path getPathForRange(final int start, final int end) {
        if (!(start >= 0 && start <= end && end <= getAnnotatedString().getText().length())) {
            StringBuilder sbM99x = AbstractC0037f.m99x("Start(", ") or End(", start, ") is out of range [0..", end);
            sbM99x.append(getAnnotatedString().getText().length());
            sbM99x.append("), or start > end!");
            InlineClassHelperKt.throwIllegalArgumentException(sbM99x.toString());
        }
        if (start == end) {
            return AndroidPath_androidKt.Path();
        }
        final Path Path = AndroidPath_androidKt.Path();
        MultiParagraphKt.m12627findParagraphsByRangeSbBc2M(this.paragraphInfoList, TextRangeKt.TextRange(start, end), new InterfaceC6471c() { // from class: androidx.compose.ui.text.MultiParagraph.getPathForRange.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ParagraphInfo) obj);
                return C5443s.f8405a;
            }

            public final void invoke(ParagraphInfo paragraphInfo) {
                Path.m10952addPathUv8p0NA$default(Path, paragraphInfo.toGlobal(paragraphInfo.getParagraph().getPathForRange(paragraphInfo.toLocalIndex(start), paragraphInfo.toLocalIndex(end))), 0L, 2, null);
            }
        });
        return Path;
    }

    @NotNull
    public final List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    /* renamed from: getRangeForRect-8-6BmAI, reason: not valid java name */
    public final long m12622getRangeForRect86BmAI(@NotNull Rect rect, int granularity, @NotNull TextInclusionStrategy inclusionStrategy) {
        TextRange.Companion companion;
        TextRange.Companion companion2;
        int iFindParagraphByY = MultiParagraphKt.findParagraphByY(this.paragraphInfoList, rect.getTop());
        if (this.paragraphInfoList.get(iFindParagraphByY).getBottom() >= rect.getBottom() || iFindParagraphByY == AbstractC5806u.m5282u(this.paragraphInfoList)) {
            ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iFindParagraphByY);
            return ParagraphInfo.m12634toGlobalxdX6G0$default(paragraphInfo, paragraphInfo.getParagraph().mo12582getRangeForRect86BmAI(paragraphInfo.toLocal(rect), granularity, inclusionStrategy), false, 1, null);
        }
        int iFindParagraphByY2 = MultiParagraphKt.findParagraphByY(this.paragraphInfoList, rect.getBottom());
        long jM12775getZerod9O1mEE = TextRange.INSTANCE.m12775getZerod9O1mEE();
        while (true) {
            companion = TextRange.INSTANCE;
            if (!TextRange.m12763equalsimpl0(jM12775getZerod9O1mEE, companion.m12775getZerod9O1mEE()) || iFindParagraphByY > iFindParagraphByY2) {
                break;
            }
            ParagraphInfo paragraphInfo2 = this.paragraphInfoList.get(iFindParagraphByY);
            jM12775getZerod9O1mEE = ParagraphInfo.m12634toGlobalxdX6G0$default(paragraphInfo2, paragraphInfo2.getParagraph().mo12582getRangeForRect86BmAI(paragraphInfo2.toLocal(rect), granularity, inclusionStrategy), false, 1, null);
            iFindParagraphByY++;
        }
        if (TextRange.m12763equalsimpl0(jM12775getZerod9O1mEE, companion.m12775getZerod9O1mEE())) {
            return companion.m12775getZerod9O1mEE();
        }
        long jM12775getZerod9O1mEE2 = companion.m12775getZerod9O1mEE();
        while (true) {
            companion2 = TextRange.INSTANCE;
            if (!TextRange.m12763equalsimpl0(jM12775getZerod9O1mEE2, companion2.m12775getZerod9O1mEE()) || iFindParagraphByY > iFindParagraphByY2) {
                break;
            }
            ParagraphInfo paragraphInfo3 = this.paragraphInfoList.get(iFindParagraphByY2);
            jM12775getZerod9O1mEE2 = ParagraphInfo.m12634toGlobalxdX6G0$default(paragraphInfo3, paragraphInfo3.getParagraph().mo12582getRangeForRect86BmAI(paragraphInfo3.toLocal(rect), granularity, inclusionStrategy), false, 1, null);
            iFindParagraphByY2--;
        }
        return TextRange.m12763equalsimpl0(jM12775getZerod9O1mEE2, companion2.m12775getZerod9O1mEE()) ? jM12775getZerod9O1mEE : TextRangeKt.TextRange(TextRange.m12770getStartimpl(jM12775getZerod9O1mEE), TextRange.m12765getEndimpl(jM12775getZerod9O1mEE2));
    }

    public final float getWidth() {
        return this.width;
    }

    /* renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public final long m12623getWordBoundaryjx7JFs(int offset) {
        requireIndexInRangeInclusiveEnd(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == getAnnotatedString().length() ? AbstractC5806u.m5282u(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
        return paragraphInfo.m12635toGlobalxdX6G0(paragraphInfo.getParagraph().mo12583getWordBoundaryjx7JFs(paragraphInfo.toLocalIndex(offset)), false);
    }

    public final boolean isLineEllipsized(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        return this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex)).getParagraph().isLineEllipsized(lineIndex);
    }

    /* renamed from: paint-LG529CI, reason: not valid java name */
    public final void m12624paintLG529CI(@NotNull Canvas canvas, long color, @Nullable Shadow shadow, @Nullable TextDecoration decoration, @Nullable DrawStyle drawStyle, int blendMode) {
        canvas.save();
        List<ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ParagraphInfo paragraphInfo = list.get(i);
            paragraphInfo.getParagraph().mo12584paintLG529CI(canvas, color, shadow, decoration, drawStyle, blendMode);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
        canvas.restore();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the new paint function that takes canvas as the only required parameter.")
    /* renamed from: paint-RPmYEkk, reason: not valid java name */
    public final /* synthetic */ void m12625paintRPmYEkk(Canvas canvas, long color, Shadow shadow, TextDecoration decoration) {
        canvas.save();
        List<ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        int i = 0;
        while (i < size) {
            ParagraphInfo paragraphInfo = list.get(i);
            Canvas canvas2 = canvas;
            long j7 = color;
            paragraphInfo.getParagraph().mo12585paintRPmYEkk(canvas2, j7, shadow, decoration);
            canvas2.translate(0.0f, paragraphInfo.getParagraph().getHeight());
            i++;
            canvas = canvas2;
            color = j7;
        }
        canvas.restore();
    }

    /* renamed from: paint-hn5TExg, reason: not valid java name */
    public final void m12626painthn5TExg(@NotNull Canvas canvas, @NotNull Brush brush, float alpha, @Nullable Shadow shadow, @Nullable TextDecoration decoration, @Nullable DrawStyle drawStyle, int blendMode) {
        AndroidMultiParagraphDraw_androidKt.m13023drawMultiParagraph7AXcY_I(this, canvas, brush, alpha, shadow, decoration, drawStyle, blendMode);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Constructor with `ellipsis: Boolean` is deprecated, pass TextOverflow instead")
    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j7, Density density, FontFamily.Resolver resolver, List list, int i, boolean z8, AbstractC5824e abstractC5824e) {
        this(annotatedString, textStyle, j7, density, resolver, (List<AnnotatedString.Range<Placeholder>>) list, i, z8);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j7, int i, int i8, AbstractC5824e abstractC5824e) {
        this(multiParagraphIntrinsics, j7, i, i8);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Constructor with `ellipsis: Boolean` is deprecated, pass TextOverflow instead")
    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j7, int i, boolean z8, AbstractC5824e abstractC5824e) {
        this(multiParagraphIntrinsics, j7, i, z8);
    }

    private MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j7, int i, int i8) {
        boolean z8;
        int iM13257getMaxHeightimpl;
        this.intrinsics = multiParagraphIntrinsics;
        this.maxLines = i;
        if (Constraints.m13260getMinWidthimpl(j7) != 0 || Constraints.m13259getMinHeightimpl(j7) != 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        List<ParagraphIntrinsicInfo> infoList$ui_text_release = multiParagraphIntrinsics.getInfoList$ui_text_release();
        int size = infoList$ui_text_release.size();
        int i9 = 0;
        float f = 0.0f;
        int i10 = 0;
        while (i10 < size) {
            ParagraphIntrinsicInfo paragraphIntrinsicInfo = infoList$ui_text_release.get(i10);
            ParagraphIntrinsics intrinsics = paragraphIntrinsicInfo.getIntrinsics();
            int iM13258getMaxWidthimpl = Constraints.m13258getMaxWidthimpl(j7);
            if (Constraints.m13253getHasBoundedHeightimpl(j7)) {
                iM13257getMaxHeightimpl = Constraints.m13257getMaxHeightimpl(j7) - ParagraphKt.ceilToInt(f);
                if (iM13257getMaxHeightimpl < 0) {
                    iM13257getMaxHeightimpl = 0;
                }
            } else {
                iM13257getMaxHeightimpl = Constraints.m13257getMaxHeightimpl(j7);
            }
            Paragraph paragraphM12643ParagraphczeNHc = ParagraphKt.m12643ParagraphczeNHc(intrinsics, ConstraintsKt.Constraints$default(0, iM13258getMaxWidthimpl, 0, iM13257getMaxHeightimpl, 5, null), this.maxLines - i9, i8);
            float height = paragraphM12643ParagraphczeNHc.getHeight() + f;
            int lineCount = paragraphM12643ParagraphczeNHc.getLineCount() + i9;
            arrayList.add(new ParagraphInfo(paragraphM12643ParagraphczeNHc, paragraphIntrinsicInfo.getStartIndex(), paragraphIntrinsicInfo.getEndIndex(), i9, lineCount, f, height));
            if (paragraphM12643ParagraphczeNHc.getDidExceedMaxLines() || (lineCount == this.maxLines && i10 != AbstractC5806u.m5282u(this.intrinsics.getInfoList$ui_text_release()))) {
                z8 = true;
                i9 = lineCount;
                f = height;
                break;
            } else {
                i10++;
                i9 = lineCount;
                f = height;
            }
        }
        z8 = false;
        this.height = f;
        this.lineCount = i9;
        this.didExceedMaxLines = z8;
        this.paragraphInfoList = arrayList;
        this.width = Constraints.m13258getMaxWidthimpl(j7);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i11);
            List<Rect> placeholderRects = paragraphInfo.getParagraph().getPlaceholderRects();
            ArrayList arrayList3 = new ArrayList(placeholderRects.size());
            int size3 = placeholderRects.size();
            for (int i12 = 0; i12 < size3; i12++) {
                Rect rect = placeholderRects.get(i12);
                arrayList3.add(rect != null ? paragraphInfo.toGlobal(rect) : null);
            }
            AbstractC5810y.m5291S(arrayList3, arrayList2);
        }
        if (arrayList2.size() < this.intrinsics.getPlaceholders().size()) {
            int size4 = this.intrinsics.getPlaceholders().size() - arrayList2.size();
            ArrayList arrayList4 = new ArrayList(size4);
            for (int i13 = 0; i13 < size4; i13++) {
                arrayList4.add(null);
            }
            arrayList2 = AbstractC5805t.m5240t0(arrayList2, arrayList4);
        }
        this.placeholderRects = arrayList2;
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j7, int i, int i8, int i9, AbstractC5824e abstractC5824e) {
        this(multiParagraphIntrinsics, j7, (i9 & 4) != 0 ? Integer.MAX_VALUE : i, (i9 & 8) != 0 ? TextOverflow.INSTANCE.m13240getClipgIe3tQ8() : i8, (AbstractC5824e) null);
    }

    public MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, float f, Density density, FontFamily.Resolver resolver, List list, int i, boolean z8, int i8, AbstractC5824e abstractC5824e) {
        this(annotatedString, textStyle, f, density, resolver, (List<AnnotatedString.Range<Placeholder>>) ((i8 & 32) != 0 ? EmptyList.INSTANCE : list), (i8 & 64) != 0 ? Integer.MAX_VALUE : i, (i8 & 128) != 0 ? false : z8);
    }

    public MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j7, Density density, FontFamily.Resolver resolver, List list, int i, int i8, int i9, AbstractC5824e abstractC5824e) {
        this(annotatedString, textStyle, j7, density, resolver, (i9 & 32) != 0 ? EmptyList.INSTANCE : list, (i9 & 64) != 0 ? Integer.MAX_VALUE : i, (i9 & 128) != 0 ? TextOverflow.INSTANCE.m13240getClipgIe3tQ8() : i8, (AbstractC5824e) null);
    }

    public MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j7, Density density, FontFamily.Resolver resolver, List list, int i, boolean z8, int i8, AbstractC5824e abstractC5824e) {
        this(annotatedString, textStyle, j7, density, resolver, (i8 & 32) != 0 ? EmptyList.INSTANCE : list, (i8 & 64) != 0 ? Integer.MAX_VALUE : i, (i8 & 128) != 0 ? false : z8, (AbstractC5824e) null);
    }

    public MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, List list, int i, boolean z8, float f, Density density, Font.ResourceLoader resourceLoader, int i8, AbstractC5824e abstractC5824e) {
        this(annotatedString, textStyle, (List<AnnotatedString.Range<Placeholder>>) ((i8 & 4) != 0 ? EmptyList.INSTANCE : list), (i8 & 8) != 0 ? Integer.MAX_VALUE : i, (i8 & 16) != 0 ? false : z8, f, density, resourceLoader);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j7, int i, boolean z8, int i8, AbstractC5824e abstractC5824e) {
        this(multiParagraphIntrinsics, j7, (i8 & 4) != 0 ? Integer.MAX_VALUE : i, (i8 & 8) != 0 ? false : z8, (AbstractC5824e) null);
    }

    private MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j7, int i, boolean z8) {
        this(multiParagraphIntrinsics, j7, i, z8 ? TextOverflow.INSTANCE.m13241getEllipsisgIe3tQ8() : TextOverflow.INSTANCE.m13240getClipgIe3tQ8(), (AbstractC5824e) null);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, int i, boolean z8, float f, int i8, AbstractC5824e abstractC5824e) {
        this(multiParagraphIntrinsics, (i8 & 2) != 0 ? Integer.MAX_VALUE : i, (i8 & 4) != 0 ? false : z8, f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated(message = "MultiParagraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @ReplaceWith(expression = "MultiParagraph(intrinsics, Constraints(maxWidth = ceil(width).toInt()), maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public MultiParagraph(@NotNull MultiParagraphIntrinsics multiParagraphIntrinsics, int i, boolean z8, float f) {
        long jConstraints$default = ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f), 0, 0, 13, null);
        TextOverflow.Companion companion = TextOverflow.INSTANCE;
        this(multiParagraphIntrinsics, jConstraints$default, i, z8 ? companion.m13241getEllipsisgIe3tQ8() : companion.m13240getClipgIe3tQ8(), (AbstractC5824e) null);
    }

    @Deprecated(message = "Font.ResourceLoader is deprecated, use fontFamilyResolver instead", replaceWith = @ReplaceWith(expression = "MultiParagraph(annotatedString, style, placeholders, maxLines, ellipsis, width, density, fontFamilyResolver)", imports = {}))
    public MultiParagraph(@NotNull AnnotatedString annotatedString, @NotNull TextStyle textStyle, @NotNull List<AnnotatedString.Range<Placeholder>> list, int i, boolean z8, float f, @NotNull Density density, @NotNull Font.ResourceLoader resourceLoader) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader));
        TextOverflow.Companion companion = TextOverflow.INSTANCE;
        this(multiParagraphIntrinsics, ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f), 0, 0, 13, null), i, z8 ? companion.m13241getEllipsisgIe3tQ8() : companion.m13240getClipgIe3tQ8(), (AbstractC5824e) null);
    }

    @Deprecated(message = "MultiParagraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @ReplaceWith(expression = "MultiParagraph(annotatedString, style, Constraints(maxWidth = ceil(width).toInt()), density, fontFamilyResolver, placeholders, maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public MultiParagraph(@NotNull AnnotatedString annotatedString, @NotNull TextStyle textStyle, float f, @NotNull Density density, @NotNull FontFamily.Resolver resolver, @NotNull List<AnnotatedString.Range<Placeholder>> list, int i, boolean z8) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, resolver);
        TextOverflow.Companion companion = TextOverflow.INSTANCE;
        this(multiParagraphIntrinsics, ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f), 0, 0, 13, null), i, z8 ? companion.m13241getEllipsisgIe3tQ8() : companion.m13240getClipgIe3tQ8(), (AbstractC5824e) null);
    }

    private MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j7, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, int i, boolean z8) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, resolver);
        TextOverflow.Companion companion = TextOverflow.INSTANCE;
        this(multiParagraphIntrinsics, j7, i, z8 ? companion.m13241getEllipsisgIe3tQ8() : companion.m13240getClipgIe3tQ8(), (AbstractC5824e) null);
    }

    private MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j7, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, int i, int i8) {
        this(new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, resolver), j7, i, i8, (AbstractC5824e) null);
    }
}
