package androidx.compose.p014ui.text;

import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.p014ui.text.style.TextOverflow;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.ConstraintsKt;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import p265nd.AbstractC10410o;
import p325rc.AbstractC10978w;

@Immutable
/* loaded from: classes2.dex */
public final class TextMeasurer {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int cacheSize;
    private final Density defaultDensity;
    private final FontFamily.Resolver defaultFontFamilyResolver;
    private final LayoutDirection defaultLayoutDirection;
    private final TextLayoutCache textLayoutCache;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final TextLayoutResult layout(TextLayoutInput textLayoutInput) {
            MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(textLayoutInput.getText(), TextStyleKt.resolveDefaults(textLayoutInput.getStyle(), textLayoutInput.getLayoutDirection()), textLayoutInput.getPlaceholders(), textLayoutInput.getDensity(), textLayoutInput.getFontFamilyResolver());
            int iM33456getMinWidthimpl = Constraints.m33456getMinWidthimpl(textLayoutInput.m32932getConstraintsmsEJaDk());
            int iM33454getMaxWidthimpl = ((textLayoutInput.getSoftWrap() || TextMeasurerKt.m32944isEllipsisMW5ApA(textLayoutInput.m32933getOverflowgIe3tQ8())) && Constraints.m33450getHasBoundedWidthimpl(textLayoutInput.m32932getConstraintsmsEJaDk())) ? Constraints.m33454getMaxWidthimpl(textLayoutInput.m32932getConstraintsmsEJaDk()) : Integer.MAX_VALUE;
            int maxLines = (textLayoutInput.getSoftWrap() || !TextMeasurerKt.m32944isEllipsisMW5ApA(textLayoutInput.m32933getOverflowgIe3tQ8())) ? textLayoutInput.getMaxLines() : 1;
            if (iM33456getMinWidthimpl != iM33454getMaxWidthimpl) {
                iM33454getMaxWidthimpl = AbstractC10410o.m21761n(ParagraphKt.ceilToInt(multiParagraphIntrinsics.getMaxIntrinsicWidth()), iM33456getMinWidthimpl, iM33454getMaxWidthimpl);
            }
            return new TextLayoutResult(textLayoutInput, new MultiParagraph(multiParagraphIntrinsics, Constraints.Companion.m33463fitPrioritizingWidthZbe2FdA(0, iM33454getMaxWidthimpl, 0, Constraints.m33453getMaxHeightimpl(textLayoutInput.m32932getConstraintsmsEJaDk())), maxLines, textLayoutInput.m32933getOverflowgIe3tQ8(), (AbstractC9972n) null), ConstraintsKt.m33468constrain4WqzIAM(textLayoutInput.m32932getConstraintsmsEJaDk(), IntSize.m33667constructorimpl((((int) Math.ceil(r5.getWidth())) << 32) | (((int) Math.ceil(r5.getHeight())) & 4294967295L))), null);
        }

