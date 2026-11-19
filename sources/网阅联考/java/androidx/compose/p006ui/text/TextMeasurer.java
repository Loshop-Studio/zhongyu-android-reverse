package androidx.compose.p006ui.text;

import androidx.compose.p006ui.text.AnnotatedString;
import androidx.compose.p006ui.text.font.FontFamily;
import androidx.compose.p006ui.text.style.TextOverflow;
import androidx.compose.p006ui.unit.Constraints;
import androidx.compose.p006ui.unit.ConstraintsKt;
import androidx.compose.p006ui.unit.Density;
import androidx.compose.p006ui.unit.IntSizeKt;
import androidx.compose.p006ui.unit.LayoutDirection;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;

@Immutable
@ExperimentalTextApi
@Metadata(m5174d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u008d\u0001\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\t2\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#Jw\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020$2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b%\u0010&R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006("}, m5175d2 = {"Landroidx/compose/ui/text/TextMeasurer;", "", "fallbackFontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fallbackDensity", "Landroidx/compose/ui/unit/Density;", "fallbackLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "cacheSize", "", "(Landroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;I)V", "textLayoutCache", "Landroidx/compose/ui/text/TextLayoutCache;", "measure", "Landroidx/compose/ui/text/TextLayoutResult;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "layoutDirection", "density", "fontFamilyResolver", "skipCache", "measure-xDpz5zY", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;IZILjava/util/List;JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Z)Landroidx/compose/ui/text/TextLayoutResult;", "", "measure-wNUYSr0", "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;IZIJLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Z)Landroidx/compose/ui/text/TextLayoutResult;", "Companion", "ui-text_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TextMeasurer {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int cacheSize;
    private final Density fallbackDensity;
    private final FontFamily.Resolver fallbackFontFamilyResolver;
    private final LayoutDirection fallbackLayoutDirection;
    private final TextLayoutCache textLayoutCache;

    @Metadata(m5174d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u0007"}, m5175d2 = {"Landroidx/compose/ui/text/TextMeasurer$Companion;", "", "()V", "layout", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutInput", "Landroidx/compose/ui/text/TextLayoutInput;", "ui-text_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final TextLayoutResult layout(TextLayoutInput textLayoutInput) {
            MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(textLayoutInput.getText(), TextStyleKt.resolveDefaults(textLayoutInput.getStyle(), textLayoutInput.getLayoutDirection()), textLayoutInput.getPlaceholders(), textLayoutInput.getDensity(), textLayoutInput.getFontFamilyResolver());
            int iM11495getMinWidthimpl = Constraints.m11495getMinWidthimpl(textLayoutInput.getConstraints());
            boolean z3 = false;
            int iM11493getMaxWidthimpl = ((textLayoutInput.getSoftWrap() || TextOverflow.m11471equalsimpl0(textLayoutInput.getOverflow(), TextOverflow.INSTANCE.m11479getEllipsisgIe3tQ8())) && Constraints.m11489getHasBoundedWidthimpl(textLayoutInput.getConstraints())) ? Constraints.m11493getMaxWidthimpl(textLayoutInput.getConstraints()) : Integer.MAX_VALUE;
            if (!textLayoutInput.getSoftWrap() && TextOverflow.m11471equalsimpl0(textLayoutInput.getOverflow(), TextOverflow.INSTANCE.m11479getEllipsisgIe3tQ8())) {
                z3 = true;
            }
            int maxLines = z3 ? 1 : textLayoutInput.getMaxLines();
            if (iM11495getMinWidthimpl != iM11493getMaxWidthimpl) {
                iM11493getMaxWidthimpl = RangesKt___RangesKt.coerceIn(ParagraphKt.ceilToInt(multiParagraphIntrinsics.getMaxIntrinsicWidth()), iM11495getMinWidthimpl, iM11493getMaxWidthimpl);
            }
            return new TextLayoutResult(textLayoutInput, new MultiParagraph(multiParagraphIntrinsics, ConstraintsKt.Constraints$default(0, iM11493getMaxWidthimpl, 0, Constraints.m11492getMaxHeightimpl(textLayoutInput.getConstraints()), 5, null), maxLines, TextOverflow.m11471equalsimpl0(textLayoutInput.getOverflow(), TextOverflow.INSTANCE.m11479getEllipsisgIe3tQ8()), null), ConstraintsKt.m11504constrain4WqzIAM(textLayoutInput.getConstraints(), IntSizeKt.IntSize((int) Math.ceil(r2.getWidth()), (int) Math.ceil(r2.getHeight()))), null);
        }
    }

    public TextMeasurer(FontFamily.Resolver fallbackFontFamilyResolver, Density fallbackDensity, LayoutDirection fallbackLayoutDirection, int i4) {
        Intrinsics.checkNotNullParameter(fallbackFontFamilyResolver, "fallbackFontFamilyResolver");
        Intrinsics.checkNotNullParameter(fallbackDensity, "fallbackDensity");
        Intrinsics.checkNotNullParameter(fallbackLayoutDirection, "fallbackLayoutDirection");
        this.fallbackFontFamilyResolver = fallbackFontFamilyResolver;
        this.fallbackDensity = fallbackDensity;
        this.fallbackLayoutDirection = fallbackLayoutDirection;
        this.cacheSize = i4;
        this.textLayoutCache = i4 > 0 ? new TextLayoutCache(i4) : null;
    }

    /* renamed from: measure-xDpz5zY$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m11053measurexDpz5zY$default(TextMeasurer textMeasurer, AnnotatedString annotatedString, TextStyle textStyle, int i4, boolean z3, int i5, List list, long j4, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, boolean z4, int i6, Object obj) {
        return textMeasurer.m11055measurexDpz5zY(annotatedString, (i6 & 2) != 0 ? TextStyle.INSTANCE.getDefault() : textStyle, (i6 & 4) != 0 ? TextOverflow.INSTANCE.m11478getClipgIe3tQ8() : i4, (i6 & 8) != 0 ? true : z3, (i6 & 16) != 0 ? Integer.MAX_VALUE : i5, (i6 & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i6 & 64) != 0 ? ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null) : j4, (i6 & 128) != 0 ? textMeasurer.fallbackLayoutDirection : layoutDirection, (i6 & 256) != 0 ? textMeasurer.fallbackDensity : density, (i6 & 512) != 0 ? textMeasurer.fallbackFontFamilyResolver : resolver, (i6 & 1024) != 0 ? false : z4);
    }

    @Stable
    /* renamed from: measure-wNUYSr0, reason: not valid java name */
    public final TextLayoutResult m11054measurewNUYSr0(String text, TextStyle style, int overflow, boolean softWrap, int maxLines, long constraints, LayoutDirection layoutDirection, Density density, FontFamily.Resolver fontFamilyResolver, boolean skipCache) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        return m11053measurexDpz5zY$default(this, new AnnotatedString(text, null, null, 6, null), style, overflow, softWrap, maxLines, null, constraints, layoutDirection, density, fontFamilyResolver, skipCache, 32, null);
    }

    @Stable
    /* renamed from: measure-xDpz5zY, reason: not valid java name */
    public final TextLayoutResult m11055measurexDpz5zY(AnnotatedString text, TextStyle style, int overflow, boolean softWrap, int maxLines, List<AnnotatedString.Range<Placeholder>> placeholders, long constraints, LayoutDirection layoutDirection, Density density, FontFamily.Resolver fontFamilyResolver, boolean skipCache) {
        TextLayoutCache textLayoutCache;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(fontFamilyResolver, "fontFamilyResolver");
        TextLayoutInput textLayoutInput = new TextLayoutInput(text, style, placeholders, maxLines, softWrap, overflow, density, layoutDirection, fontFamilyResolver, constraints, (DefaultConstructorMarker) null);
        TextLayoutResult textLayoutResult = (skipCache || (textLayoutCache = this.textLayoutCache) == null) ? null : textLayoutCache.get(textLayoutInput);
        if (textLayoutResult != null) {
            return textLayoutResult.m11048copyO0kMr_c(textLayoutInput, ConstraintsKt.m11504constrain4WqzIAM(constraints, IntSizeKt.IntSize(ParagraphKt.ceilToInt(textLayoutResult.getMultiParagraph().getWidth()), ParagraphKt.ceilToInt(textLayoutResult.getMultiParagraph().getHeight()))));
        }
        TextLayoutResult textLayoutResultLayout = INSTANCE.layout(textLayoutInput);
        TextLayoutCache textLayoutCache2 = this.textLayoutCache;
        if (textLayoutCache2 != null) {
            textLayoutCache2.put(textLayoutInput, textLayoutResultLayout);
        }
        return textLayoutResultLayout;
    }

    public /* synthetic */ TextMeasurer(FontFamily.Resolver resolver, Density density, LayoutDirection layoutDirection, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(resolver, density, layoutDirection, (i5 & 8) != 0 ? TextMeasurerKt.DefaultCacheSize : i4);
    }
}
