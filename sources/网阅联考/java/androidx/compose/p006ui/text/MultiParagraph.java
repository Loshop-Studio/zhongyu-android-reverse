package androidx.compose.p006ui.text;

import androidx.compose.p006ui.geometry.Offset;
import androidx.compose.p006ui.geometry.Rect;
import androidx.compose.p006ui.graphics.AbstractC1325h1;
import androidx.compose.p006ui.graphics.AndroidPath_androidKt;
import androidx.compose.p006ui.graphics.Brush;
import androidx.compose.p006ui.graphics.Canvas;
import androidx.compose.p006ui.graphics.Color;
import androidx.compose.p006ui.graphics.Path;
import androidx.compose.p006ui.graphics.Shadow;
import androidx.compose.p006ui.graphics.drawscope.DrawStyle;
import androidx.compose.p006ui.text.AnnotatedString;
import androidx.compose.p006ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.p006ui.text.font.Font;
import androidx.compose.p006ui.text.font.FontFamily;
import androidx.compose.p006ui.text.platform.AndroidMultiParagraphDrawKt;
import androidx.compose.p006ui.text.style.ResolvedTextDirection;
import androidx.compose.p006ui.text.style.TextDecoration;
import androidx.compose.p006ui.unit.Constraints;
import androidx.compose.p006ui.unit.ConstraintsKt;
import androidx.compose.p006ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;