        private Companion() {
        }
    }

    public TextMeasurer(FontFamily.Resolver resolver, Density density, LayoutDirection layoutDirection, int i10) {
        this.defaultFontFamilyResolver = resolver;
        this.defaultDensity = density;
        this.defaultLayoutDirection = layoutDirection;
        this.cacheSize = i10;
        this.textLayoutCache = i10 > 0 ? new TextLayoutCache(i10) : null;
    }

    /* renamed from: measure-wNUYSr0$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m32939measurewNUYSr0$default(TextMeasurer textMeasurer, String str, TextStyle textStyle, int i10, boolean z10, int i11, long j10, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            textStyle = TextStyle.Companion.getDefault();
        }
        TextStyle textStyle2 = textStyle;
        if ((i12 & 4) != 0) {
            i10 = TextOverflow.Companion.m33436getClipgIe3tQ8();
        }
        return textMeasurer.m32941measurewNUYSr0(str, textStyle2, i10, (i12 & 8) != 0 ? true : z10, (i12 & 16) != 0 ? Integer.MAX_VALUE : i11, (i12 & 32) != 0 ? ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null) : j10, (i12 & 64) != 0 ? textMeasurer.defaultLayoutDirection : layoutDirection, (i12 & 128) != 0 ? textMeasurer.defaultDensity : density, (i12 & 256) != 0 ? textMeasurer.defaultFontFamilyResolver : resolver, (i12 & 512) != 0 ? false : z11);
    }

    /* renamed from: measure-xDpz5zY$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m32940measurexDpz5zY$default(TextMeasurer textMeasurer, AnnotatedString annotatedString, TextStyle textStyle, int i10, boolean z10, int i11, List list, long j10, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            textStyle = TextStyle.Companion.getDefault();
        }
        return textMeasurer.m32942measurexDpz5zY(annotatedString, textStyle, (i12 & 4) != 0 ? TextOverflow.Companion.m33436getClipgIe3tQ8() : i10, (i12 & 8) != 0 ? true : z10, (i12 & 16) != 0 ? Integer.MAX_VALUE : i11, (i12 & 32) != 0 ? AbstractC10978w.m24136n() : list, (i12 & 64) != 0 ? ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null) : j10, (i12 & 128) != 0 ? textMeasurer.defaultLayoutDirection : layoutDirection, (i12 & 256) != 0 ? textMeasurer.defaultDensity : density, (i12 & 512) != 0 ? textMeasurer.defaultFontFamilyResolver : resolver, (i12 & 1024) != 0 ? false : z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Stable
    /* renamed from: measure-wNUYSr0, reason: not valid java name */
    public final TextLayoutResult m32941measurewNUYSr0(String str, TextStyle textStyle, int i10, boolean z10, int i11, long j10, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, boolean z11) {
        return m32940measurexDpz5zY$default(this, new AnnotatedString(str, null, 2, 0 == true ? 1 : 0), textStyle, i10, z10, i11, null, j10, layoutDirection, density, resolver, z11, 32, null);
    }

    @Stable
    /* renamed from: measure-xDpz5zY, reason: not valid java name */
    public final TextLayoutResult m32942measurexDpz5zY(AnnotatedString annotatedString, TextStyle textStyle, int i10, boolean z10, int i11, List<AnnotatedString.Range<Placeholder>> list, long j10, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, boolean z11) {
        TextLayoutCache textLayoutCache;
        TextLayoutInput textLayoutInput = new TextLayoutInput(annotatedString, textStyle, list, i11, z10, i10, density, layoutDirection, resolver, j10, (AbstractC9972n) null);
        TextLayoutResult textLayoutResult = (z11 || (textLayoutCache = this.textLayoutCache) == null) ? null : textLayoutCache.get(textLayoutInput);
        if (textLayoutResult != null) {
            return textLayoutResult.m32935copyO0kMr_c(textLayoutInput, ConstraintsKt.m33468constrain4WqzIAM(j10, IntSize.m33667constructorimpl((ParagraphKt.ceilToInt(textLayoutResult.getMultiParagraph().getWidth()) << 32) | (ParagraphKt.ceilToInt(textLayoutResult.getMultiParagraph().getHeight()) & 4294967295L))));
        }
        TextLayoutResult textLayoutResultLayout = Companion.layout(textLayoutInput);
        TextLayoutCache textLayoutCache2 = this.textLayoutCache;
        if (textLayoutCache2 != null) {
            textLayoutCache2.put(textLayoutInput, textLayoutResultLayout);
        }
        return textLayoutResultLayout;
    }

    public /* synthetic */ TextMeasurer(FontFamily.Resolver resolver, Density density, LayoutDirection layoutDirection, int i10, int i11, AbstractC9972n abstractC9972n) {
        this(resolver, density, layoutDirection, (i11 & 8) != 0 ? 8 : i10);
    }
}
