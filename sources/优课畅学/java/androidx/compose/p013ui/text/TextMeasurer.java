package androidx.compose.p013ui.text;

import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.style.TextOverflow;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.ConstraintsKt;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.IntSize;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import p077d8.AbstractC8323h;
import p134i7.AbstractC8809v;

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
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final TextLayoutResult layout(TextLayoutInput textLayoutInput) {
            MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(textLayoutInput.getText(), TextStyleKt.resolveDefaults(textLayoutInput.getStyle(), textLayoutInput.getLayoutDirection()), textLayoutInput.getPlaceholders(), textLayoutInput.getDensity(), textLayoutInput.getFontFamilyResolver());
            int iM26854getMinWidthimpl = Constraints.m26854getMinWidthimpl(textLayoutInput.m26330getConstraintsmsEJaDk());
            int iM26852getMaxWidthimpl = ((textLayoutInput.getSoftWrap() || TextMeasurerKt.m26342isEllipsisMW5ApA(textLayoutInput.m26331getOverflowgIe3tQ8())) && Constraints.m26848getHasBoundedWidthimpl(textLayoutInput.m26330getConstraintsmsEJaDk())) ? Constraints.m26852getMaxWidthimpl(textLayoutInput.m26330getConstraintsmsEJaDk()) : Integer.MAX_VALUE;
            int maxLines = (textLayoutInput.getSoftWrap() || !TextMeasurerKt.m26342isEllipsisMW5ApA(textLayoutInput.m26331getOverflowgIe3tQ8())) ? textLayoutInput.getMaxLines() : 1;
            if (iM26854getMinWidthimpl != iM26852getMaxWidthimpl) {
                iM26852getMaxWidthimpl = AbstractC8323h.m13518m(ParagraphKt.ceilToInt(multiParagraphIntrinsics.getMaxIntrinsicWidth()), iM26854getMinWidthimpl, iM26852getMaxWidthimpl);
            }
            return new TextLayoutResult(textLayoutInput, new MultiParagraph(multiParagraphIntrinsics, Constraints.Companion.m26861fitPrioritizingWidthZbe2FdA(0, iM26852getMaxWidthimpl, 0, Constraints.m26851getMaxHeightimpl(textLayoutInput.m26330getConstraintsmsEJaDk())), maxLines, textLayoutInput.m26331getOverflowgIe3tQ8(), (AbstractC9126n) null), ConstraintsKt.m26866constrain4WqzIAM(textLayoutInput.m26330getConstraintsmsEJaDk(), IntSize.m27065constructorimpl((((int) Math.ceil(r5.getWidth())) << 32) | (((int) Math.ceil(r5.getHeight())) & 4294967295L))), null);
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
    public static /* synthetic */ TextLayoutResult m26337measurewNUYSr0$default(TextMeasurer textMeasurer, String str, TextStyle textStyle, int i10, boolean z10, int i11, long j10, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            textStyle = TextStyle.Companion.getDefault();
        }
        TextStyle textStyle2 = textStyle;
        if ((i12 & 4) != 0) {
            i10 = TextOverflow.Companion.m26834getClipgIe3tQ8();
        }
        return textMeasurer.m26339measurewNUYSr0(str, textStyle2, i10, (i12 & 8) != 0 ? true : z10, (i12 & 16) != 0 ? Integer.MAX_VALUE : i11, (i12 & 32) != 0 ? ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null) : j10, (i12 & 64) != 0 ? textMeasurer.defaultLayoutDirection : layoutDirection, (i12 & 128) != 0 ? textMeasurer.defaultDensity : density, (i12 & 256) != 0 ? textMeasurer.defaultFontFamilyResolver : resolver, (i12 & 512) != 0 ? false : z11);
    }

    /* renamed from: measure-xDpz5zY$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m26338measurexDpz5zY$default(TextMeasurer textMeasurer, AnnotatedString annotatedString, TextStyle textStyle, int i10, boolean z10, int i11, List list, long j10, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            textStyle = TextStyle.Companion.getDefault();
        }
        return textMeasurer.m26340measurexDpz5zY(annotatedString, textStyle, (i12 & 4) != 0 ? TextOverflow.Companion.m26834getClipgIe3tQ8() : i10, (i12 & 8) != 0 ? true : z10, (i12 & 16) != 0 ? Integer.MAX_VALUE : i11, (i12 & 32) != 0 ? AbstractC8809v.m14771n() : list, (i12 & 64) != 0 ? ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null) : j10, (i12 & 128) != 0 ? textMeasurer.defaultLayoutDirection : layoutDirection, (i12 & 256) != 0 ? textMeasurer.defaultDensity : density, (i12 & 512) != 0 ? textMeasurer.defaultFontFamilyResolver : resolver, (i12 & 1024) != 0 ? false : z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Stable
    /* renamed from: measure-wNUYSr0, reason: not valid java name */
    public final TextLayoutResult m26339measurewNUYSr0(String str, TextStyle textStyle, int i10, boolean z10, int i11, long j10, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, boolean z11) {
        return m26338measurexDpz5zY$default(this, new AnnotatedString(str, null, 2, 0 == true ? 1 : 0), textStyle, i10, z10, i11, null, j10, layoutDirection, density, resolver, z11, 32, null);
    }

    @Stable
    /* renamed from: measure-xDpz5zY, reason: not valid java name */
    public final TextLayoutResult m26340measurexDpz5zY(AnnotatedString annotatedString, TextStyle textStyle, int i10, boolean z10, int i11, List<AnnotatedString.Range<Placeholder>> list, long j10, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, boolean z11) {
        TextLayoutCache textLayoutCache;
        TextLayoutInput textLayoutInput = new TextLayoutInput(annotatedString, textStyle, list, i11, z10, i10, density, layoutDirection, resolver, j10, (AbstractC9126n) null);
        TextLayoutResult textLayoutResult = (z11 || (textLayoutCache = this.textLayoutCache) == null) ? null : textLayoutCache.get(textLayoutInput);
        if (textLayoutResult != null) {
            return textLayoutResult.m26333copyO0kMr_c(textLayoutInput, ConstraintsKt.m26866constrain4WqzIAM(j10, IntSize.m27065constructorimpl((ParagraphKt.ceilToInt(textLayoutResult.getMultiParagraph().getWidth()) << 32) | (ParagraphKt.ceilToInt(textLayoutResult.getMultiParagraph().getHeight()) & 4294967295L))));
        }
        TextLayoutResult textLayoutResultLayout = Companion.layout(textLayoutInput);
        TextLayoutCache textLayoutCache2 = this.textLayoutCache;
        if (textLayoutCache2 != null) {
            textLayoutCache2.put(textLayoutInput, textLayoutResultLayout);
        }
        return textLayoutResultLayout;
    }

    public /* synthetic */ TextMeasurer(FontFamily.Resolver resolver, Density density, LayoutDirection layoutDirection, int i10, int i11, AbstractC9126n abstractC9126n) {
        this(resolver, density, layoutDirection, (i11 & 8) != 0 ? 8 : i10);
    }
}