@StabilityInferred(parameters = 0)
@Metadata(m5174d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B+\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nBY\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017BY\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u001aB\\\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001dB,\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001eJ\u000e\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\u0005J\u000e\u0010@\u001a\u00020:2\u0006\u0010?\u001a\u00020\u0005J\u000e\u0010A\u001a\u00020:2\u0006\u0010?\u001a\u00020\u0005J\u0016\u0010B\u001a\u00020\t2\u0006\u0010?\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u0007J\u000e\u0010D\u001a\u00020\t2\u0006\u0010E\u001a\u00020\u0005J\u0018\u0010F\u001a\u00020\u00052\u0006\u0010E\u001a\u00020\u00052\b\b\u0002\u0010G\u001a\u00020\u0007J\u000e\u0010H\u001a\u00020\u00052\u0006\u0010?\u001a\u00020\u0005J\u000e\u0010I\u001a\u00020\u00052\u0006\u0010J\u001a\u00020\tJ\u000e\u0010K\u001a\u00020\t2\u0006\u0010E\u001a\u00020\u0005J\u000e\u0010L\u001a\u00020\t2\u0006\u0010E\u001a\u00020\u0005J\u000e\u0010M\u001a\u00020\t2\u0006\u0010E\u001a\u00020\u0005J\u000e\u0010N\u001a\u00020\u00052\u0006\u0010E\u001a\u00020\u0005J\u000e\u0010O\u001a\u00020\t2\u0006\u0010E\u001a\u00020\u0005J\u000e\u0010P\u001a\u00020\t2\u0006\u0010E\u001a\u00020\u0005J\u001b\u0010Q\u001a\u00020\u00052\u0006\u0010R\u001a\u00020Sø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bT\u0010UJ\u000e\u0010V\u001a\u00020>2\u0006\u0010?\u001a\u00020\u0005J\u0016\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020\u00052\u0006\u0010Z\u001a\u00020\u0005J\u001e\u0010[\u001a\u00020\\2\u0006\u0010?\u001a\u00020\u0005ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b]\u0010^J\u000e\u0010_\u001a\u00020\u00072\u0006\u0010E\u001a\u00020\u0005J]\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020c2\u0006\u0010d\u001a\u00020e2\b\b\u0002\u0010f\u001a\u00020\t2\n\b\u0002\u0010g\u001a\u0004\u0018\u00010h2\n\b\u0002\u0010i\u001a\u0004\u0018\u00010j2\n\b\u0002\u0010k\u001a\u0004\u0018\u00010l2\b\b\u0002\u0010m\u001a\u00020nH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bo\u0010pJ=\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020c2\b\b\u0002\u0010q\u001a\u00020r2\n\b\u0002\u0010g\u001a\u0004\u0018\u00010h2\n\b\u0002\u0010i\u001a\u0004\u0018\u00010jø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bs\u0010tJU\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020c2\b\b\u0002\u0010q\u001a\u00020r2\n\b\u0002\u0010g\u001a\u0004\u0018\u00010h2\n\b\u0002\u0010i\u001a\u0004\u0018\u00010j2\n\b\u0002\u0010k\u001a\u0004\u0018\u00010l2\b\b\u0002\u0010m\u001a\u00020nH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bu\u0010vJ\u0010\u0010w\u001a\u00020a2\u0006\u0010?\u001a\u00020\u0005H\u0002J\u0010\u0010x\u001a\u00020a2\u0006\u0010?\u001a\u00020\u0005H\u0002J\u0010\u0010y\u001a\u00020a2\u0006\u0010E\u001a\u00020\u0005H\u0002R\u0014\u0010\u000b\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010+\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b,\u0010&R\u0011\u0010-\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u00100\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b1\u0010&R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u0010/R\u0011\u00103\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b4\u0010&R\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002060\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0019\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010:0\u0010¢\u0006\b\n\u0000\u001a\u0004\b;\u00108R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b<\u0010&\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006z"}, m5175d2 = {"Landroidx/compose/ui/text/MultiParagraph;", "", "intrinsics", "Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "maxLines", "", "ellipsis", "", "width", "", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;IZF)V", "annotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "density", "Landroidx/compose/ui/unit/Density;", "resourceLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IZFLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/Font$ResourceLoader;)V", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;FLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;IZ)V", "constraints", "Landroidx/compose/ui/unit/Constraints;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;JLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;IZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/MultiParagraphIntrinsics;JIZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "didExceedMaxLines", "getDidExceedMaxLines", "()Z", "firstBaseline", "getFirstBaseline", "()F", "height", "getHeight", "getIntrinsics", "()Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "lastBaseline", "getLastBaseline", "lineCount", "getLineCount", "()I", "maxIntrinsicWidth", "getMaxIntrinsicWidth", "getMaxLines", "minIntrinsicWidth", "getMinIntrinsicWidth", "paragraphInfoList", "Landroidx/compose/ui/text/ParagraphInfo;", "getParagraphInfoList$ui_text_release", "()Ljava/util/List;", "placeholderRects", "Landroidx/compose/ui/geometry/Rect;", "getPlaceholderRects", "getWidth", "getBidiRunDirection", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "offset", "getBoundingBox", "getCursorRect", "getHorizontalPosition", "usePrimaryDirection", "getLineBottom", "lineIndex", "getLineEnd", "visibleEnd", "getLineForOffset", "getLineForVerticalPosition", "vertical", "getLineHeight", "getLineLeft", "getLineRight", "getLineStart", "getLineTop", "getLineWidth", "getOffsetForPosition", "position", "Landroidx/compose/ui/geometry/Offset;", "getOffsetForPosition-k-4lQ0M", "(J)I", "getParagraphDirection", "getPathForRange", "Landroidx/compose/ui/graphics/Path;", "start", "end", "getWordBoundary", "Landroidx/compose/ui/text/TextRange;", "getWordBoundary--jx7JFs", "(I)J", "isLineEllipsized", "paint", "", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "decoration", "Landroidx/compose/ui/text/style/TextDecoration;", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "paint-hn5TExg", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "color", "Landroidx/compose/ui/graphics/Color;", "paint-RPmYEkk", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;)V", "paint-LG529CI", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "requireIndexInRange", "requireIndexInRangeInclusiveEnd", "requireLineIndexInRange", "ui-text_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMultiParagraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraph\n+ 2 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,980:1\n127#2,3:981\n130#2:988\n131#2,2:1000\n133#2:1003\n33#3,4:984\n151#3,3:989\n33#3,4:992\n154#3,2:996\n38#3:998\n156#3:999\n38#3:1002\n33#3,6:1005\n33#3,6:1011\n1#4:1004\n*S KotlinDebug\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/MultiParagraph\n*L\n371#1:981,3\n371#1:988\n371#1:1000,2\n371#1:1003\n371#1:984,4\n373#1:989,3\n373#1:992,4\n373#1:996,2\n373#1:998\n373#1:999\n371#1:1002\n395#1:1005,6\n413#1:1011,6\n*E\n"})
/* loaded from: classes.dex */
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

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j4, Density density, FontFamily.Resolver resolver, List list, int i4, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, j4, density, resolver, (List<AnnotatedString.Range<Placeholder>>) list, i4, z3);
    }

    private final AnnotatedString getAnnotatedString() {
        return this.intrinsics.getAnnotatedString();
    }

    public static /* synthetic */ int getLineEnd$default(MultiParagraph multiParagraph, int i4, boolean z3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z3 = false;
        }
        return multiParagraph.getLineEnd(i4, z3);
    }

    /* renamed from: paint-RPmYEkk$default, reason: not valid java name */
    public static /* synthetic */ void m10968paintRPmYEkk$default(MultiParagraph multiParagraph, Canvas canvas, long j4, Shadow shadow, TextDecoration textDecoration, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j4 = Color.INSTANCE.m9214getUnspecified0d7_KjU();
        }
        multiParagraph.m10973paintRPmYEkk(canvas, j4, (i4 & 4) != 0 ? null : shadow, (i4 & 8) != 0 ? null : textDecoration);
    }

    private final void requireIndexInRange(int offset) {
        boolean z3 = false;
        if (offset >= 0 && offset < getAnnotatedString().getText().length()) {
            z3 = true;
        }
        if (z3) {
            return;
        }
        throw new IllegalArgumentException(("offset(" + offset + ") is out of bounds [0, " + getAnnotatedString().length() + ')').toString());
    }

    private final void requireIndexInRangeInclusiveEnd(int offset) {
        boolean z3 = false;
        if (offset >= 0 && offset <= getAnnotatedString().getText().length()) {
            z3 = true;
        }
        if (z3) {
            return;
        }
        throw new IllegalArgumentException(("offset(" + offset + ") is out of bounds [0, " + getAnnotatedString().length() + ']').toString());
    }

    private final void requireLineIndexInRange(int lineIndex) {
        boolean z3 = false;
        if (lineIndex >= 0 && lineIndex < this.lineCount) {
            z3 = true;
        }
        if (z3) {
            return;
        }
        throw new IllegalArgumentException(("lineIndex(" + lineIndex + ") is out of bounds [0, " + this.lineCount + ')').toString());
    }

    public final ResolvedTextDirection getBidiRunDirection(int offset) {
        requireIndexInRangeInclusiveEnd(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == getAnnotatedString().length() ? CollectionsKt__CollectionsKt.getLastIndex(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
        return paragraphInfo.getParagraph().getBidiRunDirection(paragraphInfo.toLocalIndex(offset));
    }

    public final Rect getBoundingBox(int offset) {
        requireIndexInRange(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
        return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getBoundingBox(paragraphInfo.toLocalIndex(offset)));
    }

    public final Rect getCursorRect(int offset) {
        requireIndexInRangeInclusiveEnd(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == getAnnotatedString().length() ? CollectionsKt__CollectionsKt.getLastIndex(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
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
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == getAnnotatedString().length() ? CollectionsKt__CollectionsKt.getLastIndex(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
        return paragraphInfo.getParagraph().getHorizontalPosition(paragraphInfo.toLocalIndex(offset), usePrimaryDirection);
    }

    public final MultiParagraphIntrinsics getIntrinsics() {
        return this.intrinsics;
    }

    public final float getLastBaseline() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) CollectionsKt___CollectionsKt.last((List) this.paragraphInfoList);
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLastBaseline());
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
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset >= getAnnotatedString().length() ? CollectionsKt__CollectionsKt.getLastIndex(this.paragraphInfoList) : offset < 0 ? 0 : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
        return paragraphInfo.toGlobalLineIndex(paragraphInfo.getParagraph().getLineForOffset(paragraphInfo.toLocalIndex(offset)));
    }

    public final int getLineForVerticalPosition(float vertical) {
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(vertical <= 0.0f ? 0 : vertical >= this.height ? CollectionsKt__CollectionsKt.getLastIndex(this.paragraphInfoList) : MultiParagraphKt.findParagraphByY(this.paragraphInfoList, vertical));
        return paragraphInfo.getLength() == 0 ? Math.max(0, paragraphInfo.getStartIndex() - 1) : paragraphInfo.toGlobalLineIndex(paragraphInfo.getParagraph().getLineForVerticalPosition(paragraphInfo.toLocalYPosition(vertical)));
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
        return this.intrinsics.getMaxIntrinsicWidth();
    }

    /* renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public final int m10970getOffsetForPositionk4lQ0M(long position) {
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(Offset.m8946getYimpl(position) <= 0.0f ? 0 : Offset.m8946getYimpl(position) >= this.height ? CollectionsKt__CollectionsKt.getLastIndex(this.paragraphInfoList) : MultiParagraphKt.findParagraphByY(this.paragraphInfoList, Offset.m8946getYimpl(position)));
        return paragraphInfo.getLength() == 0 ? Math.max(0, paragraphInfo.getStartIndex() - 1) : paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().mo10942getOffsetForPositionk4lQ0M(paragraphInfo.m10976toLocalMKHz9U(position)));
    }

    public final ResolvedTextDirection getParagraphDirection(int offset) {
        requireIndexInRangeInclusiveEnd(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == getAnnotatedString().length() ? CollectionsKt__CollectionsKt.getLastIndex(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
        return paragraphInfo.getParagraph().getParagraphDirection(paragraphInfo.toLocalIndex(offset));
    }

    public final List<ParagraphInfo> getParagraphInfoList$ui_text_release() {
        return this.paragraphInfoList;
    }

    public final Path getPathForRange(int start, int end) {
        if (!((start >= 0 && start <= end) && end <= getAnnotatedString().getText().length())) {
            throw new IllegalArgumentException(("Start(" + start + ") or End(" + end + ") is out of range [0.." + getAnnotatedString().getText().length() + "), or start > end!").toString());
        }
        if (start == end) {
            return AndroidPath_androidKt.Path();
        }
        Path Path = AndroidPath_androidKt.Path();
        int size = this.paragraphInfoList.size();
        for (int iFindParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, start); iFindParagraphByIndex < size; iFindParagraphByIndex++) {
            ParagraphInfo paragraphInfo = this.paragraphInfoList.get(iFindParagraphByIndex);
            if (paragraphInfo.getStartIndex() >= end) {
                break;
            }
            if (paragraphInfo.getStartIndex() != paragraphInfo.getEndIndex()) {
                AbstractC1325h1.m515c(Path, paragraphInfo.toGlobal(paragraphInfo.getParagraph().getPathForRange(paragraphInfo.toLocalIndex(start), paragraphInfo.toLocalIndex(end))), 0L, 2, null);
            }
        }
        return Path;
    }

    public final List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    public final float getWidth() {
        return this.width;
    }

    /* renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public final long m10971getWordBoundaryjx7JFs(int offset) {
        requireIndexInRangeInclusiveEnd(offset);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(offset == getAnnotatedString().length() ? CollectionsKt__CollectionsKt.getLastIndex(this.paragraphInfoList) : MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, offset));
        return paragraphInfo.m10975toGlobalGEjPoXI(paragraphInfo.getParagraph().mo10943getWordBoundaryjx7JFs(paragraphInfo.toLocalIndex(offset)));
    }

    public final boolean isLineEllipsized(int lineIndex) {
        requireLineIndexInRange(lineIndex);
        return this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, lineIndex)).getParagraph().isLineEllipsized(lineIndex);
    }

    @ExperimentalTextApi
    /* renamed from: paint-LG529CI, reason: not valid java name */
    public final void m10972paintLG529CI(Canvas canvas, long color, Shadow shadow, TextDecoration decoration, DrawStyle drawStyle, int blendMode) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.save();
        List<ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            ParagraphInfo paragraphInfo = list.get(i4);
            paragraphInfo.getParagraph().mo10944paintLG529CI(canvas, color, shadow, decoration, drawStyle, blendMode);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
        canvas.restore();
    }

    /* renamed from: paint-RPmYEkk, reason: not valid java name */
    public final void m10973paintRPmYEkk(Canvas canvas, long color, Shadow shadow, TextDecoration decoration) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.save();
        List<ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            ParagraphInfo paragraphInfo = list.get(i4);
            paragraphInfo.getParagraph().mo10945paintRPmYEkk(canvas, color, shadow, decoration);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
        canvas.restore();
    }

    @ExperimentalTextApi
    /* renamed from: paint-hn5TExg, reason: not valid java name */
    public final void m10974painthn5TExg(Canvas canvas, Brush brush, float alpha, Shadow shadow, TextDecoration decoration, DrawStyle drawStyle, int blendMode) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(brush, "brush");
        AndroidMultiParagraphDrawKt.m11288drawMultiParagraph7AXcY_I(this, canvas, brush, alpha, shadow, decoration, drawStyle, blendMode);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j4, int i4, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, j4, i4, z3);
    }

    private MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j4, int i4, boolean z3) {
        boolean z4;
        int iM11492getMaxHeightimpl;
        this.intrinsics = multiParagraphIntrinsics;
        this.maxLines = i4;
        int i5 = 0;
        if (Constraints.m11495getMinWidthimpl(j4) == 0 && Constraints.m11494getMinHeightimpl(j4) == 0) {
            ArrayList arrayList = new ArrayList();
            List<ParagraphIntrinsicInfo> infoList$ui_text_release = multiParagraphIntrinsics.getInfoList$ui_text_release();
            int size = infoList$ui_text_release.size();
            int i6 = 0;
            float f4 = 0.0f;
            int i7 = 0;
            while (i7 < size) {
                ParagraphIntrinsicInfo paragraphIntrinsicInfo = infoList$ui_text_release.get(i7);
                ParagraphIntrinsics intrinsics = paragraphIntrinsicInfo.getIntrinsics();
                int iM11493getMaxWidthimpl = Constraints.m11493getMaxWidthimpl(j4);
                if (Constraints.m11488getHasBoundedHeightimpl(j4)) {
                    iM11492getMaxHeightimpl = RangesKt___RangesKt.coerceAtLeast(Constraints.m11492getMaxHeightimpl(j4) - ParagraphKt.ceilToInt(f4), i5);
                } else {
                    iM11492getMaxHeightimpl = Constraints.m11492getMaxHeightimpl(j4);
                }
                Paragraph paragraphM10979Paragraph_EkL_Y = ParagraphKt.m10979Paragraph_EkL_Y(intrinsics, ConstraintsKt.Constraints$default(0, iM11493getMaxWidthimpl, 0, iM11492getMaxHeightimpl, 5, null), this.maxLines - i6, z3);
                float height = f4 + paragraphM10979Paragraph_EkL_Y.getHeight();
                int lineCount = i6 + paragraphM10979Paragraph_EkL_Y.getLineCount();
                arrayList.add(new ParagraphInfo(paragraphM10979Paragraph_EkL_Y, paragraphIntrinsicInfo.getStartIndex(), paragraphIntrinsicInfo.getEndIndex(), i6, lineCount, f4, height));
                if (paragraphM10979Paragraph_EkL_Y.getDidExceedMaxLines() || (lineCount == this.maxLines && i7 != CollectionsKt__CollectionsKt.getLastIndex(this.intrinsics.getInfoList$ui_text_release()))) {
                    i6 = lineCount;
                    f4 = height;
                    z4 = true;
                    break;
                } else {
                    i7++;
                    i6 = lineCount;
                    f4 = height;
                    i5 = 0;
                }
            }
            z4 = false;
            this.height = f4;
            this.lineCount = i6;
            this.didExceedMaxLines = z4;
            this.paragraphInfoList = arrayList;
            this.width = Constraints.m11493getMaxWidthimpl(j4);
            List<Rect> arrayList2 = new ArrayList<>(arrayList.size());
            int size2 = arrayList.size();
            for (int i8 = 0; i8 < size2; i8++) {
                ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i8);
                List<Rect> placeholderRects = paragraphInfo.getParagraph().getPlaceholderRects();
                ArrayList arrayList3 = new ArrayList(placeholderRects.size());
                int size3 = placeholderRects.size();
                for (int i9 = 0; i9 < size3; i9++) {
                    Rect rect = placeholderRects.get(i9);
                    arrayList3.add(rect != null ? paragraphInfo.toGlobal(rect) : null);
                }
                CollectionsKt__MutableCollectionsKt.addAll(arrayList2, arrayList3);
            }
            if (arrayList2.size() < this.intrinsics.getPlaceholders().size()) {
                int size4 = this.intrinsics.getPlaceholders().size() - arrayList2.size();
                ArrayList arrayList4 = new ArrayList(size4);
                for (int i10 = 0; i10 < size4; i10++) {
                    arrayList4.add(null);
                }
                arrayList2 = CollectionsKt___CollectionsKt.plus((Collection) arrayList2, (Iterable) arrayList4);
            }
            this.placeholderRects = arrayList2;
            return;
        }
        throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j4, int i4, boolean z3, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, j4, (i5 & 4) != 0 ? Integer.MAX_VALUE : i4, (i5 & 8) != 0 ? false : z3, null);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, int i4, boolean z3, float f4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiParagraphIntrinsics, (i5 & 2) != 0 ? Integer.MAX_VALUE : i4, (i5 & 4) != 0 ? false : z3, f4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "MultiParagraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @ReplaceWith(expression = "MultiParagraph(intrinsics, Constraints(maxWidth = ceil(width).toInt()), maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public MultiParagraph(MultiParagraphIntrinsics intrinsics, int i4, boolean z3, float f4) {
        this(intrinsics, ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f4), 0, 0, 13, null), i4, z3, null);
        Intrinsics.checkNotNullParameter(intrinsics, "intrinsics");
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, List list, int i4, boolean z3, float f4, Density density, Font.ResourceLoader resourceLoader, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, (List<AnnotatedString.Range<Placeholder>>) ((i5 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list), (i5 & 8) != 0 ? Integer.MAX_VALUE : i4, (i5 & 16) != 0 ? false : z3, f4, density, resourceLoader);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "Font.ResourceLoader is deprecated, use fontFamilyResolver instead", replaceWith = @ReplaceWith(expression = "MultiParagraph(annotatedString, style, placeholders, maxLines, ellipsis, width, density, fontFamilyResolver)", imports = {}))
    public MultiParagraph(AnnotatedString annotatedString, TextStyle style, List<AnnotatedString.Range<Placeholder>> placeholders, int i4, boolean z3, float f4, Density density, Font.ResourceLoader resourceLoader) {
        this(new MultiParagraphIntrinsics(annotatedString, style, placeholders, density, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader)), ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f4), 0, 0, 13, null), i4, z3, null);
        Intrinsics.checkNotNullParameter(annotatedString, "annotatedString");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(resourceLoader, "resourceLoader");
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, float f4, Density density, FontFamily.Resolver resolver, List list, int i4, boolean z3, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, f4, density, resolver, (List<AnnotatedString.Range<Placeholder>>) ((i5 & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list), (i5 & 64) != 0 ? Integer.MAX_VALUE : i4, (i5 & 128) != 0 ? false : z3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "MultiParagraph that takes maximum allowed width is deprecated, pass constraints instead.", replaceWith = @ReplaceWith(expression = "MultiParagraph(annotatedString, style, Constraints(maxWidth = ceil(width).toInt()), density, fontFamilyResolver, placeholders, maxLines, ellipsis)", imports = {"kotlin.math.ceil", "androidx.compose.ui.unit.Constraints"}))
    public MultiParagraph(AnnotatedString annotatedString, TextStyle style, float f4, Density density, FontFamily.Resolver fontFamilyResolver, List<AnnotatedString.Range<Placeholder>> placeholders, int i4, boolean z3) {
        this(new MultiParagraphIntrinsics(annotatedString, style, placeholders, density, fontFamilyResolver), ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f4), 0, 0, 13, null), i4, z3, null);
        Intrinsics.checkNotNullParameter(annotatedString, "annotatedString");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j4, Density density, FontFamily.Resolver resolver, List list, int i4, boolean z3, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, j4, density, resolver, (i5 & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i5 & 64) != 0 ? Integer.MAX_VALUE : i4, (i5 & 128) != 0 ? false : z3, null);
    }

    private MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j4, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, int i4, boolean z3) {
        this(new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, resolver), j4, i4, z3, null);
    }
}
